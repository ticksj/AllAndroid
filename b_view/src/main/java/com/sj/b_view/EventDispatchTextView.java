package com.sj.b_view;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by SJ on 2019/3/8.
 */
public class EventDispatchTextView extends AppCompatTextView {
    public EventDispatchTextView(Context context) {
        super(context);
    }

    public EventDispatchTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EventDispatchTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {



        return super.onTouchEvent(event);
    }
}
