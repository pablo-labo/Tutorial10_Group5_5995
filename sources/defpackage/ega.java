package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {244}, m = "toImageSource")
public final class ega extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cga this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ega(cga cgaVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = cgaVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return cga.b(this.this$0, null, this);
    }
}
