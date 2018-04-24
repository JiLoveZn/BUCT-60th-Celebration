package com.miniprograms.buct_mini_program.dao;

import com.miniprograms.buct_mini_program.entity.Reservation;
import org.junit.Ignore;
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
public class ReservationDaoTest {
    @Autowired
    private ReservationDao reservationDao;

    @Test
    public void queryReservation() {
        List<Reservation> reservationList = reservationDao.queryReservation();
        assertEquals(1, reservationList.size());
    }

    @Ignore
    @Test
    public void insertReservation() {
        Reservation reservation = new Reservation();
        reservation.setName("李建国");
        reservation.setBackTime(new Date());
        reservation.setBackMode("出租车");
        reservation.setGroupSize(2);
        reservation.setNeedTeacher(false);
        reservation.setNeedClassroom(true);
        reservation.setPrincipal("李建国");
        reservation.setPrincipalPhone("15800004567");
        int effectedNum = reservationDao.insertReservation(reservation);
        assertEquals(1, effectedNum);
    }

    @Ignore
    @Test
    public void deleteAlum() {
        int effectedNum = reservationDao.deleteReservation(2);
        assertEquals(1, effectedNum);
    }
}
