package org.dlut.managedrone.mapper;

import java.util.List;
import org.dlut.managedrone.domain.DroneFlylog;

/**
 * 飞行日志Mapper接口
 * 
 * @author wang
 * @date 2023-02-19
 */
public interface DroneFlylogMapper 
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
     * 删除飞行日志
     * 
     * @param id 飞行日志主键
     * @return 结果
     */
    public int deleteDroneFlylogById(String id);

    /**
     * 批量删除飞行日志
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDroneFlylogByIds(String[] ids);
}
