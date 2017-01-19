package br.com.livroandroid.cap24.helloreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class HelloReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context c, Intent intent) {
        Log.d("livroandroid", "HelloReceiver !!!");
    }
}
