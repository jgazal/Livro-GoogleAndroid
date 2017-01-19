package br.com.livroandroid.cap33.helloreceiversms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import android.util.Log;
import livroandroid.lib.utils.NotificationUtil;

public class SMSReceiver extends BroadcastReceiver {
    private static final String TAG = "livroandroid";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, ">" + intent.getAction());
        Sms sms = new Sms();
        // Lê a mensagem
        SmsMessage msg = sms.read(intent);
        String celular = msg.getDisplayOriginatingAddress();
        String mensagem = msg.getDisplayMessageBody();
        Log.d(TAG, "SMSReceiver: sms[" + celular + "] -> " + mensagem);
        NotificationUtil.create(context, 1, new Intent(context, MainActivity.class),
                R.mipmap.ic_launcher, "Novo SMS de: " + celular, mensagem);
    }
}
