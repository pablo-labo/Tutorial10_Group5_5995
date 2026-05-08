package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewTabViewModel", f = "InterviewTabViewModel.kt", l = {581, 590, 591}, m = "fetchWithRetry")
public final class nk7 extends pu2 {
    int I$0;
    int I$1;
    long J$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mk7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk7(mk7 mk7Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = mk7Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.o(0, 0, this);
    }
}
