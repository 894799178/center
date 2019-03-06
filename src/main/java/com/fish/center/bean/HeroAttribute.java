package com.fish.center.bean;

/**
 * @ProjectName: center
 * @Package: com.fish.center.bean
 * @ClassName: HeroAttribute
 * @Author: 一条小咸鱼
 * @Description: 英雄的属性
 * @Date: 2019/3/6 11:39
 * @Version: 1.0
 */
public class HeroAttribute  extends  BaseBusinessDataBean{
    /**
     * 攻击力
     */
    private String atk;
    /**
     * 当前血量
     */
    private String hp;
    /**
     * 防御
     */
    private String def;
    /**
     * 暴击率
     */
    private String critPer;
    /**
     * 固定破甲
     */
    private String defIgnore;
    /**
     * 百分比破甲
     */
    private String defIgnorePer;
    /**
     * 爆伤加成
     */
    private String critDamagePer;


    public String getCritDamagePer() {
        return critDamagePer;
    }

    public void setCritDamagePer(String critDamagePer) {
        this.critDamagePer = critDamagePer;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getCritPer() {
        return critPer;
    }

    public void setCritPer(String critPer) {
        this.critPer = critPer;
    }

    public String getDefIgnore() {
        return defIgnore;
    }

    public void setDefIgnore(String defIgnore) {
        this.defIgnore = defIgnore;
    }

    public String getDefIgnorePer() {
        return defIgnorePer;
    }

    public void setDefIgnorePer(String defIgnorePer) {
        this.defIgnorePer = defIgnorePer;
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }
}
