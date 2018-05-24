package com.example.kiran.viewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by kiran on 23-05-2018.
 */

public class Pager extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    TextView tv;
    private int count;

    public Pager(Context context,int count) {
        this.context=context;
        this.count=count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.page,container,false);
        tv=view.findViewById(R.id.textView);
        tv.setText("This is new pagers  "+(position+1));
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
