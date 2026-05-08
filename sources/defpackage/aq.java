package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aq implements ga<zp> {
    public static final aq a = new aq();

    @Override // defpackage.ga
    public final zp a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, zp zpVar) {
        zp zpVar2 = zpVar;
        hc8Var.getClass();
        lb3Var.getClass();
        zpVar2.getClass();
        hva<m68> hvaVar = zpVar2.p;
        hva<w48> hvaVar2 = zpVar2.o;
        hva<List<j58>> hvaVar3 = zpVar2.n;
        hva<List<k68>> hvaVar4 = zpVar2.m;
        hva<List<a68>> hvaVar5 = zpVar2.l;
        hva<List<a58>> hvaVar6 = zpVar2.k;
        hva<List<y48>> hvaVar7 = zpVar2.j;
        hva<List<q58>> hvaVar8 = zpVar2.i;
        hva<d68> hvaVar9 = zpVar2.h;
        hva<d68> hvaVar10 = zpVar2.g;
        hva<List<h58>> hvaVar11 = zpVar2.f;
        hva<List<o58>> hvaVar12 = zpVar2.e;
        hva<y58> hvaVar13 = zpVar2.d;
        hva<Boolean> hvaVar14 = zpVar2.c;
        hva<String> hvaVar15 = zpVar2.b;
        hva<String> hvaVar16 = zpVar2.a;
        if (hvaVar16 instanceof hva.c) {
            hc8Var.u0("id");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar16);
        }
        if (hvaVar15 instanceof hva.c) {
            hc8Var.u0("rezId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar15);
        }
        if (hvaVar14 instanceof hva.c) {
            hc8Var.u0("ableToRelocate");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar14);
        }
        if (hvaVar13 instanceof hva.c) {
            hc8Var.u0("relocation");
            ha.g gVar = ha.a;
            ena enaVar = new ena(z58.a, false);
            V v = ((hva.c) hvaVar13).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar12 instanceof hva.c) {
            hc8Var.u0("locations");
            ha.g gVar2 = ha.a;
            hy8 hy8Var = new hy8(new ena(p58.a, false));
            V v2 = ((hva.c) hvaVar12).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar11 instanceof hva.c) {
            hc8Var.u0("jobTitles");
            ha.g gVar3 = ha.a;
            hy8 hy8Var2 = new hy8(new ena(i58.a, false));
            V v3 = ((hva.c) hvaVar11).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                hy8Var2.b(hc8Var, lb3Var, v3);
            }
        }
        boolean z = hvaVar10 instanceof hva.c;
        e68 e68Var = e68.a;
        if (z) {
            hc8Var.u0("salary");
            ha.g gVar4 = ha.a;
            ena enaVar2 = new ena(e68Var, false);
            V v4 = ((hva.c) hvaVar10).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar9 instanceof hva.c) {
            hc8Var.u0("minimumPay");
            ha.g gVar5 = ha.a;
            ena enaVar3 = new ena(e68Var, false);
            V v5 = ((hva.c) hvaVar9).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                enaVar3.b(hc8Var, lb3Var, v5);
            }
        }
        if (hvaVar8 instanceof hva.c) {
            hc8Var.u0("occupations");
            ha.g gVar6 = ha.a;
            hy8 hy8Var3 = new hy8(new ena(r58.a, false));
            V v6 = ((hva.c) hvaVar8).a;
            if (v6 == 0) {
                hc8Var.H1();
            } else {
                hy8Var3.b(hc8Var, lb3Var, v6);
            }
        }
        if (hvaVar7 instanceof hva.c) {
            hc8Var.u0("companies");
            ha.g gVar7 = ha.a;
            hy8 hy8Var4 = new hy8(new ena(z48.a, false));
            V v7 = ((hva.c) hvaVar7).a;
            if (v7 == 0) {
                hc8Var.H1();
            } else {
                hy8Var4.b(hc8Var, lb3Var, v7);
            }
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("companySectors");
            ha.g gVar8 = ha.a;
            hy8 hy8Var5 = new hy8(new ena(b58.a, false));
            V v8 = ((hva.c) hvaVar6).a;
            if (v8 == 0) {
                hc8Var.H1();
            } else {
                hy8Var5.b(hc8Var, lb3Var, v8);
            }
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("remoteWorkTypes");
            ha.g gVar9 = ha.a;
            hy8 hy8Var6 = new hy8(new ena(b68.a, false));
            V v9 = ((hva.c) hvaVar5).a;
            if (v9 == 0) {
                hc8Var.H1();
            } else {
                hy8Var6.b(hc8Var, lb3Var, v9);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("shifts");
            ha.g gVar10 = ha.a;
            hy8 hy8Var7 = new hy8(new ena(l68.a, false));
            V v10 = ((hva.c) hvaVar4).a;
            if (v10 == 0) {
                hc8Var.H1();
            } else {
                hy8Var7.b(hc8Var, lb3Var, v10);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("jobTypes");
            ha.g gVar11 = ha.a;
            hy8 hy8Var8 = new hy8(new ena(k58.a, false));
            V v11 = ((hva.c) hvaVar3).a;
            if (v11 == 0) {
                hc8Var.H1();
            } else {
                hy8Var8.b(hc8Var, lb3Var, v11);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("maximumCommute");
            ha.g gVar12 = ha.a;
            ena enaVar4 = new ena(x48.a, false);
            V v12 = ((hva.c) hvaVar2).a;
            if (v12 == 0) {
                hc8Var.H1();
            } else {
                enaVar4.b(hc8Var, lb3Var, v12);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("willingnessToTravel");
            ha.g gVar13 = ha.a;
            ena enaVar5 = new ena(n68.a, false);
            V v13 = ((hva.c) hvaVar).a;
            if (v13 == 0) {
                hc8Var.H1();
            } else {
                enaVar5.b(hc8Var, lb3Var, v13);
            }
        }
    }
}
