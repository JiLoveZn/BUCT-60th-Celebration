package com.miniprograms.buct_mini_program.service;

import com.miniprograms.buct_mini_program.entity.Announcement;

import java.util.List;

public interface AnnouncementService {

    /**
     * 获取公告信息列表
     * @return
     */
    List<Announcement> getAnnouncement();

    /**
     * 通过Id获取公告信息
     * @param anId
     * @return
     */
    Announcement getAnnouncementById(int anId);

    /**
     * 增加公告信息
     * @param announcement
     * @return
     */
    boolean addAnnouncement(Announcement announcement);

    /**
     * 修改公告信息
     * @param announcement
     * @return
     */
    boolean modifyAnnouncement(Announcement announcement);

    /**
     * 通过微信Id删除公告信息
     * @param anId
     * @return
     */
    boolean deleteAnnouncement(int anId);

}
