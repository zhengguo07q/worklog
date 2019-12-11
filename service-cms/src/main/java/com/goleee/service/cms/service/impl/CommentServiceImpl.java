package com.goleee.service.cms.service.impl;

import com.goleee.service.cms.entity.po.Comment;
import com.goleee.service.cms.dao.CommentMapper;
import com.goleee.service.cms.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-12-03
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
