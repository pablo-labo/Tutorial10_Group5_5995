package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class xgh implements Runnable {
    public static Boolean V;
    public static Boolean W;
    public static final Object f = new Object();
    public final Context a;
    public final xih b;
    public final PowerManager.WakeLock c;
    public final lgh d;
    public final long e;

    public xgh(lgh lghVar, Context context, xih xihVar, long j) {
        this.d = lghVar;
        this.a = context;
        this.e = j;
        this.b = xihVar;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zB;
        synchronized (f) {
            try {
                Boolean bool = V;
                zB = bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue();
                V = Boolean.valueOf(zB);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zB;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder(str.length() + 142);
            sb.append("Missing Permission: ");
            sb.append(str);
            sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            Log.d("FirebaseMessaging", sb.toString());
        }
        return z;
    }

    public static boolean d(Context context) {
        boolean zB;
        synchronized (f) {
            try {
                Boolean bool = W;
                zB = bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue();
                W = Boolean.valueOf(zB);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zB;
    }

    public final synchronized boolean c() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        lgh lghVar = this.d;
        Context context = this.a;
        boolean zA = a(context);
        PowerManager.WakeLock wakeLock = this.c;
        if (zA) {
            wakeLock.acquire(180000L);
        }
        boolean z = true;
        try {
            try {
                lghVar.c(true);
                if (this.b.c() == 0) {
                    z = false;
                }
                if (!z) {
                    lghVar.c(false);
                    if (a(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (!d(context) || c()) {
                    if (lghVar.d()) {
                        lghVar.c(false);
                    } else {
                        lghVar.b(this.e);
                    }
                    if (a(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                sgh sghVar = new sgh();
                sghVar.a = this;
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity change received registered");
                }
                context.registerReceiver(sghVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (a(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } catch (IOException e) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseMessaging", strValueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(strValueOf) : new String("Failed to sync topics. Won't retry sync. "));
                lghVar.c(false);
                if (a(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th) {
            if (a(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
