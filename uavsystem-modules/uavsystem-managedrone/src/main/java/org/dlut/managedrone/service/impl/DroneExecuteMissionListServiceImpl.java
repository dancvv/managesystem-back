package org.dlut.managedrone.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dlut.managedrone.mapper.DroneExecuteMissionListMapper;
import org.dlut.managedrone.domain.DroneExecuteMissionList;
import org.dlut.managedrone.service.IDroneExecuteMissionListService;

/**
 * 任务执行列表Service业务层处理
 *
 * @author wang
 * @date 2023-02-23
 */
@Service
public class DroneExecuteMissionListServiceImpl implements IDroneExecuteMissionListService
{
    @Autowired
    private DroneExecuteMissionListMapper droneExecuteMissionListMapper;

    /**
     * 查询任务执行列表
     *
     * @param id 任务执行列表主键
     * @return 任务执行列表
     */
    @Override
    public DroneExecuteMissionList selectDroneExecuteMissionListById(String id)
    {
        return droneExecuteMissionListMapper.selectDroneExecuteMissionListById(id);
    }

    /**
     * 查询任务执行列表列表
     *
     * @param droneExecuteMissionList 任务执行列表
     * @return 任务执行列表
     */
    @Override
    public List<DroneExecuteMissionList> selectDroneExecuteMissionListList(DroneExecuteMissionList droneExecuteMissionList)
    {
        return droneExecuteMissionListMapper.selectDroneExecuteMissionListList(droneExecuteMissionList);
    }

    /**
     * 新增任务执行列表
     *
     * @param droneExecuteMissionList 任务执行列表
     * @return 结果
     */
    @Override
    public int insertDroneExecuteMissionList(DroneExecuteMissionList droneExecuteMissionList)
    {
        return droneExecuteMissionListMapper.insertDroneExecuteMissionList(droneExecuteMissionList);
    }

    /**
     * 修改任务执行列表
     *
     * @param droneExecuteMissionList 任务执行列表
     * @return 结果
     */
    @Override
    public int updateDroneExecuteMissionList(DroneExecuteMissionList droneExecuteMissionList)
    {
        return droneExecuteMissionListMapper.updateDroneExecuteMissionList(droneExecuteMissionList);
    }

    /**
     * 批量删除任务执行列表
     *
     * @param ids 需要删除的任务执行列表主键
     * @return 结果
     */
    @Override
    public int deleteDroneExecuteMissionListByIds(String[] ids)
    {
        return droneExecuteMissionListMapper.deleteDroneExecuteMissionListByIds(ids);
    }

    /**
     * 删除任务执行列表信息
     *
     * @param id 任务执行列表主键
     * @return 结果
     */
    @Override
    public int deleteDroneExecuteMissionListById(String id)
    {
        return droneExecuteMissionListMapper.deleteDroneExecuteMissionListById(id);
    }
}
