package com.miniprograms.buct_mini_program.dao;

import com.miniprograms.buct_mini_program.entity.Alum;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumDaoTest {
    @Autowired
    private AlumDao alumDao;

    @Test
    @Ignore
    public void queryAlumByWxId() {
        Alum alum = alumDao.queryAlumByWxId("cyd");
        assertEquals("陈禹东", alum.getAlumName());
    }

    @Test
    @Ignore
    public void insertAlum() {
        Alum alum = new Alum();
        alum.setWxId("ljg");
        alum.setAlumName("李建国");
        alum.setStartYear(1980);
        alum.setDepartment("化学工程系");
        alum.setClassNo("3班");
        int effectedNum = alumDao.insertAlum(alum);
        assertEquals(1, effectedNum);
    }

    @Test
    public void updateAlum() {
        Alum alum = new Alum();
        alum.setWxId("cyd");
        alum.setAlumName("沉鱼洞");
        int effectedNum = alumDao.updateAlum(alum);
        assertEquals(1, effectedNum);
    }

    @Test
    @Ignore
    public void deleteAlum() {
        int effectedNum = alumDao.deleteAlum("ljg");
        assertEquals(1, effectedNum);
    }
}