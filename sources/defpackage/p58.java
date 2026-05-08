package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class p58 implements ga<o58> {
    public static final p58 a = new p58();

    @Override // defpackage.ga
    public final o58 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o58 o58Var) {
        o58 o58Var2 = o58Var;
        hc8Var.getClass();
        lb3Var.getClass();
        o58Var2.getClass();
        hva<Double> hvaVar = o58Var2.q;
        hva<c58> hvaVar2 = o58Var2.p;
        hva<String> hvaVar3 = o58Var2.o;
        hva<String> hvaVar4 = o58Var2.n;
        hva<String> hvaVar5 = o58Var2.m;
        hva<String> hvaVar6 = o58Var2.l;
        hva<String> hvaVar7 = o58Var2.k;
        hva<String> hvaVar8 = o58Var2.j;
        hva<String> hvaVar9 = o58Var2.i;
        hva<String> hvaVar10 = o58Var2.h;
        hva<Double> hvaVar11 = o58Var2.g;
        hva<Double> hvaVar12 = o58Var2.f;
        hva<String> hvaVar13 = o58Var2.e;
        hva<String> hvaVar14 = o58Var2.d;
        hva<l58> hvaVar15 = o58Var2.c;
        hc8Var.u0("sentiment");
        h68 h68Var = o58Var2.a;
        h68Var.getClass();
        hc8Var.T0(h68Var.a());
        hva<Double> hvaVar16 = o58Var2.b;
        if (hvaVar16 instanceof hva.c) {
            hc8Var.u0("weight");
            ha.a(ha.j).b(hc8Var, lb3Var, (hva.c) hvaVar16);
        }
        if (hvaVar15 instanceof hva.c) {
            hc8Var.u0("latlngPrecision");
            ha.g gVar = ha.a;
            m58 m58Var = m58.a;
            V v = ((hva.c) hvaVar15).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                m58Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar14 instanceof hva.c) {
            hc8Var.u0("geoHash");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar14);
        }
        if (hvaVar13 instanceof hva.c) {
            hc8Var.u0("raw");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar13);
        }
        if (hvaVar12 instanceof hva.c) {
            hc8Var.u0("latitude");
            ha.a(ha.j).b(hc8Var, lb3Var, (hva.c) hvaVar12);
        }
        if (hvaVar11 instanceof hva.c) {
            hc8Var.u0("longitude");
            ha.a(ha.j).b(hc8Var, lb3Var, (hva.c) hvaVar11);
        }
        if (hvaVar10 instanceof hva.c) {
            hc8Var.u0("country");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar10);
        }
        if (hvaVar9 instanceof hva.c) {
            hc8Var.u0("city");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar9);
        }
        if (hvaVar8 instanceof hva.c) {
            hc8Var.u0("postalCode");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar8);
        }
        if (hvaVar7 instanceof hva.c) {
            hc8Var.u0("address");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar7);
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("admin1");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar6);
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("admin2");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("admin3");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("admin4");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("source");
            ha.g gVar2 = ha.a;
            f58 f58Var = f58.a;
            V v2 = ((hva.c) hvaVar2).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                f58Var.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("collectionTime");
            ha.a(ha.j).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
