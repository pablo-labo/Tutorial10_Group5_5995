package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yeg implements ga<xeg> {
    public static final yeg a = new yeg();

    @Override // defpackage.ga
    public final xeg a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xeg xegVar) {
        xeg xegVar2 = xegVar;
        hc8Var.getClass();
        lb3Var.getClass();
        xegVar2.getClass();
        hva<List<y08>> hvaVar = xegVar2.e;
        hva<List<o48>> hvaVar2 = xegVar2.d;
        hva<String> hvaVar3 = xegVar2.c;
        hva<String> hvaVar4 = xegVar2.b;
        hva<String> hvaVar5 = xegVar2.a;
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("label");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("suid");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("type");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("sectionIds");
            xp xpVar = xp.d;
            ha.g gVar = ha.a;
            hy8 hy8Var = new hy8(new ena(xpVar, false));
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
            qo qoVar = qo.c;
            ha.g gVar2 = ha.a;
            hy8 hy8Var2 = new hy8(new ena(qoVar, false));
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                hy8Var2.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
