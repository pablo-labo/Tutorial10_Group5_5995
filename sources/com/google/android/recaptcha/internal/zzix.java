package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.wl7;

/* JADX INFO: loaded from: classes2.dex */
public final class zzix implements zzjl {
    private final zzjj zza;
    private final zziw zzb;

    public zzix(zzjj zzjjVar, zziw zziwVar) {
        this.zza = zzjjVar;
        this.zzb = zziwVar;
    }

    @Override // com.google.android.recaptcha.internal.zzjl
    public final Object zza(String str, zzane zzaneVar, lu2 lu2Var) throws zzeg {
        zziv zzivVar = null;
        try {
            try {
                if (!this.zza.zzb(str)) {
                    throw new zzeg(zzee.zzc, zzed.zzQ, null, null, 12, null);
                }
                zziv zzivVarZza = this.zzb.zza(str);
                zzivVarZza.zzc();
                zzivVarZza.zze(zzaneVar.zzy());
                zzahl zzahlVarZza = zzivVarZza.zza(zzalo.zzd());
                zzahlVarZza.getClass();
                zzalo zzaloVar = (zzalo) zzahlVarZza;
                zzivVarZza.zzd();
                return zzaloVar;
            } catch (zzeg e) {
                if (0 == 0 || !wl7.b(e.zza(), zzed.zzax)) {
                    throw e;
                }
                try {
                    throw zzef.zza(zzank.zzb(zzivVar.zzb().getErrorStream()).zzc());
                } catch (Exception e2) {
                    throw new zzeg(zzee.zzc, zzed.zzG, e2.getMessage(), null, 8, null);
                }
            } catch (Exception e3) {
                throw new zzeg(zzee.zzc, zzed.zzF, e3.getMessage(), null, 8, null);
            }
        } finally {
        }
    }
}
