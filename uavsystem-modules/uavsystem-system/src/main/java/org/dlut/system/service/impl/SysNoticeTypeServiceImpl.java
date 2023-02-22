package org.dlut.system.service.impl;

import java.util.List;
import org.dlut.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dlut.system.mapper.SysNoticeTypeMapper;
import org.dlut.system.domain.SysNoticeType;
import org.dlut.system.service.ISysNoticeTypeService;

/**
 * 通知类型Service业务层处理
 * 
 * @author wang
 * @date 2023-02-20
 */
@Service
public class SysNoticeTypeServiceImpl implements ISysNoticeTypeService 
{
    @Autowired
    private SysNoticeTypeMapper sysNoticeTypeMapper;

    /**
     * 查询通知类型
     * 
     * @param noticeType 通知类型主键
     * @return 通知类型
     */
    @Override
    public SysNoticeType selectSysNoticeTypeByNoticeType(Long noticeType)
    {
        return sysNoticeTypeMapper.selectSysNoticeTypeByNoticeType(noticeType);
    }

    /**
     * 查询通知类型列表
     * 
     * @param sysNoticeType 通知类型
     * @return 通知类型
     */
    @Override
    public List<SysNoticeType> selectSysNoticeTypeList(SysNoticeType sysNoticeType)
    {
        return sysNoticeTypeMapper.selectSysNoticeTypeList(sysNoticeType);
    }

    /**
     * 新增通知类型
     * 
     * @param sysNoticeType 通知类型
     * @return 结果
     */
    @Override
    public int insertSysNoticeType(SysNoticeType sysNoticeType)
    {
//        查询通知类型中的最后一个数据
        SysNoticeType orderType = sysNoticeTypeMapper.selectLastSysNoticeType();
        if (orderType == null) {
            sysNoticeType.setNoticeType(1L);
        } else {
            sysNoticeType.setNoticeType(orderType.getNoticeType() + 1);
        }
        sysNoticeType.setCreateTime(DateUtils.getNowDate());
        return sysNoticeTypeMapper.insertSysNoticeType(sysNoticeType);
    }

    /**
     * 修改通知类型
     * 
     * @param sysNoticeType 通知类型
     * @return 结果
     */
    @Override
    public int updateSysNoticeType(SysNoticeType sysNoticeType)
    {
        return sysNoticeTypeMapper.updateSysNoticeType(sysNoticeType);
    }

    /**
     * 批量删除通知类型
     * 
     * @param noticeTypes 需要删除的通知类型主键
     * @return 结果
     */
    @Override
    public int deleteSysNoticeTypeByNoticeTypes(Long[] noticeTypes)
    {
        return sysNoticeTypeMapper.deleteSysNoticeTypeByNoticeTypes(noticeTypes);
    }

    /**
     * 删除通知类型信息
     * 
     * @param noticeType 通知类型主键
     * @return 结果
     */
    @Override
    public int deleteSysNoticeTypeByNoticeType(Long noticeType)
    {
        return sysNoticeTypeMapper.deleteSysNoticeTypeByNoticeType(noticeType);
    }
}
