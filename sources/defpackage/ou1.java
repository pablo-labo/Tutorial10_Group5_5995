package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", l = {111}, m = "invokeSuspend")
public final class ou1 extends c1f implements wu5<wi5<? super l2b<Object>>, Throwable, lu2<? super j6g>, Object> {
    final /* synthetic */ s7 $tracker;
    int label;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0 || i == 1) {
            r7d.b(obj);
            return j6g.a;
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.wu5
    public final Object q(wi5<? super l2b<Object>> wi5Var, Throwable th, lu2<? super j6g> lu2Var) {
        return new ou1(3, lu2Var).invokeSuspend(j6g.a);
    }
}
