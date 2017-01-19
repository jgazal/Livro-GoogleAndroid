package br.com.livroandroid.cap38.mylib;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static void toast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
