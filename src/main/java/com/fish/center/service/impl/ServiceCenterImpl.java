package com.fish.center.service.impl;

import com.fish.center.bean.UserData;
import com.fish.center.service.ServiceCenter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Override
    public <T> String dataDisposeForJson(String token, String flag, Class<T> clazz) {
        return null;
    }



}
