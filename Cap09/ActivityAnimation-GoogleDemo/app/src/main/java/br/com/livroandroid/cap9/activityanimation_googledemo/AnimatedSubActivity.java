package br.com.livroandroid.cap9.activityanimation_googledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AnimatedSubActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_anim_sub);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
