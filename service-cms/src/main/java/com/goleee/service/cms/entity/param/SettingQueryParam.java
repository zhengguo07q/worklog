package com.goleee.service.cms.entity.param;

import com.goleee.service.cms.entity.po.Setting;
import com.springboot.cloud.common.web.entity.param.BaseParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SettingQueryParam extends BaseParam<Setting> {
    private String key;
}