package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationScreenKt$SelectedConversationScreen$2$1", f = "SelectedConversationScreen.kt", l = {}, m = "invokeSuspend")
public final class o1e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ boolean $isLazyLoadingError;
    final /* synthetic */ y1e $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1e(y1e y1eVar, boolean z, lu2<? super o1e> lu2Var) {
        super(2, lu2Var);
        this.$viewModel = y1eVar;
        this.$isLazyLoadingError = z;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new o1e(this.$viewModel, this.$isLazyLoadingError, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((o1e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        y1e y1eVar = this.$viewModel;
        boolean z = this.$isLazyLoadingError;
        gse gseVar = y1eVar.c0;
        do {
            value = gseVar.getValue();
        } while (!gseVar.h(value, x1e.a((x1e) value, null, null, false, false, false, null, z, false, false, null, null, null, null, false, false, null, false, false, 0, null, null, null, null, false, null, 67108799)));
        return j6g.a;
    }
}
