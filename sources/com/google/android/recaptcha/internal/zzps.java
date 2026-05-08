package com.google.android.recaptcha.internal;

import defpackage.r6;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class zzps extends zzpt implements Serializable {
    final byte[] zza;

    public zzps(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzpt
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length < 4) {
            r6.g(zznc.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0;
        }
        int i = bArr[0] & 255;
        int i2 = bArr[1] & 255;
        int i3 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i | (i2 << 8) | (i3 << 16);
    }

    @Override // com.google.android.recaptcha.internal.zzpt
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.recaptcha.internal.zzpt
    public final boolean zzc(zzpt zzptVar) {
        int length = zzptVar.zze().length;
        byte[] bArr = this.zza;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == zzptVar.zze()[i];
        }
        return z;
    }

    @Override // com.google.android.recaptcha.internal.zzpt
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.recaptcha.internal.zzpt
    public final byte[] zze() {
        return this.zza;
    }
}
