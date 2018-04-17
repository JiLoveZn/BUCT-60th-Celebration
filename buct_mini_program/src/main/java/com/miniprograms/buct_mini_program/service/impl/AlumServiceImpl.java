package com.miniprograms.buct_mini_program.service.impl;

import com.miniprograms.buct_mini_program.dao.AlumDao;
import com.miniprograms.buct_mini_program.entity.Alum;
import com.miniprograms.buct_mini_program.service.AlumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlumServiceImpl implements AlumService {
    @Autowired
    private AlumDao alumDao;

    @Override
    public Alum getAlumByWxId(String wxId) {
        return alumDao.queryAlumByWxId(wxId);
    }

    @Transactional
    @Override
    public boolean addAlum(Alum alum) {
        if (alum.getAlumName() == null || "".equals(alum.getAlumName())) {
            throw new RuntimeException("请您输入姓名~");
        }
        if (alum.getStartYear() == null) {
            throw new RuntimeException("请您输入入学年份~");
        }
        if (alum.getDepartment() == null || "".equals(alum.getDepartment())) {
            throw new RuntimeException("请您输入您的院系~");
        }
        if (alum.getClassNo() == null || "".equals(alum.getClassNo())) {
            throw new RuntimeException("请您输入您的班级~");
        }
        try{
            int effectedNum = alumDao.insertAlum(alum);
            if(effectedNum > 0) {
                return true;
            } else {
                throw new RuntimeException("插入校友信息失败！");
            }
        } catch (Exception e) {
            throw new RuntimeException("插入校友信息失败：" + e.toString());
        }
    }

    @Transactional
    @Override
    public boolean modifyAlum(Alum alum) {
        if (alum.getAlumName() == null || "".equals(alum.getAlumName())) {
            throw new RuntimeException("请您输入姓名~");
        }
        if (alum.getStartYear() == null) {
            throw new RuntimeException("请您输入入学年份~");
        }
        if (alum.getDepartment() == null || "".equals(alum.getDepartment())) {
            throw new RuntimeException("请您输入您的院系~");
        }
        if (alum.getClassNo() == null || "".equals(alum.getClassNo())) {
            throw new RuntimeException("请您输入您的班级~");
        }
        try{
            int effectedNum = alumDao.updateAlum(alum);
            if(effectedNum > 0) {
                return true;
            } else {
                throw new RuntimeException("更新校友信息失败！");
            }
        } catch (Exception e){
            throw new RuntimeException("更新校友信息失败：" + e.toString());
        }
    }

    @Transactional
    @Override
    public boolean deleteAlum(String wxId) {
        if(wxId != null && !"".equals(wxId)) {
            try {
                int effectedNum = alumDao.deleteAlum(wxId);
                if(effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除校友信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除校友信息失败：" + e.toString());
            }
        } else {
            throw new RuntimeException("未获取到校友的微信Id！");
        }
    }
}
