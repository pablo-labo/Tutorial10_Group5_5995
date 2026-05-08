package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.screens.ProfileScreenKt$ProfileScreen$5$3$2$1", f = "ProfileScreen.kt", l = {}, m = "invokeSuspend")
public final class fvb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ x1c $profileViewModel;
    final /* synthetic */ boolean $shouldShowFileResumeAlertDialog;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvb(boolean z, x1c x1cVar, lu2<? super fvb> lu2Var) {
        super(2, lu2Var);
        this.$shouldShowFileResumeAlertDialog = z;
        this.$profileViewModel = x1cVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new fvb(this.$shouldShowFileResumeAlertDialog, this.$profileViewModel, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((fvb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$shouldShowFileResumeAlertDialog) {
            this.$profileViewModel.v();
        }
        return j6g.a;
    }
}
