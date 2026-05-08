package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import defpackage.aug;
import defpackage.eci;
import defpackage.ewh;
import defpackage.fei;
import defpackage.h1i;
import defpackage.i0i;
import defpackage.s9i;
import defpackage.wy3;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements eci {
    public wy3 a;

    @Override // defpackage.eci
    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = aug.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = aug.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.eci
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final wy3 c() {
        if (this.a == null) {
            this.a = new wy3(this, 4);
        }
        return this.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        wy3 wy3VarC = c();
        if (intent == null) {
            wy3VarC.g().f.b("onBind called with null intent");
            return null;
        }
        wy3VarC.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new h1i(fei.b((Service) wy3VarC.b));
        }
        wy3VarC.g().X.a(action, "onBind received unknown action");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ewh ewhVar = i0i.b((Service) c().b, null, null).X;
        i0i.i(ewhVar);
        ewhVar.c0.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ewh ewhVar = i0i.b((Service) c().b, null, null).X;
        i0i.i(ewhVar);
        ewhVar.c0.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        wy3 wy3VarC = c();
        if (intent == null) {
            wy3VarC.g().f.b("onRebind called with null intent");
            return;
        }
        wy3VarC.getClass();
        wy3VarC.g().c0.a(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final wy3 wy3VarC = c();
        final ewh ewhVar = i0i.b((Service) wy3VarC.b, null, null).X;
        i0i.i(ewhVar);
        if (intent == null) {
            ewhVar.X.b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        ewhVar.c0.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable(wy3VarC, i2, ewhVar, intent) { // from class: bci
            public final wy3 a;
            public final int b;
            public final ewh c;
            public final Intent d;

            {
                this.a = wy3VarC;
                this.b = i2;
                this.c = ewhVar;
                this.d = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wy3 wy3Var = this.a;
                eci eciVar = (eci) ((Service) wy3Var.b);
                int i3 = this.b;
                if (eciVar.zza(i3)) {
                    this.c.c0.a(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    wy3Var.g().c0.b("Completed wakeful intent.");
                    eciVar.a(this.d);
                }
            }
        };
        fei feiVarB = fei.b((Service) wy3VarC.b);
        feiVarB.zzq().m(new s9i(feiVarB, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        wy3 wy3VarC = c();
        if (intent == null) {
            wy3VarC.g().f.b("onUnbind called with null intent");
            return true;
        }
        wy3VarC.getClass();
        wy3VarC.g().c0.a(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }

    @Override // defpackage.eci
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }
}
