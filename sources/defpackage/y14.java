package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.rnsearch.detectlocation.DetectLocationHandler", f = "DetectLocationHandler.kt", l = {59, 60}, m = "detectLocation")
public final class y14 extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c24 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y14(c24 c24Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = c24Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c24.a(this.this$0, this);
    }
}
