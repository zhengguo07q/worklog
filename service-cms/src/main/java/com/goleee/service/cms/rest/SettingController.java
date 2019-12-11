package com.goleee.service.cms.rest;


import com.goleee.service.cms.entity.form.SettingForm;
import com.goleee.service.cms.entity.param.SettingQueryParam;
import com.goleee.service.cms.entity.po.Setting;
import com.goleee.service.cms.service.ISettingService;
import com.springboot.cloud.common.core.entity.vo.Result;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Api("setting")
@Slf4j
@RequestMapping("/cms/setting")
public class SettingController {

    @Autowired
    private ISettingService settingService;

    @ApiOperation(value = "新增设置", notes = "新增一个设置")
    @ApiImplicitParam(name = "settingForm", value = "新增设置form表单", required = true, dataType = "SettingForm")
    @PostMapping
    public Result add(@Valid @RequestBody SettingForm settingForm) {
        log.debug("name:{}", settingForm);
        return Result.success(settingService.add(settingForm.toPo(Setting.class)));
    }

    @ApiOperation(value = "删除设置", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(paramType = "path", name = "id", value = "设置ID", required = true, dataType = "long")
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable String id) {
        return Result.success(settingService.delete(id));
    }

    @ApiOperation(value = "修改设置", notes = "修改指定设置信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "设置ID", required = true, dataType = "long"),
            @ApiImplicitParam(name = "settingForm", value = "设置实体", required = true, dataType = "SettingForm")
    })
    @PutMapping(value = "/{id}")
    public Result update(@PathVariable String id, @Valid @RequestBody SettingForm settingForm) {
        Setting setting = settingForm.toPo(Setting.class);
        setting.setId(id);
        return Result.success(settingService.update(setting));
    }

    @ApiOperation(value = "获取设置", notes = "获取指定设置")
    @ApiImplicitParam(paramType = "path", name = "id", value = "设置ID", required = true, dataType = "long")
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable String id) {
        log.debug("get with id:{}", id);
        return Result.success(settingService.get(id));
    }

    @ApiOperation(value = "查询设置", notes = "根据条件查询设置信息，简单查询")
    @ApiImplicitParam(paramType = "query", name = "name", value = "设置KEY", required = true, dataType = "string")
    @ApiResponses(
            @ApiResponse(code = 200, message = "处理成功", response = Result.class)
    )
    @GetMapping
    public Result query(@RequestParam String key) {
        log.debug("query with key:{}", key);
        SettingQueryParam settingQueryParam = new SettingQueryParam();
        settingQueryParam.setKey(key);
        return Result.success(settingService.query(settingQueryParam));
    }
}
