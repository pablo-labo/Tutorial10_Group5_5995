package defpackage;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import defpackage.sz7;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class w4d implements opb<vs4> {
    public final Executor a;
    public final yn9 b;
    public final opb<vs4> c;
    public final boolean d;
    public final m37 e;

    public class a extends xs3<vs4, vs4> {
        public final boolean c;
        public final m37 d;
        public final ppb e;
        public boolean f;
        public final sz7 g;

        /* JADX INFO: renamed from: w4d$a$a, reason: collision with other inner class name */
        public class C0465a implements sz7.a {
            public C0465a() {
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
            @Override // sz7.a
            public final void a(vs4 vs4Var, int i) {
                a aVar = a.this;
                xq2<O> xq2Var = aVar.b;
                if (vs4Var == null) {
                    xq2Var.v(i, null);
                    return;
                }
                m37 m37Var = aVar.d;
                vs4Var.b0();
                l37 l37VarCreateImageTranscoder = m37Var.createImageTranscoder(vs4Var.b, aVar.c);
                l37VarCreateImageTranscoder.getClass();
                ppb ppbVar = aVar.e;
                ppbVar.G().k(ppbVar, "ResizeAndRotateProducer");
                com.facebook.imagepipeline.request.a aVarQ = ppbVar.Q();
                MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStreamC = w4d.this.b.c();
                try {
                    try {
                        yfd yfdVar = aVarQ.i;
                        x4d x4dVar = aVarQ.h;
                        vs4Var.b0();
                        k37 k37VarB = l37VarCreateImageTranscoder.b(vs4Var, memoryPooledByteBufferOutputStreamC, yfdVar, x4dVar, vs4Var.Y);
                        int i2 = k37VarB.b;
                        if (i2 == 2) {
                            throw new RuntimeException("Error while transcoding the image");
                        }
                        g47 g47VarI = aVar.i(vs4Var, aVarQ.h, k37VarB, l37VarCreateImageTranscoder.a());
                        im3 im3VarB0 = n82.b0(memoryPooledByteBufferOutputStreamC.a());
                        try {
                            vs4 vs4Var2 = new vs4(im3VarB0);
                            vs4Var2.b = jo3.a;
                            try {
                                vs4Var2.N();
                                ppbVar.G().a(ppbVar, "ResizeAndRotateProducer", g47VarI);
                                if (i2 != 1) {
                                    i |= 16;
                                }
                                xq2Var.v(i, vs4Var2);
                                im3VarB0.close();
                                memoryPooledByteBufferOutputStreamC.close();
                            } finally {
                                vs4Var2.close();
                            }
                        } catch (Throwable th) {
                            n82.G(im3VarB0);
                            throw th;
                        }
                    } catch (Exception e) {
                        ppbVar.G().h(ppbVar, "ResizeAndRotateProducer", e, null);
                        if (w81.a(i)) {
                            xq2Var.t(e);
                        }
                        memoryPooledByteBufferOutputStreamC.close();
                    }
                } catch (Throwable th2) {
                    memoryPooledByteBufferOutputStreamC.close();
                    throw th2;
                }
            }
        }

        public class b extends pa1 {
            public final /* synthetic */ xq2 a;

            public b(xq2 xq2Var) {
                this.a = xq2Var;
            }

            @Override // defpackage.pa1, defpackage.qpb
            public final void a() {
                a aVar = a.this;
                if (aVar.e.N()) {
                    aVar.g.c();
                }
            }

            @Override // defpackage.qpb
            public final void b() {
                vs4 vs4Var;
                a aVar = a.this;
                sz7 sz7Var = aVar.g;
                synchronized (sz7Var) {
                    vs4Var = sz7Var.e;
                    sz7Var.e = null;
                    sz7Var.f = 0;
                }
                vs4.h(vs4Var);
                aVar.f = true;
                this.a.u();
            }
        }

        public a(xq2<vs4> xq2Var, ppb ppbVar, boolean z, m37 m37Var) {
            super(xq2Var);
            this.f = false;
            this.e = ppbVar;
            ppbVar.Q().getClass();
            this.c = z;
            this.d = m37Var;
            this.g = new sz7(w4d.this.a, new C0465a());
            ppbVar.v(new b(xq2Var));
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(int r17, java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w4d.a.e(int, java.lang.Object):void");
        }

        public final g47 i(vs4 vs4Var, x4d x4dVar, k37 k37Var, String str) {
            String str2;
            long j;
            ppb ppbVar = this.e;
            if (!ppbVar.G().j(ppbVar, "ResizeAndRotateProducer")) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            vs4Var.b0();
            sb.append(vs4Var.e);
            sb.append("x");
            vs4Var.b0();
            sb.append(vs4Var.f);
            String string = sb.toString();
            if (x4dVar != null) {
                str2 = x4dVar.a + "x" + x4dVar.b;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            vs4Var.b0();
            map.put("Image format", String.valueOf(vs4Var.b));
            map.put("Original size", string);
            map.put("Requested size", str2);
            sz7 sz7Var = this.g;
            synchronized (sz7Var) {
                j = sz7Var.i - sz7Var.h;
            }
            map.put("queueTime", String.valueOf(j));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(k37Var));
            return new g47(map);
        }
    }

    public w4d(Executor executor, yn9 yn9Var, opb<vs4> opbVar, boolean z, m37 m37Var) {
        executor.getClass();
        this.a = executor;
        yn9Var.getClass();
        this.b = yn9Var;
        this.c = opbVar;
        m37Var.getClass();
        this.e = m37Var;
        this.d = z;
    }

    @Override // defpackage.opb
    public final void a(xq2<vs4> xq2Var, ppb ppbVar) {
        this.c.a(new a(xq2Var, ppbVar, this.d, this.e), ppbVar);
    }
}
