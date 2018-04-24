package com.miniprograms.buct_mini_program.service.impl;

import com.miniprograms.buct_mini_program.dao.ReservationDao;
import com.miniprograms.buct_mini_program.entity.Reservation;
import com.miniprograms.buct_mini_program.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationDao reservationDao;

    @Override
    public List<Reservation> getReservationList() {
        return reservationDao.queryReservation();
    }

    @Transactional
    @Override
    public boolean addReservation(Reservation reservation) {
        if (reservation.getName() == null || "".equals(reservation.getName())) {
            throw new RuntimeException("请输入您的姓名");
        }
        if (reservation.getBackMode() == null || "".equals(reservation.getBackMode())) {
            throw new RuntimeException("请输入返校方式");
        }
        if (reservation.getBackTime() == null) {
            throw new RuntimeException("请输入返校时间");
        }
        if (reservation.getGroupSize() == null) {
            throw new RuntimeException("请输入团体返校人数");
        }
        if (reservation.getNeedClassroom() == null) {
            throw new RuntimeException("请输入是否需要教室");
        }
        if (reservation.getNeedTeacher() == null) {
            throw new RuntimeException("请输入是否需要联系教师");
        }
        if (reservation.getTeacherName() == null || "".equals(reservation.getTeacherName())) {
            throw new RuntimeException("请输入联系教师姓名");
        }
        if (reservation.getPrincipal() == null || "".equals(reservation.getPrincipal())) {
            throw new RuntimeException("请输入负责人姓名");
        }
        if (reservation.getPrincipalPhone() == null || "".equals(reservation.getPrincipalPhone())) {
            throw new RuntimeException("请输入负责人电话");
        }
        try{
            int effectedNum = reservationDao.insertReservation(reservation);
            if(effectedNum > 0) {
                return true;
            } else {
                throw new RuntimeException("添加预约信息失败！");
            }
        } catch (Exception e) {
            throw new RuntimeException("添加预约信息失败：" + e.toString());
        }
    }

    @Transactional
    @Override
    public boolean deleteReservation(int reId) {
        if(reId > 0) {
            try {
                int effectedNum = reservationDao.deleteReservation(reId);
                if(effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除预约信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除预约信息失败:"+e.toString());
            }
        } else {
            throw new RuntimeException("预约信息Id不能为空！");
        }
    }
}
