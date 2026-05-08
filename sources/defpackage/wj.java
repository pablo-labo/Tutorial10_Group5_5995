package defpackage;

import com.datadog.android.log.LogAttributes;
import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class wj implements ga<vj> {
    public static final wj a = new wj();

    @Override // defpackage.ga
    public final vj a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vj vjVar) {
        vj vjVar2 = vjVar;
        hc8Var.getClass();
        lb3Var.getClass();
        vjVar2.getClass();
        hva<String> hvaVar = vjVar2.b;
        hva<d18> hvaVar2 = vjVar2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0(LogAttributes.DATE);
            ha.g gVar = ha.a;
            ena enaVar = new ena(e18.a, false);
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("description");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
        hc8Var.u0("title");
        ha.a.b(hc8Var, lb3Var, vjVar2.c);
    }
}
