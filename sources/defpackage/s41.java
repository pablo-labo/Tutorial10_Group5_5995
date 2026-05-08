package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.services.AutocompleteRemoteDataSource", f = "AutocompleteRemoteDataSource.kt", l = {328}, m = "getSkillSuggestions")
public final class s41 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t41 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s41(t41 t41Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = t41Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.v(null, this);
    }
}
