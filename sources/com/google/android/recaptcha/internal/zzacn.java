package com.google.android.recaptcha.internal;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzacn implements zzaco {
    private final zzacy zza;

    @Override // com.google.android.recaptcha.internal.zzaco
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzacq.zzb("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
