package com.google.android.recaptcha.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadk {
    public static String zza(zzacz zzaczVar) throws GeneralSecurityException {
        int iOrdinal = zzaczVar.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(zzaczVar.toString()));
    }

    public static String zzb(zzacz zzaczVar) throws GeneralSecurityException {
        zzadl.zzc(zzaczVar);
        return zzaczVar.toString().concat("withECDSA");
    }
}
