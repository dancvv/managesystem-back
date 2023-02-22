package org.dlut.managedrone.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dlut.managedrone.mapper.DroneInfoMapper;
import org.dlut.managedrone.domain.DroneInfo;
import org.dlut.managedrone.service.IDroneInfoService;

/**
 * 无人机管理Service业务层处理
 * 
 * @author wang
 * @date 2023-02-19
 */
@Service
public class DroneInfoServiceImpl implements IDroneInfoService 
{
    @Autowired
    private DroneInfoMapper droneInfoMapper;

    /**
     * 查询无人机管理
     * 
     * @param id 无人机管理主键
     * @return 无人机管理
     */
    @Override
    public DroneInfo selectDroneInfoById(String id)
    {
        return droneInfoMapper.selectDroneInfoById(id);
    }

    /**
     * 查询无人机管理列表
     * 
     * @param droneInfo 无人机管理
     * @return 无人机管理
     */
    @Override
    public List<DroneInfo> selectDroneInfoList(DroneInfo droneInfo)
    {
        return droneInfoMapper.selectDroneInfoList(droneInfo);
    }

    /**
     * 新增无人机管理
     * 
     * @param droneInfo 无人机管理
     * @return 结果
     */
    @Override
    public int insertDroneInfo(DroneInfo droneInfo)
    {
        droneInfo.setId(UUID.randomUUID().toString());
        return droneInfoMapper.insertDroneInfo(droneInfo);
    }

    /**
     * 修改无人机管理
     * 
     * @param droneInfo 无人机管理
     * @return 结果
     */
    @Override
    public int updateDroneInfo(DroneInfo droneInfo)
    {
        return droneInfoMapper.updateDroneInfo(droneInfo);
    }

    /**
     * 批量删除无人机管理
     * 
     * @param ids 需要删除的无人机管理主键
     * @return 结果
     */
    @Override
    public int deleteDroneInfoByIds(String[] ids)
    {
        return droneInfoMapper.deleteDroneInfoByIds(ids);
    }

    /**
     * 删除无人机管理信息
     * 
     * @param id 无人机管理主键
     * @return 结果
     */
    @Override
    public int deleteDroneInfoById(String id)
    {
        return droneInfoMapper.deleteDroneInfoById(id);
    }
}
