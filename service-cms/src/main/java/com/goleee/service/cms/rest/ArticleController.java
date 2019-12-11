package com.goleee.service.cms.rest;


import com.goleee.service.cms.entity.form.ArticleForm;
import com.goleee.service.cms.entity.form.articleForm;
import com.goleee.service.cms.entity.param.ArticleQueryParam;
import com.goleee.service.cms.entity.param.SettingQueryParam;
import com.goleee.service.cms.entity.po.Article;
import com.goleee.service.cms.entity.po.Setting;
import com.goleee.service.cms.service.IArticleService;
import com.goleee.service.cms.service.ISettingService;
import com.springboot.cloud.common.core.entity.vo.Result;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Api("article-comment-relation")
@Slf4j
@RequestMapping("/cms/article")
public class ArticleController {

//阅读
    //审核
    //排序
    @Autowired
    private IArticleService articleService;


    @ApiOperation(value = "新增文章", notes = "新增一个文章")
    @ApiImplicitParam(name = "articleForm", value = "新增文章form表单", required = true, dataType = "articleForm")
    @PostMapping
    public Result add(@Valid @RequestBody ArticleForm articleForm) {
        log.debug("name:{}", articleForm);
        return Result.success(articleService.add(articleForm.toPo(Article.class)));
    }

    @ApiOperation(value = "删除文章", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(paramType = "path", name = "id", value = "文章ID", required = true, dataType = "long")
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable String id) {
        return Result.success(articleService.delete(id));
    }

    @ApiOperation(value = "修改文章", notes = "修改指定文章信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "long"),
            @ApiImplicitParam(name = "articleForm", value = "文章实体", required = true, dataType = "articleForm")
    })
    @PutMapping(value = "/{id}")
    public Result update(@PathVariable String id, @Valid @RequestBody ArticleForm articleForm) {
        Article article = articleForm.toPo(Article.class);
        article.setId(id);
        return Result.success(articleService.update(article));
    }

    @ApiOperation(value = "获取文章", notes = "获取指定文章")
    @ApiImplicitParam(paramType = "path", name = "id", value = "文章ID", required = true, dataType = "long")
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable String id) {
        log.debug("get with id:{}", id);
        return Result.success(articleService.get(id));
    }

    @ApiOperation(value = "查询文章", notes = "根据条件查询文章信息，简单查询")
    @ApiImplicitParam(paramType = "query", name = "name", value = "文章KEY", required = true, dataType = "string")
    @ApiResponses(
            @ApiResponse(code = 200, message = "处理成功", response = Result.class)
    )
    @GetMapping
    public Result query(@RequestParam String key) {
        log.debug("query with key:{}", key);
        ArticleQueryParam articleQueryParam = new ArticleQueryParam();
        articleQueryParam.setKey(key);
        return Result.success(articleService.query(articleQueryParam));
    }
}
