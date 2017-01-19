package br.com.livroandroid.cap3.tratamentoeventos2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import br.com.livroandroid.cap3.conceitosbasicosandroid.R;

//Classe da activity implementado a interface View.OnClickListener,e utilizando o
//this(self) para referenciar a própria instância da classe para tratar o evento.
public class MainActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_eventos);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this); //O this representa a instância da classe
    }
            @Override
            public void onClick(View v) {   //A propria classe implementa View.OnClickListener
                //Código que trata o evento
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
    private void alert(String s) {
        //A classe Toast mostra um alerta temporário
        Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
    }
}
//A desvantagem dessa implementação é que, se tiver mais de um botão na tela, o mesmo método
//onClick(view) será chamado para todos os botões. Nesse caso o parâmetro View indica qual
//componente gerou o evento, e deve ser utilizado para descobrir em qual botão foi feito o
//clique, conforme demonstrado a seguir.
/*
public class MainActivity extends Activity implements OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
        Button btOk1 = (Button) findViewById(R.id.botaoOk);
        Button btOk2 = (Button) findViewById(R.id.botaoOk2);
// Vamos imaginar que existem dois botões na tela
        btOk1.setOnClickListener(this);
        btOk2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (view.getId() == R.id.botaoOk) {
            //clicou no botão 1
        } else if (view.getId() == R.id.botaoOk2) {
            //clicou no botão 2
        }
    }
 }
*/

//-----------------------------------------------------------------------------------------------
//Vejamos outra forma de escrever o mesmo código que é criar um método para cada botão.
//A vantagem é que fica simples separar cada clique em um método dferente.
/*
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
        Button btlogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnclickListener(onClickLogin());
        //O método onClickLogin() retorna uma implementação de View.onClickListener
        private View.onClickListener.onClickLogin() {
        return new Button.OnClickListener() {
        public void onClick(View v) {
        //Trata os eventos aqui
        }
    };
 }
 }
 */

//-----------------------------------------------------------------------------------------------
//Existe uma última maneira de tratar os eventos, definindo o nome do método que deve ser
//chamado no arquivo XML de layout.
/*
<Button android:id="@+id/btLogin
    android:layout_width="wrap_content"
    android:layout_heigth="wrap_content"
    android:layout_margin="6dp"
    android:text="Login"
    android:onClick="onClickBtLogin"/>
 */
//Nesse caso o atributo android:onClick="onClickBtLogin" informa que o método onClickBtLogin(view)
//será chamado na classe da activity e deve existir, conforme demostrado a seguir:
/*
public void onClickBtLogin(View view) {
    //trata o evento de clique
}
 */


