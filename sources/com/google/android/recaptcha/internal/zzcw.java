package com.google.android.recaptcha.internal;

import defpackage.u63;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcw extends TimerTask {
    final /* synthetic */ zzda zza;
    final /* synthetic */ zziu zzb;

    public zzcw(zzda zzdaVar, zziu zziuVar) {
        this.zza = zzdaVar;
        this.zzb = zziuVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzda zzdaVar = this.zza;
        u63.Y(zzdaVar.zzg.zzd(), null, null, new zzcv(zzdaVar, this.zzb, null), 3);
    }
}
