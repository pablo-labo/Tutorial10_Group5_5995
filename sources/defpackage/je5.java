package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class je5 implements ga<sd5.p> {
    public static final je5 a = new je5();
    public static final List<String> b = u63.a0("matchReason", "job", "indeedJobData");

    @Override // defpackage.ga
    public final sd5.p a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        sd5.k kVar = null;
        sd5.i iVar = null;
        sd5.h hVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                ee5 ee5Var = ee5.a;
                ha.g gVar = ha.a;
                kVar = (sd5.k) new ena(ee5Var, true).a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                ce5 ce5Var = ce5.a;
                ha.g gVar2 = ha.a;
                iVar = (sd5.i) new ena(ce5Var, false).a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                be5 be5Var = be5.a;
                ha.g gVar3 = ha.a;
                ena enaVar = new ena(be5Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                hVar = (sd5.h) objA;
            }
        }
        if (kVar == null) {
            mh2.q(mb8Var, "matchReason");
            throw null;
        }
        if (iVar != null) {
            return new sd5.p(kVar, iVar, hVar);
        }
        mh2.q(mb8Var, "job");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.p pVar) {
        sd5.p pVar2 = pVar;
        hc8Var.getClass();
        lb3Var.getClass();
        pVar2.getClass();
        hc8Var.u0("matchReason");
        ee5 ee5Var = ee5.a;
        ha.g gVar = ha.a;
        sd5.k kVar = pVar2.a;
        if (hc8Var instanceof ub9) {
            ub9 ub9Var = (ub9) hc8Var;
            ub9Var.j();
            ee5Var.b(hc8Var, lb3Var, kVar);
            ub9Var.t();
        } else {
            ub9 ub9Var2 = new ub9();
            ub9Var2.j();
            ee5Var.b(ub9Var2, lb3Var, kVar);
            ub9Var2.t();
            Object objH = ub9Var2.h();
            objH.getClass();
            f.a(hc8Var, objH);
        }
        hc8Var.u0("job");
        ce5 ce5Var = ce5.a;
        sd5.i iVar = pVar2.b;
        hc8Var.j();
        ce5Var.b(hc8Var, lb3Var, iVar);
        hc8Var.t();
        hc8Var.u0("indeedJobData");
        ena enaVar = new ena(be5.a, false);
        sd5.h hVar = pVar2.c;
        if (hVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, hVar);
        }
    }
}
