package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tl1 implements opb<vs4> {
    public final w4d a;
    public final hlf b;

    public class a extends xs3<vs4, vs4> {
        public final ppb c;

        public a(xq2 xq2Var, ppb ppbVar) {
            super(xq2Var);
            this.c = ppbVar;
        }

        @Override // defpackage.xs3, defpackage.w81
        public final void d(Throwable th) {
            tl1.this.b.a(this.b, this.c);
        }

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
            ppb ppbVar = this.c;
            com.facebook.imagepipeline.request.a aVarQ = ppbVar.Q();
            boolean zA = w81.a(i);
            boolean zM = oie.m(vs4Var, aVarQ.h);
            xq2<O> xq2Var = this.b;
            if (vs4Var != null && zM) {
                if (zA && zM) {
                    xq2Var.v(i, vs4Var);
                } else {
                    xq2Var.v(i & (-2), vs4Var);
                }
            }
            if (!zA || zM || aVarQ.a()) {
                return;
            }
            vs4.h(vs4Var);
            tl1.this.b.a(xq2Var, ppbVar);
        }
    }

    public tl1(w4d w4dVar, hlf hlfVar) {
        this.a = w4dVar;
        this.b = hlfVar;
    }

    @Override // defpackage.opb
    public final void a(xq2<vs4> xq2Var, ppb ppbVar) {
        this.a.a(new a(xq2Var, ppbVar), ppbVar);
    }
}
