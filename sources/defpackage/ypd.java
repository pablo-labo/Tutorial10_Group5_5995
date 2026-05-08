package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.g;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.ikd;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@fd8
public class ypd implements jg2, nvh, c82, vs5 {
    public static final ux0 Z;
    public static final ux0 a0;
    public static final ux0 b0;
    public static final ah2 d;
    public final /* synthetic */ int a;
    public static final float[] b = new float[91];
    public static final ah2 c = new ah2(1812656442, new hm0(1), false);
    public static final ah2 e = new ah2(1263266926, new hm0(3), false);
    public static final StackTraceElement[] f = new StackTraceElement[0];
    public static final KSerializer[] V = new KSerializer[0];
    public static final int[] W = {Integer.MAX_VALUE, -1, -1, -1, -1};
    public static final int[] X = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    public static final int[] Y = {-1, -1073741826, -1, -1, -1, 1, 1};
    public static final qtc c0 = new qtc(0.0f, 0.0f, 10.0f, 10.0f);
    public static final ypd d0 = new ypd(10);
    public static final ypd e0 = new ypd(11);
    public static final ypd f0 = new ypd(12);
    public static final ypd g0 = new ypd(13);
    public static final ypd h0 = new ypd(14);
    public static final ypd i0 = new ypd(15);

    static {
        int i = 4;
        d = new ah2(1565427165, new gm0(i, (byte) 0), false);
        Z = new ux0("STATE_REG", i);
        a0 = new ux0("STATE_COMPLETED", i);
        b0 = new ux0("STATE_CANCELLED", i);
    }

    public /* synthetic */ ypd(int i) {
        this.a = i;
    }

    public static int A(String str) {
        if (str == null) {
            return -1;
        }
        String strP = st9.p(str);
        strP.getClass();
        switch (strP) {
        }
        return -1;
    }

    public static int B(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final boolean C(f5e f5eVar) {
        tia tiaVarD = f5eVar.d();
        z3a<r5e<?>, Object> z3aVar = f5eVar.d.a;
        return (tiaVarD != null ? tiaVarD.J1() : false) || z3aVar.b(k5e.p) || z3aVar.b(k5e.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean D(defpackage.f5e r14) {
        /*
            boolean r0 = C(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            w4e r14 = r14.d
            boolean r0 = r14.c
            if (r0 != 0) goto L59
            z3a<r5e<?>, java.lang.Object> r14 = r14.a
            java.lang.Object[] r0 = r14.b
            java.lang.Object[] r2 = r14.c
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            r5e r11 = (defpackage.r5e) r11
            boolean r10 = r11.c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypd.D(f5e):boolean");
    }

    public static boolean E(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static int F(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static void G(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        ka6.G0(iArr, iArr2, iArr4);
        J(iArr4, iArr3);
    }

    public static int H(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static final String I(String str) {
        str.getClass();
        return wve.K(str, "on", false) ? "top".concat(str.substring(2)) : str;
    }

    public static void J(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (((long) iArr[0]) & 4294967295L) + j + (j << 31);
        iArr2[0] = (int) j6;
        long j7 = (((long) iArr[1]) & 4294967295L) + j2 + (j2 << 31) + (j6 >>> 32);
        iArr2[1] = (int) j7;
        long j8 = (((long) iArr[2]) & 4294967295L) + j3 + (j3 << 31) + (j7 >>> 32);
        iArr2[2] = (int) j8;
        long j9 = (((long) iArr[3]) & 4294967295L) + j4 + (j4 << 31) + (j8 >>> 32);
        iArr2[3] = (int) j9;
        long j10 = (4294967295L & ((long) iArr[4])) + j5 + (j5 << 31) + (j9 >>> 32);
        iArr2[4] = (int) j10;
        K((int) (j10 >>> 32), iArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void K(int r9, int[] r10) {
        /*
            r0 = 5
            if (r9 == 0) goto L34
            long r1 = (long) r9
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 2147483649(0x80000001, double:1.060997896E-314)
            long r1 = r1 * r5
            r9 = 0
            r5 = r10[r9]
            long r5 = (long) r5
            long r5 = r5 & r3
            long r1 = r1 + r5
            int r5 = (int) r1
            r10[r9] = r5
            r5 = 32
            long r1 = r1 >>> r5
            r6 = 1
            r7 = r10[r6]
            long r7 = (long) r7
            long r3 = r3 & r7
            long r1 = r1 + r3
            int r3 = (int) r1
            r10[r6] = r3
            long r1 = r1 >>> r5
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2d
            goto L32
        L2d:
            r9 = 2
            int r9 = defpackage.ka6.u0(r0, r9, r10)
        L32:
            if (r9 != 0) goto L42
        L34:
            r9 = 4
            r9 = r10[r9]
            r1 = -1
            if (r9 != r1) goto L48
            int[] r9 = defpackage.ypd.W
            boolean r9 = defpackage.ka6.p0(r10, r9)
            if (r9 == 0) goto L48
        L42:
            r9 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            defpackage.ka6.R(r0, r9, r10)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypd.K(int, int[]):void");
    }

    public static final ra9 L(o8 o8Var, Function1 function1, b bVar) {
        o8 o8Var2;
        g4a g4aVarG = r.g(o8Var, bVar);
        g4a g4aVarG2 = r.g(function1, bVar);
        String str = (String) O(new Object[0], null, j9.a, bVar, 3072, 6);
        k9 k9Var = (k9) bVar.M(g09.a);
        if (k9Var == null) {
            bVar.L(1006590171);
            Object baseContext = (Context) bVar.M(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof k9) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            k9Var = (k9) baseContext;
        } else {
            bVar.L(1006589303);
        }
        bVar.F();
        if (k9Var == null) {
            r6.g("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        c9 c9VarD = k9Var.d();
        Object objV = bVar.v();
        Object obj = b.a.a;
        if (objV == obj) {
            objV = new a9();
            bVar.p(objV);
        }
        a9 a9Var = (a9) objV;
        Object objV2 = bVar.v();
        if (objV2 == obj) {
            objV2 = new ra9(a9Var, g4aVarG);
            bVar.p(objV2);
        }
        ra9 ra9Var = (ra9) objV2;
        boolean zX = bVar.x(a9Var) | bVar.x(c9VarD) | bVar.K(str) | bVar.x(o8Var) | bVar.K(g4aVarG2);
        Object objV3 = bVar.v();
        if (zX || objV3 == obj) {
            o8Var2 = o8Var;
            objV3 = new i9(a9Var, c9VarD, str, o8Var2, g4aVarG2);
            bVar.p(objV3);
        } else {
            o8Var2 = o8Var;
        }
        Function1 function12 = (Function1) objV3;
        m74 m74Var = to4.a;
        boolean zK = bVar.K(c9VarD) | bVar.K(str) | bVar.K(o8Var2);
        Object objV4 = bVar.v();
        if (zK || objV4 == obj) {
            objV4 = new k74(function12);
            bVar.p(objV4);
        }
        return ra9Var;
    }

    public static final Object M(Object[] objArr, gu5 gu5Var, b bVar) {
        return O(Arrays.copyOf(objArr, objArr.length), mh2.b0, gu5Var, bVar, 3456, 0);
    }

    public static final Object N(Object[] objArr, uld uldVar, gu5 gu5Var, b bVar, int i) {
        return O(Arrays.copyOf(objArr, objArr.length), uldVar, gu5Var, bVar, 384 | ((i << 3) & 7168), 0);
    }

    @sy3
    public static final Object O(Object[] objArr, uld uldVar, gu5 gu5Var, b bVar, int i, int i2) {
        Object[] objArr2;
        final Object obj;
        Object objF;
        if ((i2 & 2) != 0) {
            uldVar = mh2.b0;
        }
        final uld uldVar2 = uldVar;
        long jK = bVar.k();
        s(36);
        final String string = Long.toString(jK, 36);
        string.getClass();
        uldVar2.getClass();
        final ikd ikdVar = (ikd) bVar.M(kkd.a);
        Object objV = bVar.v();
        Object obj2 = b.a.a;
        if (objV == obj2) {
            Object objB = (ikdVar == null || (objF = ikdVar.f(string)) == null) ? null : uldVar2.b(objF);
            if (objB == null) {
                objB = gu5Var.invoke();
            }
            objArr2 = objArr;
            Object dkdVar = new dkd(uldVar2, ikdVar, string, objB, objArr2);
            bVar.p(dkdVar);
            objV = dkdVar;
        } else {
            objArr2 = objArr;
        }
        final dkd dkdVar2 = (dkd) objV;
        Object objInvoke = Arrays.equals(objArr2, dkdVar2.e) ? dkdVar2.d : null;
        if (objInvoke == null) {
            objInvoke = gu5Var.invoke();
        }
        boolean zX = bVar.x(dkdVar2) | ((((i & 112) ^ 48) > 32 && bVar.x(uldVar2)) || (i & 48) == 32) | bVar.x(ikdVar) | bVar.K(string) | bVar.x(objInvoke) | bVar.x(objArr2);
        Object objV2 = bVar.v();
        if (zX || objV2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object obj3 = new gu5() { // from class: m0d
                /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
                @Override // defpackage.gu5
                public final Object invoke() {
                    boolean z;
                    dkd dkdVar3 = dkdVar2;
                    ikd ikdVar2 = dkdVar3.b;
                    ikd ikdVar3 = ikdVar;
                    boolean z2 = true;
                    if (ikdVar2 != ikdVar3) {
                        dkdVar3.b = ikdVar3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = dkdVar3.c;
                    String str2 = string;
                    if (wl7.b(str, str2)) {
                        z2 = z;
                    } else {
                        dkdVar3.c = str2;
                    }
                    dkdVar3.a = uldVar2;
                    dkdVar3.d = obj;
                    dkdVar3.e = objArr3;
                    ikd.a aVar = dkdVar3.f;
                    if (aVar != null && z2) {
                        aVar.a();
                        dkdVar3.f = null;
                        dkdVar3.c();
                    }
                    return j6g.a;
                }
            };
            bVar.p(obj3);
            objV2 = obj3;
        } else {
            obj = objInvoke;
        }
        m74 m74Var = to4.a;
        bVar.E((gu5) objV2);
        return obj;
    }

    public static int P(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iG = hh2.G(obj);
        int i4 = iG & i;
        int iW = W(i4, obj3);
        if (iW != 0) {
            int i5 = ~i;
            int i6 = iG & i5;
            int i7 = -1;
            while (true) {
                i2 = iW - 1;
                i3 = iArr[i2];
                if ((i3 & i5) == i6 && ojh.l(obj, objArr[i2]) && (objArr2 == null || ojh.l(obj2, objArr2[i2]))) {
                    break;
                }
                int i8 = i3 & i;
                if (i8 == 0) {
                    break;
                }
                i7 = i2;
                iW = i8;
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                X(obj3, i4, i9);
                return i2;
            }
            iArr[i7] = F(iArr[i7], i9, i);
            return i2;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean Q(z3a z3aVar, Object obj, Object obj2) {
        V vD = z3aVar.d(obj);
        if (vD == 0) {
            return false;
        }
        if (!(vD instanceof a4a)) {
            if (!vD.equals(obj2)) {
                return false;
            }
            z3aVar.k(obj);
            return true;
        }
        a4a a4aVar = (a4a) vD;
        boolean zL = a4aVar.l(obj2);
        if (zL && a4aVar.b()) {
            z3aVar.k(obj);
        }
        return zL;
    }

    public static final void R(z3a z3aVar, Object obj) {
        boolean zB;
        long[] jArr = z3aVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = z3aVar.b[i4];
                        Object obj3 = z3aVar.c[i4];
                        if (obj3 instanceof a4a) {
                            a4a a4aVar = (a4a) obj3;
                            a4aVar.l(obj);
                            zB = a4aVar.b();
                        } else {
                            zB = obj3 == obj;
                        }
                        if (zB) {
                            z3aVar.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static Object S(gu5 gu5Var, pu2 pu2Var) {
        return u63.q0(vr4.a, new ij7(gu5Var, null), pu2Var);
    }

    public static void T(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        ka6.j1(iArr, iArr3);
        J(iArr3, iArr2);
    }

    public static void U(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        ka6.j1(iArr, iArr3);
        J(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            ka6.j1(iArr2, iArr3);
            J(iArr3, iArr2);
        }
    }

    public static void V(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ka6.m1(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 2147483649L;
            iArr3[0] = (int) j;
            if ((j >> 32) == 0) {
                return;
            }
            ka6.U(5, 1, iArr3);
        }
    }

    public static int W(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void X(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int Y(int i) {
        int iMax = Math.max(i + 1, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (1.0d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        return Math.max(4, iHighestOneBit);
    }

    public static String Z(char c2, Locale locale) {
        locale.getClass();
        String strValueOf = String.valueOf(c2);
        strValueOf.getClass();
        String upperCase = strValueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c2);
            strValueOf2.getClass();
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c2));
            }
        } else if (c2 != 329) {
            char cCharAt = upperCase.charAt(0);
            String lowerCase = upperCase.substring(1).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return cCharAt + lowerCase;
        }
        return upperCase;
    }

    public static final String a0(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wve.E(((nl6) next).a, TracingInterceptor.HEADER_CT, true)) {
                break;
            }
        }
        nl6 nl6Var = (nl6) next;
        if (nl6Var != null) {
            return nl6Var.b;
        }
        return null;
    }

    public static final void r(z3a z3aVar, Object obj, Object obj2) {
        int i = z3aVar.i(obj);
        boolean z = i < 0;
        Object obj3 = null;
        Object obj4 = z ? null : z3aVar.c[i];
        if (obj4 != null) {
            if (obj4 instanceof a4a) {
                ((a4a) obj4).d(obj2);
            } else if (obj4 != obj2) {
                a4a a4aVar = new a4a(obj3);
                a4aVar.d(obj4);
                a4aVar.d(obj2);
                obj2 = a4aVar;
            }
            obj2 = obj4;
        }
        if (!z) {
            z3aVar.c[i] = obj2;
            return;
        }
        int i2 = ~i;
        z3aVar.b[i2] = obj;
        z3aVar.c[i2] = obj2;
    }

    public static void s(int i) {
        if (2 > i || i >= 37) {
            r40.k(o6.g(i, "radix ", " was not in valid range "), new oh7(2, 36, 1));
        }
    }

    public static Object t(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        l5.q(p6.c(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static final boolean u(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final String v(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final a3a w(j5e j5eVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            f5e f5eVarA = j5eVar.a();
            pm8 pm8Var = f5eVarA.c;
            if (pm8Var.k() && pm8Var.d()) {
                a3a a3aVar = new a3a(48);
                u4e u4eVar = new u4e();
                u4eVar.b(mh2.x(f5eVarA.g()));
                x(u4eVar, f5eVarA, a3aVar, f5eVarA, new u4e());
                return a3aVar;
            }
            a3a a3aVar2 = kh7.a;
            a3aVar2.getClass();
            return a3aVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void x(u4e u4eVar, f5e f5eVar, a3a a3aVar, f5e f5eVar2, u4e u4eVar2) {
        qtc qtcVarY1;
        pm8 pm8Var;
        Region region = u4eVar.a;
        int i = f5eVar.g;
        pm8 pm8Var2 = f5eVar2.c;
        int i2 = f5eVar2.g;
        boolean z = (pm8Var2.k() && pm8Var2.d()) ? false : true;
        if (!region.isEmpty() || i2 == i) {
            if (!z || f5eVar2.e) {
                c5e c5eVarF = f5eVar2.f();
                if (c5eVarF == null) {
                    qtcVarY1 = pm8Var2.t0.c.Y1();
                } else {
                    e.c cVarK = c5eVarF.k();
                    boolean z2 = x4e.a(f5eVar2.d, v4e.b) != null;
                    if (!cVarK.a.c0) {
                        qtcVarY1 = qtc.e;
                    } else if (z2) {
                        qtcVarY1 = us3.d(cVarK, 8).Y1();
                    } else {
                        tia tiaVarD = us3.d(cVarK, 8);
                        qtcVarY1 = ojh.m(tiaVarD).J(tiaVarD, true);
                    }
                }
                ph7 ph7VarX = mh2.x(qtcVarY1);
                u4eVar2.b(ph7VarX);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!u4eVar2.a.op(region, Region.Op.INTERSECT)) {
                    if (f5eVar2.e) {
                        f5e f5eVarL = f5eVar2.l();
                        a3aVar.h(i2, new i5e(f5eVar2, mh2.x((f5eVarL == null || (pm8Var = f5eVarL.c) == null || !pm8Var.k()) ? c0 : f5eVarL.g())));
                        return;
                    } else {
                        if (i2 == -1) {
                            a3aVar.h(i2, new i5e(f5eVar2, u4eVar2.a()));
                            return;
                        }
                        return;
                    }
                }
                a3aVar.h(i2, new i5e(f5eVar2, u4eVar2.a()));
                List listJ = f5e.j(4, f5eVar2);
                for (int size = listJ.size() - 1; -1 < size; size--) {
                    if (!((f5e) listJ.get(size)).k().a.b(k5e.z)) {
                        x(u4eVar, f5eVar, a3aVar, (f5e) listJ.get(size), u4eVar2);
                    }
                }
                if (D(f5eVar2)) {
                    region.op(ph7VarX.a, ph7VarX.b, ph7VarX.c, ph7VarX.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final WritableArray y(CharSequence charSequence, Layout layout, Context context) {
        charSequence.getClass();
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.getClass();
        TextPaint textPaint = new TextPaint(layout.getPaint());
        textPaint.setTextSize(textPaint.getTextSize() * 100.0f);
        int i = 0;
        int i2 = 1;
        textPaint.getTextBounds("T", 0, 1, new Rect());
        float fHeight = (r5.height() / 100.0f) / displayMetrics.density;
        textPaint.getTextBounds("x", 0, 1, new Rect());
        float fHeight2 = (r7.height() / 100.0f) / displayMetrics.density;
        int lineCount = layout.getLineCount();
        while (i < lineCount) {
            float lineWidth = (charSequence.length() <= 0 || charSequence.charAt(layout.getLineEnd(i) - i2) != '\n') ? layout.getLineWidth(i) : layout.getLineMax(i);
            layout.getLineBounds(i, new Rect());
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("x", layout.getLineLeft(i) / displayMetrics.density);
            readableMapBuilder.put("y", r11.top / displayMetrics.density);
            readableMapBuilder.put("width", lineWidth / displayMetrics.density);
            readableMapBuilder.put("height", r11.height() / displayMetrics.density);
            readableMapBuilder.put("descender", layout.getLineDescent(i) / displayMetrics.density);
            readableMapBuilder.put("ascender", (-layout.getLineAscent(i)) / displayMetrics.density);
            readableMapBuilder.put("baseline", layout.getLineBaseline(i) / displayMetrics.density);
            readableMapBuilder.put("capHeight", fHeight);
            readableMapBuilder.put("xHeight", fHeight2);
            readableMapBuilder.put("text", charSequence.subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
            i++;
            i2 = 1;
        }
        return writableArrayCreateArray;
    }

    public static vi5 z(Function1 function1) {
        mj5 mj5Var = new mj5(new nj5(new kjd(new ra1(function1, null)), new sa1(3, null)), new ta1(2, null));
        eq3 eq3Var = a74.a;
        return wg2.F(mj5Var, no3.c);
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        switch (this.a) {
            case 10:
                return new g5((Context) l7dVar.get(Context.class), (n20) l7dVar.get(n20.class));
            default:
                pf5 pf5Var = (pf5) l7dVar.get(pf5.class);
                Context context = (Context) l7dVar.get(Context.class);
                kxe kxeVar = (kxe) l7dVar.get(kxe.class);
                fib.i(pf5Var);
                fib.i(context);
                fib.i(kxeVar);
                fib.i(context.getApplicationContext());
                if (o20.c == null) {
                    synchronized (o20.class) {
                        try {
                            if (o20.c == null) {
                                Bundle bundle = new Bundle(1);
                                pf5Var.a();
                                if ("[DEFAULT]".equals(pf5Var.b)) {
                                    kxeVar.b(qfh.a, vkh.a);
                                    bundle.putBoolean("dataCollectionDefaultEnabled", pf5Var.h());
                                }
                                o20.c = new o20(mhh.a(context, bundle).b);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return o20.c;
        }
    }

    @Override // defpackage.vs5
    public void g(g gVar) {
    }

    @Override // defpackage.c82
    public long i() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 11:
                List<svh<?>> list = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).zzg());
            case 12:
                List<svh<?>> list2 = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zzn());
            case 13:
            default:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((fbi) wai.b.zza()).zza());
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                List<svh<?>> list4 = djh.a;
                return Boolean.valueOf(((lhi) mhi.b.zza()).zzb());
        }
    }
}
