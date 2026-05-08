package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.media3.session.f;
import com.google.firebase.iid.FirebaseInstanceId;
import com.indeed.android.jobsearch.JobSearchApplication;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: loaded from: classes.dex */
@fd8
public class boa implements nvh, jg2 {
    public static final ah2 b;
    public static final ah2 c;
    public static final ah2 d;
    public static ArrayList j0;
    public final /* synthetic */ int a;
    public static final bzg e = new bzg(0.31006f, 0.31616f);
    public static final bzg f = new bzg(0.34567f, 0.3585f);
    public static final bzg V = new bzg(0.32168f, 0.33767f);
    public static final bzg W = new bzg(0.31271f, 0.32902f);
    public static final float[] X = {0.964212f, 1.0f, 0.825188f};
    public static final boa Y = new boa(4);
    public static final Object Z = new Object();
    public static final Object a0 = new Object();
    public static final Object b0 = new Object();
    public static final Object c0 = new Object();
    public static final Object d0 = new Object();
    public static final boa e0 = new boa(6);
    public static final boa f0 = new boa(7);
    public static final boa g0 = new boa(8);
    public static final boa h0 = new boa(9);
    public static final boa i0 = new boa(10);

    static {
        byte b2 = 0;
        b = new ah2(-1322442653, new ej2(b2, b2), false);
        c = new ah2(459859878, new rh2(2, b2), false);
        d = new ah2(494683815, new ej2(1, b2), false);
    }

    public /* synthetic */ boa(int i) {
        this.a = i;
    }

    public static /* synthetic */ void A(eve eveVar) {
        z(eveVar, "object");
        throw null;
    }

    public static final boolean B(nya nyaVar, mq5 mq5Var) {
        nyaVar.getClass();
        mq5Var.getClass();
        return nyaVar instanceof pya ? ((pya) nyaVar).a(mq5Var) : I(nyaVar, mq5Var).isEmpty();
    }

    public static final boolean C(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static d2f D(gu5 gu5Var) {
        gu5Var.getClass();
        return new d2f(gu5Var);
    }

    public static Lazy E(qt8 qt8Var, gu5 gu5Var) {
        gu5Var.getClass();
        int iOrdinal = qt8Var.ordinal();
        if (iOrdinal == 0) {
            return new d2f(gu5Var);
        }
        if (iOrdinal == 1) {
            return new qjd(gu5Var);
        }
        if (iOrdinal == 2) {
            return new e7g(gu5Var);
        }
        l.g();
        return null;
    }

    public static final p7g F(ui8 ui8Var) {
        ui8Var.getClass();
        p7g p7gVarG = kyf.g(ui8Var, true);
        p7gVarG.getClass();
        return p7gVarG;
    }

    public static final CharSequence G(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbG = q6.g(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbG.append(charSequence.subSequence(i2, i3).toString());
                sbG.append(str2);
                return sbG.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void H(JobSearchApplication jobSearchApplication) {
        ArrayList arrayList = j0;
        if (arrayList == null) {
            List list = (List) b45.b.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((kya) it.next()).d();
                List list2 = Collections.EMPTY_LIST;
                list2.getClass();
                w92.w0(arrayList2, list2);
            }
            j0 = arrayList2;
            arrayList = arrayList2;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((do0) it2.next()).getClass();
        }
    }

    public static final ArrayList I(nya nyaVar, mq5 mq5Var) {
        nyaVar.getClass();
        mq5Var.getClass();
        ArrayList arrayList = new ArrayList();
        j(nyaVar, mq5Var, arrayList);
        return arrayList;
    }

    public static final int J(InputStream inputStream, int i, boolean z) throws IOException {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                r40.h("no more bytes");
                return 0;
            }
            if (z) {
                i2 = (i5 & 255) << (i4 * 8);
            } else {
                i3 <<= 8;
                i2 = i5 & 255;
            }
            i3 |= i2;
        }
        return i3;
    }

    public static final ui8 K(ui8 ui8Var, lf0 lf0Var) {
        return (ui8Var.getAnnotations().isEmpty() && lf0Var.isEmpty()) ? ui8Var : ui8Var.P0().S0(hwf.c(ui8Var.L0(), lf0Var));
    }

    public static final p7g L(ui8 ui8Var) {
        p7g p7gVarD;
        ui8Var.getClass();
        p7g p7gVarP0 = ui8Var.P0();
        if (p7gVarP0 instanceof jh5) {
            jh5 jh5Var = (jh5) p7gVarP0;
            mge mgeVarD = jh5Var.b;
            if (!mgeVarD.M0().getParameters().isEmpty() && mgeVarD.M0().d() != null) {
                List<rxf> parameters = mgeVarD.M0().getParameters();
                parameters.getClass();
                List<rxf> list = parameters;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new hre((rxf) it.next()));
                }
                mgeVarD = dyf.d(mgeVarD, arrayList, null, 2);
            }
            mge mgeVarD2 = jh5Var.c;
            if (!mgeVarD2.M0().getParameters().isEmpty() && mgeVarD2.M0().d() != null) {
                List<rxf> parameters2 = mgeVarD2.M0().getParameters();
                parameters2.getClass();
                List<rxf> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new hre((rxf) it2.next()));
                }
                mgeVarD2 = dyf.d(mgeVarD2, arrayList2, null, 2);
            }
            p7gVarD = yi8.a(mgeVarD, mgeVarD2);
        } else {
            if (!(p7gVarP0 instanceof mge)) {
                l.g();
                return null;
            }
            mge mgeVar = (mge) p7gVarP0;
            boolean zIsEmpty = mgeVar.M0().getParameters().isEmpty();
            p7gVarD = mgeVar;
            if (!zIsEmpty) {
                v62 v62VarD = mgeVar.M0().d();
                p7gVarD = mgeVar;
                if (v62VarD != null) {
                    List<rxf> parameters3 = mgeVar.M0().getParameters();
                    parameters3.getClass();
                    List<rxf> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(t92.r0(list3, 10));
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new hre((rxf) it3.next()));
                    }
                    p7gVarD = dyf.d(mgeVar, arrayList3, null, 2);
                }
            }
        }
        return beb.k(p7gVarD, p7gVarP0);
    }

    public static void M(g gVar, Fragment fragment) {
        ArrayList arrayList = lz2.a;
        lz2.d("RelaunchingUtils", "Relaunching app from " + fwc.a.b(fragment == null ? gVar.getClass() : fragment.getClass()) + " because the app is not ready yet.", false, null);
        Intent launchIntentForPackage = gVar.getPackageManager().getLaunchIntentForPackage(gVar.getPackageName());
        if (launchIntentForPackage == null) {
            lz2.c("RelaunchingUtils", "Unexpected: Package Manager did not return the launch intent for this package.", false, null, 12);
        } else {
            gVar.startActivity(launchIntentForPackage.addFlags(32768).addFlags(268435456));
            gVar.finish();
        }
    }

    public static final void N(Function2 function2) throws Throwable {
        Thread.interrupted();
        u63.i0(vr4.a, new mhd(function2, null));
    }

    public static String O(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final void P(eve eveVar, Number number) {
        eve.m(eveVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String Q(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) G(str2, -1));
    }

    public static final void R(f5e f5eVar, int i, mrd mrdVar) {
        f5e f5eVar2;
        j4a j4aVar = new j4a(new f5e[16]);
        List listI = f5eVar.i(false, false);
        while (true) {
            j4aVar.d(j4aVar.c, listI);
            while (true) {
                int i2 = j4aVar.c;
                if (i2 == 0) {
                    return;
                }
                f5eVar2 = (f5e) j4aVar.k(i2 - 1);
                boolean zC = ypd.C(f5eVar2);
                w4e w4eVar = f5eVar2.d;
                if (!zC) {
                    if (w4eVar.a.b(k5e.i)) {
                        continue;
                    } else {
                        tia tiaVarD = f5eVar2.d();
                        if (tiaVarD == null) {
                            throw l6.k("Expected semantics node to have a coordinator.");
                        }
                        ph7 ph7VarX = mh2.x(ojh.h(tiaVarD));
                        if (ph7VarX.a < ph7VarX.c && ph7VarX.b < ph7VarX.d) {
                            Function2 function2 = (Function2) x4e.a(w4eVar, v4e.e);
                            lrd lrdVar = (lrd) x4e.a(w4eVar, k5e.u);
                            if (function2 == null || lrdVar == null || lrdVar.b.invoke().floatValue() <= 0.0f) {
                                break;
                            }
                            int i3 = i + 1;
                            mrdVar.invoke(new ord(f5eVar2, i3, ph7VarX, tiaVarD));
                            R(f5eVar2, i3, mrdVar);
                        }
                    }
                }
            }
            listI = f5eVar2.i(false, false);
        }
    }

    public static ae0 a(float f2, float f3, int i) {
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        return new ae0(q92.c0, Float.valueOf(f2), new ce0(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final JsonEncodingException b(Number number, String str) {
        str.getClass();
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) G(str, -1)));
    }

    public static final JsonEncodingException c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return new JsonEncodingException("Value of type '" + serialDescriptor.getA() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.f() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException e(int i, String str) {
        if (i >= 0) {
            str = v40.c(i, "Unexpected JSON token at offset ", ": ", str);
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException f(int i, String str, CharSequence charSequence) {
        charSequence.getClass();
        return e(i, str + "\nJSON input: " + ((Object) G(charSequence, i)));
    }

    public static final int g(w59 w59Var, d20 d20Var) {
        w59 w59VarZ0 = w59Var.z0();
        if (w59VarZ0 == null) {
            ae7.b("Child of " + w59Var + " cannot be null when calculating alignment line");
        }
        if (w59Var.G0().r().containsKey(d20Var)) {
            Integer num = w59Var.G0().r().get(d20Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iV = w59VarZ0.V(d20Var);
            if (iV != Integer.MIN_VALUE) {
                w59VarZ0.Y = true;
                w59Var.Z = true;
                w59Var.N0();
                w59VarZ0.Y = false;
                w59Var.Z = false;
                return iV + ((int) (d20Var instanceof tj6 ? w59VarZ0.I0() & 4294967295L : w59VarZ0.I0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void h(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            tbb.a.a(th, th2);
        }
    }

    public static mp8 i(mp8 mp8Var, f62 f62Var, hvc hvcVar, int i) {
        if ((i & 2) != 0) {
            hvcVar = null;
        }
        mp8Var.getClass();
        return new mp8(mp8Var.a, hvcVar != null ? new gqf(mp8Var, f62Var, hvcVar, 0) : mp8Var.b, E(qt8.c, new qt2(mp8Var, f62Var)));
    }

    public static final void j(nya nyaVar, mq5 mq5Var, ArrayList arrayList) {
        nyaVar.getClass();
        mq5Var.getClass();
        if (nyaVar instanceof pya) {
            ((pya) nyaVar).c(mq5Var, arrayList);
        } else {
            arrayList.addAll(nyaVar.b(mq5Var));
        }
    }

    public static g4a k() {
        return r.e(j6g.a, zkd.f);
    }

    public static final boolean l(ui8 ui8Var, kwf kwfVar, Set set) {
        boolean zL;
        if (wl7.b(ui8Var.M0(), kwfVar)) {
            return true;
        }
        v62 v62VarD = ui8Var.M0().d();
        w62 w62Var = v62VarD instanceof w62 ? (w62) v62VarD : null;
        List<rxf> listP = w62Var != null ? w62Var.p() : null;
        Iterable iterableG1 = z92.G1(ui8Var.K0());
        if (!(iterableG1 instanceof Collection) || !((Collection) iterableG1).isEmpty()) {
            Iterator it = iterableG1.iterator();
            do {
                oa7 oa7Var = (oa7) it;
                if (oa7Var.a.hasNext()) {
                    ma7 ma7Var = (ma7) oa7Var.next();
                    int i = ma7Var.a;
                    wxf wxfVar = (wxf) ma7Var.b;
                    rxf rxfVar = listP != null ? (rxf) z92.R0(i, listP) : null;
                    if ((rxfVar == null || set == null || !set.contains(rxfVar)) && !wxfVar.b()) {
                        ui8 type = wxfVar.getType();
                        type.getClass();
                        zL = l(type, kwfVar, set);
                    } else {
                        zL = false;
                    }
                }
            } while (!zL);
            return true;
        }
        return false;
    }

    public static ae0 m(ae0 ae0Var, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = ((Number) ((gme) ae0Var.b).getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f3 = ((ce0) ae0Var.c).a;
        }
        return new ae0(ae0Var.a, Float.valueOf(f2), new ce0(f3), ae0Var.d, ae0Var.e, ae0Var.f);
    }

    public static final mp8 n(mp8 mp8Var, lf0 lf0Var) {
        mp8Var.getClass();
        lf0Var.getClass();
        if (lf0Var.isEmpty()) {
            return mp8Var;
        }
        return new mp8(mp8Var.a, mp8Var.b, E(qt8.c, new rt2(mp8Var, lf0Var)));
    }

    public static final yxf o(ui8 ui8Var, ylg ylgVar, rxf rxfVar) {
        ui8Var.getClass();
        if ((rxfVar != null ? rxfVar.z() : null) == ylgVar) {
            ylgVar = ylg.INVARIANT;
        }
        return new yxf(ui8Var, ylgVar);
    }

    public static void p(f fVar) {
        if (fVar != null) {
            try {
                fVar.f();
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void q(ui8 ui8Var, mge mgeVar, LinkedHashSet linkedHashSet, Set set) {
        v62 v62VarD = ui8Var.M0().d();
        if (v62VarD instanceof rxf) {
            if (!wl7.b(ui8Var.M0(), mgeVar.M0())) {
                linkedHashSet.add(v62VarD);
                return;
            }
            for (ui8 ui8Var2 : ((rxf) v62VarD).getUpperBounds()) {
                ui8Var2.getClass();
                q(ui8Var2, mgeVar, linkedHashSet, set);
            }
            return;
        }
        v62 v62VarD2 = ui8Var.M0().d();
        w62 w62Var = v62VarD2 instanceof w62 ? (w62) v62VarD2 : null;
        List<rxf> listP = w62Var != null ? w62Var.p() : null;
        int i = 0;
        for (wxf wxfVar : ui8Var.K0()) {
            int i2 = i + 1;
            rxf rxfVar = listP != null ? (rxf) z92.R0(i, listP) : null;
            if ((rxfVar == null || set == null || !set.contains(rxfVar)) && !wxfVar.b() && !z92.I0(linkedHashSet, wxfVar.getType().M0().d()) && !wl7.b(wxfVar.getType().M0(), mgeVar.M0())) {
                ui8 type = wxfVar.getType();
                type.getClass();
                q(type, mgeVar, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final y r(y yVar, en6 en6Var) {
        Object next;
        yVar.getClass();
        en6Var.getClass();
        Iterator<T> it = yVar.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((y) next).getType(), en6Var)) {
                break;
            }
        }
        return (y) next;
    }

    public static final int s(int i, to5 to5Var) {
        boolean z = to5Var.compareTo(to5.V) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final ei8 t(ui8 ui8Var) {
        ui8Var.getClass();
        ei8 ei8VarL = ui8Var.M0().l();
        ei8VarL.getClass();
        return ei8VarL;
    }

    public static final ui8 u(rxf rxfVar) {
        Object obj;
        List<ui8> upperBounds = rxfVar.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List<ui8> upperBounds2 = rxfVar.getUpperBounds();
        upperBounds2.getClass();
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            v62 v62VarD = ((ui8) next).M0().d();
            t52 t52Var = v62VarD instanceof t52 ? (t52) v62VarD : null;
            if (t52Var != null && t52Var.f() != c62.INTERFACE && t52Var.f() != c62.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        ui8 ui8Var = (ui8) obj;
        if (ui8Var != null) {
            return ui8Var;
        }
        List<ui8> upperBounds3 = rxfVar.getUpperBounds();
        upperBounds3.getClass();
        Object objO0 = z92.O0(upperBounds3);
        objO0.getClass();
        return (ui8) objO0;
    }

    public static final String v(int i, b bVar) {
        bVar.M(AndroidCompositionLocals_androidKt.a);
        return ((Context) bVar.M(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
    }

    public static final CharSequence w(y yVar, CharSequence charSequence) {
        yVar.getClass();
        charSequence.getClass();
        return charSequence.subSequence(yVar.c(), yVar.b());
    }

    public static final boolean x(rxf rxfVar, kwf kwfVar, Set set) {
        rxfVar.getClass();
        List<ui8> upperBounds = rxfVar.getUpperBounds();
        upperBounds.getClass();
        List<ui8> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (ui8 ui8Var : list) {
            ui8Var.getClass();
            if (l(ui8Var, rxfVar.o().M0(), set) && (kwfVar == null || wl7.b(ui8Var.M0(), kwfVar))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean y(rxf rxfVar, kwf kwfVar, int i) {
        if ((i & 2) != 0) {
            kwfVar = null;
        }
        return x(rxfVar, kwfVar, null);
    }

    public static final void z(eve eveVar, String str) {
        eveVar.l(eveVar.a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        mf5 mf5Var;
        Context context = (Context) l7dVar.get(Context.class);
        pf5 pf5Var = (pf5) l7dVar.get(pf5.class);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) l7dVar.get(FirebaseInstanceId.class);
        g5 g5Var = (g5) l7dVar.get(g5.class);
        synchronized (g5Var) {
            try {
                if (!g5Var.a.containsKey("frc")) {
                    g5Var.a.put("frc", new mf5(g5Var.b));
                }
                mf5Var = (mf5) g5Var.a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new o0d(context, pf5Var, firebaseInstanceId, mf5Var, (n20) l7dVar.get(n20.class));
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "coil.request.NullRequestData";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 6:
                List<svh<?>> list = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).zzh());
            case 7:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((jji) gji.b.zza()).zza());
            default:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((iii) fii.b.zza()).zza());
        }
    }
}
