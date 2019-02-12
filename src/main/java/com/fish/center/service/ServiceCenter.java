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
     * 获取自动化点击消息
     * @param token
     * @return
     */
    String getAutoClickMessage(String token);

    /**
     * 获取伤害测试的信息
     * @param token
     * @return
     */
    String getDamageMessage(String token);

}
