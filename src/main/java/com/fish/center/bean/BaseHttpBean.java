package com.fish.center.bean;

/**
 * @ProjectName: center
 * @Package: com.fish.center.bean
 * @ClassName: BaseBean
 * @Author: 一条小咸鱼
 * @Description: 基类Bean,用于存储同一个浏览器的请求数据
 * @Date: 2019/1/31 15:27
 * @Version: 1.0
 */
public class BaseHttpBean {
    /**
     * 令牌
     */
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
