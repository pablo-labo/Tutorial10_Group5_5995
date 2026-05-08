package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class zzup {
    private static final ThreadLocal zza = new zzuo();

    public static /* synthetic */ SecureRandom zza() {
        SecureRandom secureRandomZzc = zzc();
        secureRandomZzc.nextLong();
        return secureRandomZzc;
    }

    public static byte[] zzb(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom zzc() {
        Provider providerZza = zzrk.zza();
        if (providerZza != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider provider = null;
        try {
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        if (provider != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (GeneralSecurityException unused3) {
            }
        }
        return new SecureRandom();
    }
}
