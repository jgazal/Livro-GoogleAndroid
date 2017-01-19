package br.com.livroandroid.cap7.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        ImageView imagem = new ImageView(this);
        imagem.setImageResource(R.drawable.smile);
        Toast toast = new Toast(this);
        toast.setView(imagem);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
}
