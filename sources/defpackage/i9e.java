package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {94}, m = "shouldLogSession")
public final class i9e extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h9e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9e(h9e h9eVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = h9eVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h9e.b(this.this$0, this);
    }
}
