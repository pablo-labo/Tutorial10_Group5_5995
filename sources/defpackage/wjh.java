package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class wjh {
    public static wjh e;
    public String a = null;
    public Boolean b = null;
    public Boolean c = null;
    public final ArrayDeque d = new ArrayDeque();

    public static synchronized wjh a() {
        try {
            if (e == null) {
                e = new wjh();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public final boolean b(Context context) {
        if (this.b == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.c == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c.booleanValue();
    }
}
