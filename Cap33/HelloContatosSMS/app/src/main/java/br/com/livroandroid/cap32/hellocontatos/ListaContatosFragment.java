package br.com.livroandroid.cap32.hellocontatos;

import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import br.com.livroandroid.cap32.hellocontatos.agenda.Agenda;
import br.com.livroandroid.cap32.hellocontatos.agenda.Contato;
import livroandroid.lib.utils.IntentUtils;

public class ListaContatosFragment extends Fragment implements AdapterView.OnItemClickListener{
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        Agenda a = new Agenda(getActivity());
        final Contato c = a.getContatoById(id);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("SMS para: " + c.nome);
        builder.setItems(R.array.popup_sms, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String fone = c.fones.get(0);
                if(which == 0){ //Envia SMS por intent
                    IntentUtils.sendSms(getActivity(), fone, "Olá " + c.nome + "tudo bem?");
                }else{ //Envia SMS pela API
                    Sms sms = new Sms();
                    sms.send(getActivity(), fone,"Olá " + c.nome + "tudo bem?");
                    Toast.makeText(getActivity(), "SMS enviado para: " + c.nome,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public static class IntentUtils{
        public static void sendSms(Context context, String fone, String msg){
            Uri uri = Uri.parse("sms:"+fone);
            Intent intent = new Intent(Intent.ACTION_SEND, uri);
            intent.putExtra("sms_body", msg);
            context.startActivity(intent);
        }
    }
}
