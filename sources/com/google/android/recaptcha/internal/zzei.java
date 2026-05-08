package com.google.android.recaptcha.internal;

import defpackage.ak2;
import defpackage.m6;
import defpackage.u40;
import defpackage.zve;

/* JADX INFO: loaded from: classes2.dex */
public final class zzei implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strY = zve.Y(10, String.valueOf(this.zzb / ((long) this.zza)));
        String strY2 = zve.Y(10, String.valueOf(this.zzc));
        return m6.h(u40.f("avgExecutionTime: ", strY, " us| maxExecutionTime: ", strY2, " us| totalTime: "), zve.Y(10, String.valueOf(this.zzb)), " us| #Usages: ", zve.Y(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzei zzeiVar) {
        return ak2.i(Long.valueOf(this.zzb), Long.valueOf(zzeiVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
