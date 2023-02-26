package org.dlut.managedrone.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dlut.managedrone.mapper.DroneSensorMapper;
import org.dlut.managedrone.domain.DroneSensor;
import org.dlut.managedrone.service.IDroneSensorService;

/**
 * 传感器管理Service业务层处理
 * 
 * @author wang
 * @date 2023-02-27
 */
@Service
public class DroneSensorServiceImpl implements IDroneSensorService 
{
    @Autowired
    private DroneSensorMapper droneSensorMapper;

    /**
     * 查询传感器管理
     * 
     * @param sensorId 传感器管理主键
     * @return 传感器管理
     */
    @Override
    public DroneSensor selectDroneSensorBySensorId(Long sensorId)
    {
        return droneSensorMapper.selectDroneSensorBySensorId(sensorId);
    }

    /**
     * 查询传感器管理列表
     * 
     * @param droneSensor 传感器管理
     * @return 传感器管理
     */
    @Override
    public List<DroneSensor> selectDroneSensorList(DroneSensor droneSensor)
    {
        return droneSensorMapper.selectDroneSensorList(droneSensor);
    }

    /**
     * 新增传感器管理
     * 
     * @param droneSensor 传感器管理
     * @return 结果
     */
    @Override
    public int insertDroneSensor(DroneSensor droneSensor)
    {
        return droneSensorMapper.insertDroneSensor(droneSensor);
    }

    /**
     * 修改传感器管理
     * 
     * @param droneSensor 传感器管理
     * @return 结果
     */
    @Override
    public int updateDroneSensor(DroneSensor droneSensor)
    {
        return droneSensorMapper.updateDroneSensor(droneSensor);
    }

    /**
     * 批量删除传感器管理
     * 
     * @param sensorIds 需要删除的传感器管理主键
     * @return 结果
     */
    @Override
    public int deleteDroneSensorBySensorIds(Long[] sensorIds)
    {
        return droneSensorMapper.deleteDroneSensorBySensorIds(sensorIds);
    }

    /**
     * 删除传感器管理信息
     * 
     * @param sensorId 传感器管理主键
     * @return 结果
     */
    @Override
    public int deleteDroneSensorBySensorId(Long sensorId)
    {
        return droneSensorMapper.deleteDroneSensorBySensorId(sensorId);
    }
}
