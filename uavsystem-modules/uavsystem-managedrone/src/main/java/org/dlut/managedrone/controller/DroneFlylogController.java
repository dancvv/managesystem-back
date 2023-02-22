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
import org.dlut.managedrone.domain.DroneFlylog;
import org.dlut.managedrone.service.IDroneFlylogService;
import org.dlut.common.core.web.controller.BaseController;
import org.dlut.common.core.web.domain.AjaxResult;
import org.dlut.common.core.utils.poi.ExcelUtil;
import org.dlut.common.core.web.page.TableDataInfo;

/**
 * 飞行日志Controller
 * 
 * @author wang
 * @date 2023-02-19
 */
@RestController
@RequestMapping("/flylog")
public class DroneFlylogController extends BaseController
{
    @Autowired
    private IDroneFlylogService droneFlylogService;

    /**
     * 查询飞行日志列表
     */
    @RequiresPermissions("drone_system:flylog:list")
    @GetMapping("/list")
    public TableDataInfo list(DroneFlylog droneFlylog)
    {
        startPage();
        List<DroneFlylog> list = droneFlylogService.selectDroneFlylogList(droneFlylog);
        return getDataTable(list);
    }

    /**
     * 导出飞行日志列表
     */
    @RequiresPermissions("drone_system:flylog:export")
    @Log(title = "飞行日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DroneFlylog droneFlylog)
    {
        List<DroneFlylog> list = droneFlylogService.selectDroneFlylogList(droneFlylog);
        ExcelUtil<DroneFlylog> util = new ExcelUtil<DroneFlylog>(DroneFlylog.class);
        util.exportExcel(response, list, "飞行日志数据");
    }

    /**
     * 获取飞行日志详细信息
     */
    @RequiresPermissions("drone_system:flylog:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(droneFlylogService.selectDroneFlylogById(id));
    }

    /**
     * 新增飞行日志
     */
    @RequiresPermissions("drone_system:flylog:add")
    @Log(title = "飞行日志", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DroneFlylog droneFlylog)
    {
        return toAjax(droneFlylogService.insertDroneFlylog(droneFlylog));
    }

    /**
     * 修改飞行日志
     */
    @RequiresPermissions("drone_system:flylog:edit")
    @Log(title = "飞行日志", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DroneFlylog droneFlylog)
    {
        return toAjax(droneFlylogService.updateDroneFlylog(droneFlylog));
    }

    /**
     * 删除飞行日志
     */
    @RequiresPermissions("drone_system:flylog:remove")
    @Log(title = "飞行日志", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(droneFlylogService.deleteDroneFlylogByIds(ids));
    }
}
