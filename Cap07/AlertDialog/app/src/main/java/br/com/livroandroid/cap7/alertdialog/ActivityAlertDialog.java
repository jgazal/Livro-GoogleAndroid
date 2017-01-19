package br.com.livroandroid.cap7.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityAlertDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_launcher);
        builder.setTitle("Titulo");
        builder.setMessage("Mensagem");
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which){
                Toast.makeText(getBaseContext(), "Clicou em Sim!", Toast.LENGTH_SHORT).show();
                return;
            }});
        builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int Não) {
                Toast.makeText(getBaseContext(), "Clicou em Não!", Toast.LENGTH_SHORT).show();
                return;
            }});
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
