package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel", f = "SavedTabViewModel.kt", l = {567, 583}, m = "getSavedJobsAsync")
public final class rld extends pu2 {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pld this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rld(pld pldVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = pldVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(0, this);
    }
}
