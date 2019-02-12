package com.fish.center.service.impl;

import com.fish.center.mapper.DamageDataMapper;
import com.fish.center.model.DamageData;
import com.fish.center.service.DamageTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: center
 * @Package: com.fish.center.service.impl
 * @ClassName: DamageTestServiceImpl
 * @Author: 一条小咸鱼
 * @Description: ${description}
 * @Date: 2019/2/12 16:25
 * @Version: 1.0
 */
@Service
public class DamageTestServiceImpl implements DamageTestService {

    @Resource
    DamageDataMapper damageDataMapper;

    @Override
    public void batchCover(List<DamageData> list) {
        //插入数据前,先把旧数据删除
        damageDataMapper.deleteByTypeId(list.get(0).getTypeId());
        damageDataMapper.insertBatch(list);
    }

    @Override
    public List<DamageData> getDamageDataByTypeId(String typeId) {
        return damageDataMapper.selectByTypeId(typeId);
    }
}
