package com.sj.allandroid;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sj.allandroid.adapter.MenuAdapter;
import com.sj.allandroid.data.Menu;
import com.sj.allandroid.data.MenuEnum;
import com.sj.s_base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
