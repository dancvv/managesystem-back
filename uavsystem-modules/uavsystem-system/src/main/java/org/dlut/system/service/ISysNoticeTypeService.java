package org.dlut.system.service;

import java.util.List;
import org.dlut.system.domain.SysNoticeType;

/**
 * 通知类型Service接口
 * 
 * @author wang
 * @date 2023-02-20
 */
public interface ISysNoticeTypeService 
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
     * 批量删除通知类型
     * 
     * @param noticeTypes 需要删除的通知类型主键集合
     * @return 结果
     */
    public int deleteSysNoticeTypeByNoticeTypes(Long[] noticeTypes);

    /**
     * 删除通知类型信息
     * 
     * @param noticeType 通知类型主键
     * @return 结果
     */
    public int deleteSysNoticeTypeByNoticeType(Long noticeType);
}
