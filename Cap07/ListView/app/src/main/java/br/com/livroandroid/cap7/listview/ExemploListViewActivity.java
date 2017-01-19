package br.com.livroandroid.cap7.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class ExemploListViewActivity extends AppCompatActivity implements OnItemClickListener {
    protected static final String TAG = "livro";
    private ListView listView;
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_exemplo_listview);
        // ListView
        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(new SimplesAdapter(this));
        listView.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> parent, View view, int idx, long id) {
        String s = (String) parent.getAdapter().getItem(idx); // Objeto selecionado, que neste caso era de um array de strings
        Toast.makeText(this, "Texto selecionado: " + s + ", posição: " + idx, Toast.LENGTH_SHORT).show();
    }
}