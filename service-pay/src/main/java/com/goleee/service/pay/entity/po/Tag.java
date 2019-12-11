package com.goleee.service.pay.entity.po;

/**
 * CREATE TABLE `cms_tag` (
 *   `tag_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '标签编号',
 *   `name` varchar(20) NOT NULL COMMENT '名称',
 *   `description` varchar(200) DEFAULT NULL COMMENT '描述',
 *   `icon` varchar(50) DEFAULT NULL COMMENT '图标',
 *   `type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '类型(1:普通,2:热门...)',
 *   `alias` varchar(20) DEFAULT NULL COMMENT '别名',
 *   `system_id` int(11) DEFAULT NULL COMMENT '所属系统',
 *   `ctime` bigint(20) unsigned NOT NULL COMMENT '创建时间',
 *   `orders` bigint(20) unsigned NOT NULL COMMENT '排序',
 *   PRIMARY KEY (`tag_id`),
 *   KEY `cms_tag_orders` (`orders`),
 *   KEY `cms_tag_alias` (`alias`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='标签表';
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
public class Tag extends BasePo{
    private String name;
    private String description;
    private String icon;
    private int type;
    private String alias;
    private int order;
}
