package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.DiskCacheDecision;
import com.facebook.imagepipeline.request.a;
import defpackage.am3;
import defpackage.f64;
import defpackage.gze;
import defpackage.it5;
import defpackage.lfe;
import defpackage.opb;
import defpackage.po1;
import defpackage.ppb;
import defpackage.r6;
import defpackage.s55;
import defpackage.sqe;
import defpackage.ta0;
import defpackage.vs4;
import defpackage.w81;
import defpackage.web;
import defpackage.xq2;
import defpackage.xs3;
import defpackage.z07;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements opb<vs4> {
    public final gze<f64> a;
    public final am3 b;
    public final opb<vs4> c;

    public static class a extends xs3<vs4, vs4> {
        public final ppb c;
        public final gze<f64> d;
        public final am3 e;

        public a(xq2 xq2Var, ppb ppbVar, gze gzeVar, am3 am3Var) {
            super(xq2Var);
            this.c = ppbVar;
            this.d = gzeVar;
            this.e = am3Var;
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
            xq2<O> xq2Var = this.b;
            ppb ppbVar = this.c;
            ppbVar.G().k(ppbVar, "DiskCacheWriteProducer");
            if (!w81.b(i) && vs4Var != null && (i & 10) == 0) {
                vs4Var.b0();
                if (vs4Var.b != z07.c) {
                    com.facebook.imagepipeline.request.a aVarQ = ppbVar.Q();
                    lfe lfeVarB = this.e.b(aVarQ, ppbVar.a());
                    f64 f64Var = this.d.get();
                    po1 po1VarA = DiskCacheDecision.a(aVarQ, f64Var.a(), f64Var.b(), f64Var.c());
                    if (po1VarA == null) {
                        ppbVar.G().h(ppbVar, "DiskCacheWriteProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(aVarQ.a.ordinal()).toString()), null);
                        xq2Var.v(i, vs4Var);
                        return;
                    }
                    Executor executor = po1VarA.e;
                    sqe sqeVar = po1VarA.g;
                    lfeVarB.getClass();
                    vs4Var.getClass();
                    it5.a();
                    if (vs4.W(vs4Var)) {
                        synchronized (sqeVar) {
                            lfeVarB.getClass();
                            web.e(Boolean.valueOf(vs4.W(vs4Var)));
                            vs4.h((vs4) sqeVar.a.put(lfeVarB, vs4.a(vs4Var)));
                            sqeVar.c();
                        }
                        vs4 vs4VarA = vs4.a(vs4Var);
                        try {
                            executor.execute(new ta0(1, po1VarA, lfeVarB, vs4VarA));
                        } catch (Exception e) {
                            s55.m(e, "Failed to schedule disk-cache write for %s", lfeVarB.a());
                            sqeVar.e(lfeVarB, vs4Var);
                            vs4.h(vs4VarA);
                        }
                    } else {
                        r6.g("Check failed.");
                    }
                    ppbVar.G().a(ppbVar, "DiskCacheWriteProducer", null);
                    xq2Var.v(i, vs4Var);
                    return;
                }
            }
            ppbVar.G().a(ppbVar, "DiskCacheWriteProducer", null);
            xq2Var.v(i, vs4Var);
        }
    }

    public b(gze<f64> gzeVar, am3 am3Var, opb<vs4> opbVar) {
        this.a = gzeVar;
        this.b = am3Var;
        this.c = opbVar;
    }

    @Override // defpackage.opb
    public final void a(xq2<vs4> xq2Var, ppb ppbVar) {
        if (ppbVar.h0().c() >= a.c.DISK_CACHE.c()) {
            ppbVar.p("disk", "nil-result_write");
            xq2Var.v(1, null);
        } else {
            if (ppbVar.Q().c(32)) {
                xq2Var = new a(xq2Var, ppbVar, this.a, this.b);
            }
            this.c.a(xq2Var, ppbVar);
        }
    }
}
