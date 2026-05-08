package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zge extends mj8 implements Function1<Throwable, j6g> {
    final /* synthetic */ yge<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zge(yge<Object> ygeVar) {
        super(1);
        this.this$0 = ygeVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        Throwable th2 = th;
        if (th2 != null) {
            gse gseVar = this.this$0.V;
            ec5 ec5Var = new ec5(th2);
            gseVar.getClass();
            gseVar.m(null, ec5Var);
        }
        Object obj = yge.Z;
        yge<Object> ygeVar = this.this$0;
        synchronized (obj) {
            yge.Y.remove(ygeVar.c().getAbsolutePath());
        }
        return j6g.a;
    }
}
