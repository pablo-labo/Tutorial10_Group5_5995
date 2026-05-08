package defpackage;

import android.graphics.Path;
import android.graphics.Typeface;
import defpackage.nb8;
import java.math.BigInteger;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v1 implements Decoder, ul2, oyd {
    public static nb8.a a;

    public static int I(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int J(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int K(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        long j = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (((long) i3) & 4294967295L);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L) + (j >>> 32);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L) + (j2 >>> 32);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L) + (j3 >>> 32);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L) + (j4 >>> 32);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (((long) iArr[i + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i8])) + (j5 >>> 32);
        iArr2[i8] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int L(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[12]) & 4294967295L);
        int i = (int) j;
        iArr[6] = i;
        iArr2[12] = i;
        long j2 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[13]) & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[7] = i2;
        iArr2[13] = i2;
        long j3 = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[14]) & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[8] = i3;
        iArr2[14] = i3;
        long j4 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[15]) & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[9] = i4;
        iArr2[15] = i4;
        long j5 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[10] = i5;
        iArr2[16] = i5;
        long j6 = (((long) iArr[11]) & 4294967295L) + (4294967295L & ((long) iArr2[17])) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[11] = i6;
        iArr2[17] = i6;
        return (int) (j6 >>> 32);
    }

    public static boolean Q(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 5;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[6 + i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                z = false;
                break;
            }
            if (i2 > i3) {
                break;
            }
            i--;
        }
        if (z) {
            r0(6, 0, iArr, iArr2, iArr3);
            return z;
        }
        r0(0, 6, iArr2, iArr, iArr3);
        return z;
    }

    public static boolean S(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] T(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            o6.h();
            return null;
        }
        int[] iArr = new int[6];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static long[] U(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            o6.h();
            return null;
        }
        long[] jArr = new long[3];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }

    public static int W(int[] iArr) {
        return iArr[0] & 1;
    }

    public static boolean c0(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean d0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean e0(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean f0(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void g0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        int i = 1;
        long j7 = ((long) iArr[0]) & 4294967295L;
        long j8 = j7 * j;
        iArr3[0] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[5] = (int) j13;
        int i2 = 6;
        iArr3[6] = (int) (j13 >>> 32);
        while (true) {
            int i3 = i;
            if (i3 >= i2) {
                return;
            }
            long j14 = ((long) iArr[i3]) & 4294967295L;
            long j15 = (j14 * j) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j15;
            i = i3 + 1;
            long j16 = j5;
            long j17 = (j14 * j2) + (((long) iArr3[i]) & 4294967295L) + (j15 >>> 32);
            iArr3[i] = (int) j17;
            int i4 = i3 + 2;
            long j18 = (j14 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j17 >>> 32);
            iArr3[i4] = (int) j18;
            int i5 = i3 + 3;
            long j19 = (j14 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j18 >>> 32);
            iArr3[i5] = (int) j19;
            int i6 = i3 + 4;
            long j20 = (j14 * j16) + (((long) iArr3[i6]) & 4294967295L) + (j19 >>> 32);
            iArr3[i6] = (int) j20;
            int i7 = i3 + 5;
            long j21 = (j14 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j20 >>> 32);
            iArr3[i7] = (int) j21;
            iArr3[i3 + 6] = (int) (j21 >>> 32);
            j5 = j16;
            i2 = 6;
        }
    }

    public static void h0(int[] iArr, int[] iArr2, int[] iArr3) {
        g0(iArr, iArr2, iArr3);
        long j = ((long) iArr2[6]) & 4294967295L;
        long j2 = ((long) iArr2[7]) & 4294967295L;
        long j3 = ((long) iArr2[8]) & 4294967295L;
        long j4 = ((long) iArr2[9]) & 4294967295L;
        long j5 = ((long) iArr2[10]) & 4294967295L;
        long j6 = ((long) iArr2[11]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = j7 * j;
        iArr3[12] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[13] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[14] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[15] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[16] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[17] = (int) j13;
        iArr3[18] = (int) (j13 >>> 32);
        int i = 12;
        int i2 = 1;
        while (i2 < 6) {
            int i3 = i + 1;
            int i4 = i2;
            long j14 = ((long) iArr[6 + i2]) & 4294967295L;
            long j15 = j3;
            long j16 = (j14 * j) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j16;
            int i5 = i + 2;
            long j17 = (j14 * j2) + (((long) iArr3[i5]) & 4294967295L) + (j16 >>> 32);
            iArr3[i5] = (int) j17;
            int i6 = i + 3;
            long j18 = (j14 * j15) + (((long) iArr3[i6]) & 4294967295L) + (j17 >>> 32);
            iArr3[i6] = (int) j18;
            int i7 = i + 4;
            long j19 = (j14 * j4) + (((long) iArr3[i7]) & 4294967295L) + (j18 >>> 32);
            iArr3[i7] = (int) j19;
            int i8 = i + 5;
            long j20 = (j14 * j5) + (((long) iArr3[i8]) & 4294967295L) + (j19 >>> 32);
            iArr3[i8] = (int) j20;
            int i9 = i + 6;
            long j21 = (j14 * j6) + (((long) iArr3[i9]) & 4294967295L) + (j20 >>> 32);
            iArr3[i9] = (int) j21;
            iArr3[i + 7] = (int) (j21 >>> 32);
            i2 = i4 + 1;
            i = i3;
            j3 = j15;
        }
        int iL = L(iArr3, iArr3);
        int iK = K(18, 12, K(0, 6, 0, iArr3, iArr3) + iL, iArr3, iArr3) + iL;
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        boolean z = Q(iArr, iArr, iArr4) != Q(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[12];
        g0(iArr4, iArr5, iArr6);
        ka6.Q(24, iK + (z ? ka6.N(12, 6, iArr6, iArr3) : ka6.q1(12, 6, iArr6, iArr3)), iArr3, 18);
    }

    public static int i0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = 0;
        while (i < 6) {
            long j8 = j;
            int i2 = i;
            long j9 = ((long) iArr[i]) & 4294967295L;
            long j10 = (((long) iArr3[i2]) & 4294967295L) + (j9 * j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j9 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j10 >>> 32);
            iArr3[i3] = (int) j11;
            int i4 = i2 + 2;
            long j12 = (j9 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j11 >>> 32);
            iArr3[i4] = (int) j12;
            int i5 = i2 + 3;
            long j13 = (j9 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j12 >>> 32);
            iArr3[i5] = (int) j13;
            int i6 = i2 + 4;
            long j14 = (j9 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j13 >>> 32);
            iArr3[i6] = (int) j14;
            int i7 = i2 + 5;
            long j15 = (j9 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j14 >>> 32);
            iArr3[i7] = (int) j15;
            int i8 = i2 + 6;
            long j16 = j7 + (((long) iArr3[i8]) & 4294967295L) + (j15 >>> 32);
            iArr3[i8] = (int) j16;
            j7 = j16 >>> 32;
            i = i3;
            j = j8;
        }
        return (int) j7;
    }

    public static void o0(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i2 << 31)) & 4294967295L);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = ((long) iArr2[2]) & 4294967295L;
                long j8 = (j6 * j) + j5;
                int i6 = (int) j8;
                iArr2[1] = i5 | (i6 << 1);
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = ((long) iArr2[3]) & 4294967295L;
                long j11 = ((long) iArr2[4]) & 4294967295L;
                long j12 = (j9 * j) + j7 + (j8 >>> 32);
                int i7 = (int) j12;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long jE = akb.e(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (jE >>> 32);
                long j14 = ((long) iArr[3]) & 4294967295L;
                long j15 = (((long) iArr2[5]) & 4294967295L) + (j13 >>> 32);
                long j16 = j13 & 4294967295L;
                long j17 = (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
                long j18 = j15 & 4294967295L;
                long j19 = (j14 * j) + (jE & 4294967295L);
                int i8 = (int) j19;
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long jE2 = akb.e(j14, j6, j19 >>> 32, j16);
                long jE3 = akb.e(j14, j9, jE2 >>> 32, j18);
                long j20 = j17 + (jE3 >>> 32);
                long j21 = ((long) iArr[4]) & 4294967295L;
                long j22 = (((long) iArr2[7]) & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j22 >>> 32);
                long j25 = j22 & 4294967295L;
                long j26 = (j21 * j) + (jE2 & 4294967295L);
                int i10 = (int) j26;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long jE4 = akb.e(j21, j6, j26 >>> 32, jE3 & 4294967295L);
                long jE5 = akb.e(j21, j9, jE4 >>> 32, j23);
                long jE6 = akb.e(j21, j14, jE5 >>> 32, j25);
                long j27 = j24 + (jE6 >>> 32);
                long j28 = ((long) iArr[5]) & 4294967295L;
                long j29 = (((long) iArr2[9]) & 4294967295L) + (j27 >>> 32);
                long j30 = j27 & 4294967295L;
                long j31 = (((long) iArr2[10]) & 4294967295L) + (j29 >>> 32);
                long j32 = j29 & 4294967295L;
                long j33 = (j28 * j) + (jE4 & 4294967295L);
                int i12 = (int) j33;
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long jE7 = akb.e(j28, j6, j33 >>> 32, jE5 & 4294967295L);
                long jE8 = akb.e(j28, j9, jE7 >>> 32, jE6 & 4294967295L);
                long jE9 = akb.e(j28, j14, jE8 >>> 32, j30);
                long jE10 = akb.e(j28, j21, jE9 >>> 32, j32);
                long j34 = j31 + (jE10 >>> 32);
                int i14 = (int) jE7;
                iArr2[6] = (i14 << 1) | i13;
                int i15 = (int) jE8;
                iArr2[7] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) jE9;
                iArr2[8] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) jE10;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j34;
                iArr2[10] = i20 | (i21 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j34 >>> 32))) << 1) | (i21 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static void p0(int[] iArr, int[] iArr2) {
        o0(iArr, iArr2);
        long j = 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        int i = 5;
        int i2 = 12;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j3 = ((long) iArr[i + 6]) & j;
            long j4 = j3 * j3;
            long j5 = j;
            iArr2[i2 + 11] = ((int) (j4 >>> 33)) | (i3 << 31);
            int i5 = i2 - 2;
            iArr2[i2 + 10] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i4 <= 0) {
                long j6 = j2 * j2;
                iArr2[12] = (int) j6;
                long j7 = ((long) iArr[7]) & j5;
                long j8 = ((long) iArr2[14]) & j5;
                long j9 = (j7 * j2) + ((((long) (i3 << 31)) & j5) | (j6 >>> 33));
                int i6 = (int) j9;
                iArr2[13] = (i6 << 1) | (((int) (j6 >>> 32)) & 1);
                long j10 = ((long) iArr[8]) & j5;
                long j11 = ((long) iArr2[15]) & j5;
                long j12 = ((long) iArr2[16]) & j5;
                long j13 = (j10 * j2) + j8 + (j9 >>> 32);
                int i7 = (int) j13;
                iArr2[14] = (i7 << 1) | (i6 >>> 31);
                long jE = akb.e(j10, j7, j13 >>> 32, j11);
                long j14 = j12 + (jE >>> 32);
                long j15 = ((long) iArr[9]) & j5;
                long j16 = (((long) iArr2[17]) & j5) + (j14 >>> 32);
                long j17 = (((long) iArr2[18]) & j5) + (j16 >>> 32);
                long j18 = (j15 * j2) + (jE & j5);
                int i8 = (int) j18;
                iArr2[15] = (i7 >>> 31) | (i8 << 1);
                long jE2 = akb.e(j15, j7, j18 >>> 32, j14 & j5);
                long jE3 = akb.e(j15, j10, jE2 >>> 32, j16 & j5);
                long j19 = j17 + (jE3 >>> 32);
                long j20 = jE3 & j5;
                long j21 = ((long) iArr[10]) & j5;
                long j22 = (((long) iArr2[19]) & j5) + (j19 >>> 32);
                long j23 = j19 & j5;
                long j24 = (((long) iArr2[20]) & j5) + (j22 >>> 32);
                long j25 = j22 & j5;
                long j26 = (j21 * j2) + (jE2 & j5);
                int i9 = (int) j26;
                iArr2[16] = (i9 << 1) | (i8 >>> 31);
                long jE4 = akb.e(j21, j7, j26 >>> 32, j20);
                long jE5 = akb.e(j21, j10, jE4 >>> 32, j23);
                long jE6 = akb.e(j21, j15, jE5 >>> 32, j25);
                long j27 = jE5 & j5;
                long j28 = j24 + (jE6 >>> 32);
                long j29 = jE6 & j5;
                long j30 = ((long) iArr[11]) & j5;
                long j31 = (((long) iArr2[21]) & j5) + (j28 >>> 32);
                long j32 = j28 & j5;
                long j33 = (((long) iArr2[22]) & j5) + (j31 >>> 32);
                long j34 = j31 & j5;
                long j35 = (j30 * j2) + (jE4 & j5);
                int i10 = (int) j35;
                iArr2[17] = (i9 >>> 31) | (i10 << 1);
                int i11 = i10 >>> 31;
                long jE7 = akb.e(j30, j7, j35 >>> 32, j27);
                long jE8 = akb.e(j30, j10, jE7 >>> 32, j29);
                long jE9 = akb.e(j30, j15, jE8 >>> 32, j32);
                long jE10 = akb.e(j30, j21, jE9 >>> 32, j34);
                long j36 = j33 + (jE10 >>> 32);
                int i12 = (int) jE7;
                iArr2[18] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                int i14 = (int) jE8;
                iArr2[19] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) jE9;
                iArr2[20] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) jE10;
                iArr2[21] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j36;
                iArr2[22] = i19 | (i20 << 1);
                iArr2[23] = ((iArr2[23] + ((int) (j36 >>> 32))) << 1) | (i20 >>> 31);
                int iL = L(iArr2, iArr2);
                int iK = K(18, 12, K(0, 6, 0, iArr2, iArr2) + iL, iArr2, iArr2) + iL;
                int[] iArr3 = new int[6];
                Q(iArr, iArr, iArr3);
                int[] iArr4 = new int[12];
                o0(iArr3, iArr4);
                ka6.Q(24, ka6.q1(12, 6, iArr4, iArr2) + iK, iArr2, 18);
                return;
            }
            i2 = i5;
            i = i4;
            j = j5;
        }
    }

    public static int q0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static void r0(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[i]) & 4294967295L) - (((long) iArr2[i2]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        iArr3[5] = (int) (((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L)) + (j5 >> 32));
    }

    public static void s0(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        iArr2[5] = (int) (((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5]))) + (j5 >> 32));
    }

    public static BigInteger t0(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                h91.A(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger u0(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                h91.G(j, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.ul2
    public short A(wmb wmbVar, int i) {
        wmbVar.getClass();
        return t();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String C() {
        Object objP = P();
        objP.getClass();
        return (String) objP;
    }

    @Override // defpackage.oyd
    public int D(int i) {
        int iM0 = m0(i);
        if (iM0 == -1 || m0(iM0) == -1) {
            return -1;
        }
        return iM0;
    }

    @Override // defpackage.ul2
    public boolean E(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return x();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean F() {
        return true;
    }

    @Override // defpackage.ul2
    public double G(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return w();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte H() {
        Object objP = P();
        objP.getClass();
        return ((Byte) objP).byteValue();
    }

    public abstract boolean M(hie hieVar);

    public abstract boolean N();

    public abstract boolean O(kx9 kx9Var);

    public Object P() {
        throw new SerializationException(fwc.a.b(getClass()) + " can't retrieve untyped values");
    }

    public abstract void R(qb8 qb8Var);

    public abstract Object V(kx9 kx9Var);

    public abstract KSerializer X(yd8 yd8Var, List list);

    public abstract boolean Y();

    public abstract Path Z(float f, float f2, float f3, float f4);

    public abstract i04 a0(yd8 yd8Var, String str);

    @Override // kotlinx.serialization.encoding.Decoder
    public ul2 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    public abstract r7e b0(yd8 yd8Var, Object obj);

    public void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.ul2
    public Decoder d(wmb wmbVar, int i) {
        wmbVar.getClass();
        return s(wmbVar.h(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int e(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        Object objP = P();
        objP.getClass();
        return ((Integer) objP).intValue();
    }

    @Override // defpackage.ul2
    public long f(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return n();
    }

    @Override // defpackage.ul2
    public char g(wmb wmbVar, int i) {
        wmbVar.getClass();
        return y();
    }

    @Override // defpackage.ul2
    public Object h(SerialDescriptor serialDescriptor, int i, i04 i04Var, Object obj) {
        serialDescriptor.getClass();
        i04Var.getClass();
        if (i04Var.getDescriptor().b() || F()) {
            return B(i04Var);
        }
        return null;
    }

    @Override // defpackage.ul2
    public byte j(wmb wmbVar, int i) {
        wmbVar.getClass();
        return H();
    }

    public abstract int j0(int i);

    @Override // kotlinx.serialization.encoding.Decoder
    public int k() {
        Object objP = P();
        objP.getClass();
        return ((Integer) objP).intValue();
    }

    public abstract void k0(int i);

    @Override // defpackage.oyd
    public int l(int i) {
        int iJ0 = j0(i);
        if (iJ0 == -1 || j0(iJ0) == -1) {
            return -1;
        }
        return iJ0;
    }

    public abstract void l0(Typeface typeface, boolean z);

    @Override // defpackage.ul2
    public int m(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return k();
    }

    public abstract int m0(int i);

    @Override // kotlinx.serialization.encoding.Decoder
    public long n() {
        Object objP = P();
        objP.getClass();
        return ((Long) objP).longValue();
    }

    public abstract ui8 n0(zi8 zi8Var);

    @Override // defpackage.ul2
    public String o(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return C();
    }

    @Override // defpackage.oyd
    public int q(int i) {
        return m0(i);
    }

    @Override // defpackage.oyd
    public int r(int i) {
        return j0(i);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder s(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short t() {
        Object objP = P();
        objP.getClass();
        return ((Short) objP).shortValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float u() {
        Object objP = P();
        objP.getClass();
        return ((Float) objP).floatValue();
    }

    @Override // defpackage.ul2
    public float v(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return u();
    }

    public abstract void v0(Throwable th, Throwable th2);

    @Override // kotlinx.serialization.encoding.Decoder
    public double w() {
        Object objP = P();
        objP.getClass();
        return ((Double) objP).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean x() {
        Object objP = P();
        objP.getClass();
        return ((Boolean) objP).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char y() {
        Object objP = P();
        objP.getClass();
        return ((Character) objP).charValue();
    }

    public Object z(SerialDescriptor serialDescriptor, int i, i04 i04Var, Object obj) {
        serialDescriptor.getClass();
        i04Var.getClass();
        return B(i04Var);
    }
}
