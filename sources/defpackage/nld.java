package defpackage;

import defpackage.pld;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabKt$SavedTab$refresh$1", f = "SavedTab.kt", l = {}, m = "invokeSuspend")
public final class nld extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<Boolean> $refreshing$delegate;
    final /* synthetic */ pld $savedTabViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nld(pld pldVar, g4a<Boolean> g4aVar, lu2<? super nld> lu2Var) {
        super(2, lu2Var);
        this.$savedTabViewModel = pldVar;
        this.$refreshing$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new nld(this.$savedTabViewModel, this.$refreshing$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((nld) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$refreshing$delegate.setValue(Boolean.TRUE);
        this.$savedTabViewModel.o(true);
        this.$savedTabViewModel.q(pld.c.m.a);
        this.$savedTabViewModel.n();
        this.$refreshing$delegate.setValue(Boolean.FALSE);
        return j6g.a;
    }
}
