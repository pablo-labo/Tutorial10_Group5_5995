package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.components.ResponseUnlikelyModalbottomSheetKt$ResponseUnlikelyModalbottomSheet$2$1$1$1$1", f = "ResponseUnlikelyModalbottomSheet.kt", l = {51}, m = "invokeSuspend")
public final class t6d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hw9 $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6d(hw9 hw9Var, lu2<? super t6d> lu2Var) {
        super(2, lu2Var);
        this.$sheetState = hw9Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new t6d(this.$sheetState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((t6d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            hw9 hw9Var = this.$sheetState;
            this.label = 1;
            Object objB = hw9Var.b(this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
