package com.google.android.recaptcha.internal;

import java.security.Provider;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacv implements zzacy {
    @Override // com.google.android.recaptcha.internal.zzacy
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
