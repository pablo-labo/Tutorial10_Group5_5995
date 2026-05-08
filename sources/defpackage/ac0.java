package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
public final class ac0 extends c1f implements Function1<lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ zb0<Object, ge0> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac0(zb0<Object, ge0> zb0Var, lu2<? super ac0> lu2Var) {
        super(1, lu2Var);
        this.this$0 = zb0Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new ac0(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((ac0) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        zb0.b(this.this$0);
        return j6g.a;
    }
}
