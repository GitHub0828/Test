package com.kl.smartdemo.entity;

/*
 *  项目名：  SmartDemo 
 *  包名：    com.kl.SmartDemo.entity
 *  文件名:   ChatListData
 *  创建者:   Kl
 *  创建时间:  2018/05/13 2:11
 *  描述：    对话列表的实体
 */

public class ChatListData {

    //type
    private int type;
    //文本
    private String text;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
