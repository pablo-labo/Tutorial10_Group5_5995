package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxm {
    private zzxr zza = null;
    private zzadn zzb = null;

    private zzxm() {
    }

    public final zzxm zza(zzadn zzadnVar) {
        this.zzb = zzadnVar;
        return this;
    }

    public final zzxm zzb(zzxr zzxrVar) {
        this.zza = zzxrVar;
        return this;
    }

    public final zzxo zzc() throws GeneralSecurityException {
        zzxr zzxrVar = this.zza;
        zzxn zzxnVar = null;
        if (zzxrVar == null) {
            l6.m("Cannot build without a ecdsa public key");
            return null;
        }
        zzadn zzadnVar = this.zzb;
        if (zzadnVar == null) {
            l6.m("Cannot build without a private value");
            return null;
        }
        BigInteger bigIntegerZzb = zzadnVar.zzb(zzqo.zza());
        ECPoint eCPointZzf = zzxrVar.zzf();
        zzxg zzxgVarZzb = zzxrVar.zzc().zzb();
        BigInteger order = zzxgVarZzb.zza().getOrder();
        if (bigIntegerZzb.signum() <= 0 || bigIntegerZzb.compareTo(order) >= 0) {
            l6.m("Invalid private value");
            return null;
        }
        if (zzrw.zze(bigIntegerZzb, zzxgVarZzb.zza()).equals(eCPointZzf)) {
            return new zzxo(this.zza, this.zzb, zzxnVar);
        }
        l6.m("Invalid private value");
        return null;
    }

    public /* synthetic */ zzxm(zzxn zzxnVar) {
    }
}
