package defpackage;

import com.datadog.android.log.LogAttributes;
import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class yk implements ga<xk> {
    public static final yk a = new yk();

    @Override // defpackage.ga
    public final xk a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xk xkVar) {
        xk xkVar2 = xkVar;
        hc8Var.getClass();
        lb3Var.getClass();
        xkVar2.getClass();
        hva<String> hvaVar = xkVar2.e;
        hva<String> hvaVar2 = xkVar2.d;
        hc8Var.u0("title");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, xkVar2.a);
        hc8Var.u0("patentNumber");
        gVar.b(hc8Var, lb3Var, xkVar2.b);
        hva<d18> hvaVar3 = xkVar2.c;
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
