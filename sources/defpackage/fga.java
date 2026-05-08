package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {138, 153}, m = "writeToDiskCache")
public final class fga extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cga this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fga(cga cgaVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = cgaVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return cga.c(this.this$0, null, null, null, null, this);
    }
}
