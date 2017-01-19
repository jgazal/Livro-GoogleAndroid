package br.com.livroandroid.cap7.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.content.Context;

public class ExemploToggleButton extends AppCompatActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_exemplo_toggle_button);
        final ToggleButton toggle = (ToggleButton) findViewById(R.id.toggle);
        Button b = (Button) findViewById(R.id.btOK);
        final Context context = this;
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean selecionado = toggle.isChecked();
                Toast.makeText(context, "Selecionado: " + selecionado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}