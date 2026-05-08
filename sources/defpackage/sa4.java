package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sa4<T> extends e.c implements lm8 {
    public q30<T> d0;
    public Function2<? super th7, ? super iq2, ? extends Pair<? extends oa4<T>, ? extends T>> e0;
    public dwa f0;
    public boolean g0;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $placeable;
        final /* synthetic */ q $this_measure;
        final /* synthetic */ sa4<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, sa4<T> sa4Var, w wVar) {
            super(1);
            this.$this_measure = qVar;
            this.this$0 = sa4Var;
            this.$placeable = wVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a aVar2 = aVar;
            boolean zM0 = this.$this_measure.m0();
            sa4<T> sa4Var = this.this$0;
            float f = zM0 ? sa4Var.d0.e().f(this.this$0.d0.h.getValue()) : sa4Var.d0.g();
            dwa dwaVar = this.this$0.f0;
            float f2 = dwaVar == dwa.b ? f : 0.0f;
            if (dwaVar != dwa.a) {
                f = 0.0f;
            }
            aVar2.r(this.$placeable, gf9.b(f2), gf9.b(f), 0.0f);
            return j6g.a;
        }
    }

    public sa4() {
        throw null;
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        this.g0 = false;
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR = vf9Var.R(j);
        if (!qVar.m0() || !this.g0) {
            Pair<? extends oa4<T>, ? extends T> pairInvoke = this.e0.invoke(new th7(hh1.g(wVarR.a, wVarR.b)), new iq2(j));
            q30<T> q30Var = this.d0;
            oa4<T> oa4VarD = pairInvoke.d();
            T tE = pairInvoke.e();
            if (!wl7.b(q30Var.e(), oa4VarD)) {
                ((gme) q30Var.n).setValue(oa4VarD);
                yi7 yi7Var = q30Var.e;
                c40 c40Var = new c40(q30Var, tE);
                a5a a5aVar = yi7Var.b;
                boolean zD = a5aVar.d();
                if (zD) {
                    try {
                        c40Var.invoke();
                    } finally {
                        a5aVar.p(null);
                    }
                }
                if (!zD) {
                    q30Var.i(tE);
                }
            }
        }
        this.g0 = qVar.m0() || this.g0;
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new a(qVar, this, wVarR));
    }
}
