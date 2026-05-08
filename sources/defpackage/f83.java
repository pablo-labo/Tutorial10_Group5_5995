package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tracking.CtkAaidMapTracking", f = "CtkAaidMapTracking.kt", l = {89}, m = "submitCreationIfNeeded")
public final class f83 extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e83 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f83(e83 e83Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = e83Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e83.a(this.this$0, null, null, this);
    }
}
