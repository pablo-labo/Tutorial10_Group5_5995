package com.google.android.recaptcha.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyx implements zzul {
    private static final zzyx zza = new zzyx();
    private static final zzuf zzb = zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzyu
        @Override // com.google.android.recaptcha.internal.zzud
        public final Object zza(zzqp zzqpVar) {
            return zzabl.zzb((zzst) zzqpVar);
        }
    }, zzst.class, zzqy.class);

    public static void zzd() {
        zztk.zza().zzd(zza);
        zztk.zza().zzc(zzb);
    }

    public static void zze(zzuh zzuhVar) throws GeneralSecurityException {
        zzuhVar.zzb(zza);
    }

    @Override // com.google.android.recaptcha.internal.zzul
    public final Class zza() {
        return zzqy.class;
    }

    @Override // com.google.android.recaptcha.internal.zzul
    public final Class zzb() {
        return zzqy.class;
    }

    @Override // com.google.android.recaptcha.internal.zzul
    public final /* bridge */ /* synthetic */ Object zzc(zzsn zzsnVar, zzsx zzsxVar, zzug zzugVar) {
        zzsy zzsyVarZza = !zzsxVar.zza() ? zzti.zzb().zza().zza(zzsnVar, zzsxVar, "public_key_sign", "sign") : zztb.zza;
        zzqv zzqvVar = (zzqv) zzsnVar;
        return new zzyw(new zzyv((zzqy) zzugVar.zza(zzqvVar.zzc()), zzqvVar.zzc().zza()), zzsyVarZza);
    }
}
