package com.google.android.recaptcha.internal;

import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzacl implements zzaco {
    private final zzacy zza;

    @Override // com.google.android.recaptcha.internal.zzaco
    public final Object zza(String str) {
        Iterator it = zzacq.zzb("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
