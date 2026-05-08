package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", l = {190, 230, 207}, m = "onNext")
public final class u5g extends pu2 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v5g<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5g(v5g v5gVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = v5gVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, null, this);
    }
}
