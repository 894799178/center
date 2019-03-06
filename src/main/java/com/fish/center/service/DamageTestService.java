package com.fish.center.service;

import com.fish.center.model.DamageBean;
import com.fish.center.model.DamageData;

import java.util.List;

/**
 * @ProjectName: center
 * @Package: com.fish.center.service
 * @ClassName: DamageTestService
 * @Author: 一条小咸鱼
 * @Description: ${description}
 * @Date: 2019/2/12 16:25
 * @Version: 1.0
 */
public interface DamageTestService {
    /**
     * 批量覆盖数据.如果数据存在则覆盖,不存在则插入.
     * @param list
     */
    void batchCover(List<DamageBean> list);

    /**
     * 根据TypeId获取对应的数据组
     * @param typeId
     * @return
     */
    List<DamageBean> getDamageDataByTypeId(String typeId);

}
