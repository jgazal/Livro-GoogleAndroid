package br.com.livroandroid.cap7.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ExemploAutoCompleteTextViewActivity extends AppCompatActivity {
    private static final String[] ESTADOS = new String[]{"Acre", "Alagoas", "Amapá", "Amazonas",
            "Bahia", "Ceará", "Distrito Federal", "Goiás", "Espírito Santo", "Maranhão",
            "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná",
            "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grandedo Norte", "Rio Grande do Sul",
            "Rondônia", "Roraima", "São Paulo", "Santa Catarina", "Sergipe", "Tocantins"
    };

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_exemplo_auto_complete_text_view);
        AutoCompleteTextView estados = (AutoCompleteTextView) findViewById(R.id.estados);
        // ArrayAdapter para preencher com os estados
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.
                simple_dropdown_item_1line, ESTADOS);
        estados.setAdapter(adaptador);
    }
}