package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.util.Base64;
import android.view.View;
import androidx.compose.ui.e;
import androidx.compose.ui.input.nestedscroll.a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import defpackage.jq2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public class pyd implements nvh, Continuation {
    public static final ah2 b;
    public static final ah2 c;
    public static boolean h0 = true;
    public final /* synthetic */ int a;
    public static final int[] d = new int[0];
    public static final long[] e = new long[0];
    public static final Object[] f = new Object[0];
    public static final int[] V = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] W = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};
    public static final jy3 X = new jy3(1.0f, 1.0f);
    public static final StackTraceElement[] Y = new StackTraceElement[0];
    public static final int[] Z = {-21389, -2, -1, -1, -1};
    public static final int[] a0 = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    public static final int[] b0 = {-457489321, -42779, -2, -1, -1, 42777, 2};
    public static final StackTraceElement[] c0 = new StackTraceElement[0];
    public static final pyd d0 = new pyd(9);
    public static final pyd e0 = new pyd(10);
    public static final pyd f0 = new pyd(11);
    public static final pyd g0 = new pyd(12);

    static {
        byte b2 = 0;
        b = new ah2(1589812779, new im0(1, b2), false);
        c = new ah2(-1472691999, new im0(2, b2), false);
    }

    public /* synthetic */ pyd(int i) {
        this.a = i;
    }

    public static final b81 A(int i) {
        if (i == 0) {
            return b81.a;
        }
        if (i == 1) {
            return b81.b;
        }
        l5.q(bg.d(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final dha B(int i) {
        if (i == 0) {
            return dha.a;
        }
        if (i == 1) {
            return dha.b;
        }
        if (i == 2) {
            return dha.c;
        }
        if (i == 3) {
            return dha.d;
        }
        if (i == 4) {
            return dha.e;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return dha.f;
        }
        l5.q(bg.d(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final iwa C(int i) {
        if (i == 0) {
            return iwa.a;
        }
        if (i == 1) {
            return iwa.b;
        }
        l5.q(bg.d(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final s2h D(int i) {
        if (i == 0) {
            return s2h.a;
        }
        if (i == 1) {
            return s2h.b;
        }
        if (i == 2) {
            return s2h.c;
        }
        if (i == 3) {
            return s2h.d;
        }
        if (i == 4) {
            return s2h.e;
        }
        if (i == 5) {
            return s2h.f;
        }
        l5.q(bg.d(i, "Could not convert ", " to State"));
        return null;
    }

    public static final boolean E(Object obj) {
        return obj == nn2.b;
    }

    public static final boolean F(t52 t52Var) {
        LinkedHashSet linkedHashSet = bd2.a;
        if (!yz3.l(t52Var)) {
            return false;
        }
        LinkedHashSet linkedHashSet2 = bd2.a;
        a62 a62VarF = b04.f(t52Var);
        return z92.I0(linkedHashSet2, a62VarF != null ? a62VarF.e() : null);
    }

    public static void G(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        ka6.H0(iArr, iArr2, iArr4);
        M(iArr4, iArr3);
    }

    public static void H(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        ka6.G0(iArr, iArr2, iArr4);
        N(iArr4, iArr3);
    }

    public static void I(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((ka6.I0(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && ka6.o0(10, iArr3, a0))) && ka6.O(7, b0, iArr3) != 0) {
            ka6.t0(10, 7, iArr3);
        }
    }

    public static byte[] J(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    public static Object[] K(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        return objArrCopyOf;
    }

    public static e L(g7c g7cVar) {
        return a.a(e.a.b, new e7c(new a14(1, g7cVar, g7c.class, "onPull", "onPull$material(F)F", 0), new d7c(2, g7cVar, g7c.class, "onRelease", "onRelease$material(F)F", 4)), null);
    }

    public static void M(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        int i2 = i;
        int i3 = 0;
        while (i3 < 8) {
            int i4 = iArr[8 + i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        long j = ((((long) iArr2[0]) & 4294967295L) * 19) + (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((((long) iArr2[1]) & 4294967295L) * 19) + (((long) iArr[1]) & 4294967295L) + (j >>> 32);
        iArr2[1] = (int) j2;
        long j3 = ((((long) iArr2[2]) & 4294967295L) * 19) + (((long) iArr[2]) & 4294967295L) + (j2 >>> 32);
        iArr2[2] = (int) j3;
        long j4 = ((((long) iArr2[3]) & 4294967295L) * 19) + (((long) iArr[3]) & 4294967295L) + (j3 >>> 32);
        iArr2[3] = (int) j4;
        long j5 = ((((long) iArr2[4]) & 4294967295L) * 19) + (((long) iArr[4]) & 4294967295L) + (j4 >>> 32);
        iArr2[4] = (int) j5;
        long j6 = ((((long) iArr2[5]) & 4294967295L) * 19) + (((long) iArr[5]) & 4294967295L) + (j5 >>> 32);
        iArr2[5] = (int) j6;
        long j7 = ((((long) iArr2[6]) & 4294967295L) * 19) + (((long) iArr[6]) & 4294967295L) + (j6 >>> 32);
        iArr2[6] = (int) j7;
        long j8 = (19 * (((long) iArr2[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7])) + (j7 >>> 32);
        int i5 = (int) j8;
        iArr2[7] = i5;
        iArr2[7] = ka6.R(7, (((i5 >>> 31) - (i >>> 31)) + (((int) (j8 >>> 32)) << 1)) * 19, iArr2) + (Integer.MAX_VALUE & i5);
        if (ka6.q0(iArr2, V)) {
            W(iArr2);
        }
    }

    public static void N(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = (21389 * j) + (((long) iArr[0]) & 4294967295L);
        int i = (int) j2;
        iArr2[0] = i;
        long j3 = ((long) iArr[6]) & 4294967295L;
        long j4 = (21389 * j3) + j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        int i2 = (int) j4;
        iArr2[1] = i2;
        long j5 = ((long) iArr[7]) & 4294967295L;
        long j6 = (21389 * j5) + j3 + (((long) iArr[2]) & 4294967295L) + (j4 >>> 32);
        int i3 = (int) j6;
        iArr2[2] = i3;
        long j7 = ((long) iArr[8]) & 4294967295L;
        long j8 = (21389 * j7) + j5 + (((long) iArr[3]) & 4294967295L) + (j6 >>> 32);
        int i4 = (int) j8;
        iArr2[3] = i4;
        long j9 = ((long) iArr[9]) & 4294967295L;
        long j10 = (21389 * j9) + j7 + (((long) iArr[4]) & 4294967295L) + (j8 >>> 32);
        iArr2[4] = (int) j10;
        long j11 = (j10 >>> 32) + j9;
        long j12 = j11 & 4294967295L;
        long j13 = (21389 * j12) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j13;
        long j14 = j11 >>> 32;
        long j15 = (21389 * j14) + j12 + (((long) i2) & 4294967295L) + (j13 >>> 32);
        iArr2[1] = (int) j15;
        long j16 = j14 + (((long) i3) & 4294967295L) + (j15 >>> 32);
        iArr2[2] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) i4) & 4294967295L);
        iArr2[3] = (int) j17;
        if (((j17 >>> 32) == 0 ? 0 : ka6.u0(5, 4, iArr2)) != 0 || (iArr2[4] == -1 && ka6.p0(iArr2, Z))) {
            ka6.I(5, 21389, iArr2);
        }
    }

    public static void O(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = ka6.R(7, ((i << 1) | (i2 >>> 31)) * 19, iArr) + (i2 & Integer.MAX_VALUE);
        if (ka6.q0(iArr, V)) {
            W(iArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void P(int r11, int[] r12) {
        /*
            r0 = 5
            if (r11 == 0) goto L3c
            long r1 = (long) r11
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 21389(0x538d, double:1.05676E-319)
            long r5 = r5 * r1
            r11 = 0
            r7 = r12[r11]
            long r7 = (long) r7
            long r7 = r7 & r3
            long r5 = r5 + r7
            int r7 = (int) r5
            r12[r11] = r7
            r7 = 32
            long r5 = r5 >>> r7
            r8 = 1
            r9 = r12[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r1 = r1 + r9
            long r1 = r1 + r5
            int r5 = (int) r1
            r12[r8] = r5
            long r1 = r1 >>> r7
            r5 = 2
            r6 = r12[r5]
            long r8 = (long) r6
            long r3 = r3 & r8
            long r1 = r1 + r3
            int r3 = (int) r1
            r12[r5] = r3
            long r1 = r1 >>> r7
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L35
            goto L3a
        L35:
            r11 = 3
            int r11 = defpackage.ka6.u0(r0, r11, r12)
        L3a:
            if (r11 != 0) goto L4a
        L3c:
            r11 = 4
            r11 = r12[r11]
            r1 = -1
            if (r11 != r1) goto L4f
            int[] r11 = defpackage.pyd.Z
            boolean r11 = defpackage.ka6.p0(r12, r11)
            if (r11 == 0) goto L4f
        L4a:
            r11 = 21389(0x538d, float:2.9972E-41)
            defpackage.ka6.I(r0, r11, r12)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyd.P(int, int[]):void");
    }

    public static void Q(Object[] objArr, Comparator comparator) {
        objArr.getClass();
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void R(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        ka6.k1(iArr, iArr3);
        M(iArr3, iArr2);
    }

    public static void S(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        ka6.j1(iArr, iArr3);
        N(iArr3, iArr2);
    }

    public static void T(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        ka6.k1(iArr, iArr3);
        M(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            ka6.k1(iArr2, iArr3);
            M(iArr3, iArr2);
        }
    }

    public static void U(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        ka6.j1(iArr, iArr3);
        N(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            ka6.j1(iArr2, iArr3);
            N(iArr3, iArr2);
        }
    }

    public static final int V(s2h s2hVar) {
        s2hVar.getClass();
        int iOrdinal = s2hVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        l.g();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static void W(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j;
        long jT0 = j >> 32;
        if (jT0 != 0) {
            jT0 = ka6.t0(7, 1, iArr);
        }
        iArr[7] = (int) (((((long) iArr[7]) & 4294967295L) - 2147483648L) + jT0);
    }

    public static void X(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ka6.o1(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 19;
            iArr3[0] = (int) j;
            long jU = j >> 32;
            if (jU != 0) {
                jU = ka6.U(7, 1, iArr3);
            }
            iArr3[7] = (int) ((4294967295L & ((long) iArr3[7])) + 2147483648L + jU);
        }
    }

    public static void Y(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ka6.m1(iArr, iArr2, iArr3) != 0) {
            ka6.p1(5, 21389, iArr3);
        }
    }

    public static final void Z(int i, String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            kpf.d(i, jpf.g(str));
            return;
        }
        String strG = jpf.g(str);
        try {
            if (jpf.e == null) {
                jpf.e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            jpf.e.invoke(null, Long.valueOf(jpf.a), strG, Integer.valueOf(i));
        } catch (Exception e2) {
            jpf.e(e2, "traceCounter");
        }
    }

    public static final int a(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static void a0(int[] iArr, int[] iArr2) {
        ka6.b1(8, 0, iArr, iArr2);
        if (ka6.q0(iArr2, V)) {
            W(iArr2);
        }
    }

    public static final int b(int i, long j, long[] jArr) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static void b0(int[] iArr, int[] iArr2) {
        if (ka6.b1(5, 0, iArr, iArr2) != 0 || (iArr2[4] == -1 && ka6.p0(iArr2, Z))) {
            ka6.I(5, 21389, iArr2);
        }
    }

    public static final LinkedHashSet c(byte[] bArr) throws IOException {
        ObjectInputStream objectInputStream;
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            try {
                int i = objectInputStream.readInt();
                for (int i2 = 0; i2 < i; i2++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean z = objectInputStream.readBoolean();
                    uri.getClass();
                    linkedHashSet.add(new jq2.a(z, uri));
                }
                j6g j6gVar = j6g.a;
                objectInputStream.close();
                j6g j6gVar2 = j6g.a;
                byteArrayInputStream.close();
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static String c0(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static final long d(neb nebVar, boolean z) {
        List<yeb> list = nebVar.a;
        int size = list.size();
        long jF = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            yeb yebVar = list.get(i2);
            if (yebVar.d && yebVar.h) {
                jF = ooa.f(jF, z ? yebVar.c : yebVar.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return ooa.b(jF, i);
    }

    public static final float e(neb nebVar, boolean z) {
        long jD = d(nebVar, z);
        float fD = 0.0f;
        if (ooa.c(jD, 9205357640488583168L)) {
            return 0.0f;
        }
        List<yeb> list = nebVar.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            yeb yebVar = list.get(i2);
            if (yebVar.d && yebVar.h) {
                i++;
                fD = ooa.d(ooa.e(z ? yebVar.c : yebVar.g, jD)) + fD;
            }
        }
        return fD / i;
    }

    public static boolean f(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!f((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof vzf) && (obj2 instanceof vzf)) {
                            if (!Arrays.equals(((vzf) obj).a, ((vzf) obj2).a)) {
                            }
                        } else if ((obj instanceof v4g) && (obj2 instanceof v4g)) {
                            if (!Arrays.equals(((v4g) obj).a, ((v4g) obj2).a)) {
                            }
                        } else if ((obj instanceof g4g) && (obj2 instanceof g4g)) {
                            if (!Arrays.equals(((g4g) obj).a, ((g4g) obj2).a)) {
                            }
                        } else if ((obj instanceof m4g) && (obj2 instanceof m4g)) {
                            if (!Arrays.equals(((m4g) obj).a, ((m4g) obj2).a)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void g(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void h(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void i(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void j(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void k(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        h(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void l(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        j(objArr, 0, objArr2, i, i2);
    }

    public static byte[] m(int i, byte[] bArr, int i2) {
        bArr.getClass();
        o(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] n(Object[] objArr, int i, int i2) {
        objArr.getClass();
        o(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static final void o(int i, int i2) {
        if (i <= i2) {
            return;
        }
        l5.s(w40.e("toIndex (", i, ") is greater than size (", i2, ")."));
    }

    public static String p(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static void q(Object obj, int i, Object[] objArr, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void r(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static final boolean t(float f2, float f3) {
        return (Float.isNaN(f2) || Float.isNaN(f3)) ? Float.isNaN(f2) && Float.isNaN(f3) : Math.abs(f3 - f2) < 1.0E-5f;
    }

    public static final yd8 u(oe8 oe8Var) {
        if (oe8Var instanceof yd8) {
            return (yd8) oe8Var;
        }
        Object obj = null;
        if (!(oe8Var instanceof dg8)) {
            s6.i(oe8Var, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        List<zf8> upperBounds = ((dg8) oe8Var).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            zf8 zf8Var = (zf8) next;
            zf8Var.getClass();
            v62 v62VarD = ((cg8) zf8Var).a.M0().d();
            t52 t52Var = v62VarD instanceof t52 ? (t52) v62VarD : null;
            if (t52Var != null && t52Var.f() != c62.INTERFACE && t52Var.f() != c62.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        zf8 zf8Var2 = (zf8) obj;
        if (zf8Var2 == null) {
            zf8Var2 = (zf8) z92.Q0(upperBounds);
        }
        return zf8Var2 != null ? v(zf8Var2) : fwc.a.b(Object.class);
    }

    public static final yd8 v(zf8 zf8Var) {
        zf8Var.getClass();
        oe8 oe8VarA = zf8Var.a();
        if (oe8VarA != null) {
            return u(oe8VarA);
        }
        s6.i(zf8Var, "Cannot calculate JVM erasure for type: ");
        return null;
    }

    public static String w(String str) {
        return z3.m(str, ". ", "Make sure that the expo-video config plugin is properly configured to avoid issues with displaying the now playing notification and sustaining background playback.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final qfd x(View view) {
        View view2 = view;
        while (!(view2 instanceof qfd)) {
            Object parent = view2.getParent();
            if (parent == null) {
                return null;
            }
            hh1.l(parent instanceof View);
            view2 = (View) parent;
        }
        return (qfd) view2;
    }

    public static final myd y(Object obj) {
        if (obj != nn2.b) {
            return (myd) obj;
        }
        r6.g("Does not contain segment");
        return null;
    }

    public static final Point z(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return -1;
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 10:
                List<svh<?>> list = djh.a;
                return Boolean.valueOf(((kei) mei.b.zza()).zza());
            default:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((lhi) mhi.b.zza()).zzc());
        }
    }
}
