package com.fish.center.service;

import com.fish.center.bean.HttpRequestBean;

/**
 * @ProjectName: center
 * @Package: com.fish.center.service
 * @ClassName: DataProcess
 * @Author: 一条小咸鱼
 * @Description: 数据处理层
 * @Date: 2019/1/30 19:27
 * @Version: 1.0
 */

public interface DataProcess {

    /**
     * 存储数据,通过token进行存储数据
     * @param httpRequestBean
     */
    void storeData(HttpRequestBean httpRequestBean);

}
