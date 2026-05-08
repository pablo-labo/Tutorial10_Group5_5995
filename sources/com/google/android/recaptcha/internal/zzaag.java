package com.google.android.recaptcha.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaag {
    static {
        int i = zzwm.zza;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzyx.zzd();
        zzzb.zzd();
        zzxv.zza(true);
        zzzq.zza(true);
        zzaaf.zza(true);
        if (zzrh.zzb()) {
            return;
        }
        zzyd.zza(true);
    }
}
