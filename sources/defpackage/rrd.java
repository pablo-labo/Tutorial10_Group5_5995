package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
public final class rrd extends c1f implements Function2<xrd, lu2<? super j6g>, Object> {
    final /* synthetic */ yd0<Float> $animationSpec;
    final /* synthetic */ iuc $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrd(float f, yd0<Float> yd0Var, iuc iucVar, lu2<? super rrd> lu2Var) {
        super(2, lu2Var);
        this.$value = f;
        this.$animationSpec = yd0Var;
        this.$previousValue = iucVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        rrd rrdVar = new rrd(this.$value, this.$animationSpec, this.$previousValue, lu2Var);
        rrdVar.L$0 = obj;
        return rrdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xrd xrdVar, lu2<? super j6g> lu2Var) {
        return ((rrd) create(xrdVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xrd xrdVar = (xrd) this.L$0;
            float f = this.$value;
            yd0<Float> yd0Var = this.$animationSpec;
            xb xbVar = new xb(6, this.$previousValue, xrdVar);
            this.label = 1;
            Object objC = x0f.c(0.0f, f, yd0Var, xbVar, this, 4);
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
        }
        return j6g.a;
    }
}
