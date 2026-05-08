package defpackage;

import defpackage.ha;
import defpackage.ic5;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qc5 implements ga<ic5.g> {
    public static final qc5 a = new qc5();
    public static final List<String> b = u63.a0("id", "label", "tag");

    @Override // defpackage.ga
    public final ic5.g a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        ic5.e eVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                oc5 oc5Var = oc5.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(oc5Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                eVar = (ic5.e) objA;
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (str2 != null) {
            return new ic5.g(str, str2, eVar);
        }
        mh2.q(mb8Var, "label");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ic5.g gVar) {
        ic5.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("id");
        ha.g gVar3 = ha.a;
        gVar3.b(hc8Var, lb3Var, gVar2.a);
        hc8Var.u0("label");
        gVar3.b(hc8Var, lb3Var, gVar2.b);
        hc8Var.u0("tag");
        ena enaVar = new ena(oc5.a, false);
        ic5.e eVar = gVar2.c;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
