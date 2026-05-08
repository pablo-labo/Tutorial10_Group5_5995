package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaaf {
    private static final zzuf zza = zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzaac
        @Override // com.google.android.recaptcha.internal.zzud
        public final Object zza(zzqp zzqpVar) {
            return zzadg.zzb((zzzy) zzqpVar);
        }
    }, zzzy.class, zzqy.class);
    private static final zzuf zzb = zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzaad
        @Override // com.google.android.recaptcha.internal.zzud
        public final Object zza(zzqp zzqpVar) {
            return zzadj.zzb((zzaab) zzqpVar);
        }
    }, zzaab.class, zzqz.class);
    private static final zzqx zzc = zzsp.zze("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzqy.class, zzxb.zzm());
    private static final zzqq zzd = zzsp.zzd("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzqz.class, zzvs.ASYMMETRIC_PUBLIC, zzxe.zzj());
    private static final zztd zze = new zztd() { // from class: com.google.android.recaptcha.internal.zzaae
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzrg.zza(i)) {
            l6.m("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        int i2 = zzacc.zza;
        zzacc.zze(zztn.zzb());
        zztj zztjVarZza = zztj.zza();
        HashMap map = new HashMap();
        BigInteger bigInteger = zzzv.zza;
        zzzr zzzrVar = new zzzr(null);
        zzzs zzzsVar = zzzs.zza;
        zzzrVar.zze(zzzsVar);
        zzzrVar.zza(zzzsVar);
        zzzrVar.zzd(32);
        zzzrVar.zzb(3072);
        BigInteger bigInteger2 = zzzv.zza;
        zzzrVar.zzc(bigInteger2);
        zzzt zzztVar = zzzt.zza;
        zzzrVar.zzf(zzztVar);
        map.put("RSA_SSA_PSS_3072_SHA256_F4", zzzrVar.zzg());
        zzzr zzzrVar2 = new zzzr(null);
        zzzrVar2.zze(zzzsVar);
        zzzrVar2.zza(zzzsVar);
        zzzrVar2.zzd(32);
        zzzrVar2.zzb(3072);
        zzzrVar2.zzc(bigInteger2);
        zzzt zzztVar2 = zzzt.zzd;
        zzzrVar2.zzf(zzztVar2);
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", zzzrVar2.zzg());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", zzyt.zzk);
        zzzr zzzrVar3 = new zzzr(null);
        zzzs zzzsVar2 = zzzs.zzc;
        zzzrVar3.zze(zzzsVar2);
        zzzrVar3.zza(zzzsVar2);
        zzzrVar3.zzd(64);
        zzzrVar3.zzb(4096);
        zzzrVar3.zzc(bigInteger2);
        zzzrVar3.zzf(zzztVar);
        map.put("RSA_SSA_PSS_4096_SHA512_F4", zzzrVar3.zzg());
        zzzr zzzrVar4 = new zzzr(null);
        zzzrVar4.zze(zzzsVar2);
        zzzrVar4.zza(zzzsVar2);
        zzzrVar4.zzd(64);
        zzzrVar4.zzb(4096);
        zzzrVar4.zzc(bigInteger2);
        zzzrVar4.zzf(zzztVar2);
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", zzzrVar4.zzg());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", zzyt.zzl);
        zztjVarZza.zzc(Collections.unmodifiableMap(map));
        zztk.zza().zzc(zza);
        zztk.zza().zzc(zzb);
        zzte.zza().zzb(zze, zzzv.class);
        zzse.zzb().zzd(zzc, i, true);
        zzse.zzb().zzd(zzd, i, false);
    }
}
