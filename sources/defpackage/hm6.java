package defpackage;

import okhttp3.CacheControl;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {223}, m = "executeNetworkRequest")
public final class hm6 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ gm6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm6(gm6 gm6Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = gm6Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        gm6 gm6Var = this.this$0;
        CacheControl cacheControl = gm6.e;
        return gm6Var.b(null, this);
    }
}
