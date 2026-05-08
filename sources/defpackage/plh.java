package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class plh implements Runnable {
    public final long a;
    public final PowerManager.WakeLock b;
    public final FirebaseInstanceId c;

    @VisibleForTesting
    public plh(FirebaseInstanceId firebaseInstanceId, long j) {
        this.c = firebaseInstanceId;
        this.a = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final Context a() {
        pf5 pf5Var = this.c.b;
        pf5Var.a();
        return pf5Var.a;
    }

    @VisibleForTesting
    public final boolean b() throws IOException {
        FirebaseInstanceId firebaseInstanceId = this.c;
        pf5 pf5Var = firebaseInstanceId.b;
        ekh ekhVarF = firebaseInstanceId.f(xih.b(pf5Var), "*");
        if (firebaseInstanceId.e(ekhVarF)) {
            try {
                String strG = firebaseInstanceId.g();
                if (strG == null) {
                    Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                    return false;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Token successfully retrieved");
                }
                if (ekhVarF == null || !strG.equals(ekhVarF.a)) {
                    pf5Var.a();
                    if ("[DEFAULT]".equals(pf5Var.b)) {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            pf5Var.a();
                            String strValueOf = String.valueOf(pf5Var.b);
                            Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(strValueOf) : new String("Invoking onNewToken for app: "));
                        }
                        Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                        intent.putExtra("token", strG);
                        Context contextA = a();
                        Intent intent2 = new Intent(contextA, (Class<?>) FirebaseInstanceIdReceiver.class);
                        intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                        intent2.putExtra("wrapped_intent", intent);
                        contextA.sendBroadcast(intent2);
                    }
                }
            } catch (IOException e) {
                String message = e.getMessage();
                if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                String message2 = e.getMessage();
                StringBuilder sb = new StringBuilder(uz.c(52, message2));
                sb.append("Token retrieval failed: ");
                sb.append(message2);
                sb.append(". Will retry token retrieval");
                Log.w("FirebaseInstanceId", sb.toString());
                return false;
            } catch (SecurityException unused) {
                Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        boolean z;
        FirebaseInstanceId firebaseInstanceId = this.c;
        PowerManager.WakeLock wakeLock = this.b;
        if (wjh.a().b(a())) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseInstanceId) {
                    z = true;
                    firebaseInstanceId.g = true;
                }
                if (!(firebaseInstanceId.c.c() != 0)) {
                    synchronized (firebaseInstanceId) {
                        firebaseInstanceId.g = false;
                    }
                    if (wjh.a().b(a())) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (wjh.a().c(a())) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        z = false;
                    }
                    if (!z) {
                        mlh mlhVar = new mlh();
                        mlhVar.a = this;
                        mlhVar.a();
                        if (wjh.a().b(a())) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                }
                if (b()) {
                    synchronized (firebaseInstanceId) {
                        firebaseInstanceId.g = false;
                    }
                } else {
                    firebaseInstanceId.b(this.a);
                }
                if (wjh.a().b(a())) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                synchronized (firebaseInstanceId) {
                    firebaseInstanceId.g = false;
                    if (wjh.a().b(a())) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (wjh.a().b(a())) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
