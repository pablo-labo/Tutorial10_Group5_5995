package defpackage;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.foundation.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.R;
import defpackage.j29;
import defpackage.o7d;
import defpackage.qsg;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@fd8
public class pnb implements nvh, vn9 {
    public static Boolean X;
    public static Boolean Y;
    public static Boolean Z;
    public static Boolean a0;
    public static final ah2 b;
    public static final ux0 b0;
    public static final ah2 c;
    public static final ux0 c0;
    public static final ux0 d0;
    public static final ux0 e0;
    public static final ux0 f0;
    public static final ux0 i0;
    public static Field m0;
    public static boolean n0;
    public final /* synthetic */ int a;
    public static final String[] d = {"best fit", "lookup"};
    public static final String[] e = {"base", "accent", "case", "variant"};
    public static final String[] f = {"upper", "lower", "false"};
    public static final String[] V = {"sort", "search"};
    public static final azc W = azc.a;
    public static final qr4 g0 = new qr4(false);
    public static final qr4 h0 = new qr4(true);
    public static final pnb j0 = new pnb(8);
    public static final pnb k0 = new pnb(9);
    public static final pnb l0 = new pnb(10);

    static {
        byte b2 = 0;
        b = new ah2(-2060663917, new gh2(b2), false);
        c = new ah2(-1554928877, new dm0(2, b2), false);
        int i = 4;
        b0 = new ux0("COMPLETING_ALREADY", i);
        c0 = new ux0("COMPLETING_WAITING_CHILDREN", i);
        d0 = new ux0("COMPLETING_RETRY", i);
        e0 = new ux0("TOO_LATE_TO_CANCEL", i);
        f0 = new ux0("SEALED", i);
        i0 = new ux0("NO_OWNER", i);
    }

    public pnb(jia jiaVar) {
        this.a = 18;
    }

    public static Drawable A(Context context, int i) {
        return w5d.b().c(context, i);
    }

    public static final qpd B(ComponentCallbacks componentCallbacks) {
        componentCallbacks.getClass();
        if (componentCallbacks instanceof o90) {
            return ((o90) componentCallbacks).d();
        }
        if (componentCallbacks instanceof ai8) {
            return ((ai8) componentCallbacks).d();
        }
        if (componentCallbacks instanceof xh8) {
            return (qpd) ((xh8) componentCallbacks).getKoin().a.b;
        }
        vh8 vh8Var = web.d;
        if (vh8Var != null) {
            return (qpd) vh8Var.a.b;
        }
        r6.g("KoinApplication has not been started");
        return null;
    }

    public static final mgb C(View view) {
        mgb mgbVar = (mgb) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (mgbVar != null) {
            return mgbVar;
        }
        mgb mgbVar2 = new mgb();
        view.setTag(R.id.pooling_container_listener_holder_tag, mgbVar2);
        return mgbVar2;
    }

    public static final boolean D(ui8 ui8Var) {
        ui8Var.getClass();
        p7g p7gVarP0 = ui8Var.P0();
        if (p7gVarP0 instanceof hx4) {
            return true;
        }
        return (p7gVarP0 instanceof jh5) && (((jh5) p7gVarP0).T0() instanceof hx4);
    }

    public static final boolean E(pm8 pm8Var) {
        if (pm8Var.V == null) {
            return false;
        }
        pm8 pm8VarK = pm8Var.K();
        return (pm8VarK != null ? pm8VarK.V : null) == null || pm8Var.u0.b;
    }

    @TargetApi(26)
    public static boolean F(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (X == null) {
            X = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        X.booleanValue();
        if (Y == null) {
            Y = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return Y.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static final long G(long j, long j2, float f2) {
        qpa qpaVar = ya2.x;
        long jA = da2.a(j, qpaVar);
        long jA2 = da2.a(j2, qpaVar);
        float fD = da2.d(jA);
        float fH = da2.h(jA);
        float fG = da2.g(jA);
        float fE = da2.e(jA);
        float fD2 = da2.d(jA2);
        float fH2 = da2.h(jA2);
        float fG2 = da2.g(jA2);
        float fE2 = da2.e(jA2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return da2.a(j(w74.t(fH, fH2, f2), w74.t(fG, fG2, f2), w74.t(fE, fE2, f2), w74.t(fD, fD2, f2), qpaVar), da2.f(j2));
    }

    public static final ko2 H(Function2 function2, Function1 function1) {
        lr lrVar = new lr(function2, 7);
        function1.getClass();
        pxf.d(1, function1);
        return new ko2(lrVar, function1);
    }

    public static final void I() {
        qmc qmcVar = ie7.g0;
        Pair pair = new Pair(Boolean.TRUE, "");
        boolean zBooleanValue = ((Boolean) pair.a()).booleanValue();
        String str = (String) pair.b();
        if (!zBooleanValue) {
            akb.n(str);
            return;
        }
        int iOrdinal = W.ordinal();
        int i = 20;
        if (iOrdinal == 0) {
            qmcVar.c(new tmc(i));
        } else if (iOrdinal == 1) {
            qmcVar.c(new smc(i));
        } else {
            if (iOrdinal != 2) {
                l.g();
                return;
            }
            qmcVar.c(new umc(i));
        }
        jq3.a();
    }

    public static final float J(long j) {
        ta2 ta2VarF = da2.f(j);
        if (!ka2.v(ta2VarF.b, 12884901888L)) {
            zd7.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ka2.J(ta2VarF.b)));
        }
        yk3 yk3Var = ((abd) ta2VarF).p;
        double dF = yk3Var.f(da2.h(j));
        float f2 = (float) ((yk3Var.f(da2.e(j)) * 0.0722d) + (yk3Var.f(da2.g(j)) * 0.7152d) + (dF * 0.2126d));
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    public static final zrd L(int i, int i2, b bVar) {
        final int i3 = 0;
        Object[] objArr = new Object[0];
        boolean z = (((i & 14) ^ 6) > 4 && bVar.d(0)) || (i & 6) == 4;
        Object objV = bVar.v();
        if (z || objV == b.a.a) {
            objV = new gu5() { // from class: trd
                @Override // defpackage.gu5
                public final Object invoke() {
                    return new zrd(i3);
                }
            };
            bVar.p(objV);
        }
        return (zrd) ypd.N(objArr, zrd.i, (gu5) objV, bVar, 0);
    }

    public static e M(e eVar, zrd zrdVar, boolean z) {
        return f.a(eVar, zrdVar, z ? dwa.a : dwa.b, true, false, null, zrdVar.c, true, null, null).o(new ScrollingLayoutElement(zrdVar, z));
    }

    public static final boolean N(qsg qsgVar, qsg qsgVar2, zz8 zz8Var) {
        qsgVar.getClass();
        zz8Var.getClass();
        if (qsgVar2 == null) {
            return true;
        }
        if ((qsgVar2 instanceof qsg.b) && (qsgVar instanceof qsg.a)) {
            return true;
        }
        if ((qsgVar instanceof qsg.b) && (qsgVar2 instanceof qsg.a)) {
            return false;
        }
        return (qsgVar.c == qsgVar2.c && qsgVar.d == qsgVar2.d && qsgVar2.a(zz8Var) <= qsgVar.a(zz8Var)) ? false : true;
    }

    public static final int O(z2a z2aVar) {
        int iA;
        int i = z2aVar.b;
        int iA2 = z2aVar.a(0);
        while (z2aVar.b != 0 && z2aVar.a(0) == iA2) {
            z2aVar.f(0, z2aVar.b());
            z2aVar.e(z2aVar.b - 1);
            int i2 = z2aVar.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iA3 = z2aVar.a(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iA4 = z2aVar.a(i6);
                if (i5 >= i2 || (iA = z2aVar.a(i5)) <= iA4) {
                    if (iA4 > iA3) {
                        z2aVar.f(i4, iA4);
                        z2aVar.f(i6, iA3);
                        i4 = i6;
                    }
                } else if (iA > iA3) {
                    z2aVar.f(i4, iA);
                    z2aVar.f(i5, iA3);
                    i4 = i5;
                }
            }
        }
        return iA2;
    }

    public static final int P(long j) {
        float[] fArr = ya2.a;
        return (int) (da2.a(j, ya2.e) >>> 32);
    }

    public static final p63 Q(Bundle bundle, jrg jrgVar) {
        Object aVar;
        if (bundle.keySet().isEmpty()) {
            return null;
        }
        try {
            u2a u2aVar = new u2a((Object) null);
            LinkedHashMap linkedHashMap = u2aVar.a;
            linkedHashMap.put(wkd.c, bundle);
            linkedHashMap.put(wkd.b, jrgVar);
            linkedHashMap.put(wkd.a, (dld) jrgVar);
            aVar = u2aVar;
        } catch (Throwable th) {
            aVar = new o7d.a(th);
        }
        return (p63) (aVar instanceof o7d.a ? null : aVar);
    }

    public static final Object R(Object obj) {
        b77 b77Var;
        c77 c77Var = obj instanceof c77 ? (c77) obj : null;
        return (c77Var == null || (b77Var = c77Var.a) == null) ? obj : b77Var;
    }

    public static e S(e eVar, zrd zrdVar) {
        return M(eVar, zrdVar, true);
    }

    public static byf T(byf byfVar) {
        if (!(byfVar instanceof ka7)) {
            return new ox1(byfVar);
        }
        ka7 ka7Var = (ka7) byfVar;
        rxf[] rxfVarArr = ka7Var.b;
        ArrayList<Pair> arrayListJ0 = ut0.J0(ka7Var.c, rxfVarArr);
        ArrayList arrayList = new ArrayList(t92.r0(arrayListJ0, 10));
        for (Pair pair : arrayListJ0) {
            arrayList.add(y((wxf) pair.d(), (rxf) pair.e()));
        }
        return new ka7(rxfVarArr, (wxf[]) arrayList.toArray(new wxf[0]), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long b(float r21, float r22, float r23, float r24, defpackage.ta2 r25) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnb.b(float, float, float, float, ta2):long");
    }

    public static final long d(int i) {
        long j = ((long) i) << 32;
        int i2 = da2.j;
        return j;
    }

    public static final long f(int i, int i2, int i3, int i4) {
        return d(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long g(long j) {
        long j2 = j << 32;
        int i = da2.j;
        return j2;
    }

    public static a5a i() {
        return new a5a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long j(float r17, float r18, float r19, float r20, defpackage.ta2 r21) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnb.j(float, float, float, float, ta2):long");
    }

    public static final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e8h e8hVar = (e8h) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", e8hVar.a());
            bundle.putLong("event_timestamp", e8hVar.b());
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final String l(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(ut0.t0(parameterTypes, "", "(", ")", rl2.d, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(wuc.b(returnType));
        return sb.toString();
    }

    public static final void m(z2a z2aVar, int i) {
        if (z2aVar.b == 0 || !(z2aVar.a(0) == i || z2aVar.a(z2aVar.b - 1) == i)) {
            int i2 = z2aVar.b;
            z2aVar.c(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iA = z2aVar.a(i3);
                if (i <= iA) {
                    break;
                }
                z2aVar.f(i2, iA);
                i2 = i3;
            }
            z2aVar.f(i2, i);
        }
    }

    public static String n(int i, int i2, String str) {
        if (i < 0) {
            return hh1.H("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return hh1.H("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        l5.q(p6.c(i2, "negative size: "));
        return null;
    }

    public static final void o(View view) {
        view.getClass();
        s6e s6eVarW = q92.w(new mqg(view, null));
        while (s6eVarW.hasNext()) {
            ArrayList<lgb> arrayList = C((View) s6eVarW.next()).a;
            for (int iJ = u63.J(arrayList); -1 < iJ; iJ--) {
                arrayList.get(iJ).a();
            }
        }
    }

    public static void p(String str, boolean z) {
        if (z) {
            return;
        }
        l5.q(str);
    }

    public static void q(boolean z, String str, long j) {
        if (z) {
            return;
        }
        l5.q(hh1.H(str, Long.valueOf(j)));
    }

    public static final void r(TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            return;
        }
        l5.q("Attribute not defined in set.");
    }

    public static void s(int i, int i2) {
        String strH;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strH = hh1.H("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    l5.q(p6.c(i2, "negative size: "));
                    return;
                }
                strH = hh1.H("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static void t(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ja.k(str);
    }

    public static void u(int i, int i2) {
        if (i < 0 || i > i2) {
            l5.s(n(i, i2, "index"));
        }
    }

    public static void v(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? n(i, i3, "start index") : (i2 < 0 || i2 > i3) ? n(i2, i3, "end index") : hh1.H("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void w(String str, boolean z) {
        if (z) {
            return;
        }
        r6.g(str);
    }

    public static final long x(long j, long j2) {
        float f2;
        float f3;
        long jA = da2.a(j, da2.f(j2));
        float fD = da2.d(j2);
        float fD2 = da2.d(jA);
        float f4 = 1.0f - fD2;
        float f5 = (fD * f4) + fD2;
        float fH = da2.h(jA);
        float fH2 = da2.h(j2);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fH2 * fD) * f4) + (fH * fD2)) / f5;
        }
        float fG = da2.g(jA);
        float fG2 = da2.g(j2);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fG2 * fD) * f4) + (fG * fD2)) / f5;
        }
        float fE = da2.e(jA);
        float fE2 = da2.e(j2);
        if (f5 != 0.0f) {
            f6 = (((fE2 * fD) * f4) + (fE * fD2)) / f5;
        }
        return j(f2, f3, f6, f5, da2.f(j2));
    }

    public static final wxf y(wxf wxfVar, rxf rxfVar) {
        if (rxfVar == null || wxfVar.c() == ylg.INVARIANT) {
            return wxfVar;
        }
        int i = 0;
        if (rxfVar.z() != wxfVar.c()) {
            mx1 mx1Var = new mx1(wxfVar);
            gwf.b.getClass();
            return new yxf(new ix1(wxfVar, mx1Var, false, gwf.c));
        }
        if (!wxfVar.b()) {
            return new yxf(wxfVar.getType());
        }
        j29.a aVar = j29.e;
        aVar.getClass();
        return new yxf(new tt8(aVar, new nx1(wxfVar, i)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList z(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            g6d$b r1 = new g6d$b
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.g6d.c
            monitor-enter(r2)
            java.util.WeakHashMap<g6d$b, android.util.SparseArray<g6d$a>> r3 = defpackage.g6d.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            g6d$a r5 = (g6d.a) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal<android.util.TypedValue> r2 = defpackage.g6d.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.za2.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = defpackage.g6d.c
            monitor-enter(r2)
            java.util.WeakHashMap<g6d$b, android.util.SparseArray<g6d$a>> r0 = defpackage.g6d.b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            g6d$a r0 = new g6d$a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnb.z(android.content.Context, int):android.content.res.ColorStateList");
    }

    public void K(int i) {
        synchronized (this) {
        }
    }

    @Override // defpackage.vn9
    public void a(Object obj) {
    }

    @Override // defpackage.vn9
    public void c(Object obj) {
    }

    @Override // defpackage.vn9
    public void e(Object obj) {
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 8:
                List<svh<?>> list = djh.a;
                return Integer.valueOf((int) ((qhi) nhi.b.zza()).zza());
            case DatadogLogGenerator.CRASH /* 9 */:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((ogi) lgi.b.zza()).zzb());
            default:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((xei) pei.b.zza()).zzb());
        }
    }

    public /* synthetic */ pnb(int i) {
        this.a = i;
    }
}
