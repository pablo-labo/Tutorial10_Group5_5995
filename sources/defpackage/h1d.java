package defpackage;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class h1d implements opb<n82<PooledByteBuffer>> {
    public final opb<vs4> a;

    public final class a extends xs3<vs4, n82<PooledByteBuffer>> {
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
            n82 n82VarV = null;
            try {
                if (vs4.W(vs4Var) && vs4Var != null) {
                    n82VarV = n82.v(vs4Var.a);
                }
                this.b.v(i, n82VarV);
            } finally {
                n82.G(n82VarV);
            }
        }
    }

    public h1d(opb<vs4> opbVar) {
        this.a = opbVar;
    }

    @Override // defpackage.opb
    public final void a(xq2<n82<PooledByteBuffer>> xq2Var, ppb ppbVar) {
        xq2Var.getClass();
        ppbVar.getClass();
        this.a.a(new a(xq2Var), ppbVar);
    }
}
