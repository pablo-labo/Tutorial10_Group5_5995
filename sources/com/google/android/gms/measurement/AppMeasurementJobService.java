package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import defpackage.eci;
import defpackage.ewh;
import defpackage.fei;
import defpackage.i0i;
import defpackage.m2i;
import defpackage.s9i;
import defpackage.wy3;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements eci {
    public wy3 a;

    @Override // defpackage.eci
    public final void a(Intent intent) {
    }

    @Override // defpackage.eci
    @TargetApi(24)
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final wy3 c() {
        if (this.a == null) {
            this.a = new wy3(this, 4);
        }
        return this.a;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        wy3 wy3VarC = c();
        ewh ewhVar = i0i.b((Service) wy3VarC.b, null, null).X;
        i0i.i(ewhVar);
        String string = jobParameters.getExtras().getString(RumEventDeserializer.EVENT_TYPE_ACTION);
        ewhVar.c0.a(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m2i m2iVar = new m2i(wy3VarC, ewhVar, jobParameters);
        fei feiVarB = fei.b((Service) wy3VarC.b);
        feiVarB.zzq().m(new s9i(feiVarB, m2iVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
        throw new UnsupportedOperationException();
    }
}
