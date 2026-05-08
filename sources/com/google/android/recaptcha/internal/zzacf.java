package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacf {
    public static byte[] zza(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int length = bArr[i2].length;
            if (i > Integer.MAX_VALUE - length) {
                l6.m("exceeded size limit");
                return null;
            }
            i += length;
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            byte[] bArr3 = bArr[i4];
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length2);
            i3 += length2;
        }
        return bArr2;
    }
}
