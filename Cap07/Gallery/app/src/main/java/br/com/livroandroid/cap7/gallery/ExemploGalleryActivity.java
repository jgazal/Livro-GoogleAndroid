package br.com.livroandroid.cap7.gallery;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class ExemploGalleryActivity extends AppCompatActivity {

    // Planetas
    private int[] imagens = {R.drawable.planeta_01_mercurio, R.drawable.planeta_02_venus,
            R.drawable.planeta_03_terra, R.drawable.planeta_04_marte, R.drawable.planeta_05_jupiter,
            R.drawable.planeta_06_saturno, R.drawable.planeta_07_urano, R.drawable.planeta_08_neptuno,
            R.drawable.planeta_09_plutao};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_exemplo_gallery);
        Gallery g = (Gallery) findViewById(R.id.gallery);
        g.setAdapter(new ImagemAdapter(this, imagens));
        g.setOnItemClickListener(onGalleryItemClick(this));
    }

    private OnItemClickListener onGalleryItemClick(final Context context) {
        return new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int posicao, long id) {
                // Exemplo de alerta com Toast com uma view dentro
                // Geralmente o Toast é apenas um texto
                ImageView imgView = new ImageView(context);
                imgView.setImageResource(imagens[posicao]);
                Toast t = new Toast(context);
                t.setView(imgView);
                t.show();
            }
        };
    }
}

