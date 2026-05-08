package com.google.android.recaptcha.internal;

import defpackage.l5;

/* JADX INFO: loaded from: classes2.dex */
public final class zzada {
    public static byte[] zza(String str) {
        if (str.length() % 2 != 0) {
            l5.q("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                l5.q("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }
}
