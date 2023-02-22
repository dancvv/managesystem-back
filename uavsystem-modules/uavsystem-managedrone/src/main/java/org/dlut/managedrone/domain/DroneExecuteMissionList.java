package org.dlut.managedrone.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.dlut.common.core.annotation.Excel;
import org.dlut.common.core.web.domain.BaseEntity;

/**
 * 任务执行列表对象 drone_execute_mission_list
 * 
 * @author wang
 * @date 2023-02-19
 */
public class DroneExecuteMissionList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id值 */
    private String id;

    /** 执行无人机编号 */
    @Excel(name = "执行无人机编号")
    private String assignmentDrone;

    /** 任务执行编号 */
    @Excel(name = "任务执行编号")
    private String droneExecuteNumber;

    /** 路线列表 */
    @Excel(name = "路线列表")
    private String missionList;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateTime;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setAssignmentDrone(String assignmentDrone) 
    {
        this.assignmentDrone = assignmentDrone;
    }

    public String getAssignmentDrone() 
    {
        return assignmentDrone;
    }
    public void setDroneExecuteNumber(String droneExecuteNumber) 
    {
        this.droneExecuteNumber = droneExecuteNumber;
    }

    public String getDroneExecuteNumber() 
    {
        return droneExecuteNumber;
    }
    public void setMissionList(String missionList) 
    {
        this.missionList = missionList;
    }

    public String getMissionList() 
    {
        return missionList;
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
            .append("assignmentDrone", getAssignmentDrone())
            .append("droneExecuteNumber", getDroneExecuteNumber())
            .append("missionList", getMissionList())
            .append("dateTime", getDateTime())
            .toString();
    }
}
