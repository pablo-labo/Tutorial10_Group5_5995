package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.hamburgermenu.HamburgerMenuViewModel", f = "HamburgerMenuViewModel.kt", l = {138, 139}, m = "setNavMenuItems")
public final class hf6 extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ff6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf6(ff6 ff6Var, lu2<? super hf6> lu2Var) {
        super(lu2Var);
        this.this$0 = ff6Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ff6.i(this.this$0, null, this);
    }
}
