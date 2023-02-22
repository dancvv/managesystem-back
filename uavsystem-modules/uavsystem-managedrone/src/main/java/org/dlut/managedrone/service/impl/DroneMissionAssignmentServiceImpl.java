package org.dlut.managedrone.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dlut.managedrone.mapper.DroneMissionAssignmentMapper;
import org.dlut.managedrone.domain.DroneMissionAssignment;
import org.dlut.managedrone.service.IDroneMissionAssignmentService;

/**
 * 任务分配Service业务层处理
 * 
 * @author wang
 * @date 2023-02-19
 */
@Service
public class DroneMissionAssignmentServiceImpl implements IDroneMissionAssignmentService 
{
    @Autowired
    private DroneMissionAssignmentMapper droneMissionAssignmentMapper;

    /**
     * 查询任务分配
     * 
     * @param id 任务分配主键
     * @return 任务分配
     */
    @Override
    public DroneMissionAssignment selectDroneMissionAssignmentById(String id)
    {
        return droneMissionAssignmentMapper.selectDroneMissionAssignmentById(id);
    }

    /**
     * 查询任务分配列表
     * 
     * @param droneMissionAssignment 任务分配
     * @return 任务分配
     */
    @Override
    public List<DroneMissionAssignment> selectDroneMissionAssignmentList(DroneMissionAssignment droneMissionAssignment)
    {
        return droneMissionAssignmentMapper.selectDroneMissionAssignmentList(droneMissionAssignment);
    }

    /**
     * 新增任务分配
     * 
     * @param droneMissionAssignment 任务分配
     * @return 结果
     */
    @Override
    public int insertDroneMissionAssignment(DroneMissionAssignment droneMissionAssignment)
    {
        droneMissionAssignment.setId(UUID.randomUUID().toString());
        return droneMissionAssignmentMapper.insertDroneMissionAssignment(droneMissionAssignment);
    }

    /**
     * 修改任务分配
     * 
     * @param droneMissionAssignment 任务分配
     * @return 结果
     */
    @Override
    public int updateDroneMissionAssignment(DroneMissionAssignment droneMissionAssignment)
    {
        return droneMissionAssignmentMapper.updateDroneMissionAssignment(droneMissionAssignment);
    }

    /**
     * 批量删除任务分配
     * 
     * @param ids 需要删除的任务分配主键
     * @return 结果
     */
    @Override
    public int deleteDroneMissionAssignmentByIds(String[] ids)
    {
        return droneMissionAssignmentMapper.deleteDroneMissionAssignmentByIds(ids);
    }

    /**
     * 删除任务分配信息
     * 
     * @param id 任务分配主键
     * @return 结果
     */
    @Override
    public int deleteDroneMissionAssignmentById(String id)
    {
        return droneMissionAssignmentMapper.deleteDroneMissionAssignmentById(id);
    }
}
