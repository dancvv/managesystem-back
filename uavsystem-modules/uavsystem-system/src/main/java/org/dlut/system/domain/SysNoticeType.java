package org.dlut.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.dlut.common.core.annotation.Excel;
import org.dlut.common.core.web.domain.BaseEntity;

/**
 * 通知类型对象 sys_notice_type
 * 
 * @author wang
 * @date 2023-02-20
 */
public class SysNoticeType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 通知类型 */
    @Excel(name = "通知类型")
    private Long noticeType;

    /** 通知名字 */
    @Excel(name = "通知名字")
    private String noticeName;

    /** 创建者 */
    @Excel(name = "创建者")
    private String createdBy;

    public void setNoticeType(Long noticeType) 
    {
        this.noticeType = noticeType;
    }

    public Long getNoticeType() 
    {
        return noticeType;
    }
    public void setNoticeName(String noticeName) 
    {
        this.noticeName = noticeName;
    }

    public String getNoticeName() 
    {
        return noticeName;
    }
    public void setCreatedBy(String createdBy) 
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() 
    {
        return createdBy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("noticeType", getNoticeType())
            .append("noticeName", getNoticeName())
            .append("createdBy", getCreatedBy())
            .append("createTime", getCreateTime())
            .append("remark", getRemark())
            .toString();
    }
}
