package com.sj.allandroid.application;

import android.app.Application;

import com.huawei.android.hms.agent.HMSAgent;

/**
 * Created by SJ on 2019/3/12.
 */
public class AllApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HMSAgent.init(this);
    }
}
