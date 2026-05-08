package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", l = {391}, m = "invokeSuspend")
public final class he1 extends c1f implements Function1<lu2<? super j6g>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ie1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he1(ie1 ie1Var, lu2<? super he1> lu2Var) {
        super(1, lu2Var);
        this.this$0 = ie1Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new he1(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((he1) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ie1 ie1Var = this.this$0;
            this.L$0 = ie1Var;
            this.label = 1;
            qw1 qw1Var = new qw1(1, ewa.v(this));
            qw1Var.q();
            ((gme) ie1Var.b).setValue(Boolean.TRUE);
            ie1Var.c = qw1Var;
            Object objP = qw1Var.p();
            g13 g13Var = g13.a;
            if (objP == g13Var) {
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
