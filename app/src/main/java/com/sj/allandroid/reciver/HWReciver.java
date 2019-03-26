package com.sj.allandroid.reciver;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.huawei.hms.support.api.push.PushReceiver;

/**
 * Created by SJ on 2019/3/12.
 */

public class HWReciver extends PushReceiver {
    private static final String TAG = "HWReciver";
    @Override
    public void onToken(Context context, String token, Bundle extras) {

        //开发者自行实现Token保存逻辑。
        Log.e(TAG, "onToken: "+token );
        String belongId = extras.getString("belongId");
        Log.e(TAG, "belongId:" + belongId);
    }
    @Override
    public boolean onPushMsg(Context context, byte[] msg, Bundle bundle) {
        try {
            //开发者可以自己解析消息内容，然后做相应的处理
            String content = new String(msg, "UTF-8");
            Log.e(TAG, "收到PUSH透传消息,消息内容为:" + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //开发者自行实现透传消息处理。
        return false;
    }
}
