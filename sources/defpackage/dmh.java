package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class dmh implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public tlh e;
    public boolean f;

    public dmh(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new v8a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "flush queue called");
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "found intent to be delivered");
                }
                tlh tlhVar = this.e;
                if (tlhVar == null || !tlhVar.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        boolean z = !this.f;
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("binder is dead. start connection? ");
                        sb.append(z);
                        Log.d("FirebaseInstanceId", sb.toString());
                    }
                    if (!this.f) {
                        this.f = true;
                        try {
                            if (zo2.b().a(this.a, this.b, this, 65)) {
                                return;
                            } else {
                                Log.e("FirebaseInstanceId", "binding to the service failed");
                            }
                        } catch (SecurityException e) {
                            Log.e("FirebaseInstanceId", "Exception while binding the service", e);
                        }
                        this.f = false;
                        ArrayDeque arrayDeque = this.d;
                        while (!arrayDeque.isEmpty()) {
                            ((amh) arrayDeque.poll()).b.trySetResult(null);
                        }
                    }
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
                }
                this.e.a((amh) this.d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            this.f = false;
            if (iBinder instanceof tlh) {
                this.e = (tlh) iBinder;
                a();
                return;
            }
            String strValueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(strValueOf2);
            Log.e("FirebaseInstanceId", sb2.toString());
            ArrayDeque arrayDeque = this.d;
            while (!arrayDeque.isEmpty()) {
                ((amh) arrayDeque.poll()).b.trySetResult(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        a();
    }
}
