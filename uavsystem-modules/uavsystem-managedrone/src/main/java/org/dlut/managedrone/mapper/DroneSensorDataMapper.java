package org.dlut.managedrone.mapper;

import java.util.List;
import org.dlut.managedrone.domain.DroneSensorData;

/**
 * 传感器数据管理Mapper接口
 * 
 * @author wang
 * @date 2023-02-27
 */
public interface DroneSensorDataMapper 
{
    /**
     * 查询传感器数据管理
     * 
     * @param dataId 传感器数据管理主键
     * @return 传感器数据管理
     */
    public DroneSensorData selectDroneSensorDataByDataId(Long dataId);

    /**
     * 查询传感器数据管理列表
     * 
     * @param droneSensorData 传感器数据管理
     * @return 传感器数据管理集合
     */
    public List<DroneSensorData> selectDroneSensorDataList(DroneSensorData droneSensorData);

    /**
     * 新增传感器数据管理
     * 
     * @param droneSensorData 传感器数据管理
     * @return 结果
     */
    public int insertDroneSensorData(DroneSensorData droneSensorData);

    /**
     * 修改传感器数据管理
     * 
     * @param droneSensorData 传感器数据管理
     * @return 结果
     */
    public int updateDroneSensorData(DroneSensorData droneSensorData);

    /**
     * 删除传感器数据管理
     * 
     * @param dataId 传感器数据管理主键
     * @return 结果
     */
    public int deleteDroneSensorDataByDataId(Long dataId);

    /**
     * 批量删除传感器数据管理
     * 
     * @param dataIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDroneSensorDataByDataIds(Long[] dataIds);
}
