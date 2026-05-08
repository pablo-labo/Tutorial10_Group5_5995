package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {102}, m = "bringIntoView")
public final class gn1 extends pu2 {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ hn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn1(hn1 hn1Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = hn1Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
