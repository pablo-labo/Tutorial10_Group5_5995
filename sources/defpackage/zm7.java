package defpackage;

import defpackage.bn7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabKt$InvitationTab$refresh$1", f = "InvitationTab.kt", l = {}, m = "invokeSuspend")
public final class zm7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ bn7 $invitationTabViewModel;
    final /* synthetic */ g4a<Boolean> $refreshing$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm7(bn7 bn7Var, g4a<Boolean> g4aVar, lu2<? super zm7> lu2Var) {
        super(2, lu2Var);
        this.$invitationTabViewModel = bn7Var;
        this.$refreshing$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new zm7(this.$invitationTabViewModel, this.$refreshing$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((zm7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$refreshing$delegate.setValue(Boolean.TRUE);
        bn7 bn7Var = this.$invitationTabViewModel;
        boolean z = bn7Var.f0;
        bn7Var.f0 = true;
        if (i6a.i()) {
            u63.Y(ee3.p(bn7Var), null, null, new en7(bn7Var, true, true, null), 3);
        }
        if (z) {
            bn7Var.e0.b("Invitations", ee3.p(bn7Var));
        }
        this.$invitationTabViewModel.n(bn7.a.b.a);
        this.$refreshing$delegate.setValue(Boolean.FALSE);
        return j6g.a;
    }
}
