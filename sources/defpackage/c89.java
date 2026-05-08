package defpackage;

import defpackage.t13;

/* JADX INFO: loaded from: classes2.dex */
public final class c89 implements a6d<Object> {
    public final /* synthetic */ t13.a a;
    public final /* synthetic */ d89 b;

    public c89(d89 d89Var, t13.a aVar) {
        this.b = d89Var;
        this.a = aVar;
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
    @Override // defpackage.a6d
    public final void a(Object obj) {
        d89 d89Var = this.b;
        t13.a aVar = this.a;
        synchronized (d89Var) {
            synchronized (d89Var) {
                web.i(aVar.c > 0);
                aVar.c--;
            }
            n82.G(d89Var.h(aVar));
            d89Var.f();
            d89Var.e();
        }
        synchronized (d89Var) {
            try {
                if (!aVar.d && aVar.c == 0) {
                    d89Var.b.d(aVar.a, aVar);
                }
            } finally {
            }
        }
        n82.G(d89Var.h(aVar));
        d89Var.f();
        d89Var.e();
    }
}
