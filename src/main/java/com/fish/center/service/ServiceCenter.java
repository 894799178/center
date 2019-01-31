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
     *  数据处理,将数据处理成所需要的json数据
     * @param token 令牌,用于获取对应缓存中的数据
     * @param flag 标记,通常用于标记事件
     * @param clazz 通过某类型数据转成json数据
     * @param <T>
     * @return
     */
    <T> String dataDisposeForJson(String token,String flag,Class<T> clazz);

}
