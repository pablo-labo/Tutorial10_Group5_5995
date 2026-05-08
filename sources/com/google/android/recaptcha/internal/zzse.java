package com.google.android.recaptcha.internal;

import defpackage.u40;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzse {
    private static final Logger zza = Logger.getLogger(zzse.class.getName());
    private static final zzse zzb = new zzse();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzse zzb() {
        return zzb;
    }

    private final synchronized zzqq zze(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzc;
        if (!concurrentMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (zzqq) concurrentMap.get(str);
    }

    private final synchronized void zzf(zzqq zzqqVar, boolean z, boolean z2) {
        try {
            String strZzc = zzqqVar.zzc();
            if (z2) {
                ConcurrentMap concurrentMap = this.zzd;
                if (concurrentMap.containsKey(strZzc) && !((Boolean) concurrentMap.get(strZzc)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzc));
                }
            }
            ConcurrentMap concurrentMap2 = this.zzc;
            zzqq zzqqVar2 = (zzqq) concurrentMap2.get(strZzc);
            if (zzqqVar2 != null && !zzqqVar2.getClass().equals(zzqqVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzc));
                throw new GeneralSecurityException("typeUrl (" + strZzc + ") is already registered with " + zzqqVar2.getClass().getName() + ", cannot be re-registered with " + zzqqVar.getClass().getName());
            }
            concurrentMap2.putIfAbsent(strZzc, zzqqVar);
            this.zzd.put(strZzc, Boolean.valueOf(z2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzqq zza(String str, Class cls) throws GeneralSecurityException {
        zzqq zzqqVarZze = zze(str);
        if (zzqqVarZze.zza().equals(cls)) {
            return zzqqVarZze;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzqqVarZze.getClass());
        String string = zzqqVarZze.zza().toString();
        StringBuilder sbF = u40.f("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbF.append(string);
        throw new GeneralSecurityException(sbF.toString());
    }

    public final synchronized void zzc(zzqq zzqqVar, boolean z) {
        zzd(zzqqVar, 1, z);
    }

    public final synchronized void zzd(zzqq zzqqVar, int i, boolean z) {
        if (!zzrg.zza(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzf(zzqqVar, false, z);
    }
}
