package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.p5a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x5a implements ga<p5a.g> {
    public static final x5a a = new x5a();
    public static final List<String> b = u63.a0("status", "type", "fullApplyRequested", "canTalkToEmployer", "sentAt", "recipient", "sender", "ctaButtons", "id");

    @Override // defpackage.ga
    public final p5a.g a(mb8 mb8Var, lb3 lb3Var) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Object next;
        Object next2;
        mb8Var.getClass();
        lb3Var.getClass();
        Boolean bool4 = null;
        vn7 vn7Var = null;
        xn7 xn7Var = null;
        Boolean bool5 = null;
        Object objA = null;
        p5a.m mVar = null;
        p5a.n nVar = null;
        ArrayList arrayList = null;
        String str = null;
        while (true) {
            switch (mb8Var.D1(b)) {
                case 0:
                    bool2 = bool4;
                    bool3 = bool5;
                    String strI0 = mb8Var.I0();
                    strI0.getClass();
                    vn7.a.getClass();
                    Iterator<T> it = vn7.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (wl7.b(((vn7) next).a(), strI0)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    vn7 vn7Var2 = (vn7) next;
                    vn7Var = vn7Var2 == null ? vn7.c : vn7Var2;
                    bool4 = bool2;
                    bool5 = bool3;
                    break;
                case 1:
                    bool2 = bool4;
                    bool3 = bool5;
                    String strI02 = mb8Var.I0();
                    strI02.getClass();
                    xn7.a.getClass();
                    Iterator<T> it2 = xn7.e.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (wl7.b(((xn7) next2).a(), strI02)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    xn7 xn7Var2 = (xn7) next2;
                    xn7Var = xn7Var2 == null ? xn7.c : xn7Var2;
                    bool4 = bool2;
                    bool5 = bool3;
                    break;
                case 2:
                    bool4 = (Boolean) ha.f.a(mb8Var, lb3Var);
                    break;
                case 3:
                    bool = bool4;
                    bool5 = (Boolean) ha.f.a(mb8Var, lb3Var);
                    bool4 = bool;
                    break;
                case 4:
                    bool = bool4;
                    objA = ha.g.a(mb8Var, lb3Var);
                    bool4 = bool;
                    break;
                case 5:
                    bool2 = bool4;
                    bool3 = bool5;
                    d6a d6aVar = d6a.a;
                    ha.g gVar = ha.a;
                    mVar = (p5a.m) new ena(d6aVar, false).a(mb8Var, lb3Var);
                    bool4 = bool2;
                    bool5 = bool3;
                    break;
                case 6:
                    bool2 = bool4;
                    bool3 = bool5;
                    e6a e6aVar = e6a.a;
                    ha.g gVar2 = ha.a;
                    nVar = (p5a.n) new ena(e6aVar, false).a(mb8Var, lb3Var);
                    bool4 = bool2;
                    bool5 = bool3;
                    break;
                case 7:
                    bool2 = bool4;
                    bool3 = bool5;
                    t5a t5aVar = t5a.a;
                    ha.g gVar3 = ha.a;
                    ena enaVar = new ena(t5aVar, false);
                    mb8Var.m();
                    arrayList = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList.add(enaVar.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e;
                        }
                    }
                    mb8Var.l();
                    bool4 = bool2;
                    bool5 = bool3;
                    break;
                case 8:
                    bool = bool4;
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    bool4 = bool;
                    break;
                default:
                    Boolean bool6 = bool4;
                    if (vn7Var == null) {
                        mh2.q(mb8Var, "status");
                        throw null;
                    }
                    if (xn7Var == null) {
                        mh2.q(mb8Var, "type");
                        throw null;
                    }
                    if (bool6 == null) {
                        mh2.q(mb8Var, "fullApplyRequested");
                        throw null;
                    }
                    Boolean bool7 = bool5;
                    boolean zBooleanValue = bool6.booleanValue();
                    if (bool7 == null) {
                        mh2.q(mb8Var, "canTalkToEmployer");
                        throw null;
                    }
                    boolean zBooleanValue2 = bool7.booleanValue();
                    if (objA == null) {
                        mh2.q(mb8Var, "sentAt");
                        throw null;
                    }
                    if (mVar == null) {
                        mh2.q(mb8Var, "recipient");
                        throw null;
                    }
                    if (nVar == null) {
                        mh2.q(mb8Var, "sender");
                        throw null;
                    }
                    if (arrayList == null) {
                        mh2.q(mb8Var, "ctaButtons");
                        throw null;
                    }
                    if (str != null) {
                        return new p5a.g(vn7Var, xn7Var, zBooleanValue, zBooleanValue2, objA, mVar, nVar, arrayList, str);
                    }
                    mh2.q(mb8Var, "id");
                    throw null;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.g gVar) {
        p5a.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("status");
        hc8Var.T0(gVar2.a.a());
        hc8Var.u0("type");
        hc8Var.T0(gVar2.b.a());
        hc8Var.u0("fullApplyRequested");
        ha.b bVar = ha.f;
        bVar.b(hc8Var, lb3Var, Boolean.valueOf(gVar2.c));
        hc8Var.u0("canTalkToEmployer");
        bVar.b(hc8Var, lb3Var, Boolean.valueOf(gVar2.d));
        hc8Var.u0("sentAt");
        ha.g gVar3 = ha.a;
        f.a(hc8Var, gVar2.e);
        hc8Var.u0("recipient");
        d6a d6aVar = d6a.a;
        p5a.m mVar = gVar2.f;
        hc8Var.j();
        d6aVar.b(hc8Var, lb3Var, mVar);
        hc8Var.t();
        hc8Var.u0("sender");
        e6a e6aVar = e6a.a;
        p5a.n nVar = gVar2.g;
        hc8Var.j();
        e6aVar.b(hc8Var, lb3Var, nVar);
        hc8Var.t();
        hc8Var.u0("ctaButtons");
        t5a t5aVar = t5a.a;
        ArrayList arrayList = gVar2.h;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            t5aVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, gVar2.i);
    }
}
