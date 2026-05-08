package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ga3 implements ga<fa3> {
    public static final ga3 a = new ga3();

    @Override // defpackage.ga
    public final fa3 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void b(hc8 hc8Var, lb3 lb3Var, fa3 fa3Var) {
        fa3 fa3Var2 = fa3Var;
        hc8Var.getClass();
        lb3Var.getClass();
        fa3Var2.getClass();
        hva<ha3> hvaVar = fa3Var2.b;
        hc8Var.u0("customClasses");
        ha.g gVar = ha.a;
        List<String> list = fa3Var2.a;
        hc8Var.m();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            gVar.b(hc8Var, lb3Var, it.next());
        }
        hc8Var.l();
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("operation");
            ia3 ia3Var = ia3.a;
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                ia3Var.b(hc8Var, lb3Var, v);
            }
        }
    }
}
