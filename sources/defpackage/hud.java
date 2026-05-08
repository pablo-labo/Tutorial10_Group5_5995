package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.ui.SearchOverlayViewModel", f = "SearchOverlayViewModel.kt", l = {387, 391}, m = "updateDetectedLocation")
public final class hud extends pu2 {
    double D$0;
    double D$1;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cud this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hud(cud cudVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = cudVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return cud.g(this.this$0, 0.0d, 0.0d, this);
    }
}
