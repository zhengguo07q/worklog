package com.goleee.service.cms.service;

import com.goleee.service.cms.entity.param.ArticleQueryParam;
import com.goleee.service.cms.entity.param.SystemQueryParam;
import com.goleee.service.cms.entity.po.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.goleee.service.cms.entity.po.System;

import java.util.List;

/**
 * <p>
 * 文章表 服务类
 * </p>
 *
 * @author jobob
 * @since 2019-12-03
 */
public interface IArticleService extends IService<Article> {
    System get(String id);

    boolean add(Article article);

    boolean update(Article article);

    boolean delete(String id);

    List<Article> query(ArticleQueryParam articleQueryParam);
}
