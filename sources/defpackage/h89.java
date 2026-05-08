package defpackage;

import android.view.View;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h89 extends e.c implements z96, eb4, c5e, joa {
    public Function1<? super iy3, ooa> d0;
    public Function1<? super m94, j6g> e0;
    public float f0;
    public boolean g0;
    public long h0;
    public float i0;
    public float j0;
    public boolean k0;
    public wbb l0;
    public View m0;
    public iy3 n0;
    public vbb o0;
    public final g4a p0;
    public az3 q0;
    public long r0;
    public th7 s0;
    public go1 t0;

    @uh3(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return h89.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
            if (defpackage.ly9.a(getContext()).W(new defpackage.pp8(r6, r2), r5) == r3) goto L20;
         */
        /* JADX WARN: Path cross not found for [B:13:0x0024, B:16:0x002d], limit reached: 23 */
        /* JADX WARN: Path cross not found for [B:16:0x002d, B:13:0x0024], limit reached: 23 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0031 -> B:11:0x001e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:21:0x0050). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 2
                r2 = 1
                g13 r3 = defpackage.g13.a
                if (r0 == 0) goto L1b
                if (r0 == r2) goto L17
                if (r0 != r1) goto L10
                defpackage.r7d.b(r6)
                goto L50
            L10:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r5)
                r5 = 0
                return r5
            L17:
                defpackage.r7d.b(r6)
                goto L2d
            L1b:
                defpackage.r7d.b(r6)
            L1e:
                h89 r6 = defpackage.h89.this
                go1 r6 = r6.t0
                if (r6 == 0) goto L2d
                r5.label = r2
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r3) goto L2d
                goto L4f
            L2d:
                h89 r6 = defpackage.h89.this
                vbb r6 = r6.o0
                if (r6 == 0) goto L1e
                kd r6 = new kd
                r0 = 13
                r6.<init>(r0)
                r5.label = r1
                v03 r0 = r5.getContext()
                ky9 r0 = defpackage.ly9.a(r0)
                pp8 r4 = new pp8
                r4.<init>(r6, r2)
                java.lang.Object r6 = r0.W(r4, r5)
                if (r6 != r3) goto L50
            L4f:
                return r3
            L50:
                h89 r6 = defpackage.h89.this
                vbb r6 = r6.o0
                if (r6 == 0) goto L1e
                r6.c()
                goto L1e
            */
            throw new UnsupportedOperationException("Method not decompiled: h89.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h89() {
        throw null;
    }

    public h89(Function1 function1, Function1 function12, float f, boolean z, long j, float f2, float f3, boolean z2, wbb wbbVar) {
        this.d0 = function1;
        this.e0 = function12;
        this.f0 = f;
        this.g0 = z;
        this.h0 = j;
        this.i0 = f2;
        this.j0 = f3;
        this.k0 = z2;
        this.l0 = wbbVar;
        this.p0 = r.e(null, zkd.f);
        this.r0 = 9205357640488583168L;
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
        s5eVar.a(i89.a, new qr(this, 11));
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        u0();
        this.t0 = h22.a(0, 7, null);
        u63.Y(Q1(), null, i13.d, new a(null), 1);
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        vbb vbbVar = this.o0;
        if (vbbVar != null) {
            vbbVar.dismiss();
        }
        this.o0 = null;
    }

    public final long c2() {
        if (this.q0 == null) {
            this.q0 = r.c(new xh(this, 9));
        }
        az3 az3Var = this.q0;
        if (az3Var != null) {
            return ((ooa) az3Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void d2() {
        vbb vbbVar = this.o0;
        if (vbbVar != null) {
            vbbVar.dismiss();
        }
        View viewA = this.m0;
        if (viewA == null) {
            viewA = vs3.a(this);
        }
        View view = viewA;
        this.m0 = view;
        iy3 iy3Var = this.n0;
        if (iy3Var == null) {
            iy3Var = us3.f(this).m0;
        }
        iy3 iy3Var2 = iy3Var;
        this.n0 = iy3Var2;
        this.o0 = this.l0.b(view, this.g0, this.h0, this.i0, this.j0, this.k0, iy3Var2, this.f0);
        f2();
    }

    public final void e2() {
        iy3 iy3Var = this.n0;
        if (iy3Var == null) {
            iy3Var = us3.f(this).m0;
            this.n0 = iy3Var;
        }
        long j = this.d0.invoke(iy3Var).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & c2()) == 9205357640488583168L) {
            this.r0 = 9205357640488583168L;
            vbb vbbVar = this.o0;
            if (vbbVar != null) {
                vbbVar.dismiss();
                return;
            }
            return;
        }
        this.r0 = ooa.f(c2(), j);
        if (this.o0 == null) {
            d2();
        }
        vbb vbbVar2 = this.o0;
        if (vbbVar2 != null) {
            vbbVar2.b(this.r0, 9205357640488583168L, this.f0);
        }
        f2();
    }

    public final void f2() {
        iy3 iy3Var;
        vbb vbbVar = this.o0;
        if (vbbVar == null || (iy3Var = this.n0) == null) {
            return;
        }
        if (th7.a(this.s0, vbbVar.a())) {
            return;
        }
        Function1<? super m94, j6g> function1 = this.e0;
        if (function1 != null) {
            function1.invoke(new m94(iy3Var.I(hh1.Y(vbbVar.a()))));
        }
        this.s0 = new th7(vbbVar.a());
    }

    @Override // defpackage.z96
    public final void n0(tia tiaVar) {
        ((gme) this.p0).setValue(tiaVar);
    }

    @Override // defpackage.joa
    public final void u0() {
        koa.a(this, new le(this, 9));
    }

    @Override // defpackage.eb4
    public final void y(sm8 sm8Var) {
        sm8Var.N1();
        go1 go1Var = this.t0;
        if (go1Var != null) {
            go1Var.f(j6g.a);
        }
    }
}
