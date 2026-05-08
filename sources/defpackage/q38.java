package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class q38 implements ga<p38> {
    public static final q38 a = new q38();

    @Override // defpackage.ga
    public final p38 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p38 p38Var) {
        p38 p38Var2 = p38Var;
        hc8Var.getClass();
        lb3Var.getClass();
        p38Var2.getClass();
        hva<String> hvaVar = p38Var2.o;
        hva<String> hvaVar2 = p38Var2.n;
        hva<String> hvaVar3 = p38Var2.m;
        hva<Double> hvaVar4 = p38Var2.l;
        hva<String> hvaVar5 = p38Var2.k;
        hva<Double> hvaVar6 = p38Var2.j;
        hva<a28> hvaVar7 = p38Var2.i;
        hva<String> hvaVar8 = p38Var2.h;
        hva<String> hvaVar9 = p38Var2.g;
        hva<String> hvaVar10 = p38Var2.f;
        hva<String> hvaVar11 = p38Var2.e;
        hva<String> hvaVar12 = p38Var2.d;
        hva<String> hvaVar13 = p38Var2.c;
        hva<String> hvaVar14 = p38Var2.b;
        hva<String> hvaVar15 = p38Var2.a;
        if (hvaVar15 instanceof hva.c) {
            hc8Var.u0("address");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar15);
        }
        if (hvaVar14 instanceof hva.c) {
            hc8Var.u0("address2");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar14);
        }
        if (hvaVar13 instanceof hva.c) {
            hc8Var.u0("admin1");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar13);
        }
        if (hvaVar12 instanceof hva.c) {
            hc8Var.u0("admin2");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar12);
        }
        if (hvaVar11 instanceof hva.c) {
            hc8Var.u0("admin3");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar11);
        }
        if (hvaVar10 instanceof hva.c) {
            hc8Var.u0("admin4");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar10);
        }
        if (hvaVar9 instanceof hva.c) {
            hc8Var.u0("city");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar9);
        }
        if (hvaVar8 instanceof hva.c) {
            hc8Var.u0("country");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar8);
        }
        if (hvaVar7 instanceof hva.c) {
            hc8Var.u0("geocodePrecision");
            ha.g gVar = ha.a;
            b28 b28Var = b28.a;
            V v = ((hva.c) hvaVar7).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                b28Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("latitude");
            ha.a(ha.j).b(hc8Var, lb3Var, (hva.c) hvaVar6);
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("location");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("longitude");
            ha.a(ha.j).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("postalCode");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("state");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("unknownLocation");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
