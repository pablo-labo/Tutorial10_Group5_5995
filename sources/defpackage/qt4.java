package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {64}, m = "intercept")
public final class qt4 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ vt4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt4(vt4 vt4Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = vt4Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
