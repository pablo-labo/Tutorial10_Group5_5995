package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.passport.AppInitValuesHolder", f = "AppInitValuesHolder.kt", l = {157}, m = "getUnreadNotificationsCount")
public final class bl0 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ il0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl0(il0 il0Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = il0Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
