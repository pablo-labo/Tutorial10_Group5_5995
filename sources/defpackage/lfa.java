package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.network.NetworkAutoCompleteRepository", f = "AutoCompleteRepository.kt", l = {33}, m = "getWhereSuggestions")
public final class lfa extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mfa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfa(mfa mfaVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = mfaVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
