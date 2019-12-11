package com.goleee.service.cms.entity.po;

import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Article extends BasePo {
    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章原作者
     */
    private String author;

    /**
     * 转载来源网址
     */
    private String fromurl;

    /**
     * 封面图
     */
    private String image;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 简介
     */
    private String description;

    /**
     * 类型(1:普通,2:热门...)
     */
    private Integer type;

    /**
     * 是否允许评论(0:不允许,1:允许)
     */
    private Integer allowcomments;

    /**
     * 状态(-1:不通过,0未审核,1:通过)
     */
    private Integer status;

    /**
     * 内容
     */
    private String content;

    /**
     * 阅读数量
     */
    private Integer readnumber;

    /**
     * 置顶等级
     */
    private Integer top;

    /**
     * 排序
     */
    private Long order;

    /**
     * 系统id
     */
    private String systemId;
}
