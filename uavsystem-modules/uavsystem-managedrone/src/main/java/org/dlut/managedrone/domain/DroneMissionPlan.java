package org.dlut.managedrone.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.dlut.common.core.annotation.Excel;
import org.dlut.common.core.web.domain.BaseEntity;

/**
 * 任务管理对象 drone_mission_plan
 * 
 * @author wang
 * @date 2023-02-19
 */
public class DroneMissionPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 任务编号 */
    @Excel(name = "任务编号")
    private String taskNumber;

    /** 任务优先级 */
    @Excel(name = "任务优先级")
    private Long taskPriority;

    /** 经度 */
    @Excel(name = "经度")
    private BigDecimal lat;

    /** 纬度 */
    @Excel(name = "纬度")
    private BigDecimal lng;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateTime;

    /** 任务是否执行 */
    @Excel(name = "任务是否执行")
    private Integer isExecute;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setTaskNumber(String taskNumber) 
    {
        this.taskNumber = taskNumber;
    }

    public String getTaskNumber() 
    {
        return taskNumber;
    }
    public void setTaskPriority(Long taskPriority) 
    {
        this.taskPriority = taskPriority;
    }

    public Long getTaskPriority() 
    {
        return taskPriority;
    }
    public void setLat(BigDecimal lat) 
    {
        this.lat = lat;
    }

    public BigDecimal getLat() 
    {
        return lat;
    }
    public void setLng(BigDecimal lng) 
    {
        this.lng = lng;
    }

    public BigDecimal getLng() 
    {
        return lng;
    }
    public void setDateTime(Date dateTime) 
    {
        this.dateTime = dateTime;
    }

    public Date getDateTime() 
    {
        return dateTime;
    }
    public void setIsExecute(Integer isExecute) 
    {
        this.isExecute = isExecute;
    }

    public Integer getIsExecute() 
    {
        return isExecute;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("taskNumber", getTaskNumber())
            .append("taskPriority", getTaskPriority())
            .append("lat", getLat())
            .append("lng", getLng())
            .append("dateTime", getDateTime())
            .append("isExecute", getIsExecute())
            .toString();
    }
}
