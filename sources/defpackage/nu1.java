package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.CachedPagingDataKt$cachedIn$4", f = "CachedPagingData.kt", l = {109}, m = "invokeSuspend")
public final class nu1 extends c1f implements Function2<wi5<? super l2b<Object>>, lu2<? super j6g>, Object> {
    final /* synthetic */ s7 $tracker;
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new nu1(2, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super l2b<Object>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((nu1) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

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
}
