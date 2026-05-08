package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class mea implements ga<lea> {
    public static final mea a = new mea();

    @Override // defpackage.ga
    public final lea a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, lea leaVar) {
        lea leaVar2 = leaVar;
        hc8Var.getClass();
        lb3Var.getClass();
        leaVar2.getClass();
        hva<String> hvaVar = leaVar2.m;
        hva<String> hvaVar2 = leaVar2.l;
        hva<String> hvaVar3 = leaVar2.k;
        hva<String> hvaVar4 = leaVar2.j;
        hva<Boolean> hvaVar5 = leaVar2.i;
        hva<String> hvaVar6 = leaVar2.h;
        hva<String> hvaVar7 = leaVar2.g;
        hva<String> hvaVar8 = leaVar2.f;
        hc8Var.u0("variant");
        kea keaVar = leaVar2.a;
        keaVar.getClass();
        hc8Var.T0(keaVar.a());
        hc8Var.u0("from");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, leaVar2.b);
        hc8Var.u0("continueUrl");
        ha.g.b(hc8Var, lb3Var, leaVar2.c);
        hc8Var.u0("appName");
        gVar.b(hc8Var, lb3Var, leaVar2.d);
        hva<String> hvaVar9 = leaVar2.e;
        if (hvaVar9 instanceof hva.c) {
            hc8Var.u0("canonicalPageId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar9);
        }
        if (hvaVar8 instanceof hva.c) {
            hc8Var.u0("pageId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar8);
        }
        if (hvaVar7 instanceof hva.c) {
            hc8Var.u0("userResumeURL");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar7);
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("emailAddress");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar6);
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("isUserVerified");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("productGroup");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("gitlabGroup");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("repoName");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("gitRevision");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
