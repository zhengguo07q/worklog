package com.goleee.service.cms.entity.po;

import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TagArticleRelation extends BasePo {
    /**
     * 标签id
     */
    private String tagId;

    /**
     * 文章id
     */
    private String articleId;

}
