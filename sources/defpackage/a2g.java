package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.UIPMessagingEventsImpl", f = "UIPMessagingEventsImpl.kt", l = {93}, m = "refreshUnreadMessagesCount")
public final class a2g extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ z1g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2g(z1g z1gVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = z1gVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, this);
    }
}
