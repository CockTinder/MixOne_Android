package com.example.laptop.mixone;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by laptop on 16.06.2017.
 */

public class GridAdapter extends BaseAdapter {
    private Integer[] imageIds;
    private Context context;

    public GridAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return imageIds.length;
    }

    @Override
    public Object getItem(int position) {
        return imageIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iview;
        if (convertView == null){
            iview = new ImageView(context);
            iview.setLayoutParams(new GridView.LayoutParams(150,200));
            iview.setScaleType(ImageView.ScaleType.CENTER_CROP);
            iview.setPadding(5, 5, 5, 5);
        } else {
            iview = (ImageView) convertView;
        }
        iview.setImageResource(imageIds[position]);
        return iview;
    }


}
