package defpackage;

import com.datadog.android.log.LogAttributes;
import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class k9g implements ga<j9g> {
    public static final k9g a = new k9g();

    @Override // defpackage.ga
    public final j9g a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j9g j9gVar) {
        j9g j9gVar2 = j9gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        j9gVar2.getClass();
        hva<String> hvaVar = j9gVar2.c;
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, j9gVar2.a);
        hva<d18> hvaVar2 = j9gVar2.b;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0(LogAttributes.DATE);
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
        gVar.b(hc8Var, lb3Var, j9gVar2.d);
    }
}
