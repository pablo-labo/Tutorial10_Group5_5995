package defpackage;

import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.s;
import androidx.navigation.u;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.i18n.phonenumbers.a;
import expo.modules.adapters.react.NativeModulesProxy;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class q92 implements jg2, nvh, jn6 {
    public static final w80 X;
    public static final w80 Y;
    public static final q92 Z;
    public static final long[] a0;
    public static final w80 b0;
    public static final ah2 c;
    public static final mvf c0;
    public static final mvf d0;
    public static final ux0 e;
    public static final mvf e0;
    public static final ux0 f;
    public static final mvf f0;
    public static final mvf g0;
    public static final mvf h0;
    public static final mvf i0;
    public static final mvf j0;
    public static final mvf k0;
    public static final q92 l0;
    public static final q92 m0;
    public static final q92 n0;
    public final /* synthetic */ int a;
    public static final Object[] b = new Object[0];
    public static final String[] d = {"application/pdf", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "text/plain", "text/rtf"};
    public static final int[] V = new int[2];
    public static final w80 W = new w80(1000);

    static {
        byte b2 = 0;
        c = new ah2(198847085, new bj2(b2, b2), false);
        int i = 4;
        e = new ux0("REMOVED_TASK", i);
        f = new ux0("CLOSED_EMPTY", i);
        new w80(1007);
        X = new w80(1008);
        Y = new w80(1002);
        Z = new q92(7);
        a0 = new long[]{-5270498306774157648L, 5270498306774195053L, 19634136210L};
        b0 = new w80(1022);
        int i2 = 14;
        int i3 = 12;
        c0 = new mvf(new yb(i2), new bh(i3));
        int i4 = 19;
        d0 = new mvf(new ju(i2), new wa(i4));
        int i5 = 17;
        e0 = new mvf(new rg(16), new he(i5));
        f0 = new mvf(new lng(1), new dc(25));
        g0 = new mvf(new hs(18), new iq0(i5));
        h0 = new mvf(new vg(21), new kd(i4));
        int i6 = 20;
        int i7 = 13;
        i0 = new mvf(new tr(i6), new gb(i7));
        j0 = new mvf(new zg(11), new od2(i3));
        k0 = new mvf(new mc(i7), new ue(i6));
        l0 = new q92(i3);
        m0 = new q92(i7);
        n0 = new q92(i2);
    }

    public /* synthetic */ q92(int i) {
        this.a = i;
    }

    public static void A(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = j4 ^ ((((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)) ^ (j6 >>> 28));
        long j8 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j5 >>> 28) ^ (((j5 >>> 35) ^ (j5 >>> 32)) ^ (j5 >>> 29)));
        long j9 = j ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36));
        long j10 = (j2 ^ ((((j5 << 29) ^ (j5 << 32)) ^ (j5 << 35)) ^ (j5 << 36))) ^ ((j7 >>> 28) ^ (((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)));
        long j11 = j8 >>> 35;
        jArr2[0] = (((j9 ^ j11) ^ (j11 << 3)) ^ (j11 << 6)) ^ (j11 << 7);
        jArr2[1] = j10;
        jArr2[2] = 34359738367L & j8;
    }

    public static final iba B(s[] sVarArr, b bVar) {
        Context context = (Context) bVar.M(AndroidCompositionLocals_androidKt.b);
        Object[] objArrCopyOf = Arrays.copyOf(sVarArr, sVarArr.length);
        ko2 ko2Var = new ko2(jba.a, new kba(context));
        boolean zX = bVar.x(context);
        Object objV = bVar.v();
        if (zX || objV == b.a.a) {
            objV = new lba(context);
            bVar.p(objV);
        }
        iba ibaVar = (iba) ypd.O(objArrCopyOf, ko2Var, (gu5) objV, bVar, 0, 4);
        for (s sVar : sVarArr) {
            ibaVar.v.a(sVar);
        }
        return ibaVar;
    }

    public static void C(eoc eocVar, Object obj, ReadableArray readableArray) {
        eocVar.scrollTo(obj, new foc(Math.round(nn2.G((float) readableArray.getDouble(0))), Math.round(nn2.G((float) readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    public static void D(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[6];
        r(jArr, jArr3);
        A(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            r(jArr2, jArr3);
            A(jArr3, jArr2);
        }
    }

    @sy3
    public static final Object[] E(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    @sy3
    public static final Object[] F(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final List G(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(z92.O0(arrayList)) : zr4.a;
    }

    public static final Map H(Map map) {
        int size = map.size();
        if (size == 0) {
            return bs4.a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) z92.N0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final String I(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f3 = f2 * fPow;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        float f4 = i / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static boolean J(int i, String str) {
        a aVarE = a.e();
        String strK = aVarE.k(i);
        try {
            com.google.i18n.phonenumbers.b bVarS = aVarE.s(str, strK);
            int iA = bVarS.a();
            z9b z9bVarF = "001".equals(strK) ? aVarE.f(iA) : aVarE.g(strK);
            if (z9bVarF == null) {
                return false;
            }
            if (!"001".equals(strK)) {
                z9b z9bVarG = aVarE.g(strK);
                if (z9bVarG == null) {
                    throw new IllegalArgumentException("Invalid region code: " + strK);
                }
                if (iA != z9bVarG.a()) {
                    return false;
                }
            }
            return aVarE.j(a.h(bVarS), z9bVarF) != a.EnumC0158a.a0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final int K(gs8 gs8Var) {
        List<zr8> listI = gs8Var.i();
        int size = listI.size();
        int iA = 0;
        for (int i = 0; i < size; i++) {
            iA += listI.get(i).a();
        }
        return gs8Var.g() + (iA / listI.size());
    }

    public static jy3 b() {
        return new jy3(1.0f, 1.0f);
    }

    public static final iba c(Context context) {
        context.getClass();
        iba ibaVar = new iba(context);
        u uVar = ibaVar.v;
        uVar.a(new tk2(uVar));
        uVar.a(new uk2());
        uVar.a(new n44());
        return ibaVar;
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static final int f(String str, iid iidVar) {
        iidVar.getClass();
        int iG = g(str, iidVar);
        if (iG >= 0) {
            return iG;
        }
        int iG2 = g("`" + str + '`', iidVar);
        if (iG2 >= 0) {
            return iG2;
        }
        return -1;
    }

    public static final int g(String str, iid iidVar) {
        iidVar.getClass();
        if (iidVar instanceof cc9) {
            throw null;
        }
        int columnCount = iidVar.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            if (str.equals(iidVar.getColumnName(i))) {
                return i;
            }
        }
        return -1;
    }

    public static String[] h(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static uo3 i() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(null).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new uo3(httpURLConnection);
    }

    public static String j(int i, String str, boolean z) {
        str.getClass();
        zt0 zt0Var = new zt0(a.e().k(i));
        String strE = new pxc("[^0-9]").e(str, "");
        int length = strE.length();
        String string = "";
        for (int i2 = 0; i2 < length; i2++) {
            string = zt0Var.g(strE.charAt(i2));
        }
        if (string.equals(str) && z) {
            String strD = bg.d(i, "+", strE);
            zt0Var.c.setLength(0);
            zt0Var.d.setLength(0);
            zt0Var.a.setLength(0);
            zt0Var.m = 0;
            zt0Var.b = "";
            zt0Var.n.setLength(0);
            zt0Var.p = "";
            zt0Var.q.setLength(0);
            zt0Var.e = true;
            zt0Var.f = false;
            zt0Var.g = false;
            zt0Var.h = false;
            zt0Var.r.clear();
            zt0Var.o = false;
            if (!zt0Var.l.equals(zt0Var.k)) {
                a aVar = zt0Var.i;
                z9b z9bVarG = aVar.g(aVar.k(aVar.d(zt0Var.j)));
                if (z9bVarG == null) {
                    z9bVarG = zt0.t;
                }
                zt0Var.l = z9bVarG;
            }
            int length2 = strD.length();
            for (int i3 = 0; i3 < length2; i3++) {
                string = zt0Var.g(strD.charAt(i3));
            }
            string = zve.s0(zve.b0(string, "+" + i)).toString();
        }
        ArrayList arrayList = lz2.a;
        Log.d("PhoneNumberFormatter", "Formatted phone number as typed: " + string, null);
        return string;
    }

    public static final int k(String str, iid iidVar) {
        iidVar.getClass();
        int iF = f(str, iidVar);
        if (iF >= 0) {
            return iF;
        }
        int columnCount = iidVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(iidVar.getColumnName(i));
        }
        p6.i("Column '", str, "' does not exist. Available columns: [", z92.W0(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final ahd l(pl7 pl7Var) {
        Object objG = pl7Var.g();
        if (objG instanceof ahd) {
            return (ahd) objG;
        }
        return null;
    }

    public static final NativeModulesProxy m(ReactContext reactContext) {
        NativeModule nativeModule;
        Object next;
        if (reactContext.isBridgeless()) {
            Collection<NativeModule> nativeModules = ((mkf) reactContext).a.getNativeModules();
            if (nativeModules != null) {
                Iterator<T> it = nativeModules.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((NativeModule) next) instanceof NativeModulesProxy) {
                        break;
                    }
                }
                nativeModule = (NativeModule) next;
            } else {
                nativeModule = null;
            }
            if (nativeModule instanceof NativeModulesProxy) {
                return (NativeModulesProxy) nativeModule;
            }
        } else {
            CatalystInstance catalystInstance = reactContext.getCatalystInstance();
            NativeModule nativeModule2 = catalystInstance != null ? catalystInstance.getNativeModule("NativeUnimoduleProxy") : null;
            if (nativeModule2 instanceof NativeModulesProxy) {
                return (NativeModulesProxy) nativeModule2;
            }
        }
        return null;
    }

    public static final float n(ahd ahdVar) {
        if (ahdVar != null) {
            return ahdVar.a;
        }
        return 0.0f;
    }

    public static kq7 o() {
        return (kq7) cr8.p(kq7.class);
    }

    public static void p(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = (j2 >>> 46) ^ (jArr[2] << 18);
        long j4 = ((j2 << 9) ^ (j >>> 55)) & 36028797018963967L;
        long j5 = j & 36028797018963967L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = (j7 >>> 46) ^ (jArr2[2] << 18);
        long j9 = ((j6 >>> 55) ^ (j7 << 9)) & 36028797018963967L;
        long j10 = j6 & 36028797018963967L;
        long[] jArr4 = new long[10];
        q(j5, j10, jArr4, 0);
        q(j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        q(j11, j12, jArr4, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        q(j5 ^ j13, j10 ^ j14, jArr4, 6);
        q(j11 ^ j13, j12 ^ j14, jArr4, 8);
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
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 55);
        long j29 = (j24 ^ j18) ^ (j28 >>> 55);
        long j30 = ((j26 & 36028797018963967L) >>> 1) ^ ((j28 & 1) << 54);
        long j31 = j30 ^ (j30 << 1);
        long j32 = j31 ^ (j31 << 2);
        long j33 = j32 ^ (j32 << 4);
        long j34 = j33 ^ (j33 << 8);
        long j35 = j34 ^ (j34 << 16);
        long j36 = (j35 ^ (j35 << 32)) & 36028797018963967L;
        long j37 = (((j28 & 36028797018963967L) >>> 1) ^ ((j29 & 1) << 54)) ^ (j36 >>> 54);
        long j38 = j37 ^ (j37 << 1);
        long j39 = j38 ^ (j38 << 2);
        long j40 = j39 ^ (j39 << 4);
        long j41 = j40 ^ (j40 << 8);
        long j42 = j41 ^ (j41 << 16);
        long j43 = 36028797018963967L & (j42 ^ (j42 << 32));
        long j44 = (j29 >>> 1) ^ (j43 >>> 54);
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
        jArr3[0] = j21 ^ (j51 << 55);
        jArr3[1] = (j51 >>> 9) ^ (j52 << 46);
        jArr3[2] = (j52 >>> 18) ^ (j53 << 37);
        jArr3[3] = (j53 >>> 27) ^ (j54 << 28);
        jArr3[4] = (j54 >>> 36) ^ (j55 << 19);
        jArr3[5] = j55 >>> 45;
    }

    public static void q(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 3];
        long j8 = 0;
        int i2 = 47;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 36028797018963967L & j7;
        jArr[i + 1] = (j7 >>> 55) ^ (j8 << 9);
    }

    public static void r(long[] jArr, long[] jArr2) {
        wab.j(0, jArr[0], jArr2);
        wab.j(2, jArr[1], jArr2);
        long j = jArr[2];
        jArr2[4] = wab.i((int) j);
        jArr2[5] = ((long) wab.l((int) (j >>> 32))) & 4294967295L;
    }

    public static LinkedHashSet s(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + JwtParser.SEPARATOR_CHAR + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet t(String str, String... strArr) {
        return s("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet u(String str, String... strArr) {
        return s("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final void v(c cVar, Function2 function2) {
        function2.getClass();
        pxf.d(2, function2);
        function2.invoke(cVar, 1);
    }

    public static s6e w(Function2 function2) {
        s6e s6eVar = new s6e();
        s6eVar.d = ewa.s(s6eVar, s6eVar, function2);
        return s6eVar;
    }

    public static void x(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        p(jArr, jArr2, jArr4);
        A(jArr4, jArr3);
    }

    public static void y(eoc eocVar, FrameLayout frameLayout, int i, ReadableArray readableArray) {
        if (frameLayout == null) {
            r6.g("Required value was null.");
            return;
        }
        if (i == 1) {
            if (readableArray != null) {
                C(eocVar, frameLayout, readableArray);
                return;
            } else {
                r6.g("Required value was null.");
                return;
            }
        }
        if (i == 2) {
            if (readableArray != null) {
                eocVar.scrollToEnd(frameLayout, new goc(readableArray.getBoolean(0)));
                return;
            } else {
                r6.g("Required value was null.");
                return;
            }
        }
        if (i == 3) {
            eocVar.flashScrollIndicators(frameLayout);
            return;
        }
        throw new IllegalArgumentException("Unsupported command " + i + " received by " + eocVar.getClass().getSimpleName() + ".");
    }

    public static void z(eoc eocVar, FrameLayout frameLayout, String str, ReadableArray readableArray) {
        if (frameLayout == null) {
            r6.g("Required value was null.");
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -402165208) {
            if (iHashCode != 28425985) {
                if (iHashCode == 2055114131 && str.equals("scrollToEnd")) {
                    if (readableArray != null) {
                        eocVar.scrollToEnd(frameLayout, new goc(readableArray.getBoolean(0)));
                        return;
                    } else {
                        r6.g("Required value was null.");
                        return;
                    }
                }
            } else if (str.equals("flashScrollIndicators")) {
                eocVar.flashScrollIndicators(frameLayout);
                return;
            }
        } else if (str.equals("scrollTo")) {
            if (readableArray != null) {
                C(eocVar, frameLayout, readableArray);
                return;
            } else {
                r6.g("Required value was null.");
                return;
            }
        }
        l5.q(akb.k("Unsupported command ", str, " received by ", eocVar.getClass().getSimpleName(), "."));
    }

    @Override // defpackage.jn6
    public e49 a(String str) {
        return j8a.a;
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return new FirebaseInstanceId((pf5) l7dVar.get(pf5.class), (kxe) l7dVar.get(kxe.class), (bjg) l7dVar.get(bjg.class), (hh6) l7dVar.get(hh6.class), (vf5) l7dVar.get(vf5.class));
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 13:
                List<svh<?>> list = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).d());
            default:
                List<svh<?>> list2 = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zzo());
        }
    }
}
