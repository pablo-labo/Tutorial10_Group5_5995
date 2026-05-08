package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel", f = "ProfilePreferencesViewModel.kt", l = {116}, m = "getRemoteWorkPreferences")
public final class ysb extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysb(aub aubVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = aubVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.n(this);
    }
}
