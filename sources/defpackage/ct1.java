package defpackage;

import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ct1 extends e.c implements bt1, joa, wo1 {
    public final ft1 d0;
    public boolean e0;
    public bqd f0;
    public Function1<? super ft1, nfa> g0;

    public static final class a extends mj8 implements gu5<wc6> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final wc6 invoke() {
            ct1 ct1Var = ct1.this;
            bqd bqdVar = ct1Var.f0;
            if (bqdVar == null) {
                bqdVar = new bqd();
                ct1Var.f0 = bqdVar;
            }
            if (bqdVar.b == null) {
                wc6 graphicsContext = us3.g(ct1Var).getGraphicsContext();
                bqdVar.c();
                bqdVar.b = graphicsContext;
            }
            return bqdVar;
        }
    }

    public ct1(ft1 ft1Var, Function1<? super ft1, nfa> function1) {
        this.d0 = ft1Var;
        this.g0 = function1;
        ft1Var.a = this;
        new a();
    }

    @Override // defpackage.bt1
    public final void U0() {
        bqd bqdVar = this.f0;
        if (bqdVar != null) {
            bqdVar.c();
        }
        this.e0 = false;
        this.d0.b = null;
        fb4.a(this);
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        bqd bqdVar = this.f0;
        if (bqdVar != null) {
            bqdVar.c();
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void W1() {
        U0();
    }

    @Override // defpackage.wo1
    public final long c() {
        return hh1.Y(us3.d(this, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).c);
    }

    @Override // defpackage.wo1
    public final iy3 getDensity() {
        return us3.f(this).m0;
    }

    @Override // defpackage.wo1
    public final vl8 getLayoutDirection() {
        return us3.f(this).n0;
    }

    @Override // defpackage.ts3
    public final void h0() {
        U0();
    }

    @Override // defpackage.eb4
    public final void i1() {
        U0();
    }

    @Override // defpackage.joa
    public final void u0() {
        U0();
    }

    @Override // defpackage.ts3
    public final void w() {
        U0();
    }

    @Override // defpackage.eb4
    public final void y(sm8 sm8Var) {
        boolean z = this.e0;
        ft1 ft1Var = this.d0;
        if (!z) {
            ft1Var.b = null;
            koa.a(this, new dt1(this, ft1Var));
            if (ft1Var.b == null) {
                throw l6.k("DrawResult not defined, did you forget to call onDraw?");
            }
            this.e0 = true;
        }
        nfa nfaVar = ft1Var.b;
        nfaVar.getClass();
        ((Function1) nfaVar.b).invoke(sm8Var);
    }
}
