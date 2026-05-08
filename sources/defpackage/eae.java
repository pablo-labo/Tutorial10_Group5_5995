package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {138, 139}, m = "updateSettings")
public final class eae extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dae this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eae(dae daeVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = daeVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
