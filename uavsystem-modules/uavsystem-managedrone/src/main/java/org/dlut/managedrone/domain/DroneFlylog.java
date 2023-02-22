package org.dlut.managedrone.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.dlut.common.core.annotation.Excel;
import org.dlut.common.core.web.domain.BaseEntity;

/**
 * 飞行日志对象 drone_flylog
 * 
 * @author wang
 * @date 2023-02-19
 */
public class DroneFlylog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 无人机编号 */
    @Excel(name = "无人机编号")
    private String droneNumber;

    /** 是否飞行 */
    @Excel(name = "是否飞行")
    private Integer inAir;

    /** 经度 */
    @Excel(name = "经度")
    private BigDecimal lat;

    /** 纬度 */
    @Excel(name = "纬度")
    private BigDecimal lng;

    /** 电池容量 */
    @Excel(name = "电池容量")
    private Long battery;

    /** 飞行模式 */
    @Excel(name = "飞行模式")
    private String flightMode;

    /** 是否上电 */
    @Excel(name = "是否上电")
    private Integer isArmed;

    /** 执行时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "执行时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date datetime;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setDroneNumber(String droneNumber) 
    {
        this.droneNumber = droneNumber;
    }

    public String getDroneNumber() 
    {
        return droneNumber;
    }
    public void setInAir(Integer inAir) 
    {
        this.inAir = inAir;
    }

    public Integer getInAir() 
    {
        return inAir;
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
    public void setBattery(Long battery) 
    {
        this.battery = battery;
    }

    public Long getBattery() 
    {
        return battery;
    }
    public void setFlightMode(String flightMode) 
    {
        this.flightMode = flightMode;
    }

    public String getFlightMode() 
    {
        return flightMode;
    }
    public void setIsArmed(Integer isArmed) 
    {
        this.isArmed = isArmed;
    }

    public Integer getIsArmed() 
    {
        return isArmed;
    }
    public void setDatetime(Date datetime) 
    {
        this.datetime = datetime;
    }

    public Date getDatetime() 
    {
        return datetime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("droneNumber", getDroneNumber())
            .append("inAir", getInAir())
            .append("lat", getLat())
            .append("lng", getLng())
            .append("battery", getBattery())
            .append("flightMode", getFlightMode())
            .append("isArmed", getIsArmed())
            .append("datetime", getDatetime())
            .toString();
    }
}
