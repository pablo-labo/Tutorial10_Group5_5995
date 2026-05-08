package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", l = {141}, m = "invokeSuspend")
public final class brc extends c1f implements Function2<e13, lu2<? super c37>, Object> {
    final /* synthetic */ k07 $cachedPlaceholder;
    final /* synthetic */ cz4 $eventListener;
    final /* synthetic */ w27 $request;
    final /* synthetic */ iie $size;
    int label;
    final /* synthetic */ xqc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brc(w27 w27Var, xqc xqcVar, iie iieVar, cz4 cz4Var, k07 k07Var, lu2<? super brc> lu2Var) {
        super(2, lu2Var);
        this.$request = w27Var;
        this.this$0 = xqcVar;
        this.$size = iieVar;
        this.$eventListener = cz4Var;
        this.$cachedPlaceholder = k07Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new brc(this.$request, this.this$0, this.$size, this.$eventListener, this.$cachedPlaceholder, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super c37> lu2Var) {
        return ((brc) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        w27 w27Var = this.$request;
        lrc lrcVar = new lrc(w27Var, this.this$0.d.a, 0, w27Var, this.$size, this.$eventListener, this.$cachedPlaceholder != null);
        this.label = 1;
        Object objB = lrcVar.b(this);
        g13 g13Var = g13.a;
        return objB == g13Var ? g13Var : objB;
    }
}
