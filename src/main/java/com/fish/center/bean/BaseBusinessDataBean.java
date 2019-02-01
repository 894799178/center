package com.fish.center.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * @ProjectName: collect
 * @Package: bean
 * @ClassName: BaseBean
 * @Author: 一条小咸鱼
 * @Description: 业务数据的Bean
 * @Date: 2019/1/30 15:50
 * @Version: 1.0
 */
@JsonAutoDetect
public class BaseBusinessDataBean extends BaseHttpBean{
    /**
     * 用于筛选
     */
    private String flag;
    /**
     * 标记业务名字用于区别
     */
    private String businessName;

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
