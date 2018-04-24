package com.miniprograms.buct_mini_program.dao;

import com.miniprograms.buct_mini_program.entity.Announcement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnouncementDaoTest {
    @Autowired
    private AnnouncementDao announcementDao;

    @Test
    public void queryAnnouncement() {
        List<Announcement> announcements = announcementDao.queryAnnouncement();
        assertEquals(1, announcements.size());
    }

    @Test
    public void queryAnnouncementById() {
        Announcement announcement = announcementDao.queryAnnouncementById(1);
        assertEquals("欢迎回家", announcement.getTitle());
    }

    @Test
    public void insertAnnouncement() {
        Announcement announcement = new Announcement();
        announcement.setTitle("测试公告2");
        announcement.setAuthor("陈吉");
        announcement.setContent("今天是个好日子！");
        announcement.setCreateDate(new Date());
        int effectedNum = announcementDao.insertAnnouncement(announcement);
        assertEquals(1, effectedNum);
    }

    @Test
    public void updateAnnouncement() {
        Announcement announcement = new Announcement();
        announcement.setAnId(1);
        announcement.setAuthor("沉鱼洞");
        int effectedNum = announcementDao.updateAnnouncement(announcement);
        assertEquals(1, effectedNum);
    }

    @Test
    public void deleteAnnouncement() {
        int effectedNum = announcementDao.deleteAnnouncement(2);
        assertEquals(1, effectedNum);
    }
}
