package com.miniprograms.buct_mini_program.dao;

import com.miniprograms.buct_mini_program.entity.Comment;
import com.miniprograms.buct_mini_program.entity.ReservationInformation;

import java.util.List;

public interface ReservationInformationDao {

    /**
     * 列出预约信息列表
     *
     * @return commentList
     */
    List<ReservationInformation> queryReservationInformation();

    /**
     * 插入预约信息
     *
     * @param reservationInformation
     * @return
     */
    int insertReservationInformation(ReservationInformation reservationInformation);

    /**
     * 根据预约信息Id，删除预约信息
     *
     * @param reId
     * @return
     */
    int deleteReservationInformation(int reId);
}
