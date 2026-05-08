package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.ghostwriter.services.GhostwriterTasks", f = "GhostwriterTasks.kt", l = {188}, m = "deleteApplication$suspendImpl")
public final class h86 extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r86 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h86(r86 r86Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = r86Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return r86.g(this.this$0, null, null, this);
    }
}
