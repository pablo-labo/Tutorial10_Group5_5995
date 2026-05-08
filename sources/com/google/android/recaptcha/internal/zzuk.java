package com.google.android.recaptcha.internal;

import defpackage.l5;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuk {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzuk(zzuh zzuhVar, zzuj zzujVar) {
        this.zza = new HashMap(zzuhVar.zza);
        this.zzb = new HashMap(zzuhVar.zzb);
    }

    public static zzuh zza() {
        return new zzuh(null);
    }

    public final Object zzb(zzqp zzqpVar, Class cls) throws GeneralSecurityException {
        zzui zzuiVar = new zzui(zzqpVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzuiVar)) {
            return ((zzuf) map.get(zzuiVar)).zza(zzqpVar);
        }
        throw new GeneralSecurityException(l5.m("No PrimitiveConstructor for ", zzuiVar.toString(), " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object zzc(zzsn zzsnVar, zzsx zzsxVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzul zzulVar = (zzul) map.get(cls);
        return zzulVar.zzc(zzsnVar, zzsxVar, new zzug(this, zzulVar));
    }
}
