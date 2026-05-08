package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f0g implements ga<e0g> {
    public static final f0g a = new f0g();

    @Override // defpackage.ga
    public final e0g a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e0g e0gVar) {
        e0g e0gVar2 = e0gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        e0gVar2.getClass();
        hva<List<n9c>> hvaVar = e0gVar2.i;
        hva<p9c> hvaVar2 = e0gVar2.h;
        hva<String> hvaVar3 = e0gVar2.g;
        hva<fjg> hvaVar4 = e0gVar2.f;
        hva<String> hvaVar5 = e0gVar2.e;
        hc8Var.u0("userInteractionType");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, e0gVar2.a);
        hc8Var.u0("userInteractionTarget");
        gVar.b(hc8Var, lb3Var, e0gVar2.b);
        hc8Var.u0("contextKey");
        gVar.b(hc8Var, lb3Var, e0gVar2.c);
        hva<String> hvaVar6 = e0gVar2.d;
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("crowTaxoQuestionSuid");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar6);
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("userInteractionTargetSuid");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("userInteractionSurface");
            gjg gjgVar = gjg.a;
            V v = ((hva.c) hvaVar4).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                gjgVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("questionLabel");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("questionSource");
            q9c q9cVar = q9c.a;
            V v2 = ((hva.c) hvaVar2).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                q9cVar.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("questionAttributeAnswers");
            hy8 hy8Var = new hy8(new ena(o9c.a, false));
            V v3 = ((hva.c) hvaVar).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v3);
            }
        }
    }
}
