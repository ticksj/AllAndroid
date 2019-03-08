package com.sj.allandroid.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sj.allandroid.data.Menu;
import com.sj.allandroid.R;
import com.sj.s_base.BaseActivity;
import com.sj.s_base.BaseRVAdapter;

import java.util.List;

/**
 * Created by SJ on 2019/2/13.
 */
public class FunctionAdapter extends BaseRVAdapter<Menu.Function, FunctionAdapter.ViewHolder> {


    public FunctionAdapter(Context context, List<Menu.Function> lists) {
        super(context, lists);
    }

    @Override
    protected int getResId() {
        return R.layout.item_function;
    }

    @Override
    protected ViewHolder getViewHolder(View view) {
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Menu.Function function = getLists().get(i);
        viewHolder.title.setText(function.getName());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Class cls = function.getCls();
                if (cls!=null) {
                    ((BaseActivity) context).startActivity(new Intent(context, cls));
                }
            }
        });
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);

        }
    }

}
