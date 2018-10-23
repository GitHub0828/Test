package com.kl.smartdemo.ui;

import android.os.Bundle;
import android.widget.ImageView;

import com.kl.smartdemo.R;

/*
 *项目名： SmartDemo
 *包名：   com.kl.SmartDemo.ui
 *文件名:  QrCodeActivity
 *创建者:  Kl
 *创建时间:2018/06/2723:05
 *描述:    生成二维码
 */
public class QrCodeActivity extends BaseActivity {

    //我的二维码
    private ImageView iv_qr_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);

        initView();
    }

    private void initView() {

        iv_qr_code = (ImageView) findViewById(R.id.iv_qr_code);
        //屏幕的宽
        int width = getResources().getDisplayMetrics().widthPixels;

//        Bitmap qrCodeBitmap = EncodingUtils.createQRCode("我是智能管家", width / 2, width / 2,
//                BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
//        iv_qr_code.setImageBitmap(qrCodeBitmap);
    }
}
