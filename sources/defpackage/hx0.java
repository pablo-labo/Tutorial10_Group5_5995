package defpackage;

import com.datadog.android.log.LogAttributes;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class hx0 implements ga<gx0> {
    public static final hx0 a = new hx0();

    @Override // defpackage.ga
    public final gx0 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, gx0 gx0Var) {
        gx0 gx0Var2 = gx0Var;
        hc8Var.getClass();
        lb3Var.getClass();
        gx0Var2.getClass();
        hva<String> hvaVar = gx0Var2.f;
        hva<String> hvaVar2 = gx0Var2.e;
        hva<String> hvaVar3 = gx0Var2.d;
        hva<String> hvaVar4 = gx0Var2.c;
        hva<String> hvaVar5 = gx0Var2.b;
        hva<String> hvaVar6 = gx0Var2.a;
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("sid");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar6);
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("kw");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("pub");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("existingCookieValue");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("referrer");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0(LogAttributes.HOST);
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
