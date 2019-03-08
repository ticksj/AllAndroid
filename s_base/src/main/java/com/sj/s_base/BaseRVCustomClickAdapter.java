package com.sj.s_base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by SJ on 2018/10/19.
 */

public abstract class BaseRVCustomClickAdapter<T,V extends RecyclerView.ViewHolder,L extends BaseRVCustomClickAdapter.RVItemClickListener> extends RecyclerView.Adapter<V> {
    protected List<T> lists;
    protected Context context;
    protected L itemClickListener;

    public BaseRVCustomClickAdapter(Context context, List<T> lists) {
        this.context = context;
        this.lists = lists;
    }

    public List<T> getLists() {
        return lists;
    }

    public void setLists(List<T> lists) {
        this.lists = lists;
        notifyDataSetChanged();
    }

    public  void setItemClickListener(L itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    protected abstract int getResId();
    protected abstract V getViewHolder(View view);

    @Override
    public int getItemCount() {
        return lists.size();
    }

    @Override
    public V onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(getResId(), parent, false);
        return getViewHolder(view);
    }

    public interface RVItemClickListener{
        void clickItem(int position);
    }
}
