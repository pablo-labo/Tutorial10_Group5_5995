package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.api.messaging.MessagingTasks", f = "MessagingTasks.kt", l = {77}, m = "downloadAttachmentFile$suspendImpl")
public final class bs9 extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ gs9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs9(gs9 gs9Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = gs9Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return gs9.e(this.this$0, null, null, null, null, this);
    }
}
