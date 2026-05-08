package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class sgh extends BroadcastReceiver {
    public xgh a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            xgh xghVar = this.a;
            if (xghVar == null) {
                return;
            }
            if (xghVar.c()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                xgh xghVar2 = this.a;
                xghVar2.d.f.schedule(xghVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
