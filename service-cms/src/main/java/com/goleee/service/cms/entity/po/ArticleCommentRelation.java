package com.goleee.service.cms.entity.po;

import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ArticleCommentRelation extends BasePo {
    /**
     * 文章id
     */
    private String articleId;

    /**
     * 评论id
     */
    private String commentId;
}
