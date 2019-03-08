package com.sj.s_base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Created by SJ on 2019/1/17.
 */
public abstract class BaseRVAdapter<T,V extends RecyclerView.ViewHolder> extends BaseRVCustomClickAdapter<T,V,BaseRVCustomClickAdapter.RVItemClickListener> {

    public BaseRVAdapter(Context context, List<T> lists) {
        super(context, lists);
    }
}
