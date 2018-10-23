package com.kl.smartdemo.ui;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kl.smartdemo.R;
import com.kl.smartdemo.utils.UtilTools;

import java.util.ArrayList;
import java.util.List;

/*
 *项目名： SmartDemo
 *包名：   com.kl.SmartDemo.ui
 *文件名:  AboutActivity
 *创建者:  Kl
 *创建时间:2016/12/1223:00
 *描述:    关于软件
 */
public class AboutActivity extends BaseActivity {

    private ListView mListView;
    private List<String>mList = new ArrayList<>();
    private ArrayAdapter<String>mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //去除阴影
        getSupportActionBar().setElevation(0);

        initView();
    }

    //初始化View
    private void initView() {
        mListView = (ListView) findViewById(R.id.mListView);

        mList.add(getString(R.string.text_app_name) + getString(R.string.app_name));
        mList.add(getString(R.string.text_version) + UtilTools.getVersion(this));
        mList.add(getString(R.string.text_website_address));

        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mList);
        //设置适配器
        mListView.setAdapter(mAdapter);
    }
}
