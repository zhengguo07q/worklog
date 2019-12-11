package com.goleee.service.cms.entity.param;

import com.goleee.service.cms.entity.po.Setting;
import com.goleee.service.cms.entity.po.System;
import com.springboot.cloud.common.web.entity.param.BaseParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemQueryParam extends BaseParam<System> {
    private String name;
    private String code;
}