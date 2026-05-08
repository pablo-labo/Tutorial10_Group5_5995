package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.l6;
import defpackage.p6;
import defpackage.r6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzye extends zzaas {
    private final zzxx zza;
    private final zzadm zzb;
    private final zzadm zzc;
    private final Integer zzd;

    private zzye(zzxx zzxxVar, zzadm zzadmVar, zzadm zzadmVar2, Integer num) {
        this.zza = zzxxVar;
        this.zzb = zzadmVar;
        this.zzc = zzadmVar2;
        this.zzd = num;
    }

    public static zzye zzd(zzxw zzxwVar, zzadm zzadmVar, Integer num) throws GeneralSecurityException {
        zzadm zzadmVarZza;
        zzxx zzxxVarZzb = zzxx.zzb(zzxwVar);
        zzxw zzxwVar2 = zzxw.zzd;
        if (!zzxwVar.equals(zzxwVar2) && num == null) {
            throw new GeneralSecurityException(l5.m("For given Variant ", zzxwVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzxwVar == zzxwVar2 && num != null) {
            l6.m("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (zzadmVar.zza() != 32) {
            throw new GeneralSecurityException(p6.c(zzadmVar.zza(), "Ed25519 key must be constructed with key of length 32 bytes, not "));
        }
        if (zzxxVarZzb.zza() == zzxwVar2) {
            zzadmVarZza = zzto.zza;
        } else if (zzxxVarZzb.zza() == zzxw.zzb || zzxxVarZzb.zza() == zzxw.zzc) {
            zzadmVarZza = zzto.zza(num.intValue());
        } else {
            if (zzxxVarZzb.zza() != zzxw.zza) {
                r6.g("Unknown Variant: ".concat(zzxxVarZzb.zza().toString()));
                return null;
            }
            zzadmVarZza = zzto.zzb(num.intValue());
        }
        return new zzye(zzxxVarZzb, zzadmVar, zzadmVarZza, num);
    }

    @Override // com.google.android.recaptcha.internal.zzaas, com.google.android.recaptcha.internal.zzqp
    public final /* synthetic */ zzqw zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzqp
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzxx zzc() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaas
    public final zzadm zze() {
        return this.zzc;
    }

    public final zzadm zzf() {
        return this.zzb;
    }
}
