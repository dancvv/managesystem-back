package org.dlut.system.mapper;

import java.util.List;
import org.dlut.system.domain.SysNoticeType;

/**
 * 通知类型Mapper接口
 * 
 * @author wang
 * @date 2023-02-20
 */
public interface SysNoticeTypeMapper 
{
    /**
     * 查询通知类型
     * 
     * @param noticeType 通知类型主键
     * @return 通知类型
     */
    public SysNoticeType selectSysNoticeTypeByNoticeType(Long noticeType);

    /**
     * 查询通知类型列表
     * 
     * @param sysNoticeType 通知类型
     * @return 通知类型集合
     */
    public List<SysNoticeType> selectSysNoticeTypeList(SysNoticeType sysNoticeType);

    /**
     * 新增通知类型
     * 
     * @param sysNoticeType 通知类型
     * @return 结果
     */
    public int insertSysNoticeType(SysNoticeType sysNoticeType);

    /**
     * 修改通知类型
     * 
     * @param sysNoticeType 通知类型
     * @return 结果
     */
    public int updateSysNoticeType(SysNoticeType sysNoticeType);

    /**
     * 删除通知类型
     * 
     * @param noticeType 通知类型主键
     * @return 结果
     */
    public int deleteSysNoticeTypeByNoticeType(Long noticeType);

    /**
     * 批量删除通知类型
     * 
     * @param noticeTypes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysNoticeTypeByNoticeTypes(Long[] noticeTypes);

    /**
     * 查询通知类型中的最后一个数据
     * @return
     */
    SysNoticeType selectLastSysNoticeType();
}
