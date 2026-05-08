package com.google.android.recaptcha.internal;

import defpackage.k20;

/* JADX INFO: loaded from: classes2.dex */
public final class zzk implements zzj {
    @Override // com.google.android.recaptcha.internal.zzj
    public final byte zza(zzv zzvVar, int i) {
        return zzvVar.zza(i);
    }

    @Override // com.google.android.recaptcha.internal.zzj
    public final zzj zzb() {
        return new zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzj
    public final zzv zzc(zzv zzvVar, int i, int i2) {
        byte[] bArr;
        int length;
        if (i >= 0 && i <= i2 && i2 <= (length = (bArr = zzvVar.zzc).length) && i <= i2 && i2 <= length) {
            return new zzv(zzv.zzh(bArr, i, i2 - i));
        }
        k20.o();
        return null;
    }
}
