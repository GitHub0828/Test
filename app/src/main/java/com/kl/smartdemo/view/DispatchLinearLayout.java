package com.kl.smartdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;

/*
 *项目名： SmartDemo
 *包名：   com.kl.SmartDemo.view
 *文件名:  DispatchLinearLayout
 *创建者:  Kl
 *创建时间:2018/06/270:37
 *描述:    事件分发
 */
public class DispatchLinearLayout extends LinearLayout {

    private DispatchKeyEventListener dispatchKeyEventListener;

    public DispatchLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DispatchLinearLayout(Context context) {
        super(context);
    }

    public DispatchLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DispatchKeyEventListener getDispatchKeyEventListener() {
        return dispatchKeyEventListener;
    }

    public void setDispatchKeyEventListener(DispatchKeyEventListener dispatchKeyEventListener) {
        this.dispatchKeyEventListener = dispatchKeyEventListener;
    }

    //接口
    public static interface DispatchKeyEventListener {
        boolean dispatchKeyEvent(KeyEvent event);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        //如果不为空 说明调用了 去获取事件
        if (dispatchKeyEventListener != null) {
            return dispatchKeyEventListener.dispatchKeyEvent(event);
        }
        return super.dispatchKeyEvent(event);
    }
}
