package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public final class ytg {
    public static final String a = z39.f("WakeLocks");

    public static final PowerManager.WakeLock a(Context context, String str) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (ztg.a) {
            ztg.b.put(wakeLockNewWakeLock, strConcat);
        }
        wakeLockNewWakeLock.getClass();
        return wakeLockNewWakeLock;
    }
}
