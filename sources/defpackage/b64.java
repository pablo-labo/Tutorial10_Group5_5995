package defpackage;

import com.facebook.imagepipeline.producers.a;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class b64 implements mu2<vs4, Void> {
    public final /* synthetic */ tpb a;
    public final /* synthetic */ ppb b;
    public final /* synthetic */ xq2 c;
    public final /* synthetic */ a d;

    public b64(a aVar, tpb tpbVar, ppb ppbVar, xq2 xq2Var) {
        this.d = aVar;
        this.a = tpbVar;
        this.b = ppbVar;
        this.c = xq2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mu2
    public final void a(oaf oafVar) {
        boolean z;
        TResult tresult;
        a aVar = this.d;
        tpb tpbVar = this.a;
        xq2<vs4> xq2Var = this.c;
        ppb ppbVar = this.b;
        synchronized (oafVar.a) {
            z = oafVar.c;
        }
        if (z || (oafVar.d() && (oafVar.c() instanceof CancellationException))) {
            tpbVar.f(ppbVar, "DiskCacheProducer");
            xq2Var.u();
            return;
        }
        if (oafVar.d()) {
            tpbVar.h(ppbVar, "DiskCacheProducer", oafVar.c(), null);
            aVar.c.a(xq2Var, ppbVar);
            return;
        }
        synchronized (oafVar.a) {
            tresult = oafVar.d;
        }
        vs4 vs4Var = (vs4) tresult;
        if (vs4Var == null) {
            tpbVar.a(ppbVar, "DiskCacheProducer", a.c(tpbVar, ppbVar, false, 0));
            aVar.c.a(xq2Var, ppbVar);
            return;
        }
        tpbVar.a(ppbVar, "DiskCacheProducer", a.c(tpbVar, ppbVar, true, vs4Var.G()));
        tpbVar.c(ppbVar, "DiskCacheProducer", true);
        ppbVar.s("disk");
        xq2Var.w(1.0f);
        xq2Var.v(1, vs4Var);
        vs4Var.close();
    }
}
