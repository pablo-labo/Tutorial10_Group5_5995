package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxv {
    private static final zzuf zza = zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzxs
        @Override // com.google.android.recaptcha.internal.zzud
        public final Object zza(zzqp zzqpVar) {
            return zzaba.zzb((zzxo) zzqpVar);
        }
    }, zzxo.class, zzqy.class);
    private static final zzuf zzb = zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzxt
        @Override // com.google.android.recaptcha.internal.zzud
        public final Object zza(zzqp zzqpVar) {
            int i = zzabb.zzd;
            return zzabb.zzb((zzxr) zzqpVar, zzrk.zza());
        }
    }, zzxr.class, zzqz.class);
    private static final zzqx zzc = zzsp.zze("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", zzqy.class, zzve.zzh());
    private static final zzqq zzd = zzsp.zzd("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzqz.class, zzvs.ASYMMETRIC_PUBLIC, zzvh.zzj());
    private static final zztd zze = new zztd() { // from class: com.google.android.recaptcha.internal.zzxu
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzrg.zza(i)) {
            l6.m("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        int i2 = zzaaz.zza;
        zzaaz.zze(zztn.zzb());
        zztj zztjVarZza = zztj.zza();
        HashMap map = new HashMap();
        map.put("ECDSA_P256", zzyt.zza);
        map.put("ECDSA_P256_IEEE_P1363", zzyt.zzd);
        zzxf zzxfVar = new zzxf(null);
        zzxfVar.zzb(zzxh.zza);
        zzxfVar.zza(zzxg.zza);
        zzxfVar.zzc(zzxi.zza);
        zzxfVar.zzd(zzxj.zzd);
        map.put("ECDSA_P256_RAW", zzxfVar.zze());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", zzyt.zzf);
        map.put("ECDSA_P384", zzyt.zzb);
        map.put("ECDSA_P384_IEEE_P1363", zzyt.zze);
        zzxf zzxfVar2 = new zzxf(null);
        zzxfVar2.zzb(zzxh.zzc);
        zzxg zzxgVar = zzxg.zzb;
        zzxfVar2.zza(zzxgVar);
        zzxi zzxiVar = zzxi.zzb;
        zzxfVar2.zzc(zzxiVar);
        zzxj zzxjVar = zzxj.zza;
        zzxfVar2.zzd(zzxjVar);
        map.put("ECDSA_P384_SHA512", zzxfVar2.zze());
        zzxf zzxfVar3 = new zzxf(null);
        zzxfVar3.zzb(zzxh.zzb);
        zzxfVar3.zza(zzxgVar);
        zzxfVar3.zzc(zzxiVar);
        zzxfVar3.zzd(zzxjVar);
        map.put("ECDSA_P384_SHA384", zzxfVar3.zze());
        map.put("ECDSA_P521", zzyt.zzc);
        map.put("ECDSA_P521_IEEE_P1363", zzyt.zzg);
        zztjVarZza.zzc(Collections.unmodifiableMap(map));
        zztk.zza().zzc(zza);
        zztk.zza().zzc(zzb);
        zzte.zza().zzb(zze, zzxl.class);
        zzse.zzb().zzd(zzc, i, true);
        zzse.zzb().zzd(zzd, i, false);
    }
}
