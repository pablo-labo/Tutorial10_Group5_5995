package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class lbf implements ga<kbf> {
    public static final lbf a = new lbf();

    @Override // defpackage.ga
    public final kbf a(mb8 mb8Var, lb3 lb3Var) {
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
    public final void b(hc8 hc8Var, lb3 lb3Var, kbf kbfVar) {
        kbf kbfVar2 = kbfVar;
        hc8Var.getClass();
        lb3Var.getClass();
        kbfVar2.getClass();
        hva<Boolean> hvaVar = kbfVar2.g;
        hva<Object> hvaVar2 = kbfVar2.f;
        hva<Object> hvaVar3 = kbfVar2.e;
        hva<Boolean> hvaVar4 = kbfVar2.d;
        hva<ebf> hvaVar5 = kbfVar2.a;
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("conceptTypeFilter");
            ha.g gVar = ha.a;
            fbf fbfVar = fbf.a;
            V v = ((hva.c) hvaVar5).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                fbfVar.b(hc8Var, lb3Var, v);
            }
        }
        hc8Var.u0("conceptIdFilter");
        ha.g gVar2 = ha.a;
        kbfVar2.b.getClass();
        hc8Var.m();
        xr4.a.getClass();
        hc8Var.l();
        hc8Var.u0("customClassFilter");
        fa3 fa3Var = kbfVar2.c;
        hc8Var.j();
        ga3.a.b(hc8Var, lb3Var, fa3Var);
        hc8Var.t();
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("global");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("countryCode");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("languageCode");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("includeDeprecated");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
