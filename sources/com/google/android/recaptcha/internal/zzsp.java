package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public class zzsp implements zzqq {
    final String zza;
    final Class zzb;
    final zzvs zzc;

    public zzsp(String str, Class cls, zzvs zzvsVar, zzaht zzahtVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzvsVar;
    }

    public static zzqq zzd(String str, Class cls, zzvs zzvsVar, zzaht zzahtVar) {
        return new zzsp(str, cls, zzvsVar, zzahtVar);
    }

    public static zzqx zze(String str, Class cls, zzaht zzahtVar) {
        return new zzso(str, cls, zzahtVar);
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final Class zza() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final Object zzb(zzaef zzaefVar) {
        return zztk.zza().zzb(zztn.zzb().zza(zzum.zza(this.zza, zzaefVar, this.zzc, zzwj.RAW, null), zzqo.zza()), this.zzb);
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final String zzc() {
        return this.zza;
    }
}
