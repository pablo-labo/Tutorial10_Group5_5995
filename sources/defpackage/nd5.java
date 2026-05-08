package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class nd5 implements ga<md5> {
    public static final nd5 a = new nd5();

    @Override // defpackage.ga
    public final md5 a(mb8 mb8Var, lb3 lb3Var) {
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
    public final void b(hc8 hc8Var, lb3 lb3Var, md5 md5Var) {
        md5 md5Var2 = md5Var;
        hc8Var.getClass();
        lb3Var.getClass();
        md5Var2.getClass();
        hva<Integer> hvaVar = md5Var2.d;
        hva<Integer> hvaVar2 = md5Var2.c;
        hva<String> hvaVar3 = md5Var2.b;
        hva<String> hvaVar4 = md5Var2.a;
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("what");
            ha.a.b(hc8Var, lb3Var, ((hva.c) hvaVar4).a);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("where");
            ha.a.b(hc8Var, lb3Var, ((hva.c) hvaVar3).a);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("limit");
            ha.b.b(hc8Var, lb3Var, ((hva.c) hvaVar2).a);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("offset");
            ha.b.b(hc8Var, lb3Var, ((hva.c) hvaVar).a);
        }
    }
}
