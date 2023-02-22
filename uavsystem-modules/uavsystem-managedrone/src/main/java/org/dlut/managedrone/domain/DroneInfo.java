package org.dlut.managedrone.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.dlut.common.core.annotation.Excel;
import org.dlut.common.core.web.domain.BaseEntity;

/**
 * 无人机管理对象 drone_info
 *
 * @author wang
 * @date 2023-02-19
 */
public class DroneInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 无人机编号 */
    @Excel(name = "无人机编号")
    private String droneNumer;

    /** 无人机类型 */
    @Excel(name = "无人机类型")
    private String droneType;

    /** 轴距 */
    @Excel(name = "轴距")
    private String droneWheelbase;

    /** 最大起飞重量 */
    @Excel(name = "最大起飞重量")
    private Double takeoffWeight;

    /** 最大任务载荷 */
    @Excel(name = "最大任务载荷")
    private Double missionWeight;

    /** 最大飞行速度m/s */
    @Excel(name = "最大飞行速度m/s")
    private Double flySpeed;

    /** 最大飞行高度m */
    @Excel(name = "最大飞行高度m")
    private Double flyHeight;

    /** 是否损坏 */
    @Excel(name = "是否损坏")
    private Integer droneStatus;

    /** 电池mah */
    @Excel(name = "电池mah")
    private Double droneBattery;

    /** 续航时间min */
    @Excel(name = "续航时间min")
    private Double droneEndurance;

    /** 制造商 */
    @Excel(name = "制造商")
    private String droneManuf;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setDroneNumer(String droneNumer)
    {
        this.droneNumer = droneNumer;
    }

    public String getDroneNumer()
    {
        return droneNumer;
    }
    public void setDroneType(String droneType)
    {
        this.droneType = droneType;
    }

    public String getDroneType()
    {
        return droneType;
    }
    public void setDroneWheelbase(String droneWheelbase)
    {
        this.droneWheelbase = droneWheelbase;
    }

    public String getDroneWheelbase()
    {
        return droneWheelbase;
    }
    public void setTakeoffWeight(Double takeoffWeight)
    {
        this.takeoffWeight = takeoffWeight;
    }

    public Double getTakeoffWeight()
    {
        return takeoffWeight;
    }
    public void setMissionWeight(Double missionWeight)
    {
        this.missionWeight = missionWeight;
    }

    public Double getMissionWeight()
    {
        return missionWeight;
    }
    public void setFlySpeed(Double flySpeed)
    {
        this.flySpeed = flySpeed;
    }

    public Double getFlySpeed()
    {
        return flySpeed;
    }
    public void setFlyHeight(Double flyHeight)
    {
        this.flyHeight = flyHeight;
    }

    public Double getFlyHeight()
    {
        return flyHeight;
    }
    public void setDroneStatus(Integer droneStatus)
    {
        this.droneStatus = droneStatus;
    }

    public Integer getDroneStatus()
    {
        return droneStatus;
    }
    public void setDroneBattery(Double droneBattery)
    {
        this.droneBattery = droneBattery;
    }

    public Double getDroneBattery()
    {
        return droneBattery;
    }
    public void setDroneEndurance(Double droneEndurance)
    {
        this.droneEndurance = droneEndurance;
    }

    public Double getDroneEndurance()
    {
        return droneEndurance;
    }
    public void setDroneManuf(String droneManuf)
    {
        this.droneManuf = droneManuf;
    }

    public String getDroneManuf()
    {
        return droneManuf;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("droneNumer", getDroneNumer())
                .append("droneType", getDroneType())
                .append("droneWheelbase", getDroneWheelbase())
                .append("takeoffWeight", getTakeoffWeight())
                .append("missionWeight", getMissionWeight())
                .append("flySpeed", getFlySpeed())
                .append("flyHeight", getFlyHeight())
                .append("droneStatus", getDroneStatus())
                .append("droneBattery", getDroneBattery())
                .append("droneEndurance", getDroneEndurance())
                .append("droneManuf", getDroneManuf())
                .toString();
    }
}
