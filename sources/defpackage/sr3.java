package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.ws.DefaultWebSocketEngine", f = "OkHttpWebSocketEngine.kt", l = {85}, m = "open", v = 1)
public final class sr3 extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ vr3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr3(vr3 vr3Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = vr3Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
