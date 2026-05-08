package defpackage;

import defpackage.ha;
import defpackage.wt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class au implements ga<wt.c> {
    public static final au a = new au();
    public static final List<String> b = u63.a0("resumeFileId", "clientName", "status");

    @Override // defpackage.ga
    public final wt.c a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        u8d u8dVar = null;
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
                u8d.a.getClass();
                Iterator<T> it = u8d.X.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b(((u8d) next).a(), strI0)) {
                        break;
                    }
                }
                u8d u8dVar2 = (u8d) next;
                u8dVar = u8dVar2 == null ? u8d.V : u8dVar2;
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "resumeFileId");
            throw null;
        }
        if (str2 == null) {
            mh2.q(mb8Var, "clientName");
            throw null;
        }
        if (u8dVar != null) {
            return new wt.c(str, str2, u8dVar);
        }
        mh2.q(mb8Var, "status");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wt.c cVar) {
        wt.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("resumeFileId");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("clientName");
        gVar.b(hc8Var, lb3Var, cVar2.b);
        hc8Var.u0("status");
        hc8Var.T0(cVar2.c.a());
    }
}
