package com.miniprograms.buct_mini_program.dao;

import com.miniprograms.buct_mini_program.entity.Comment;

import java.util.List;

public interface CommentDao {

    /**
     * 列出留言评论列表
     *
     * @return commentList
     */
    List<Comment> queryComment();

    /**
     * 插入留言评论
     *
     * @param comment
     * @return
     */
    int insertComment(Comment comment);

    /**
     * 根据留言评论Id，删除留言评论
     *
     * @param cId
     * @return
     */
    int deleteComment(int cId);
}
