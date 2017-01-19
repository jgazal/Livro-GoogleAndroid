package br.com.livroandroid.cap5.tabs;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import android.widget.ShareActionProvider;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Capítulo 5");

        //Configura a action bar para utilizar as tabs
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        // Cria as tabs (Passa como parâmetro o índice de cada tab: 1,2,3)
        actionBar.addTab(actionBar.newTab().setText("Tab 1").setTabListener(new MyTabListener(this,1)));
        actionBar.addTab(actionBar.newTab().setText("Tab 2").setTabListener(new MyTabListener(this,2)));
        actionBar.addTab(actionBar.newTab().setText("Tab 3").setTabListener(new MyTabListener(this,3)));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Infla o menu com os botões da action bar
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_search) {
            toast("Clicou no Search!");
            return true;
        } else if (id == R.id.action_refresh) {
            toast("Clicou no Refresh!");
            return true;
        } else if (id == R.id.action_settings) {
            toast("Clicou no Settings!");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}