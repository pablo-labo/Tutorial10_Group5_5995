package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {344}, m = "invokeSuspend")
public final class xke extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ zb0<Float, ce0> $alpha;
    final /* synthetic */ yd0<Float> $animation;
    final /* synthetic */ gu5<j6g> $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xke(zb0<Float, ce0> zb0Var, boolean z, yd0<Float> yd0Var, gu5<j6g> gu5Var, lu2<? super xke> lu2Var) {
        super(2, lu2Var);
        this.$alpha = zb0Var;
        this.$visible = z;
        this.$animation = yd0Var;
        this.$onAnimationFinish = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new xke(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((xke) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        xke xkeVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            zb0<Float, ce0> zb0Var = this.$alpha;
            Float f = new Float(this.$visible ? 1.0f : 0.0f);
            yd0<Float> yd0Var = this.$animation;
            this.label = 1;
            xkeVar = this;
            Object objC = zb0.c(zb0Var, f, yd0Var, null, xkeVar, 12);
            g13 g13Var = g13.a;
            if (objC == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            xkeVar = this;
        }
        xkeVar.$onAnimationFinish.invoke();
        return j6g.a;
    }
}
