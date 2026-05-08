package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", l = {106}, m = "invokeSuspend")
public final class iq8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ eq8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq8(eq8 eq8Var, lu2<? super iq8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = eq8Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new iq8(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((iq8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            zb0<lh7, de0> zb0Var = this.this$0.o;
            lh7 lh7Var = new lh7(0L);
            this.label = 1;
            Object objE = zb0Var.e(this, lh7Var);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        this.this$0.g(0L);
        this.this$0.f(false);
        return j6g.a;
    }
}
