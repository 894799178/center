package com.fish.center.Enums;

/**
 * 业务名字相关的枚举类
 */
public enum EnumBusinessName {
    /**
     * 自动点击bean 对应的值.
     */
    AUTO_CLICK_EVENT(1);

    /**
     * 业务名
     */
    private String name;
    /**
     * 对应的值
     */
    private int value;

    EnumBusinessName(String name, int value) {
        this.name = name;
        this.value = value;
    }


    EnumBusinessName(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }



}
