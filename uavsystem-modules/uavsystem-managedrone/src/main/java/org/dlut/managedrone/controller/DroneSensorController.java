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
import org.dlut.managedrone.domain.DroneSensor;
import org.dlut.managedrone.service.IDroneSensorService;
import org.dlut.common.core.web.controller.BaseController;
import org.dlut.common.core.web.domain.AjaxResult;
import org.dlut.common.core.utils.poi.ExcelUtil;
import org.dlut.common.core.web.page.TableDataInfo;

/**
 * 传感器管理Controller
 * 
 * @author wang
 * @date 2023-02-27
 */
@RestController
@RequestMapping("/sensor")
public class DroneSensorController extends BaseController
{
    @Autowired
    private IDroneSensorService droneSensorService;

    /**
     * 查询传感器管理列表
     */
    @RequiresPermissions("drone_system:sensor:list")
    @GetMapping("/list")
    public TableDataInfo list(DroneSensor droneSensor)
    {
        startPage();
        List<DroneSensor> list = droneSensorService.selectDroneSensorList(droneSensor);
        return getDataTable(list);
    }

    /**
     * 导出传感器管理列表
     */
    @RequiresPermissions("drone_system:sensor:export")
    @Log(title = "传感器管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DroneSensor droneSensor)
    {
        List<DroneSensor> list = droneSensorService.selectDroneSensorList(droneSensor);
        ExcelUtil<DroneSensor> util = new ExcelUtil<DroneSensor>(DroneSensor.class);
        util.exportExcel(response, list, "传感器管理数据");
    }

    /**
     * 获取传感器管理详细信息
     */
    @RequiresPermissions("drone_system:sensor:query")
    @GetMapping(value = "/{sensorId}")
    public AjaxResult getInfo(@PathVariable("sensorId") Long sensorId)
    {
        return success(droneSensorService.selectDroneSensorBySensorId(sensorId));
    }

    /**
     * 新增传感器管理
     */
    @RequiresPermissions("drone_system:sensor:add")
    @Log(title = "传感器管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DroneSensor droneSensor)
    {
        return toAjax(droneSensorService.insertDroneSensor(droneSensor));
    }

    /**
     * 修改传感器管理
     */
    @RequiresPermissions("drone_system:sensor:edit")
    @Log(title = "传感器管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DroneSensor droneSensor)
    {
        return toAjax(droneSensorService.updateDroneSensor(droneSensor));
    }

    /**
     * 删除传感器管理
     */
    @RequiresPermissions("drone_system:sensor:remove")
    @Log(title = "传感器管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sensorIds}")
    public AjaxResult remove(@PathVariable Long[] sensorIds)
    {
        return toAjax(droneSensorService.deleteDroneSensorBySensorIds(sensorIds));
    }
}
