package defpackage;

import com.datadog.android.log.LogAttributes;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class sag implements ga<rag> {
    public static final sag a = new sag();

    @Override // defpackage.ga
    public final rag a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rag ragVar) {
        rag ragVar2 = ragVar;
        hc8Var.getClass();
        lb3Var.getClass();
        ragVar2.getClass();
        hva<String> hvaVar = ragVar2.f;
        hva<String> hvaVar2 = ragVar2.e;
        hva<d18> hvaVar3 = ragVar2.d;
        hva<String> hvaVar4 = ragVar2.c;
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, ragVar2.a);
        hva<String> hvaVar5 = ragVar2.b;
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("title");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("patentNumber");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
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
