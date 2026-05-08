package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tracking.AppLifecycleTracking", f = "AppLifecycleTracking.kt", l = {303, 48}, m = "trackOnAppStart")
public final class tl0 extends pu2 {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl0(sl0 sl0Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = sl0Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.n(false, null, this);
    }
}
