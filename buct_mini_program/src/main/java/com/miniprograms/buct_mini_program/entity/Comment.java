package com.miniprograms.buct_mini_program.entity;

//留言评论
public class Comment {
    private Integer cId;//评论编号
    private String wxId;//微信ID
    private String content;//评论内容

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
