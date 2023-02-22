package org.dlut.managedrone.service;

import java.util.List;
import org.dlut.managedrone.domain.DroneInfo;

/**
 * 无人机管理Service接口
 * 
 * @author wang
 * @date 2023-02-19
 */
public interface IDroneInfoService 
{
    /**
     * 查询无人机管理
     * 
     * @param id 无人机管理主键
     * @return 无人机管理
     */
    public DroneInfo selectDroneInfoById(String id);

    /**
     * 查询无人机管理列表
     * 
     * @param droneInfo 无人机管理
     * @return 无人机管理集合
     */
    public List<DroneInfo> selectDroneInfoList(DroneInfo droneInfo);

    /**
     * 新增无人机管理
     * 
     * @param droneInfo 无人机管理
     * @return 结果
     */
    public int insertDroneInfo(DroneInfo droneInfo);

    /**
     * 修改无人机管理
     * 
     * @param droneInfo 无人机管理
     * @return 结果
     */
    public int updateDroneInfo(DroneInfo droneInfo);

    /**
     * 批量删除无人机管理
     * 
     * @param ids 需要删除的无人机管理主键集合
     * @return 结果
     */
    public int deleteDroneInfoByIds(String[] ids);

    /**
     * 删除无人机管理信息
     * 
     * @param id 无人机管理主键
     * @return 结果
     */
    public int deleteDroneInfoById(String id);
}
