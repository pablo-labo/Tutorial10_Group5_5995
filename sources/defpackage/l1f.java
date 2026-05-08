package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l1f<T> implements opb<Void> {
    public final opb<T> a;

    public class a extends xs3<T, Void> {
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.w81
        public final void e(int i, Object obj) {
            if (w81.a(i)) {
                this.b.v(i, null);
            }
        }
    }

    public l1f(opb<T> opbVar) {
        this.a = opbVar;
    }

    @Override // defpackage.opb
    public final void a(xq2<Void> xq2Var, ppb ppbVar) {
        this.a.a(new a(xq2Var), ppbVar);
    }
}
