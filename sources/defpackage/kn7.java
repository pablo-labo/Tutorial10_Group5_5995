package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabViewModel", f = "InvitationTabViewModel.kt", l = {483}, m = "waitForFetchCompletion")
public final class kn7 extends pu2 {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bn7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn7(bn7 bn7Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = bn7Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.o(this);
    }
}
