package com.goleee.service.pay.entity.po;

/**
 * CREATE TABLE `cms_topic` (
 *   `topic_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
 *   `title` varchar(100) DEFAULT NULL COMMENT '标题',
 *   `description` varchar(300) DEFAULT NULL COMMENT '描述',
 *   `url` varchar(100) DEFAULT NULL COMMENT '链接',
 *   `ctime` bigint(20) DEFAULT NULL COMMENT '创建时间',
 *   PRIMARY KEY (`topic_id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='专题';
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
public class Topic {
    private String title;
    private String description;
    private String url;
}
