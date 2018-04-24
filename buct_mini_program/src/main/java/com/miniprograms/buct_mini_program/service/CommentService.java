package com.miniprograms.buct_mini_program.service;

import com.miniprograms.buct_mini_program.entity.Comment;

import java.util.List;

public interface CommentService {
    /**
     * 获取评论列表
     * @return
     */
    List<Comment> getCommentList();

    /**
     * 添加一条评论
     * @param comment
     * @return
     */
    boolean addComment(Comment comment);

    /**
     * 通过评论Id删除一条评论
     * @param cId
     * @return
     */
    boolean deleteComment(int cId);
}
