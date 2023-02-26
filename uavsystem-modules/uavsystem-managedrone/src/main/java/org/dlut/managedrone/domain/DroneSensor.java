package org.dlut.managedrone.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.dlut.common.core.annotation.Excel;
import org.dlut.common.core.web.domain.BaseEntity;

/**
 * 传感器管理对象 drone_sensor
 * 
 * @author wang
 * @date 2023-02-27
 */
public class DroneSensor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 传感器编号 */
    private Long sensorId;

    /** 传感器类型 */
    @Excel(name = "传感器类型")
    private String sensorType;

    /** 传感器参数 */
    @Excel(name = "传感器参数")
    private String sensorParam;

    public void setSensorId(Long sensorId) 
    {
        this.sensorId = sensorId;
    }

    public Long getSensorId() 
    {
        return sensorId;
    }
    public void setSensorType(String sensorType) 
    {
        this.sensorType = sensorType;
    }

    public String getSensorType() 
    {
        return sensorType;
    }
    public void setSensorParam(String sensorParam) 
    {
        this.sensorParam = sensorParam;
    }

    public String getSensorParam() 
    {
        return sensorParam;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sensorId", getSensorId())
            .append("sensorType", getSensorType())
            .append("sensorParam", getSensorParam())
            .toString();
    }
}
