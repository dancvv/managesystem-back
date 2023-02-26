package org.dlut.managedrone.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dlut.managedrone.mapper.DroneSensorDataMapper;
import org.dlut.managedrone.domain.DroneSensorData;
import org.dlut.managedrone.service.IDroneSensorDataService;

/**
 * 传感器数据管理Service业务层处理
 * 
 * @author wang
 * @date 2023-02-27
 */
@Service
public class DroneSensorDataServiceImpl implements IDroneSensorDataService 
{
    @Autowired
    private DroneSensorDataMapper droneSensorDataMapper;

    /**
     * 查询传感器数据管理
     * 
     * @param dataId 传感器数据管理主键
     * @return 传感器数据管理
     */
    @Override
    public DroneSensorData selectDroneSensorDataByDataId(Long dataId)
    {
        return droneSensorDataMapper.selectDroneSensorDataByDataId(dataId);
    }

    /**
     * 查询传感器数据管理列表
     * 
     * @param droneSensorData 传感器数据管理
     * @return 传感器数据管理
     */
    @Override
    public List<DroneSensorData> selectDroneSensorDataList(DroneSensorData droneSensorData)
    {
        return droneSensorDataMapper.selectDroneSensorDataList(droneSensorData);
    }

    /**
     * 新增传感器数据管理
     * 
     * @param droneSensorData 传感器数据管理
     * @return 结果
     */
    @Override
    public int insertDroneSensorData(DroneSensorData droneSensorData)
    {
        return droneSensorDataMapper.insertDroneSensorData(droneSensorData);
    }

    /**
     * 修改传感器数据管理
     * 
     * @param droneSensorData 传感器数据管理
     * @return 结果
     */
    @Override
    public int updateDroneSensorData(DroneSensorData droneSensorData)
    {
        return droneSensorDataMapper.updateDroneSensorData(droneSensorData);
    }

    /**
     * 批量删除传感器数据管理
     * 
     * @param dataIds 需要删除的传感器数据管理主键
     * @return 结果
     */
    @Override
    public int deleteDroneSensorDataByDataIds(Long[] dataIds)
    {
        return droneSensorDataMapper.deleteDroneSensorDataByDataIds(dataIds);
    }

    /**
     * 删除传感器数据管理信息
     * 
     * @param dataId 传感器数据管理主键
     * @return 结果
     */
    @Override
    public int deleteDroneSensorDataByDataId(Long dataId)
    {
        return droneSensorDataMapper.deleteDroneSensorDataByDataId(dataId);
    }
}
