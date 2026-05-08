package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sj implements opb<vs4> {
    public final opb<vs4> a;

    public static class a extends xs3<vs4, vs4> {
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
            vs4 vs4Var = (vs4) obj;
            xq2<O> xq2Var = this.b;
            if (vs4Var == null) {
                xq2Var.v(i, null);
                return;
            }
            if (!vs4.P(vs4Var)) {
                vs4Var.N();
            }
            xq2Var.v(i, vs4Var);
        }
    }

    public sj(opb<vs4> opbVar) {
        this.a = opbVar;
    }

    @Override // defpackage.opb
    public final void a(xq2<vs4> xq2Var, ppb ppbVar) {
        this.a.a(new a(xq2Var), ppbVar);
    }
}
