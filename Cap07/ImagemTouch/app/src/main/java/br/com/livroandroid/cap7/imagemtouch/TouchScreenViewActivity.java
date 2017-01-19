package br.com.livroandroid.cap7.imagemtouch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TouchScreenViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TouchScreenView(this));
    }
}
