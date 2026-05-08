package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {105}, m = "invokeSuspend")
public final class lu1 extends c1f implements wu5<wi5<? super c2a<Object>>, l2b<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ e13 $scope$inlined;
    final /* synthetic */ s7 $tracker$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu1(lu2 lu2Var, e13 e13Var) {
        super(3, lu2Var);
        this.$scope$inlined = e13Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            wi5 wi5Var = (wi5) this.L$0;
            c2a c2aVar = new c2a(this.$scope$inlined, (l2b) this.L$1);
            this.label = 1;
            Object objA = wi5Var.a(c2aVar, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
                return g13Var;
            }
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
    public final Object q(wi5<? super c2a<Object>> wi5Var, l2b<Object> l2bVar, lu2<? super j6g> lu2Var) {
        lu1 lu1Var = new lu1(lu2Var, this.$scope$inlined);
        lu1Var.L$0 = wi5Var;
        lu1Var.L$1 = l2bVar;
        return lu1Var.invokeSuspend(j6g.a);
    }
}
