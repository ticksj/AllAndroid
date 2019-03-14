package com.sj.s_base.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by SJ on 2018/10/31.
 */

public class SPUtils {
    private final SharedPreferences.Editor editor;
    private final SharedPreferences sp;
    private String defaultString = "";
    private Long defaultLong = 0l;
    private Float defaultFloat = 0f;
    private Integer defaultInteger = 0;
    private Boolean defaultBoolean = false;

    public SPUtils(Context context) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sp.edit();
    }

    // 支持数据类型boolean、int、float、long和String

    public String getString(String key) {
        return getString(key, defaultString);
    }

    public Long getLong(String key) {
        return getLong(key, defaultLong);
    }

    public Float getFloat(String key) {
        return getFloat(key, defaultFloat);
    }

    public Integer getInt(String key) {
        return getInt(key, defaultInteger);
    }

    public Boolean getBoolean(String key) {
        return getBoolean(key, defaultBoolean);
    }


    public String getString(String key, String defaultString) {
        String value = sp.getString(key, defaultString);
        return value;
    }

    public Long getLong(String key, Long defaultLong) {
        return sp.getLong(key, defaultLong);
    }

    public Float getFloat(String key, Float defaultFloat) {
        return sp.getFloat(key, defaultFloat);
    }

    public Integer getInt(String key, Integer defaultInteger) {
        return sp.getInt(key, defaultInteger);
    }

    public Boolean getBoolean(String key, Boolean defaultBoolean) {
        return sp.getBoolean(key, defaultBoolean);
    }

    public void putString(String key, String s) {
        if (s==null) {
            try {
                throw new Exception("传入的s为空！");
            } catch (Exception e) {
                e.printStackTrace();
            }
            s = defaultString;
        }
       editor.putString(key,s).commit();
    }
    public void putLong(String key, Long l) {
        editor.putLong(key,l).commit();
    }

    public void putFloat(String key, Float f) {
        editor.putFloat(key,f).commit();
    }

    public void putInt(String key, Integer i) {
        editor.putInt(key,i).commit();
    }

    public void putBoolean(String key, Boolean b) {
        editor.putBoolean(key,b).commit();
    }


}
