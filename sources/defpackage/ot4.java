package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {158}, m = "fetch")
public final class ot4 extends pu2 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ vt4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot4(vt4 vt4Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = vt4Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, null, null, null, this);
    }
}
