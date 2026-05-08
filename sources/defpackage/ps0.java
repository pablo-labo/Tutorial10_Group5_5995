package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.ArchivedTabKt$DisplayJobList$refresh$1", f = "ArchivedTab.kt", l = {}, m = "invokeSuspend")
public final class ps0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ rs0 $archivedTabViewModel;
    final /* synthetic */ g4a<Boolean> $refreshing$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(rs0 rs0Var, g4a<Boolean> g4aVar, lu2<? super ps0> lu2Var) {
        super(2, lu2Var);
        this.$archivedTabViewModel = rs0Var;
        this.$refreshing$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ps0(this.$archivedTabViewModel, this.$refreshing$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ps0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$refreshing$delegate.setValue(Boolean.TRUE);
        this.$archivedTabViewModel.l(true);
        this.$refreshing$delegate.setValue(Boolean.FALSE);
        return j6g.a;
    }
}
