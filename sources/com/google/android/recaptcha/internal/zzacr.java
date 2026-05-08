package com.google.android.recaptcha.internal;

import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacr implements zzacy {
    @Override // com.google.android.recaptcha.internal.zzacy
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
