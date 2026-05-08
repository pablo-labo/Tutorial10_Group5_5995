package defpackage;

import android.database.SQLException;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.soloader.SoLoader;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes.dex */
@fd8
public class zkd implements hme, nvh, md9, j2f, b82 {
    public static final ah2 b;
    public static volatile boolean b0;
    public static final ah2 c;
    public static String c0;
    public final /* synthetic */ int a;
    public static final Object d = new Object();
    public static final String[] e = {"POST", "PUT", "PATCH"};
    public static final zkd f = new zkd(6);
    public static final StackTraceElement[] V = new StackTraceElement[0];
    public static final zkd W = new zkd(8);
    public static final int[] X = {-1, -1, -1, -3};
    public static final int[] Y = {1, 0, 0, 4, -2, -1, 3, -4};
    public static final int[] Z = {-1, -1, -1, -5, 1, 0, -4, 3};
    public static final zkd a0 = new zkd(10);

    static {
        byte b2 = 0;
        b = new ah2(346164131, new gm0(1, b2), false);
        c = new ah2(1522980596, new gm0(3, b2), false);
    }

    public /* synthetic */ zkd(int i) {
        this.a = i;
    }

    public static final int A(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final Bundle B(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        l5.q(l5.m("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static final int C(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        serialDescriptorArr.getClass();
        int iHashCode = (serialDescriptor.getA().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        ct0 ct0Var = new ct0(serialDescriptor);
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!ct0Var.hasNext()) {
                break;
            }
            int i2 = i * 31;
            String strI = ((SerialDescriptor) ct0Var.next()).getA();
            if (strI != null) {
                iHashCode3 = strI.hashCode();
            }
            i = i2 + iHashCode3;
        }
        ct0 ct0Var2 = new ct0(serialDescriptor);
        while (ct0Var2.hasNext()) {
            int i3 = iHashCode2 * 31;
            m7e m7eVarF = ((SerialDescriptor) ct0Var2.next()).f();
            iHashCode2 = i3 + (m7eVarF != null ? m7eVarF.hashCode() : 0);
        }
        return (((iHashCode * 31) + i) * 31) + iHashCode2;
    }

    @Pure
    public static void D(String str, String str2) {
        synchronized (d) {
            Log.i(str, t(str2, null));
        }
    }

    public static final int E(ot0 ot0Var, Object obj, int i) {
        int i2 = ot0Var.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iA = pyd.a(i2, i, ot0Var.a);
            if (iA < 0 || wl7.b(obj, ot0Var.b[iA])) {
                return iA;
            }
            int i3 = iA + 1;
            while (i3 < i2 && ot0Var.a[i3] == i) {
                if (wl7.b(obj, ot0Var.b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iA - 1; i4 >= 0 && ot0Var.a[i4] == i; i4--) {
                if (wl7.b(obj, ot0Var.b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            q6.h();
            return 0;
        }
    }

    public static void F(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        h91.H(iArr, iArr2, iArr4);
        G(iArr4, iArr3);
    }

    public static void G(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        long j2 = ((long) iArr[1]) & 4294967295L;
        long j3 = ((long) iArr[2]) & 4294967295L;
        long j4 = ((long) iArr[3]) & 4294967295L;
        long j5 = ((long) iArr[4]) & 4294967295L;
        long j6 = ((long) iArr[5]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = ((long) iArr[7]) & 4294967295L;
        long j9 = j4 + j8;
        long j10 = j7 + (j8 << 1);
        long j11 = j6 + (j10 << 1);
        long j12 = j2 + j11;
        long j13 = j5 + (j11 << 1);
        long j14 = j + j13;
        iArr2[0] = (int) j14;
        long j15 = j12 + (j14 >>> 32);
        iArr2[1] = (int) j15;
        long j16 = j3 + j10 + (j15 >>> 32);
        iArr2[2] = (int) j16;
        long j17 = j9 + (j13 << 1) + (j16 >>> 32);
        iArr2[3] = (int) j17;
        H((int) (j17 >>> 32), iArr2);
    }

    public static void H(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = (4294967295L & ((long) iArr[3])) + (j << 1) + j3;
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    public static final Object I(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        if (!z) {
            if (r4 != null) {
                set = z92.E1(bbe.p(set, r4));
            }
            return z92.l1(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (wl7.b(r1, r2) && wl7.b(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }

    public static int J(int i, int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    l5.q(k20.l("[RNScreens] Invalid detentCount/index combination ", i2, i, " / "));
                    return 0;
                }
                if (i == -1) {
                    return 5;
                }
                if (i == 0) {
                    return 4;
                }
                if (i == 1) {
                    return 6;
                }
                if (i != 2) {
                    l5.q(k20.l("[RNScreens] Invalid detentCount/index combination ", i2, i, " / "));
                    return 0;
                }
            } else {
                if (i == -1) {
                    return 5;
                }
                if (i == 0) {
                    return 4;
                }
                if (i != 1) {
                    l5.q(k20.l("[RNScreens] Invalid detentCount/index combination ", i2, i, " / "));
                    return 0;
                }
            }
        } else {
            if (i == -1) {
                return 5;
            }
            if (i != 0) {
                l5.q(k20.l("[RNScreens] Invalid detentCount/index combination ", i2, i, " / "));
                return 0;
            }
        }
        return 3;
    }

    public static void K(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        h91.M(iArr, iArr3);
        G(iArr3, iArr2);
    }

    public static void L(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        h91.M(iArr, iArr3);
        G(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            h91.M(iArr2, iArr3);
            G(iArr3, iArr2);
        }
    }

    public static final void M() {
        if (b0) {
            return;
        }
        Trace.beginSection(jpf.g("FabricSoLoader"));
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.l("fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        Trace.endSection();
        b0 = true;
    }

    public static void N(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h91.O(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            iArr3[3] = (int) (((4294967295L & ((long) iArr3[3])) - 2) + j2);
        }
    }

    public static final void O(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final String P(SerialDescriptor serialDescriptor) {
        return z92.W0(nic.H(0, serialDescriptor.getC()), ", ", serialDescriptor.getA() + '(', ")", new fj(serialDescriptor, 12), 24);
    }

    public static final void Q(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Float f2, Integer num3) {
        bottomSheetBehavior.E = false;
        bottomSheetBehavior.D(false);
        if (num != null) {
            bottomSheetBehavior.H(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.G(num2.intValue());
        }
        if (f2 != null) {
            bottomSheetBehavior.E(f2.floatValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.C(num3.intValue());
        }
    }

    public static /* synthetic */ void R(BottomSheetBehavior bottomSheetBehavior, Integer num, Float f2, Integer num2, int i) {
        Integer num3 = (i & 1) != 0 ? null : 3;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            f2 = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        Q(bottomSheetBehavior, num3, num, f2, num2);
    }

    public static final void S(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3) {
        bottomSheetBehavior.E = false;
        bottomSheetBehavior.D(true);
        if (num != null) {
            bottomSheetBehavior.H(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.G(num2.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.k = num3.intValue();
        }
    }

    @Pure
    public static void T(String str, String str2) {
        synchronized (d) {
            Log.w(str, t(str2, null));
        }
    }

    @Pure
    public static void U(String str, String str2, Throwable th) {
        synchronized (d) {
            Log.w(str, t(str2, th));
        }
    }

    public static zg1 m(m07 m07Var, int i) {
        zg1 zg1Var = new zg1(m07Var, (((long) m07Var.getHeight()) & 4294967295L) | (((long) m07Var.getWidth()) << 32));
        zg1Var.W = i;
        return zg1Var;
    }

    @sy3
    public static final s5d n(int i, to5 to5Var, int i2) {
        po5[] po5VarArr = new po5[0];
        md2 md2Var = new md2(3);
        ArrayList arrayList = (ArrayList) md2Var.a;
        int i3 = to5Var.a;
        if (1 > i3 || i3 >= 1001) {
            be7.a("'wght' value must be in [1, 1000]. Actual: " + i3);
        }
        md2Var.b(new ro5(i3));
        float f2 = i2;
        if (0.0f > f2 || f2 > 1.0f) {
            be7.a("'ital' must be in 0.0f..1.0f. Actual: " + f2);
        }
        md2Var.b(new qo5(f2));
        md2Var.c(po5VarArr);
        return new s5d(i, to5Var, i2, new so5((po5[]) arrayList.toArray(new po5[arrayList.size()])));
    }

    public static s5d o(int i, to5 to5Var) {
        return new s5d(i, to5Var, 0, new so5(new po5[0]));
    }

    public static final void p(spg spgVar) {
        LinkedHashMap linkedHashMap = spgVar.d;
        Pair[] pairArr = {new Pair("borderColor", 8), new Pair("borderLeftColor", 0), new Pair("borderRightColor", 2), new Pair("borderTopColor", 1), new Pair("borderBottomColor", 3), new Pair("borderStartColor", 4), new Pair("borderEndColor", 5), new Pair("borderBlockColor", 9), new Pair("borderBlockEndColor", 10), new Pair("borderBlockStartColor", 11)};
        fs1 fs1Var = new fs1();
        for (int i = 0; i < 10; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.a();
            gs1 gs1Var = new gs1(fs1Var, pair.b());
            hb9 hb9Var = tf0.a;
            iwc iwcVar = fwc.a;
            rf0 rf0Var = (rf0) tf0.a.get(new Pair(iwcVar.b(Integer.class), Boolean.TRUE));
            if (rf0Var == null) {
                rf0Var = new rf0(new xp8(iwcVar.b(Integer.class), true, ep1.c), null);
            }
            linkedHashMap.put(str, new gn2(str, rf0Var, gs1Var));
        }
        String[] strArr = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"};
        ns1 ns1Var = new ns1();
        int i2 = 0;
        int i3 = 0;
        while (i2 < 7) {
            String str2 = strArr[i2];
            int i4 = i3 + 1;
            os1 os1Var = new os1(ns1Var, i3);
            hb9 hb9Var2 = tf0.a;
            iwc iwcVar2 = fwc.a;
            rf0 rf0Var2 = (rf0) tf0.a.get(new Pair(iwcVar2.b(Float.class), Boolean.TRUE));
            if (rf0Var2 == null) {
                rf0Var2 = new rf0(new xp8(iwcVar2.b(Float.class), true, ms1.a), null);
            }
            linkedHashMap.put(str2, new gn2(str2, rf0Var2, os1Var));
            i2++;
            i3 = i4;
        }
        String[] strArr2 = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"};
        is1 is1Var = new is1();
        int i5 = 0;
        int i6 = 0;
        while (i5 < 13) {
            String str3 = strArr2[i5];
            int i7 = i6 + 1;
            js1 js1Var = new js1(is1Var, i6);
            hb9 hb9Var3 = tf0.a;
            iwc iwcVar3 = fwc.a;
            rf0 rf0Var3 = (rf0) tf0.a.get(new Pair(iwcVar3.b(Float.class), Boolean.TRUE));
            if (rf0Var3 == null) {
                rf0Var3 = new rf0(new xp8(iwcVar3.b(Float.class), true, hs1.a), null);
            }
            linkedHashMap.put(str3, new gn2(str3, rf0Var3, js1Var));
            i5++;
            i6 = i7;
        }
        ls1 ls1Var = new ls1();
        hb9 hb9Var4 = tf0.a;
        iwc iwcVar4 = fwc.a;
        yd8 yd8VarB = iwcVar4.b(String.class);
        Boolean bool = Boolean.TRUE;
        Pair pair2 = new Pair(yd8VarB, bool);
        hb9 hb9Var5 = tf0.a;
        rf0 rf0Var4 = (rf0) hb9Var5.get(pair2);
        if (rf0Var4 == null) {
            rf0Var4 = new rf0(new xp8(iwcVar4.b(String.class), true, ks1.b), null);
        }
        linkedHashMap.put("borderStyle", new gn2("borderStyle", rf0Var4, ls1Var));
        es1 es1Var = new es1();
        rf0 rf0Var5 = (rf0) hb9Var5.get(new Pair(iwcVar4.b(Integer.class), bool));
        if (rf0Var5 == null) {
            rf0Var5 = new rf0(new xp8(iwcVar4.b(Integer.class), true, ds1.a), null);
        }
        linkedHashMap.put("backgroundColor", new gn2("backgroundColor", rf0Var5, es1Var));
        qs1 qs1Var = new qs1();
        rf0 rf0Var6 = (rf0) hb9Var5.get(new Pair(iwcVar4.b(ReadableArray.class), bool));
        if (rf0Var6 == null) {
            rf0Var6 = new rf0(new xp8(iwcVar4.b(ReadableArray.class), true, ps1.b), null);
        }
        linkedHashMap.put("boxShadow", new gn2("boxShadow", rf0Var6, qs1Var));
    }

    public static final WritableMap q(Rect rect) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", nn2.C(rect.left));
        writableMapCreateMap.putDouble("y", nn2.C(rect.top));
        writableMapCreateMap.putDouble("width", nn2.C(rect.width()));
        writableMapCreateMap.putDouble("height", nn2.C(rect.height()));
        return writableMapCreateMap;
    }

    public static void r(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        int i = (int) j4;
        iArr3[3] = i;
        if (((int) (j4 >>> 32)) != 0 || ((i >>> 1) >= 2147483646 && h91.y(iArr3, X))) {
            s(iArr3);
        }
    }

    public static void s(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) ((4294967295L & ((long) iArr[3])) + 2 + j2);
    }

    @Pure
    public static String t(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (d) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbG = h5.g(str, "\n  ");
        sbG.append(strReplace.replace("\n", "\n  "));
        sbG.append('\n');
        return sbG.toString();
    }

    @Pure
    public static void u(String str, String str2) {
        synchronized (d) {
            Log.d(str, t(str2, null));
        }
    }

    @Pure
    public static void v(String str, String str2, Exception exc) {
        synchronized (d) {
            Log.d(str, t(str2, exc));
        }
    }

    @Pure
    public static void w(String str, String str2) {
        synchronized (d) {
            Log.e(str, t(str2, null));
        }
    }

    @Pure
    public static void x(String str, String str2, Throwable th) {
        synchronized (d) {
            Log.e(str, t(str2, th));
        }
    }

    public static final void y(zhd zhdVar, String str) {
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.M1();
            pi3.d(iidVarQ1, null);
        } finally {
        }
    }

    public static final int z(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    @Override // defpackage.j2f
    public void a(t52 t52Var, ArrayList arrayList, mp8 mp8Var) {
        t52Var.getClass();
        mp8Var.getClass();
    }

    @Override // defpackage.j2f
    public ArrayList b(t52 t52Var, mp8 mp8Var) {
        t52Var.getClass();
        mp8Var.getClass();
        return new ArrayList();
    }

    @Override // defpackage.j2f
    public e4c c(t52 t52Var, e4c e4cVar, mp8 mp8Var) {
        e4cVar.getClass();
        mp8Var.getClass();
        return e4cVar;
    }

    @Override // defpackage.j2f
    public ArrayList d(t52 t52Var, mp8 mp8Var) {
        t52Var.getClass();
        mp8Var.getClass();
        return new ArrayList();
    }

    @Override // defpackage.j2f
    public void e(t52 t52Var, n8a n8aVar, ArrayList arrayList, mp8 mp8Var) {
        t52Var.getClass();
        n8aVar.getClass();
        mp8Var.getClass();
    }

    @Override // defpackage.j2f
    public void f(t52 t52Var, n8a n8aVar, ArrayList arrayList, mp8 mp8Var) {
        t52Var.getClass();
        n8aVar.getClass();
        mp8Var.getClass();
    }

    @Override // defpackage.b82
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.j2f
    public ArrayList i(t52 t52Var, mp8 mp8Var) {
        t52Var.getClass();
        mp8Var.getClass();
        return new ArrayList();
    }

    @Override // defpackage.hme
    public boolean k(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.j2f
    public void l(t52 t52Var, n8a n8aVar, iy8 iy8Var, mp8 mp8Var) {
        t52Var.getClass();
        n8aVar.getClass();
        mp8Var.getClass();
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nvh
    public Object zza() {
        List<svh<?>> list = djh.a;
        return Boolean.valueOf(((pgi) qgi.b.zza()).zzb());
    }
}
