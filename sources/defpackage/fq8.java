package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {204}, m = "invokeSuspend")
public final class fq8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ xc6 $layer;
    final /* synthetic */ jf5<Float> $spec;
    int label;
    final /* synthetic */ eq8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq8(eq8 eq8Var, jf5<Float> jf5Var, xc6 xc6Var, lu2<? super fq8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = eq8Var;
        this.$spec = jf5Var;
        this.$layer = xc6Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new fq8(this.this$0, this.$spec, this.$layer, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((fq8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        fq8 fq8Var;
        zb0<Float, ce0> zb0Var;
        Float f;
        jf5<Float> jf5Var;
        gr0 gr0Var;
        Throwable th;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            try {
                zb0Var = this.this$0.p;
                try {
                    f = new Float(0.0f);
                    jf5Var = this.$spec;
                    gr0Var = new gr0(5, this.$layer, this.this$0);
                    this.label = 1;
                    fq8Var = this;
                } catch (Throwable th2) {
                    th = th2;
                    fq8Var = this;
                    th = th;
                    fq8Var.this$0.e(false);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fq8Var = this;
                th = th;
                fq8Var.this$0.e(false);
                throw th;
            }
            try {
                Object objC = zb0.c(zb0Var, f, jf5Var, gr0Var, fq8Var, 4);
                g13 g13Var = g13.a;
                if (objC == g13Var) {
                    return g13Var;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                fq8Var.this$0.e(false);
                throw th;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                r7d.b(obj);
                fq8Var = this;
            } catch (Throwable th5) {
                th = th5;
                fq8Var = this;
                fq8Var.this$0.e(false);
                throw th;
            }
        }
        try {
        } catch (Throwable th6) {
            th = th6;
        }
        try {
            ((gme) fq8Var.this$0.k).setValue(Boolean.TRUE);
            fq8Var.this$0.e(false);
            return j6g.a;
        } catch (Throwable th7) {
            th = th7;
            th = th;
            fq8Var.this$0.e(false);
            throw th;
        }
    }
}
