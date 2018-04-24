package com.miniprograms.buct_mini_program.dao;

import com.miniprograms.buct_mini_program.entity.Reservation;

import java.util.List;

public interface ReservationDao {

    /**
     * 列出预约信息列表
     *
     * @return commentList
     */
    List<Reservation> queryReservation();

    /**
     * 插入预约信息
     *
     * @param reservation
     * @return
     */
    int insertReservation(Reservation reservation);

    /**
     * 根据预约信息Id，删除预约信息
     *
     * @param reId
     * @return
     */
    int deleteReservation(int reId);
}
