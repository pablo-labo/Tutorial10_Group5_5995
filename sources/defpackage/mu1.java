package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {104}, m = "invokeSuspend")
public final class mu1 extends c1f implements wu5<c2a<Object>, c2a<Object>, lu2<? super c2a<Object>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2a c2aVar = (c2a) this.L$0;
            r7d.b(obj);
            return c2aVar;
        }
        r7d.b(obj);
        c2a c2aVar2 = (c2a) this.L$0;
        c2a c2aVar3 = (c2a) this.L$1;
        this.L$0 = c2aVar3;
        this.label = 1;
        c2aVar2.c.d.h(null);
        j6g j6gVar = j6g.a;
        g13 g13Var = g13.a;
        return j6gVar == g13Var ? g13Var : c2aVar3;
    }

    @Override // defpackage.wu5
    public final Object q(c2a<Object> c2aVar, c2a<Object> c2aVar2, lu2<? super c2a<Object>> lu2Var) {
        mu1 mu1Var = new mu1(3, lu2Var);
        mu1Var.L$0 = c2aVar;
        mu1Var.L$1 = c2aVar2;
        return mu1Var.invokeSuspend(j6g.a);
    }
}
