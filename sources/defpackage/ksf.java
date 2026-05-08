package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2173}, m = "invokeSuspend")
public final class ksf extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ rsf<Object> $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksf(rsf<Object> rsfVar, lu2<? super ksf> lu2Var) {
        super(2, lu2Var);
        this.$transitionState = rsfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ksf(this.$transitionState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ksf) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [S, java.lang.Object] */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        rsf<Object> rsfVar;
        z4a z4aVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            cyd cydVar = (cyd) this.$transitionState;
            cydVar.getClass();
            ((qme) msf.b.getValue()).d(cydVar, msf.a, cydVar.g);
            rsfVar = this.$transitionState;
            a5a a5aVar = ((cyd) rsfVar).j;
            this.L$0 = a5aVar;
            this.L$1 = rsfVar;
            this.label = 1;
            Object objH = a5aVar.h(this);
            g13 g13Var = g13.a;
            if (objH == g13Var) {
                return g13Var;
            }
            z4aVar = a5aVar;
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rsfVar = (rsf) this.L$1;
            z4aVar = (z4a) this.L$0;
            r7d.b(obj);
        }
        try {
            ((cyd) rsfVar).d = ((gme) ((cyd) rsfVar).b).getValue();
            qw1 qw1Var = ((cyd) rsfVar).i;
            if (qw1Var != null) {
                qw1Var.resumeWith(((gme) ((cyd) rsfVar).b).getValue());
            }
            ((cyd) rsfVar).i = null;
            j6g j6gVar = j6g.a;
            z4aVar.p(null);
            return j6g.a;
        } catch (Throwable th) {
            z4aVar.p(null);
            throw th;
        }
    }
}
