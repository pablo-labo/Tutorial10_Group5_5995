package defpackage;

import defpackage.lz9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class x0f {
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object a(float f, float f2, float f3, yd0 yd0Var, Function2 function2, c1f c1fVar) {
        mvf mvfVar = q92.c0;
        Object f4 = new Float(f);
        Float f5 = new Float(f2);
        Object f6 = new Float(f3);
        Function1<T, V> function1 = mvfVar.a;
        ge0 ge0VarC = (ge0) function1.invoke((T) f6);
        if (ge0VarC == null) {
            ge0VarC = ((ge0) function1.invoke((T) f4)).c();
        }
        ge0 ge0Var = ge0VarC;
        Object objB = b(new ae0(mvfVar, f4, ge0Var, 56), new aaf(yd0Var, mvfVar, f4, f5, ge0Var), Long.MIN_VALUE, new pq(function2, 16), c1fVar);
        g13 g13Var = g13.a;
        if (objB != g13Var) {
            objB = j6g.a;
        }
        return objB == g13Var ? objB : j6g.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, xd0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.ae0 r22, defpackage.sd0 r23, long r24, final kotlin.jvm.functions.Function1 r26, defpackage.pu2 r27) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x0f.b(ae0, sd0, long, kotlin.jvm.functions.Function1, pu2):java.lang.Object");
    }

    public static /* synthetic */ Object c(float f, float f2, yd0 yd0Var, Function2 function2, c1f c1fVar, int i) {
        if ((i & 8) != 0) {
            yd0Var = zd0.c(0.0f, null, 7);
        }
        return a(f, f2, 0.0f, yd0Var, function2, c1fVar);
    }

    public static final Object d(ae0 ae0Var, yi3 yi3Var, boolean z, Function1 function1, pu2 pu2Var) {
        Object objB = b(ae0Var, new xi3(yi3Var, ae0Var.a, ((gme) ae0Var.b).getValue(), ae0Var.c), z ? ae0Var.d : Long.MIN_VALUE, function1, pu2Var);
        return objB == g13.a ? objB : j6g.a;
    }

    public static final Object e(ae0 ae0Var, Float f, yd0 yd0Var, boolean z, Function1 function1, pu2 pu2Var) {
        Object objB = b(ae0Var, new aaf(yd0Var, ae0Var.a, ((gme) ae0Var.b).getValue(), f, ae0Var.c), z ? ae0Var.d : Long.MIN_VALUE, function1, pu2Var);
        return objB == g13.a ? objB : j6g.a;
    }

    public static /* synthetic */ Object f(ae0 ae0Var, Float f, yd0 yd0Var, boolean z, Function1 function1, pu2 pu2Var, int i) {
        if ((i & 2) != 0) {
            yd0Var = zd0.c(0.0f, null, 7);
        }
        yd0 yd0Var2 = yd0Var;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = new nf(26);
        }
        return e(ae0Var, f, yd0Var2, z2, function1, pu2Var);
    }

    public static final <T, V extends ge0> void g(xd0<T, V> xd0Var, long j, float f, sd0<T, V> sd0Var, ae0<T, V> ae0Var, Function1<? super xd0<T, V>, j6g> function1) {
        long jD = f == 0.0f ? sd0Var.d() : (long) ((j - xd0Var.c) / f);
        xd0Var.g = j;
        ((gme) xd0Var.e).setValue(sd0Var.f(jD));
        xd0Var.f = (V) sd0Var.b(jD);
        if (sd0Var.c(jD)) {
            xd0Var.h = xd0Var.g;
            ((gme) xd0Var.i).setValue(Boolean.FALSE);
        }
        i(xd0Var, ae0Var);
        function1.invoke(xd0Var);
    }

    public static final float h(v03 v03Var) {
        lz9 lz9Var = (lz9) v03Var.h1(lz9.a.a);
        float fQ = lz9Var != null ? lz9Var.Q() : 1.0f;
        if (fQ >= 0.0f) {
            return fQ;
        }
        hib.b("negative scale factor");
        return fQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, V extends ge0> void i(xd0<T, V> xd0Var, ae0<T, V> ae0Var) {
        ((gme) ae0Var.b).setValue(((gme) xd0Var.e).getValue());
        V v = ae0Var.c;
        V v2 = xd0Var.f;
        int iB = v.b();
        for (int i = 0; i < iB; i++) {
            v.e(v2.a(i), i);
        }
        ae0Var.e = xd0Var.h;
        ae0Var.d = xd0Var.g;
        ae0Var.f = ((Boolean) ((gme) xd0Var.i).getValue()).booleanValue();
    }
}
