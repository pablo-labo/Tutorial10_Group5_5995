package com.google.android.recaptcha.internal;

import android.os.Build;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuy {
    public static final /* synthetic */ int zza = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final zzadm zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new zzux("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return zzadm.zzb(bArr);
    }

    public static Integer zzb() {
        if (zzc()) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zzc() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static boolean zzd(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
