package com.google.android.recaptcha.internal;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacu implements zzacy {
    @Override // com.google.android.recaptcha.internal.zzacy
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
