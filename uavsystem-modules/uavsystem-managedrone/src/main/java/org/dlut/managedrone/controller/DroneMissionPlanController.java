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
import org.dlut.managedrone.domain.DroneMissionPlan;
import org.dlut.managedrone.service.IDroneMissionPlanService;
import org.dlut.common.core.web.controller.BaseController;
import org.dlut.common.core.web.domain.AjaxResult;
import org.dlut.common.core.utils.poi.ExcelUtil;
import org.dlut.common.core.web.page.TableDataInfo;

/**
 * 任务管理Controller
 * 
 * @author wang
 * @date 2023-02-19
 */
@RestController
@RequestMapping("/plan")
public class DroneMissionPlanController extends BaseController
{
    @Autowired
    private IDroneMissionPlanService droneMissionPlanService;

    /**
     * 查询任务管理列表
     */
    @RequiresPermissions("drone_system:plan:list")
    @GetMapping("/list")
    public TableDataInfo list(DroneMissionPlan droneMissionPlan)
    {
        startPage();
        List<DroneMissionPlan> list = droneMissionPlanService.selectDroneMissionPlanList(droneMissionPlan);
        return getDataTable(list);
    }

    /**
     * 导出任务管理列表
     */
    @RequiresPermissions("drone_system:plan:export")
    @Log(title = "任务管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DroneMissionPlan droneMissionPlan)
    {
        List<DroneMissionPlan> list = droneMissionPlanService.selectDroneMissionPlanList(droneMissionPlan);
        ExcelUtil<DroneMissionPlan> util = new ExcelUtil<DroneMissionPlan>(DroneMissionPlan.class);
        util.exportExcel(response, list, "任务管理数据");
    }

    /**
     * 获取任务管理详细信息
     */
    @RequiresPermissions("drone_system:plan:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(droneMissionPlanService.selectDroneMissionPlanById(id));
    }

    /**
     * 新增任务管理
     */
    @RequiresPermissions("drone_system:plan:add")
    @Log(title = "任务管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DroneMissionPlan droneMissionPlan)
    {
        return toAjax(droneMissionPlanService.insertDroneMissionPlan(droneMissionPlan));
    }

    /**
     * 修改任务管理
     */
    @RequiresPermissions("drone_system:plan:edit")
    @Log(title = "任务管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DroneMissionPlan droneMissionPlan)
    {
        return toAjax(droneMissionPlanService.updateDroneMissionPlan(droneMissionPlan));
    }

    /**
     * 删除任务管理
     */
    @RequiresPermissions("drone_system:plan:remove")
    @Log(title = "任务管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(droneMissionPlanService.deleteDroneMissionPlanByIds(ids));
    }
}
