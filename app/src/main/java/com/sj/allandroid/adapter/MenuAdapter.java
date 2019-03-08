package com.sj.allandroid.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sj.allandroid.data.Menu;
import com.sj.allandroid.R;
import com.sj.s_base.BaseRVAdapter;

import java.util.List;

/**
 * Created by SJ on 2019/2/13.
 */
public class MenuAdapter extends BaseRVAdapter<Menu, MenuAdapter.ViewHolder> {

    private int[] picId;

    public MenuAdapter(Context context, List<Menu> lists) {
        super(context, lists);
        picId = new int[]{
                R.drawable.menu_1,
                R.drawable.menu_2,
                R.drawable.menu_3,
                R.drawable.menu_4,
                R.drawable.menu_6,
                R.drawable.menu_7};
    }

    @Override
    protected int getResId() {
        return R.layout.item_menu;
    }

    @Override
    protected ViewHolder getViewHolder(View view) {
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.itemView.setBackgroundResource(picId[i%picId.length]);
        viewHolder.itemView.getBackground().setAlpha(200);
        Menu menu = getLists().get(i);
        viewHolder.title.setText(menu.getTitle());
        viewHolder.functionRv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        viewHolder.functionRv.setAdapter(new FunctionAdapter(context, menu.getFunctions()));
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private RecyclerView functionRv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.title);
            functionRv = (RecyclerView) itemView.findViewById(R.id.function_rv);

        }
    }

}
