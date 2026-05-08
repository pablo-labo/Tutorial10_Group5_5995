package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class zue extends o7g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zue(String str, rf0[] rf0VarArr, Function1<? super Object[], String> function1) {
        super(str, rf0VarArr, function1);
        str.getClass();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.o7g, defpackage.dv0
    public final void g(Object[] objArr, p3c p3cVar, gk0 gk0Var) {
        p3cVar.resolve((String) this.h.invoke(qf0.b(this, objArr, gk0Var)));
    }
}
