package org.dlut.managedrone.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dlut.managedrone.mapper.DroneFileInfoMapper;
import org.dlut.managedrone.domain.DroneFileInfo;
import org.dlut.managedrone.service.IDroneFileInfoService;

/**
 * 文件信息Service业务层处理
 * 
 * @author wang
 * @date 2023-03-01
 */
@Service
public class DroneFileInfoServiceImpl implements IDroneFileInfoService 
{
    @Autowired
    private DroneFileInfoMapper droneFileInfoMapper;

    /**
     * 查询文件信息
     * 
     * @param fileId 文件信息主键
     * @return 文件信息
     */
    @Override
    public DroneFileInfo selectDroneFileInfoByFileId(Long fileId)
    {
        return droneFileInfoMapper.selectDroneFileInfoByFileId(fileId);
    }

    /**
     * 查询文件信息列表
     * 
     * @param droneFileInfo 文件信息
     * @return 文件信息
     */
    @Override
    public List<DroneFileInfo> selectDroneFileInfoList(DroneFileInfo droneFileInfo)
    {
        return droneFileInfoMapper.selectDroneFileInfoList(droneFileInfo);
    }

    /**
     * 新增文件信息
     * 
     * @param droneFileInfo 文件信息
     * @return 结果
     */
    @Override
    public int insertDroneFileInfo(DroneFileInfo droneFileInfo)
    {
        return droneFileInfoMapper.insertDroneFileInfo(droneFileInfo);
    }

    /**
     * 修改文件信息
     * 
     * @param droneFileInfo 文件信息
     * @return 结果
     */
    @Override
    public int updateDroneFileInfo(DroneFileInfo droneFileInfo)
    {
        return droneFileInfoMapper.updateDroneFileInfo(droneFileInfo);
    }

    /**
     * 批量删除文件信息
     * 
     * @param fileIds 需要删除的文件信息主键
     * @return 结果
     */
    @Override
    public int deleteDroneFileInfoByFileIds(Long[] fileIds)
    {
        return droneFileInfoMapper.deleteDroneFileInfoByFileIds(fileIds);
    }

    /**
     * 删除文件信息信息
     * 
     * @param fileId 文件信息主键
     * @return 结果
     */
    @Override
    public int deleteDroneFileInfoByFileId(Long fileId)
    {
        return droneFileInfoMapper.deleteDroneFileInfoByFileId(fileId);
    }
}
