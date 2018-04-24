package com.miniprograms.buct_mini_program.service.impl;

import com.miniprograms.buct_mini_program.dao.AnnouncementDao;
import com.miniprograms.buct_mini_program.entity.Announcement;
import com.miniprograms.buct_mini_program.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {
    @Autowired
    private AnnouncementDao announcementDao;

    @Override
    public List<Announcement> getAnnouncement() {
        return announcementDao.queryAnnouncement();
    }

    @Override
    public Announcement getAnnouncementById(int anId) {
        return announcementDao.queryAnnouncementById(anId);
    }

    @Transactional
    @Override
    public boolean addAnnouncement(Announcement announcement) {
        if (announcement.getTitle() == null || "".equals(announcement.getTitle())) {
            throw new RuntimeException("请您输入公告标题~");
        }
        if (announcement.getAuthor() == null || "".equals(announcement.getAuthor())) {
            throw new RuntimeException("请您录入公告作者信息~");
        }
        if (announcement.getContent() == null || "".equals(announcement.getContent())) {
            throw new RuntimeException("请您输入公告内容~");
        }
        announcement.setCreateDate(new Date());
        try{
            int effectedNum = announcementDao.insertAnnouncement(announcement);
            if(effectedNum > 0) {
                return true;
            } else {
                throw new RuntimeException("插入公告信息失败！");
            }
        } catch (Exception e) {
            throw new RuntimeException("插入公告信息失败：" + e.toString());
        }
    }

    @Transactional
    @Override
    public boolean modifyAnnouncement(Announcement announcement) {
        if (announcement.getTitle() == null || "".equals(announcement.getTitle())) {
            throw new RuntimeException("请您输入公告标题~");
        }
        if (announcement.getAuthor() == null || "".equals(announcement.getAuthor())) {
            throw new RuntimeException("请您录入公告作者信息~");
        }
        if (announcement.getContent() == null || "".equals(announcement.getContent())) {
            throw new RuntimeException("请您输入公告内容~");
        }
        try{
            int effectedNum = announcementDao.updateAnnouncement(announcement);
            if(effectedNum > 0) {
                return true;
            } else {
                throw new RuntimeException("更新公告信息失败！");
            }
        } catch (Exception e){
            throw new RuntimeException("更新公告信息失败：" + e.toString());
        }
    }

    @Transactional
    @Override
    public boolean deleteAnnouncement(int anId) {
        if(anId > 0) {
            try {
                int effectedNum = announcementDao.deleteAnnouncement(anId);
                if(effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除公告信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除公告信息失败:"+e.toString());
            }
        } else {
            throw new RuntimeException("公告Id不能为空！");
        }
    }
}
