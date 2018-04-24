package com.miniprograms.buct_mini_program.dao;

import com.miniprograms.buct_mini_program.entity.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentDaoTest {
    @Autowired
    private CommentDao commentDao;

    @Test
    public void queryComment() {
        List<Comment> commentList = commentDao.queryComment();
        assertEquals(1, commentList.size());
    }

    @Test
    public void insertComment() {
        Comment comment = new Comment();
        comment.setWxId("ljg");
        comment.setContent("今年校庆的小程序功能真棒！");
        int effectedNum = commentDao.insertComment(comment);
        assertEquals(1, effectedNum);
    }

    @Test
    public void deleteAlum() {
        int effectedNum = commentDao.deleteComment(2);
        assertEquals(1, effectedNum);
    }
}
