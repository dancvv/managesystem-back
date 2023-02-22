package org.dlut.managedrone.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dlut.managedrone.mapper.DroneFlylogMapper;
import org.dlut.managedrone.domain.DroneFlylog;
import org.dlut.managedrone.service.IDroneFlylogService;

/**
 * 飞行日志Service业务层处理
 * 
 * @author wang
 * @date 2023-02-19
 */
@Service
public class DroneFlylogServiceImpl implements IDroneFlylogService 
{
    @Autowired
    private DroneFlylogMapper droneFlylogMapper;

    /**
     * 查询飞行日志
     * 
     * @param id 飞行日志主键
     * @return 飞行日志
     */
    @Override
    public DroneFlylog selectDroneFlylogById(String id)
    {
        return droneFlylogMapper.selectDroneFlylogById(id);
    }

    /**
     * 查询飞行日志列表
     * 
     * @param droneFlylog 飞行日志
     * @return 飞行日志
     */
    @Override
    public List<DroneFlylog> selectDroneFlylogList(DroneFlylog droneFlylog)
    {
        return droneFlylogMapper.selectDroneFlylogList(droneFlylog);
    }

    /**
     * 新增飞行日志
     * 
     * @param droneFlylog 飞行日志
     * @return 结果
     */
    @Override
    public int insertDroneFlylog(DroneFlylog droneFlylog)
    {
        droneFlylog.setId(UUID.randomUUID().toString());
        return droneFlylogMapper.insertDroneFlylog(droneFlylog);
    }

    /**
     * 修改飞行日志
     * 
     * @param droneFlylog 飞行日志
     * @return 结果
     */
    @Override
    public int updateDroneFlylog(DroneFlylog droneFlylog)
    {
        return droneFlylogMapper.updateDroneFlylog(droneFlylog);
    }

    /**
     * 批量删除飞行日志
     * 
     * @param ids 需要删除的飞行日志主键
     * @return 结果
     */
    @Override
    public int deleteDroneFlylogByIds(String[] ids)
    {
        return droneFlylogMapper.deleteDroneFlylogByIds(ids);
    }

    /**
     * 删除飞行日志信息
     * 
     * @param id 飞行日志主键
     * @return 结果
     */
    @Override
    public int deleteDroneFlylogById(String id)
    {
        return droneFlylogMapper.deleteDroneFlylogById(id);
    }
}
