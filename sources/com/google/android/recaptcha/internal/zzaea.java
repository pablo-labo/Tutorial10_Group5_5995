package com.google.android.recaptcha.internal;

import defpackage.k20;
import defpackage.p6;

/* JADX INFO: loaded from: classes2.dex */
final class zzaea extends zzaed {
    private final int zzc;

    public zzaea(byte[] bArr, int i, int i2) {
        super(bArr);
        zzaef.zzk(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.recaptcha.internal.zzaed, com.google.android.recaptcha.internal.zzaef
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzaed) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(p6.c(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(k20.l("Index > length: ", i, i2, ", "));
    }

    @Override // com.google.android.recaptcha.internal.zzaed, com.google.android.recaptcha.internal.zzaef
    public final byte zzb(int i) {
        return ((zzaed) this).zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzaed
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzaed, com.google.android.recaptcha.internal.zzaef
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzaed, com.google.android.recaptcha.internal.zzaef
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzaed) this).zza, 0, bArr, 0, i3);
    }
}
