package com.google.android.recaptcha.internal;

import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class zzact implements zzacy {
    @Override // com.google.android.recaptcha.internal.zzacy
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
