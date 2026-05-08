package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class of1 {
    public static final /* synthetic */ int a = 0;

    public static class a {
    }

    public static class b {
    }

    static {
        dmc.n(new mf1());
        dmc.n(new nf1(0));
    }

    public static int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        for (int i4 = 0; i3 < i && i4 < i2; i4++) {
            int i5 = bArr[i3] & 255;
            int i6 = bArr2[i4] & 255;
            if (i5 != i6) {
                return i5 - i6;
            }
            i3++;
        }
        return i - i2;
    }

    public static void b(double d, byte[] bArr, int i) {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = (int) jDoubleToRawLongBits;
        int i3 = (int) (jDoubleToRawLongBits >>> 32);
        bArr[i] = (byte) i2;
        bArr[i + 4] = (byte) i3;
        bArr[i + 5] = (byte) (i3 >>> 8);
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 6] = (byte) (i3 >>> 16);
        bArr[i + 7] = (byte) (i3 >>> 24);
        bArr[i + 3] = (byte) (i2 >>> 24);
    }

    public static void c(float f, byte[] bArr, int i) {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        bArr[i + 3] = (byte) (iFloatToRawIntBits >>> 24);
        bArr[i + 2] = (byte) (iFloatToRawIntBits >>> 16);
        bArr[i + 1] = (byte) (iFloatToRawIntBits >>> 8);
        bArr[i] = (byte) iFloatToRawIntBits;
    }

    public static int d(int i, byte[] bArr, int i2) {
        int i3;
        int i4 = (i >> 31) ^ (i << 1);
        if ((i4 & (-128)) != 0) {
            i3 = i2 + 1;
            bArr[i2] = (byte) ((i4 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255);
            int i5 = i4 >>> 7;
            if (i5 > 127) {
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((i5 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255);
                int i7 = i4 >>> 14;
                if (i7 > 127) {
                    int i8 = i2 + 3;
                    bArr[i6] = (byte) ((i7 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255);
                    int i9 = i4 >>> 21;
                    if (i9 > 127) {
                        bArr[i8] = (byte) ((i9 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255);
                        i4 >>>= 28;
                        i3 = i2 + 4;
                    } else {
                        i4 = i9;
                        i3 = i8;
                    }
                } else {
                    i4 = i7;
                    i3 = i6;
                }
            } else {
                i4 = i5;
            }
        } else {
            i3 = i2;
        }
        bArr[i3] = (byte) i4;
        return (i3 + 1) - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0 A[PHI: r1 r5
  0x00a0: PHI (r1v7 int) = (r1v6 int), (r1v10 int), (r1v13 int), (r1v16 int) binds: [B:7:0x0034, B:11:0x0054, B:15:0x0074, B:19:0x0094] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r5v9 long) = (r5v8 long), (r5v19 long), (r5v29 long), (r5v39 long) binds: [B:7:0x0034, B:11:0x0054, B:15:0x0074, B:19:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1 A[PHI: r0 r5
  0x00a1: PHI (r0v8 int) = (r0v7 int), (r0v11 int), (r0v12 int), (r0v15 int), (r0v18 int) binds: [B:5:0x0024, B:21:0x00a0, B:9:0x0044, B:13:0x0064, B:17:0x0084] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r5v3 long) = (r5v2 long), (r5v9 long), (r5v14 long), (r5v24 long), (r5v34 long) binds: [B:5:0x0024, B:21:0x00a0, B:9:0x0044, B:13:0x0064, B:17:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(long r11, byte[] r13, int r14) {
        /*
            r0 = 1
            long r0 = r11 << r0
            r2 = 63
            long r11 = r11 >> r2
            long r11 = r11 ^ r0
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r11
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto La3
            int r0 = r14 + 1
            r3 = 128(0x80, double:6.32E-322)
            long r5 = r11 | r3
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            int r1 = (int) r5
            byte r1 = (byte) r1
            r13[r14] = r1
            r1 = 7
            long r5 = r11 >>> r1
            r9 = 127(0x7f, double:6.27E-322)
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 <= 0) goto La1
            int r1 = r14 + 2
            long r5 = r5 | r3
            long r5 = r5 & r7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r13[r0] = r5
            r0 = 14
            long r5 = r11 >>> r0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto La0
            int r0 = r14 + 3
            long r5 = r5 | r3
            long r5 = r5 & r7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r13[r1] = r5
            r1 = 21
            long r5 = r11 >>> r1
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 <= 0) goto La1
            int r1 = r14 + 4
            long r5 = r5 | r3
            long r5 = r5 & r7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r13[r0] = r5
            r0 = 28
            long r5 = r11 >>> r0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto La0
            int r0 = r14 + 5
            long r5 = r5 | r3
            long r5 = r5 & r7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r13[r1] = r5
            r1 = 35
            long r5 = r11 >>> r1
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 <= 0) goto La1
            int r1 = r14 + 6
            long r5 = r5 | r3
            long r5 = r5 & r7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r13[r0] = r5
            r0 = 42
            long r5 = r11 >>> r0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto La0
            int r0 = r14 + 7
            long r5 = r5 | r3
            long r5 = r5 & r7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r13[r1] = r5
            r1 = 49
            long r5 = r11 >>> r1
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 <= 0) goto La1
            int r1 = r14 + 8
            long r5 = r5 | r3
            long r5 = r5 & r7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r13[r0] = r5
            r0 = 56
            long r5 = r11 >>> r0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto La0
            int r0 = r14 + 9
            long r3 = r3 | r5
            long r3 = r3 & r7
            int r3 = (int) r3
            byte r3 = (byte) r3
            r13[r1] = r3
            long r11 = r11 >>> r2
            goto La4
        La0:
            r0 = r1
        La1:
            r11 = r5
            goto La4
        La3:
            r0 = r14
        La4:
            int r1 = r0 + 1
            int r11 = (int) r11
            byte r11 = (byte) r11
            r13[r0] = r11
            int r1 = r1 - r14
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of1.e(long, byte[], int):int");
    }
}
