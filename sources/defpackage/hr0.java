package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel", f = "AppliedTabViewModel.kt", l = {271, 272}, m = "ensurePageToken")
public final class hr0 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ fr0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr0(fr0 fr0Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = fr0Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(this);
    }
}
