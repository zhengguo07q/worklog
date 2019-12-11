package com.goleee.service.cms.service.impl;

import com.goleee.service.cms.entity.param.ArticleQueryParam;
import com.goleee.service.cms.entity.po.Article;
import com.goleee.service.cms.dao.ArticleMapper;
import com.goleee.service.cms.entity.po.System;
import com.goleee.service.cms.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

    @Override
    public System get(String id) {
        return null;
    }

    @Override
    public boolean add(Article article) {
        return false;
    }

    @Override
    public boolean update(Article article) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List<Article> query(ArticleQueryParam articleQueryParam) {
        return null;
    }
}
