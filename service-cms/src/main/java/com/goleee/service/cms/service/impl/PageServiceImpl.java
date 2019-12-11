package com.goleee.service.cms.service.impl;

import com.goleee.service.cms.entity.po.Page;
import com.goleee.service.cms.dao.PageMapper;
import com.goleee.service.cms.service.IPageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 页面 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-12-03
 */
@Service
public class PageServiceImpl extends ServiceImpl<PageMapper, Page> implements IPageService {

}
