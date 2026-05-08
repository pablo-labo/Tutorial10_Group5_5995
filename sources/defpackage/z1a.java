package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.MulticastedPagingData$asPagingData$1", f = "CachedPagingData.kt", l = {51}, m = "invokeSuspend")
public final class z1a extends c1f implements Function2<wi5<? super kza<Object>>, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ c2a<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1a(c2a<Object> c2aVar, lu2<? super z1a> lu2Var) {
        super(2, lu2Var);
        this.this$0 = c2aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new z1a(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super kza<Object>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((z1a) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
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
}
