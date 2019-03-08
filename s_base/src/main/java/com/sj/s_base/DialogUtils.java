package com.sj.s_base;

import android.app.AlertDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by SJ on 2019/2/13.
 */
public class DialogUtils {
    public static void showReminder(Context context, String title, String msg, final DialogConfirmListener confirmListener, final DialogCancelListener cancelListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_reminder_layout, null);
        builder.setView(view);
        builder.setCancelable(false);
        final AlertDialog dialog = builder.create();
        TextView titleTv = (TextView) view.findViewById(R.id.title);
        if (TextUtils.isEmpty(title)) {
            titleTv.setVisibility(View.GONE);
        }else {
            titleTv.setText(title);
        }
        TextView messageTv = (TextView) view.findViewById(R.id.message);
        messageTv.setText(msg);
        TextView cancel = (TextView) view.findViewById(R.id.cancel);
        if (cancelListener != null) {
            cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    cancelListener.cancel();
                }
            });
        } else {
            cancel.setVisibility(View.GONE);
        }
        final TextView confirm = (TextView) view.findViewById(R.id.confirm);
        if (confirmListener != null) {
            confirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    confirmListener.confirm();
                }
            });
        } else {
            confirm.setVisibility(View.GONE);
        }
        if (confirmListener == null&&cancelListener == null) {
            dialog.setCancelable(true);
        }
        dialog.show();
    }

    public static void showReminder(Context context, String title, String msg,DialogConfirmListener confirmListener) {
        showReminder(context, title, msg, confirmListener, null);
    }

    public static void showReminder(Context context, String title, String msg,DialogCancelListener cancelListener) {
        showReminder(context, title, msg, null, cancelListener);
    }

    public static void showReminder(Context context, String title, String msg) {
        showReminder(context, title, msg, null, null);
    }


    public static AlertDialog showCustomCancel(Context context, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(view);
        builder.setCancelable(true);
        AlertDialog dialog = builder.create();
        dialog.show();
        return dialog;
    }

    public static AlertDialog showCustom(Context context, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(view);
        builder.setCancelable(false);
        AlertDialog dialog = builder.create();
        dialog.show();
        return dialog;
    }

    public interface DialogCancelListener {
        void cancel();
    }

    public interface DialogConfirmListener {
        void confirm();
    }
}
