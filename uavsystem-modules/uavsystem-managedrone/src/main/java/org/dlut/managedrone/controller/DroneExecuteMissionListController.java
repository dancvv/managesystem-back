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
import org.dlut.managedrone.domain.DroneExecuteMissionList;
import org.dlut.managedrone.service.IDroneExecuteMissionListService;
import org.dlut.common.core.web.controller.BaseController;
import org.dlut.common.core.web.domain.AjaxResult;
import org.dlut.common.core.utils.poi.ExcelUtil;
import org.dlut.common.core.web.page.TableDataInfo;

/**
 * 任务执行列表Controller
 * 
 * @author wang
 * @date 2023-02-19
 */
@RestController
@RequestMapping("/list")
public class DroneExecuteMissionListController extends BaseController
{
    @Autowired
    private IDroneExecuteMissionListService droneExecuteMissionListService;

    /**
     * 查询任务执行列表列表
     */
    @RequiresPermissions("drone_system:list:list")
    @GetMapping("/list")
    public TableDataInfo list(DroneExecuteMissionList droneExecuteMissionList)
    {
        startPage();
        List<DroneExecuteMissionList> list = droneExecuteMissionListService.selectDroneExecuteMissionListList(droneExecuteMissionList);
        return getDataTable(list);
    }

    /**
     * 导出任务执行列表列表
     */
    @RequiresPermissions("drone_system:list:export")
    @Log(title = "任务执行列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DroneExecuteMissionList droneExecuteMissionList)
    {
        List<DroneExecuteMissionList> list = droneExecuteMissionListService.selectDroneExecuteMissionListList(droneExecuteMissionList);
        ExcelUtil<DroneExecuteMissionList> util = new ExcelUtil<DroneExecuteMissionList>(DroneExecuteMissionList.class);
        util.exportExcel(response, list, "任务执行列表数据");
    }

    /**
     * 获取任务执行列表详细信息
     */
    @RequiresPermissions("drone_system:list:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(droneExecuteMissionListService.selectDroneExecuteMissionListById(id));
    }

    /**
     * 新增任务执行列表
     */
    @RequiresPermissions("drone_system:list:add")
    @Log(title = "任务执行列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DroneExecuteMissionList droneExecuteMissionList)
    {
        return toAjax(droneExecuteMissionListService.insertDroneExecuteMissionList(droneExecuteMissionList));
    }

    /**
     * 修改任务执行列表
     */
    @RequiresPermissions("drone_system:list:edit")
    @Log(title = "任务执行列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DroneExecuteMissionList droneExecuteMissionList)
    {
        return toAjax(droneExecuteMissionListService.updateDroneExecuteMissionList(droneExecuteMissionList));
    }

    /**
     * 删除任务执行列表
     */
    @RequiresPermissions("drone_system:list:remove")
    @Log(title = "任务执行列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(droneExecuteMissionListService.deleteDroneExecuteMissionListByIds(ids));
    }
}
