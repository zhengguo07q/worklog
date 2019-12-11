package com.goleee.service.cms.entity.form;

import com.goleee.service.cms.entity.po.Setting;
import com.goleee.service.cms.entity.po.System;
import com.springboot.cloud.common.web.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@ApiModel
@Data
public class SystemForm extends BaseForm<System> {
    @NotNull(message = "系统名字不能为NULL")
    @ApiModelProperty("系统名字")
    private String name;

    @NotNull(message = "系统别名不能为NULL")
    @ApiModelProperty("系统别名")
    private String code;

    @ApiModelProperty("系统描述")
    private String description;

    @NotNull(message = "系统排序不能为NULL")
    @ApiModelProperty("系统排序")
    private Long orders;
}
