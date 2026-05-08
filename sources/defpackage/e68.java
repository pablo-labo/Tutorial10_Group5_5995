package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class e68 implements ga<d68> {
    public static final e68 a = new e68();

    @Override // defpackage.ga
    public final d68 a(mb8 mb8Var, lb3 lb3Var) {
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
    public final void b(hc8 hc8Var, lb3 lb3Var, d68 d68Var) {
        d68 d68Var2 = d68Var;
        hc8Var.getClass();
        lb3Var.getClass();
        d68Var2.getClass();
        hva<Double> hvaVar = d68Var2.f;
        hva<c58> hvaVar2 = d68Var2.e;
        hc8Var.u0("salaryType");
        f68 f68Var = d68Var2.a;
        f68Var.getClass();
        hc8Var.T0(f68Var.a());
        hc8Var.u0("currency");
        ha.a.b(hc8Var, lb3Var, d68Var2.b);
        hc8Var.u0("amount");
        ha.c.b(hc8Var, lb3Var, Double.valueOf(d68Var2.c));
        hva<h68> hvaVar3 = d68Var2.d;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("sentiment");
            j68 j68Var = j68.a;
            V v = ((hva.c) hvaVar3).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                j68Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("source");
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
