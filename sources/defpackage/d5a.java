package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.rnmyjobs.api.MyJobsApiDispatcher", f = "MyJobsApiDispatcher.kt", l = {313}, m = "handleDataStateFlow")
public final class d5a<T> extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c5a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5a(c5a c5aVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = c5aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
