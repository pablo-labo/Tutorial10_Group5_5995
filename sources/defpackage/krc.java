package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {25}, m = "proceed")
public final class krc extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mrc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krc(mrc mrcVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = mrcVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
