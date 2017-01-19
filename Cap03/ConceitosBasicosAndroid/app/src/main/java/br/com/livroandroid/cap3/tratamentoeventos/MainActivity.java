package br.com.livroandroid.cap3.tratamentoeventos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import br.com.livroandroid.cap3.conceitosbasicosandroid.R;

//Classe utilizando o conceito de classes anônimas do Java
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_eventos);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if ("jorge".equals(login) &&"123".equals(senha)){
                    alert("Bem-vindo, login realizado com sucesso");
                } else {
                    alert("Login e senha incorretos");
                }
            }
        });
    }
    private void alert(String s) {
        //A classe Toast mostra um alerta temporário
        Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
    }
}

