package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vp5 extends pa5 {
    public final pa5 c;

    public vp5(pa5 pa5Var) {
        pa5Var.getClass();
        this.c = pa5Var;
    }

    @Override // defpackage.pa5
    public final fie a(w5b w5bVar) {
        w5bVar.getClass();
        return this.c.a(w5bVar);
    }

    @Override // defpackage.pa5
    public final void b(w5b w5bVar, w5b w5bVar2) {
        w5bVar.getClass();
        w5bVar2.getClass();
        this.c.b(w5bVar, w5bVar2);
    }

    @Override // defpackage.pa5
    public final void d(w5b w5bVar) {
        this.c.d(w5bVar);
    }

    @Override // defpackage.pa5
    public final void e(w5b w5bVar) {
        w5bVar.getClass();
        this.c.e(w5bVar);
    }

    @Override // defpackage.pa5
    public final List<w5b> h(w5b w5bVar) {
        w5bVar.getClass();
        List<w5b> listH = this.c.h(w5bVar);
        ArrayList arrayList = new ArrayList();
        for (w5b w5bVar2 : listH) {
            w5bVar2.getClass();
            arrayList.add(w5bVar2);
        }
        w92.D0(arrayList);
        return arrayList;
    }

    @Override // defpackage.pa5
    public final da5 j(w5b w5bVar) {
        w5bVar.getClass();
        da5 da5VarJ = this.c.j(w5bVar);
        if (da5VarJ == null) {
            return null;
        }
        w5b w5bVar2 = da5VarJ.c;
        if (w5bVar2 == null) {
            return da5VarJ;
        }
        boolean z = da5VarJ.a;
        boolean z2 = da5VarJ.b;
        Long l = da5VarJ.d;
        Long l2 = da5VarJ.e;
        Long l3 = da5VarJ.f;
        Long l4 = da5VarJ.g;
        Map<yd8<?>, Object> map = da5VarJ.h;
        map.getClass();
        return new da5(z, z2, w5bVar2, l, l2, l3, l4, map);
    }

    @Override // defpackage.pa5
    public final p95 k(w5b w5bVar) {
        w5bVar.getClass();
        return this.c.k(w5bVar);
    }

    @Override // defpackage.pa5
    public final pne m(w5b w5bVar) {
        w5bVar.getClass();
        return this.c.m(w5bVar);
    }

    public final String toString() {
        return fwc.a.b(getClass()).r() + '(' + this.c + ')';
    }
}
