package com.goleee.service.pay.entity.po;

/**
 *
 CREATE TABLE `cms_comment` (
 `comment_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
 `pid` int(10) unsigned DEFAULT NULL COMMENT '回复楼中楼编号回复楼中楼编号',
 `article_id` int(10) unsigned NOT NULL COMMENT '文章编号',
 `user_id` int(10) unsigned NOT NULL COMMENT '用户编号',
 `content` text NOT NULL COMMENT '评论内容',
 `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '状态(-1:不通过,0:未审核,1:通过)',
 `ip` varchar(30) DEFAULT NULL COMMENT '评论人ip地址',
 `agent` varchar(200) DEFAULT NULL COMMENT '评论人终端信息',
 `system_id` int(11) DEFAULT NULL COMMENT '所属系统',
 `ctime` bigint(20) NOT NULL COMMENT '创建时间',
 PRIMARY KEY (`comment_id`),
 KEY `cms_comment_article_id` (`article_id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COMMENT='评论表';
 */

import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment extends BasePo{
    private String content;
    private String status;
    private String ip;
    private String agent;
}
