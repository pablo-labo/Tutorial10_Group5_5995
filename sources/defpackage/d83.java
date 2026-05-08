package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tracking.CtkAaidMapTracking", f = "CtkAaidMapTracking.kt", l = {53}, m = "noParallel")
public final class d83 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e83 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d83(e83 e83Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = e83Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        e83 e83Var = this.this$0;
        e83 e83Var2 = e83.a;
        return e83Var.c(null, this);
    }
}
