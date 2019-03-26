package com.sj.b_materialdesign;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.sj.s_base.BaseActivity;

public class MDView3Activity extends BaseActivity {
    private TabLayout tablayout;
    private ViewPager vp;

    @Override
    protected int getResid() {
        return R.layout.activity_mdview3;
    }

    @Override
    protected void init() {
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        vp = (ViewPager) findViewById(R.id.vp);
    }
}
