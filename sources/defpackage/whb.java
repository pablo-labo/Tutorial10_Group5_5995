package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class whb implements opb<n82<l82>> {
    public final opb<n82<l82>> a;
    public final bbb b;
    public final Executor c;

    public class a extends xs3<n82<l82>, n82<l82>> {
        public final tpb c;
        public final ppb d;
        public final vhb e;
        public boolean f;
        public n82<l82> g;
        public int h;
        public boolean i;
        public boolean j;

        /* JADX INFO: renamed from: whb$a$a, reason: collision with other inner class name */
        public class C0468a extends pa1 {
            public C0468a() {
            }

            @Override // defpackage.qpb
            public final void b() {
                a aVar = a.this;
                if (aVar.j()) {
                    aVar.b.u();
                }
            }
        }

        public a(xq2<n82<l82>> xq2Var, tpb tpbVar, vhb vhbVar, ppb ppbVar) {
            super(xq2Var);
            this.g = null;
            this.h = 0;
            this.i = false;
            this.j = false;
            this.c = tpbVar;
            this.e = vhbVar;
            this.d = ppbVar;
            ppbVar.v(new C0468a());
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
        public static void i(a aVar, n82 n82Var, int i) throws Throwable {
            im3 im3VarL;
            vhb vhbVar = aVar.e;
            ppb ppbVar = aVar.d;
            tpb tpbVar = aVar.c;
            web.e(Boolean.valueOf(n82.W(n82Var)));
            if (!(((l82) n82Var.P()) instanceof p82)) {
                aVar.k(n82Var, i);
                return;
            }
            tpbVar.k(ppbVar, "PostprocessorProducer");
            im3 im3Var = null;
            Map<String, String> mapD = null;
            try {
                try {
                    im3VarL = aVar.l((l82) n82Var.P());
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (tpbVar.j(ppbVar, "PostprocessorProducer")) {
                        mapD = g47.d("Postprocessor", vhbVar.getName());
                    }
                    tpbVar.a(ppbVar, "PostprocessorProducer", mapD);
                    aVar.k(im3VarL, i);
                    n82.G(im3VarL);
                } catch (Throwable th2) {
                    th = th2;
                    im3Var = im3VarL;
                    n82.G(im3Var);
                    throw th;
                }
            } catch (Exception e) {
                tpbVar.h(ppbVar, "PostprocessorProducer", e, !tpbVar.j(ppbVar, "PostprocessorProducer") ? null : g47.d("Postprocessor", vhbVar.getName()));
                if (aVar.j()) {
                    aVar.b.t(e);
                    return;
                }
                return;
                n82.G(im3Var);
                throw th;
            }
        }

        @Override // defpackage.xs3, defpackage.w81
        public final void c() {
            if (j()) {
                this.b.u();
            }
        }

        @Override // defpackage.xs3, defpackage.w81
        public final void d(Throwable th) {
            if (j()) {
                this.b.t(th);
            }
        }

        @Override // defpackage.w81
        public final void e(int i, Object obj) {
            n82 n82Var = (n82) obj;
            if (!n82.W(n82Var)) {
                if (w81.a(i)) {
                    k(null, i);
                    return;
                }
                return;
            }
            synchronized (this) {
                try {
                    if (this.f) {
                        return;
                    }
                    n82<l82> n82Var2 = this.g;
                    this.g = n82.v(n82Var);
                    this.h = i;
                    this.i = true;
                    boolean zM = m();
                    n82.G(n82Var2);
                    if (zM) {
                        whb.this.c.execute(new xhb(this));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean j() {
            synchronized (this) {
                try {
                    if (this.f) {
                        return false;
                    }
                    n82<l82> n82Var = this.g;
                    this.g = null;
                    this.f = true;
                    n82.G(n82Var);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void k(defpackage.n82<defpackage.l82> r3, int r4) {
            /*
                r2 = this;
                boolean r0 = defpackage.w81.a(r4)
                if (r0 != 0) goto L10
                monitor-enter(r2)
                boolean r1 = r2.f     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)
                if (r1 == 0) goto L18
                goto L10
            Ld:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
            L10:
                if (r0 == 0) goto L1d
                boolean r0 = r2.j()
                if (r0 == 0) goto L1d
            L18:
                xq2<O> r2 = r2.b
                r2.v(r4, r3)
            L1d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: whb.a.k(n82, int):void");
        }

        public final im3 l(l82 l82Var) {
            p82 p82Var = (p82) l82Var;
            n82<Bitmap> n82VarA = this.e.a(p82Var.t1(), whb.this.b);
            int iX0 = p82Var.X0();
            int iD0 = p82Var.D0();
            try {
                h47 h47VarO1 = l82Var.o1();
                int i = jm3.X;
                jm3 jm3Var = new jm3(n82VarA, h47VarO1, iX0, iD0);
                jm3Var.W(p82Var.getExtras());
                im3 im3VarB0 = n82.b0(jm3Var);
                n82VarA.close();
                return im3VarB0;
            } catch (Throwable th) {
                n82.G(n82VarA);
                throw th;
            }
        }

        public final synchronized boolean m() {
            if (this.f || !this.i || this.j || !n82.W(this.g)) {
                return false;
            }
            this.j = true;
            return true;
        }
    }

    public class b extends xs3<n82<l82>, n82<l82>> {
        public boolean c;
        public n82<l82> d;

        @Override // defpackage.xs3, defpackage.w81
        public final void c() {
            if (i()) {
                this.b.u();
            }
        }

        @Override // defpackage.xs3, defpackage.w81
        public final void d(Throwable th) {
            if (i()) {
                this.b.t(th);
            }
        }

        @Override // defpackage.w81
        public final void e(int i, Object obj) {
            n82 n82Var = (n82) obj;
            if (w81.b(i)) {
                return;
            }
            synchronized (this) {
                try {
                    if (!this.c) {
                        n82<l82> n82Var2 = this.d;
                        this.d = n82.v(n82Var);
                        n82.G(n82Var2);
                    }
                } finally {
                }
            }
            synchronized (this) {
                try {
                    if (this.c) {
                        return;
                    }
                    n82 n82VarV = n82.v(this.d);
                    try {
                        this.b.v(0, n82VarV);
                    } finally {
                        n82.G(n82VarV);
                    }
                } finally {
                }
            }
        }

        public final boolean i() {
            synchronized (this) {
                try {
                    if (this.c) {
                        return false;
                    }
                    n82<l82> n82Var = this.d;
                    this.d = null;
                    this.c = true;
                    n82.G(n82Var);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class c extends xs3<n82<l82>, n82<l82>> {
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
            n82 n82Var = (n82) obj;
            if (w81.b(i)) {
                return;
            }
            this.b.v(i, n82Var);
        }
    }

    public whb(opb<n82<l82>> opbVar, bbb bbbVar, Executor executor) {
        opbVar.getClass();
        this.a = opbVar;
        this.b = bbbVar;
        executor.getClass();
        this.c = executor;
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
    @Override // defpackage.opb
    public final void a(xq2<n82<l82>> xq2Var, ppb ppbVar) {
        xq2<n82<l82>> cVar;
        tpb tpbVarG = ppbVar.G();
        vhb vhbVar = ppbVar.Q().p;
        vhbVar.getClass();
        a aVar = new a(xq2Var, tpbVarG, vhbVar, ppbVar);
        if (vhbVar instanceof e2d) {
            b bVar = new b(aVar);
            bVar.c = false;
            bVar.d = null;
            ((e2d) vhbVar).b();
            ppbVar.v(new yhb(bVar));
            cVar = bVar;
        } else {
            cVar = new c(aVar);
        }
        this.a.a(cVar, ppbVar);
    }
}
