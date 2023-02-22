package org.dlut.managedrone.controller;

import java.util.List;
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
import org.dlut.managedrone.domain.DroneInfo;
import org.dlut.managedrone.service.IDroneInfoService;
import org.dlut.common.core.web.controller.BaseController;
import org.dlut.common.core.web.domain.AjaxResult;
import org.dlut.common.core.utils.poi.ExcelUtil;
import org.dlut.common.core.web.page.TableDataInfo;

/**
 * 无人机管理Controller
 * 
 * @author wang
 * @date 2023-02-19
 */
@RestController
@RequestMapping("/info")
public class DroneInfoController extends BaseController
{
    @Autowired
    private IDroneInfoService droneInfoService;

    /**
     * 查询无人机管理列表
     */
    @RequiresPermissions("drone_system:info:list")
    @GetMapping("/list")
    public TableDataInfo list(DroneInfo droneInfo)
    {
        startPage();
        List<DroneInfo> list = droneInfoService.selectDroneInfoList(droneInfo);
        return getDataTable(list);
    }

    /**
     * 导出无人机管理列表
     */
    @RequiresPermissions("drone_system:info:export")
    @Log(title = "无人机管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DroneInfo droneInfo)
    {
        List<DroneInfo> list = droneInfoService.selectDroneInfoList(droneInfo);
        ExcelUtil<DroneInfo> util = new ExcelUtil<DroneInfo>(DroneInfo.class);
        util.exportExcel(response, list, "无人机管理数据");
    }

    /**
     * 获取无人机管理详细信息
     */
    @RequiresPermissions("drone_system:info:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(droneInfoService.selectDroneInfoById(id));
    }

    /**
     * 新增无人机管理
     */
    @RequiresPermissions("drone_system:info:add")
    @Log(title = "无人机管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DroneInfo droneInfo)
    {
        return toAjax(droneInfoService.insertDroneInfo(droneInfo));
    }

    /**
     * 修改无人机管理
     */
    @RequiresPermissions("drone_system:info:edit")
    @Log(title = "无人机管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DroneInfo droneInfo)
    {
        return toAjax(droneInfoService.updateDroneInfo(droneInfo));
    }

    /**
     * 删除无人机管理
     */
    @RequiresPermissions("drone_system:info:remove")
    @Log(title = "无人机管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(droneInfoService.deleteDroneInfoByIds(ids));
    }
}
