package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", l = {53}, m = "invokeSuspend")
public final class a2a extends c1f implements wu5<wi5<? super kza<Object>>, Throwable, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ c2a<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2a(c2a<Object> c2aVar, lu2<? super a2a> lu2Var) {
        super(3, lu2Var);
        this.this$0 = c2aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.this$0.getClass();
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }

    @Override // defpackage.wu5
    public final Object q(wi5<? super kza<Object>> wi5Var, Throwable th, lu2<? super j6g> lu2Var) {
        return new a2a(this.this$0, lu2Var).invokeSuspend(j6g.a);
    }
}
