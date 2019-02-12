package com.fish.center.mapper;

import com.fish.center.model.DamageData;

import java.util.List;

/**
 * @author 一条小咸鱼
 */
public interface DamageDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DamageData record);

    int insertSelective(DamageData record);

    DamageData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DamageData record);

    int updateByPrimaryKey(DamageData record);

    /**
     * 批量插入数据
     * @param damageData
     */
    void insertBatch(List<DamageData> damageData);
    /**
     * 按照typeId 获取一组伤害数据
     * @param typeId
     * @return
     */
    List<DamageData> selectByTypeId(String typeId);

    /**
     * 根据一个typeId 删除一组数据
     * @param typeId
     */
    void deleteByTypeId(String typeId);
}