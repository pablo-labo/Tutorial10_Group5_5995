package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {122, 126, 144}, m = "execute")
public final class lt4 extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ht4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt4(ht4 ht4Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ht4Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ht4.c(this.this$0, null, null, null, null, this);
    }
}
