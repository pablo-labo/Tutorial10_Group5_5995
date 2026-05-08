package defpackage;

import defpackage.ax1;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jse {
    public final boolean a;
    public final gu5<idd> b;
    public final zb0<Float, ce0> c = gc0.a(0.0f);
    public final ArrayList d = new ArrayList();
    public ci7 e;

    @uh3(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {480}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ yd0<Float> $incomingAnimationSpec;
        final /* synthetic */ float $targetAlpha;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, yd0<Float> yd0Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$targetAlpha = f;
            this.$incomingAnimationSpec = yd0Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return jse.this.new a(this.$targetAlpha, this.$incomingAnimationSpec, lu2Var);
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
                zb0<Float, ce0> zb0Var = jse.this.c;
                Float f = new Float(this.$targetAlpha);
                yd0<Float> yd0Var = this.$incomingAnimationSpec;
                this.label = 1;
                Object objC = zb0.c(zb0Var, f, yd0Var, null, this, 12);
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

    @uh3(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {484}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ yd0<Float> $outgoingAnimationSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yd0<Float> yd0Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$outgoingAnimationSpec = yd0Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return jse.this.new b(this.$outgoingAnimationSpec, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zb0<Float, ce0> zb0Var = jse.this.c;
                Float f = new Float(0.0f);
                yd0<Float> yd0Var = this.$outgoingAnimationSpec;
                this.label = 1;
                Object objC = zb0.c(zb0Var, f, yd0Var, null, this, 12);
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

    public jse(gu5 gu5Var, boolean z) {
        this.a = z;
        this.b = gu5Var;
    }

    public final void a(sm8 sm8Var, float f, long j) {
        ax1 ax1Var = sm8Var.a;
        float fFloatValue = this.c.d().floatValue();
        if (fFloatValue > 0.0f) {
            long jB = da2.b(j, fFloatValue);
            if (!this.a) {
                gb4.q0(sm8Var, jB, f, 0L, null, 124);
                return;
            }
            float fD = kie.d(ax1Var.c());
            float fB = kie.b(ax1Var.c());
            ax1.b bVar = ax1Var.b;
            long jD = bVar.d();
            bVar.a().o();
            try {
                bVar.a.d(0.0f, 0.0f, fD, fB, 1);
                gb4.q0(sm8Var, jB, f, 0L, null, 124);
            } finally {
                g7.k(bVar, jD);
            }
        }
    }

    public final void b(ci7 ci7Var, e13 e13Var) {
        boolean z = ci7Var instanceof hk6;
        ArrayList arrayList = this.d;
        if (z) {
            arrayList.add(ci7Var);
        } else if (ci7Var instanceof ik6) {
            arrayList.remove(((ik6) ci7Var).a);
        } else if (ci7Var instanceof zl5) {
            arrayList.add(ci7Var);
        } else if (ci7Var instanceof am5) {
            arrayList.remove(((am5) ci7Var).a);
        } else if (ci7Var instanceof la4) {
            arrayList.add(ci7Var);
        } else if (ci7Var instanceof ma4) {
            arrayList.remove(((ma4) ci7Var).a);
        } else if (!(ci7Var instanceof ka4)) {
            return;
        } else {
            arrayList.remove(((ka4) ci7Var).a);
        }
        ci7 ci7Var2 = (ci7) z92.Z0(arrayList);
        if (wl7.b(this.e, ci7Var2)) {
            return;
        }
        if (ci7Var2 != null) {
            idd iddVarInvoke = this.b.invoke();
            float f = z ? iddVarInvoke.c : ci7Var instanceof zl5 ? iddVarInvoke.b : ci7Var instanceof la4 ? iddVarInvoke.a : 0.0f;
            dvf<Float> dvfVar = qdd.a;
            if (!(ci7Var2 instanceof hk6) && ((ci7Var2 instanceof zl5) || (ci7Var2 instanceof la4))) {
                dvfVar = new dvf<>(45, bf4.c, 2);
            }
            u63.Y(e13Var, null, null, new a(f, dvfVar, null), 3);
        } else {
            ci7 ci7Var3 = this.e;
            dvf<Float> dvfVar2 = qdd.a;
            if (!(ci7Var3 instanceof hk6) && !(ci7Var3 instanceof zl5) && (ci7Var3 instanceof la4)) {
                dvfVar2 = new dvf<>(150, bf4.c, 2);
            }
            u63.Y(e13Var, null, null, new b(dvfVar2, null), 3);
        }
        this.e = ci7Var2;
    }
}
