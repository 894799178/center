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

    private String pointXEnd;

    private String pointYEnd;

    private String delay;

    public String getPointXEnd() {
        return pointXEnd;
    }

    public void setPointXEnd(String pointXEnd) {
        this.pointXEnd = pointXEnd;
    }

    public String getPointYEnd() {
        return pointYEnd;
    }

    public void setPointYEnd(String pointYEnd) {
        this.pointYEnd = pointYEnd;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

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


}
