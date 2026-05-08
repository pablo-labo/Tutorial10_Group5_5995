package com.google.android.recaptcha.internal;

import defpackage.lu2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbr implements zzcg {
    private boolean zza = true;
    private final zzfq zzb;

    public zzbr(zzfq zzfqVar) {
        this.zzb = zzfqVar;
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final int zza() {
        return 25;
    }

    public final void zzb(boolean z) {
        this.zza = false;
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
        return new zziq(new zzbp(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final Object zzf(zzalq zzalqVar, lu2 lu2Var) {
        return new zziq(new zzbq(zzalqVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final /* synthetic */ Object zzg(Exception exc, lu2 lu2Var) {
        return zzcb.zzd(this, exc, lu2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final void zzh(zzamh zzamhVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final boolean zzi() {
        return this.zza;
    }
}
