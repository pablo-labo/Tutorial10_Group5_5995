package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.n20;
import defpackage.pf5;
import defpackage.wjh;
import defpackage.xki;
import defpackage.ywh;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingService extends ywh {
    public static final ArrayDeque f = new ArrayDeque(10);

    @Override // defpackage.ywh
    public final Intent a(Intent intent) {
        return (Intent) wjh.a().d.poll();
    }

    @Override // defpackage.ywh
    public final boolean b(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!xki.b(intent)) {
            return true;
        }
        if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
            n20 n20Var = (n20) pf5.c().b(n20.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (n20Var != null) {
                String stringExtra = intent.getStringExtra("google.c.a.c_id");
                n20Var.c(stringExtra);
                Bundle bundle = new Bundle();
                bundle.putString("source", "Firebase");
                bundle.putString("medium", "notification");
                bundle.putString("campaign", stringExtra);
                n20Var.a("fcm", "_cmp", bundle);
            } else {
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
        xki.a(intent, "_no");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    @Override // defpackage.ywh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Intent r11) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }

    public void f(RemoteMessage remoteMessage) {
    }

    public void g(String str) {
    }
}
