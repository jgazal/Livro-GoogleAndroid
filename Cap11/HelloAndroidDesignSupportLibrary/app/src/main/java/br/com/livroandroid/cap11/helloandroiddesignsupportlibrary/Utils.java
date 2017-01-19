package br.com.livroandroid.cap11.helloandroiddesignsupportlibrary;

import android.content.Context;

public class Utils {

    public static int getToolbarHeight(Context context) {
        int height = (int) context.getResources().getDimension(R.dimen.abc_action_bar_default_height_material);
        return height;
    }
}
