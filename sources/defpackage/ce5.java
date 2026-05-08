package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ce5 implements ga<sd5.i> {
    public static final ce5 a = new ce5();
    public static final List<String> b = u63.a0("title", "sourceEmployerName", "employer", "location", "compensation", "indeedApply", "dateOnIndeed", "description");

    @Override // defpackage.ga
    public final sd5.i a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        sd5.d dVar = null;
        sd5.j jVar = null;
        sd5.a aVar = null;
        sd5.g gVar = null;
        Object objA3 = null;
        sd5.c cVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar2 = mb8.a.Y;
            switch (iD1) {
                case 0:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    str2 = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 2:
                    xd5 xd5Var = xd5.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar = new ena(xd5Var, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar.a(mb8Var, lb3Var);
                    }
                    dVar = (sd5.d) objA;
                    break;
                case 3:
                    de5 de5Var = de5.a;
                    ha.g gVar3 = ha.a;
                    jVar = (sd5.j) new ena(de5Var, false).a(mb8Var, lb3Var);
                    break;
                case 4:
                    ud5 ud5Var = ud5.a;
                    ha.g gVar4 = ha.a;
                    ena enaVar2 = new ena(ud5Var, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = enaVar2.a(mb8Var, lb3Var);
                    }
                    aVar = (sd5.a) objA2;
                    break;
                case 5:
                    ae5 ae5Var = ae5.a;
                    ha.g gVar5 = ha.a;
                    gVar = (sd5.g) new ena(ae5Var, false).a(mb8Var, lb3Var);
                    break;
                case 6:
                    objA3 = ha.g.a(mb8Var, lb3Var);
                    break;
                case 7:
                    wd5 wd5Var = wd5.a;
                    ha.g gVar6 = ha.a;
                    cVar = (sd5.c) new ena(wd5Var, false).a(mb8Var, lb3Var);
                    break;
                default:
                    if (str == null) {
                        mh2.q(mb8Var, "title");
                        throw null;
                    }
                    if (str2 == null) {
                        mh2.q(mb8Var, "sourceEmployerName");
                        throw null;
                    }
                    if (jVar == null) {
                        mh2.q(mb8Var, "location");
                        throw null;
                    }
                    if (gVar == null) {
                        mh2.q(mb8Var, "indeedApply");
                        throw null;
                    }
                    if (objA3 == null) {
                        mh2.q(mb8Var, "dateOnIndeed");
                        throw null;
                    }
                    if (cVar != null) {
                        return new sd5.i(str, str2, dVar, jVar, aVar, gVar, objA3, cVar);
                    }
                    mh2.q(mb8Var, "description");
                    throw null;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.i iVar) {
        sd5.i iVar2 = iVar;
        hc8Var.getClass();
        lb3Var.getClass();
        iVar2.getClass();
        hc8Var.u0("title");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, iVar2.a);
        hc8Var.u0("sourceEmployerName");
        gVar.b(hc8Var, lb3Var, iVar2.b);
        hc8Var.u0("employer");
        ena enaVar = new ena(xd5.a, false);
        sd5.d dVar = iVar2.c;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
        hc8Var.u0("location");
        de5 de5Var = de5.a;
        sd5.j jVar = iVar2.d;
        hc8Var.j();
        de5Var.b(hc8Var, lb3Var, jVar);
        hc8Var.t();
        hc8Var.u0("compensation");
        ena enaVar2 = new ena(ud5.a, false);
        sd5.a aVar = iVar2.e;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("indeedApply");
        ae5 ae5Var = ae5.a;
        sd5.g gVar2 = iVar2.f;
        hc8Var.j();
        ae5Var.b(hc8Var, lb3Var, gVar2);
        hc8Var.t();
        hc8Var.u0("dateOnIndeed");
        ha.g gVar3 = ha.a;
        f.a(hc8Var, iVar2.g);
        hc8Var.u0("description");
        wd5 wd5Var = wd5.a;
        sd5.c cVar = iVar2.h;
        hc8Var.j();
        wd5Var.b(hc8Var, lb3Var, cVar);
        hc8Var.t();
    }
}
