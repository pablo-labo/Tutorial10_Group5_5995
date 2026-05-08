package com.google.android.recaptcha.internal;

import java.security.Provider;
import java.security.Signature;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacx implements zzacy {
    @Override // com.google.android.recaptcha.internal.zzacy
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
