package com.kl.smartdemo.adapter;

/*
 *  项目名：  SmartDemo 
 *  包名：   com.kl.smartdemo.adapter
 *  文件名:   ToutiaoAdapter
 *  创建者:   Kl
 *  创建时间:  2018/05/13 3:06
 *  描述：    头条精选
 */

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kl.smartdemo.R;
import com.kl.smartdemo.entity.ToutiaoData;
import com.kl.smartdemo.utils.L;
import com.kl.smartdemo.utils.PicassoUtils;

import java.util.List;

public class ToutiaoAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater inflater;
    private List<ToutiaoData> mList;
    private ToutiaoData data;
    private int width,height;
    private WindowManager wm;

    public ToutiaoAdapter(Context mContext, List<ToutiaoData> mList) {
        this.mContext = mContext;
        this.mList = mList;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        width = wm.getDefaultDisplay().getWidth();
        height = wm.getDefaultDisplay().getHeight();
        L.i("Width:" + width + "Height:" + height);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.wechat_item, null);
            viewHolder.iv_img = (ImageView) convertView.findViewById(R.id.iv_img);
            viewHolder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.tv_source = (TextView) convertView.findViewById(R.id.tv_source);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        data = mList.get(position);
        viewHolder.tv_title.setText(data.getTitle());
        viewHolder.tv_source.setText(data.getSource());
        if(!TextUtils.isEmpty(data.getImgUrl())){
            //加载图片
            PicassoUtils.loadImageViewSize(mContext, data.getImgUrl(), width/3, 250, viewHolder.iv_img);
        }
        return convertView;
    }

    class ViewHolder {
        private ImageView iv_img;
        private TextView tv_title;
        private TextView tv_source;
    }
}
