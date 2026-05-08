package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzza implements zzqz {
    private final zzub zza;

    public zzza(zzub zzubVar, zzsy zzsyVar) {
        this.zza = zzubVar;
    }

    @Override // com.google.android.recaptcha.internal.zzqz
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.zza.zza(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((zzyz) it.next()).zza.zza(bArr, bArr2);
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        l6.m("invalid signature");
    }
}
