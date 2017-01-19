package br.com.livroandroid.cap7.titlestrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import java.util.List;

public class ExemploViewPagerTabStripActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.activity_exemplo_view_pager_tab_strip);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Planetas
        List<Planeta> planetas = Planeta.getPlanetas();

        // ViewPager
        ViewPager g = (ViewPager) findViewById(R.id.viewPager);
        g.setAdapter(new PlanetasPagerAdapter(this, planetas));
    }
}
