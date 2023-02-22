package org.dlut.managedrone.service;

import java.util.List;
import org.dlut.managedrone.domain.DroneExecuteMissionList;

/**
 * 任务执行列表Service接口
 * 
 * @author wang
 * @date 2023-02-19
 */
public interface IDroneExecuteMissionListService 
{
    /**
     * 查询任务执行列表
     * 
     * @param id 任务执行列表主键
     * @return 任务执行列表
     */
    public DroneExecuteMissionList selectDroneExecuteMissionListById(String id);

    /**
     * 查询任务执行列表列表
     * 
     * @param droneExecuteMissionList 任务执行列表
     * @return 任务执行列表集合
     */
    public List<DroneExecuteMissionList> selectDroneExecuteMissionListList(DroneExecuteMissionList droneExecuteMissionList);

    /**
     * 新增任务执行列表
     * 
     * @param droneExecuteMissionList 任务执行列表
     * @return 结果
     */
    public int insertDroneExecuteMissionList(DroneExecuteMissionList droneExecuteMissionList);

    /**
     * 修改任务执行列表
     * 
     * @param droneExecuteMissionList 任务执行列表
     * @return 结果
     */
    public int updateDroneExecuteMissionList(DroneExecuteMissionList droneExecuteMissionList);

    /**
     * 批量删除任务执行列表
     * 
     * @param ids 需要删除的任务执行列表主键集合
     * @return 结果
     */
    public int deleteDroneExecuteMissionListByIds(String[] ids);

    /**
     * 删除任务执行列表信息
     * 
     * @param id 任务执行列表主键
     * @return 结果
     */
    public int deleteDroneExecuteMissionListById(String id);
}
