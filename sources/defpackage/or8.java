package defpackage;

import defpackage.wle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class or8 {
    public uqe a;
    public ae0<Float, ce0> b;

    @uh3(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {79}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return or8.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                ae0<Float, ce0> ae0Var = or8.this.b;
                Float f = new Float(0.0f);
                vpe vpeVarC = zd0.c(400.0f, new Float(0.5f), 1);
                this.label = 1;
                Object objF = x0f.f(ae0Var, f, vpeVarC, true, null, this, 8);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
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

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public or8() {
        mvf mvfVar = q92.c0;
        Object objValueOf = Float.valueOf(0.0f);
        this.b = new ae0<>(mvfVar, objValueOf, (ge0) mvfVar.a.invoke((T) objValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void a(float f, iy3 iy3Var, e13 e13Var) {
        if (f <= iy3Var.t1(1.0f)) {
            return;
        }
        wle.e.getClass();
        wle wleVarA = wle.a.a();
        Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
        wle wleVarB = wle.a.b(wleVarA);
        try {
            float fFloatValue = ((Number) ((gme) this.b.b).getValue()).floatValue();
            uqe uqeVar = this.a;
            if (uqeVar != null) {
                uqeVar.h(null);
            }
            ae0<Float, ce0> ae0Var = this.b;
            if (ae0Var.f) {
                this.b = boa.m(ae0Var, fFloatValue - f, 0.0f, 30);
            } else {
                this.b = new ae0<>(q92.c0, Float.valueOf(-f), null, 60);
            }
            this.a = u63.Y(e13Var, null, null, new a(null), 3);
            j6g j6gVar = j6g.a;
            wle.a.e(wleVarA, wleVarB, function1E);
        } catch (Throwable th) {
            wle.a.e(wleVarA, wleVarB, function1E);
            throw th;
        }
    }
}
