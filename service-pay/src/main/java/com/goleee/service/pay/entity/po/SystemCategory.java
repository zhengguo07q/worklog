package com.goleee.service.pay.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("system_category_relation")
public class SystemCategory extends BasePo{
    private int systemId;
    private int categoryId;
}
