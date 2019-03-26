package com.sj.b_view;

import android.os.Bundle;

import com.sj.s_base.BaseActivity;

public class EventDispatchActivity extends BaseActivity {
    private EventDispatchTextView tv;
    @Override
    protected int getResid() {
        return R.layout.activity_event_dispatch;
    }
    @Override
    protected void init() {
        tv = findViewById(R.id.tv);
    }
}
