package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.hamburgermenu.HamburgerMenuViewModel", f = "HamburgerMenuViewModel.kt", l = {143, 144}, m = "setCategorizedNavMenuItems")
public final class gf6 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ff6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf6(ff6 ff6Var, lu2<? super gf6> lu2Var) {
        super(lu2Var);
        this.this$0 = ff6Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ff6.h(this.this$0, null, this);
    }
}
