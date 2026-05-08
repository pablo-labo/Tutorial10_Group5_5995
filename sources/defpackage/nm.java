package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nm implements ga<mm> {
    public static final nm a = new nm();

    @Override // defpackage.ga
    public final mm a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, mm mmVar) {
        mm mmVar2 = mmVar;
        hc8Var.getClass();
        lb3Var.getClass();
        mmVar2.getClass();
        hva<String> hvaVar = mmVar2.k;
        hva<List<String>> hvaVar2 = mmVar2.g;
        hva<l48> hvaVar3 = mmVar2.f;
        hva<rp> hvaVar4 = mmVar2.e;
        hva<fp> hvaVar5 = mmVar2.d;
        hc8Var.u0("fileId");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, mmVar2.a);
        hc8Var.u0("name");
        gVar.b(hc8Var, lb3Var, mmVar2.b);
        hva<String> hvaVar6 = mmVar2.c;
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("description");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar6);
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("resumeState");
            gp gpVar = gp.a;
            V v = ((hva.c) hvaVar5).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                gpVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("sourcingElection");
            sp spVar = sp.a;
            V v2 = ((hva.c) hvaVar4).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                spVar.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("resumeType");
            m48 m48Var = m48.a;
            V v3 = ((hva.c) hvaVar3).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                m48Var.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("tags");
            hy8 hy8Var = new hy8(gVar);
            V v4 = ((hva.c) hvaVar2).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v4);
            }
        }
        hc8Var.u0("mediaType");
        gVar.b(hc8Var, lb3Var, mmVar2.h);
        hc8Var.u0("geoCountry");
        gVar.b(hc8Var, lb3Var, mmVar2.i);
        hc8Var.u0("ipCountry");
        gVar.b(hc8Var, lb3Var, mmVar2.j);
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("replaceFileId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
