package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzahv {
    public static final /* synthetic */ int zza = 0;
    private static final zzahv zzb = new zzahv();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzaia zzc = new zzahd();

    private zzahv() {
    }

    public static zzahv zza() {
        return zzb;
    }

    public final zzahz zzb(Class cls) {
        zzago.zzc(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzd;
        zzahz zzahzVar = (zzahz) concurrentMap.get(cls);
        if (zzahzVar != null) {
            return zzahzVar;
        }
        zzahz zzahzVarZza = this.zzc.zza(cls);
        zzago.zzc(cls, "messageType");
        zzahz zzahzVar2 = (zzahz) concurrentMap.putIfAbsent(cls, zzahzVarZza);
        return zzahzVar2 != null ? zzahzVar2 : zzahzVarZza;
    }
}
