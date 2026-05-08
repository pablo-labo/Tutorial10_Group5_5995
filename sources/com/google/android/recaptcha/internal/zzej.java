package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzej {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i, long j) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer numValueOf = Integer.valueOf(i);
        Object zzeiVar = concurrentHashMap.get(numValueOf);
        if (zzeiVar == null) {
            zzeiVar = new zzei();
        }
        zzei zzeiVar2 = (zzei) zzeiVar;
        zzeiVar2.zzg(zzeiVar2.zzb() + 1);
        zzeiVar2.zzf(zzeiVar2.zzd() + j);
        zzeiVar2.zze(Math.max(j, zzeiVar2.zzc()));
        concurrentHashMap.put(numValueOf, zzeiVar2);
    }
}
