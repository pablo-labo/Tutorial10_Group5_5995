package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tracking.AppLifecycleTracking", f = "AppLifecycleTracking.kt", l = {206}, m = "getLifecycleSnapshot")
public final class rl0 extends pu2 {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl0(sl0 sl0Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = sl0Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return sl0.i(this.this$0, this);
    }
}
