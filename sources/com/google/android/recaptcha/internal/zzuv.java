package com.google.android.recaptcha.internal;

import defpackage.l5;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuv {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzuv(zzur zzurVar, zzuu zzuuVar) {
        this.zza = new HashMap(zzurVar.zza);
        this.zzb = new HashMap(zzurVar.zzb);
        this.zzc = new HashMap(zzurVar.zzc);
        this.zzd = new HashMap(zzurVar.zzd);
    }

    public final zzqp zza(zzuq zzuqVar, zzra zzraVar) throws GeneralSecurityException {
        zzus zzusVar = new zzus(zzuqVar.getClass(), zzuqVar.zzd(), null);
        Map map = this.zzb;
        if (map.containsKey(zzusVar)) {
            return ((zzsi) map.get(zzusVar)).zza(zzuqVar, zzraVar);
        }
        throw new GeneralSecurityException(l5.m("No Key Parser for requested key type ", zzusVar.toString(), " available"));
    }

    public final zzuq zzb(zzqp zzqpVar, Class cls, zzra zzraVar) throws GeneralSecurityException {
        zzut zzutVar = new zzut(zzqpVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzutVar)) {
            return ((zzsm) map.get(zzutVar)).zza(zzqpVar, zzraVar);
        }
        throw new GeneralSecurityException(l5.m("No Key serializer for ", zzutVar.toString(), " available"));
    }

    public final boolean zzg(zzuq zzuqVar) {
        return this.zzb.containsKey(new zzus(zzuqVar.getClass(), zzuqVar.zzd(), null));
    }
}
