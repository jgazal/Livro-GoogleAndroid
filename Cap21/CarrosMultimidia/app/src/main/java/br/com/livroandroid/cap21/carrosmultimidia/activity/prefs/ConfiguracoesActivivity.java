package br.com.livroandroid.cap21.carrosmultimidia.activity.prefs;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.widget.Toast;
import br.com.livroandroid.cap21.carrosmultimidia.R;

@SuppressWarnings("ALL")
public class ConfiguracoesActivivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

        Toast.makeText(this, "isCheckPushOn: " + PrefsUtils.isCheckPushOn(this), Toast.LENGTH_SHORT).show();
    }
}
