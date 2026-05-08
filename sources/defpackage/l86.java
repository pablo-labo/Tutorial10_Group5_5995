package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.ghostwriter.services.GhostwriterTasks", f = "GhostwriterTasks.kt", l = {43}, m = "getTestAutoAppliableJobs$suspendImpl")
public final class l86 extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r86 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l86(r86 r86Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = r86Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return r86.G(this.this$0, null, this);
    }
}
