package org.dlut.managedrone.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.dlut.common.core.annotation.Excel;
import org.dlut.common.core.web.domain.BaseEntity;

/**
 * 任务分配对象 drone_mission_assignment
 * 
 * @author wang
 * @date 2023-02-19
 */
public class DroneMissionAssignment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 任务编号 */
    @Excel(name = "任务编号")
    private String taskNumber;

    /** 任务执行无人机 */
    @Excel(name = "任务执行无人机")
    private String assignmentDrone;

    /** 实时优先级 */
    @Excel(name = "实时优先级")
    private Long realtimePriority;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date dateTime;

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
    public void setAssignmentDrone(String assignmentDrone) 
    {
        this.assignmentDrone = assignmentDrone;
    }

    public String getAssignmentDrone() 
    {
        return assignmentDrone;
    }
    public void setRealtimePriority(Long realtimePriority) 
    {
        this.realtimePriority = realtimePriority;
    }

    public Long getRealtimePriority() 
    {
        return realtimePriority;
    }
    public void setDateTime(Date dateTime) 
    {
        this.dateTime = dateTime;
    }

    public Date getDateTime() 
    {
        return dateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("taskNumber", getTaskNumber())
            .append("assignmentDrone", getAssignmentDrone())
            .append("realtimePriority", getRealtimePriority())
            .append("dateTime", getDateTime())
            .toString();
    }
}
