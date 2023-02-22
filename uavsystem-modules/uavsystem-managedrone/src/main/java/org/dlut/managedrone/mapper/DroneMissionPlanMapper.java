package org.dlut.managedrone.mapper;

import java.util.List;
import org.dlut.managedrone.domain.DroneMissionPlan;

/**
 * 任务管理Mapper接口
 * 
 * @author wang
 * @date 2023-02-19
 */
public interface DroneMissionPlanMapper 
{
    /**
     * 查询任务管理
     * 
     * @param id 任务管理主键
     * @return 任务管理
     */
    public DroneMissionPlan selectDroneMissionPlanById(String id);

    /**
     * 查询任务管理列表
     * 
     * @param droneMissionPlan 任务管理
     * @return 任务管理集合
     */
    public List<DroneMissionPlan> selectDroneMissionPlanList(DroneMissionPlan droneMissionPlan);

    /**
     * 新增任务管理
     * 
     * @param droneMissionPlan 任务管理
     * @return 结果
     */
    public int insertDroneMissionPlan(DroneMissionPlan droneMissionPlan);

    /**
     * 修改任务管理
     * 
     * @param droneMissionPlan 任务管理
     * @return 结果
     */
    public int updateDroneMissionPlan(DroneMissionPlan droneMissionPlan);

    /**
     * 删除任务管理
     * 
     * @param id 任务管理主键
     * @return 结果
     */
    public int deleteDroneMissionPlanById(String id);

    /**
     * 批量删除任务管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDroneMissionPlanByIds(String[] ids);
}
