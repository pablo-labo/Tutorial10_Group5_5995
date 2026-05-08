package defpackage;

import defpackage.lie;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {230}, m = "invokeSuspend")
public final class mie extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ lie.a $this_apply;
    int label;
    final /* synthetic */ lie this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mie(lie.a aVar, long j, lie lieVar, lu2<? super mie> lu2Var) {
        super(2, lu2Var);
        this.$this_apply = aVar;
        this.$targetSize = j;
        this.this$0 = lieVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new mie(this.$this_apply, this.$targetSize, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((mie) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        mie mieVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            zb0<th7, de0> zb0Var = this.$this_apply.a;
            th7 th7Var = new th7(this.$targetSize);
            yd0<th7> yd0Var = this.this$0.d0;
            this.label = 1;
            mieVar = this;
            obj = zb0.c(zb0Var, th7Var, yd0Var, null, mieVar, 12);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            mieVar = this;
        }
        if (((wd0) obj).b == ud0.b) {
            mieVar.this$0.getClass();
        }
        return j6g.a;
    }
}
