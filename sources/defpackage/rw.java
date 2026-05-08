package defpackage;

import defpackage.ha;
import defpackage.ow;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rw implements ga<ow.b> {
    public static final rw a = new rw();
    public static final List<String> b = u63.a0("id", "label", "modifiedTime", "sentiment", "suid");

    @Override // defpackage.ga
    public final ow.b a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        Object objA = null;
        i68 i68Var = null;
        String str3 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                objA = ha.g.a(mb8Var, lb3Var);
            } else if (iD1 == 3) {
                String strI0 = mb8Var.I0();
                strI0.getClass();
                i68.a.getClass();
                Iterator<T> it = i68.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b(((i68) next).a(), strI0)) {
                        break;
                    }
                }
                i68 i68Var2 = (i68) next;
                i68Var = i68Var2 == null ? i68.d : i68Var2;
            } else {
                if (iD1 != 4) {
                    break;
                }
                str3 = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (str2 == null) {
            mh2.q(mb8Var, "label");
            throw null;
        }
        if (objA == null) {
            mh2.q(mb8Var, "modifiedTime");
            throw null;
        }
        if (i68Var == null) {
            mh2.q(mb8Var, "sentiment");
            throw null;
        }
        if (str3 != null) {
            return new ow.b(str, str2, objA, i68Var, str3);
        }
        mh2.q(mb8Var, "suid");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ow.b bVar) {
        ow.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("label");
        gVar.b(hc8Var, lb3Var, bVar2.b);
        hc8Var.u0("modifiedTime");
        ha.g gVar2 = ha.a;
        f.a(hc8Var, bVar2.c);
        hc8Var.u0("sentiment");
        hc8Var.T0(bVar2.d.a());
        hc8Var.u0("suid");
        gVar.b(hc8Var, lb3Var, bVar2.e);
    }
}
