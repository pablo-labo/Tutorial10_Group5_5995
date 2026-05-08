package com.google.android.recaptcha.internal;

import defpackage.u63;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public final class zzih extends TimerTask {
    final /* synthetic */ zzik zza;

    public zzih(zzik zzikVar) {
        this.zza = zzikVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        try {
            zzik zzikVar = this.zza;
            u63.Y(zzikVar.zze.zza(), null, null, new zzii(zzikVar, null), 3);
        } catch (Exception unused) {
        }
    }
}
