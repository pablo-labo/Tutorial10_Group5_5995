package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacw implements zzacy {
    @Override // com.google.android.recaptcha.internal.zzacy
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
