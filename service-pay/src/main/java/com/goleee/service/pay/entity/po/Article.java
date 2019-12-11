package com.goleee.service.pay.entity.po;

import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Article extends BasePo {
    private String title;
    private String author;
    private String fromUrl;
    private String image;
    private String keywords;
    private String description;
    private int type;
    private boolean allowComments;
    private boolean status;
    private String content;
    private int readNumber;
    private int top;
    private int order;
    /*  `article_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '文章编号',
            `topic_id` int(11) DEFAULT NULL COMMENT '所属专题',
            `title` varchar(200) NOT NULL COMMENT '文章标题',
            `author` varchar(50) DEFAULT NULL COMMENT '文章原作者',
            `fromurl` varchar(300) DEFAULT NULL COMMENT '转载来源网址',
            `image` varchar(300) DEFAULT NULL COMMENT '封面图',
            `keywords` varchar(100) DEFAULT NULL COMMENT '关键字',
            `description` varchar(500) DEFAULT NULL COMMENT '简介',
            `type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '类型(1:普通,2:热门...)',
            `allowcomments` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否允许评论(0:不允许,1:允许)',
            `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '状态(-1:不通过,0未审核,1:通过)',
            `content` mediumtext COMMENT '内容',
            `user_id` int(10) unsigned NOT NULL COMMENT '发布人id',
            `readnumber` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '阅读数量',
            `top` int(11) NOT NULL DEFAULT '0' COMMENT '置顶等级',
            `system_id` int(11) DEFAULT NULL COMMENT '所属系统',
            `ctime` bigint(20) unsigned NOT NULL COMMENT '创建时间',
            `orders` bigint(20) unsigned NOT NULL COMMENT '排序',
            */

}
