package br.com.livroandroid.cap9.activityanimation_googledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * See WindowAnimations.java for comments on the overall application.
 * <p/>
 * This is a sub-activity which does not provide any custom animation. Exiting this
 * sub-activity therefore gets the default system behavior for window animations.
 */
public class SubActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
