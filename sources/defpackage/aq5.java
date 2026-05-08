package defpackage;

import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import defpackage.gdb;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class aq5 implements gdb {
    public final gdb a;

    public static final class a implements gdb.c {
        public final aq5 a;
        public final gdb.c b;

        public a(aq5 aq5Var, gdb.c cVar) {
            this.a = aq5Var;
            this.b = cVar;
        }

        @Override // gdb.c
        public final void A(long j) {
            this.b.A(j);
        }

        @Override // gdb.c
        public final void B(int i, gdb.d dVar, gdb.d dVar2) {
            this.b.B(i, dVar, dVar2);
        }

        @Override // gdb.c
        public final void E(oj9 oj9Var) {
            this.b.E(oj9Var);
        }

        @Override // gdb.c
        public final void H() {
            this.b.H();
        }

        @Override // gdb.c
        public final void I(boolean z) {
            this.b.I(z);
        }

        @Override // gdb.c
        public final void K(List<n83> list) {
            this.b.K(list);
        }

        @Override // gdb.c
        public final void M(js9 js9Var) {
            this.b.M(js9Var);
        }

        @Override // gdb.c
        public final void N(s34 s34Var) {
            this.b.N(s34Var);
        }

        @Override // gdb.c
        public final void Q(int i, int i2) {
            this.b.Q(i, i2);
        }

        @Override // gdb.c
        public final void S(ox0 ox0Var) {
            this.b.S(ox0Var);
        }

        @Override // gdb.c
        public final void T(dqf dqfVar) {
            this.b.T(dqfVar);
        }

        @Override // gdb.c
        public final void U(boolean z) {
            this.b.U(z);
        }

        @Override // gdb.c
        public final void V(int i, boolean z) {
            this.b.V(i, z);
        }

        @Override // gdb.c
        public final void W(float f) {
            this.b.W(f);
        }

        @Override // gdb.c
        public final void X(int i, ij9 ij9Var) {
            this.b.X(i, ij9Var);
        }

        @Override // gdb.c
        public final void a(tog togVar) {
            this.b.a(togVar);
        }

        @Override // gdb.c
        public final void b0(q83 q83Var) {
            this.b.b0(q83Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a.equals(aVar.a)) {
                return this.b.equals(aVar.b);
            }
            return false;
        }

        @Override // gdb.c
        public final void f0(wqf wqfVar) {
            this.b.f0(wqfVar);
        }

        @Override // gdb.c
        public final void g(PlaybackException playbackException) {
            this.b.g(playbackException);
        }

        @Override // gdb.c
        public final void h(int i) {
            this.b.h(i);
        }

        @Override // gdb.c
        public final void h0(oj9 oj9Var) {
            this.b.h0(oj9Var);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @Override // gdb.c
        public final void i0(long j) {
            this.b.i0(j);
        }

        @Override // gdb.c
        public final void j0(emf emfVar, int i) {
            this.b.j0(emfVar, i);
        }

        @Override // gdb.c
        public final void l0(int i, boolean z) {
            this.b.l0(i, z);
        }

        @Override // gdb.c
        public final void m(int i) {
            this.b.m(i);
        }

        @Override // gdb.c
        public final void n(int i) {
            this.b.n(i);
        }

        @Override // gdb.c
        public final void o(gdb.b bVar) {
            this.b.o(bVar);
        }

        @Override // gdb.c
        public final void o0(cdb cdbVar) {
            this.b.o0(cdbVar);
        }

        @Override // gdb.c
        public final void p(boolean z) {
            this.b.U(z);
        }

        @Override // gdb.c
        public final void p0(gdb.a aVar) {
            this.b.p0(aVar);
        }

        @Override // gdb.c
        public final void q0(PlaybackException playbackException) {
            this.b.q0(playbackException);
        }

        @Override // gdb.c
        public final void r(int i) {
            this.b.r(i);
        }

        @Override // gdb.c
        public final void r0(long j) {
            this.b.r0(j);
        }

        @Override // gdb.c
        public final void s(int i) {
            this.b.s(i);
        }

        @Override // gdb.c
        public final void v(boolean z) {
            this.b.v(z);
        }

        @Override // gdb.c
        public final void v0(boolean z) {
            this.b.v0(z);
        }

        @Override // gdb.c
        public final void z(int i, boolean z) {
            this.b.z(i, z);
        }
    }

    public aq5(gdb gdbVar) {
        this.a = gdbVar;
    }

    @Override // defpackage.gdb
    public void B() {
        this.a.B();
    }

    @Override // defpackage.gdb
    public void B0(List<ij9> list) {
        this.a.B0(list);
    }

    @Override // defpackage.gdb
    public void C(int i) {
        this.a.C(i);
    }

    @Override // defpackage.gdb
    public boolean C0() {
        return this.a.C0();
    }

    @Override // defpackage.gdb
    public final void F(ox0 ox0Var, boolean z) {
        this.a.F(ox0Var, z);
    }

    @Override // defpackage.gdb
    @Deprecated
    public void F0(int i) {
        this.a.F0(i);
    }

    @Override // defpackage.gdb
    public void G(oj9 oj9Var) {
        this.a.G(oj9Var);
    }

    @Override // defpackage.gdb
    public void G0() {
        this.a.G0();
    }

    @Override // defpackage.gdb
    public void H0() {
        this.a.H0();
    }

    @Override // defpackage.gdb
    @Deprecated
    public void I(boolean z) {
        this.a.I(z);
    }

    @Override // defpackage.gdb
    public void J(ij9 ij9Var) {
        this.a.J(ij9Var);
    }

    @Override // defpackage.gdb
    public void N(int i, ij9 ij9Var) {
        this.a.N(i, ij9Var);
    }

    @Override // defpackage.gdb
    @Deprecated
    public void O() {
        this.a.O();
    }

    @Override // defpackage.gdb
    public void Q() {
        this.a.Q();
    }

    @Override // defpackage.gdb
    public final Looper Q0() {
        return this.a.Q0();
    }

    @Override // defpackage.gdb
    public void U(int i, long j) {
        this.a.U(i, j);
    }

    @Override // defpackage.gdb
    public void X(boolean z) {
        this.a.X(z);
    }

    @Override // defpackage.gdb
    public void c() {
        this.a.c();
    }

    @Override // defpackage.gdb
    public float e0() {
        return this.a.e0();
    }

    @Override // defpackage.gdb
    public void f() {
        this.a.f();
    }

    @Override // defpackage.gdb
    public void h(float f) {
        this.a.h(f);
    }

    @Override // defpackage.gdb
    public void h0(int i, int i2) {
        this.a.h0(i, i2);
    }

    @Override // defpackage.gdb
    public void j(Surface surface) {
        this.a.j(surface);
    }

    @Override // defpackage.gdb
    public void j0(long j) {
        this.a.j0(j);
    }

    @Override // defpackage.gdb
    public void k0(float f) {
        this.a.k0(f);
    }

    @Override // defpackage.gdb
    public void m(ij9 ij9Var, long j) {
        this.a.m(ij9Var, j);
    }

    @Override // defpackage.gdb
    public void m0(int i) {
        this.a.m0(i);
    }

    @Override // defpackage.gdb
    public void n() {
        this.a.n();
    }

    @Override // defpackage.gdb
    public void p() {
        this.a.p();
    }

    @Override // defpackage.gdb
    public void q() {
        this.a.q();
    }

    @Override // defpackage.gdb
    public void r(int i, boolean z) {
        this.a.r(i, z);
    }

    @Override // defpackage.gdb
    @Deprecated
    public void s() {
        this.a.s();
    }

    @Override // defpackage.gdb
    public void stop() {
        this.a.stop();
    }

    @Override // defpackage.gdb
    public void t(int i) {
        this.a.t(i);
    }

    @Override // defpackage.gdb
    public void w(int i) {
        this.a.w(i);
    }

    @Override // defpackage.gdb
    public void w0(int i) {
        this.a.w0(i);
    }

    @Override // defpackage.gdb
    public void z() {
        this.a.z();
    }

    @Override // defpackage.gdb
    public void z0(int i, int i2) {
        this.a.z0(i, i2);
    }
}
