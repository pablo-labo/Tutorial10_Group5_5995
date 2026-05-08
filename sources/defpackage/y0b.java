package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", l = {}, m = "invokeSuspend")
public final class y0b extends c1f implements Function1<lu2<? super r2b<Object, Object>>, Object> {
    final /* synthetic */ gu5<r2b<Object, Object>> $pagingSourceFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0b(gu5<? extends r2b<Object, Object>> gu5Var, lu2<? super y0b> lu2Var) {
        super(1, lu2Var);
        this.$pagingSourceFactory = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new y0b(this.$pagingSourceFactory, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super r2b<Object, Object>> lu2Var) {
        return ((y0b) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            r7d.b(obj);
            return this.$pagingSourceFactory.invoke();
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
