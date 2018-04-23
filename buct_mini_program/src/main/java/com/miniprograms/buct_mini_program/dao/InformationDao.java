package com.miniprograms.buct_mini_program.dao;

import com.miniprograms.buct_mini_program.entity.Information;

import java.util.List;

public interface InformationDao {

    /**
     * 列出资讯列表
     *
     * @return informationList
     */
    List<Information> queryInformation();

    /**
     * 根据资讯Id列出具体资讯信息
     *
     * @param inId
     * @return
     */
    Information queryInformationById(int inId);

    /**
     * 插入资讯
     *
     * @param information
     * @return
     */
    int insertInformation(Information information);

    /**
     * 修改资讯
     *
     * @param information
     * @return
     */
    int updateInformation(Information information);

    /**
     * 根据资讯Id，删除资讯
     *
     * @param inId
     * @return
     */
    int deleteInformation(int inId);
}
