package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
public final class ode<T> extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nde<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ode(nde<T> ndeVar, lu2<? super ode> lu2Var) {
        super(lu2Var);
        this.this$0 = ndeVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        nde.o(this.this$0, null, this);
        return g13.a;
    }
}
