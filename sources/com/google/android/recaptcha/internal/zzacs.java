package com.google.android.recaptcha.internal;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacs implements zzacy {
    @Override // com.google.android.recaptcha.internal.zzacy
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
