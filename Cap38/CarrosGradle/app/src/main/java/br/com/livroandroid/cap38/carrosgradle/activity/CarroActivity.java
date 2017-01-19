package br.com.livroandroid.cap38.carrosgradle.activity;

import android.os.Bundle;
import br.com.livroandroid.cap38.carrosgradle.R;
import br.com.livroandroid.cap38.carrosgradle.domain.Carro;
import br.com.livroandroid.cap38.carrosgradle.fragments.CarroFragment;

public class CarroActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_carro);

        // Configura a Toolbar como a action bar
        setUpToolbar();

        // Título da toolbar e botão up navigation
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Atualiza o carro no fragment
        CarroFragment cf = (CarroFragment) getSupportFragmentManager().findFragmentById(R.id.CarroFragment);
        Carro c = (Carro) getIntent().getSerializableExtra("carro");
        cf.setCarro(c);

        getSupportActionBar().setTitle(c.nome);
    }
}
