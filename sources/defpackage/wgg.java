package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.updatedterms.UpdatedTermsViewModel", f = "UpdatedTermsViewModel.kt", l = {51}, m = "recordUserConsentForTerms")
public final class wgg extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xgg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgg(xgg xggVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = xggVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(this);
    }
}
