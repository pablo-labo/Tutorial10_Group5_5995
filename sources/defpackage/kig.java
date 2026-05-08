package defpackage;

import defpackage.ha;
import defpackage.hig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kig implements ga<hig.b> {
    public static final kig a = new kig();
    public static final List<String> b = u63.a0("destinationUrl", "id", "label");

    @Override // defpackage.ga
    public final hig.b a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        Object objA = null;
        vca vcaVar = null;
        String strA = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                objA = ha.g.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
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
            } else {
                if (iD1 != 2) {
                    break;
                }
                strA = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (objA == null) {
            mh2.q(mb8Var, "destinationUrl");
            throw null;
        }
        if (vcaVar != null) {
            return new hig.b(vcaVar, objA, strA);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, hig.b bVar) {
        hig.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("destinationUrl");
        ha.g gVar = ha.a;
        f.a(hc8Var, bVar2.a);
        hc8Var.u0("id");
        hc8Var.T0(bVar2.b.a());
        hc8Var.u0("label");
        ha.i.b(hc8Var, lb3Var, bVar2.c);
    }
}
