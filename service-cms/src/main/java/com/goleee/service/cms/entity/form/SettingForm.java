package com.goleee.service.cms.entity.form;

import com.goleee.service.cms.entity.po.Setting;
import com.springboot.cloud.common.web.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@ApiModel
@Data
public class SettingForm extends BaseForm<Setting> {
    @NotNull(message = "设置key不能为NULL")
    @ApiModelProperty("CMS设置Key")
    private String key;

    @NotNull(message = "设置message不能为NULL")
    @ApiModelProperty("CMS设置Value")
    private String value;
}
