package br.com.livroandroid.cap33.helloreceiversms;

import android.content.Intent;
import android.telephony.SmsMessage;
import android.util.Log;

public class Sms {

    // Lê uma mensagem da intent interceptada pela ação
    public SmsMessage read(Intent intent) {
        SmsMessage[] mensagens = getMessagesFromIntent(intent);
        if (mensagens != null) {
            return mensagens[0];
        }
        return null;
    }

    private SmsMessage[] getMessagesFromIntent(Intent intent) {
        Object pdus[] = (Object[]) (Object[]) intent.getSerializableExtra("pdus");
        SmsMessage msgs[] = new SmsMessage[pdus.length];
        for (int i = 0; i < pdus.length; i++) {
            msgs[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
            String celular = msgs[0].getDisplayOriginatingAddress();
            String mensagem = msgs[0].getDisplayMessageBody();
        }
        return msgs;
    }
}
