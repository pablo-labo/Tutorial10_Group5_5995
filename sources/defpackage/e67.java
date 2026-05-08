package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.InboxScreenTareKt$InboxScreenTare$1$1", f = "InboxScreenTare.kt", l = {}, m = "invokeSuspend")
public final class e67 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ d4g $topNavBarViewModel;
    final /* synthetic */ c4g $topNavState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e67(d4g d4gVar, c4g c4gVar, lu2<? super e67> lu2Var) {
        super(2, lu2Var);
        this.$topNavBarViewModel = d4gVar;
        this.$topNavState = c4gVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new e67(this.$topNavBarViewModel, this.$topNavState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((e67) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$topNavBarViewModel.k(this.$topNavState);
        return j6g.a;
    }
}
