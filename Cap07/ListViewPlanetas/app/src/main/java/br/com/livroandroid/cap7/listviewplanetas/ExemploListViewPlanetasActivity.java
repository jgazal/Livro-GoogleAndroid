package br.com.livroandroid.cap7.listviewplanetas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ExemploListViewPlanetasActivity extends AppCompatActivity implements OnItemClickListener {
    protected static final String TAG = "livro";
    private ListView listView;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_exemplo_list_view_planetas);
        // ListView
        listView = (ListView) findViewById(R.id.listview);
        List<Planeta> planetas = Planeta.getPlanetas();
        listView.setAdapter(new PlanetaAdapter(this, planetas));
        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int idx, long id) {
        Planeta p = (Planeta) parent.getAdapter().getItem(idx);
        Toast.makeText(this, "Planeta: " + p.nome, Toast.LENGTH_SHORT).show();
    }
}