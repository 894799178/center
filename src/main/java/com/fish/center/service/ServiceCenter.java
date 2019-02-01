package com.fish.center.service;

/**
 * @ProjectName: center
 * @Package: com.fish.center.service
 * @ClassName: ServiceCenter
 * @Author: 一条小咸鱼
 * @Description: ${description}
 * @Date: 2019/1/31 18:15
 * @Version: 1.0
 */
public interface ServiceCenter {
    /**
     *  处理数据分拣数据,将数据过滤赛选到属于对应业务模型List中
     * @param token
     */
   void dataDisposeSorting(String token);

    /**
     * 获取消息
     * @param token
     * @param flag
     * @param clazz
     * @param <T>
     * @return
     */
    <T> String getAutoClickMessage(String token,String flag,Class<T> clazz);

}
