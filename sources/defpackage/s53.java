package defpackage;

import defpackage.ha;
import defpackage.q53;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s53 implements ga<q53.a> {
    public static final s53 a = new s53();
    public static final List<String> b = u63.a0("ctk", "externalId", "externalIdType");

    @Override // defpackage.ga
    public final q53.a a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        woa woaVar = null;
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
                String strI0 = mb8Var.I0();
                strI0.getClass();
                woa.a.getClass();
                Iterator<T> it = woa.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b(((woa) next).a(), strI0)) {
                        break;
                    }
                }
                woa woaVar2 = (woa) next;
                woaVar = woaVar2 == null ? woa.c : woaVar2;
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "ctk");
            throw null;
        }
        if (str2 == null) {
            mh2.q(mb8Var, "externalId");
            throw null;
        }
        if (woaVar != null) {
            return new q53.a(str, str2, woaVar);
        }
        mh2.q(mb8Var, "externalIdType");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, q53.a aVar) {
        q53.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("ctk");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, aVar2.a);
        hc8Var.u0("externalId");
        gVar.b(hc8Var, lb3Var, aVar2.b);
        hc8Var.u0("externalIdType");
        hc8Var.T0(aVar2.c.a());
    }
}
