package org.dlut.managedrone.service;

import java.util.List;
import org.dlut.managedrone.domain.DroneFileInfo;

/**
 * 文件信息Service接口
 * 
 * @author wang
 * @date 2023-03-01
 */
public interface IDroneFileInfoService 
{
    /**
     * 查询文件信息
     * 
     * @param fileId 文件信息主键
     * @return 文件信息
     */
    public DroneFileInfo selectDroneFileInfoByFileId(Long fileId);

    /**
     * 查询文件信息列表
     * 
     * @param droneFileInfo 文件信息
     * @return 文件信息集合
     */
    public List<DroneFileInfo> selectDroneFileInfoList(DroneFileInfo droneFileInfo);

    /**
     * 新增文件信息
     * 
     * @param droneFileInfo 文件信息
     * @return 结果
     */
    public int insertDroneFileInfo(DroneFileInfo droneFileInfo);

    /**
     * 修改文件信息
     * 
     * @param droneFileInfo 文件信息
     * @return 结果
     */
    public int updateDroneFileInfo(DroneFileInfo droneFileInfo);

    /**
     * 批量删除文件信息
     * 
     * @param fileIds 需要删除的文件信息主键集合
     * @return 结果
     */
    public int deleteDroneFileInfoByFileIds(Long[] fileIds);

    /**
     * 删除文件信息信息
     * 
     * @param fileId 文件信息主键
     * @return 结果
     */
    public int deleteDroneFileInfoByFileId(Long fileId);
}
