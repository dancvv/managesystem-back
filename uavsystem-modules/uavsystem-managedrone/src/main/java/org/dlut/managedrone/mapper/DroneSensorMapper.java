package org.dlut.managedrone.mapper;

import java.util.List;
import org.dlut.managedrone.domain.DroneSensor;

/**
 * 传感器管理Mapper接口
 * 
 * @author wang
 * @date 2023-02-27
 */
public interface DroneSensorMapper 
{
    /**
     * 查询传感器管理
     * 
     * @param sensorId 传感器管理主键
     * @return 传感器管理
     */
    public DroneSensor selectDroneSensorBySensorId(Long sensorId);

    /**
     * 查询传感器管理列表
     * 
     * @param droneSensor 传感器管理
     * @return 传感器管理集合
     */
    public List<DroneSensor> selectDroneSensorList(DroneSensor droneSensor);

    /**
     * 新增传感器管理
     * 
     * @param droneSensor 传感器管理
     * @return 结果
     */
    public int insertDroneSensor(DroneSensor droneSensor);

    /**
     * 修改传感器管理
     * 
     * @param droneSensor 传感器管理
     * @return 结果
     */
    public int updateDroneSensor(DroneSensor droneSensor);

    /**
     * 删除传感器管理
     * 
     * @param sensorId 传感器管理主键
     * @return 结果
     */
    public int deleteDroneSensorBySensorId(Long sensorId);

    /**
     * 批量删除传感器管理
     * 
     * @param sensorIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDroneSensorBySensorIds(Long[] sensorIds);
}
