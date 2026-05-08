package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Log;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.c;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import defpackage.ex7;
import defpackage.s62;
import defpackage.xv5;
import defpackage.yde;
import io.jsonwebtoken.JwtParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@sy3
public final class wg2 implements bl1, tme, hme, nvh, wrf, Continuation {
    public static final ah2 V;
    public static final ah2 W;
    public static final wg2 X;
    public static final wg2 Y;
    public static final ux0 b0;
    public static final wg2 c;
    public static final wg2 d;
    public static final ah2 e;
    public static final ah2 f;
    public final /* synthetic */ int a;
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final wg2 Z = new wg2(9);
    public static final long[] a0 = {2791191049453778211L, 2791191049453778402L, 6};
    public static final wg2 c0 = new wg2(12);
    public static final wg2 d0 = new wg2(13);
    public static final wg2 e0 = new wg2(14);
    public static final wg2 f0 = new wg2(15);
    public static final wg2 g0 = new wg2(16);
    public static final wg2 h0 = new wg2(17);

    static {
        int i = 2;
        c = new wg2(i);
        int i2 = 3;
        d = new wg2(i2);
        byte b2 = 0;
        e = new ah2(-1115064835, new so0(i), false);
        f = new ah2(-1850842819, new ov(i, b2), false);
        V = new ah2(1619006860, new ov(i2, b2), false);
        int i3 = 4;
        W = new ah2(-1890806982, new ov(i3, b2), false);
        int i4 = 8;
        X = new wg2(i4);
        Y = new wg2(i4);
        b0 = new ux0("NO_VALUE", i3);
    }

    public /* synthetic */ wg2(int i) {
        this.a = i;
    }

    public static Method A(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                oh7 oh7VarH = nic.H(0, iCeil);
                ArrayList arrayList2 = new ArrayList(t92.r0(oh7VarH, 10));
                Iterator<Integer> it = oh7VarH.iterator();
                while (((nh7) it).c) {
                    ((fh7) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                md2 md2Var = new md2(3);
                ArrayList arrayList3 = (ArrayList) md2Var.a;
                md2Var.c(clsArr);
                md2Var.b(b.class);
                md2Var.c(clsArr2);
                return z(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method : cls.getDeclaredMethods()) {
                    if (!wl7.b(method.getName(), str)) {
                        if (!wve.K(method.getName(), str + '-', false)) {
                        }
                    }
                    return method;
                }
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, ux0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.vi5 r6, defpackage.pu2 r7) {
        /*
            ux0 r0 = defpackage.ewa.W
            boolean r1 = r7 instanceof defpackage.ck5
            if (r1 == 0) goto L15
            r1 = r7
            ck5 r1 = (defpackage.ck5) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            ck5 r1 = new ck5
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.result
            int r2 = r1.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L32
            java.lang.Object r6 = r1.L$1
            ak5 r6 = (defpackage.ak5) r6
            java.lang.Object r2 = r1.L$0
            luc r2 = (defpackage.luc) r2
            defpackage.r7d.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L30
            goto L65
        L30:
            r7 = move-exception
            goto L5a
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r3
        L38:
            defpackage.r7d.b(r7)
            luc r2 = new luc
            r2.<init>()
            r2.element = r0
            ak5 r7 = new ak5
            r7.<init>(r2)
            r1.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r1.L$1 = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r1.label = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r6 = r6.e(r7, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            g13 r7 = defpackage.g13.a
            if (r6 != r7) goto L65
            return r7
        L56:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L5a:
            java.lang.Object r4 = r7.a
            if (r4 != r6) goto L70
            v03 r6 = r1.getContext()
            defpackage.u63.u(r6)
        L65:
            T r6 = r2.element
            if (r6 == r0) goto L6a
            return r6
        L6a:
            java.lang.String r6 = "Expected at least one element"
            defpackage.s6.j(r6)
            return r3
        L70:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.B(vi5, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, ux0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(defpackage.vi5 r5, kotlin.jvm.functions.Function2 r6, defpackage.pu2 r7) {
        /*
            ux0 r0 = defpackage.ewa.W
            boolean r1 = r7 instanceof defpackage.dk5
            if (r1 == 0) goto L15
            r1 = r7
            dk5 r1 = (defpackage.dk5) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            dk5 r1 = new dk5
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.result
            int r2 = r1.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L32
            java.lang.Object r5 = r1.L$1
            bk5 r5 = (defpackage.bk5) r5
            java.lang.Object r6 = r1.L$0
            luc r6 = (defpackage.luc) r6
            defpackage.r7d.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L30
            goto L67
        L30:
            r7 = move-exception
            goto L5c
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r3
        L38:
            defpackage.r7d.b(r7)
            luc r7 = new luc
            r7.<init>()
            r7.element = r0
            bk5 r2 = new bk5
            r2.<init>(r6, r7)
            r1.L$0 = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L58
            r1.L$1 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L58
            r1.label = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L58
            java.lang.Object r5 = r5.e(r2, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L58
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L56
            return r6
        L56:
            r6 = r7
            goto L67
        L58:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L5c:
            java.lang.Object r2 = r7.a
            if (r2 != r5) goto L72
            v03 r5 = r1.getContext()
            defpackage.u63.u(r5)
        L67:
            T r5 = r6.element
            if (r5 == r0) goto L6c
            return r5
        L6c:
            java.lang.String r5 = "Expected at least one element matching the predicate"
            defpackage.s6.j(r5)
            return r3
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.C(vi5, kotlin.jvm.functions.Function2, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object D(defpackage.vi5 r5, defpackage.pu2 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.gk5
            if (r0 == 0) goto L13
            r0 = r6
            gk5 r0 = (defpackage.gk5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            gk5 r0 = new gk5
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            java.lang.Object r5 = r0.L$1
            ek5 r5 = (defpackage.ek5) r5
            java.lang.Object r1 = r0.L$0
            luc r1 = (defpackage.luc) r1
            defpackage.r7d.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L61
        L2d:
            r6 = move-exception
            goto L56
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L36:
            defpackage.r7d.b(r6)
            luc r1 = new luc
            r1.<init>()
            ek5 r6 = new ek5
            r6.<init>(r1)
            r0.L$0 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.L$1 = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.label = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r5 = r5.e(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L61
            return r6
        L52:
            r5 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L56:
            java.lang.Object r2 = r6.a
            if (r2 != r5) goto L64
            v03 r5 = r0.getContext()
            defpackage.u63.u(r5)
        L61:
            T r5 = r1.element
            return r5
        L64:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.D(vi5, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object E(defpackage.vi5 r4, kotlin.jvm.functions.Function2 r5, defpackage.pu2 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.hk5
            if (r0 == 0) goto L13
            r0 = r6
            hk5 r0 = (defpackage.hk5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            hk5 r0 = new hk5
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            java.lang.Object r4 = r0.L$1
            fk5 r4 = (defpackage.fk5) r4
            java.lang.Object r5 = r0.L$0
            luc r5 = (defpackage.luc) r5
            defpackage.r7d.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L63
        L2d:
            r6 = move-exception
            goto L58
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L36:
            defpackage.r7d.b(r6)
            luc r6 = new luc
            r6.<init>()
            fk5 r1 = new fk5
            r1.<init>(r5, r6)
            r0.L$0 = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L54
            r0.L$1 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L54
            r0.label = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L54
            java.lang.Object r4 = r4.e(r1, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L54
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L52
            return r5
        L52:
            r5 = r6
            goto L63
        L54:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r1
        L58:
            java.lang.Object r1 = r6.a
            if (r1 != r4) goto L66
            v03 r4 = r0.getContext()
            defpackage.u63.u(r4)
        L63:
            T r4 = r5.element
            return r4
        L66:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.E(vi5, kotlin.jvm.functions.Function2, pu2):java.lang.Object");
    }

    public static final vi5 F(vi5 vi5Var, v03 v03Var) {
        if (v03Var.h1(ex7.a.a) == null) {
            return v03Var.equals(vr4.a) ? vi5Var : vi5Var instanceof xv5 ? xv5.a.a((xv5) vi5Var, v03Var, 0, null, 6) : new e22(vi5Var, v03Var, 0, null, 12);
        }
        v40.n(v03Var, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static final vi5 G(mde mdeVar, v03 v03Var, int i, eo1 eo1Var) {
        return ((i == 0 || i == -3) && eo1Var == eo1.a) ? mdeVar : new e22(i, eo1Var, v03Var, mdeVar);
    }

    public static final x59 I(x59 x59Var) {
        pm8 pm8Var = x59Var.e0.e0;
        while (true) {
            pm8 pm8VarK = pm8Var.K();
            pm8 pm8Var2 = null;
            if ((pm8VarK != null ? pm8VarK.V : null) == null) {
                x59 x59VarD1 = pm8Var.t0.d.d1();
                x59VarD1.getClass();
                return x59VarD1;
            }
            pm8 pm8VarK2 = pm8Var.K();
            if (pm8VarK2 != null) {
                pm8Var2 = pm8VarK2.V;
            }
            pm8Var2.getClass();
            pm8 pm8VarK3 = pm8Var.K();
            pm8VarK3.getClass();
            pm8Var = pm8VarK3.V;
            pm8Var.getClass();
        }
    }

    public static void J(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = ((jArr[2] << 40) ^ (j2 >>> 24)) & 17592186044415L;
        long j4 = ((j2 << 20) ^ (j >>> 44)) & 17592186044415L;
        long j5 = j & 17592186044415L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = ((j7 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j9 = ((j6 >>> 44) ^ (j7 << 20)) & 17592186044415L;
        long j10 = j6 & 17592186044415L;
        long[] jArr4 = new long[10];
        K(j5, j10, jArr4, 0);
        K(j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        K(j11, j12, jArr4, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        K(j5 ^ j13, j10 ^ j14, jArr4, 6);
        K(j11 ^ j13, j12 ^ j14, jArr4, 8);
        long j15 = jArr4[6];
        long j16 = jArr4[8] ^ j15;
        long j17 = jArr4[7];
        long j18 = j17 ^ jArr4[9];
        long j19 = (j16 << 1) ^ j15;
        long j20 = (j16 ^ (j18 << 1)) ^ j17;
        long j21 = jArr4[0];
        long j22 = jArr4[1];
        long j23 = (j22 ^ j21) ^ jArr4[4];
        long j24 = j22 ^ jArr4[5];
        long j25 = jArr4[2];
        long j26 = ((j19 ^ j21) ^ (j25 << 4)) ^ (j25 << 1);
        long j27 = jArr4[3];
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 44);
        long j29 = (j24 ^ j18) ^ (j28 >>> 44);
        long j30 = ((j26 & 17592186044415L) >>> 1) ^ ((j28 & 1) << 43);
        long j31 = j30 ^ (j30 << 1);
        long j32 = j31 ^ (j31 << 2);
        long j33 = j32 ^ (j32 << 4);
        long j34 = j33 ^ (j33 << 8);
        long j35 = j34 ^ (j34 << 16);
        long j36 = (j35 ^ (j35 << 32)) & 17592186044415L;
        long j37 = (((j28 & 17592186044415L) >>> 1) ^ ((j29 & 1) << 43)) ^ (j36 >>> 43);
        long j38 = j37 ^ (j37 << 1);
        long j39 = j38 ^ (j38 << 2);
        long j40 = j39 ^ (j39 << 4);
        long j41 = j40 ^ (j40 << 8);
        long j42 = j41 ^ (j41 << 16);
        long j43 = 17592186044415L & (j42 ^ (j42 << 32));
        long j44 = (j29 >>> 1) ^ (j43 >>> 43);
        long j45 = j44 ^ (j44 << 1);
        long j46 = j45 ^ (j45 << 2);
        long j47 = j46 ^ (j46 << 4);
        long j48 = j47 ^ (j47 << 8);
        long j49 = j48 ^ (j48 << 16);
        long j50 = j49 ^ (j49 << 32);
        jArr3[0] = j21;
        long j51 = (j23 ^ j36) ^ j25;
        jArr3[1] = j51;
        long j52 = ((j24 ^ j43) ^ j36) ^ j27;
        jArr3[2] = j52;
        long j53 = j43 ^ j50;
        jArr3[3] = j53;
        long j54 = j50 ^ jArr4[2];
        jArr3[4] = j54;
        long j55 = jArr4[3];
        jArr3[5] = j55;
        jArr3[0] = j21 ^ (j51 << 44);
        jArr3[1] = (j51 >>> 20) ^ (j52 << 24);
        jArr3[2] = ((j52 >>> 40) ^ (j53 << 4)) ^ (j54 << 48);
        jArr3[3] = ((j53 >>> 60) ^ (j55 << 28)) ^ (j54 >>> 16);
        jArr3[4] = j55 >>> 36;
        jArr3[5] = 0;
    }

    public static void K(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 6) & 7] << 6) ^ (jArr2[i2 & 7] ^ (jArr2[(i2 >>> 3) & 7] << 3));
        long j8 = 0;
        int i3 = 33;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = ((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 12;
        } while (i3 > 0);
        jArr[i] = 17592186044415L & j7;
        jArr[i + 1] = (j7 >>> 44) ^ (j8 << 20);
    }

    public static void L(long[] jArr, long[] jArr2) {
        wab.j(0, jArr[0], jArr2);
        wab.j(2, jArr[1], jArr2);
        jArr2[4] = ((long) wab.l((int) jArr[2])) & 4294967295L;
    }

    public static void M(String str, String str2, b bVar, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodA = A(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodA != null) {
                methodA.setAccessible(true);
                if (Modifier.isStatic(methodA.getModifiers())) {
                    N(methodA, null, bVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    N(methodA, cls.getConstructor(null).newInstance(null), bVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + JwtParser.SEPARATOR_CHAR + str2 + " not found");
        } catch (Exception e2) {
            Log.w("PreviewLogger", "Failed to invoke Composable Method '" + str + JwtParser.SEPARATOR_CHAR + str2 + '\'', null);
            throw e2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void N(java.lang.reflect.Method r10, java.lang.Object r11, androidx.compose.runtime.b r12, java.lang.Object... r13) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.N(java.lang.reflect.Method, java.lang.Object, androidx.compose.runtime.b, java.lang.Object[]):void");
    }

    public static void O(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        J(jArr, jArr2, jArr4);
        V(jArr4, jArr3);
    }

    public static cc0 P(c cVar, s69 s69Var) {
        return new cc0(oh8.a(cVar, s69Var, 1.0f, ma2.a, false), 0);
    }

    public static dc0 Q(a aVar, s69 s69Var, boolean z) {
        return new dc0(oh8.a(aVar, s69Var, z ? ckg.c() : 1.0f, hh2.V, false), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ec0 R(c cVar, s69 s69Var, int i) {
        lb6 lb6Var = new lb6();
        lb6Var.a = i;
        int i2 = 0;
        ArrayList arrayListA = oh8.a(cVar, s69Var, 1.0f, lb6Var, false);
        for (int i3 = 0; i3 < arrayListA.size(); i3++) {
            lh8 lh8Var = (lh8) arrayListA.get(i3);
            ib6 ib6Var = (ib6) lh8Var.b;
            ib6 ib6Var2 = (ib6) lh8Var.c;
            if (ib6Var != null && ib6Var2 != null) {
                float[] fArr = ib6Var.a;
                int length = fArr.length;
                float[] fArr2 = ib6Var2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f2 = Float.NaN;
                    int i4 = 0;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float f3 = fArr3[i5];
                        if (f3 != f2) {
                            fArr3[i4] = f3;
                            i4++;
                            f2 = fArr3[i5];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i4);
                    lh8Var = new lh8(ib6Var.b(fArrCopyOfRange), ib6Var2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i3, lh8Var);
        }
        return new ec0(arrayListA, i2);
    }

    public static fc0 S(a aVar, s69 s69Var) {
        return new fc0(oh8.a(aVar, s69Var, 1.0f, h4.W, false), 0);
    }

    public static jc0 T(c cVar, s69 s69Var) {
        return new jc0(oh8.a(cVar, s69Var, ckg.c(), jeb.a, true), 0);
    }

    public static final byte[] U(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        u(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static void V(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = j4 ^ (j5 >>> 59);
        long j7 = j ^ ((j6 << 61) ^ (j6 << 63));
        long j8 = (j2 ^ ((j5 << 61) ^ (j5 << 63))) ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5));
        long j9 = (j3 ^ ((((j5 >>> 3) ^ (j5 >>> 1)) ^ j5) ^ (j5 << 5))) ^ (j6 >>> 59);
        long j10 = j9 >>> 3;
        jArr2[0] = (((j7 ^ j10) ^ (j10 << 2)) ^ (j10 << 3)) ^ (j10 << 8);
        jArr2[1] = (j9 >>> 59) ^ j8;
        jArr2[2] = 7 & j9;
    }

    public static rj5 W(kv1 kv1Var, Function2 function2) {
        return new rj5(kv1Var, new qj5(Long.MAX_VALUE, function2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, ux0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object X(defpackage.vi5 r5, defpackage.pu2 r6) {
        /*
            ux0 r0 = defpackage.ewa.W
            boolean r1 = r6 instanceof defpackage.ik5
            if (r1 == 0) goto L15
            r1 = r6
            ik5 r1 = (defpackage.ik5) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            ik5 r1 = new ik5
            r1.<init>(r6)
        L1a:
            java.lang.Object r6 = r1.result
            int r2 = r1.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            java.lang.Object r5 = r1.L$0
            luc r5 = (defpackage.luc) r5
            defpackage.r7d.b(r6)
            goto L4f
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r3
        L32:
            defpackage.r7d.b(r6)
            luc r6 = new luc
            r6.<init>()
            r6.element = r0
            jk5 r2 = new jk5
            r2.<init>(r6)
            r1.L$0 = r6
            r1.label = r4
            java.lang.Object r5 = r5.e(r2, r1)
            g13 r1 = defpackage.g13.a
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = r6
        L4f:
            T r5 = r5.element
            if (r5 == r0) goto L54
            return r5
        L54:
            java.lang.String r5 = "Flow is empty"
            defpackage.s6.j(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.X(vi5, pu2):java.lang.Object");
    }

    public static void Y(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[5];
        L(jArr, jArr3);
        V(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            L(jArr2, jArr3);
            V(jArr3, jArr2);
        }
    }

    public static final rqc Z(vi5 vi5Var, e13 e13Var, xre xreVar, Object obj) {
        xde xdeVarA = nk5.a(vi5Var);
        gse gseVarE = hh2.e(obj);
        return new rqc(gseVarE, u63.X(e13Var, xdeVarA.d, xreVar.equals(yde.a.a) ? i13.a : i13.d, new kk5(xreVar, xdeVarA.a, gseVarE, obj, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a0(defpackage.vi5 r5, defpackage.k82 r6, defpackage.pu2 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.mk5
            if (r0 == 0) goto L13
            r0 = r7
            mk5 r0 = (defpackage.mk5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            mk5 r0 = new mk5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.r7d.b(r7)
            goto L5d
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r2
        L2c:
            defpackage.r7d.b(r7)
            xde r5 = defpackage.nk5.a(r5)
            v03 r7 = r6.a
            ex7$a r1 = ex7.a.a
            v03$a r7 = r7.h1(r1)
            ex7 r7 = (defpackage.ex7) r7
            yd2 r1 = new yd2
            r1.<init>(r3)
            r1.K(r7)
            v03 r7 = r5.d
            vi5<T> r5 = r5.a
            lk5 r4 = new lk5
            r4.<init>(r5, r1, r2)
            r5 = 2
            defpackage.u63.Y(r6, r7, r2, r4, r5)
            r0.label = r3
            java.lang.Object r7 = r1.o(r0)
            g13 r5 = defpackage.g13.a
            if (r7 != r5) goto L5d
            return r5
        L5d:
            o7d r7 = (defpackage.o7d) r7
            java.lang.Object r5 = r7.b()
            defpackage.r7d.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.a0(vi5, k82, pu2):java.lang.Object");
    }

    public static final void b(ah2 ah2Var, b bVar, int i) {
        androidx.compose.runtime.c cVarH = bVar.h(-709502251);
        int i2 = 7;
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            jte jteVar = kkd.a;
            ikd ikdVar = (ikd) cVarH.M(jteVar);
            hkd hkdVarY = r03.y(cVarH);
            Object[] objArr = {ikdVar};
            ko2 ko2Var = new ko2(new kh2(10), new kc(3, ikdVar, hkdVarY));
            boolean zX = cVarH.x(ikdVar) | cVarH.x(hkdVarY);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new ti(i2, ikdVar, hkdVarY);
                cVarH.p(objV);
            }
            gt8 gt8Var = (gt8) ypd.N(objArr, ko2Var, (gu5) objV, cVarH, 0);
            rm2.a(jteVar.a(gt8Var), bh2.c(-412824043, new ht8(ah2Var, gt8Var), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pj(ah2Var, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b0(defpackage.vi5 r4, java.util.Collection r5, defpackage.pu2 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ij5
            if (r0 == 0) goto L13
            r0 = r6
            ij5 r0 = (defpackage.ij5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ij5 r0 = new ij5
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r4 = r0.L$0
            java.util.Collection r4 = (java.util.Collection) r4
            defpackage.r7d.b(r6)
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L30:
            defpackage.r7d.b(r6)
            jj5 r6 = new jj5
            r6.<init>(r5)
            r0.L$0 = r5
            r0.label = r2
            java.lang.Object r4 = r4.e(r6, r0)
            g13 r6 = defpackage.g13.a
            if (r4 != r6) goto L45
            return r6
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.b0(vi5, java.util.Collection, pu2):java.lang.Object");
    }

    public static final nde c(int i, int i2, eo1 eo1Var) {
        if (i < 0) {
            h5.k(p6.c(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            h5.k(p6.c(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && eo1Var != eo1.a) {
            v40.n(eo1Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new nde(i, i3, eo1Var);
    }

    public static final f22 c0(vi5 vi5Var, wu5 wu5Var) {
        int i = zj5.a;
        return new f22(wu5Var, vi5Var, vr4.a, -2, eo1.a);
    }

    public static /* synthetic */ nde d(int i, int i2, eo1 eo1Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            eo1Var = eo1.a;
        }
        return c(i, i2, eo1Var);
    }

    public static final int e(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final void f(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static final x2b h(k07 k07Var, Context context, int i) {
        return k07Var instanceof rg1 ? zkd.m(new v70(((rg1) k07Var).a), i) : k07Var instanceof qb4 ? new sb4(r37.a(k07Var, context.getResources()).mutate()) : new y17(k07Var);
    }

    public static final pqc i(nde ndeVar) {
        return new pqc(ndeVar, null);
    }

    public static final rqc j(gse gseVar) {
        return new rqc(gseVar, null);
    }

    public static vi5 l(vi5 vi5Var, int i) {
        eo1 eo1Var;
        if (i < 0 && i != -2 && i != -1) {
            h5.k(p6.c(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            eo1Var = eo1.b;
        } else {
            eo1Var = eo1.a;
        }
        int i2 = i;
        eo1 eo1Var2 = eo1Var;
        return vi5Var instanceof xv5 ? xv5.a.a((xv5) vi5Var, null, i2, eo1Var2, 1) : new e22(vi5Var, null, i2, eo1Var2, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable m(defpackage.vi5 r4, defpackage.wi5 r5, defpackage.pu2 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.oj5
            if (r0 == 0) goto L13
            r0 = r6
            oj5 r0 = (defpackage.oj5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            oj5 r0 = new oj5
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            java.lang.Object r4 = r0.L$0
            luc r4 = (defpackage.luc) r4
            defpackage.r7d.b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L4c
        L2a:
            r5 = move-exception
            goto L4f
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L32:
            defpackage.r7d.b(r6)
            luc r6 = new luc
            r6.<init>()
            pj5 r1 = new pj5     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L4d
            r0.label = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.e(r1, r0)     // Catch: java.lang.Throwable -> L4d
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L4c
            return r5
        L4c:
            return r2
        L4d:
            r5 = move-exception
            r4 = r6
        L4f:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5b
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7d
        L5b:
            v03 r6 = r0.getContext()
            ex7$a r0 = ex7.a.a
            v03$a r6 = r6.h1(r0)
            ex7 r6 = (defpackage.ex7) r6
            if (r6 == 0) goto L7e
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L70
            goto L7e
        L70:
            java.util.concurrent.CancellationException r6 = r6.G()
            if (r6 == 0) goto L7e
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            throw r5
        L7e:
            if (r4 != 0) goto L81
            return r5
        L81:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L89
            defpackage.boa.h(r4, r5)
            throw r4
        L89:
            defpackage.boa.h(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.m(vi5, wi5, pu2):java.io.Serializable");
    }

    public static final a22 n(Function2 function2) {
        return new a22(function2, vr4.a, -2, eo1.a);
    }

    public static void o(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static final g4a p(ei7 ei7Var, b bVar, int i) {
        Object objV = bVar.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            objV = r.f(Boolean.FALSE);
            bVar.p(objV);
        }
        g4a g4aVar = (g4a) objV;
        boolean z = (((i & 14) ^ 6) > 4 && bVar.K(ei7Var)) || (i & 6) == 4;
        Object objV2 = bVar.v();
        if (z || objV2 == c0020a) {
            objV2 = new bm5(ei7Var, g4aVar, null);
            bVar.p(objV2);
        }
        to4.d(bVar, ei7Var, (Function2) objV2);
        return g4aVar;
    }

    public static final Object q(vi5 vi5Var, Function2 function2, lu2 lu2Var) {
        int i = zj5.a;
        Object objE = l(c0(vi5Var, new yj5(function2, null)), 0).e(yka.a, lu2Var);
        g13 g13Var = g13.a;
        if (objE != g13Var) {
            objE = j6g.a;
        }
        return objE == g13Var ? objE : j6g.a;
    }

    public static final Object r(wi5 wi5Var, vi5[] vi5VarArr, wu5 wu5Var, lu2 lu2Var) {
        rb2 rb2Var = new rb2(vi5VarArr, ks1.c, wu5Var, wi5Var, null);
        xi5 xi5Var = new xi5(lu2Var, lu2Var.getContext());
        Object objA = a6g.a(xi5Var, true, xi5Var, rb2Var);
        return objA == g13.a ? objA : j6g.a;
    }

    public static final zi8 s(zi8 zi8Var, HashSet hashSet) {
        mge mgeVarG;
        zi8 zi8VarS;
        ui8 ui8VarU;
        ofe ofeVar = ofe.a;
        kwf kwfVarG0 = ofeVar.g0(zi8Var);
        if (hashSet.add(kwfVarG0)) {
            rxf rxfVarQ = s62.a.q(kwfVarG0);
            if (rxfVarQ != null) {
                if (rxfVarQ instanceof rxf) {
                    ui8VarU = boa.u(rxfVarQ);
                } else {
                    StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb.append(rxfVarQ);
                    sb.append(", ");
                    h5.k(ia.m(fwc.a, rxfVarQ.getClass(), sb));
                    ui8VarU = null;
                }
                zi8 zi8VarS2 = s(ui8VarU, hashSet);
                if (zi8VarS2 != null) {
                    return ((zi8VarS2 instanceof oge) && s62.a.H((oge) zi8VarS2) && s62.a.G(zi8Var) && (s62.a.B(ofeVar.g0(ui8VarU)) || ((ui8VarU instanceof oge) && s62.a.H((oge) ui8VarU)))) ? ofeVar.q0(ui8VarU) : (s62.a.G(zi8VarS2) || !s62.a.E(zi8Var)) ? zi8VarS2 : ofeVar.q0(zi8VarS2);
                }
            } else {
                if (!s62.a.B(kwfVarG0)) {
                    return zi8Var;
                }
                zi8Var.getClass();
                if (zi8Var instanceof ui8) {
                    mgeVarG = fe7.g((ui8) zi8Var);
                } else {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(zi8Var);
                    sb2.append(", ");
                    h5.k(ia.m(fwc.a, zi8Var.getClass(), sb2));
                    mgeVarG = null;
                }
                if (mgeVarG != null && (zi8VarS = s(mgeVarG, hashSet)) != null) {
                    return !s62.a.G(zi8Var) ? zi8VarS : s62.a.G(zi8VarS) ? zi8Var : ((zi8VarS instanceof oge) && s62.a.H((oge) zi8VarS)) ? zi8Var : ofeVar.q0(zi8VarS);
                }
            }
        }
        return null;
    }

    public static final v12 t(dsc dscVar) {
        return new v12(dscVar, true);
    }

    public static final long u(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    public static final vi5 v(vi5 vi5Var) {
        return ((vi5Var instanceof fse) || (vi5Var instanceof x74)) ? vi5Var : new x74(vi5Var);
    }

    public static final sj5 w(vi5 vi5Var, int i) {
        if (i >= 0) {
            return new sj5(vi5Var, i);
        }
        h5.k(p6.c(i, "Drop count should be non-negative, but had "));
        return null;
    }

    public static final Object x(wi5 wi5Var, vi5 vi5Var, lu2 lu2Var) throws Throwable {
        y(wi5Var);
        Object objE = vi5Var.e(wi5Var, lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }

    public static final void y(wi5 wi5Var) throws Throwable {
        if (wi5Var instanceof jlf) {
            throw ((jlf) wi5Var).a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method z(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        boolean z = false;
        int i = 0;
        loop0: while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methodArr[i];
            if (str.equals(method.getName()) || wve.K(method.getName(), str.concat("-"), z)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z2 = z;
                    ?? r12 = z2;
                    for (?? r11 = z2; r11 < length2; r11++) {
                        Class<?> cls = parameterTypes[r11];
                        int i2 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        cls.getClass();
                        iwc iwcVar = fwc.a;
                        yd8 yd8VarB = iwcVar.b(cls);
                        cls2.getClass();
                        arrayList.add(Boolean.valueOf(yd8VarB.equals(iwcVar.b(cls2)) || cls.isAssignableFrom(cls2)));
                        r12 = i2;
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                continue;
            }
            i++;
            z = false;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public String H() {
        return r03.p(d93.f());
    }

    @Override // defpackage.bl1
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public Rect a(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            objInvoke.getClass();
            return new Rect((Rect) objInvoke);
        } catch (Exception e2) {
            if ((e2 instanceof NoSuchFieldException) || (e2 instanceof NoSuchMethodException) || (e2 instanceof IllegalAccessException) || (e2 instanceof InvocationTargetException)) {
                return cl1.a.a(activity);
            }
            throw e2;
        }
    }

    @Override // defpackage.wrf
    public Object apply(Object obj) {
        return ((String) obj).getBytes();
    }

    @Override // defpackage.hme
    public boolean k(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    public String toString() {
        switch (this.a) {
            case DatadogLogGenerator.CRASH /* 9 */:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 12:
                List<svh<?>> list = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).zzf());
            case 13:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((vgi) wgi.b.zza()).zzc());
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((yii) zii.b.zza()).zzb());
            case 15:
                List<svh<?>> list4 = djh.a;
                return Boolean.valueOf(((uci) oci.b.zza()).zze());
            default:
                List<svh<?>> list5 = djh.a;
                return Boolean.valueOf(((rbi) nbi.b.zza()).zza());
        }
    }
}
