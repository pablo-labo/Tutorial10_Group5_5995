package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class vp implements ga<up> {
    public static final vp a = new vp();

    @Override // defpackage.ga
    public final up a(mb8 mb8Var, lb3 lb3Var) {
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
    public final void b(hc8 hc8Var, lb3 lb3Var, up upVar) {
        up upVar2 = upVar;
        hc8Var.getClass();
        lb3Var.getClass();
        upVar2.getClass();
        hva<Double> hvaVar = upVar2.e;
        hva<d58> hvaVar2 = upVar2.d;
        hc8Var.u0("suid");
        ha.a.b(hc8Var, lb3Var, upVar2.a);
        hva<String> hvaVar3 = upVar2.b;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("label");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        hc8Var.u0("sentiment");
        i68 i68Var = upVar2.c;
        i68Var.getClass();
        hc8Var.T0(i68Var.a());
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("source");
            e58 e58Var = e58.a;
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                e58Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("collectionTime");
            ha.a(ha.j).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
