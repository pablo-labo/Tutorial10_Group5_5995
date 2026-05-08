package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
public final class tza extends c1f implements wu5<tw5, tw5, lu2<? super tw5>, Object> {
    final /* synthetic */ zz8 $loadType;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tza(zz8 zz8Var, lu2<? super tza> lu2Var) {
        super(3, lu2Var);
        this.$loadType = zz8Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        tw5 tw5Var = (tw5) this.L$0;
        tw5 tw5Var2 = (tw5) this.L$1;
        zz8 zz8Var = this.$loadType;
        tw5Var2.getClass();
        tw5Var.getClass();
        zz8Var.getClass();
        int i = tw5Var2.a;
        int i2 = tw5Var.a;
        return i > i2 ? true : i < i2 ? false : pnb.N(tw5Var2.b, tw5Var.b, zz8Var) ? tw5Var2 : tw5Var;
    }

    @Override // defpackage.wu5
    public final Object q(tw5 tw5Var, tw5 tw5Var2, lu2<? super tw5> lu2Var) {
        tza tzaVar = new tza(this.$loadType, lu2Var);
        tzaVar.L$0 = tw5Var;
        tzaVar.L$1 = tw5Var2;
        return tzaVar.invokeSuspend(j6g.a);
    }
}
