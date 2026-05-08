package defpackage;

import defpackage.ge0;
import defpackage.oh5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xi3<T, V extends ge0> implements sd0<T, V> {
    public final qmg a;
    public final lvf<T, V> b;
    public final T c;
    public final V d;
    public final V e;
    public final V f;
    public final T g;
    public final long h;

    public xi3(yi3<T> yi3Var, lvf<T, V> lvfVar, T t, V v) {
        qmg qmgVarB = yi3Var.b();
        this.a = qmgVarB;
        this.b = lvfVar;
        this.c = t;
        V vInvoke = lvfVar.a().invoke(t);
        this.d = vInvoke;
        this.e = (V) ewa.o(v);
        this.g = (T) lvfVar.b().invoke(qmgVarB.b(vInvoke, v));
        if (qmgVarB.c == null) {
            qmgVarB.c = (V) vInvoke.c();
        }
        V v2 = qmgVarB.c;
        if (v2 == null) {
            wl7.g("velocityVector");
            throw null;
        }
        int iB = v2.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            npe npeVar = qmgVarB.a;
            vInvoke.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(npeVar.a.b(v.a(i)) / (((double) ph5.a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.h = jMax;
        V v3 = (V) ewa.o(qmgVarB.c(jMax, vInvoke, v));
        this.f = v3;
        int iB2 = v3.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            V v4 = this.f;
            v4.e(nic.B(v4.a(i2), -this.a.a(), this.a.a()), i2);
        }
    }

    @Override // defpackage.sd0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.sd0
    public final V b(long j) {
        if (c(j)) {
            return this.f;
        }
        return (V) this.a.c(j, this.d, this.e);
    }

    @Override // defpackage.sd0
    public final long d() {
        return this.h;
    }

    @Override // defpackage.sd0
    public final lvf<T, V> e() {
        return this.b;
    }

    @Override // defpackage.sd0
    public final T f(long j) {
        if (c(j)) {
            return this.g;
        }
        Function1<V, T> function1B = this.b.b();
        qmg qmgVar = this.a;
        V v = qmgVar.b;
        V v2 = this.d;
        if (v == null) {
            qmgVar.b = (V) v2.c();
        }
        V v3 = qmgVar.b;
        if (v3 == null) {
            wl7.g("valueVector");
            throw null;
        }
        int iB = v3.b();
        int i = 0;
        while (true) {
            V v4 = qmgVar.b;
            if (i >= iB) {
                if (v4 != null) {
                    return function1B.invoke(v4);
                }
                wl7.g("valueVector");
                throw null;
            }
            if (v4 == null) {
                wl7.g("valueVector");
                throw null;
            }
            npe npeVar = qmgVar.a;
            float fA = v2.a(i);
            long j2 = j / 1000000;
            oh5.a aVarA = npeVar.a.a(this.e.a(i));
            long j3 = aVarA.c;
            v4.e((Math.signum(aVarA.a) * aVarA.b * l70.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA, i);
            i++;
        }
    }

    @Override // defpackage.sd0
    public final T g() {
        return this.g;
    }
}
