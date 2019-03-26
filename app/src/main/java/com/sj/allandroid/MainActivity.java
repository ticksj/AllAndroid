package com.sj.allandroid;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.huawei.android.hms.agent.HMSAgent;
import com.huawei.android.hms.agent.common.handler.ConnectHandler;
import com.huawei.android.hms.agent.push.handler.GetTokenHandler;
import com.sj.allandroid.adapter.MenuAdapter;
import com.sj.allandroid.data.Menu;
import com.sj.allandroid.data.MenuEnum;
import com.sj.s_base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private RecyclerView recyclerView;

    @Override
    protected int getResid() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        initHWPush();
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MenuAdapter(this, createMenu()));
    }

    private List<Menu> createMenu() {
        List<Menu> menus = new ArrayList<>();
        for (MenuEnum menuEnum : MenuEnum.values()) {
            menus.add(menuEnum.getMenu());
        }
        return menus;
    }


    private void initHWPush() {
        /**
         * SDK连接HMS
         */
        HMSAgent.connect(this, new ConnectHandler() {
            @Override
            public void onConnect(int rst) {
                showLog("HMS connect end:" + rst);
                showLog("get token: begin");
                HMSAgent.Push.getToken(new GetTokenHandler() {
                    @Override
                    public void onResult(int rst) {
                        showLog("get token: end" + rst);
                    }
                });
            }
        });
    }
    private void showLog(String s) {
        Log.e("HWReciver", "showLog: " + s);
    }
}
