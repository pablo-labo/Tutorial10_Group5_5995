package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.Display;
import android.view.View;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import defpackage.o7d;
import defpackage.v03;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class hh1 implements bl1, nvh, hna, g39, xcb {
    public static boolean X = false;
    public static String Y = "";
    public static float Z;
    public static int a0;
    public static int b0;
    public static String c0;
    public static Path d0;
    public static ArrayList e0;
    public static float f0;
    public static float g0;
    public static float h0;
    public static float i0;
    public static float j0;
    public static float k0;
    public static boolean l0;
    public final /* synthetic */ int a;
    public static final hh1 b = new hh1(1);
    public static final ux0 c = new ux0("RESUME_TOKEN", 4);
    public static final byte[] d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public static final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};
    public static final long[] f = new long[0];
    public static final hh1 V = new hh1(6);
    public static final hh1 W = new hh1(7);

    public /* synthetic */ hh1(int i) {
        this.a = i;
    }

    public static final qv8 A(zv8 zv8Var) {
        zv8Var.getClass();
        kv8 lifecycle = zv8Var.getLifecycle();
        lifecycle.getClass();
        b36 b36Var = lifecycle.a;
        while (true) {
            qv8 qv8Var = (qv8) ((AtomicReference) b36Var.a).get();
            if (qv8Var != null) {
                return qv8Var;
            }
            eze ezeVarA = wea.a();
            eq3 eq3Var = a74.a;
            qv8 qv8Var2 = new qv8(lifecycle, v03.a.C0438a.c(ezeVarA, m89.a.J1()));
            AtomicReference atomicReference = (AtomicReference) b36Var.a;
            while (!atomicReference.compareAndSet(null, qv8Var2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            eq3 eq3Var2 = a74.a;
            u63.Y(qv8Var2, m89.a.J1(), null, new pv8(qv8Var2, null), 2);
            return qv8Var2;
        }
    }

    public static long B(double d2) {
        pnb.p("not a normal value", F(d2));
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static void C(int[] iArr, int[] iArr2) {
        long j;
        ka6.k1(iArr, iArr2);
        long j2 = 4294967295L;
        long j3 = ((long) iArr[8]) & 4294967295L;
        int i = 7;
        int i2 = 16;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j4 = ((long) iArr[i + 8]) & j2;
            long j5 = j4 * j4;
            j = j2;
            iArr2[i2 + 15] = ((int) (j5 >>> 33)) | (i3 << 31);
            int i5 = i2 - 2;
            iArr2[i2 + 14] = (int) (j5 >>> 1);
            i3 = (int) j5;
            if (i4 <= 0) {
                break;
            }
            i2 = i5;
            i = i4;
            j2 = j;
        }
        long j6 = j3 * j3;
        long j7 = (((long) (i3 << 31)) & j) | (j6 >>> 33);
        iArr2[16] = (int) j6;
        int i6 = ((int) (j6 >>> 32)) & 1;
        long j8 = ((long) iArr[9]) & j;
        long j9 = ((long) iArr2[18]) & j;
        long j10 = (j8 * j3) + j7;
        int i7 = (int) j10;
        iArr2[17] = (i7 << 1) | i6;
        int i8 = i7 >>> 31;
        long j11 = j9 + (j10 >>> 32);
        long j12 = ((long) iArr[10]) & j;
        long j13 = ((long) iArr2[19]) & j;
        long j14 = ((long) iArr2[20]) & j;
        long j15 = (j12 * j3) + j11;
        int i9 = (int) j15;
        iArr2[18] = (i9 << 1) | i8;
        long jE = akb.e(j12, j8, j15 >>> 32, j13);
        long j16 = j14 + (jE >>> 32);
        long j17 = ((long) iArr[11]) & j;
        long j18 = (((long) iArr2[21]) & j) + (j16 >>> 32);
        long j19 = (((long) iArr2[22]) & j) + (j18 >>> 32);
        long j20 = j18 & j;
        long j21 = (j17 * j3) + (jE & j);
        int i10 = (int) j21;
        iArr2[19] = (i9 >>> 31) | (i10 << 1);
        long jE2 = akb.e(j17, j8, j21 >>> 32, j16 & j);
        long jE3 = akb.e(j17, j12, jE2 >>> 32, j20);
        long j22 = j19 + (jE3 >>> 32);
        long j23 = jE3 & j;
        long j24 = ((long) iArr[12]) & j;
        long j25 = (((long) iArr2[23]) & j) + (j22 >>> 32);
        long j26 = (((long) iArr2[24]) & j) + (j25 >>> 32);
        long j27 = j25 & j;
        long j28 = (j24 * j3) + (jE2 & j);
        int i11 = (int) j28;
        iArr2[20] = (i10 >>> 31) | (i11 << 1);
        long jE4 = akb.e(j24, j8, j28 >>> 32, j23);
        long jE5 = akb.e(j24, j12, jE4 >>> 32, j22 & j);
        long jE6 = akb.e(j24, j17, jE5 >>> 32, j27);
        long j29 = jE5 & j;
        long j30 = j26 + (jE6 >>> 32);
        long j31 = ((long) iArr[13]) & j;
        long j32 = (((long) iArr2[25]) & j) + (j30 >>> 32);
        long j33 = j30 & j;
        long j34 = (((long) iArr2[26]) & j) + (j32 >>> 32);
        long j35 = j32 & j;
        long j36 = (j31 * j3) + (jE4 & j);
        int i12 = (int) j36;
        iArr2[21] = (i11 >>> 31) | (i12 << 1);
        int i13 = i12 >>> 31;
        long jE7 = akb.e(j31, j8, j36 >>> 32, j29);
        long jE8 = akb.e(j31, j12, jE7 >>> 32, jE6 & j);
        long jE9 = akb.e(j31, j17, jE8 >>> 32, j33);
        long j37 = jE8 & j;
        long jE10 = akb.e(j31, j24, jE9 >>> 32, j35);
        long j38 = j34 + (jE10 >>> 32);
        long j39 = jE10 & j;
        long j40 = ((long) iArr[14]) & j;
        long j41 = (((long) iArr2[27]) & j) + (j38 >>> 32);
        long j42 = j38 & j;
        long j43 = (((long) iArr2[28]) & j) + (j41 >>> 32);
        long j44 = (j40 * j3) + (jE7 & j);
        int i14 = (int) j44;
        iArr2[22] = (i14 << 1) | i13;
        long jE11 = akb.e(j40, j8, j44 >>> 32, j37);
        long jE12 = akb.e(j40, j12, jE11 >>> 32, jE9 & j);
        long jE13 = akb.e(j40, j17, jE12 >>> 32, j39);
        long j45 = jE12 & j;
        long jE14 = akb.e(j40, j24, jE13 >>> 32, j42);
        long jE15 = akb.e(j40, j31, jE14 >>> 32, j41 & j);
        long j46 = jE14 & j;
        long j47 = j43 + (jE15 >>> 32);
        long j48 = jE15 & j;
        long j49 = ((long) iArr[15]) & j;
        long j50 = (((long) iArr2[29]) & j) + (j47 >>> 32);
        long j51 = (((long) iArr2[30]) & j) + (j50 >>> 32);
        long j52 = (j49 * j3) + (jE11 & j);
        int i15 = (int) j52;
        iArr2[23] = (i14 >>> 31) | (i15 << 1);
        int i16 = i15 >>> 31;
        long jE16 = akb.e(j49, j8, j52 >>> 32, j45);
        long jE17 = akb.e(j49, j12, jE16 >>> 32, jE13 & j);
        long jE18 = akb.e(j49, j17, jE17 >>> 32, j46);
        long jE19 = akb.e(j49, j24, jE18 >>> 32, j48);
        long jE20 = akb.e(j49, j31, jE19 >>> 32, j47 & j);
        long jE21 = akb.e(j49, j40, jE20 >>> 32, j50 & j);
        long j53 = j51 + (jE21 >>> 32);
        int i17 = (int) jE16;
        iArr2[24] = (i17 << 1) | i16;
        int i18 = (int) jE17;
        iArr2[25] = (i17 >>> 31) | (i18 << 1);
        int i19 = (int) jE18;
        iArr2[26] = (i19 << 1) | (i18 >>> 31);
        int i20 = (int) jE19;
        iArr2[27] = (i19 >>> 31) | (i20 << 1);
        int i21 = i20 >>> 31;
        int i22 = (int) jE20;
        iArr2[28] = i21 | (i22 << 1);
        int i23 = i22 >>> 31;
        int i24 = (int) jE21;
        iArr2[29] = i23 | (i24 << 1);
        int i25 = i24 >>> 31;
        int i26 = (int) j53;
        iArr2[30] = i25 | (i26 << 1);
        iArr2[31] = (i26 >>> 31) | ((iArr2[31] + ((int) (j53 >>> 32))) << 1);
        int iP = ka6.P(iArr2, iArr2);
        int i27 = 0;
        int iM = ka6.M(24, 16, ka6.M(0, 8, 0, iArr2, iArr2) + iP, iArr2, iArr2) + iP;
        int[] iArr3 = new int[8];
        ka6.X(iArr, iArr, iArr3);
        int[] iArr4 = new int[16];
        ka6.k1(iArr3, iArr4);
        ka6.Q(32, ka6.q1(16, 8, iArr4, iArr2) + iM, iArr2, 24);
        int i28 = iArr[16];
        long j54 = ((long) (i28 << 1)) & j;
        long j55 = 0;
        do {
            int i29 = 16 + i27;
            long j56 = ((((long) iArr[i27]) & j) * j54) + (((long) iArr2[i29]) & j) + j55;
            iArr2[i29] = (int) j56;
            j55 = j56 >>> 32;
            i27++;
        } while (i27 < 16);
        iArr2[32] = (i28 * i28) + ((int) j55);
    }

    public static void D(String str, String str2, String str3, String str4, String str5, String str6, gsa gsaVar, Function1 function1) {
        str4.getClass();
        gsaVar.getClass();
        ie7.d = str4;
        ie7.f = str5;
        ie7.X = str;
        ie7.Y = str6;
        ie7.W = t40.l("CO=", str6, "; ", str3);
        ie7.e0 = function1;
        int i = 0;
        if (!X) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (0 > jCurrentTimeMillis || jCurrentTimeMillis >= 8796093022208L) {
                h5.k(r6.c(jCurrentTimeMillis, "invalid timestamp (max=8796093022207): "));
                return;
            }
            ypd.s(32);
            String string = Long.toString(jCurrentTimeMillis | 26388279066624L, 32);
            string.getClass();
            ypd.s(32);
            String string2 = Long.toString(34359748609L, 32);
            string2.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append((CharSequence) string2, 1, 8);
            Y = sb.toString();
            X = true;
            Function1<lx5, j6g> function12 = c05.a;
            c05.a.invoke(tx5.g(c05.b, "myjobs_native_initial_load", new qz4(Y, i), 2));
        }
        ie7.Z = Y;
        ie7.b0 = "a1e2205f1de5d79f864ab2c2b516f23b6c68fad35c097b6026fff67f518ca537";
        ie7.a0 = "aac24dbde0f31242a7606e766b17b4382c5bd2a3d79fc63162398ad0c08a5626";
        ie7.c0 = "https://www.indeed.com/support/contact";
        ie7.e = "https://apply.indeed.com/";
        ie7.V = "https://interviews.indeed.com/";
        ie7.d0 = gsaVar;
        int i2 = 6;
        ue ueVar = new ue(i2);
        rx9 rx9Var = new rx9(0);
        ueVar.invoke(rx9Var);
        rx9 rx9Var2 = wig.a;
        rx9 rx9Var3 = km0.a;
        List<rx9> listA0 = u63.a0(rx9Var, rx9Var2, rx9Var3);
        web webVar = web.c;
        synchronized (webVar) {
            webVar.o().b(listA0);
            j6g j6gVar = j6g.a;
        }
        ue ueVar2 = new ue(i2);
        rx9 rx9Var4 = new rx9(0);
        ueVar2.invoke(rx9Var4);
        List<rx9> listA02 = u63.a0(rx9Var4, rx9Var2, rx9Var3);
        synchronized (webVar) {
            webVar.o().a(listA02, true);
        }
    }

    public static boolean E(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal<double[]> threadLocal = eb2.a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            l5.q("outXyz must have a length of 3.");
            return false;
        }
        double d2 = ((double) iRed) / 255.0d;
        double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iGreen) / 255.0d;
        double dPow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = ((double) iBlue) / 255.0d;
        double dPow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d5 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d5;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d5 / 100.0d > 0.5d;
    }

    public static boolean F(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static int G(int i, float f2, int i2) {
        return eb2.c(eb2.e(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static String H(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder sbM = akb.m("<", str2, " threw ");
                    sbM.append(e2.getClass().getName());
                    sbM.append(">");
                    string = sbM.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void I(float f2, float f3) {
        S();
        f0 = f2;
        h0 = f2;
        g0 = f3;
        i0 = f3;
        Path path = d0;
        float f4 = Z;
        path.lineTo(f2 * f4, f4 * f3);
        e0.add(new c6b(ip4.c, new ieb[]{new ieb(f2, f3)}));
    }

    public static void J(float f2, float f3) {
        f0 = f2;
        h0 = f2;
        j0 = f2;
        g0 = f3;
        i0 = f3;
        k0 = f3;
        Path path = d0;
        float f4 = Z;
        path.moveTo(f2 * f4, f4 * f3);
        e0.add(new c6b(ip4.b, new ieb[]{new ieb(f2, f3)}));
    }

    public static void K(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[33];
        ka6.H0(iArr, iArr2, iArr4);
        long j = ((long) iArr2[8]) & 4294967295L;
        long j2 = ((long) iArr2[9]) & 4294967295L;
        long j3 = ((long) iArr2[10]) & 4294967295L;
        long j4 = ((long) iArr2[11]) & 4294967295L;
        long j5 = ((long) iArr2[12]) & 4294967295L;
        long j6 = ((long) iArr2[13]) & 4294967295L;
        long j7 = ((long) iArr2[14]) & 4294967295L;
        long j8 = ((long) iArr2[15]) & 4294967295L;
        long j9 = ((long) iArr[8]) & 4294967295L;
        long j10 = j9 * j;
        iArr4[16] = (int) j10;
        int i = 32;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr4[17] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr4[18] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr4[19] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr4[20] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr4[21] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr4[22] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr4[23] = (int) j17;
        iArr4[24] = (int) (j17 >>> 32);
        int i2 = 16;
        int i3 = 1;
        while (i3 < 8) {
            int i4 = i2 + 1;
            int i5 = i3;
            long j18 = j5;
            int i6 = i;
            long j19 = ((long) iArr[8 + i3]) & 4294967295L;
            long j20 = j6;
            long j21 = (j19 * j) + (((long) iArr4[i4]) & 4294967295L);
            iArr4[i4] = (int) j21;
            int i7 = i2 + 2;
            long j22 = (j19 * j2) + (((long) iArr4[i7]) & 4294967295L) + (j21 >>> i6);
            iArr4[i7] = (int) j22;
            int i8 = i2 + 3;
            long j23 = (j19 * j3) + (((long) iArr4[i8]) & 4294967295L) + (j22 >>> i6);
            iArr4[i8] = (int) j23;
            int i9 = i2 + 4;
            long j24 = (j19 * j4) + (((long) iArr4[i9]) & 4294967295L) + (j23 >>> i6);
            iArr4[i9] = (int) j24;
            int i10 = i2 + 5;
            long j25 = (j19 * j18) + (((long) iArr4[i10]) & 4294967295L) + (j24 >>> i6);
            iArr4[i10] = (int) j25;
            int i11 = i2 + 6;
            long j26 = (j19 * j20) + (((long) iArr4[i11]) & 4294967295L) + (j25 >>> i6);
            iArr4[i11] = (int) j26;
            int i12 = i2 + 7;
            long j27 = (j19 * j7) + (((long) iArr4[i12]) & 4294967295L) + (j26 >>> i6);
            iArr4[i12] = (int) j27;
            int i13 = i2 + 8;
            long j28 = (j19 * j8) + (((long) iArr4[i13]) & 4294967295L) + (j27 >>> i6);
            iArr4[i13] = (int) j28;
            iArr4[i2 + 9] = (int) (j28 >>> i6);
            i3 = i5 + 1;
            i2 = i4;
            i = i6;
            j5 = j18;
            j3 = j3;
            j6 = j20;
        }
        int i14 = i;
        int iP = ka6.P(iArr4, iArr4);
        int i15 = 0;
        int iM = ka6.M(24, 16, ka6.M(0, 8, 0, iArr4, iArr4) + iP, iArr4, iArr4) + iP;
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[8];
        boolean z = ka6.X(iArr, iArr, iArr5) != ka6.X(iArr2, iArr2, iArr6);
        int[] iArr7 = new int[16];
        ka6.H0(iArr5, iArr6, iArr7);
        ka6.Q(i14, iM + (z ? ka6.N(16, 8, iArr7, iArr4) : ka6.q1(16, 8, iArr7, iArr4)), iArr4, 24);
        int i16 = iArr[16];
        int i17 = iArr2[16];
        long j29 = ((long) i16) & 4294967295L;
        long j30 = ((long) i17) & 4294967295L;
        long j31 = 0;
        while (true) {
            long j32 = j29;
            int i18 = 16 + i15;
            long j33 = ((((long) iArr[i15]) & 4294967295L) * j30) + (j32 * (((long) iArr2[i15]) & 4294967295L)) + (((long) iArr4[i18]) & 4294967295L) + j31;
            iArr4[i18] = (int) j33;
            long j34 = j33 >>> 32;
            i15++;
            if (i15 >= 16) {
                iArr4[32] = (i16 * i17) + ((int) j34);
                P(iArr4, iArr3);
                return;
            } else {
                j31 = j34;
                j29 = j32;
            }
        }
    }

    public static long L(String str) {
        int i;
        int length = str.length();
        if (length <= 0) {
            throw new NumberFormatException("Empty input string");
        }
        int i2 = 0;
        if (str.charAt(0) == '-') {
            throw new NumberFormatException(l5.m("Illegal leading minus sign on unsigned string ", str, "."));
        }
        if (length <= 18) {
            return Long.parseLong(str);
        }
        if (length > 20) {
            throw new NumberFormatException(l5.m("String value ", str, " exceeds range of unsigned long."));
        }
        int i3 = 0;
        long j = 0;
        while (true) {
            i = length - 1;
            if (i2 >= i) {
                break;
            }
            int iDigit = Character.digit(str.charAt(i2), 10);
            i3 |= iDigit;
            j = (j * 10) + ((long) iDigit);
            i2++;
        }
        int iDigit2 = Character.digit(str.charAt(i), 10);
        if ((i3 | iDigit2) < 0) {
            throw new NumberFormatException("Illegal character in ".concat(str));
        }
        if (j > 1844674407370955161L) {
            throw new NumberFormatException(l5.m("String value ", str, " exceeds range of unsigned long."));
        }
        long j2 = j * 10;
        long j3 = ((long) iDigit2) + j2;
        if (j2 >= 0 || j3 < 0) {
            return j3;
        }
        throw new NumberFormatException(l5.m("String value ", str, " exceeds range of unsigned long."));
    }

    public static boolean M() {
        U();
        char cCharAt = c0.charAt(a0);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(a0), c0));
        }
        int i = a0 + 1;
        a0 = i;
        if (i < b0 && c0.charAt(i) == ',') {
            a0++;
        }
        U();
        return cCharAt == '1';
    }

    public static float N() {
        int i;
        char cCharAt;
        if (a0 == b0) {
            throw new Error(l5.m("Unexpected end (s=", c0, ")"));
        }
        U();
        int i2 = a0;
        if (i2 == b0) {
            throw new Error(l5.m("Unexpected end (s=", c0, ")"));
        }
        char cCharAt2 = c0.charAt(i2);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i3 = a0 + 1;
            a0 = i3;
            cCharAt2 = c0.charAt(i3);
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            T();
            int i4 = a0;
            if (i4 < b0) {
                cCharAt2 = c0.charAt(i4);
            }
        } else if (cCharAt2 != '.') {
            t40.q("Invalid number formating character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(cCharAt2), Integer.valueOf(a0), c0});
            return 0.0f;
        }
        if (cCharAt2 == '.') {
            a0++;
            T();
            int i5 = a0;
            if (i5 < b0) {
                cCharAt2 = c0.charAt(i5);
            }
        }
        if ((cCharAt2 == 'e' || cCharAt2 == 'E') && (i = a0 + 1) < b0 && (cCharAt = c0.charAt(i)) != 'm' && cCharAt != 'x') {
            int i6 = a0 + 1;
            a0 = i6;
            char cCharAt3 = c0.charAt(i6);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                a0++;
                T();
            } else {
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    t40.q("Invalid number formating character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(cCharAt3), Integer.valueOf(a0), c0});
                    return 0.0f;
                }
                T();
            }
        }
        String strSubstring = c0.substring(i2, a0);
        float f2 = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            t40.q("Invalid number '%s' (start=%d, i=%d, s=%s)", new Object[]{strSubstring, Integer.valueOf(i2), Integer.valueOf(a0), c0});
            return 0.0f;
        }
        U();
        int i7 = a0;
        if (i7 < b0 && c0.charAt(i7) == ',') {
            a0++;
        }
        return f2;
    }

    public static void O(float f2, float f3, float f4, float f5) {
        h0 = f2;
        i0 = f3;
        float f6 = f2 * 2.0f;
        float f7 = f3 * 2.0f;
        t((f0 + f6) / 3.0f, (g0 + f7) / 3.0f, (f4 + f6) / 3.0f, (f5 + f7) / 3.0f, f4, f5);
    }

    public static void P(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int i2 = i;
        int i3 = 16;
        while (true) {
            int i4 = i3 - 1;
            if (i4 < 0) {
                break;
            }
            int i5 = iArr[i3 + 15];
            iArr2[i4] = (i2 << (-9)) | (i5 >>> 9);
            i2 = i5;
            i3 = i4;
        }
        int iO = ka6.O(16, iArr, iArr2) + ((i2 << (-9)) >>> 23) + (i >>> 9);
        if (iO > 511 || (iO == 511 && ka6.a0(16, iArr2, e))) {
            iO = (ka6.s0(iArr2) + iO) & 511;
        }
        iArr2[16] = iO;
    }

    public static void Q(int[] iArr) {
        int i = iArr[16];
        int iR = ka6.R(16, i >>> 9, iArr) + (i & 511);
        if (iR > 511 || (iR == 511 && ka6.a0(16, iArr, e))) {
            iR = (ka6.s0(iArr) + iR) & 511;
        }
        iArr[16] = iR;
    }

    public static final void R(qw1 qw1Var, lu2 lu2Var, boolean z) {
        Object obj = qw1.V.get(qw1Var);
        Throwable thE = qw1Var.e(obj);
        Object aVar = thE != null ? new o7d.a(thE) : qw1Var.f(obj);
        if (!z) {
            lu2Var.resumeWith(aVar);
            return;
        }
        lu2Var.getClass();
        v64 v64Var = (v64) lu2Var;
        pu2 pu2Var = v64Var.e;
        Object obj2 = v64Var.V;
        v03 context = pu2Var.getContext();
        Object objC = rkf.c(context, obj2);
        z5g<?> z5gVarC = objC != rkf.a ? x03.c(pu2Var, context, objC) : null;
        try {
            pu2Var.resumeWith(aVar);
            j6g j6gVar = j6g.a;
            if (z5gVarC == null || z5gVarC.p0()) {
                rkf.a(context, objC);
            }
        } catch (Throwable th) {
            if (z5gVarC == null || z5gVarC.p0()) {
                rkf.a(context, objC);
            }
            throw th;
        }
    }

    public static void S() {
        if (l0) {
            return;
        }
        j0 = f0;
        k0 = g0;
        l0 = true;
    }

    public static void T() {
        while (true) {
            int i = a0;
            if (i >= b0 || !Character.isDigit(c0.charAt(i))) {
                return;
            } else {
                a0++;
            }
        }
    }

    public static void U() {
        while (true) {
            int i = a0;
            if (i >= b0 || !Character.isWhitespace(c0.charAt(i))) {
                return;
            } else {
                a0++;
            }
        }
    }

    public static void V(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[33];
        C(iArr, iArr3);
        P(iArr3, iArr2);
    }

    public static void W(int[] iArr, int[] iArr2, int[] iArr3) {
        int iL1 = (ka6.l1(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iL1 < 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    i = -1;
                    break;
                }
                int i3 = iArr3[i2] - 1;
                iArr3[i2] = i3;
                if (i3 != -1) {
                    break;
                } else {
                    i2++;
                }
            }
            iL1 = (iL1 + i) & 511;
        }
        iArr3[16] = iL1;
    }

    public static String X(int i, long j) {
        if (i > 16) {
            i = 32;
        } else if (i < 16) {
            i = 16;
        }
        byte[] bArr = new byte[i];
        w(j, bArr, 0, i);
        return new String(bArr, StandardCharsets.US_ASCII);
    }

    public static final long Y(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static String Z(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : ViewUtilsKt.UNKNOWN_DESTINATION_URL;
    }

    public static yd2 e() {
        yd2 yd2Var = new yd2(true);
        yd2Var.K(null);
        return yd2Var;
    }

    public static float f(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final long g(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static float h(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static void i(int[] iArr, int[] iArr2, int[] iArr3) {
        int iF = ka6.F(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iF > 511 || (iF == 511 && ka6.a0(16, iArr3, e))) {
            iF = (ka6.s0(iArr3) + iF) & 511;
        }
        iArr3[16] = iF;
    }

    public static final int j(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01d1 A[LOOP:0: B:56:0x01cf->B:57:0x01d1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(float r26, float r27, float r28, boolean r29, boolean r30, float r31, float r32) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh1.k(float, float, float, boolean, boolean, float, float):void");
    }

    public static void l(boolean z) {
        if (z) {
            return;
        }
        b0.t();
    }

    public static void m(boolean z, String str) {
        if (z) {
            return;
        }
        g7.l(str);
    }

    public static void n(Object obj) {
        if (obj != null) {
            return;
        }
        b0.t();
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        g7.l(str);
    }

    public static void p(boolean z) {
        if (z) {
            return;
        }
        o6.h();
    }

    public static final void q(int i, int i2, int i3, int i4, int i5) {
        web.g(i4 >= 0, "count (%d) ! >= 0", Integer.valueOf(i4));
        web.g(i >= 0, "offset (%d) ! >= 0", Integer.valueOf(i));
        web.g(i3 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i3));
        web.g(i + i4 <= i5, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5));
        web.g(i3 + i4 <= i2, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (defpackage.u63.r(r9, r1, defpackage.wl7.b(r7, r2) ? r0.getWidth() : defpackage.m.d(r7.a, r8), defpackage.wl7.b(r7, r2) ? r0.getHeight() : defpackage.m.d(r7.b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap r(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, defpackage.hie r7, defpackage.tmd r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh1.r(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, hie, tmd, boolean):android.graphics.Bitmap");
    }

    public static Typeface s(String str, to5 to5Var, int i) {
        if (i == 0 && wl7.b(to5Var, to5.b0) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iS = boa.s(i, to5Var);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iS) : Typeface.create(str, iS);
    }

    public static void t(float f2, float f3, float f4, float f5, float f6, float f7) {
        S();
        f0 = f6;
        g0 = f7;
        Path path = d0;
        float f8 = Z;
        path.cubicTo(f2 * f8, f3 * f8, f4 * f8, f5 * f8, f6 * f8, f8 * f7);
        e0.add(new c6b(ip4.a, new ieb[]{new ieb(f2, f3), new ieb(f4, f5), new ieb(f6, f7)}));
    }

    public static final long u() {
        return Thread.currentThread().getId();
    }

    public static int v(int i, float f2, int i2) {
        if (i == i2 || f2 <= 0.0f) {
            return i;
        }
        if (f2 >= 1.0f) {
            return i2;
        }
        float f3 = ((i >> 24) & 255) / 255.0f;
        float f4 = ((i2 >> 24) & 255) / 255.0f;
        float f5 = f(((i >> 16) & 255) / 255.0f);
        float f6 = f(((i >> 8) & 255) / 255.0f);
        float f7 = f((i & 255) / 255.0f);
        float f8 = f(((i2 >> 16) & 255) / 255.0f);
        float f9 = f(((i2 >> 8) & 255) / 255.0f);
        float f10 = f((i2 & 255) / 255.0f);
        float fB = k6.b(f4, f3, f2, f3);
        float fB2 = k6.b(f8, f5, f2, f5);
        float fB3 = k6.b(f9, f6, f2, f6);
        float fB4 = k6.b(f10, f7, f2, f7);
        float fH = h(fB2) * 255.0f;
        float fH2 = h(fB3) * 255.0f;
        return Math.round(h(fB4) * 255.0f) | (Math.round(fH) << 16) | (Math.round(fB * 255.0f) << 24) | (Math.round(fH2) << 8);
    }

    public static void w(long j, byte[] bArr, int i, int i2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) >>> 2;
        Arrays.fill(bArr, i, (i2 - 16) + i + iNumberOfLeadingZeros, (byte) 48);
        for (int i3 = 0; i3 < 16 - iNumberOfLeadingZeros; i3++) {
            bArr[((i + i2) - 1) - i3] = d[(int) (15 & j)];
            j >>>= 4;
        }
    }

    public static Set x(List list) {
        Set setP = is4.a;
        while (!list.isEmpty()) {
            rx9 rx9Var = (rx9) z92.O0(list);
            if (rx9Var == null) {
                r6.g("Flatten - No head element in list");
                return null;
            }
            ArrayList arrayList = rx9Var.e;
            list = list.subList(1, list.size());
            if (arrayList.isEmpty()) {
                setP = bbe.p(setP, rx9Var);
            } else {
                list = z92.h1(arrayList, list);
                setP = bbe.p(setP, rx9Var);
            }
        }
        return setP;
    }

    public static int z(View view, int i) {
        return me9.b(view.getContext(), view.getClass().getCanonicalName(), i);
    }

    @Override // defpackage.bl1
    public Rect a(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", CoreFeature.DEFAULT_SOURCE_NAME);
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
                return rect;
            }
            int i2 = rect.right + dimensionPixelSize;
            if (i2 == point.x) {
                rect.right = i2;
            }
        }
        return rect;
    }

    @Override // defpackage.hna
    public Object b() {
        return new LinkedHashMap();
    }

    @Override // defpackage.xcb
    public Typeface c(dz5 dz5Var, to5 to5Var, int i) {
        String strK = dz5Var.f;
        int i2 = to5Var.a / 100;
        if (i2 >= 0 && i2 < 2) {
            strK = t40.k(strK, "-thin");
        } else if (2 <= i2 && i2 < 4) {
            strK = t40.k(strK, "-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strK = t40.k(strK, "-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strK = t40.k(strK, "-black");
            }
        }
        Typeface typeface = null;
        if (strK.length() != 0) {
            Typeface typefaceS = s(strK, to5Var, i);
            if (!wl7.b(typefaceS, Typeface.create(Typeface.DEFAULT, boa.s(i, to5Var))) && !wl7.b(typefaceS, s(null, to5Var, i))) {
                typeface = typefaceS;
            }
        }
        return typeface == null ? s(dz5Var.f, to5Var, i) : typeface;
    }

    @Override // defpackage.xcb
    public Typeface d(int i, to5 to5Var) {
        return s(null, to5Var, i);
    }

    @Override // defpackage.g39
    public void log(Map map, rc3 rc3Var) {
        if (!(map.get("error.object") instanceof Throwable)) {
            if (map.get("message") instanceof String) {
                rc3Var.m("error.msg", (String) map.get("message"));
                return;
            }
            return;
        }
        Throwable th = (Throwable) map.get("error.object");
        rc3Var.b.k = true;
        rc3Var.m("error.msg", th.getMessage());
        rc3Var.m("error.type", th.getClass().getName());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        rc3Var.m(LogAttributes.ERROR_STACK, stringWriter.toString());
    }

    public void y(a62 a62Var) {
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 6:
                List<svh<?>> list = djh.a;
                return ((ubi) vbi.b.zza()).zzd();
            default:
                List<svh<?>> list2 = djh.a;
                return Long.valueOf(((rbi) nbi.b.zza()).zzb());
        }
    }
}
