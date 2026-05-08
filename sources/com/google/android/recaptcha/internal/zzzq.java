package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzq {
    private static final zzuf zza = zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzzn
        @Override // com.google.android.recaptcha.internal.zzud
        public final Object zza(zzqp zzqpVar) {
            return zzabu.zzb((zzzj) zzqpVar);
        }
    }, zzzj.class, zzqy.class);
    private static final zzuf zzb = zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzzo
        @Override // com.google.android.recaptcha.internal.zzud
        public final Object zza(zzqp zzqpVar) {
            return zzadd.zzb((zzzm) zzqpVar);
        }
    }, zzzm.class, zzqz.class);
    private static final zzqx zzc = zzsp.zze("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzqy.class, zzws.zzm());
    private static final zzqq zzd = zzsp.zzd("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzqz.class, zzvs.ASYMMETRIC_PUBLIC, zzwv.zzj());
    private static final zztd zze = new zztd() { // from class: com.google.android.recaptcha.internal.zzzp
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzrg.zza(i)) {
            l6.m("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        int i2 = zzabt.zza;
        zzabt.zze(zztn.zzb());
        zztj zztjVarZza = zztj.zza();
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", zzyt.zzh);
        BigInteger bigInteger = zzzg.zza;
        zzzc zzzcVar = new zzzc(null);
        zzzcVar.zza(zzzd.zza);
        zzzcVar.zzb(3072);
        BigInteger bigInteger2 = zzzg.zza;
        zzzcVar.zzc(bigInteger2);
        zzze zzzeVar = zzze.zzd;
        zzzcVar.zzd(zzzeVar);
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zzzcVar.zze());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", zzyt.zzi);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", zzyt.zzj);
        zzzc zzzcVar2 = new zzzc(null);
        zzzcVar2.zza(zzzd.zzc);
        zzzcVar2.zzb(4096);
        zzzcVar2.zzc(bigInteger2);
        zzzcVar2.zzd(zzzeVar);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zzzcVar2.zze());
        zztjVarZza.zzc(map);
        zztk.zza().zzc(zza);
        zztk.zza().zzc(zzb);
        zzte.zza().zzb(zze, zzzg.class);
        zzse.zzb().zzd(zzc, i, true);
        zzse.zzb().zzd(zzd, i, false);
    }
}
