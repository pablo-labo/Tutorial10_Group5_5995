package com.google.android.recaptcha.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zztf {
    private static final zztf zza = new zztf();
    private final Map zzb = new HashMap();

    public static zztf zza() {
        return zza;
    }

    public final synchronized void zzb(zzyb zzybVar, Class cls) {
        try {
            Map map = this.zzb;
            zzyb zzybVar2 = (zzyb) map.get(cls);
            if (zzybVar2 != null && !zzybVar2.equals(zzybVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, zzybVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
