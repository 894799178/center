package com.fish.center.bean;

/**
 * @ProjectName: center
 * @Package: com.fish.center.bean
 * @ClassName: tProperty
 * @Author: 一条小咸鱼
 * @Description: ${description}
 * @Date: 2019/3/27 16:16
 * @Version: 1.0
 */
public class Property {
    private String _hp;

    private String _atk;

    private String _def;

    private String _defIgnore;

    public String get_hp() {
        return _hp;
    }
    public void set_hp(String _hp) {
        this._hp = String.valueOf(Integer.parseInt(_hp)/100) ;
    }

    public String get_atk() {
        return _atk;
    }

    public void set_atk(String _atk) {
        this._atk = _atk;
    }

    public String get_def() {
        return _def;
    }

    public void set_def(String _def) {
        this._def = _def;
    }
    @Override
    public String toString() {
        return "tProperty{" +
                "_hp='" + _hp + '\'' +
                ", _atk='" + _atk + '\'' +
                ", _def='" + _def + '\'' +
                '}';
    }

}
