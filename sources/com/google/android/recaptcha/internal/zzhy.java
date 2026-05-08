package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.wl7;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhy {
    private final Application zza;
    private final zzjl zzb;
    private final zzer zzc;
    private final zzbf zzd;
    private final zzem zze;
    private final zzia zzf;
    private final zzet zzg;
    private final zzeh zzh;
    private final zzjt zzi;
    private final zzfq zzj;
    private final zzji zzk;
    private final zzes zzl;
    private final zzfa zzm;
    private final zzdw zzn;

    public zzhy(Application application, zzjl zzjlVar, zzer zzerVar, zzfq zzfqVar, zzji zzjiVar, zzes zzesVar, zzfa zzfaVar, zzbf zzbfVar, zzem zzemVar, zzia zziaVar, zzet zzetVar, zzeh zzehVar, zzjt zzjtVar, zzdw zzdwVar) {
        this.zza = application;
        this.zzb = zzjlVar;
        this.zzc = zzerVar;
        this.zzj = zzfqVar;
        this.zzk = zzjiVar;
        this.zzl = zzesVar;
        this.zzm = zzfaVar;
        this.zzd = zzbfVar;
        this.zze = zzemVar;
        this.zzf = zziaVar;
        this.zzg = zzetVar;
        this.zzh = zzehVar;
        this.zzi = zzjtVar;
        this.zzn = zzdwVar;
    }

    private final zzhj zzf(String str) {
        return new zzhj(str, this.zzb, this.zzc, this.zzj, this.zzk, this.zza, this.zzl, this.zzm, this.zzd, this.zzh, this.zzi);
    }

    public final zzet zza() {
        return this.zzg;
    }

    public final zzgb zzb(String str, zzfv zzfvVar) {
        return wl7.b(zzfvVar, zzfv.zza) ? new zzhx(zzf(str)) : new zzhu(this.zzm, zzf(str), this.zze);
    }

    public final zzia zzc() {
        return this.zzf;
    }

    public final zzfa zzd() {
        return this.zzm;
    }

    public final zzdw zze() {
        return this.zzn;
    }
}
