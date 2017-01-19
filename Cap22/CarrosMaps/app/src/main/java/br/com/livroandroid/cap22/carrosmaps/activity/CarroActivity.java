package br.com.livroandroid.cap22.carrosmaps.activity;

import android.os.Bundle;
import br.com.livroandroid.cap22.carrosmaps.R;
import br.com.livroandroid.cap22.carrosmaps.domain.Carro;
import br.com.livroandroid.cap22.carrosmaps.fragments.CarroFragment;
import static br.com.livroandroid.cap22.carrosmaps.R.id.CarroFragment;

public class CarroActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_carro);

        // Configura a Toolbar como a action bar
        setUpToolbar();

        // Atualiza o carro no fragment
        CarroFragment cf = (CarroFragment) getSupportFragmentManager().findFragmentById(CarroFragment);
        Carro c = (Carro) getIntent().getSerializableExtra("carro");
        cf.setCarro(c);

        // Título da toolbar e botão up navigation
        getSupportActionBar().setTitle(c.nome);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
