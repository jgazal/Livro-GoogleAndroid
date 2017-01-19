package br.com.livroandroid.cap7.canvas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ExemploMinhaViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(new MinhaView(this));
    }
}