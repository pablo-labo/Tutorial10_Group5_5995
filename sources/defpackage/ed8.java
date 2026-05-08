package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.http.JvmHttpEngine", f = "DefaultHttpEngine.jvm.kt", l = {53}, m = "execute", v = 1)
public final class ed8 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dd8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed8(dd8 dd8Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = dd8Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e0(null, this);
    }
}
