package defpackage;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.a;

/* JADX INFO: loaded from: classes2.dex */
public final class ws4 implements opb<vs4> {
    public final rn9<ot1, PooledByteBuffer> a;
    public final am3 b;
    public final opb<vs4> c;

    public static class a extends xs3<vs4, vs4> {
        public final rn9<ot1, PooledByteBuffer> c;
        public final ot1 d;
        public final boolean e;
        public final boolean f;

        public a(xq2 xq2Var, rn9 rn9Var, ot1 ot1Var, boolean z) {
            super(xq2Var);
            this.c = rn9Var;
            this.d = ot1Var;
            this.e = z;
            this.f = true;
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
            try {
                it5.a();
                boolean zB = w81.b(i);
                xq2<O> xq2Var = this.b;
                if (!zB && vs4Var != null) {
                    if (!((i & 10) != 0)) {
                        vs4Var.b0();
                        if (vs4Var.b != z07.c) {
                            n82<PooledByteBuffer> n82VarV = n82.v(vs4Var.a);
                            if (n82VarV != null) {
                                try {
                                    n82<PooledByteBuffer> n82VarA = (this.f && this.e) ? this.c.a(this.d, n82VarV) : null;
                                    if (n82VarA != null) {
                                        try {
                                            vs4 vs4Var2 = new vs4(n82VarA);
                                            vs4Var2.p(vs4Var);
                                            try {
                                                xq2Var.w(1.0f);
                                                xq2Var.v(i, vs4Var2);
                                                return;
                                            } finally {
                                                vs4Var2.close();
                                            }
                                        } finally {
                                            n82VarA.close();
                                        }
                                    }
                                } finally {
                                    n82VarV.close();
                                }
                            }
                            xq2Var.v(i, vs4Var);
                            return;
                        }
                    }
                }
                xq2Var.v(i, vs4Var);
            } finally {
                it5.a();
            }
        }
    }

    public ws4(up1 up1Var, am3 am3Var, opb opbVar) {
        this.a = up1Var;
        this.b = am3Var;
        this.c = opbVar;
    }

    @Override // defpackage.opb
    public final void a(xq2<vs4> xq2Var, ppb ppbVar) {
        try {
            it5.a();
            tpb tpbVarG = ppbVar.G();
            tpbVarG.k(ppbVar, "EncodedMemoryCacheProducer");
            lfe lfeVarB = this.b.b(ppbVar.Q(), ppbVar.a());
            boolean zC = ppbVar.Q().c(4);
            rn9<ot1, PooledByteBuffer> rn9Var = this.a;
            n82<PooledByteBuffer> n82Var = zC ? rn9Var.get(lfeVarB) : null;
            try {
                if (n82Var != null) {
                    vs4 vs4Var = new vs4(n82Var);
                    try {
                        tpbVarG.a(ppbVar, "EncodedMemoryCacheProducer", tpbVarG.j(ppbVar, "EncodedMemoryCacheProducer") ? g47.d("cached_value_found", "true") : null);
                        tpbVarG.c(ppbVar, "EncodedMemoryCacheProducer", true);
                        ppbVar.s("memory_encoded");
                        xq2Var.w(1.0f);
                        xq2Var.v(1, vs4Var);
                        vs4Var.close();
                        n82Var.close();
                        return;
                    } catch (Throwable th) {
                        vs4Var.close();
                        throw th;
                    }
                }
                if (ppbVar.h0().c() >= a.c.ENCODED_MEMORY_CACHE.c()) {
                    tpbVarG.a(ppbVar, "EncodedMemoryCacheProducer", tpbVarG.j(ppbVar, "EncodedMemoryCacheProducer") ? g47.d("cached_value_found", "false") : null);
                    tpbVarG.c(ppbVar, "EncodedMemoryCacheProducer", false);
                    ppbVar.p("memory_encoded", "nil-result");
                    xq2Var.v(1, null);
                    return;
                }
                boolean zC2 = ppbVar.Q().c(8);
                ppbVar.h().b().getClass();
                a aVar = new a(xq2Var, rn9Var, lfeVarB, zC2);
                tpbVarG.a(ppbVar, "EncodedMemoryCacheProducer", tpbVarG.j(ppbVar, "EncodedMemoryCacheProducer") ? g47.d("cached_value_found", "false") : null);
                this.c.a(aVar, ppbVar);
            } finally {
                n82.G(n82Var);
            }
        } finally {
            it5.a();
        }
    }
}
