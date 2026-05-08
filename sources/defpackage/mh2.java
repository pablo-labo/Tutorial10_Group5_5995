package defpackage;

import android.app.Dialog;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.navigation.e;
import androidx.navigation.fragment.NavHostFragment;
import com.airbnb.lottie.parser.moshi.a;
import com.apollographql.apollo.exception.NullOrMissingField;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes3.dex */
public final class mh2 implements tme, tlg, nvh, zs4, hna {
    public static final ux0 V;
    public static final ux0 W;
    public static final mh2 X;
    public static final mh2 Y;
    public static final mh2 Z;
    public static final mh2 a0;
    public static final ah2 b;
    public static final ko2 b0;
    public static final ah2 c;
    public static final int[] c0;
    public static final ah2 d;
    public static final int[] d0;
    public static final ah2 e;
    public static final int[] e0;
    public static final ah2 f;
    public static final mh2 f0;
    public static final mh2 g0;
    public static final mh2 h0;
    public static final mh2 i0;
    public static final mh2 j0;
    public final /* synthetic */ int a;

    static {
        byte b2 = 0;
        b = new ah2(-798386342, new kh2(b2), false);
        new ah2(2018195671, new lh2(b2, b2), false);
        c = new ah2(440708022, new di2(b2), false);
        int i = 1;
        d = new ah2(1238391450, new lh2(i, b2), false);
        e = new ah2(-1298754931, new kh2(i), false);
        f = new ah2(-752362290, new lh2(2, b2), false);
        int i2 = 4;
        V = new ux0("UNDEFINED", i2);
        W = new ux0("REUSABLE_CLAIMED", i2);
        X = new mh2(i2);
        Y = new mh2(5);
        Z = new mh2(6);
        a0 = new mh2(7);
        int i3 = 12;
        b0 = new ko2(new mj2(i3, b2), new gb(9));
        c0 = new int[]{-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
        d0 = new int[]{1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
        e0 = new int[]{-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};
        f0 = new mh2(10);
        g0 = new mh2(11);
        h0 = new mh2(i3);
        i0 = new mh2(13);
        j0 = new mh2(14);
    }

    public mh2() {
        this.a = 17;
        new LinkedHashSet(20);
    }

    public static void A(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[24];
        v1.p0(iArr, iArr3);
        t(iArr3, iArr2);
    }

    public static void B(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[24];
        v1.p0(iArr, iArr3);
        t(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            v1.p0(iArr2, iArr3);
            t(iArr3, iArr2);
        }
    }

    public static void C(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ka6.l1(12, iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = (((long) iArr3[1]) & 4294967295L) + 1 + (j >> 32);
            iArr3[1] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j3 = j4 >> 32;
            }
            long j5 = ((((long) iArr3[3]) & 4294967295L) - 1) + j3;
            iArr3[3] = (int) j5;
            long j6 = ((4294967295L & ((long) iArr3[4])) - 1) + (j5 >> 32);
            iArr3[4] = (int) j6;
            if ((j6 >> 32) != 0) {
                ka6.U(12, 5, iArr3);
            }
        }
    }

    public static final void D(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            de7.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        de7.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static void e(dqa dqaVar, zv8 zv8Var, Function1 function1, int i) {
        if ((i & 1) != 0) {
            zv8Var = null;
        }
        dqaVar.getClass();
        gqa gqaVar = new gqa(function1);
        if (zv8Var != null) {
            dqaVar.a(zv8Var, gqaVar);
        } else {
            dqaVar.b(gqaVar);
        }
    }

    public static void f(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = ((((long) iArr[1]) & 4294967295L) - 1) + (j >> 32);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = (((long) iArr[3]) & 4294967295L) + 1 + j3;
        iArr[3] = (int) j5;
        long j6 = (4294967295L & ((long) iArr[4])) + 1 + (j5 >> 32);
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            ka6.t0(12, 5, iArr);
        }
    }

    public static final boolean g(yeb yebVar) {
        return !yebVar.h && yebVar.d;
    }

    public static final boolean h(yeb yebVar) {
        return (yebVar.b() || !yebVar.h || yebVar.d) ? false : true;
    }

    public static final boolean i(yeb yebVar) {
        return yebVar.h && !yebVar.d;
    }

    public static void j(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            l5.q(l5.m("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }

    public static final e k(Fragment fragment) {
        Dialog dialog;
        Window window;
        fragment.getClass();
        for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment) parentFragment).D();
            }
            Fragment fragment2 = parentFragment.getParentFragmentManager().y;
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).D();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return mca.b(view);
        }
        f fVar = fragment instanceof f ? (f) fragment : null;
        View decorView = (fVar == null || (dialog = fVar.a0) == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            return mca.b(decorView);
        }
        r6.g(s6.d("Fragment ", fragment, " does not have a NavController set"));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0135 A[PHI: r4
  0x0135: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v6 int) binds: [B:43:0x00d2, B:46:0x00d7, B:49:0x00f6, B:50:0x00f8, B:51:0x00fa, B:62:0x0151, B:59:0x0142, B:55:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList l(java.util.ArrayList r22, float r23) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh2.l(java.util.ArrayList, float):java.util.ArrayList");
    }

    public static final String m(yd8 yd8Var, a9c a9cVar, a9c a9cVar2) {
        String value;
        yd8Var.getClass();
        a9cVar2.getClass();
        if (a9cVar == null || (value = a9cVar.getValue()) == null) {
            value = "";
        }
        return zd8.a(yd8Var) + ':' + value + ':' + a9cVar2;
    }

    public static final boolean n(yeb yebVar, long j, long j2) {
        int i = yebVar.i == 1 ? 1 : 0;
        long j3 = yebVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f2 = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float f3 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f2;
        return (fIntBitsToFloat > f3) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final void o(rx9 rx9Var) {
        web webVar = web.c;
        synchronized (webVar) {
            webVar.o().a(u63.Z(rx9Var), true);
            j6g j6gVar = j6g.a;
        }
    }

    public static String p(String str) {
        str.getClass();
        return zve.L(str, "Other, please specific", false) ? "other" : zve.L(str, "not actively looking", false) ? "notActivelyLooking" : zve.L(str, "Company is not a good fit", false) ? "company" : zve.L(str, "Industry is not a good fit", false) ? "industry" : zve.L(str, "location is not a good fit", false) ? "location" : zve.L(str, "Position is not a good fit", false) ? "jobContent" : zve.L(str, "Salary", false) ? "salary" : zve.L(str, "fake/spam", false) ? "spam" : "other";
    }

    public static final void q(mb8 mb8Var, String str) {
        mb8Var.getClass();
        StringBuilder sbM = akb.m("Field '", str, "' is missing or null at path ");
        sbM.append(mb8Var.c());
        throw new NullOrMissingField(sbM.toString(), null);
    }

    public static void r(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[24];
        v1.h0(iArr, iArr2, iArr4);
        t(iArr4, iArr3);
    }

    public static final long s(yeb yebVar, boolean z) {
        long jE = ooa.e(yebVar.c, yebVar.g);
        if (z || !yebVar.b()) {
            return jE;
        }
        return 0L;
    }

    public static void t(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[16]) & 4294967295L;
        long j2 = ((long) iArr[17]) & 4294967295L;
        long j3 = ((long) iArr[18]) & 4294967295L;
        long j4 = ((long) iArr[19]) & 4294967295L;
        long j5 = ((long) iArr[20]) & 4294967295L;
        long j6 = ((long) iArr[21]) & 4294967295L;
        long j7 = ((long) iArr[22]) & 4294967295L;
        long j8 = ((long) iArr[23]) & 4294967295L;
        long j9 = ((((long) iArr[12]) & 4294967295L) + j5) - 1;
        long j10 = (((long) iArr[13]) & 4294967295L) + j7;
        long j11 = (((long) iArr[14]) & 4294967295L) + j7 + j8;
        long j12 = (((long) iArr[15]) & 4294967295L) + j8;
        long j13 = j2 + j6;
        long j14 = j6 - j8;
        long j15 = j7 - j8;
        long j16 = j9 + j14;
        long j17 = (((long) iArr[0]) & 4294967295L) + j16;
        iArr2[0] = (int) j17;
        long j18 = (((((long) iArr[1]) & 4294967295L) + j8) - j9) + j10 + (j17 >> 32);
        iArr2[1] = (int) j18;
        long j19 = (((((long) iArr[2]) & 4294967295L) - j6) - j10) + j11 + (j18 >> 32);
        iArr2[2] = (int) j19;
        long j20 = ((((long) iArr[3]) & 4294967295L) - j11) + j12 + j16 + (j19 >> 32);
        iArr2[3] = (int) j20;
        long j21 = (((((((long) iArr[4]) & 4294967295L) + j) + j6) + j10) - j12) + j16 + (j20 >> 32);
        iArr2[4] = (int) j21;
        long j22 = ((((long) iArr[5]) & 4294967295L) - j) + j10 + j11 + j13 + (j21 >> 32);
        iArr2[5] = (int) j22;
        long j23 = (((((long) iArr[6]) & 4294967295L) + j3) - j2) + j11 + j12 + (j22 >> 32);
        iArr2[6] = (int) j23;
        long j24 = ((((((long) iArr[7]) & 4294967295L) + j) + j4) - j3) + j12 + (j23 >> 32);
        iArr2[7] = (int) j24;
        long j25 = (((((((long) iArr[8]) & 4294967295L) + j) + j2) + j5) - j4) + (j24 >> 32);
        iArr2[8] = (int) j25;
        long j26 = (((((long) iArr[9]) & 4294967295L) + j3) - j5) + j13 + (j25 >> 32);
        iArr2[9] = (int) j26;
        long j27 = ((((((long) iArr[10]) & 4294967295L) + j3) + j4) - j14) + j15 + (j26 >> 32);
        iArr2[10] = (int) j27;
        long j28 = ((((((long) iArr[11]) & 4294967295L) + j4) + j5) - j15) + (j27 >> 32);
        iArr2[11] = (int) j28;
        u((int) ((j28 >> 32) + 1), iArr2);
    }

    public static void u(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = ((((long) iArr[1]) & 4294967295L) - j2) + (j3 >> 32);
            iArr[1] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = (((long) iArr[3]) & 4294967295L) + j2 + j5;
            iArr[3] = (int) j7;
            long j8 = (4294967295L & ((long) iArr[4])) + j2 + (j7 >> 32);
            iArr[4] = (int) j8;
            j = j8 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || ka6.t0(12, 5, iArr) == 0) && !(iArr[11] == -1 && ka6.o0(12, iArr, c0))) {
            return;
        }
        f(iArr);
    }

    public static Float v(ou8 ou8Var, float f2) {
        if (ou8Var == null) {
            return null;
        }
        int iOrdinal = ou8Var.b.ordinal();
        if (iOrdinal == 0) {
            return Float.valueOf(nn2.G(ou8Var.a(0.0f)) / f2);
        }
        if (iOrdinal == 1) {
            return Float.valueOf(ou8Var.a(1.0f));
        }
        l.g();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #1 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008f, B:23:0x006b, B:25:0x0079, B:30:0x0086, B:32:0x008c, B:38:0x009c, B:41:0x00a5, B:40:0x00a2, B:28:0x007f), top: B:52:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void w(defpackage.lu2 r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof defpackage.v64
            if (r0 == 0) goto Lb0
            v64 r9 = (defpackage.v64) r9
            y03 r0 = r9.d
            pu2 r1 = r9.e
            java.lang.Throwable r2 = defpackage.o7d.a(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            rf2 r3 = new rf2
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            v03 r2 = r1.getContext()
            boolean r2 = z(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.f = r3
            r9.c = r4
            v03 r10 = r1.getContext()
            y(r0, r10, r9)
            return
        L2f:
            d05 r0 = defpackage.ukf.a()
            long r5 = r0.c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.f = r3
            r9.c = r4
            r0.L1(r9)
            goto Laa
        L46:
            r0.O1(r4)
            v03 r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            ex7$a r3 = ex7.a.a     // Catch: java.lang.Throwable -> L69
            v03$a r2 = r2.h1(r3)     // Catch: java.lang.Throwable -> L69
            ex7 r2 = (defpackage.ex7) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.isActive()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r2.G()     // Catch: java.lang.Throwable -> L69
            o7d$a r10 = defpackage.r7d.a(r10)     // Catch: java.lang.Throwable -> L69
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L69
            goto L8f
        L69:
            r10 = move-exception
            goto La6
        L6b:
            java.lang.Object r2 = r9.V     // Catch: java.lang.Throwable -> L69
            v03 r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = defpackage.rkf.c(r3, r2)     // Catch: java.lang.Throwable -> L69
            ux0 r5 = defpackage.rkf.a     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            z5g r5 = defpackage.x03.c(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r10)     // Catch: java.lang.Throwable -> L99
            j6g r10 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L99
            if (r5 == 0) goto L8c
            boolean r10 = r5.p0()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8f
        L8c:
            defpackage.rkf.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8f:
            boolean r10 = r0.S1()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8f
        L95:
            r0.J1(r4)
            goto Laa
        L99:
            r10 = move-exception
            if (r5 == 0) goto La2
            boolean r1 = r5.p0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La5
        La2:
            defpackage.rkf.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        La5:
            throw r10     // Catch: java.lang.Throwable -> L69
        La6:
            r9.h(r10)     // Catch: java.lang.Throwable -> Lab
            goto L95
        Laa:
            return
        Lab:
            r9 = move-exception
            r0.J1(r4)
            throw r9
        Lb0:
            r9.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh2.w(lu2, java.lang.Object):void");
    }

    public static final ph7 x(qtc qtcVar) {
        return new ph7(Math.round(qtcVar.a), Math.round(qtcVar.b), Math.round(qtcVar.c), Math.round(qtcVar.d));
    }

    public static final void y(y03 y03Var, v03 v03Var, Runnable runnable) {
        try {
            y03Var.v1(v03Var, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, y03Var, v03Var);
        }
    }

    public static final boolean z(y03 y03Var, v03 v03Var) throws DispatchException {
        try {
            return y03Var.A1(v03Var);
        } catch (Throwable th) {
            throw new DispatchException(th, y03Var, v03Var);
        }
    }

    @Override // defpackage.tlg
    public Object a(a aVar, float f2) {
        return ec8.b(aVar, f2);
    }

    @Override // defpackage.hna
    public Object b() {
        return new TreeMap();
    }

    @Override // defpackage.zs4
    public boolean d(Object obj, File file, ova ovaVar) throws Throwable {
        try {
            pr1.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e2) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e2);
            return false;
        }
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 10:
                List<svh<?>> list = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).k());
            case 11:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((jgi) kgi.b.zza()).zza());
            case 12:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((dji) aji.b.zza()).zza());
            case 13:
                List<svh<?>> list4 = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).g());
            default:
                List<svh<?>> list5 = djh.a;
                return Boolean.valueOf(((pgi) qgi.b.zza()).zzc());
        }
    }

    public /* synthetic */ mh2(int i) {
        this.a = i;
    }
}
