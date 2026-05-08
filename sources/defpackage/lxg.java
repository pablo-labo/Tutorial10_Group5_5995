package defpackage;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class lxg {
    public static boolean a = false;
    public static final byte[] b = a("RIFF");
    public static final byte[] c = a("WEBP");
    public static final byte[] d = a("VP8 ");
    public static final byte[] e = a("VP8L");
    public static final byte[] f = a("VP8X");

    public static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            l6.p("ASCII not found!", e2);
            return null;
        }
    }

    public static boolean b(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr2.length + i <= bArr.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2 + i] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }
}
