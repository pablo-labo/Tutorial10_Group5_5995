package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.kt", l = {}, m = "invokeSuspend")
public final class d1f extends c1f implements Function2<e13, lu2<? super r2b<Object, Object>>, Object> {
    int label;
    final /* synthetic */ e1f<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1f(e1f<Object, Object> e1fVar, lu2<? super d1f> lu2Var) {
        super(2, lu2Var);
        this.this$0 = e1fVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new d1f(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super r2b<Object, Object>> lu2Var) {
        ((d1f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        throw null;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r7d.b(obj);
        this.this$0.getClass();
        throw null;
    }
}
