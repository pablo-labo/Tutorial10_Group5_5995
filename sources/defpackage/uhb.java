package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uhb implements opb<n82<l82>> {
    public final rn9<ot1, l82> a;
    public final am3 b;
    public final whb c;

    public static class a extends xs3<n82<l82>, n82<l82>> {
        public final ot1 c;
        public final boolean d;
        public final rn9<ot1, l82> e;
        public final boolean f;

        public a(xq2<n82<l82>> xq2Var, ot1 ot1Var, boolean z, rn9<ot1, l82> rn9Var, boolean z2) {
            super(xq2Var);
            this.c = ot1Var;
            this.d = z;
            this.e = rn9Var;
            this.f = z2;
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
            n82<l82> n82Var = (n82) obj;
            xq2<O> xq2Var = this.b;
            if (n82Var == null) {
                if (w81.a(i)) {
                    xq2Var.v(i, null);
                }
            } else if (!w81.b(i) || this.d) {
                n82<l82> n82VarA = this.f ? this.e.a(this.c, n82Var) : null;
                try {
                    xq2Var.w(1.0f);
                    if (n82VarA != null) {
                        n82Var = n82VarA;
                    }
                    xq2Var.v(i, n82Var);
                } finally {
                    n82.G(n82VarA);
                }
            }
        }
    }

    public uhb(up1 up1Var, am3 am3Var, whb whbVar) {
        this.a = up1Var;
        this.b = am3Var;
        this.c = whbVar;
    }

    @Override // defpackage.opb
    public final void a(xq2<n82<l82>> xq2Var, ppb ppbVar) {
        tpb tpbVarG = ppbVar.G();
        com.facebook.imagepipeline.request.a aVarQ = ppbVar.Q();
        Object objA = ppbVar.a();
        vhb vhbVar = aVarQ.p;
        whb whbVar = this.c;
        if (vhbVar == null || vhbVar.c() == null) {
            whbVar.a(xq2Var, ppbVar);
            return;
        }
        tpbVarG.k(ppbVar, "PostprocessedBitmapMemoryCacheProducer");
        vg1 vg1VarC = this.b.c(aVarQ, objA);
        n82<l82> n82Var = ppbVar.Q().c(1) ? this.a.get(vg1VarC) : null;
        if (n82Var == null) {
            a aVar = new a(xq2Var, vg1VarC, vhbVar instanceof e2d, this.a, ppbVar.Q().c(2));
            tpbVarG.a(ppbVar, "PostprocessedBitmapMemoryCacheProducer", tpbVarG.j(ppbVar, "PostprocessedBitmapMemoryCacheProducer") ? g47.d("cached_value_found", "false") : null);
            whbVar.a(aVar, ppbVar);
        } else {
            tpbVarG.a(ppbVar, "PostprocessedBitmapMemoryCacheProducer", tpbVarG.j(ppbVar, "PostprocessedBitmapMemoryCacheProducer") ? g47.d("cached_value_found", "true") : null);
            tpbVarG.c(ppbVar, "PostprocessedBitmapMemoryCacheProducer", true);
            ppbVar.p("memory_bitmap", "postprocessed");
            xq2Var.w(1.0f);
            xq2Var.v(1, n82Var);
            n82Var.close();
        }
    }
}
