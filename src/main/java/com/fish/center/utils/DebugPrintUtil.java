package com.fish.center.utils;

import java.util.List;

/**
 * @ProjectName: center
 * @Package: com.fish.center.utils
 * @ClassName: PrintUtil
 * @Author: 一条小咸鱼
 * @Description: 一些打印工具用于调试
 * @Date: 2019/1/31 17:36
 * @Version: 1.0
 */
public class DebugPrintUtil {
    /**
     * 用于调试打印..
     * @param list
     * @param <T>
     */
    public static <T> void printNotNull(List<T> list){
        //仅用于调试
        if(list == null){
            return;
        }
        for (T item:list) {
            if(item!=null){
                System.out.println(item.toString());
            }
        }
    }



}
