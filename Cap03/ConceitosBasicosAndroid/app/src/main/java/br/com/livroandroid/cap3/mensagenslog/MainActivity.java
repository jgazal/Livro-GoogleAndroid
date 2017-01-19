package br.com.livroandroid.cap3.mensagenslog;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import br.com.livroandroid.cap3.conceitosbasicosandroid.R;


public class MainActivity extends Activity {
    private static final String TAG = "livro";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "log de verbose");
        Log.d(TAG, "log de debug");
        Log.i(TAG, "log de info");
        Log.w(TAG, "log de alerta");
        Log.e(TAG, "log de erro", new RuntimeException("teste de erro"));
    }
}
