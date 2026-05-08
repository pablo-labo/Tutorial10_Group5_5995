package defpackage;

import com.datadog.android.log.LogAttributes;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class uag implements ga<tag> {
    public static final uag a = new uag();

    @Override // defpackage.ga
    public final tag a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, tag tagVar) {
        tag tagVar2 = tagVar;
        hc8Var.getClass();
        lb3Var.getClass();
        tagVar2.getClass();
        hva<String> hvaVar = tagVar2.e;
        hva<String> hvaVar2 = tagVar2.d;
        hva<d18> hvaVar3 = tagVar2.c;
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, tagVar2.a);
        hva<String> hvaVar4 = tagVar2.b;
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("title");
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
