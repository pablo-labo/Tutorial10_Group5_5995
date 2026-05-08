package com.google.android.recaptcha.internal;

import defpackage.ja;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzte {
    private static final zztd zza = new zztd() { // from class: com.google.android.recaptcha.internal.zztc
    };
    private static final zzte zzb = zzc();
    private final Map zzc = new HashMap();

    public static zzte zza() {
        return zzb;
    }

    private static zzte zzc() {
        zzte zzteVar = new zzte();
        try {
            zzteVar.zzb(zza, zzsu.class);
            return zzteVar;
        } catch (GeneralSecurityException e) {
            ja.m("unexpected error.", e);
            return null;
        }
    }

    public final synchronized void zzb(zztd zztdVar, Class cls) {
        try {
            Map map = this.zzc;
            zztd zztdVar2 = (zztd) map.get(cls);
            if (zztdVar2 != null && !zztdVar2.equals(zztdVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            map.put(cls, zztdVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
