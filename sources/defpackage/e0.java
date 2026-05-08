package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.eventlog.AaidIdProvider", f = "AaidIdProvider.kt", l = {51, 20}, m = "getAdvertisingId")
public final class e0 extends pu2 {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(d0 d0Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = d0Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
