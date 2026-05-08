package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzpq implements zzpu {
    @Override // com.google.android.recaptcha.internal.zzpu
    public final zzpt zza(CharSequence charSequence, Charset charset) {
        zzpv zzpvVarZzb = zzb();
        byte[] bytes = charSequence.toString().getBytes(charset);
        bytes.getClass();
        ((zzpp) zzpvVarZzb).zza(bytes, 0, bytes.length);
        return zzpvVarZzb.zzb();
    }
}
