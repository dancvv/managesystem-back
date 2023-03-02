package org.dlut.managedrone.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import org.dlut.managedrone.domain.DroneFileInfo;
import org.dlut.managedrone.service.IDroneFileInfoService;
import org.dlut.common.core.web.controller.BaseController;
import org.dlut.common.core.web.domain.AjaxResult;
import org.dlut.common.core.utils.poi.ExcelUtil;
import org.dlut.common.core.web.page.TableDataInfo;

/**
 * 文件信息Controller
 * 
 * @author wang
 * @date 2023-03-01
 */
@RestController
@RequestMapping("/fileinfo")
public class DroneFileInfoController extends BaseController
{
    @Autowired
    private IDroneFileInfoService droneFileInfoService;

    /**
     * 查询文件信息列表
     */
    @RequiresPermissions("file_manage:info:list")
    @GetMapping("/list")
    public TableDataInfo list(DroneFileInfo droneFileInfo)
    {
        startPage();
        List<DroneFileInfo> list = droneFileInfoService.selectDroneFileInfoList(droneFileInfo);
        return getDataTable(list);
    }

    /**
     * 导出文件信息列表
     */
    @RequiresPermissions("file_manage:info:export")
    @Log(title = "文件信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DroneFileInfo droneFileInfo)
    {
        List<DroneFileInfo> list = droneFileInfoService.selectDroneFileInfoList(droneFileInfo);
        ExcelUtil<DroneFileInfo> util = new ExcelUtil<DroneFileInfo>(DroneFileInfo.class);
        util.exportExcel(response, list, "文件信息数据");
    }

    /**
     * 获取文件信息详细信息
     */
    @RequiresPermissions("file_manage:info:query")
    @GetMapping(value = "/{fileId}")
    public AjaxResult getInfo(@PathVariable("fileId") Long fileId)
    {
        return success(droneFileInfoService.selectDroneFileInfoByFileId(fileId));
    }

    /**
     * 新增文件信息
     */
    @RequiresPermissions("file_manage:info:add")
    @Log(title = "文件信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DroneFileInfo droneFileInfo)
    {
//        获取当前具体时间，年月日时分秒
        Date date = new Date();
        System.out.println(date);
        droneFileInfo.setUploadTime(date);
        return toAjax(droneFileInfoService.insertDroneFileInfo(droneFileInfo));
    }

    /**
     * 修改文件信息
     */
    @RequiresPermissions("file_manage:info:edit")
    @Log(title = "文件信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DroneFileInfo droneFileInfo)
    {
        return toAjax(droneFileInfoService.updateDroneFileInfo(droneFileInfo));
    }

    /**
     * 删除文件信息
     */
    @RequiresPermissions("file_manage:info:remove")
    @Log(title = "文件信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{fileIds}")
    public AjaxResult remove(@PathVariable Long[] fileIds)
    {
        return toAjax(droneFileInfoService.deleteDroneFileInfoByFileIds(fileIds));
    }
}
