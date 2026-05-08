package defpackage;

import defpackage.ha;
import defpackage.yda;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dea implements ga<yda.d> {
    public static final dea a = new dea();
    public static final List<String> b = u63.a0("id", "destinationUrl", "label", "subtitle");

    @Override // defpackage.ga
    public final yda.d a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        vca vcaVar = null;
        Object objA = null;
        String str = null;
        String strA = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                String strI0 = mb8Var.I0();
                strI0.getClass();
                vca.a.getClass();
                Iterator<T> it = vca.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b(((vca) next).a(), strI0)) {
                        break;
                    }
                }
                vca vcaVar2 = (vca) next;
                vcaVar = vcaVar2 == null ? vca.c : vcaVar2;
            } else if (iD1 == 1) {
                objA = ha.g.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                strA = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (vcaVar == null) {
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (objA == null) {
            mh2.q(mb8Var, "destinationUrl");
            throw null;
        }
        if (str != null) {
            return new yda.d(vcaVar, objA, str, strA);
        }
        mh2.q(mb8Var, "label");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, yda.d dVar) {
        yda.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("id");
        hc8Var.T0(dVar2.a.a());
        hc8Var.u0("destinationUrl");
        ha.g gVar = ha.a;
        f.a(hc8Var, dVar2.b);
        hc8Var.u0("label");
        ha.a.b(hc8Var, lb3Var, dVar2.c);
        hc8Var.u0("subtitle");
        ha.i.b(hc8Var, lb3Var, dVar2.d);
    }
}
