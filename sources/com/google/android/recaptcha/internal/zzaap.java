package com.google.android.recaptcha.internal;

import defpackage.l6;
import defpackage.z3;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaap {
    private static final zzsd zza = zzb();

    public static zzqn zza() throws GeneralSecurityException {
        if (!zzrh.zzb()) {
            return zza;
        }
        l6.m("Cannot use non-FIPS-compliant SignatureConfigurationV1 in FIPS mode");
        return null;
    }

    private static zzsd zzb() {
        try {
            zzuh zzuhVarZza = zzuk.zza();
            zzyx.zze(zzuhVarZza);
            zzzb.zze(zzuhVarZza);
            zzuhVarZza.zza(zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzaah
                @Override // com.google.android.recaptcha.internal.zzud
                public final Object zza(zzqp zzqpVar) {
                    return zzaba.zzb((zzxo) zzqpVar);
                }
            }, zzxo.class, zzqy.class));
            zzuhVarZza.zza(zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzaai
                @Override // com.google.android.recaptcha.internal.zzud
                public final Object zza(zzqp zzqpVar) {
                    int i = zzabb.zzd;
                    return zzabb.zzb((zzxr) zzqpVar, zzrk.zza());
                }
            }, zzxr.class, zzqz.class));
            zzuhVarZza.zza(zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzaaj
                @Override // com.google.android.recaptcha.internal.zzud
                public final Object zza(zzqp zzqpVar) {
                    return zzadg.zzb((zzzy) zzqpVar);
                }
            }, zzzy.class, zzqy.class));
            zzuhVarZza.zza(zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzaak
                @Override // com.google.android.recaptcha.internal.zzud
                public final Object zza(zzqp zzqpVar) {
                    return zzadj.zzb((zzaab) zzqpVar);
                }
            }, zzaab.class, zzqz.class));
            zzuhVarZza.zza(zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzaal
                @Override // com.google.android.recaptcha.internal.zzud
                public final Object zza(zzqp zzqpVar) {
                    return zzabu.zzb((zzzj) zzqpVar);
                }
            }, zzzj.class, zzqy.class));
            zzuhVarZza.zza(zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzaam
                @Override // com.google.android.recaptcha.internal.zzud
                public final Object zza(zzqp zzqpVar) {
                    return zzadd.zzb((zzzm) zzqpVar);
                }
            }, zzzm.class, zzqz.class));
            zzuhVarZza.zza(zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzaan
                @Override // com.google.android.recaptcha.internal.zzud
                public final Object zza(zzqp zzqpVar) {
                    return zzacg.zzb((zzxy) zzqpVar);
                }
            }, zzxy.class, zzqy.class));
            zzuhVarZza.zza(zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzaao
                @Override // com.google.android.recaptcha.internal.zzud
                public final Object zza(zzqp zzqpVar) {
                    return zzach.zzb((zzye) zzqpVar);
                }
            }, zzye.class, zzqz.class));
            return zzsd.zzb(zzuhVarZza.zzc());
        } catch (GeneralSecurityException e) {
            z3.q(e);
            return null;
        }
    }
}
