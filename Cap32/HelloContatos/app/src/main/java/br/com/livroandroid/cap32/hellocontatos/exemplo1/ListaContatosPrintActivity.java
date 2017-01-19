package br.com.livroandroid.cap32.hellocontatos.exemplo1;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.List;
import br.com.livroandroid.cap32.hellocontatos.R;
import br.com.livroandroid.cap32.hellocontatos.adapter.ContatoAdapter;
import br.com.livroandroid.cap32.hellocontatos.agenda.Agenda;
import br.com.livroandroid.cap32.hellocontatos.agenda.Contato;

/**
 * Utiliza a classe Agenda para buscar no content contatos.
 */
public class ListaContatosPrintActivity extends AppCompatActivity {

    private static final String TAG = "livroandroid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contatos);

        printContatos();
    }

    private void printContatos() {
        // Uri: "content://com.android.contacts/contacts"
        Uri contatos = ContactsContract.Contacts.CONTENT_URI;
        Cursor cursor = getContentResolver().query(contatos, null, ContactsContract.Contacts.HAS_PHONE_NUMBER +" = 1 ", null, null);
        int count = cursor.getCount();
        Log.i(TAG,"Foram encontrados "+count+" contatos.");
        while(cursor.moveToNext()){
            String nome = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
            Log.i(TAG,"Nome: " + nome);
        }
        // É importante fechar o cursor no final
        cursor.close();
    }
}
