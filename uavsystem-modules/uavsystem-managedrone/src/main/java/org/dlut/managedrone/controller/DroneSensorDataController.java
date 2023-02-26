package org.dlut.managedrone.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.dlut.common.log.annotation.Log;
import org.dlut.common.log.enums.BusinessType;
import org.dlut.common.security.annotation.RequiresPermissions;
import org.dlut.managedrone.domain.DroneSensorData;
import org.dlut.managedrone.service.IDroneSensorDataService;
import org.dlut.common.core.web.controller.BaseController;
import org.dlut.common.core.web.domain.AjaxResult;
import org.dlut.common.core.utils.poi.ExcelUtil;
import org.dlut.common.core.web.page.TableDataInfo;

/**
 * 传感器数据管理Controller
 * 
 * @author wang
 * @date 2023-02-27
 */
@RestController
@RequestMapping("/sensor_data")
public class DroneSensorDataController extends BaseController
{
    @Autowired
    private IDroneSensorDataService droneSensorDataService;

    /**
     * 查询传感器数据管理列表
     */
    @RequiresPermissions("drone_system:sensor_data:list")
    @GetMapping("/list")
    public TableDataInfo list(DroneSensorData droneSensorData)
    {
        startPage();
        List<DroneSensorData> list = droneSensorDataService.selectDroneSensorDataList(droneSensorData);
        return getDataTable(list);
    }

    /**
     * 导出传感器数据管理列表
     */
    @RequiresPermissions("drone_system:sensor_data:export")
    @Log(title = "传感器数据管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DroneSensorData droneSensorData)
    {
        List<DroneSensorData> list = droneSensorDataService.selectDroneSensorDataList(droneSensorData);
        ExcelUtil<DroneSensorData> util = new ExcelUtil<DroneSensorData>(DroneSensorData.class);
        util.exportExcel(response, list, "传感器数据管理数据");
    }

    /**
     * 获取传感器数据管理详细信息
     */
    @RequiresPermissions("drone_system:sensor_data:query")
    @GetMapping(value = "/{dataId}")
    public AjaxResult getInfo(@PathVariable("dataId") Long dataId)
    {
        return success(droneSensorDataService.selectDroneSensorDataByDataId(dataId));
    }

    /**
     * 新增传感器数据管理
     */
    @RequiresPermissions("drone_system:sensor_data:add")
    @Log(title = "传感器数据管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DroneSensorData droneSensorData)
    {
        return toAjax(droneSensorDataService.insertDroneSensorData(droneSensorData));
    }

    /**
     * 修改传感器数据管理
     */
    @RequiresPermissions("drone_system:sensor_data:edit")
    @Log(title = "传感器数据管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DroneSensorData droneSensorData)
    {
        return toAjax(droneSensorDataService.updateDroneSensorData(droneSensorData));
    }

    /**
     * 删除传感器数据管理
     */
    @RequiresPermissions("drone_system:sensor_data:remove")
    @Log(title = "传感器数据管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{dataIds}")
    public AjaxResult remove(@PathVariable Long[] dataIds)
    {
        return toAjax(droneSensorDataService.deleteDroneSensorDataByDataIds(dataIds));
    }
}
