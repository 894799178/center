package com.fish.center.service.impl;

import com.fish.center.utils.DebugPrintUtil;
import com.fish.center.bean.HttpRequestBean;
import com.fish.center.bean.UserData;
import com.fish.center.service.DataProcess;
import com.fish.center.service.ServiceCenter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * @ProjectName: center
 * @Package: com.fish.center.service.impl
 * @ClassName: DataProcessImpl
 * @Author: 一条小咸鱼
 * @Description: ${description}
 * @Date: 2019/1/31 15:29
 * @Version: 1.0
 */
@Service
public class DataProcessImpl extends BaseService implements DataProcess {

    @Resource
    ServiceCenter serviceCenter;


    @Override
    public void storeData(HttpRequestBean httpRequestBean) {
       String token =  httpRequestBean.getToken();
        List<String> list = httpRequestBean.getList();
        if(!globalMap.containsKey(token)){
            //如果不在map中,则说明是新会话,则创建新的对象
            UserData userData = new UserData();
            userData.setToken(token);
            //list 转 String数组
            this.addDataByStringList(userData,list);
            globalMap.put(token,userData);
        }else{
            //如果存在
            UserData userData = globalMap.get(token);
            this.addDataByStringList(userData,list);
        }
        DebugPrintUtil.printNotNull(list);
        serviceCenter.dataDisposeSorting(token);
    }

    /**
     * 将list中的数据添加到当前的UserData的String[]中
     * @param userData
     * @param list 所需要添加的数据
     * @return
     */
    private UserData addDataByStringList(UserData userData,List<String> list){
        LinkedList data = (LinkedList) userData.getData();
        int cursor = userData.getCursor();
        for (String item:list) {
            data.add(item);
        }
        userData.setCursor(cursor);
        return userData;
    }

//    /**
//     * 用于校验是否已经遍历了一遍数组
//     * @param userData
//     * @return
//     */
//    private UserData checkFinish(UserData userData,int cursor){
//        if((cursor %  userData.getData().length) == 0){
//            int turns = userData.getTurns();
//            userData.setTurns(turns+1);
//        }
//        return userData;
//    }



}
