package com.fish.center.bean;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedQueue;

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
     * 存储缓存数据,
     * 5555555 不想改代码了.性能差就性能差吧.
     * 能跑就行
     */
    private Queue<String> data = new ConcurrentLinkedQueue<>();
    /**
     *  游标指针,指向当前所需要覆盖的位置
     */
    private int  cursor = 0;
    /**
     * 遍历全数组的次数
     */
    private int turns = -1;

    public Queue<String> getData() {
        return data;
    }

    public void setData(Queue<String> data) {
        this.data = data;
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }
}
