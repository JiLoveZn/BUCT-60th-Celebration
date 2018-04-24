package com.miniprograms.buct_mini_program.service.impl;

import com.miniprograms.buct_mini_program.dao.InformationDao;
import com.miniprograms.buct_mini_program.entity.Information;
import com.miniprograms.buct_mini_program.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    private InformationDao informationDao;

    @Override
    public List<Information> getInformation() {
        return informationDao.queryInformation();
    }

    @Override
    public Information getInformationById(int inId) {
        return informationDao.queryInformationById(inId);
    }

    @Transactional
    @Override
    public boolean addInformation(Information information) {
        if (information.getTitle() == null || "".equals(information.getTitle())) {
            throw new RuntimeException("请您输入资讯标题~");
        }
        if (information.getAuthor() == null || "".equals(information.getAuthor())) {
            throw new RuntimeException("请您录入资讯作者信息~");
        }
        if (information.getContent() == null || "".equals(information.getContent())) {
            throw new RuntimeException("请您输入资讯内容~");
        }
        information.setCreateDate(new Date());
        try{
            int effectedNum = informationDao.insertInformation(information);
            if(effectedNum > 0) {
                return true;
            } else {
                throw new RuntimeException("插入资讯信息失败！");
            }
        } catch (Exception e) {
            throw new RuntimeException("插入资讯信息失败：" + e.toString());
        }
    }

    @Transactional
    @Override
    public boolean modifyInformation(Information information) {
        if (information.getTitle() == null || "".equals(information.getTitle())) {
            throw new RuntimeException("请您输入资讯标题~");
        }
        if (information.getAuthor() == null || "".equals(information.getAuthor())) {
            throw new RuntimeException("请您录入资讯作者信息~");
        }
        if (information.getContent() == null || "".equals(information.getContent())) {
            throw new RuntimeException("请您输入资讯内容~");
        }
        try{
            int effectedNum = informationDao.updateInformation(information);
            if(effectedNum > 0) {
                return true;
            } else {
                throw new RuntimeException("更新资讯信息失败！");
            }
        } catch (Exception e){
            throw new RuntimeException("更新资讯信息失败：" + e.toString());
        }
    }

    @Transactional
    @Override
    public boolean deleteInformation(int inId) {
        if(inId > 0) {
            try {
                int effectedNum = informationDao.deleteInformation(inId);
                if(effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除资讯信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除资讯信息失败:"+e.toString());
            }
        } else {
            throw new RuntimeException("资讯Id不能为空！");
        }
    }
}
