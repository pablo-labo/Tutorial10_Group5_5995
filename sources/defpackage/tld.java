package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel", f = "SavedTabViewModel.kt", l = {594}, m = "waitForFetchCompletion")
public final class tld extends pu2 {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pld this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tld(pld pldVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = pldVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.r(this);
    }
}
