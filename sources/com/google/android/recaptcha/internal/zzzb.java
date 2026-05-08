package com.google.android.recaptcha.internal;

import defpackage.t40;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzb implements zzul {
    private static final zzzb zza = new zzzb();
    private static final zzuf zzb = zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzyy
        @Override // com.google.android.recaptcha.internal.zzud
        public final Object zza(zzqp zzqpVar) {
            return zzabm.zzb((zzst) zzqpVar);
        }
    }, zzst.class, zzqz.class);

    public static void zzd() {
        zztk.zza().zzd(zza);
        zztk.zza().zzc(zzb);
    }

    public static void zze(zzuh zzuhVar) throws GeneralSecurityException {
        zzuhVar.zzb(zza);
    }

    @Override // com.google.android.recaptcha.internal.zzul
    public final Class zza() {
        return zzqz.class;
    }

    @Override // com.google.android.recaptcha.internal.zzul
    public final Class zzb() {
        return zzqz.class;
    }

    @Override // com.google.android.recaptcha.internal.zzul
    public final /* bridge */ /* synthetic */ Object zzc(zzsn zzsnVar, zzsx zzsxVar, zzug zzugVar) throws GeneralSecurityException {
        zzadm zzadmVarZzd;
        zzty zztyVar = new zzty();
        for (int i = 0; i < zzsnVar.zza(); i++) {
            zzqt zzqtVarZzb = ((zzqv) zzsnVar).zzb(i);
            if (zzqtVarZzb.zzc().equals(zzqr.zza)) {
                zzqz zzqzVar = (zzqz) zzugVar.zza(zzqtVarZzb);
                zzqp zzqpVarZzb = zzqtVarZzb.zzb();
                if (zzqpVarZzb instanceof zzaas) {
                    zzadmVarZzd = ((zzaas) zzqpVarZzb).zze();
                } else {
                    if (!(zzqpVarZzb instanceof zzst)) {
                        throw new GeneralSecurityException(t40.l("Cannot get output prefix for key of class ", zzqpVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzqpVarZzb.zza())));
                    }
                    zzadmVarZzd = ((zzst) zzqpVarZzb).zzd();
                }
                zztyVar.zza(zzadmVarZzd, new zzyz(zzqzVar, zzqtVarZzb.zza()));
            }
        }
        return new zzza(zztyVar.zzb(), !zzsxVar.zza() ? zzti.zzb().zza().zza(zzsnVar, zzsxVar, "public_key_verify", "verify") : zztb.zza);
    }
}
