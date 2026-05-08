package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzahg {
    public static final boolean zza(Object obj) {
        return !((zzahf) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzahf zzahfVarZzb = (zzahf) obj;
        zzahf zzahfVar = (zzahf) obj2;
        if (!zzahfVar.isEmpty()) {
            if (!zzahfVarZzb.zze()) {
                zzahfVarZzb = zzahfVarZzb.zzb();
            }
            zzahfVarZzb.zzd(zzahfVar);
        }
        return zzahfVarZzb;
    }
}
