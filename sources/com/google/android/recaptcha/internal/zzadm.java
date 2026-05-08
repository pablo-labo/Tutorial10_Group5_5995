package com.google.android.recaptcha.internal;

import defpackage.ja;
import defpackage.l5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadm {
    private final byte[] zza;

    private zzadm(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static zzadm zzb(byte[] bArr) {
        if (bArr != null) {
            return zzc(bArr, 0, bArr.length);
        }
        ja.k("data must be non-null");
        return null;
    }

    public static zzadm zzc(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            ja.k("data must be non-null");
            return null;
        }
        int length = bArr.length;
        if (i2 > length) {
            i2 = length;
        }
        return new zzadm(bArr, 0, i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzadm) {
            return Arrays.equals(((zzadm) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return l5.m("Bytes(", sb.toString(), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzd() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
