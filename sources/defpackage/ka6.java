package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import defpackage.aga;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ka6 implements Encoder, vl2 {
    public static final Object a = new Object();
    public static fki b;
    public static HandlerThread c;

    public static boolean A0(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean B0(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean C0(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean D0(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean E0(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int F(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (((long) iArr[i2]) & 4294967295L) + (4294967295L & ((long) iArr2[i2])) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int G(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >>> 32);
    }

    public static void G0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr[0]) & 4294967295L;
        int i = 1;
        long j7 = j6 * j;
        iArr3[0] = (int) j7;
        char c2 = ' ';
        long j8 = (j7 >>> 32) + (j6 * j2);
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + (j6 * j3);
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + (j6 * j4);
        iArr3[3] = (int) j10;
        long j11 = (j6 * j5) + (j10 >>> 32);
        iArr3[4] = (int) j11;
        int i2 = 5;
        iArr3[5] = (int) (j11 >>> 32);
        while (true) {
            int i3 = i;
            if (i3 >= i2) {
                return;
            }
            long j12 = ((long) iArr[i3]) & 4294967295L;
            long j13 = (j12 * j) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j13;
            i = i3 + 1;
            char c3 = c2;
            long j14 = (j12 * j2) + (((long) iArr3[i]) & 4294967295L) + (j13 >>> c2);
            iArr3[i] = (int) j14;
            int i4 = i3 + 2;
            long j15 = j5;
            long j16 = (j12 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j14 >>> c3);
            iArr3[i4] = (int) j16;
            long j17 = j16 >>> c3;
            int i5 = i3 + 3;
            long j18 = (j12 * j4) + (((long) iArr3[i5]) & 4294967295L) + j17;
            iArr3[i5] = (int) j18;
            long j19 = j18 >>> c3;
            int i6 = i3 + 4;
            long j20 = (j12 * j15) + (((long) iArr3[i6]) & 4294967295L) + j19;
            iArr3[i6] = (int) j20;
            iArr3[i3 + 5] = (int) (j20 >>> c3);
            c2 = c3;
            j5 = j15;
            i2 = 5;
        }
    }

    public static int H(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j8 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static void H0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = j9 * j;
        iArr3[0] = (int) j10;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        int i = (int) (j17 >>> 32);
        iArr3[8] = i;
        int i2 = 1;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            long j18 = ((long) iArr[i2]) & 4294967295L;
            long j19 = j5;
            long j20 = (j18 * j) + (((long) iArr3[i2]) & 4294967295L);
            iArr3[i2] = (int) j20;
            int i4 = i2 + 1;
            long j21 = (j18 * j2) + (((long) iArr3[i4]) & 4294967295L) + (j20 >>> 32);
            iArr3[i4] = (int) j21;
            int i5 = i2 + 2;
            long j22 = (j18 * j3) + (((long) iArr3[i5]) & 4294967295L) + (j21 >>> 32);
            iArr3[i5] = (int) j22;
            int i6 = i2 + 3;
            long j23 = (j18 * j4) + (((long) iArr3[i6]) & 4294967295L) + (j22 >>> 32);
            iArr3[i6] = (int) j23;
            int i7 = i2 + 4;
            long j24 = (j18 * j19) + (((long) iArr3[i7]) & 4294967295L) + (j23 >>> 32);
            iArr3[i7] = (int) j24;
            int i8 = i2 + 5;
            long j25 = (j18 * j6) + (((long) iArr3[i8]) & 4294967295L) + (j24 >>> 32);
            iArr3[i8] = (int) j25;
            int i9 = i2 + 6;
            long j26 = (j18 * j7) + (((long) iArr3[i9]) & 4294967295L) + (j25 >>> 32);
            iArr3[i9] = (int) j26;
            long j27 = j26 >>> 32;
            int i10 = i2 + 7;
            long j28 = (j18 * j8) + (((long) iArr3[i10]) & 4294967295L) + j27;
            iArr3[i10] = (int) j28;
            iArr3[i2 + 8] = (int) (j28 >>> 32);
            i2 = i4;
            j5 = j19;
        }
    }

    public static void I(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (4294967295L & ((long) iArr[1])) + 1 + (j >>> 32);
        iArr[1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return;
        }
        t0(i, 2, iArr);
    }

    public static int I0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = 0;
        while (i < 5) {
            long j8 = j;
            long j9 = ((long) iArr[i]) & j8;
            int i2 = i;
            long j10 = (j9 * j2) + (((long) iArr3[i]) & j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j9 * j3) + (((long) iArr3[i3]) & j8) + (j10 >>> 32);
            iArr3[i3] = (int) j11;
            int i4 = i2 + 2;
            long j12 = (j9 * j4) + (((long) iArr3[i4]) & j8) + (j11 >>> 32);
            iArr3[i4] = (int) j12;
            int i5 = i2 + 3;
            long j13 = (j9 * j5) + (((long) iArr3[i5]) & j8) + (j12 >>> 32);
            iArr3[i5] = (int) j13;
            int i6 = i2 + 4;
            long j14 = (j9 * j6) + (((long) iArr3[i6]) & j8) + (j13 >>> 32);
            iArr3[i6] = (int) j14;
            int i7 = i2 + 5;
            long j15 = j7 + (((long) iArr3[i7]) & j8) + (j14 >>> 32);
            iArr3[i7] = (int) j15;
            j7 = j15 >>> 32;
            j = j8;
            j2 = j2;
            i = i3;
        }
        return (int) j7;
    }

    public static int J(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (((long) iArr[i2]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (4294967295L & ((long) iArr3[i2])) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int J0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = 0;
        int i = 0;
        while (i < 8) {
            long j10 = ((long) iArr[i]) & 4294967295L;
            long j11 = (j10 * j) + (((long) iArr3[i]) & 4294967295L);
            int i2 = i;
            iArr3[i2] = (int) j11;
            int i3 = i2 + 1;
            long j12 = (j10 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j11 >>> 32);
            iArr3[i3] = (int) j12;
            int i4 = i2 + 2;
            long j13 = (j10 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j12 >>> 32);
            iArr3[i4] = (int) j13;
            int i5 = i2 + 3;
            long j14 = (j10 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j13 >>> 32);
            iArr3[i5] = (int) j14;
            int i6 = i2 + 4;
            long j15 = (j10 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j14 >>> 32);
            iArr3[i6] = (int) j15;
            int i7 = i2 + 5;
            long j16 = (j10 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j15 >>> 32);
            iArr3[i7] = (int) j16;
            int i8 = i2 + 6;
            long j17 = (j10 * j7) + (((long) iArr3[i8]) & 4294967295L) + (j16 >>> 32);
            iArr3[i8] = (int) j17;
            int i9 = i2 + 7;
            long j18 = (j10 * j8) + (((long) iArr3[i9]) & 4294967295L) + (j17 >>> 32);
            iArr3[i9] = (int) j18;
            int i10 = i2 + 8;
            long j19 = j9 + (((long) iArr3[i10]) & 4294967295L) + (j18 >>> 32);
            iArr3[i10] = (int) j19;
            j9 = j19 >>> 32;
            i = i3;
        }
        return (int) j9;
    }

    public static int K(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >>> 32);
    }

    public static int L(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j8 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int M(int i, int i2, int i3, int[] iArr, int[] iArr2) {
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
        long j6 = (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L) + (j5 >>> 32);
        iArr2[i8] = (int) j6;
        int i9 = i2 + 6;
        long j7 = (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i9]) & 4294967295L) + (j6 >>> 32);
        iArr2[i9] = (int) j7;
        int i10 = i2 + 7;
        long j8 = (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i10])) + (j7 >>> 32);
        iArr2[i10] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int N(int i, int i2, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + i3;
            long j2 = (((long) iArr[i3]) & 4294967295L) + (4294967295L & ((long) iArr2[i4])) + j;
            iArr2[i4] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int O(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (((long) iArr[i2]) & 4294967295L) + (4294967295L & ((long) iArr2[i2])) + j;
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int P(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L);
        int i = (int) j;
        iArr[8] = i;
        iArr2[16] = i;
        long j2 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[17]) & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[9] = i2;
        iArr2[17] = i2;
        long j3 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[18]) & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[10] = i3;
        iArr2[18] = i3;
        long j4 = (((long) iArr[11]) & 4294967295L) + (((long) iArr2[19]) & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[11] = i4;
        iArr2[19] = i4;
        long j5 = (((long) iArr[12]) & 4294967295L) + (((long) iArr2[20]) & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[12] = i5;
        iArr2[20] = i5;
        long j6 = (((long) iArr[13]) & 4294967295L) + (((long) iArr2[21]) & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[13] = i6;
        iArr2[21] = i6;
        long j7 = (((long) iArr[14]) & 4294967295L) + (((long) iArr2[22]) & 4294967295L) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[14] = i7;
        iArr2[22] = i7;
        long j8 = (((long) iArr[15]) & 4294967295L) + (4294967295L & ((long) iArr2[23])) + (j7 >>> 32);
        int i8 = (int) j8;
        iArr[15] = i8;
        iArr2[23] = i8;
        return (int) (j8 >>> 32);
    }

    public static void Q(int i, int i2, int[] iArr, int i3) {
        long j = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[i3]));
        iArr[i3] = (int) j;
        if ((j >>> 32) == 0) {
            return;
        }
        t0(i, i3 + 1, iArr);
    }

    public static int R(int i, int i2, int[] iArr) {
        long j = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[0]));
        iArr[0] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return t0(i, 1, iArr);
    }

    public static int U(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
            i2++;
        }
        return -1;
    }

    public static boolean X(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 7;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[8 + i] ^ Integer.MIN_VALUE;
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
            n1(8, 0, iArr, iArr2, iArr3);
            return z;
        }
        n1(0, 8, iArr2, iArr, iArr3);
        return z;
    }

    public static boolean a0(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b0(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int b1(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        return i2 >>> 31;
    }

    public static boolean c0(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int c1(int i, int[] iArr) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            iArr[i2] = (i3 >>> (-2)) | (i4 << 2);
            i2++;
            i3 = i4;
        }
        return i3 >>> (-2);
    }

    public static boolean d0(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int d1(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            iArr2[i2] = (i3 >>> (-3)) | (i4 << 3);
            i2++;
            i3 = i4;
        }
        return i3 >>> (-3);
    }

    public static int[] f0(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            o6.h();
            return null;
        }
        int[] iArr = new int[5];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static int[] g0(BigInteger bigInteger, int i) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            o6.h();
            return null;
        }
        int[] iArr = new int[(i + 31) >> 5];
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i2++;
        }
        return iArr;
    }

    public static int[] h0(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            o6.h();
            return null;
        }
        int[] iArr = new int[8];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static long[] i0(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            o6.h();
            return null;
        }
        long[] jArr = new long[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }

    public static int j0(int[] iArr) {
        return iArr[0] & 1;
    }

    public static void j1(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 10;
        int i2 = 0;
        int i3 = 4;
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
                long j25 = (j21 * j) + (jE2 & 4294967295L);
                int i10 = (int) j25;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long jE4 = akb.e(j21, j6, j25 >>> 32, jE3 & 4294967295L);
                long jE5 = akb.e(j21, j9, jE4 >>> 32, j23);
                long jE6 = akb.e(j21, j14, jE5 >>> 32, j22 & 4294967295L);
                long j26 = j24 + (jE6 >>> 32);
                int i12 = (int) jE4;
                iArr2[5] = (i12 << 1) | i11;
                int i13 = (int) jE5;
                iArr2[6] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) jE6;
                iArr2[7] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j26;
                iArr2[8] = i16 | (i17 << 1);
                iArr2[9] = ((iArr2[9] + ((int) (j26 >>> 32))) << 1) | (i17 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static int k0(int[] iArr) {
        return iArr[0] & 1;
    }

    public static void k1(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
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
                long j21 = jE3 & 4294967295L;
                long j22 = ((long) iArr[4]) & 4294967295L;
                long j23 = (((long) iArr2[7]) & 4294967295L) + (j20 >>> 32);
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j23 >>> 32);
                long j25 = j23 & 4294967295L;
                long j26 = (j22 * j) + (jE2 & 4294967295L);
                int i10 = (int) j26;
                iArr2[4] = i9 | (i10 << 1);
                long jE4 = akb.e(j22, j6, j26 >>> 32, j21);
                long jE5 = akb.e(j22, j9, jE4 >>> 32, j20 & 4294967295L);
                long jE6 = akb.e(j22, j14, jE5 >>> 32, j25);
                long j27 = jE5 & 4294967295L;
                long j28 = j24 + (jE6 >>> 32);
                long j29 = jE6 & 4294967295L;
                long j30 = ((long) iArr[5]) & 4294967295L;
                long j31 = (((long) iArr2[9]) & 4294967295L) + (j28 >>> 32);
                long j32 = (((long) iArr2[10]) & 4294967295L) + (j31 >>> 32);
                long j33 = (j30 * j) + (jE4 & 4294967295L);
                int i11 = (int) j33;
                iArr2[5] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                long jE7 = akb.e(j30, j6, j33 >>> 32, j27);
                long jE8 = akb.e(j30, j9, jE7 >>> 32, j29);
                long jE9 = akb.e(j30, j14, jE8 >>> 32, j28 & 4294967295L);
                long j34 = jE8 & 4294967295L;
                long jE10 = akb.e(j30, j22, jE9 >>> 32, j31 & 4294967295L);
                long j35 = jE9 & 4294967295L;
                long j36 = j32 + (jE10 >>> 32);
                long j37 = ((long) iArr[6]) & 4294967295L;
                long j38 = (((long) iArr2[11]) & 4294967295L) + (j36 >>> 32);
                long j39 = (((long) iArr2[12]) & 4294967295L) + (j38 >>> 32);
                long j40 = (j37 * j) + (jE7 & 4294967295L);
                int i13 = (int) j40;
                iArr2[6] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long jE11 = akb.e(j37, j6, j40 >>> 32, j34);
                long jE12 = akb.e(j37, j9, jE11 >>> 32, j35);
                long jE13 = akb.e(j37, j14, jE12 >>> 32, jE10 & 4294967295L);
                long j41 = jE12 & 4294967295L;
                long jE14 = akb.e(j37, j22, jE13 >>> 32, j36 & 4294967295L);
                long j42 = jE13 & 4294967295L;
                long jE15 = akb.e(j37, j30, jE14 >>> 32, j38 & 4294967295L);
                long j43 = j39 + (jE15 >>> 32);
                long j44 = ((long) iArr[7]) & 4294967295L;
                long j45 = (((long) iArr2[13]) & 4294967295L) + (j43 >>> 32);
                long j46 = (((long) iArr2[14]) & 4294967295L) + (j45 >>> 32);
                long j47 = j45 & 4294967295L;
                long j48 = (j44 * j) + (jE11 & 4294967295L);
                int i15 = (int) j48;
                iArr2[7] = (i15 << 1) | i14;
                int i16 = i15 >>> 31;
                long jE16 = akb.e(j44, j6, j48 >>> 32, j41);
                long jE17 = akb.e(j44, j9, jE16 >>> 32, j42);
                long jE18 = akb.e(j44, j14, jE17 >>> 32, jE14 & 4294967295L);
                long jE19 = akb.e(j44, j22, jE18 >>> 32, jE15 & 4294967295L);
                long jE20 = akb.e(j44, j30, jE19 >>> 32, j43 & 4294967295L);
                long jE21 = akb.e(j44, j37, jE20 >>> 32, j47);
                long j49 = j46 + (jE21 >>> 32);
                int i17 = (int) jE16;
                iArr2[8] = (i17 << 1) | i16;
                int i18 = (int) jE17;
                iArr2[9] = (i17 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) jE18;
                iArr2[10] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) jE19;
                iArr2[11] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) jE20;
                iArr2[12] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) jE21;
                iArr2[13] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j49;
                iArr2[14] = i27 | (i28 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j49 >>> 32))) << 1) | (i28 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static int l0(int[] iArr) {
        return iArr[0] & 1;
    }

    public static int l1(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((((long) iArr[i2]) & 4294967295L) - (4294967295L & ((long) iArr2[i2]))) + j;
            iArr3[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int m1(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >> 32);
    }

    public static fki n0(Context context) {
        synchronized (a) {
            try {
                if (b == null) {
                    b = new fki(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public static void n1(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j6 = ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        iArr3[7] = (int) (((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L)) + (j7 >> 32));
    }

    public static boolean o0(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] ^ Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE ^ iArr2[i2];
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    public static int o1(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j8 = ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static boolean p0(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
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

    public static void p1(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = ((4294967295L & ((long) iArr[1])) - 1) + (j >> 32);
        iArr[1] = (int) j2;
        if ((j2 >> 32) == 0) {
            return;
        }
        U(i, 2, iArr);
    }

    public static boolean q0(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
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

    public static int q1(int i, int i2, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + i3;
            long j2 = ((((long) iArr2[i4]) & 4294967295L) - (4294967295L & ((long) iArr[i3]))) + j;
            iArr2[i4] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int r0(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != 0) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int r1(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((((long) iArr2[i2]) & 4294967295L) - (4294967295L & ((long) iArr[i2]))) + j;
            iArr2[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int s0(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i] + 1;
            iArr[i] = i2;
            if (i2 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void s1(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        iArr2[4] = (int) (((((long) iArr2[4]) & 4294967295L) - (4294967295L & ((long) iArr[4]))) + (j4 >> 32));
    }

    public static int t0(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    public static void t1(int[] iArr, int[] iArr2) {
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
        long j6 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        iArr2[7] = (int) (((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7]))) + (j7 >> 32));
    }

    public static int u0(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    public static BigInteger u1(int i, int[] iArr) {
        byte[] bArr = new byte[i << 2];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                h91.A(i3, bArr, ((i - 1) - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int v0(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        int i3;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            i3 = iArr2[0];
            if (i3 != 0) {
                break;
            }
            int i5 = i;
            int i6 = 0;
            while (true) {
                i5--;
                if (i5 >= 0) {
                    int i7 = iArr2[i5];
                    iArr2[i5] = i6;
                    i6 = i7;
                }
            }
            i4 += 32;
        }
        int i8 = 0;
        while ((i3 & 1) == 0) {
            i3 >>>= 1;
            i8++;
        }
        if (i8 > 0) {
            int i9 = 0;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i10 = iArr2[i];
                iArr2[i] = (i9 << (-i8)) | (i10 >>> i8);
                i9 = i10;
            }
            i4 += i8;
        }
        for (int i11 = 0; i11 < i4; i11++) {
            if ((iArr3[0] & 1) != 0) {
                i2 = (i2 < 0 ? O(length, iArr, iArr3) : r1(length, iArr, iArr3)) + i2;
            }
            int i12 = i2;
            int i13 = length;
            while (true) {
                i13--;
                if (i13 >= 0) {
                    int i14 = iArr3[i13];
                    iArr3[i13] = (i12 << 31) | (i14 >>> 1);
                    i12 = i14;
                }
            }
        }
        return i2;
    }

    public static BigInteger v1(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                h91.A(i2, bArr, (4 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void w0(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (B0(length, iArr2)) {
            l5.q("'x' cannot be 0");
            return;
        }
        if (x0(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArr4 = new int[length];
        System.arraycopy(iArr2, 0, iArr4, 0, length);
        int[] iArr5 = new int[length];
        iArr5[0] = 1;
        int iV0 = (1 & iArr4[0]) == 0 ? v0(length, 0, iArr, iArr4, iArr5) : 0;
        if (x0(length, iArr4)) {
            if (iV0 < 0) {
                F(iArr.length, iArr5, iArr, iArr3);
                return;
            } else {
                System.arraycopy(iArr5, 0, iArr3, 0, iArr.length);
                return;
            }
        }
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        int[] iArr7 = new int[length];
        int i = length;
        int iV02 = 0;
        while (true) {
            int i2 = i - 1;
            if (iArr4[i2] == 0 && iArr6[i2] == 0) {
                i--;
            } else if (o0(i, iArr4, iArr6)) {
                r1(i, iArr6, iArr4);
                iV0 = v0(i, (r1(length, iArr7, iArr5) - iV02) + iV0, iArr, iArr4, iArr5);
                if (x0(i, iArr4)) {
                    if (iV0 < 0) {
                        F(iArr.length, iArr5, iArr, iArr3);
                        return;
                    } else {
                        System.arraycopy(iArr5, 0, iArr3, 0, iArr.length);
                        return;
                    }
                }
            } else {
                r1(i, iArr4, iArr6);
                iV02 = v0(i, (r1(length, iArr5, iArr7) - iV0) + iV02, iArr, iArr6, iArr7);
                if (x0(i, iArr6)) {
                    if (iV02 < 0) {
                        F(iArr.length, iArr7, iArr, iArr3);
                        return;
                    } else {
                        System.arraycopy(iArr7, 0, iArr3, 0, iArr.length);
                        return;
                    }
                }
            }
        }
    }

    public static BigInteger w1(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                h91.A(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean x0(int i, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger x1(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                h91.G(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean y0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean z0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void z1(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void A(int i) {
        Z(Integer.valueOf(i));
    }

    public abstract int A1(String str, byte[] bArr, int i, int i2);

    public abstract int B1(byte[] bArr, int i, int i2);

    @Override // defpackage.vl2
    public void C(SerialDescriptor serialDescriptor, int i, double d) {
        serialDescriptor.getClass();
        Y(serialDescriptor, i);
        d(d);
    }

    public abstract ConnectionResult C1(jii jiiVar, muh muhVar, String str, Executor executor);

    @Override // defpackage.vl2
    public void D(SerialDescriptor serialDescriptor, int i, long j) {
        serialDescriptor.getClass();
        Y(serialDescriptor, i);
        j(j);
    }

    public abstract String D1(int i, byte[] bArr, int i2);

    @Override // kotlinx.serialization.encoding.Encoder
    public void E(String str) {
        str.getClass();
        Z(str);
    }

    public abstract int E1(int i, byte[] bArr, int i2);

    public abstract long F0();

    public boolean F1(int i, byte[] bArr, int i2) {
        return B1(bArr, i, i2) == 0;
    }

    public abstract void G1(jii jiiVar, ServiceConnection serviceConnection);

    public boolean H1(byte[] bArr, int i, int i2) {
        return E1(i, bArr, i2) == 0;
    }

    public abstract String I1(int i, byte[] bArr, int i2);

    public abstract void K0(n85 n85Var);

    public abstract p7g L0(zi8 zi8Var);

    public abstract td2 M0();

    public abstract long N0();

    public abstract boolean O0();

    public abstract ByteBuffer P0(ByteBuffer byteBuffer);

    public abstract double Q0();

    public abstract int R0();

    public abstract long S();

    public abstract void S0(int i, byte[] bArr);

    public abstract n85 T(xq2 xq2Var, ppb ppbVar);

    public abstract float T0();

    public abstract int U0();

    public js9 V(os9 os9Var) {
        ByteBuffer byteBuffer = os9Var.d;
        byteBuffer.getClass();
        ka2.l(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return W(os9Var, byteBuffer);
    }

    public abstract int V0();

    public abstract js9 W(os9 os9Var, ByteBuffer byteBuffer);

    public abstract long W0();

    public abstract long X0();

    public void Y(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
    }

    public abstract void Y0();

    public void Z(Object obj) {
        obj.getClass();
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        iwc iwcVar = fwc.a;
        sb.append(iwcVar.b(cls));
        sb.append(" is not supported by ");
        sb.append(iwcVar.b(getClass()));
        sb.append(" encoder");
        throw new SerializationException(sb.toString());
    }

    public abstract rjg Z0(rjg rjgVar);

    public abstract String a1();

    @Override // kotlinx.serialization.encoding.Encoder
    public vl2 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // defpackage.vl2
    public void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void d(double d) {
        Z(Double.valueOf(d));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e(byte b2) {
        Z(Byte.valueOf(b2));
    }

    public abstract void e0(n85 n85Var, aga.a aVar);

    public abstract long e1();

    @Override // defpackage.vl2
    public void f(wmb wmbVar, int i, byte b2) {
        wmbVar.getClass();
        Y(wmbVar, i);
        e(b2);
    }

    public abstract void f1();

    @Override // defpackage.vl2
    public void g(wmb wmbVar, int i, short s) {
        wmbVar.getClass();
        Y(wmbVar, i);
        o(s);
    }

    public abstract void g1(int i);

    @Override // kotlinx.serialization.encoding.Encoder
    public void h(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        Z(Integer.valueOf(i));
    }

    public abstract long h1();

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    public abstract void i1();

    @Override // kotlinx.serialization.encoding.Encoder
    public void j(long j) {
        Z(Long.valueOf(j));
    }

    @Override // defpackage.vl2
    public void k(SerialDescriptor serialDescriptor, int i, r7e r7eVar, Object obj) {
        serialDescriptor.getClass();
        r7eVar.getClass();
        Y(serialDescriptor, i);
        if (r7eVar.getDescriptor().b()) {
            t(r7eVar, obj);
        } else if (obj == null) {
            n();
        } else {
            t(r7eVar, obj);
        }
    }

    @Override // defpackage.vl2
    public Encoder l(wmb wmbVar, int i) {
        wmbVar.getClass();
        Y(wmbVar, i);
        return i(wmbVar.h(i));
    }

    public abstract Map m0(n85 n85Var, int i);

    @Override // kotlinx.serialization.encoding.Encoder
    public void n() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void o(short s) {
        Z(Short.valueOf(s));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void p(boolean z) {
        Z(Boolean.valueOf(z));
    }

    @Override // defpackage.vl2
    public void q(SerialDescriptor serialDescriptor, int i, float f) {
        serialDescriptor.getClass();
        Y(serialDescriptor, i);
        s(f);
    }

    @Override // defpackage.vl2
    public void r(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        Y(serialDescriptor, i);
        A(i2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void s(float f) {
        Z(Float.valueOf(f));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void u(char c2) {
        Z(Character.valueOf(c2));
    }

    @Override // defpackage.vl2
    public void w(SerialDescriptor serialDescriptor, int i, boolean z) {
        serialDescriptor.getClass();
        Y(serialDescriptor, i);
        p(z);
    }

    @Override // defpackage.vl2
    public void x(SerialDescriptor serialDescriptor, int i, String str) {
        serialDescriptor.getClass();
        str.getClass();
        Y(serialDescriptor, i);
        E(str);
    }

    @Override // defpackage.vl2
    public void y(SerialDescriptor serialDescriptor, int i, r7e r7eVar, Object obj) {
        serialDescriptor.getClass();
        r7eVar.getClass();
        Y(serialDescriptor, i);
        t(r7eVar, obj);
    }

    public abstract void y1(int i, byte[] bArr, int i2);

    @Override // defpackage.vl2
    public void z(wmb wmbVar, int i, char c2) {
        wmbVar.getClass();
        Y(wmbVar, i);
        u(c2);
    }
}
