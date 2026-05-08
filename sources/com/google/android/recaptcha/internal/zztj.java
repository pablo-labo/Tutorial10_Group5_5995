package com.google.android.recaptcha.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zztj {
    private static final zztj zza = new zztj();
    private final Map zzb = new HashMap();

    public static zztj zza() {
        return zza;
    }

    public final synchronized void zzb(String str, zzqw zzqwVar) {
        try {
            Map map = this.zzb;
            if (!map.containsKey(str)) {
                map.put(str, zzqwVar);
                return;
            }
            if (((zzqw) map.get(str)).equals(zzqwVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(map.get(str)) + "), cannot insert " + String.valueOf(zzqwVar));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzb((String) entry.getKey(), (zzqw) entry.getValue());
        }
    }
}
