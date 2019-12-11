package com.goleee.service.pay.entity.po;

import com.springboot.cloud.common.web.entity.po.BasePo;

/**
 *
 CREATE TABLE `cms_category` (
 `category_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '类目编号',
 `pid` int(10) unsigned DEFAULT NULL COMMENT '上级编号',
 `level` tinyint(4) NOT NULL COMMENT '层级',
 `name` varchar(20) NOT NULL COMMENT '名称',
 `description` varchar(200) DEFAULT NULL COMMENT '描述',
 `icon` varchar(50) DEFAULT NULL COMMENT '图标',
 `type` tinyint(3) NOT NULL DEFAULT '1' COMMENT '类型(1:普通,2:热门...)',
 `alias` varchar(20) DEFAULT NULL COMMENT '别名',
 `system_id` int(11) DEFAULT NULL COMMENT '所属系统',
 `ctime` bigint(20) unsigned NOT NULL COMMENT '创建时间',
 `orders` bigint(255) unsigned NOT NULL COMMENT '排序',
 PRIMARY KEY (`category_id`),
 KEY `cms_category_orders` (`orders`),
 KEY `cms_category_pid` (`pid`),
 KEY `cms_category_alias` (`alias`),
 KEY `cms_category_level` (`level`)
 ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COMMENT='类目表';

 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BasePo {
    private int level;
    private String name;
    private String description;
    private String icon;
    private int type;
    private String alias;
    private int order;
}
