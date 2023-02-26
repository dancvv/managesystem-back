package org.dlut.managedrone.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.dlut.common.core.annotation.Excel;
import org.dlut.common.core.web.domain.BaseEntity;

/**
 * 传感器数据管理对象 drone_sensor_data
 * 
 * @author wang
 * @date 2023-02-27
 */
public class DroneSensorData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 数据编号 */
    private Long dataId;

    /** 传感器编号 */
    @Excel(name = "传感器编号")
    private Long sensorId;

    /** 数据类型 */
    @Excel(name = "数据类型")
    private String dataType;

    /** 数据值 */
    @Excel(name = "数据值")
    private String dataValue;

    /** 记录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recordTime;

    public void setDataId(Long dataId) 
    {
        this.dataId = dataId;
    }

    public Long getDataId() 
    {
        return dataId;
    }
    public void setSensorId(Long sensorId) 
    {
        this.sensorId = sensorId;
    }

    public Long getSensorId() 
    {
        return sensorId;
    }
    public void setDataType(String dataType) 
    {
        this.dataType = dataType;
    }

    public String getDataType() 
    {
        return dataType;
    }
    public void setDataValue(String dataValue) 
    {
        this.dataValue = dataValue;
    }

    public String getDataValue() 
    {
        return dataValue;
    }
    public void setRecordTime(Date recordTime) 
    {
        this.recordTime = recordTime;
    }

    public Date getRecordTime() 
    {
        return recordTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dataId", getDataId())
            .append("sensorId", getSensorId())
            .append("dataType", getDataType())
            .append("dataValue", getDataValue())
            .append("recordTime", getRecordTime())
            .toString();
    }
}
