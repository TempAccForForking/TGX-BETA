package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import org.thunderdog.challegram.service.TGCallService;

public class VoIPMediaButtonReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        TGCallService w;
        if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && (w = TGCallService.m14210w()) != null) {
            w.m14249L((KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        }
    }
}
