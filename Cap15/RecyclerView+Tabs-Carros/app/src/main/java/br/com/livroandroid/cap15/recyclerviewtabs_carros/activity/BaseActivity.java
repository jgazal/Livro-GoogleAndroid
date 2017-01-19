package br.com.livroandroid.cap15.recyclerviewtabs_carros.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import br.com.livroandroid.cap15.recyclerviewtabs_carros.CarrosApplication;
import br.com.livroandroid.cap15.recyclerviewtabs_carros.R;

public class BaseActivity extends livroandroid.lib.activity.BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CarrosApplication app = CarrosApplication.getInstance();
    }

    protected void setUpToolbar() {
        // fazer import android.support.v7.widget.Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
    }
}
