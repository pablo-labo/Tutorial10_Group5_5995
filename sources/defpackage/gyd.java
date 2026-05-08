package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {458}, m = "invokeSuspend")
public final class gyd extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ Object $targetState;
    final /* synthetic */ csf<Object> $transition;
    int label;
    final /* synthetic */ cyd<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyd(cyd<Object> cydVar, Object obj, csf<Object> csfVar, lu2<? super gyd> lu2Var) {
        super(1, lu2Var);
        this.this$0 = cydVar;
        this.$targetState = obj;
        this.$transition = csfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new gyd(this.this$0, this.$targetState, this.$transition, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((gyd) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            cyd<Object> cydVar = this.this$0;
            ce0 ce0Var = cyd.r;
            cydVar.k();
            cyd<Object> cydVar2 = this.this$0;
            cydVar2.l = Long.MIN_VALUE;
            cydVar2.o(0.0f);
            Object obj2 = this.$targetState;
            float f = wl7.b(obj2, ((gme) this.this$0.c).getValue()) ? -4.0f : wl7.b(obj2, ((gme) this.this$0.b).getValue()) ? -5.0f : -3.0f;
            this.$transition.q(this.$targetState);
            this.$transition.o(0L);
            ((gme) this.this$0.b).setValue(this.$targetState);
            this.this$0.o(0.0f);
            this.this$0.c(this.$targetState);
            this.$transition.k(f);
            if (f == -3.0f) {
                cyd<Object> cydVar3 = this.this$0;
                this.label = 1;
                Object objI = cyd.i(cydVar3, this);
                g13 g13Var = g13.a;
                if (objI == g13Var) {
                    return g13Var;
                }
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        this.$transition.j();
        return j6g.a;
    }
}
