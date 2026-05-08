package defpackage;

import android.os.Bundle;
import android.os.Looper;
import androidx.media3.session.g;
import androidx.media3.session.j;
import androidx.media3.session.k;
import androidx.media3.session.m;
import defpackage.gdb;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh9 implements k.c, m.a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mh9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.media3.session.m.a
    public void f(k kVar) {
        boolean z;
        boolean z2;
        boolean z3;
        w8e w8eVar = (w8e) this.a;
        gdb.a aVar = (gdb.a) this.b;
        if (kVar.o0()) {
            boolean zEquals = Objects.equals(kVar.w, aVar);
            boolean zEquals2 = Objects.equals(kVar.v, w8eVar);
            if (zEquals && zEquals2) {
                return;
            }
            kVar.v = w8eVar;
            if (zEquals) {
                z = false;
            } else {
                kVar.w = aVar;
                gdb.a aVar2 = kVar.y;
                gdb.a aVarT0 = k.T0(aVar, kVar.x);
                kVar.y = aVarT0;
                z = !aVarT0.equals(aVar2);
            }
            if (!zEquals2 || z) {
                qyc qycVar = kVar.t;
                qyc qycVar2 = kVar.u;
                qyc qycVarQ1 = k.q1(kVar.s, kVar.r, w8eVar, kVar.y, kVar.I);
                kVar.t = qycVarQ1;
                kVar.u = k.p1(qycVarQ1, kVar.r, kVar.I, w8eVar, kVar.y);
                z2 = !kVar.t.equals(qycVar);
                z3 = !kVar.u.equals(qycVar2);
            } else {
                z2 = false;
                z3 = false;
            }
            if (z) {
                kVar.i.f(13, new jl3(kVar, 3));
            }
            if (!zEquals2) {
                j jVarZ0 = kVar.Z0();
                jVarZ0.getClass();
                ka2.q(Looper.myLooper() == jVarZ0.e.getLooper());
                jVarZ0.d.F();
            }
            if (z3) {
                j jVarZ02 = kVar.Z0();
                jVarZ02.getClass();
                ka2.q(Looper.myLooper() == jVarZ02.e.getLooper());
                jVarZ02.d.getClass();
            }
            if (z2) {
                j jVarZ03 = kVar.Z0();
                jVarZ03.getClass();
                ka2.q(Looper.myLooper() == jVarZ03.e.getLooper());
                jVarZ03.d.x();
            }
        }
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        k kVar = (k) this.a;
        cdb cdbVar = (cdb) this.b;
        m mVar = kVar.c;
        Bundle bundle = new Bundle();
        bundle.putFloat(cdb.e, cdbVar.a);
        bundle.putFloat(cdb.f, cdbVar.b);
        gVar.u0(mVar, i, bundle);
    }
}
