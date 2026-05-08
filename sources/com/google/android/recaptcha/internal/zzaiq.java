package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzaiq extends zzaio {
    @Override // com.google.android.recaptcha.internal.zzaio
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzagg zzaggVar = (zzagg) obj;
        zzaip zzaipVar = zzaggVar.zzc;
        if (zzaipVar != zzaip.zzc()) {
            return zzaipVar;
        }
        zzaip zzaipVarZzf = zzaip.zzf();
        zzaggVar.zzc = zzaipVarZzf;
        return zzaipVarZzf;
    }

    @Override // com.google.android.recaptcha.internal.zzaio
    public final /* synthetic */ Object zzb() {
        return zzaip.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzaio
    public final /* synthetic */ Object zzc(Object obj) {
        zzaip zzaipVar = (zzaip) obj;
        zzaipVar.zzh();
        return zzaipVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaio
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i, int i2) {
        ((zzaip) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.recaptcha.internal.zzaio
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i, long j) {
        ((zzaip) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.recaptcha.internal.zzaio
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, Object obj2) {
        ((zzaip) obj).zzj((i << 3) | 3, (zzaip) obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzaio
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i, zzaef zzaefVar) {
        ((zzaip) obj).zzj((i << 3) | 2, zzaefVar);
    }

    @Override // com.google.android.recaptcha.internal.zzaio
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, long j) {
        ((zzaip) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.recaptcha.internal.zzaio
    public final void zzi(Object obj) {
        ((zzagg) obj).zzc.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzaio
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzagg) obj).zzc = (zzaip) obj2;
    }
}
