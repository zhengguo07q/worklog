package com.goleee.service.cms.entity.po;

import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Comment extends BasePo {

    /**
     * 回复楼中楼编号回复楼中楼编号
     */
    private String parentId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 状态(-1:不通过,0:未审核,1:通过)
     */
    private Integer status;

    /**
     * 评论人ip地址
     */
    private String ip;

    /**
     * 评论人终端信息
     */
    private String agent;
}
