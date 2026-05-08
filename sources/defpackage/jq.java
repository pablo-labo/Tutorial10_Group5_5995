package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jq implements ga<iq> {
    public static final jq a = new jq();

    @Override // defpackage.ga
    public final iq a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, iq iqVar) {
        iq iqVar2 = iqVar;
        hc8Var.getClass();
        lb3Var.getClass();
        iqVar2.getClass();
        hva<List<y08>> hvaVar = iqVar2.e;
        hva<List<o48>> hvaVar2 = iqVar2.d;
        hc8Var.u0("label");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, iqVar2.a);
        hc8Var.u0("suid");
        gVar.b(hc8Var, lb3Var, iqVar2.b);
        hva<String> hvaVar3 = iqVar2.c;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("type");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("sectionIds");
            hy8 hy8Var = new hy8(new ena(xp.d, false));
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
            hy8 hy8Var2 = new hy8(new ena(qo.c, false));
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                hy8Var2.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
