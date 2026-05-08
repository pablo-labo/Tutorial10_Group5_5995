package defpackage;

import defpackage.cg7;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {32, 40}, m = "create")
public final class bg7 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cg7.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg7(cg7.a aVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
