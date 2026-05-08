package com.google.android.recaptcha.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzur {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzur(zzuv zzuvVar) {
        this.zza = new HashMap(zzuvVar.zza);
        this.zzb = new HashMap(zzuvVar.zzb);
        this.zzc = new HashMap(zzuvVar.zzc);
        this.zzd = new HashMap(zzuvVar.zzd);
    }

    public final zzur zza(zzsi zzsiVar) throws GeneralSecurityException {
        zzus zzusVar = new zzus(zzsiVar.zzd(), zzsiVar.zzc(), null);
        Map map = this.zzb;
        if (!map.containsKey(zzusVar)) {
            map.put(zzusVar, zzsiVar);
            return this;
        }
        zzsi zzsiVar2 = (zzsi) map.get(zzusVar);
        if (zzsiVar2.equals(zzsiVar) && zzsiVar.equals(zzsiVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzusVar.toString()));
    }

    public final zzur zzb(zzsm zzsmVar) throws GeneralSecurityException {
        zzut zzutVar = new zzut(zzsmVar.zzc(), zzsmVar.zzd(), null);
        Map map = this.zza;
        if (!map.containsKey(zzutVar)) {
            map.put(zzutVar, zzsmVar);
            return this;
        }
        zzsm zzsmVar2 = (zzsm) map.get(zzutVar);
        if (zzsmVar2.equals(zzsmVar) && zzsmVar.equals(zzsmVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzutVar.toString()));
    }

    public final zzur zzc(zzts zztsVar) throws GeneralSecurityException {
        zzus zzusVar = new zzus(zztsVar.zzc(), zztsVar.zzb(), null);
        Map map = this.zzd;
        if (!map.containsKey(zzusVar)) {
            map.put(zzusVar, zztsVar);
            return this;
        }
        zzts zztsVar2 = (zzts) map.get(zzusVar);
        if (zztsVar2.equals(zztsVar) && zztsVar.equals(zztsVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzusVar.toString()));
    }

    public final zzur zzd(zztw zztwVar) throws GeneralSecurityException {
        zzut zzutVar = new zzut(zztwVar.zzb(), zztwVar.zzc(), null);
        Map map = this.zzc;
        if (!map.containsKey(zzutVar)) {
            map.put(zzutVar, zztwVar);
            return this;
        }
        zztw zztwVar2 = (zztw) map.get(zzutVar);
        if (zztwVar2.equals(zztwVar) && zztwVar.equals(zztwVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzutVar.toString()));
    }

    public zzur() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }
}
