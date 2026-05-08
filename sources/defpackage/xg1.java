package defpackage;

import com.facebook.imagepipeline.request.a;

/* JADX INFO: loaded from: classes2.dex */
public class xg1 implements opb<n82<l82>> {
    public final rn9<ot1, l82> a;
    public final am3 b;
    public final opb<n82<l82>> c;

    public class a extends xs3<n82<l82>, n82<l82>> {
        public final /* synthetic */ ot1 c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xq2 xq2Var, ot1 ot1Var, boolean z) {
            super(xq2Var);
            this.c = ot1Var;
            this.d = z;
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
            n82<l82> n82Var;
            n82<l82> n82Var2 = (n82) obj;
            rn9<ot1, l82> rn9Var = xg1.this.a;
            try {
                it5.a();
                boolean zA = w81.a(i);
                xq2<O> xq2Var = this.b;
                if (n82Var2 == null) {
                    if (zA) {
                        xq2Var.v(i, null);
                    }
                    return;
                }
                n82Var2.P();
                if (w81.h(i, 8)) {
                    xq2Var.v(i, n82Var2);
                    return;
                }
                ot1 ot1Var = this.c;
                if (!zA && (n82Var = rn9Var.get(ot1Var)) != null) {
                    try {
                        h47 h47VarO1 = n82Var2.P().o1();
                        h47 h47VarO12 = n82Var.P().o1();
                        if (h47VarO12.c || h47VarO12.a >= h47VarO1.a) {
                            xq2Var.v(i, n82Var);
                            return;
                        }
                    } finally {
                        n82Var.close();
                    }
                }
                n82<l82> n82VarA = this.d ? rn9Var.a(ot1Var, n82Var2) : null;
                if (zA) {
                    try {
                        xq2Var.w(1.0f);
                    } catch (Throwable th) {
                        n82.G(n82VarA);
                        throw th;
                    }
                }
                if (n82VarA != null) {
                    n82Var2 = n82VarA;
                }
                xq2Var.v(i, n82Var2);
                n82.G(n82VarA);
            } finally {
                it5.a();
            }
        }
    }

    public xg1(up1 up1Var, am3 am3Var, opb opbVar) {
        this.a = up1Var;
        this.b = am3Var;
        this.c = opbVar;
    }

    @Override // defpackage.opb
    public final void a(xq2<n82<l82>> xq2Var, ppb ppbVar) {
        try {
            it5.a();
            tpb tpbVarG = ppbVar.G();
            tpbVarG.k(ppbVar, d());
            vg1 vg1VarA = this.b.a(ppbVar.Q(), ppbVar.a());
            n82<l82> n82Var = ppbVar.Q().c(1) ? this.a.get(vg1VarA) : null;
            if (n82Var != null) {
                ppbVar.W(n82Var.P().getExtras());
                boolean z = n82Var.P().o1().c;
                if (z) {
                    tpbVarG.a(ppbVar, d(), tpbVarG.j(ppbVar, d()) ? g47.d("cached_value_found", "true") : null);
                    tpbVarG.c(ppbVar, d(), true);
                    ppbVar.p("memory_bitmap", c());
                    xq2Var.w(1.0f);
                }
                xq2Var.v(z ? 1 : 0, n82Var);
                n82Var.close();
                if (z) {
                    return;
                }
            }
            if (ppbVar.h0().c() >= a.c.BITMAP_MEMORY_CACHE.c()) {
                tpbVarG.a(ppbVar, d(), tpbVarG.j(ppbVar, d()) ? g47.d("cached_value_found", "false") : null);
                tpbVarG.c(ppbVar, d(), false);
                ppbVar.p("memory_bitmap", c());
                xq2Var.v(1, null);
                return;
            }
            xq2<n82<l82>> xq2VarE = e(xq2Var, vg1VarA, ppbVar.Q().c(2));
            tpbVarG.a(ppbVar, d(), tpbVarG.j(ppbVar, d()) ? g47.d("cached_value_found", "false") : null);
            it5.a();
            this.c.a(xq2VarE, ppbVar);
            it5.a();
        } finally {
            it5.a();
        }
    }

    public String c() {
        return "pipe_bg";
    }

    public String d() {
        return "BitmapMemoryCacheProducer";
    }

    public xq2<n82<l82>> e(xq2<n82<l82>> xq2Var, ot1 ot1Var, boolean z) {
        return new a(xq2Var, ot1Var, z);
    }
}
