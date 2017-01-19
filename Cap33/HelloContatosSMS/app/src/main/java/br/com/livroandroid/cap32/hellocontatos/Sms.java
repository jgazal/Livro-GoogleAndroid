package br.com.livroandroid.cap32.hellocontatos;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.util.Log;

public class Sms {
    private static final String TAG = "livro";

    //Envia um SMS para o número indiacado
    public void send(Context context, String to, String msg) {
        try {
            SmsManager smsManager = SmsManager.getDefault();
            PendingIntent pIntent = PendingIntent.getBroadcast(context, 0, new Intent(), 0);
            smsManager.sendTextMessage(to, null, msg, pIntent, null);
            Log.d(TAG, "Sms.send to["+to+"] msg["+msg+"]");
        }catch (Exception e){
            Log.e(TAG, "Erro ao enviar o SMS: " + e.getMessage(), e);
        }
    }
}