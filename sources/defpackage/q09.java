package defpackage;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q09 implements opb<vs4> {
    public final Executor a;
    public final yn9 b;

    public class a extends xse<vs4> {
        public final /* synthetic */ tpb V;
        public final /* synthetic */ ppb W;
        public final /* synthetic */ com.facebook.imagepipeline.request.a f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xq2 xq2Var, tpb tpbVar, ppb ppbVar, String str, com.facebook.imagepipeline.request.a aVar, tpb tpbVar2, ppb ppbVar2) {
            super(xq2Var, tpbVar, ppbVar, str);
            this.f = aVar;
            this.V = tpbVar2;
            this.W = ppbVar2;
        }

        @Override // defpackage.xse
        public final void b(Object obj) {
            vs4.h((vs4) obj);
        }

        @Override // defpackage.xse
        public final Object d() {
            com.facebook.imagepipeline.request.a aVar = this.f;
            q09 q09Var = q09.this;
            vs4 vs4VarD = q09Var.d(aVar);
            tpb tpbVar = this.V;
            ppb ppbVar = this.W;
            if (vs4VarD == null) {
                tpbVar.c(ppbVar, q09Var.e(), false);
                ppbVar.p("local", "fetch");
                return null;
            }
            vs4VarD.N();
            tpbVar.c(ppbVar, q09Var.e(), true);
            ppbVar.p("local", "fetch");
            vs4VarD.b0();
            ppbVar.f0(vs4VarD.Y, "image_color_space");
            return vs4VarD;
        }
    }

    public class b extends pa1 {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.qpb
        public final void b() {
            this.a.a();
        }
    }

    public q09(Executor executor, yn9 yn9Var) {
        this.a = executor;
        this.b = yn9Var;
    }

    @Override // defpackage.opb
    public final void a(xq2<vs4> xq2Var, ppb ppbVar) {
        tpb tpbVarG = ppbVar.G();
        com.facebook.imagepipeline.request.a aVarQ = ppbVar.Q();
        ppbVar.p("local", "fetch");
        a aVar = new a(xq2Var, tpbVarG, ppbVar, e(), aVarQ, tpbVarG, ppbVar);
        ppbVar.v(new b(aVar));
        this.a.execute(aVar);
    }

    public final vs4 c(InputStream inputStream, int i) {
        im3 im3VarB0 = null;
        yn9 yn9Var = this.b;
        try {
            im3VarB0 = i <= 0 ? n82.b0(yn9Var.a(inputStream)) : n82.b0(yn9Var.b(inputStream, i));
            vs4 vs4Var = new vs4(im3VarB0);
            r82.b(inputStream);
            im3VarB0.close();
            return vs4Var;
        } catch (Throwable th) {
            r82.b(inputStream);
            n82.G(im3VarB0);
            throw th;
        }
    }

    public abstract vs4 d(com.facebook.imagepipeline.request.a aVar);

    public abstract String e();
}
