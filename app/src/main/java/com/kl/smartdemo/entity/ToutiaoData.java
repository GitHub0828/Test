package com.kl.smartdemo.entity;

/*
 *  项目名：  SmartDemo 
 *  包名：    com.kl.SmartDemo.entity
 *  文件名:   ToutiaoData
 *  创建者:   Kl
 *  创建时间:  2018/05/13 3:06
 *  描述：    微信精选的数据类
 */

public class ToutiaoData {

    //标题
    private String title;
    //出处
    private String source;
    //图片的url
    private String imgUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
