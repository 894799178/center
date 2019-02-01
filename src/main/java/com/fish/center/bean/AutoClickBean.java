package com.fish.center.bean;

import org.springframework.stereotype.Component;

/**
 * @author 一条小咸鱼
 */
@Component
public class AutoClickBean extends  BaseBusinessDataBean{

    private String event;

    private String pointX;

    private String pointY;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getPointX() {
        return pointX;
    }

    public void setPointX(String pointX) {
        this.pointX = pointX;
    }

    public String getPointY() {
        return pointY;
    }

    public void setPointY(String pointY) {
        this.pointY = pointY;
    }

    @Override
    public String toString() {
        return "AutoClickModel{" +
                "event='" + event + '\'' +
                ", pointX='" + pointX + '\'' +
                ", pointY='" + pointY + '\'' +
                '}';
    }
}
