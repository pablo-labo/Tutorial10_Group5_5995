package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.gms.location.LocationResult;
import java.math.BigInteger;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class h91 implements dnd {
    public final /* synthetic */ int a;

    public static void A(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static boolean B(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean C(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean D(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean E(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean F(long[] jArr) {
        for (int i = 0; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void G(long j, byte[] bArr, int i) {
        A((int) (j >>> 32), bArr, i);
        A((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void H(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr[0]) & 4294967295L;
        long j7 = j6 * j2;
        iArr3[0] = (int) j7;
        long j8 = (j6 * j3) + (j7 >>> 32);
        iArr3[1] = (int) j8;
        long j9 = (j6 * j4) + (j8 >>> 32);
        iArr3[2] = (int) j9;
        long j10 = (j6 * j5) + (j9 >>> 32);
        iArr3[3] = (int) j10;
        iArr3[4] = (int) (j10 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j11 = ((long) iArr[i]) & j;
            long j12 = (j11 * j2) + (((long) iArr3[i]) & j);
            iArr3[i] = (int) j12;
            int i3 = i + 1;
            long j13 = j;
            long j14 = (j11 * j3) + (((long) iArr3[i3]) & j13) + (j12 >>> 32);
            iArr3[i3] = (int) j14;
            int i4 = i + 2;
            long j15 = (j11 * j4) + (((long) iArr3[i4]) & j13) + (j14 >>> 32);
            iArr3[i4] = (int) j15;
            long j16 = j15 >>> 32;
            int i5 = i + 3;
            long j17 = (j11 * j5) + (((long) iArr3[i5]) & j13) + j16;
            iArr3[i5] = (int) j17;
            iArr3[i + 4] = (int) (j17 >>> 32);
            i = i3;
            j = j13;
        }
    }

    public static void I(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr[0]) & 4294967295L;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (j8 * j3) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (j8 * j6) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j16 = ((long) iArr[i]) & 4294967295L;
            long j17 = (j16 * j) + (((long) iArr3[i]) & 4294967295L);
            iArr3[i] = (int) j17;
            int i3 = i + 1;
            long j18 = j5;
            long j19 = (j16 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j17 >>> 32);
            iArr3[i3] = (int) j19;
            int i4 = i + 2;
            long j20 = (j16 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j19 >>> 32);
            iArr3[i4] = (int) j20;
            int i5 = i + 3;
            long j21 = (j16 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j20 >>> 32);
            iArr3[i5] = (int) j21;
            int i6 = i + 4;
            long j22 = (j16 * j18) + (((long) iArr3[i6]) & 4294967295L) + (j21 >>> 32);
            iArr3[i6] = (int) j22;
            int i7 = i + 5;
            long j23 = (j16 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j22 >>> 32);
            iArr3[i7] = (int) j23;
            int i8 = i + 6;
            long j24 = (j16 * j7) + (((long) iArr3[i8]) & 4294967295L) + (j23 >>> 32);
            iArr3[i8] = (int) j24;
            iArr3[i + 7] = (int) (j24 >>> 32);
            i = i3;
            j5 = j18;
        }
    }

    public static int J(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = 0;
        int i = 0;
        while (i < 7) {
            long j9 = j7;
            long j10 = ((long) iArr[i]) & 4294967295L;
            long j11 = (((long) iArr3[i]) & 4294967295L) + (j10 * j);
            iArr3[i] = (int) j11;
            int i2 = i + 1;
            long j12 = (j10 * j2) + (((long) iArr3[i2]) & 4294967295L) + (j11 >>> 32);
            iArr3[i2] = (int) j12;
            int i3 = i + 2;
            long j13 = (j10 * j3) + (((long) iArr3[i3]) & 4294967295L) + (j12 >>> 32);
            int i4 = i;
            iArr3[i3] = (int) j13;
            int i5 = i4 + 3;
            long j14 = (j10 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j13 >>> 32);
            iArr3[i5] = (int) j14;
            int i6 = i4 + 4;
            long j15 = (j10 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j14 >>> 32);
            iArr3[i6] = (int) j15;
            int i7 = i4 + 5;
            long j16 = (j10 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j15 >>> 32);
            iArr3[i7] = (int) j16;
            int i8 = i4 + 6;
            long j17 = (j10 * j9) + (((long) iArr3[i8]) & 4294967295L) + (j16 >>> 32);
            iArr3[i8] = (int) j17;
            int i9 = i4 + 7;
            long j18 = j8 + (((long) iArr3[i9]) & 4294967295L) + (j17 >>> 32);
            iArr3[i9] = (int) j18;
            j8 = j18 >>> 32;
            i = i2;
            j7 = j9;
        }
        return (int) j8;
    }

    public static void M(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
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
                int i7 = i6 >>> 31;
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = ((long) iArr2[3]) & 4294967295L;
                long j11 = ((long) iArr2[4]) & 4294967295L;
                long j12 = (j9 * j) + j7 + (j8 >>> 32);
                int i8 = (int) j12;
                iArr2[2] = i7 | (i8 << 1);
                long jE = akb.e(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (jE >>> 32);
                long j14 = ((long) iArr[3]) & 4294967295L;
                long j15 = (((long) iArr2[5]) & 4294967295L) + (j13 >>> 32);
                long j16 = (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
                long j17 = (j * j14) + (jE & 4294967295L);
                int i9 = (int) j17;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                long jE2 = akb.e(j14, j6, j17 >>> 32, j13 & 4294967295L);
                long jE3 = akb.e(j14, j9, jE2 >>> 32, j15 & 4294967295L);
                long j18 = j16 + (jE3 >>> 32);
                int i10 = (int) jE2;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                int i11 = i10 >>> 31;
                int i12 = (int) (jE3 & 4294967295L);
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                int i14 = (int) j18;
                iArr2[6] = i13 | (i14 << 1);
                iArr2[7] = (i14 >>> 31) | ((iArr2[7] + ((int) (j18 >>> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    public static void N(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 14;
        int i2 = 0;
        int i3 = 6;
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
                long j34 = jE8 & 4294967295L;
                long jE10 = akb.e(j28, j21, jE9 >>> 32, j32);
                long j35 = j31 + (jE10 >>> 32);
                long j36 = jE10 & 4294967295L;
                long j37 = ((long) iArr[6]) & 4294967295L;
                long j38 = (((long) iArr2[11]) & 4294967295L) + (j35 >>> 32);
                long j39 = j35 & 4294967295L;
                long j40 = (((long) iArr2[12]) & 4294967295L) + (j38 >>> 32);
                long j41 = j38 & 4294967295L;
                long j42 = (j37 * j) + (jE7 & 4294967295L);
                int i14 = (int) j42;
                iArr2[6] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long jE11 = akb.e(j37, j6, j42 >>> 32, j34);
                long jE12 = akb.e(j37, j9, jE11 >>> 32, jE9 & 4294967295L);
                long jE13 = akb.e(j37, j14, jE12 >>> 32, j36);
                long jE14 = akb.e(j37, j21, jE13 >>> 32, j39);
                long jE15 = akb.e(j37, j28, jE14 >>> 32, j41);
                long j43 = j40 + (jE15 >>> 32);
                int i16 = (int) jE11;
                iArr2[7] = (i16 << 1) | i15;
                int i17 = (int) jE12;
                iArr2[8] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) jE13;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) jE14;
                iArr2[10] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) jE15;
                iArr2[11] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j43;
                iArr2[12] = i24 | (i25 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j43 >>> 32))) << 1) | (i25 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static int O(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int P(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j7 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static BigInteger Q(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                A(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int h(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int n(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int o(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static void s(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static boolean u(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] v(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            o6.h();
            return null;
        }
        int[] iArr = new int[7];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static int w(int[] iArr) {
        return iArr[0] & 1;
    }

    public static boolean y(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
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

    public static boolean z(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
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

    public abstract void K(LocationResult locationResult);

    public void L(hv1 hv1Var, Collection collection) {
        hv1Var.getClass();
        hv1Var.C0(collection);
    }

    @Override // defpackage.dnd
    public Matrix f(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        x(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
        return matrix;
    }

    public abstract void p(hv1 hv1Var);

    public abstract void r(hv1 hv1Var, hv1 hv1Var2);

    public abstract Object t();

    public String toString() {
        switch (this.a) {
            case 2:
                return t().toString();
            default:
                return super.toString();
        }
    }

    public abstract void x(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
}
