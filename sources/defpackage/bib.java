package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class bib implements ga<aib> {
    public static final bib a = new bib();

    @Override // defpackage.ga
    public final aib a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, aib aibVar) {
        aib aibVar2 = aibVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aibVar2.getClass();
        hva<String> hvaVar = aibVar2.f;
        hva<String> hvaVar2 = aibVar2.e;
        hva<String> hvaVar3 = aibVar2.d;
        hva<String> hvaVar4 = aibVar2.c;
        hva<String> hvaVar5 = aibVar2.b;
        hva<String> hvaVar6 = aibVar2.a;
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("candidateKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar6);
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("advertiserKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("aggJobKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("jobseekerAccountKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("eligibilityToken");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("employerJobId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
