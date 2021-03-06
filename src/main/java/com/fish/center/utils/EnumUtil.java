package com.fish.center.utils;

import com.fish.center.enums.EnumBusinessName;

/**
 * @author 一条小咸鱼
 */
public class EnumUtil {

    public static int getValueByName(String name){

        int result = 0;
        try {
            EnumBusinessName enumBusinessName = EnumBusinessName.valueOf(name);
            result = enumBusinessName.getValue();
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("不存在的枚举名字-->"+name);
        }
        return result;
    }
}
