package defpackage;

import defpackage.jv2;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qv2 implements ga<jv2.f> {
    public static final qv2 a = new qv2();
    public static final List<String> b = u63.a0("key", "value");

    @Override // defpackage.ga
    public final jv2.f a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        qy2 qy2Var = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                String strI0 = mb8Var.I0();
                strI0.getClass();
                qy2.a.getClass();
                Iterator<T> it = qy2.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b(((qy2) next).a(), strI0)) {
                        break;
                    }
                }
                qy2 qy2Var2 = (qy2) next;
                qy2Var = qy2Var2 == null ? qy2.d : qy2Var2;
            } else {
                if (iD1 != 1) {
                    break;
                }
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (qy2Var == null) {
            mh2.q(mb8Var, "key");
            throw null;
        }
        if (str != null) {
            return new jv2.f(qy2Var, str);
        }
        mh2.q(mb8Var, "value");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jv2.f fVar) {
        jv2.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("key");
        hc8Var.T0(fVar2.a.a());
        hc8Var.u0("value");
        ha.a.b(hc8Var, lb3Var, fVar2.b);
    }
}
