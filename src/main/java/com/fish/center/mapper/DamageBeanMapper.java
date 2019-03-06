package com.fish.center.mapper;

import com.fish.center.model.DamageBean;
import com.fish.center.model.DamageData;

import java.util.List;

public interface DamageBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DamageBean record);

    int insertSelective(DamageBean record);

    DamageBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DamageBean record);

    int updateByPrimaryKey(DamageBean record);

    /**
     * 批量插入数据
     * @param damageData
     */
    void insertBatch(List<DamageBean> damageData);

    /**
     * 按照typeId 获取一组伤害数据
     * @param typeId
     * @return
     */
    List<DamageBean> selectByTypeId(String typeId);

    /**
     * 根据一个typeId 删除一组数据
     * @param typeId
     */
    void deleteByTypeId(String typeId);
}