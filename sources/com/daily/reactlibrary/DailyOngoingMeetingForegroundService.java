package com.daily.reactlibrary;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.pla;

/* JADX INFO: loaded from: classes.dex */
public class DailyOngoingMeetingForegroundService extends Service {
    public static Class<? extends Activity> a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra = intent.getStringExtra("title");
        if (stringExtra == null) {
            stringExtra = "In a call";
        }
        String stringExtra2 = intent.getStringExtra("subtitle");
        if (stringExtra2 == null) {
            stringExtra2 = "You're in a call. Tap to open it.";
        }
        String stringExtra3 = intent.getStringExtra("icon_name");
        if (stringExtra3 == null) {
            stringExtra3 = "ic_daily_videocam_24dp";
        }
        int identifier = getResources().getIdentifier(stringExtra3, "drawable", getPackageName());
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, a), 67108864);
        pla plaVar = new pla(this, "dailyOngoingMeetingNotificationChannel");
        plaVar.e = pla.b(stringExtra);
        plaVar.f = pla.b(stringExtra2);
        plaVar.w.icon = identifier;
        plaVar.g = activity;
        plaVar.c(16, false);
        plaVar.p = "call";
        plaVar.c(2, true);
        plaVar.s = 1;
        plaVar.c(8, true);
        startForeground(1, plaVar.a());
        return 2;
    }
}
