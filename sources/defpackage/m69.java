package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
public final class m69 extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ s69 $composition;
    final /* synthetic */ int $iteration;
    final /* synthetic */ float $progress;
    final /* synthetic */ boolean $resetLastFrameNanos;
    int label;
    final /* synthetic */ l69 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m69(l69 l69Var, s69 s69Var, float f, int i, boolean z, lu2<? super m69> lu2Var) {
        super(1, lu2Var);
        this.this$0 = l69Var;
        this.$composition = s69Var;
        this.$progress = f;
        this.$iteration = i;
        this.$resetLastFrameNanos = z;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new m69(this.this$0, this.$composition, this.$progress, this.$iteration, this.$resetLastFrameNanos, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((m69) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        l69 l69Var = this.this$0;
        ((gme) l69Var.X).setValue(this.$composition);
        this.this$0.z(this.$progress);
        this.this$0.y(this.$iteration);
        l69.n(this.this$0, false);
        if (this.$resetLastFrameNanos) {
            ((gme) this.this$0.a0).setValue(Long.MIN_VALUE);
        }
        return j6g.a;
    }
}
