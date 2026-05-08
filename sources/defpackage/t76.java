package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.ghostwriter.services.GhostwriterImpl", f = "GhostwriterImpl.kt", l = {102}, m = "getTestAutoAppliableJobs")
public final class t76 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x76 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t76(x76 x76Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = x76Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
