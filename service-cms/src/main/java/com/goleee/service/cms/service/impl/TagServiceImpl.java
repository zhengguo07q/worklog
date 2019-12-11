package com.goleee.service.cms.service.impl;

import com.goleee.service.cms.entity.po.Tag;
import com.goleee.service.cms.dao.TagMapper;
import com.goleee.service.cms.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-12-03
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
