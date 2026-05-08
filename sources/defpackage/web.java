package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.n;
import com.datadog.android.core.internal.CoreFeature;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import defpackage.khf;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class web implements b6d, nvh, vsh {
    public static vh8 d;
    public final /* synthetic */ int a;
    public static final ah2 b = new ah2(-1625887110, new cm0(1), false);
    public static final web c = new web(4);
    public static final web e = new web(5);
    public static final web f = new web(6);
    public static final web V = new web(7);
    public static final web W = new web(8);
    public static final web X = new web(9);

    public /* synthetic */ web(int i) {
        this.a = i;
    }

    public static void A(Fragment fragment, FragmentManager fragmentManager, int i, int i2) {
        fragmentManager.getClass();
        Iterator<Fragment> it = fragmentManager.c.f().iterator();
        while (it.hasNext()) {
            View view = it.next().getView();
            if (view != null) {
                view.setVisibility(!wl7.b(fragment.getView(), view) ? i : i2);
            }
        }
        View view2 = fragment.getView();
        if (view2 != null) {
            view2.requestFocus(130);
        }
    }

    public static ArrayList B(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static final String C(String str) {
        str.getClass();
        return str.length() <= 255 ? str : str.substring(0, 252).concat("...");
    }

    public static void D(FragmentManager fragmentManager, String str) {
        fragmentManager.getClass();
        Fragment fragmentD = fragmentManager.D(str);
        if (fragmentD != null) {
            a aVar = new a(fragmentManager);
            aVar.l(fragmentD);
            aVar.h(true);
            A(fragmentD, fragmentManager, 0, 8);
            z(fragmentManager, 1);
        }
    }

    public static void E(FragmentManager fragmentManager, a aVar, String str, Integer num) {
        fragmentManager.getClass();
        Fragment fragmentD = fragmentManager.D(str);
        if (fragmentD != null) {
            aVar.l(fragmentD);
        }
        z(fragmentManager, 4);
        if (num != null) {
            Iterator<Fragment> it = fragmentManager.c.f().iterator();
            while (it.hasNext()) {
                View view = it.next().getView();
                if (view != null) {
                    view.setVisibility(num.intValue());
                }
            }
        }
    }

    public static final boolean F(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(wve.I(str2, CoreFeature.DEFAULT_APP_VERSION, ""))) {
            return true;
        }
        if (wve.D(str2, CoreFeature.DEFAULT_APP_VERSION, false) && str.concat(CoreFeature.DEFAULT_APP_VERSION).equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    public static final long G(long j, long j2) {
        int iD;
        int iF = kjf.f(j);
        int iE = kjf.e(j);
        if ((kjf.f(j2) < kjf.e(j)) && (kjf.f(j) < kjf.e(j2))) {
            if ((kjf.f(j2) <= kjf.f(j)) && (kjf.e(j) <= kjf.e(j2))) {
                iF = kjf.f(j2);
                iE = iF;
            } else {
                if ((kjf.f(j) <= kjf.f(j2)) && (kjf.e(j2) <= kjf.e(j))) {
                    iD = kjf.d(j2);
                } else {
                    int iF2 = kjf.f(j2);
                    if (iF >= kjf.e(j2) || iF2 > iF) {
                        iE = kjf.f(j2);
                    } else {
                        iF = kjf.f(j2);
                        iD = kjf.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > kjf.f(j2)) {
            iF -= kjf.d(j2);
            iD = kjf.d(j2);
            iE -= iD;
        }
        return cr8.c(iF, iE);
    }

    public static final Object H(v03 v03Var, Object obj, Object obj2, Function2 function2, lu2 lu2Var) {
        Object objInvoke;
        Object objC = rkf.c(v03Var, obj2);
        try {
            oqe oqeVar = new oqe(lu2Var, v03Var);
            if (function2 == null) {
                objInvoke = ewa.Q(function2, obj, oqeVar);
            } else {
                pxf.d(2, function2);
                objInvoke = function2.invoke(obj, oqeVar);
            }
            rkf.a(v03Var, objC);
            if (objInvoke == g13.a) {
                lu2Var.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            rkf.a(v03Var, objC);
            throw th;
        }
    }

    public static final Object I(xed xedVar, Function1 function1, lu2 lu2Var) {
        brf brfVar;
        cfd cfdVar = new cfd(function1, null);
        arf arfVar = (arf) lu2Var.getContext().h1(arf.c);
        qu2 qu2Var = arfVar != null ? arfVar.a : null;
        if (qu2Var != null) {
            return u63.q0(qu2Var, cfdVar, lu2Var);
        }
        v03 context = lu2Var.getContext();
        qw1 qw1Var = new qw1(1, ewa.v(lu2Var));
        qw1Var.q();
        try {
            brfVar = xedVar.d;
        } catch (RejectedExecutionException e2) {
            qw1Var.g(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        if (brfVar != null) {
            brfVar.execute(new afd(context, qw1Var, xedVar, cfdVar));
            return qw1Var.p();
        }
        wl7.g("internalTransactionExecutor");
        throw null;
    }

    public static vsh J(vsh vshVar) {
        if ((vshVar instanceof dth) || (vshVar instanceof zsh)) {
            return vshVar;
        }
        if (vshVar instanceof Serializable) {
            return new zsh(vshVar);
        }
        dth dthVar = new dth();
        vshVar.getClass();
        dthVar.a = vshVar;
        return dthVar;
    }

    public static void K(ewh ewhVar, SQLiteDatabase sQLiteDatabase) {
        jwh jwhVar = ewhVar.X;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            jwhVar.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            jwhVar.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            jwhVar.b("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        jwhVar.b("Failed to turn on database write permission for owner");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void L(defpackage.ewh r14, android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.web.L(ewh, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static final qtc a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new qtc(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final ldd b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ldd) {
                return (ldd) childAt;
            }
        }
        ldd lddVar = new ldd(viewGroup.getContext());
        viewGroup.addView(lddVar);
        return lddVar;
    }

    public static final ViewGroup d(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                h5.k(v40.e(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                return null;
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }

    public static void e(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        o6.h();
    }

    public static void f(String str, boolean z) {
        if (z) {
            return;
        }
        l5.q(str);
    }

    public static void g(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        l5.q(n(str, objArr));
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ja.k(str);
    }

    public static void i(boolean z) {
        if (z) {
            return;
        }
        bg.h();
    }

    public static final aw4 j(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        enumArr.getClass();
        uv4 uv4Var = new uv4(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String strName = (String) ut0.o0(i2, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            uv4Var.k(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) ut0.o0(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    annotation.getClass();
                    int i4 = uv4Var.d;
                    List<Annotation>[] listArr = uv4Var.f;
                    List<Annotation> arrayList = listArr[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList<>(1);
                        listArr[uv4Var.d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        aw4 aw4Var = new aw4(enumArr, str);
        aw4Var.b = uv4Var;
        return aw4Var;
    }

    public static rt0 k(List list, xx9 xx9Var, bnb bnbVar) {
        List listZ1 = z92.z1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listZ1.iterator();
        while (it.hasNext()) {
            up2 up2VarL = l(it.next(), null);
            if (up2VarL != null) {
                arrayList.add(up2VarL);
            }
        }
        return xx9Var != null ? new uyf(arrayList, xx9Var.l().r(bnbVar)) : new rt0(arrayList, new ql2(bnbVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [zr4] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    public static up2 l(Object obj, xx9 xx9Var) {
        ?? Z;
        if (obj instanceof Byte) {
            return new wr1(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new pee(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new wh7(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new t59(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new y22((Character) obj);
        }
        if (obj instanceof Float) {
            return new hi5(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new b94(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new oi1((Boolean) obj);
        }
        if (obj instanceof String) {
            return new pve((String) obj);
        }
        if (obj instanceof byte[]) {
            return k(ut0.z0((byte[]) obj), xx9Var, bnb.BYTE);
        }
        if (obj instanceof short[]) {
            return k(ut0.F0((short[]) obj), xx9Var, bnb.SHORT);
        }
        if (obj instanceof int[]) {
            return k(ut0.C0((int[]) obj), xx9Var, bnb.INT);
        }
        if (obj instanceof long[]) {
            return k(ut0.D0((long[]) obj), xx9Var, bnb.LONG);
        }
        if (!(obj instanceof char[])) {
            if (obj instanceof float[]) {
                return k(ut0.B0((float[]) obj), xx9Var, bnb.FLOAT);
            }
            if (obj instanceof double[]) {
                return k(ut0.A0((double[]) obj), xx9Var, bnb.DOUBLE);
            }
            if (obj instanceof boolean[]) {
                return k(ut0.G0((boolean[]) obj), xx9Var, bnb.BOOLEAN);
            }
            if (obj == null) {
                return new jma(null);
            }
            return null;
        }
        char[] cArr = (char[]) obj;
        int length = cArr.length;
        if (length != 0) {
            if (length != 1) {
                Z = new ArrayList(cArr.length);
                for (char c2 : cArr) {
                    Z.add(Character.valueOf(c2));
                }
            } else {
                Z = u63.Z(Character.valueOf(cArr[0]));
            }
        } else {
            Z = zr4.a;
        }
        return k(Z, xx9Var, bnb.CHAR);
    }

    public static final boolean m(long j, long j2) {
        return j == j2;
    }

    public static String n(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, iIndexOf));
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean p(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final ct0 q(Object[] objArr) {
        objArr.getClass();
        return new ct0(objArr);
    }

    public static final tjf r(tjf tjfVar, tjf tjfVar2, float f2) {
        acb acbVar;
        foe foeVar = tjfVar.a;
        foe foeVar2 = tjfVar2.a;
        khf khfVar = goe.d;
        khf khfVar2 = foeVar.a;
        khf khfVar3 = foeVar2.a;
        boolean z = khfVar2 instanceof un1;
        khf un1Var = khf.a.a;
        if (!z && !(khfVar3 instanceof un1)) {
            long jG = pnb.G(khfVar2.c(), khfVar3.c(), f2);
            if (jG != 16) {
                un1Var = new bb2(jG);
            }
        } else if (z && (khfVar3 instanceof un1)) {
            un1 un1Var2 = (un1) khfVar2;
            un1 un1Var3 = (un1) khfVar3;
            sn1 sn1Var = (sn1) goe.b(f2, un1Var2.a, un1Var3.a);
            float fT = w74.t(un1Var2.b, un1Var3.b, f2);
            if (sn1Var != null) {
                if (sn1Var instanceof kne) {
                    long jW = hh2.w(((kne) sn1Var).a, fT);
                    if (jW != 16) {
                        un1Var = new bb2(jW);
                    }
                } else {
                    if (!(sn1Var instanceof tbe)) {
                        l.g();
                        return null;
                    }
                    un1Var = new un1((tbe) sn1Var, fT);
                }
            }
        } else {
            un1Var = (khf) goe.b(f2, khfVar2, khfVar3);
        }
        khf khfVar4 = un1Var;
        pn5 pn5Var = (pn5) goe.b(f2, foeVar.f, foeVar2.f);
        long jC = goe.c(foeVar.b, foeVar2.b, f2);
        to5 to5Var = foeVar.c;
        if (to5Var == null) {
            to5Var = to5.b0;
        }
        to5 to5Var2 = foeVar2.c;
        if (to5Var2 == null) {
            to5Var2 = to5.b0;
        }
        to5 to5Var3 = new to5(nic.C(w74.u(to5Var.a, f2, to5Var2.a), 1, 1000));
        mo5 mo5Var = (mo5) goe.b(f2, foeVar.d, foeVar2.d);
        no5 no5Var = (no5) goe.b(f2, foeVar.e, foeVar2.e);
        String str = (String) goe.b(f2, foeVar.g, foeVar2.g);
        long jC2 = goe.c(foeVar.h, foeVar2.h, f2);
        lc1 lc1Var = foeVar.i;
        float f3 = lc1Var != null ? lc1Var.a : 0.0f;
        lc1 lc1Var2 = foeVar2.i;
        float fT2 = w74.t(f3, lc1Var2 != null ? lc1Var2.a : 0.0f, f2);
        lhf lhfVar = foeVar.j;
        lhf lhfVar2 = lhf.c;
        if (lhfVar == null) {
            lhfVar = lhfVar2;
        }
        lhf lhfVar3 = foeVar2.j;
        if (lhfVar3 != null) {
            lhfVar2 = lhfVar3;
        }
        lhf lhfVar4 = new lhf(w74.t(lhfVar.a, lhfVar2.a, f2), w74.t(lhfVar.b, lhfVar2.b, f2));
        b19 b19Var = (b19) goe.b(f2, foeVar.k, foeVar2.k);
        long jG2 = pnb.G(foeVar.l, foeVar2.l, f2);
        odf odfVar = (odf) goe.b(f2, foeVar.m, foeVar2.m);
        vbe vbeVar = foeVar.n;
        if (vbeVar == null) {
            vbeVar = new vbe();
        }
        vbe vbeVar2 = foeVar2.n;
        if (vbeVar2 == null) {
            vbeVar2 = new vbe();
        }
        long jG3 = pnb.G(vbeVar.a, vbeVar2.a, f2);
        long j = vbeVar.b;
        long j2 = vbeVar2.b;
        vbe vbeVar3 = new vbe(jG3, (((long) Float.floatToRawIntBits(w74.t(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f2))) << 32) | (((long) Float.floatToRawIntBits(w74.t(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f2))) & 4294967295L), w74.t(vbeVar.c, vbeVar2.c, f2));
        lcb lcbVar = foeVar.o;
        lcb lcbVar2 = foeVar2.o;
        if (lcbVar == null && lcbVar2 == null) {
            lcbVar = null;
        } else if (lcbVar == null) {
            lcbVar = lcb.a;
        }
        foe foeVar3 = new foe(khfVar4, jC, to5Var3, mo5Var, no5Var, pn5Var, str, jC2, new lc1(fT2), lhfVar4, b19Var, jG2, odfVar, vbeVar3, lcbVar, (ib4) goe.b(f2, foeVar.p, foeVar2.p));
        l3b l3bVar = tjfVar.b;
        l3b l3bVar2 = tjfVar2.b;
        int i = m3b.b;
        int i2 = ((dcf) goe.b(f2, new dcf(l3bVar.a), new dcf(l3bVar2.a))).a;
        int i3 = ((sdf) goe.b(f2, new sdf(l3bVar.b), new sdf(l3bVar2.b))).a;
        long jC3 = goe.c(l3bVar.c, l3bVar2.c, f2);
        nhf nhfVar = l3bVar.d;
        if (nhfVar == null) {
            nhfVar = nhf.c;
        }
        nhf nhfVar2 = l3bVar2.d;
        if (nhfVar2 == null) {
            nhfVar2 = nhf.c;
        }
        nhf nhfVar3 = new nhf(goe.c(nhfVar.a, nhfVar2.a, f2), goe.c(nhfVar.b, nhfVar2.b, f2));
        acb acbVar2 = l3bVar.e;
        acb acbVar3 = l3bVar2.e;
        if (acbVar2 == null && acbVar3 == null) {
            acbVar = null;
        } else {
            if (acbVar2 == null) {
                acbVar2 = acb.b;
            }
            acb acbVar4 = acbVar2;
            if (acbVar3 == null) {
                acbVar3 = acb.b;
            }
            if (acbVar4.a == acbVar3.a) {
                acbVar = acbVar4;
            } else {
                ((vq4) goe.b(f2, new vq4(), new vq4())).getClass();
                acbVar = new acb(0, ((Boolean) goe.b(f2, Boolean.valueOf(acbVar4.a), Boolean.valueOf(acbVar3.a))).booleanValue());
            }
        }
        return new tjf(foeVar3, new l3b(i2, i3, jC3, nhfVar3, acbVar, (fx8) goe.b(f2, l3bVar.f, l3bVar2.f), ((bx8) goe.b(f2, new bx8(l3bVar.g), new bx8(l3bVar2.g))).a, ((zm6) goe.b(f2, new zm6(l3bVar.h), new zm6(l3bVar2.h))).a, (wif) goe.b(f2, l3bVar.i, l3bVar2.i)));
    }

    public static final void s(ViewGroup viewGroup, MotionEvent motionEvent) {
        qfd qfdVarX = pyd.x(viewGroup);
        if (qfdVarX != null) {
            qfdVarX.e(viewGroup, motionEvent);
        }
    }

    public static final void t(ViewGroup viewGroup, MotionEvent motionEvent) {
        motionEvent.getClass();
        qfd qfdVarX = pyd.x(viewGroup);
        if (qfdVarX != null) {
            qfdVarX.b(viewGroup, motionEvent);
        }
    }

    public static ka8 u(nb8 nb8Var) {
        boolean z;
        try {
            try {
                nb8Var.j0();
                z = false;
                try {
                    return (ka8) svf.z.a(nb8Var);
                } catch (EOFException e2) {
                    e = e2;
                    if (z) {
                        return xa8.a;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (MalformedJsonException e3) {
                throw new JsonSyntaxException(e3);
            } catch (IOException e4) {
                throw new JsonIOException(e4);
            } catch (NumberFormatException e5) {
                throw new JsonSyntaxException(e5);
            }
        } catch (EOFException e6) {
            e = e6;
            z = true;
        }
    }

    public static final String v(n8a n8aVar) {
        n8aVar.getClass();
        String strC = n8aVar.c();
        strC.getClass();
        if (!th8.a.contains(strC)) {
            int i = 0;
            while (true) {
                if (i < strC.length()) {
                    char cCharAt = strC.charAt(i);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i++;
                } else if (strC.length() != 0 && Character.isJavaIdentifierStart(strC.codePointAt(0))) {
                    String strC2 = n8aVar.c();
                    strC2.getClass();
                    return strC2;
                }
            }
        }
        String strC3 = n8aVar.c();
        strC3.getClass();
        return "`".concat(strC3).concat("`");
    }

    public static final String w(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n8a n8aVar = (n8a) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(v(n8aVar));
        }
        return sb.toString();
    }

    public static final String x(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str3.getClass();
        if (!wve.K(str, str2, false) || !wve.K(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (F(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.tjf y(defpackage.tjf r30, defpackage.vl8 r31) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.web.y(tjf, vl8):tjf");
    }

    public static void z(FragmentManager fragmentManager, int i) {
        fragmentManager.getClass();
        n nVar = fragmentManager.c;
        List<Fragment> listF = nVar.f();
        listF.getClass();
        if (listF.isEmpty()) {
            return;
        }
        Iterator<Fragment> it = nVar.f().iterator();
        while (it.hasNext()) {
            View view = it.next().getView();
            if (view != null) {
                view.setImportantForAccessibility(i);
            }
        }
    }

    @Override // defpackage.b6d
    public f5d c(f5d f5dVar, ova ovaVar) {
        return f5dVar;
    }

    public vh8 o() {
        vh8 vh8Var = d;
        if (vh8Var != null) {
            return vh8Var;
        }
        r6.g("KoinApplication has not been started");
        return null;
    }

    @Override // defpackage.nvh
    public Object zza() {
        ssh xshVar;
        BufferedReader bufferedReader;
        HashMap map;
        switch (this.a) {
            case 6:
                List<svh<?>> list = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zzj());
            case 7:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((rhi) shi.b.zza()).zza());
            case 8:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((idi) ldi.b.zza()).zza());
            default:
                Context contextCreateDeviceProtectedStorageContext = hrh.g;
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                    return qsh.a;
                }
                if (!contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                    contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                }
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    StrictMode.allowThreadDiskWrites();
                    File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                    xshVar = file.exists() ? new xsh(file) : qsh.a;
                } catch (RuntimeException e2) {
                    Log.e("HermeticFileOverrides", "no data dir", e2);
                    xshVar = qsh.a;
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
                if (!xshVar.a()) {
                    return qsh.a;
                }
                File file2 = (File) xshVar.b();
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                    try {
                        map = new HashMap();
                    } finally {
                        try {
                            break;
                        } catch (Throwable th) {
                        }
                    }
                } catch (IOException e3) {
                    l5.r(e3);
                    return null;
                }
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String strValueOf = String.valueOf(file2);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
                        sb.append("Parsed ");
                        sb.append(strValueOf);
                        Log.i("HermeticFileOverrides", sb.toString());
                        drh drhVar = new drh(map);
                        bufferedReader.close();
                        return new xsh(drhVar);
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length != 3) {
                        Log.e("HermeticFileOverrides", line.length() != 0 ? "Invalid: ".concat(line) : new String("Invalid: "));
                    } else {
                        String str3 = strArrSplit[0];
                        String strDecode = Uri.decode(strArrSplit[1]);
                        String strDecode2 = Uri.decode(strArrSplit[2]);
                        if (!map.containsKey(str3)) {
                            map.put(str3, new HashMap());
                        }
                        ((Map) map.get(str3)).put(strDecode, strDecode2);
                    }
                    l5.r(e3);
                    return null;
                }
        }
    }
}
