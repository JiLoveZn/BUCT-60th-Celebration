package com.miniprograms.buct_mini_program.dao;

import com.miniprograms.buct_mini_program.entity.Information;
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
public class InformationDaoTest {
    @Autowired
    private InformationDao informationDao;

    @Test
    public void queryInformation() {
        List<Information> informations = informationDao.queryInformation();
        assertEquals(1, informations.size());
    }

    @Ignore
    @Test
    public void queryInformationById() {
        Information information = informationDao.queryInformationById(1);
        assertEquals("资讯测试1", information.getTitle());
    }

    @Ignore
    @Test
    public void insertInformation() {
        Information information = new Information();
        information.setTitle("资讯测试2");
        information.setAuthor("陈吉");
        information.setContent("这也是一条资讯。");
        information.setCreateDate(new Date());
        int effectedNum = informationDao.insertInformation(information);
        assertEquals(1, effectedNum);
    }

    @Ignore
    @Test
    public void updateInformation() {
        Information information = new Information();
        information.setInId(1);
        information.setAuthor("沉鱼洞");
        int effectedNum = informationDao.updateInformation(information);
        assertEquals(1, effectedNum);
    }

    @Ignore
    @Test
    public void deleteInformation() {
        int effectedNum = informationDao.deleteInformation(2);
        assertEquals(1, effectedNum);
    }
}
