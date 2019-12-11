package com.goleee.service.cms.entity.po;

import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Category extends BasePo {
    /**
     * 上级编号
     */
    private String parentId;

    /**
     * 层级
     */
    private Integer level;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 图标
     */
    private String icon;

    /**
     * 类型(1:普通,2:热门...)
     */
    private Integer type;

    /**
     * 别名
     */
    private String alias;

    /**
     * 排序
     */
    private Long order;

    /**
     * 系统id
     */
    private String systemId;
}
