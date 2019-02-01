package com.fish.center.utils;

/**
 * @author 一条小咸鱼
 */
public class StringUtil{


    /**
     * 是否包含子串,如果存在返回首字符的位置
     * @param str 主字符串
     * @param subStr 子字符串
     * @return
     */
    public static int isExist(String str,String subStr){
        int index = str.indexOf(subStr);
        return index >0 ?index+subStr.length():index;
    }
    private StringUtil(){}
}
