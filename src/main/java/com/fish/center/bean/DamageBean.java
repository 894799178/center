package com.fish.center.bean;

/**
 * @ProjectName: collect
 * @Package: bean
 * @ClassName: DamageBean
 * @Author: 一条小咸鱼
 * @Description: 伤害测试的数据模型
 * @Date: 2019/1/30 16:10
 * @Version: 1.0
 */
public class DamageBean extends HeroAttribute {
    /**
     * 伤害的数值
     */
    private String damageNumber;
    /**
     * 是否暴击
     */
    private String isCrit;
    /**
     *  被攻击单位的名字
     */
    private String beingAttackedName;

    public String getDamageNumber() {
        return damageNumber;
    }

    public void setDamageNumber(String damageNumber) {
        this.damageNumber = damageNumber;
    }

    public String getIsCrit() {
        return isCrit;
    }

    public void setIsCrit(String isCrit) {
        this.isCrit = isCrit;
    }

    public String getBeingAttackedName() {
        return beingAttackedName;
    }

    public void setBeingAttackedName(String beingAttackedName) {
        this.beingAttackedName = beingAttackedName;
    }


}
