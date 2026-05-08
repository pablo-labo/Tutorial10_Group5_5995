package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabViewModel", f = "InvitationTabViewModel.kt", l = {506, 515, 516}, m = "fetchWithRetry")
public final class fn7 extends pu2 {
    int I$0;
    int I$1;
    long J$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bn7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn7(bn7 bn7Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = bn7Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(0, 0, this);
    }
}
