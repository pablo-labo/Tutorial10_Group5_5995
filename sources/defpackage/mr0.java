package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel", f = "AppliedTabViewModel.kt", l = {608}, m = "waitForFetchCompletion")
public final class mr0 extends pu2 {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ fr0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(fr0 fr0Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = fr0Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(this);
    }
}
