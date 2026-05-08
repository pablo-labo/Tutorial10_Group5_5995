package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.uh6;
import defpackage.w2;

/* JADX INFO: loaded from: classes3.dex */
public final class th6 {
    public static final int[] a;
    public static final int[] b;
    public static final long[] c;

    static {
        int[] iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        a = iArr;
        int[] iArr2 = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        b = iArr2;
        int[] iArr3 = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        long[] jArr = new long[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        c = jArr;
    }

    public static final int a(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        bg.m(zte.h(10, j), "The resulting string length is too big: ");
        return 0;
    }

    public static final void b(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 < 1) {
            StringBuilder sbJ = m6.j(i, "Expected at least 1 hexadecimal digits at index ", ", but was \"", str.substring(i, i2), "\" of length ");
            sbJ.append(i3);
            throw new NumberFormatException(sbJ.toString());
        }
        if (i3 > 16) {
            int i4 = (i3 + i) - 16;
            while (i < i4) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbG = o6.g(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbG.append(str.charAt(i));
                    sbG.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbG.toString());
                }
                i++;
            }
        }
    }

    public static final int c(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static long d(int i, int i2, String str) {
        uh6 uh6Var = uh6.d;
        uh6Var.getClass();
        w2.a.a(i, i2, str.length());
        if (uh6Var.c.a) {
            b(i, i2, str);
            return e(i, i2, str);
        }
        if (i2 - i <= 0) {
            throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(str.substring(i, i2)));
        }
        b(i, i2, str);
        return e(i, i2, str);
    }

    public static final long e(int i, int i2, String str) {
        long j = 0;
        while (i < i2) {
            long j2 = j << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j3 = c[cCharAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i++;
                }
            }
            StringBuilder sbG = o6.g(i, "Expected a hexadecimal digit at index ", ", but was ");
            sbG.append(str.charAt(i));
            throw new NumberFormatException(sbG.toString());
        }
        return j;
    }

    public static final int f(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    public static String g(byte[] bArr) {
        uh6 uh6Var = uh6.d;
        uh6Var.getClass();
        int length = bArr.length;
        w2.a.a(0, length, bArr.length);
        if (length == 0) {
            return "";
        }
        int[] iArr = uh6Var.a ? b : a;
        uh6.a aVar = uh6Var.b;
        if (aVar.a) {
            if (aVar.b) {
                char[] cArr = new char[a(((long) length) * 2)];
                int iC = 0;
                for (int i = 0; i < length; i++) {
                    iC = c(bArr, i, iArr, cArr, iC);
                }
                return new String(cArr);
            }
            if (length <= 0) {
                l5.q("Failed requirement.");
                return null;
            }
            char[] cArr2 = new char[a(((long) length) * 2)];
            int iF = f("", cArr2, c(bArr, 0, iArr, cArr2, f("", cArr2, 0)));
            for (int i2 = 1; i2 < length; i2++) {
                iF = f("", cArr2, c(bArr, i2, iArr, cArr2, f("", cArr2, f("", cArr2, iF))));
            }
            return new String(cArr2);
        }
        if (length <= 0) {
            l5.q("Failed requirement.");
            return null;
        }
        int i3 = (length - 1) / Integer.MAX_VALUE;
        int i4 = length % Integer.MAX_VALUE;
        if (i4 == 0) {
            i4 = Integer.MAX_VALUE;
        }
        int iA = a((2 * ((long) length)) + (((long) ((i4 - 1) / Integer.MAX_VALUE)) * 2) + ((long) i3));
        char[] cArr3 = new char[iA];
        int iF2 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (i5 == Integer.MAX_VALUE) {
                cArr3[iF2] = '\n';
                i6 = 0;
                iF2++;
                i5 = 0;
            } else if (i6 == Integer.MAX_VALUE) {
                iF2 = f("  ", cArr3, iF2);
                i6 = 0;
            }
            if (i6 != 0) {
                iF2 = f("", cArr3, iF2);
            }
            iF2 = f("", cArr3, c(bArr, i7, iArr, cArr3, f("", cArr3, iF2)));
            i6++;
            i5++;
        }
        if (iF2 == iA) {
            return new String(cArr3);
        }
        r6.g("Check failed.");
        return null;
    }
}
