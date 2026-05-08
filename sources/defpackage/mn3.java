package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", l = {272}, m = "invokeSuspend")
public final class mn3 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ki5 $animatable;
    int label;
    final /* synthetic */ pn3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn3(ki5 ki5Var, pn3 pn3Var, lu2<? super mn3> lu2Var) {
        super(2, lu2Var);
        this.$animatable = ki5Var;
        this.this$0 = pn3Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new mn3(this.$animatable, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((mn3) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ki5 ki5Var = this.$animatable;
            this.this$0.getClass();
            this.label = 1;
            ki5Var.getClass();
            Object objB = ki5Var.b(this);
            g13 g13Var = g13.a;
            if (objB != g13Var) {
                objB = j6g.a;
            }
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
