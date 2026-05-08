package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzage implements zzafv {
    final int zza;
    final zzaiz zzb;

    public zzage(zzagj zzagjVar, int i, zzaiz zzaizVar, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = zzaizVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzage) obj).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzafv
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzafv
    public final zzaiz zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzafv
    public final zzaja zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.recaptcha.internal.zzafv
    public final void zzd(Object obj, Object obj2) {
        ((zzaga) obj).zzn((zzagg) obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzafv
    public final boolean zze(Object obj) {
        return obj instanceof zzahl;
    }

    @Override // com.google.android.recaptcha.internal.zzafv
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzafv
    public final boolean zzg() {
        return false;
    }
}
