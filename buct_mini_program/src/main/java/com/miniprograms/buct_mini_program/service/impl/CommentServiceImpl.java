package com.miniprograms.buct_mini_program.service.impl;

import com.miniprograms.buct_mini_program.dao.CommentDao;
import com.miniprograms.buct_mini_program.entity.Comment;
import com.miniprograms.buct_mini_program.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;

    @Override
    public List<Comment> getCommentList() {
        return commentDao.queryComment();
    }

    @Transactional
    @Override
    public boolean addComment(Comment comment) {
        if (comment.getContent() == null || "".equals(comment.getContent())) {
            throw new RuntimeException("请输入您的评论内容~");
        }
        try{
            int effectedNum = commentDao.insertComment(comment);
            if(effectedNum > 0) {
                return true;
            } else {
                throw new RuntimeException("添加评论失败！");
            }
        } catch (Exception e) {
            throw new RuntimeException("添加评论失败：" + e.toString());
        }
    }

    @Transactional
    @Override
    public boolean deleteComment(int cId) {
        if(cId > 0) {
            try {
                int effectedNum = commentDao.deleteComment(cId);
                if(effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除评论失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除评论失败:"+e.toString());
            }
        } else {
            throw new RuntimeException("评论Id不能为空！");
        }
    }
}
