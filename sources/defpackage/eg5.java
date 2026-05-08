package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {124}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
public final class eg5 extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dg5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg5(dg5 dg5Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = dg5Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
