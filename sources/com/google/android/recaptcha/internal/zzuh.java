package com.google.android.recaptcha.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuh {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzuh(zzuk zzukVar, zzuj zzujVar) {
        this.zza = new HashMap(zzukVar.zza);
        this.zzb = new HashMap(zzukVar.zzb);
    }

    public final zzuh zza(zzuf zzufVar) throws GeneralSecurityException {
        zzui zzuiVar = new zzui(zzufVar.zzc(), zzufVar.zzd(), null);
        Map map = this.zza;
        if (!map.containsKey(zzuiVar)) {
            map.put(zzuiVar, zzufVar);
            return this;
        }
        zzuf zzufVar2 = (zzuf) map.get(zzuiVar);
        if (zzufVar2.equals(zzufVar) && zzufVar.equals(zzufVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzuiVar.toString()));
    }

    public final zzuh zzb(zzul zzulVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZzb = zzulVar.zzb();
        if (!map.containsKey(clsZzb)) {
            map.put(clsZzb, zzulVar);
            return this;
        }
        zzul zzulVar2 = (zzul) map.get(clsZzb);
        if (zzulVar2.equals(zzulVar) && zzulVar.equals(zzulVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
    }

    public final zzuk zzc() {
        return new zzuk(this, null);
    }

    public /* synthetic */ zzuh(zzuj zzujVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzuh() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}
