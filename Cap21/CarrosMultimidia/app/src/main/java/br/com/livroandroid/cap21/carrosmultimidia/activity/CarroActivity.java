package br.com.livroandroid.cap21.carrosmultimidia.activity;

import android.os.Bundle;
import br.com.livroandroid.cap21.carrosmultimidia.R;
import br.com.livroandroid.cap21.carrosmultimidia.domain.Carro;
import br.com.livroandroid.cap21.carrosmultimidia.fragments.CarroFragment;

public class CarroActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_carro);

        // Configura a Toolbar como a action bar
        setUpToolbar();

        // Atualiza o carro no fragment
        CarroFragment cf = (CarroFragment) getSupportFragmentManager().findFragmentById(R.id.CarroFragment);
        Carro c = (Carro) getIntent().getSerializableExtra("carro");
        cf.setCarro(c);

        // Título da toolbar e botão up navigation
        getSupportActionBar().setTitle(c.nome);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
