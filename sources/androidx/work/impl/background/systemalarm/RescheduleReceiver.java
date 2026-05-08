package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.w2h;
import defpackage.z39;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = z39.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        z39.d().a(a, "Received intent " + intent);
        try {
            w2h w2hVarA = w2h.a(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            w2hVarA.getClass();
            synchronized (w2h.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = w2hVarA.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    w2hVarA.i = pendingResultGoAsync;
                    if (w2hVarA.h) {
                        pendingResultGoAsync.finish();
                        w2hVarA.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            z39.d().c(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
