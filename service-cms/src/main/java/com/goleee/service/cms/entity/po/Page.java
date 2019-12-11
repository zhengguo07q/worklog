package com.goleee.service.cms.entity.po;

import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Page extends BasePo {

    /**
     * 父页面
     */
    private String parentId;

    /**
     * 标题
     */
    private String title;

    /**
     * 别名
     */
    private String alias;

    /**
     * 页面内容
     */
    private String content;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 描述
     */
    private String description;

    /**
     * 排序
     */
    private Long order;
}
