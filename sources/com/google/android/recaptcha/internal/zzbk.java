package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.os.Build;
import defpackage.lu2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbk implements zzcg {
    private final ContentResolver zza;

    public zzbk(ContentResolver contentResolver) {
        this.zza = contentResolver;
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final int zza() {
        return 17;
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
        return new zziq(new zzbj(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final /* synthetic */ Object zzf(zzalq zzalqVar, lu2 lu2Var) {
        return zzcb.zzc(this, zzalqVar, lu2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final Object zzg(Exception exc, lu2 lu2Var) {
        int i = Build.VERSION.SDK_INT;
        zzamt zzamtVarZza = zzamu.zza();
        zzamtVarZza.zzd(16);
        zzamtVarZza.zzc(i > 34 ? 59 : 58);
        return zzch.zza(this, (zzamu) zzamtVarZza.zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final /* synthetic */ void zzh(zzamh zzamhVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final boolean zzi() {
        return true;
    }
}
