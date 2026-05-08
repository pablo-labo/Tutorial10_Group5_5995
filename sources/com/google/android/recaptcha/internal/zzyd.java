package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyd {
    private static final zzuf zza = zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzxz
        @Override // com.google.android.recaptcha.internal.zzud
        public final Object zza(zzqp zzqpVar) {
            return zzacg.zzb((zzxy) zzqpVar);
        }
    }, zzxy.class, zzqy.class);
    private static final zzuf zzb = zzuf.zzb(new zzud() { // from class: com.google.android.recaptcha.internal.zzya
        @Override // com.google.android.recaptcha.internal.zzud
        public final Object zza(zzqp zzqpVar) {
            return zzach.zzb((zzye) zzqpVar);
        }
    }, zzye.class, zzqz.class);
    private static final zzqx zzc = zzsp.zze("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzqy.class, zzvl.zzh());
    private static final zzqq zzd = zzsp.zzd("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzqz.class, zzvs.ASYMMETRIC_PUBLIC, zzvo.zzh());
    private static final zzyb zzf = new Object() { // from class: com.google.android.recaptcha.internal.zzyb
    };
    private static final zztd zze = new zztd() { // from class: com.google.android.recaptcha.internal.zzyc
    };

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzrg.zza(1)) {
            l6.m("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        int i = zzabi.zza;
        zzabi.zze(zztn.zzb());
        zztj zztjVarZza = zztj.zza();
        HashMap map = new HashMap();
        map.put("ED25519", zzxx.zzb(zzxw.zza));
        zzxw zzxwVar = zzxw.zzd;
        map.put("ED25519_RAW", zzxx.zzb(zzxwVar));
        map.put("ED25519WithRawOutput", zzxx.zzb(zzxwVar));
        zztjVarZza.zzc(Collections.unmodifiableMap(map));
        zzte.zza().zzb(zze, zzxx.class);
        zztf.zza().zzb(zzf, zzxx.class);
        zztk.zza().zzc(zza);
        zztk.zza().zzc(zzb);
        zzse.zzb().zzc(zzc, true);
        zzse.zzb().zzc(zzd, false);
    }
}
