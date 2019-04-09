package com.fish.center.model;

/**
 * 数据库的伤害测试bean用于持久化的model
 */
public class DamageBean {
    private Integer id;

    private String typeId;

    private String pointY;

    private String pointX;

    private String damageNumber;

    private Boolean isCrit;

    private String atk;

    private String hp;

    private String def;

    private String critPer;

    private String defIgnore;

    private String defIgnorePer;

    private String critDamagePer;
    /**
     * 全伤害增加
     */
    private String damageIncreasePer;
    /**
     * 全伤害减免
     */
    private String  damageReductionPer;


    public String getDamageIncreasePer() {
        return damageIncreasePer;
    }

    public void setDamageIncreasePer(String damageIncreasePer) {
        this.damageIncreasePer = damageIncreasePer;
    }

    public String getDamageReductionPer() {
        return damageReductionPer;
    }

    public void setDamageReductionPer(String damageReductionPer) {
        this.damageReductionPer = damageReductionPer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getPointY() {
        return pointY;
    }

    public void setPointY(String pointY) {
        this.pointY = pointY == null ? null : pointY.trim();
    }

    public String getPointX() {
        return pointX;
    }

    public void setPointX(String pointX) {
        this.pointX = pointX == null ? null : pointX.trim();
    }

    public String getDamageNumber() {
        return damageNumber;
    }

    public void setDamageNumber(String damageNumber) {
        this.damageNumber = damageNumber == null ? null : damageNumber.trim();
    }

    public Boolean getIsCrit() {
        return isCrit;
    }

    public void setIsCrit(Boolean isCrit) {
        this.isCrit = isCrit;
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk == null ? null : atk.trim();
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp == null ? null : hp.trim();
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def == null ? null : def.trim();
    }

    public String getCritPer() {
        return critPer;
    }

    public void setCritPer(String critPer) {
        this.critPer = critPer == null ? null : critPer.trim();
    }

    public String getDefIgnore() {
        return defIgnore;
    }

    public void setDefIgnore(String defIgnore) {
        this.defIgnore = defIgnore == null ? null : defIgnore.trim();
    }

    public String getDefIgnorePer() {
        return defIgnorePer;
    }

    public void setDefIgnorePer(String defIgnorePer) {
        this.defIgnorePer = defIgnorePer == null ? null : defIgnorePer.trim();
    }


    public String getCritDamagePer() {
        return critDamagePer;
    }

    public void setCritDamagePer(String critDamagePer) {
        this.critDamagePer = critDamagePer;
    }
}