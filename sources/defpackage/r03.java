package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class r03 implements wo1, nvh, o55 {
    public static final ah2 b;
    public static final ah2 c;
    public static final ah2 d;
    public static final ah2 e;
    public static final ah2 f;
    public final /* synthetic */ int a;
    public static final r03 V = new r03(4);
    public static final vl8 W = vl8.a;
    public static final jy3 X = new jy3(1.0f, 1.0f);
    public static final r03 Y = new r03(6);
    public static final uz7 Z = new uz7(5);
    public static final dob a0 = new dob();
    public static final r03 b0 = new r03(8);
    public static final r03 c0 = new r03(9);
    public static final r03 d0 = new r03(10);

    static {
        int i = 2;
        b = new ah2(1798295335, new zk0(i, (byte) 0), false);
        int i2 = 1;
        c = new ah2(-1783694361, new c10(i2), false);
        d = new ah2(-1845923161, new li2(i2), false);
        e = new ah2(-1358980396, new ki2(i2), false);
        f = new ah2(58529509, new li2(i), false);
    }

    public /* synthetic */ r03(int i) {
        this.a = i;
    }

    public static void A(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[8];
        v(jArr, jArr3);
        x(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            v(jArr2, jArr3);
            x(jArr3, jArr2);
        }
    }

    public static final long B(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String C(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + q92.I(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + q92.I(Float.intBitsToFloat(i)) + ", " + q92.I(Float.intBitsToFloat(i2)) + ')';
    }

    public static int D(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static final q60 a(String str) {
        return new q60(pi3.k(str));
    }

    public static final long d(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void e(gu5 gu5Var, gu5 gu5Var2, b bVar, int i) {
        int i2;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, 777757452);
        int i3 = (cVarC.x(gu5Var2) ? 32 : 16) | i;
        if (cVarC.o(i3 & 1, (i3 & 19) != 18)) {
            String strI = ak2.I(R.string.confirmation_dialog_title, cVarC);
            String strI2 = ak2.I(R.string.confirmation_dialog_body, cVarC);
            boolean z = (i3 & 112) == 32;
            Object objV = cVarC.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new di(14, gu5Var2);
                cVarC.p(objV);
            }
            gu5 gu5Var3 = (gu5) objV;
            Object objV2 = cVarC.v();
            if (objV2 == c0020a) {
                objV2 = new sd(13, gu5Var);
                cVarC.p(objV2);
            }
            i2 = 1;
            hh2.d(strI, strI2, gu5Var3, (gu5) objV2, ak2.I(R.string.confirmation_dialog_close_button, cVarC), ak2.I(R.string.confirmation_dialog_cancel_button, cVarC), true, false, 3, cVarC, 1572864, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        } else {
            i2 = 1;
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new sm0(i, i2, gu5Var, gu5Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(defpackage.jlf r4, defpackage.wu5 r5, java.lang.Throwable r6, defpackage.pu2 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.kj5
            if (r0 == 0) goto L13
            r0 = r7
            kj5 r0 = (defpackage.kj5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kj5 r0 = new kj5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            java.lang.Object r4 = r0.L$0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            defpackage.r7d.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L43
        L2a:
            r4 = move-exception
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L33:
            defpackage.r7d.b(r7)
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2a
            r0.label = r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r5.q(r4, r6, r0)     // Catch: java.lang.Throwable -> L2a
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L43
            return r5
        L43:
            j6g r4 = defpackage.j6g.a
            return r4
        L46:
            if (r6 == 0) goto L4d
            if (r6 == r4) goto L4d
            defpackage.boa.h(r4, r6)
        L4d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r03.f(jlf, wu5, java.lang.Throwable, pu2):java.lang.Object");
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static final g4a h(d3a d3aVar, b bVar) {
        Object objV = bVar.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            objV = r.f(Boolean.FALSE);
            bVar.p(objV);
        }
        g4a g4aVar = (g4a) objV;
        Object objV2 = bVar.v();
        if (objV2 == c0020a) {
            objV2 = new imb(d3aVar, g4aVar, null);
            bVar.p(objV2);
        }
        to4.d(bVar, d3aVar, (Function2) objV2);
        return g4aVar;
    }

    public static final List i(ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return zr4.a;
        }
        if (size == 1) {
            return u63.Z(z92.O0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final boolean j(long j, long j2) {
        return j == j2;
    }

    public static final xuc k(Annotation[] annotationArr, mq5 mq5Var) {
        Annotation annotation;
        annotationArr.getClass();
        mq5Var.getClass();
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (wl7.b(wuc.a(jh2.p(jh2.m(annotation))).a(), mq5Var)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new xuc(annotation);
        }
        return null;
    }

    public static final String l(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        if (str2.length() > 0) {
            sb.append("-");
            sb.append(str2);
        }
        if (str3.length() > 0) {
            sb.append("-");
            sb.append(str3);
        }
        return sb.toString();
    }

    public static final ArrayList n(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new xuc(annotation));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String p(java.util.Locale r6) {
        /*
            java.lang.String r0 = r6.getLanguage()
            java.lang.String r1 = "no"
            boolean r0 = defpackage.wl7.b(r0, r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto L34
            java.lang.String r0 = r6.getCountry()
            java.lang.String r2 = "NO"
            boolean r0 = defpackage.wl7.b(r0, r2)
            if (r0 == 0) goto L34
            java.lang.String r6 = r6.getVariant()
            java.lang.String r0 = "NY"
            boolean r6 = defpackage.wl7.b(r6, r0)
            if (r6 == 0) goto L2d
            java.lang.String r6 = "nn"
            java.lang.String r6 = l(r6, r2, r1)
            return r6
        L2d:
            java.lang.String r6 = "nb"
            java.lang.String r6 = l(r6, r2, r1)
            return r6
        L34:
            java.lang.String r0 = r6.getLanguage()
            r0.getClass()
            int r0 = r0.length()
            if (r0 != 0) goto L42
            goto L56
        L42:
            java.lang.String r0 = r6.getLanguage()
            r0.getClass()
            pxc r2 = new pxc
            java.lang.String r3 = "\\p{Alpha}{2,8}"
            r2.<init>(r3)
            boolean r0 = r2.d(r0)
            if (r0 != 0) goto L59
        L56:
            java.lang.String r0 = "und"
            goto L8a
        L59:
            java.lang.String r0 = r6.getLanguage()
            java.lang.String r2 = "iw"
            boolean r0 = defpackage.wl7.b(r0, r2)
            if (r0 == 0) goto L68
            java.lang.String r0 = "he"
            goto L8a
        L68:
            java.lang.String r0 = r6.getLanguage()
            java.lang.String r2 = "in"
            boolean r0 = defpackage.wl7.b(r0, r2)
            if (r0 == 0) goto L77
            java.lang.String r0 = "id"
            goto L8a
        L77:
            java.lang.String r0 = r6.getLanguage()
            java.lang.String r2 = "ji"
            boolean r0 = defpackage.wl7.b(r0, r2)
            if (r0 == 0) goto L86
            java.lang.String r0 = "yi"
            goto L8a
        L86:
            java.lang.String r0 = r6.getLanguage()
        L8a:
            java.lang.String r2 = r6.getCountry()
            r2.getClass()
            pxc r3 = new pxc
            java.lang.String r4 = "\\p{Alpha}{2}|\\p{Digit}{3}"
            r3.<init>(r4)
            boolean r2 = r3.d(r2)
            if (r2 != 0) goto La0
            r2 = r1
            goto La4
        La0:
            java.lang.String r2 = r6.getCountry()
        La4:
            java.lang.String r3 = r6.getVariant()
            r3.getClass()
            pxc r4 = new pxc
            java.lang.String r5 = "\\p{Alnum}{5,8}|\\p{Digit}\\p{Alnum}{3}"
            r4.<init>(r5)
            boolean r3 = r4.d(r3)
            if (r3 != 0) goto Lb9
            goto Lbd
        Lb9:
            java.lang.String r1 = r6.getVariant()
        Lbd:
            defpackage.q6.m(r0, r2, r1)
            java.lang.String r6 = l(r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r03.p(java.util.Locale):java.lang.String");
    }

    public static final String[] q(jt2 jt2Var) {
        jt2Var.getClass();
        return (String[]) ((q60) jt2Var).b.toArray(new String[0]);
    }

    public static kq7 r() {
        return (kq7) cr8.p(kq7.class);
    }

    public static void s(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    public static void t(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        s(jArr, jArr4);
        s(jArr2, jArr5);
        u(jArr4[0], jArr5[0], jArr3, 0);
        u(jArr4[1], jArr5[1], jArr3, 1);
        u(jArr4[2], jArr5[2], jArr3, 2);
        u(jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        u(jArr4[1] ^ jArr4[0], jArr5[1] ^ jArr5[0], jArr3, 1);
        u(jArr4[3] ^ jArr4[2], jArr5[3] ^ jArr5[2], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        u(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        u(j, j3, jArr6, 0);
        u(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = (j5 ^ j6) ^ jArr3[3];
        jArr3[3] = j9;
        long j10 = (j6 ^ j7) ^ jArr3[4];
        jArr3[4] = j10;
        long j11 = j7 ^ jArr3[5];
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 59);
        jArr3[1] = (j13 >>> 5) ^ (j8 << 54);
        jArr3[2] = (j8 >>> 10) ^ (j9 << 49);
        jArr3[3] = (j9 >>> 15) ^ (j10 << 44);
        jArr3[4] = (j10 >>> 20) ^ (j11 << 39);
        jArr3[5] = (j11 >>> 25) ^ (j14 << 34);
        jArr3[6] = (j14 >>> 30) ^ (j15 << 29);
        jArr3[7] = j15 >>> 35;
    }

    public static void u(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (576460752303423487L & j7);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j7 >>> 59) ^ (j8 << 5));
    }

    public static void v(long[] jArr, long[] jArr2) {
        wab.j(0, jArr[0], jArr2);
        wab.j(2, jArr[1], jArr2);
        wab.j(4, jArr[2], jArr2);
        long j = jArr[3];
        jArr2[6] = wab.i((int) j);
        jArr2[7] = ((long) wab.h((int) (j >>> 32))) & 4294967295L;
    }

    public static void w(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        t(jArr, jArr2, jArr4);
        x(jArr4, jArr3);
    }

    public static void x(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = (j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33));
        long j14 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j15 = j11 >>> 41;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = (j15 << 10) ^ j13;
        jArr2[2] = j14;
        jArr2[3] = 2199023255551L & j11;
    }

    public static final hkd y(b bVar) {
        bVar.L(1967008021);
        Object[] objArr = new Object[0];
        Object objV = bVar.v();
        if (objV == b.a.a) {
            objV = new lz(19);
            bVar.p(objV);
        }
        hkd hkdVar = (hkd) ypd.N(objArr, hkd.e, (gu5) objV, bVar, 384);
        hkdVar.c = (ikd) bVar.M(kkd.a);
        bVar.F();
        return hkdVar;
    }

    public static void z(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        v(jArr, jArr3);
        x(jArr3, jArr2);
    }

    @Override // defpackage.o55
    public void b(zxd zxdVar) {
    }

    @Override // defpackage.wo1
    public long c() {
        return 9205357640488583168L;
    }

    @Override // defpackage.wo1
    public iy3 getDensity() {
        return X;
    }

    @Override // defpackage.wo1
    public vl8 getLayoutDirection() {
        return W;
    }

    @Override // defpackage.o55
    public void m() {
    }

    @Override // defpackage.o55
    public zpf o(int i, int i2) {
        return new u54();
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 8:
                List<svh<?>> list = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zzm());
            case DatadogLogGenerator.CRASH /* 9 */:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((vgi) wgi.b.zza()).zzb());
            default:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((eji) fji.b.zza()).zza());
        }
    }
}
