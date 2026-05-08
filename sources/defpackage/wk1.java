package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.uiplugin.fragment.modals.BottomSheetViewModel$setIsLoadingState$1", f = "BottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
public final class wk1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ boolean $value;
    int label;
    final /* synthetic */ xk1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk1(xk1 xk1Var, boolean z, lu2<? super wk1> lu2Var) {
        super(2, lu2Var);
        this.this$0 = xk1Var;
        this.$value = z;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new wk1(this.this$0, this.$value, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((wk1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        xk1 xk1Var = this.this$0;
        boolean z = this.$value;
        ((gme) xk1Var.c).setValue(Boolean.valueOf(z));
        return j6g.a;
    }
}
