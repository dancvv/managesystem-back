package org.dlut.managedrone.service;

import java.util.List;
import org.dlut.managedrone.domain.DroneFlylog;

/**
 * 飞行日志Service接口
 * 
 * @author wang
 * @date 2023-02-19
 */
public interface IDroneFlylogService 
{
    /**
     * 查询飞行日志
     * 
     * @param id 飞行日志主键
     * @return 飞行日志
     */
    public DroneFlylog selectDroneFlylogById(String id);

    /**
     * 查询飞行日志列表
     * 
     * @param droneFlylog 飞行日志
     * @return 飞行日志集合
     */
    public List<DroneFlylog> selectDroneFlylogList(DroneFlylog droneFlylog);

    /**
     * 新增飞行日志
     * 
     * @param droneFlylog 飞行日志
     * @return 结果
     */
    public int insertDroneFlylog(DroneFlylog droneFlylog);

    /**
     * 修改飞行日志
     * 
     * @param droneFlylog 飞行日志
     * @return 结果
     */
    public int updateDroneFlylog(DroneFlylog droneFlylog);

    /**
     * 批量删除飞行日志
     * 
     * @param ids 需要删除的飞行日志主键集合
     * @return 结果
     */
    public int deleteDroneFlylogByIds(String[] ids);

    /**
     * 删除飞行日志信息
     * 
     * @param id 飞行日志主键
     * @return 结果
     */
    public int deleteDroneFlylogById(String id);
}
