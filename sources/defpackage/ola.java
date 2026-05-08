package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class ola extends rla {
    public CharSequence b;

    @Override // defpackage.rla
    public final void a(sla slaVar) {
        new Notification.BigTextStyle(slaVar.b).setBigContentTitle(null).bigText(this.b);
    }

    @Override // defpackage.rla
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
