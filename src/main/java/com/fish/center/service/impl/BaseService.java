package com.fish.center.service.impl;

import com.fish.center.bean.AutoClickBean;
import com.fish.center.bean.UserData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: center
 * @Package: com.fish.center.service.impl
 * @ClassName: BaseSservice
 * @Author: 一条小咸鱼
 * @Description: 基础服务类,主要用于存放 全局的数据缓存.
 * @Date: 2019/1/31 18:27
 * @Version: 1.0
 */
@Service
public class BaseService {

    @Resource
    Map<String,UserData> globalMap;


    /**
     * 根据Token返回一个UserData
     * @param token
     * @return
     */
    public UserData getUserDataByToken(String token){
        return globalMap.get(token);
    }

//    public <T> Map<String,List<T>>  fillData(Map<String,List<T>> map, String token, Class<T> clazz){
//        if(!map.containsKey(token)){
//            //如果不在map中,则说明是新会话,则创建新的对象
//            LinkedList<T> ts = new LinkedList<>();
//            map.put(token,ts);
//        }else{
//
//        }
//    }







}
