package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class skf<T> implements opb<T> {
    public final opb<T> a;
    public final z1b b;

    public static final class a {
    }

    public static final class b extends pa1 {
        public final /* synthetic */ c a;
        public final /* synthetic */ skf<T> b;

        public b(c cVar, skf skfVar) {
            this.a = cVar;
            this.b = skfVar;
        }

        @Override // defpackage.qpb
        public final void b() {
            this.a.a();
            z1b z1bVar = this.b.b;
            c cVar = this.a;
            synchronized (z1bVar) {
                ((ArrayDeque) z1bVar.b).remove(cVar);
            }
        }
    }

    public static final class c extends xse<T> {
        public final /* synthetic */ tpb V;
        public final /* synthetic */ ppb W;
        public final /* synthetic */ skf<T> X;
        public final /* synthetic */ xq2<T> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xq2<T> xq2Var, tpb tpbVar, ppb ppbVar, skf<T> skfVar) {
            super(xq2Var, tpbVar, ppbVar, "BackgroundThreadHandoffProducer");
            this.f = xq2Var;
            this.V = tpbVar;
            this.W = ppbVar;
            this.X = skfVar;
        }

        @Override // defpackage.xse
        public final void b(T t) {
        }

        @Override // defpackage.xse
        public final T d() {
            return null;
        }

        @Override // defpackage.xse
        public final void g(T t) {
            tpb tpbVar = this.V;
            ppb ppbVar = this.W;
            tpbVar.a(ppbVar, "BackgroundThreadHandoffProducer", null);
            this.X.a.a(this.f, ppbVar);
        }
    }

    public skf(opb<T> opbVar, z1b z1bVar) {
        opbVar.getClass();
        z1bVar.getClass();
        this.a = opbVar;
        this.b = z1bVar;
    }

    @Override // defpackage.opb
    public final void a(xq2<T> xq2Var, ppb ppbVar) {
        z1b z1bVar = this.b;
        xq2Var.getClass();
        ppbVar.getClass();
        it5.a();
        tpb tpbVarG = ppbVar.G();
        ppbVar.h().b().getClass();
        c cVar = new c(xq2Var, tpbVarG, ppbVar, this);
        ppbVar.v(new b(cVar, this));
        synchronized (z1bVar) {
            ((Executor) z1bVar.a).execute(cVar);
        }
    }
}
