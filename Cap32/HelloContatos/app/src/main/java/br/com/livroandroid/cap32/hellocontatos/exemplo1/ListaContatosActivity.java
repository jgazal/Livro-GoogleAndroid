package br.com.livroandroid.cap32.hellocontatos.exemplo1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.List;
import br.com.livroandroid.cap32.hellocontatos.R;
import br.com.livroandroid.cap32.hellocontatos.adapter.ContatoAdapter;
import br.com.livroandroid.cap32.hellocontatos.agenda.Agenda;
import br.com.livroandroid.cap32.hellocontatos.agenda.Contato;

//Utiliza a classe Agenda para buscar no content contatos.
public class ListaContatosActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contatos);

        final ListView listView = (ListView) findViewById(br.com.livroandroid.cap32.hellocontatos.R.id.listView);
        listView.setOnItemClickListener(this);

        // Lista os contatos
        Agenda a = new Agenda(this);
        List<Contato> contatos = a.getContatos();
        ContatoAdapter adapter = new ContatoAdapter(getBaseContext(), contatos);
        listView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Agenda a = new Agenda(this);
        Contato c = a.getContatoById(id);
        Toast.makeText(this, "Ex1: " + c.nome, Toast.LENGTH_SHORT).show();
        c.show(this);
    }
}
