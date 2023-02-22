package org.dlut.managedrone.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dlut.managedrone.mapper.DroneMissionPlanMapper;
import org.dlut.managedrone.domain.DroneMissionPlan;
import org.dlut.managedrone.service.IDroneMissionPlanService;

/**
 * 任务管理Service业务层处理
 * 
 * @author wang
 * @date 2023-02-19
 */
@Service
public class DroneMissionPlanServiceImpl implements IDroneMissionPlanService 
{
    @Autowired
    private DroneMissionPlanMapper droneMissionPlanMapper;

    /**
     * 查询任务管理
     * 
     * @param id 任务管理主键
     * @return 任务管理
     */
    @Override
    public DroneMissionPlan selectDroneMissionPlanById(String id)
    {
        return droneMissionPlanMapper.selectDroneMissionPlanById(id);
    }

    /**
     * 查询任务管理列表
     * 
     * @param droneMissionPlan 任务管理
     * @return 任务管理
     */
    @Override
    public List<DroneMissionPlan> selectDroneMissionPlanList(DroneMissionPlan droneMissionPlan)
    {
        return droneMissionPlanMapper.selectDroneMissionPlanList(droneMissionPlan);
    }

    /**
     * 新增任务管理
     * 
     * @param droneMissionPlan 任务管理
     * @return 结果
     */
    @Override
    public int insertDroneMissionPlan(DroneMissionPlan droneMissionPlan)
    {
        droneMissionPlan.setId(UUID.randomUUID().toString());
        return droneMissionPlanMapper.insertDroneMissionPlan(droneMissionPlan);
    }

    /**
     * 修改任务管理
     * 
     * @param droneMissionPlan 任务管理
     * @return 结果
     */
    @Override
    public int updateDroneMissionPlan(DroneMissionPlan droneMissionPlan)
    {
        return droneMissionPlanMapper.updateDroneMissionPlan(droneMissionPlan);
    }

    /**
     * 批量删除任务管理
     * 
     * @param ids 需要删除的任务管理主键
     * @return 结果
     */
    @Override
    public int deleteDroneMissionPlanByIds(String[] ids)
    {
        return droneMissionPlanMapper.deleteDroneMissionPlanByIds(ids);
    }

    /**
     * 删除任务管理信息
     * 
     * @param id 任务管理主键
     * @return 结果
     */
    @Override
    public int deleteDroneMissionPlanById(String id)
    {
        return droneMissionPlanMapper.deleteDroneMissionPlanById(id);
    }
}
