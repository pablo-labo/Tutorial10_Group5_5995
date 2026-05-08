package com.google.android.recaptcha.internal;

import defpackage.l6;
import defpackage.p6;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxy extends zzaar {
    private final zzye zza;
    private final zzado zzb;

    private zzxy(zzye zzyeVar, zzado zzadoVar) {
        this.zza = zzyeVar;
        this.zzb = zzadoVar;
    }

    public static zzxy zzd(zzye zzyeVar, zzado zzadoVar) throws GeneralSecurityException {
        if (zzadoVar.zza() != 32) {
            throw new GeneralSecurityException(p6.c(zzadoVar.zza(), "Ed25519 key must be constructed with key of length 32 bytes, not "));
        }
        if (Arrays.equals(zzyeVar.zzf().zzd(), zzrr.zzf(zzrr.zze(zzadoVar.zzc(zzqo.zza()))))) {
            return new zzxy(zzyeVar, zzadoVar);
        }
        l6.m("Ed25519 keys mismatch");
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaar, com.google.android.recaptcha.internal.zzqp
    public final /* synthetic */ zzqw zza() {
        return this.zza.zzc();
    }

    public final zzxx zzc() {
        return this.zza.zzc();
    }

    public final zzye zze() {
        return this.zza;
    }

    public final zzado zzf() {
        return this.zzb;
    }
}
