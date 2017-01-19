package br.com.livroandroid.cap38.carrosgradle.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import br.com.livroandroid.cap38.carrosgradle.R;
import br.com.livroandroid.cap38.carrosgradle.domain.Carro;
import br.com.livroandroid.cap38.carrosgradle.fragments.MapaFragment;

public class MapaActivity extends BaseActivity {

    private Carro carro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mapa);

        // Configura a Toolbar como a action bar
        setUpToolbar();

        carro = (Carro) getIntent().getSerializableExtra("carro");
        getSupportActionBar().setTitle(carro.nome);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            // Adiciona o fragment no layout da activity
            MapaFragment mapaFragment = new MapaFragment();
            mapaFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().replace(R.id.fragLayout, mapaFragment).commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = NavUtils.getParentActivityIntent(getActivity());
                intent.putExtra("carro", carro);
                NavUtils.navigateUpTo(getActivity(), intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
