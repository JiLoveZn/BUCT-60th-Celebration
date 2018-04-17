package com.miniprograms.buct_mini_program.dao;

import com.miniprograms.buct_mini_program.entity.Alum;

public interface AlumDao {
    /**
     * 根据微信Id列出具体校友信息
     *
     * @param wxId
     * @return
     */
    Alum queryAlumByWxId(String wxId);

    /**
     * 插入校友信息
     *
     * @param alum
     * @return
     */
    int insertAlum(Alum alum);

    /**
     * 更新校友信息
     *
     * @param alum
     * @return
     */
    int updateAlum(Alum alum);

    /**
     * 根据微信Id，删除校友信息
     *
     * @param wxId
     * @return
     */
    int deleteAlum(String wxId);
}
