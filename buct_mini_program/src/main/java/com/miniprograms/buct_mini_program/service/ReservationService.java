package com.miniprograms.buct_mini_program.service;

import com.miniprograms.buct_mini_program.entity.Reservation;

import java.util.List;

public interface ReservationService {
    /**
     * 获取预约信息列表
     * @return
     */
    List<Reservation> getReservationList();

    /**
     * 添加一条预约信息
     * @param reservation
     * @return
     */
    boolean addReservation(Reservation reservation);

    /**
     * 通过预约信息Id删除一条预约信息
     * @param reId
     * @return
     */
    boolean deleteReservation(int reId);
}
