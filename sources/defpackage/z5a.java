package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.p5a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z5a implements ga<p5a.i> {
    public static final z5a a = new z5a();
    public static final List<String> b = u63.a0("key", "displayTitle", "compensation", "location", "jobTypes", "employer");

    @Override // defpackage.ga
    public final p5a.i a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        p5a.a aVar = null;
        p5a.k kVar = null;
        List list = null;
        p5a.e eVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 != 1) {
                mb8.a aVar2 = mb8.a.Y;
                if (iD1 == 2) {
                    r5a r5aVar = r5a.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(r5aVar, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA4 = null;
                    } else {
                        objA4 = enaVar.a(mb8Var, lb3Var);
                    }
                    aVar = (p5a.a) objA4;
                } else if (iD1 == 3) {
                    b6a b6aVar = b6a.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar2 = new ena(b6aVar, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA3 = null;
                    } else {
                        objA3 = enaVar2.a(mb8Var, lb3Var);
                    }
                    kVar = (p5a.k) objA3;
                } else if (iD1 == 4) {
                    a6a a6aVar = a6a.a;
                    ha.g gVar3 = ha.a;
                    hy8 hy8Var = new hy8(new ena(a6aVar, false));
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = hy8Var.a(mb8Var, lb3Var);
                    }
                    list = (List) objA2;
                } else {
                    if (iD1 != 5) {
                        break;
                    }
                    v5a v5aVar = v5a.a;
                    ha.g gVar4 = ha.a;
                    ena enaVar3 = new ena(v5aVar, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar3.a(mb8Var, lb3Var);
                    }
                    eVar = (p5a.e) objA;
                }
            } else {
                strA = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new p5a.i(str, strA, aVar, kVar, list, eVar);
        }
        mh2.q(mb8Var, "key");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.i iVar) {
        p5a.i iVar2 = iVar;
        hc8Var.getClass();
        lb3Var.getClass();
        iVar2.getClass();
        hc8Var.u0("key");
        ha.a.b(hc8Var, lb3Var, iVar2.a);
        hc8Var.u0("displayTitle");
        ha.i.b(hc8Var, lb3Var, iVar2.b);
        hc8Var.u0("compensation");
        ena enaVar = new ena(r5a.a, false);
        p5a.a aVar = iVar2.c;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("location");
        ena enaVar2 = new ena(b6a.a, false);
        p5a.k kVar = iVar2.d;
        if (kVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, kVar);
        }
        hc8Var.u0("jobTypes");
        hy8 hy8Var = new hy8(new ena(a6a.a, false));
        List<p5a.j> list = iVar2.e;
        if (list == null) {
            hc8Var.H1();
        } else {
            hy8Var.b(hc8Var, lb3Var, list);
        }
        hc8Var.u0("employer");
        ena enaVar3 = new ena(v5a.a, false);
        p5a.e eVar = iVar2.f;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar3.b(hc8Var, lb3Var, eVar);
        }
    }
}
