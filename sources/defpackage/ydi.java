package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class ydi extends bei {
    public final AlarmManager d;
    public final vdi e;
    public Integer f;

    public ydi(fei feiVar) {
        super(feiVar);
        this.d = (AlarmManager) this.a.a.getSystemService("alarm");
        this.e = new vdi(this, feiVar.X, feiVar);
    }

    @Override // defpackage.bei
    public final boolean i() {
        i0i i0iVar = this.a;
        Context context = i0iVar.a;
        this.d.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0));
        ((JobScheduler) i0iVar.a.getSystemService("jobscheduler")).cancel(m());
        return false;
    }

    public final void l() {
        g();
        zzr().c0.b("Unscheduling upload");
        i0i i0iVar = this.a;
        Context context = i0iVar.a;
        this.d.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0));
        this.e.c();
        ((JobScheduler) i0iVar.a.getSystemService("jobscheduler")).cancel(m());
    }

    public final int m() {
        if (this.f == null) {
            String strValueOf = String.valueOf(this.a.a.getPackageName());
            this.f = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.f.intValue();
    }
}
