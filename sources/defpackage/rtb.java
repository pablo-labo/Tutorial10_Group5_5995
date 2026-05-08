package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel", f = "ProfilePreferencesViewModel.kt", l = {419}, m = "updatePreferredJobTitlesWithPreferenceId")
public final class rtb extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtb(aub aubVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = aubVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return aub.g(this.this$0, null, null, null, this);
    }
}
