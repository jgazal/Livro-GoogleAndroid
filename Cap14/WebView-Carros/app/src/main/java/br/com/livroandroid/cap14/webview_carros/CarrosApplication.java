package br.com.livroandroid.cap14.webview_carros;

import android.app.Application;
import android.util.Log;

public class CarrosApplication extends Application {
    private static final String TAG = "CarrosApplication";
    // Singleton
    private static CarrosApplication instance = null;

    public static CarrosApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "CarrosApplication.onCreate()");
        // Salva a instância para termos acesso como Singleton
        instance = this;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "CarrosApplication.onTerminate()");
    }
}
