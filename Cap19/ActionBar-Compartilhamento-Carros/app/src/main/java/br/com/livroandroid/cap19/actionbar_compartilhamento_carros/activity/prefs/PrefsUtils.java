package br.com.livroandroid.cap19.actionbar_compartilhamento_carros.activity.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PrefsUtils {
    private static final String PREF_CHECK_PUSH = "PREF_CHECK_PUSH";

    public static boolean isCheckPushOn(final Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getBoolean(PREF_CHECK_PUSH, false);
    }
}
