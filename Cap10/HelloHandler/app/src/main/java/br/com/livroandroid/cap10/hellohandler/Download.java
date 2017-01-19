package br.com.livroandroid.cap10.hellohandler;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Download {
    public static Bitmap downloadBitmap(String url) throws IOException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        // Faz o download da imagem
        Bitmap bitmap = null;
        InputStream in = new URL(url).openStream();
        // Converte a InputStream do Java para Bitmap
        bitmap = BitmapFactory.decodeStream(in);
        in.close();
        return bitmap;
    }
}
