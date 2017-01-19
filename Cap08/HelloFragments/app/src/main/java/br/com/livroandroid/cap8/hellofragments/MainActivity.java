package br.com.livroandroid.cap8.hellofragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // O FragmentManager é necessário para interagir com os fragments
        FragmentManager fm = getSupportFragmentManager();
    }
}