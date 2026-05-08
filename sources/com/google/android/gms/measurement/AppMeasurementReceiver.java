package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import defpackage.aug;
import defpackage.ewh;
import defpackage.i0i;
import defpackage.kzh;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementReceiver extends aug {
    public kzh c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new kzh(this);
        }
        kzh kzhVar = this.c;
        kzhVar.getClass();
        ewh ewhVar = i0i.b(context, null, null).X;
        i0i.i(ewhVar);
        if (intent == null) {
            ewhVar.X.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        ewhVar.c0.a(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                ewhVar.X.b("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        ewhVar.c0.b("Starting wakeful intent.");
        kzhVar.a.getClass();
        SparseArray<PowerManager.WakeLock> sparseArray = aug.a;
        synchronized (sparseArray) {
            try {
                int i = aug.b;
                int i2 = i + 1;
                aug.b = i2;
                if (i2 <= 0) {
                    aug.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
