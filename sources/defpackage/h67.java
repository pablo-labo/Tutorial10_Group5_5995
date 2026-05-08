package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.InboxScreenTareKt$InboxScreenTare$6$1$1", f = "InboxScreenTare.kt", l = {}, m = "invokeSuspend")
public final class h67 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ u67 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h67(lu2 lu2Var, u67 u67Var) {
        super(2, lu2Var);
        this.$viewModel = u67Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new h67(lu2Var, this.$viewModel);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((h67) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        gse gseVar = this.$viewModel.X;
        do {
            value = gseVar.getValue();
        } while (!gseVar.h(value, t67.a((t67) value, null, false, null, null, null, 31)));
        return j6g.a;
    }
}
