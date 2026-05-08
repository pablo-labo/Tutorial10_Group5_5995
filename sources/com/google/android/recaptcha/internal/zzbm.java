package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.lu2;
import defpackage.oa6;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbm implements zzcg {
    private final Application zza;
    private final zzes zzb = new zzes(oa6.b);

    public zzbm(Application application, zzdo zzdoVar) {
        this.zza = application;
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final /* synthetic */ Object zzc(String str, lu2 lu2Var) {
        return zzcb.zza(this, str, lu2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final /* synthetic */ Object zzd(zzalq zzalqVar, lu2 lu2Var) {
        return zzis.zzb(36, zza(), new zzce(this, zzalqVar, null), lu2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final Object zze(String str, lu2 lu2Var) {
        return new zziq(new zzbl(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final /* synthetic */ Object zzf(zzalq zzalqVar, lu2 lu2Var) {
        return zzcb.zzc(this, zzalqVar, lu2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final /* synthetic */ Object zzg(Exception exc, lu2 lu2Var) {
        return zzcb.zzd(this, exc, lu2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final /* synthetic */ void zzh(zzamh zzamhVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final boolean zzi() {
        return true;
    }
}
