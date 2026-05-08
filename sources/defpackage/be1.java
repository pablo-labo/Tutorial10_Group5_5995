package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1", f = "BasicTooltip.kt", l = {220}, m = "invokeSuspend")
public final class be1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ fe1 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(fe1 fe1Var, lu2<? super be1> lu2Var) {
        super(2, lu2Var);
        this.$state = fe1Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new be1(this.$state, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((be1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            fe1 fe1Var = this.$state;
            this.label = 1;
            Object objB = fe1Var.b(n4a.a, this);
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
