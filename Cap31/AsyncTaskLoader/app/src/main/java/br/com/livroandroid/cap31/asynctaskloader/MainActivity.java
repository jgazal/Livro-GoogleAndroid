package br.com.livroandroid.cap31.asynctaskloader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import br.com.livroandroid.cap31.asynctaskloader.exemplo1.DownloadImagemAsyncTaskActivity;
import br.com.livroandroid.cap31.asynctaskloader.exemplo2.DownloadImagemFragmentActivity;
import br.com.livroandroid.cap31.asynctaskloader.exemplo3.DownloadImagemLoaderActivity;
import br.com.livroandroid.cap31.asynctaskloader.exemplo4.DownloadImagemTaskLechetaActivity;

public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.activity_main);

        String[] items = new String[] {
                "Download imagem - Activity com AsyncTask",
                "Download imagem - Fragment com AsyncTask",
                "Download imagem - Fragment com Loader",
                "Download imagem - Task do Lecheta",
        };

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
        listView.setOnItemClickListener(onListItemClick());
    }

    private AdapterView.OnItemClickListener onListItemClick() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    switch (position) {
                        case 0:
                            startActivity(new Intent(getBaseContext(),DownloadImagemAsyncTaskActivity.class));
                            break;
                        case 1:
                            startActivity(new Intent(getBaseContext(),DownloadImagemFragmentActivity.class));
                            break;
                        case 2:
                            startActivity(new Intent(getBaseContext(),DownloadImagemLoaderActivity.class));
                            break;
                        case 3:
                            startActivity(new Intent(getBaseContext(),DownloadImagemTaskLechetaActivity.class));
                            break;

                        default:
                            finish();
                            break;
                    }
                } catch (Exception e) {
                    Toast.makeText(getBaseContext(), "Erro :" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        };
    }
}