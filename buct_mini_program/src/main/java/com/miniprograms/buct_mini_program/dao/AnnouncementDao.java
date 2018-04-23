package com.miniprograms.buct_mini_program.dao;

import com.miniprograms.buct_mini_program.entity.Announcement;

import java.util.List;

public interface AnnouncementDao {

    /**
     * 列出公告列表
     *
     * @return announcementList
     */
    List<Announcement> queryAnnouncement();

    /**
     * 根据公告Id列出具体公告信息
     *
     * @param anId
     * @return
     */
    Announcement queryAnnouncementById(int anId);

    /**
     * 插入公告
     *
     * @param announcement
     * @return
     */
    int insertAnnouncement(Announcement announcement);

    /**
     * 修改公告
     *
     * @param announcement
     * @return
     */
    int updateAnnouncement(Announcement announcement);

    /**
     * 根据公告Id，删除公告
     *
     * @param anId
     * @return
     */
    int deleteAnnouncement(int anId);
}
