package com.fish.center.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.fish.center.Enums.EnumBusinessName;
import com.fish.center.bean.AutoClickBean;
import com.fish.center.bean.BaseBusinessDataBean;
import com.fish.center.bean.UserData;
import com.fish.center.service.ServiceCenter;
import com.fish.center.utils.DebugPrintUtil;
import com.fish.center.utils.EnumUtil;
import com.fish.center.utils.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static com.fish.center.Enums.EnumBusinessName.AUTO_CLICK_EVENT;

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
    Map<String, List<String>> autoClickBeans;

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
        int index = str.indexOf("\"");
        String  substring = str.substring(index+1,str.length()-1).replace("\\","");

        BaseBusinessDataBean baseBusinessDataBean = JSON.parseObject(substring, BaseBusinessDataBean.class);
        int valueByName = EnumUtil.getValueByName(baseBusinessDataBean.getBusinessName());
        switch (valueByName){
            case 1:
                this.addDataByMap(token,substring,autoClickBeans);
                break;
            default:
                break;

        }
    }

    /**
     * 添加字符串数据到对应的map容器中
     * @param token
     * @param substring
     * @param map
     */
    private void addDataByMap(String token,String substring, Map<String, List<String>> map){
        List<String> temp = map.get(token);
            if(temp == null){
                temp =  new LinkedList<>();
                map.put(token,temp);
            }
        temp.add(substring);

    }





}
