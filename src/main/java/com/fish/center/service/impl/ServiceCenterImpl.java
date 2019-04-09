package com.fish.center.service.impl;

import com.alibaba.fastjson.JSON;
import com.fish.center.bean.AutoClickBean;
import com.fish.center.bean.BaseBusinessDataBean;
import com.fish.center.bean.DamageBean;
import com.fish.center.bean.UserData;
import com.fish.center.service.ServiceCenter;
import com.fish.center.utils.DebugPrintUtil;
import com.fish.center.utils.EnumUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

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
    Map<String,Queue<String>> autoClickBeans;

    @Resource
    Map<String, Queue<String>> damageTestBeans;


    @Override
    public void dataDisposeSorting(String token) {
        UserData userDataByToken = this.getUserDataByToken(token);
        Queue<String> data =  userDataByToken.getData();
        while(!data.isEmpty()){
            String s = data.poll();
            this.dataSorting(s,token);
        }
       // DebugPrintUtil.printNotNull(autoClickBeans.get(token));
    }

    @Override
    public String getAutoClickMessage(String token) {
        Queue<String> strings = autoClickBeans.get(token);
        return this.list2String(strings,AutoClickBean.class);
    }

    @Override
    public String getDamageMessage(String token) {
        Queue<String>strings = damageTestBeans.get(token);
        return this.list2String(strings,DamageBean.class);
    }


    /**
     * 将list<String>转换成String数据
     * @param list 数据集合
     * @param clazz 转换过程中所需要的class
     * @param <T>
     * @return
     */
    private  <T> String list2String(Queue<String> list,Class<T> clazz){
        String result = null;
        if(list != null){
            result  = this.jsonList2String(list,clazz);
            list.clear();
        }
        return  result;
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
            case 2:
                this.addDataByMap(token,substring, damageTestBeans);
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
    private void addDataByMap(String token,String substring, Map<String,Queue<String>> map){
        Queue<String> temp = map.get(token);
            if(temp == null){
                temp =  new ConcurrentLinkedQueue<>();
                map.put(token,temp);
            }
        temp.add(substring);

    }

    /**
     * 将list<String>数据转换成JsonString
     * @param list
     * @param clazz
     * @param <T>
     * @return
     */
    private <T> String jsonList2String(Queue<String>list,Class<T> clazz){
        List<T> tempList = new ArrayList<>();
        if(list!= null && list.size()>0){
            for (String item:list) {
                tempList.add(JSON.parseObject(item, clazz));
            }
        }
        return JSON.toJSONString(tempList);
    }




}
