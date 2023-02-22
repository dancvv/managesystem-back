package org.dlut.system.controller;

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
import org.dlut.system.domain.SysNoticeType;
import org.dlut.system.service.ISysNoticeTypeService;
import org.dlut.common.core.web.controller.BaseController;
import org.dlut.common.core.web.domain.AjaxResult;
import org.dlut.common.core.utils.poi.ExcelUtil;
import org.dlut.common.core.web.page.TableDataInfo;

/**
 * 通知类型Controller
 * 
 * @author wang
 * @date 2023-02-20
 */
@RestController
@RequestMapping("/notice_type")
public class SysNoticeTypeController extends BaseController
{
    @Autowired
    private ISysNoticeTypeService sysNoticeTypeService;

    /**
     * 查询通知类型列表
     */
    @RequiresPermissions("system:notice_type:list")
    @GetMapping("/list")
    public TableDataInfo list(SysNoticeType sysNoticeType)
    {
        startPage();
        List<SysNoticeType> list = sysNoticeTypeService.selectSysNoticeTypeList(sysNoticeType);
        return getDataTable(list);
    }

    /**
     * 导出通知类型列表
     */
    @RequiresPermissions("system:notice_type:export")
    @Log(title = "通知类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysNoticeType sysNoticeType)
    {
        List<SysNoticeType> list = sysNoticeTypeService.selectSysNoticeTypeList(sysNoticeType);
        ExcelUtil<SysNoticeType> util = new ExcelUtil<SysNoticeType>(SysNoticeType.class);
        util.exportExcel(response, list, "通知类型数据");
    }

    /**
     * 获取通知类型详细信息
     */
    @RequiresPermissions("system:notice_type:query")
    @GetMapping(value = "/{noticeType}")
    public AjaxResult getInfo(@PathVariable("noticeType") Long noticeType)
    {
        return success(sysNoticeTypeService.selectSysNoticeTypeByNoticeType(noticeType));
    }

    /**
     * 新增通知类型
     */
    @RequiresPermissions("system:notice_type:add")
    @Log(title = "通知类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysNoticeType sysNoticeType)
    {
        return toAjax(sysNoticeTypeService.insertSysNoticeType(sysNoticeType));
    }

    /**
     * 修改通知类型
     */
    @RequiresPermissions("system:notice_type:edit")
    @Log(title = "通知类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysNoticeType sysNoticeType)
    {
        return toAjax(sysNoticeTypeService.updateSysNoticeType(sysNoticeType));
    }

    /**
     * 删除通知类型
     */
    @RequiresPermissions("system:notice_type:remove")
    @Log(title = "通知类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{noticeTypes}")
    public AjaxResult remove(@PathVariable Long[] noticeTypes)
    {
        return toAjax(sysNoticeTypeService.deleteSysNoticeTypeByNoticeTypes(noticeTypes));
    }
}
