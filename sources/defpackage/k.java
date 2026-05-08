package defpackage;

import defpackage.w2;
import defpackage.zn1;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final zn1.c a = new zn1.c();
    public static final int b = -1234567890;

    public static final boolean a(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbI = w40.i(j, "size=", " offset=");
            sbI.append(j2);
            sbI.append(" byteCount=");
            sbI.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbI.toString());
        }
    }

    public static final int c(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final String d(byte b2) {
        char[] cArr = wg2.b;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String e(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = wg2.b;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        w2.a.a(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }
}
