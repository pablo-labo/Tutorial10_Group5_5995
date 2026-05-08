package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.ze9;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class ka2 implements cxg, qa7, nvh, hna, f49 {
    public static final ah2 c;
    public static final ah2 d;
    public static final ah2 e;
    public static jp6 h0;
    public final /* synthetic */ int a;
    public static final ah2 b = new ah2(1208670219, new so0(3), false);
    public static final ka2 f = new ka2(5);
    public static final Object V = new Object();
    public static final char[] W = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] X = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final String[] Y = new String[0];
    public static final ka2 Z = new ka2(9);
    public static final SerialDescriptor[] a0 = new SerialDescriptor[0];
    public static final g6c b0 = new g6c(new j7(19));
    public static final ka2 c0 = new ka2(12);
    public static final ka2 d0 = new ka2(13);
    public static final ka2 e0 = new ka2(14);
    public static final n6i f0 = new n6i();
    public static final k6i g0 = new k6i();

    static {
        byte b2 = 0;
        int i = 4;
        c = new ah2(-1831528562, new lh2(i, b2), false);
        d = new ah2(-1722703835, new ey1(2, b2), false);
        e = new ah2(-2126732674, new so0(i), false);
    }

    public /* synthetic */ ka2(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A(defpackage.ex7[] r6, defpackage.pu2 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.j61
            if (r0 == 0) goto L13
            r0 = r7
            j61 r0 = (defpackage.j61) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            j61 r0 = new j61
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r6 = r0.I$1
            int r1 = r0.I$0
            java.lang.Object r3 = r0.L$0
            ex7[] r3 = (defpackage.ex7[]) r3
            defpackage.r7d.b(r7)
            r7 = r3
            goto L52
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L35:
            defpackage.r7d.b(r7)
            int r7 = r6.length
            r1 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L3d:
            if (r1 >= r6) goto L54
            r3 = r7[r1]
            r0.L$0 = r7
            r0.I$0 = r1
            r0.I$1 = r6
            r0.label = r2
            java.lang.Object r3 = r3.s0(r0)
            g13 r4 = defpackage.g13.a
            if (r3 != r4) goto L52
            return r4
        L52:
            int r1 = r1 + r2
            goto L3d
        L54:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka2.A(ex7[], pu2):java.lang.Object");
    }

    public static final yd8 B(zf8 zf8Var) {
        zf8Var.getClass();
        oe8 oe8VarA = zf8Var.a();
        if (oe8VarA instanceof yd8) {
            return (yd8) oe8VarA;
        }
        if (!(oe8VarA instanceof dg8)) {
            akb.o(oe8VarA, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + oe8VarA + " from generic non-reified function. Such functionality cannot be supported because " + oe8VarA + " is erased, either specify serializer explicitly or make calling function inline with reified " + oe8VarA + JwtParser.SEPARATOR_CHAR);
    }

    public static final String C(yd8 yd8Var) {
        yd8Var.getClass();
        String strR = yd8Var.r();
        if (strR == null) {
            strR = "<local class name not available>";
        }
        return l5.m("Serializer for class '", strR, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static int D(InputStream inputStream, byte[] bArr, int i) throws IOException {
        inputStream.getClass();
        int i2 = 0;
        if (i < 0) {
            l5.s("len is negative");
            return 0;
        }
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }

    public static void E(ViewGroup viewGroup, float f2) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof ze9) {
            ((ze9) background).j(f2);
        }
    }

    public static void F(View view, ze9 ze9Var) {
        op4 op4Var = ze9Var.a.b;
        if (op4Var == null || !op4Var.a) {
            return;
        }
        float fE = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            fE += epg.d.e((View) parent);
        }
        ze9.b bVar = ze9Var.a;
        if (bVar.l != fE) {
            bVar.l = fE;
            ze9Var.n();
        }
    }

    public static void G(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof ze9) {
            F(viewGroup, (ze9) background);
        }
    }

    public static void H(String str, boolean z, boolean z2, FragmentManager fragmentManager) {
        str.getClass();
        fragmentManager.getClass();
        a aVar = new a(fragmentManager);
        web.E(fragmentManager, aVar, "FsdvFragment", null);
        ut5 ut5Var = new ut5();
        Bundle bundle = new Bundle();
        bundle.putString("INITIAL_URL_KEY", str);
        bundle.putBoolean("CANCEL_PASSPORT_REDIRECT_KEY", z);
        bundle.putBoolean("USE_BOT_USER_AGENT_KEY", z2);
        ut5Var.setArguments(bundle);
        aVar.d(R.id.app_container, ut5Var, "FsdvFragment", 1);
        aVar.h(true);
        web.A(ut5Var, fragmentManager, 8, 0);
        ArrayList arrayList = lz2.a;
        lz2.d("FsdvUtils", "Showing FSDV Fragment", false, null);
    }

    public static final String I(String str) {
        str.getClass();
        String lowerCase = new pxc("\\s+").e(new pxc("\\s*\\.\\s*").e(new pxc("[^a-zA-Z0-9\\s&.+\\-#]").e(str, ""), "."), " ").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return zve.s0(lowerCase).toString();
    }

    public static String J(long j) {
        return v(j, 12884901888L) ? "Rgb" : v(j, 12884901889L) ? "Xyz" : v(j, 12884901890L) ? "Lab" : v(j, 17179869187L) ? "Cmyk" : ViewUtilsKt.UNKNOWN_DESTINATION_URL;
    }

    public static final boolean K(Throwable th, gu5 gu5Var) {
        DiagnosticComposeException diagnosticComposeException;
        th.getClass();
        List<Throwable> listB = tbb.a.b(th);
        boolean z = false;
        if (!(listB instanceof Collection) || !listB.isEmpty()) {
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof DiagnosticComposeException) {
                    return false;
                }
            }
        }
        try {
            List list = (List) gu5Var.invoke();
            boolean zIsEmpty = list.isEmpty();
            z = !zIsEmpty;
            diagnosticComposeException = !zIsEmpty ? new DiagnosticComposeException(list) : null;
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            boa.h(th, diagnosticComposeException);
        }
        return z;
    }

    public static final int L(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final int M(float f2, float[] fArr, int i) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static boolean h(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle != null) {
            return bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        }
        r(bundle2);
        return bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
    }

    public static final Object i(Collection collection, c1f c1fVar) {
        return collection.isEmpty() ? zr4.a : new g61((xr3[]) collection.toArray(new xr3[0])).a(c1fVar);
    }

    public static final Set j(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof iu1) {
            return ((iu1) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getC());
        int iD = serialDescriptor.getC();
        for (int i = 0; i < iD; i++) {
            hashSet.add(serialDescriptor.e(i));
        }
        return hashSet;
    }

    @Pure
    public static void k(String str, boolean z) {
        if (z) {
            return;
        }
        l5.q(str);
    }

    @Pure
    public static void l(boolean z) {
        if (z) {
            return;
        }
        o6.h();
    }

    @Pure
    public static void m(int i, int i2) {
        if (i < 0 || i >= i2) {
            k20.o();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static void n(xj9 xj9Var) {
        xj9Var.getClass();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ja.k(str);
    }

    @Pure
    public static void p(String str, boolean z) {
        if (z) {
            return;
        }
        r6.g(str);
    }

    @Pure
    public static void q(boolean z) {
        if (z) {
            return;
        }
        bg.h();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static void r(Object obj) {
        if (obj != null) {
            return;
        }
        bg.h();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static void s(Object obj, String str) {
        if (obj != null) {
            return;
        }
        r6.g(str);
    }

    public static final SerialDescriptor[] t(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? a0 : serialDescriptorArr;
    }

    public static ie7 u(int i) {
        if (i != 0 && i == 1) {
            return new dc3(16);
        }
        return new hgd();
    }

    public static final boolean v(long j, long j2) {
        return j == j2;
    }

    public static final int w(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4);
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final qw1 x(lu2 lu2Var) {
        qw1 qw1Var;
        qw1 qw1Var2;
        if (!(lu2Var instanceof v64)) {
            return new qw1(1, lu2Var);
        }
        v64 v64Var = (v64) lu2Var;
        ux0 ux0Var = mh2.W;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v64.W;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(v64Var);
            qw1Var = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(v64Var, ux0Var);
                qw1Var2 = null;
                break;
            }
            if (obj instanceof qw1) {
                while (!atomicReferenceFieldUpdater.compareAndSet(v64Var, obj, ux0Var)) {
                    if (atomicReferenceFieldUpdater.get(v64Var) != obj) {
                        break;
                    }
                }
                qw1Var2 = (qw1) obj;
                break loop0;
            }
            if (obj != ux0Var && !(obj instanceof Throwable)) {
                ja.i(obj, "Inconsistent state ");
                return null;
            }
        }
        if (qw1Var2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = qw1.V;
            Object obj2 = atomicReferenceFieldUpdater2.get(qw1Var2);
            if (!(obj2 instanceof pf2) || ((pf2) obj2).d == null) {
                qw1.f.set(qw1Var2, 536870911);
                atomicReferenceFieldUpdater2.set(qw1Var2, r7.a);
                qw1Var = qw1Var2;
            } else {
                qw1Var2.m();
            }
            if (qw1Var != null) {
                return qw1Var;
            }
        }
        return new qw1(2, lu2Var);
    }

    public static final ArrayList y(List list) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!wl7.b(((zie) obj).g, Boolean.FALSE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            zie zieVar = (zie) obj2;
            ArrayList arrayList3 = new ArrayList(t92.r0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b42 b42Var = ((zie) it.next()).h;
                arrayList3.add(b42Var != null ? b42Var.c : null);
            }
            if (!arrayList3.contains(zieVar.a)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object z(java.util.Collection r4, defpackage.pu2 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.k61
            if (r0 == 0) goto L13
            r0 = r5
            k61 r0 = (defpackage.k61) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            k61 r0 = new k61
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r4 = r0.L$0
            java.util.Iterator r4 = (java.util.Iterator) r4
            defpackage.r7d.b(r5)
            goto L39
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L30:
            defpackage.r7d.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L52
            java.lang.Object r5 = r4.next()
            ex7 r5 = (defpackage.ex7) r5
            r0.L$0 = r4
            r0.label = r2
            java.lang.Object r5 = r5.s0(r0)
            g13 r1 = defpackage.g13.a
            if (r5 != r1) goto L39
            return r1
        L52:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka2.z(java.util.Collection, pu2):java.lang.Object");
    }

    @Override // defpackage.f49
    public void a(String str, String str2) {
        Log.d(str, str2);
    }

    @Override // defpackage.hna
    public Object b() {
        return new ey8();
    }

    @Override // defpackage.qa7
    public void c(sm8 sm8Var) {
        sm8Var.N1();
    }

    @Override // defpackage.f49
    public void d(String str, String str2) {
        Log.v(str, str2);
    }

    @Override // defpackage.f49
    public void e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // defpackage.cxg
    public String[] f() {
        return Y;
    }

    @Override // defpackage.cxg
    public WebViewProviderBoundaryInterface g(wbc wbcVar) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.cxg
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.cxg
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 12:
                List<svh<?>> list = djh.a;
                return Boolean.valueOf(((dgi) egi.b.zza()).zzb());
            case 13:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((jei) eei.b.zza()).zze());
            default:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((khi) xgi.b.zza()).zza());
        }
    }
}
