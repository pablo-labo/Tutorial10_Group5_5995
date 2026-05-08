package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.common.toast.ToastContentKt$ToastContent$1$1$1", f = "ToastContent.kt", l = {}, m = "invokeSuspend")
public final class ymf extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ fnf $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymf(fnf fnfVar, lu2<? super ymf> lu2Var) {
        super(2, lu2Var);
        this.$viewModel = fnfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ymf(this.$viewModel, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ymf) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        gse gseVar = this.$viewModel.b;
        do {
            value = gseVar.getValue();
        } while (!gseVar.h(value, dnf.a((dnf) value, null)));
        return j6g.a;
    }
}
