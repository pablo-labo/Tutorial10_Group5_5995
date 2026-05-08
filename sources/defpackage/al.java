package defpackage;

import com.datadog.android.log.LogAttributes;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class al implements ga<zk> {
    public static final al a = new al();

    @Override // defpackage.ga
    public final zk a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, zk zkVar) {
        zk zkVar2 = zkVar;
        hc8Var.getClass();
        lb3Var.getClass();
        zkVar2.getClass();
        hva<String> hvaVar = zkVar2.d;
        hva<String> hvaVar2 = zkVar2.c;
        hc8Var.u0("title");
        ha.a.b(hc8Var, lb3Var, zkVar2.a);
        hva<d18> hvaVar3 = zkVar2.b;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0(LogAttributes.DATE);
            ena enaVar = new ena(e18.a, false);
            V v = ((hva.c) hvaVar3).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("description");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("url");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
