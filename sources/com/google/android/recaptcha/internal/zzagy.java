package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzagy {
    public static final List zza(Object obj, long j) {
        zzagn zzagnVar = (zzagn) zzaiv.zzf(obj, j);
        if (zzagnVar.zzc()) {
            return zzagnVar;
        }
        int size = zzagnVar.size();
        zzagn zzagnVarZzd = zzagnVar.zzd(size == 0 ? 10 : size + size);
        zzaiv.zzs(obj, j, zzagnVarZzd);
        return zzagnVarZzd;
    }
}
