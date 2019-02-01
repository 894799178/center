package com.fish.center.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.fish.center.bean.AutoClickBean;
import com.fish.center.bean.UserData;
import com.fish.center.service.ServiceCenter;
import com.fish.center.utils.DebugPrintUtil;
import com.fish.center.utils.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: center
 * @Package: com.fish.center.service.impl
 * @ClassName: ServiceCenterImpl
 * @Author: 一条小咸鱼
 * @Description: ${description}
 * @Date: 2019/1/31 18:16
 * @Version: 1.0
 */
@Service
public class ServiceCenterImpl extends BaseService implements ServiceCenter {

    @Resource
    Map<String, List<AutoClickBean>> autoClickBeans;

    @Override
    public void dataDisposeSorting(String token) {
        UserData userDataByToken = this.getUserDataByToken(token);
        LinkedList<String> data = (LinkedList<String>) userDataByToken.getData();
        while(!data.isEmpty()){
            String s = data.pollFirst();
            this.dataSorting(s,token);
        }
        DebugPrintUtil.printNotNull(autoClickBeans.get(token));
    }

    @Override
    public <T> String getAutoClickMessage(String token, String flag, Class<T> clazz) {
        return null;
    }




    /**
     * 数据分拣,对str数据分类,并将所需要的json数据转成对应的对象
     * @param str
     * @param token
     */
    private void dataSorting(String str,String token){
        if(StringUtil.isExist(str,"AutoClickBean")>0){
            int index = str.indexOf("\"");
            String  substring = str.substring(index+1,str.length()-1).replace("\\","");
            List<AutoClickBean> autoClickBeans = this.autoClickBeans.get(token);
            if(autoClickBeans == null){
                autoClickBeans =  new LinkedList<>();
            }
            autoClickBeans.add(JSON.parseObject(substring,AutoClickBean.class));
            this.autoClickBeans.put(token,autoClickBeans);
            return;
        }
    }





}
