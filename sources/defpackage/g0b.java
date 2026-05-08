package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
public final class g0b extends c1f implements Function2<wi5<? super Integer>, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ e0b<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0b(e0b<Object, Object> e0bVar, lu2<? super g0b> lu2Var) {
        super(2, lu2Var);
        this.this$0 = e0bVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g0b(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super Integer> wi5Var, lu2<? super j6g> lu2Var) {
        return ((g0b) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.this$0.g.f(new Integer(0));
        return j6g.a;
    }
}
