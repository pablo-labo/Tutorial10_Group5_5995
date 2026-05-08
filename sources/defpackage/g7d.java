package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.sharedui.responsiveness.ResponsivenessService", f = "ResponsivenessService.kt", l = {28}, m = "getResponsiveness")
public final class g7d extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h7d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7d(h7d h7dVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = h7dVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
