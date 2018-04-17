package com.miniprograms.buct_mini_program.service;

import com.miniprograms.buct_mini_program.entity.Alum;

public interface AlumService {
    /**
     * 通过微信Id获取校友信息
     * @param wxId
     * @return
     */
    Alum getAlumByWxId(String wxId);

    /**
     * 增加校友信息
     * @param alum
     * @return
     */
    boolean addAlum(Alum alum);

    /**
     * 修改校友信息
     * @param alum
     * @return
     */
    boolean modifyAlum(Alum alum);

    /**
     * 通过微信Id删除校友信息
     * @param wxId
     * @return
     */
    boolean deleteAlum(String wxId);

}
