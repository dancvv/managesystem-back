package org.dlut.managedrone.service;

import java.util.List;
import org.dlut.managedrone.domain.DroneMissionAssignment;

/**
 * 任务分配Service接口
 * 
 * @author wang
 * @date 2023-02-19
 */
public interface IDroneMissionAssignmentService 
{
    /**
     * 查询任务分配
     * 
     * @param id 任务分配主键
     * @return 任务分配
     */
    public DroneMissionAssignment selectDroneMissionAssignmentById(String id);

    /**
     * 查询任务分配列表
     * 
     * @param droneMissionAssignment 任务分配
     * @return 任务分配集合
     */
    public List<DroneMissionAssignment> selectDroneMissionAssignmentList(DroneMissionAssignment droneMissionAssignment);

    /**
     * 新增任务分配
     * 
     * @param droneMissionAssignment 任务分配
     * @return 结果
     */
    public int insertDroneMissionAssignment(DroneMissionAssignment droneMissionAssignment);

    /**
     * 修改任务分配
     * 
     * @param droneMissionAssignment 任务分配
     * @return 结果
     */
    public int updateDroneMissionAssignment(DroneMissionAssignment droneMissionAssignment);

    /**
     * 批量删除任务分配
     * 
     * @param ids 需要删除的任务分配主键集合
     * @return 结果
     */
    public int deleteDroneMissionAssignmentByIds(String[] ids);

    /**
     * 删除任务分配信息
     * 
     * @param id 任务分配主键
     * @return 结果
     */
    public int deleteDroneMissionAssignmentById(String id);
}
