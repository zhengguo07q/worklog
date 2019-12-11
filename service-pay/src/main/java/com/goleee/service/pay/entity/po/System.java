package com.goleee.service.pay.entity.po;

/**
 *   `system_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
 *   `name` varchar(20) NOT NULL COMMENT '系统名称',
 *   `code` varchar(20) DEFAULT NULL COMMENT '别名',
 *   `description` varchar(300) DEFAULT NULL COMMENT '描述',
 *   `ctime` bigint(20) DEFAULT NULL COMMENT '创建时间',
 *   `orders` bigint(20) DEFAULT NULL COMMENT '排序',
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
public class System extends BasePo {
    private String name;
    private String code;
    private String description;
    private int order;
}
