package com.goleee.service.cms.entity.po;

import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class System extends BasePo {
    /**
     * 系统名称
     */
    private String name;

    /**
     * 别名
     */
    private String code;

    /**
     * 描述
     */
    private String description;

    /**
     * 排序
     */
    private Long orders;
}
