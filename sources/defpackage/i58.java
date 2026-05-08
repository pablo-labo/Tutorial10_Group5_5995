package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class i58 implements ga<h58> {
    public static final i58 a = new i58();

    @Override // defpackage.ga
    public final h58 a(mb8 mb8Var, lb3 lb3Var) {
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
    public final void b(hc8 hc8Var, lb3 lb3Var, h58 h58Var) {
        h58 h58Var2 = h58Var;
        hc8Var.getClass();
        lb3Var.getClass();
        h58Var2.getClass();
        hva<Double> hvaVar = h58Var2.e;
        hva<String> hvaVar2 = h58Var2.d;
        hc8Var.u0("jobTitle");
        ha.a.b(hc8Var, lb3Var, h58Var2.a);
        hc8Var.u0("sentiment");
        h68 h68Var = h58Var2.b;
        h68Var.getClass();
        hc8Var.T0(h68Var.a());
        hva<c58> hvaVar3 = h58Var2.c;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("source");
            f58 f58Var = f58.a;
            V v = ((hva.c) hvaVar3).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                f58Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("normalizedValue");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("collectionTime");
            ha.a(ha.j).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
