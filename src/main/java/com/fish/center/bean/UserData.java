package com.fish.center.bean;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: center
 * @Package: com.fish.center.bean
 * @ClassName: UserData
 * @Author: 一条小咸鱼
 * @Description: ${description}
 * @Date: 2019/1/31 15:58
 * @Version: 1.0
 */
@Component
public class UserData extends BaseHttpBean{

    /**
     * 存储数据,存储空间默认500
     */
    private String [] data = new String[500];
    /**
     *  游标指针,指向当前所需要覆盖的位置
     */
    private int  cursor = 0;

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    /**
     * 返回游标的数据
     * @return 通过data的长度限制的了cursor值在数组的范围内.
     */
    public int getCursor() {
        return cursor % data.length;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }
}
