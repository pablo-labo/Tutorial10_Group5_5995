package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", l = {445}, m = "initialize")
public final class t0d extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s0d<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0d(s0d s0dVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = s0dVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
