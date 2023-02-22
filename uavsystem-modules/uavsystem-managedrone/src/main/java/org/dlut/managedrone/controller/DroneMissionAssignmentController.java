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
import org.dlut.managedrone.domain.DroneMissionAssignment;
import org.dlut.managedrone.service.IDroneMissionAssignmentService;
import org.dlut.common.core.web.controller.BaseController;
import org.dlut.common.core.web.domain.AjaxResult;
import org.dlut.common.core.utils.poi.ExcelUtil;
import org.dlut.common.core.web.page.TableDataInfo;

/**
 * 任务分配Controller
 * 
 * @author wang
 * @date 2023-02-19
 */
@RestController
@RequestMapping("/assignment")
public class DroneMissionAssignmentController extends BaseController
{
    @Autowired
    private IDroneMissionAssignmentService droneMissionAssignmentService;

    /**
     * 查询任务分配列表
     */
    @RequiresPermissions("drone_system:assignment:list")
    @GetMapping("/list")
    public TableDataInfo list(DroneMissionAssignment droneMissionAssignment)
    {
        startPage();
        List<DroneMissionAssignment> list = droneMissionAssignmentService.selectDroneMissionAssignmentList(droneMissionAssignment);
        return getDataTable(list);
    }

    /**
     * 导出任务分配列表
     */
    @RequiresPermissions("drone_system:assignment:export")
    @Log(title = "任务分配", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DroneMissionAssignment droneMissionAssignment)
    {
        List<DroneMissionAssignment> list = droneMissionAssignmentService.selectDroneMissionAssignmentList(droneMissionAssignment);
        ExcelUtil<DroneMissionAssignment> util = new ExcelUtil<DroneMissionAssignment>(DroneMissionAssignment.class);
        util.exportExcel(response, list, "任务分配数据");
    }

    /**
     * 获取任务分配详细信息
     */
    @RequiresPermissions("drone_system:assignment:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(droneMissionAssignmentService.selectDroneMissionAssignmentById(id));
    }

    /**
     * 新增任务分配
     */
    @RequiresPermissions("drone_system:assignment:add")
    @Log(title = "任务分配", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DroneMissionAssignment droneMissionAssignment)
    {
        return toAjax(droneMissionAssignmentService.insertDroneMissionAssignment(droneMissionAssignment));
    }

    /**
     * 修改任务分配
     */
    @RequiresPermissions("drone_system:assignment:edit")
    @Log(title = "任务分配", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DroneMissionAssignment droneMissionAssignment)
    {
        return toAjax(droneMissionAssignmentService.updateDroneMissionAssignment(droneMissionAssignment));
    }

    /**
     * 删除任务分配
     */
    @RequiresPermissions("drone_system:assignment:remove")
    @Log(title = "任务分配", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(droneMissionAssignmentService.deleteDroneMissionAssignmentByIds(ids));
    }
}
