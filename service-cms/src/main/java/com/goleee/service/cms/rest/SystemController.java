package com.goleee.service.cms.rest;


import com.goleee.service.cms.entity.form.SettingForm;
import com.goleee.service.cms.entity.form.SystemForm;
import com.goleee.service.cms.entity.param.SettingQueryParam;
import com.goleee.service.cms.entity.param.SystemQueryParam;
import com.goleee.service.cms.entity.po.Setting;
import com.goleee.service.cms.entity.po.System;
import com.goleee.service.cms.service.ISystemService;
import com.springboot.cloud.common.core.entity.vo.Result;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Api("system")
@Slf4j
@RequestMapping("/cms/system")
public class SystemController {

    @Autowired
    private ISystemService systemService;

    @ApiOperation(value = "新增系统", notes = "新增一个系统")
    @ApiImplicitParam(name = "systemForm", value = "新增系统form表单", required = true, dataType = "SystemForm")
    @PostMapping
    public Result add(@Valid @RequestBody SystemForm systemForm) {
        log.debug("name:{}", systemForm);
        return Result.success(systemService.add(systemForm.toPo(System.class)));
    }

    @ApiOperation(value = "删除系统", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(paramType = "path", name = "id", value = "系统ID", required = true, dataType = "long")
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable String id) {
        return Result.success(systemService.delete(id));
    }

    @ApiOperation(value = "修改系统", notes = "修改指定系统信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "系统ID", required = true, dataType = "long"),
            @ApiImplicitParam(name = "settingForm", value = "系统实体", required = true, dataType = "SettingForm")
    })
    @PutMapping(value = "/{id}")
    public Result update(@PathVariable String id, @Valid @RequestBody SystemForm systemForm) {
        System system = systemForm.toPo(System.class);
        system.setId(id);
        return Result.success(systemService.update(system));
    }

    @ApiOperation(value = "获取系统", notes = "获取指定系统")
    @ApiImplicitParam(paramType = "path", name = "id", value = "系统ID", required = true, dataType = "long")
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable String id) {
        log.debug("get with id:{}", id);
        return Result.success(systemService.get(id));
    }

    @ApiOperation(value = "查询系统", notes = "根据条件查询系统信息，简单查询")
    @ApiImplicitParam(paramType = "query", name = "name", value = "系统KEY", required = true, dataType = "string")
    @ApiResponses(
            @ApiResponse(code = 200, message = "处理成功", response = Result.class)
    )
    @GetMapping
    public Result query(@RequestParam String code) {
        log.debug("query with key:{}", code);
        SystemQueryParam systemQueryParam = new SystemQueryParam();
        systemQueryParam.setCode(code);
        return Result.success(systemService.query(systemQueryParam));
    }
}
