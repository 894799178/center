package com.fish.center.service.impl;

import com.fish.center.bean.UserData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
}
