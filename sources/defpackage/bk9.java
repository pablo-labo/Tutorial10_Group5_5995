package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.indeed.android.jobsearch.R;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class bk9 extends Service {
    public static final int a = new Random().nextInt(99999) + 10000;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        pla plaVar = new pla(this, "OngoingConferenceChannel");
        plaVar.p = "call";
        plaVar.e = pla.b(getString(R.string.media_projection_notification_title));
        plaVar.f = pla.b(getString(R.string.media_projection_notification_text));
        plaVar.j = -1;
        plaVar.c(2, false);
        plaVar.l = false;
        plaVar.c(16, true);
        plaVar.s = 1;
        plaVar.c(8, true);
        plaVar.w.icon = getResources().getIdentifier("ic_notification", "drawable", getPackageName());
        plaVar.u = 1;
        Notification notificationA = plaVar.a();
        int i3 = Build.VERSION.SDK_INT;
        int i4 = a;
        if (i3 >= 29) {
            startForeground(i4, notificationA, 32);
        } else {
            startForeground(i4, notificationA);
        }
        return 2;
    }
}
