package com.sj.b_materialdesign;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.sj.s_base.BaseActivity;

public class MDView1Activity extends BaseActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;

    @Override
    protected int getResid() {
        return R.layout.activity_mdview1;
    }

    @Override
    protected void init() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.iv_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }
    //为按钮设置点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == R.id.add) {
            Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
        } else if (i == R.id.delete) {
            Toast.makeText(this, "You clicked Delete", Toast.LENGTH_SHORT).show();
        } else if (i == R.id.settings) {
            Toast.makeText(this, "You clicked Settings", Toast.LENGTH_SHORT).show();
        }else if (i == android.R.id.home) {
            Toast.makeText(this, "You clicked DrawerLayout", Toast.LENGTH_SHORT).show();
            drawerLayout.openDrawer(GravityCompat.START);
        }
        return true;
    }
}
