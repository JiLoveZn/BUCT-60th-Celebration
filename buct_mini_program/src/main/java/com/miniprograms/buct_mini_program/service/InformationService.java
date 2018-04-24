package com.miniprograms.buct_mini_program.service;

import com.miniprograms.buct_mini_program.entity.Information;

import java.util.List;

public interface InformationService {

    /**
     * 获取资讯信息列表
     * @return
     */
    List<Information> getInformation();

    /**
     * 通过Id获取资讯信息
     * @param inId
     * @return
     */
    Information getInformationById(int inId);

    /**
     * 增加资讯信息
     * @param information
     * @return
     */
    boolean addInformation(Information information);

    /**
     * 修改资讯信息
     * @param information
     * @return
     */
    boolean modifyInformation(Information information);

    /**
     * 通过资讯Id删除资讯信息
     * @param inId
     * @return
     */
    boolean deleteInformation(int inId);

}
