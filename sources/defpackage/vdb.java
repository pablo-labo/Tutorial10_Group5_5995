package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import defpackage.aq5;
import defpackage.emf;
import defpackage.gdb;
import defpackage.ij9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vdb extends aq5 {

    public static final class a extends emf {
        public static final Object k = new Object();
        public final ij9 e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final ij9.e i;
        public final long j;

        public a(vdb vdbVar) {
            this.e = vdbVar.M0();
            this.f = vdbVar.R0();
            this.g = vdbVar.P0();
            this.h = !vdbVar.M().p() && vdbVar.M().m(vdbVar.v0(), new emf.d(), 0L).j;
            this.i = vdbVar.S0() ? ij9.e.f : null;
            this.j = vjg.O(vdbVar.a0());
        }

        @Override // defpackage.emf
        public final int b(Object obj) {
            return k != obj ? -1 : 0;
        }

        @Override // defpackage.emf
        public final emf.b f(int i, emf.b bVar, boolean z) {
            bVar.getClass();
            ba baVar = ba.f;
            Object obj = k;
            bVar.i(obj, obj, 0, this.j, 0L, baVar, false);
            bVar.f = this.h;
            return bVar;
        }

        @Override // defpackage.emf
        public final int h() {
            return 1;
        }

        @Override // defpackage.emf
        public final Object l(int i) {
            return k;
        }

        @Override // defpackage.emf
        public final emf.d m(int i, emf.d dVar, long j) {
            dVar.b(k, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.i, 0L, this.j, 0, 0, 0L);
            dVar.j = this.h;
            return dVar;
        }

        @Override // defpackage.emf
        public final int o() {
            return 1;
        }
    }

    @Override // defpackage.gdb
    public final void A(boolean z) {
        X0();
        this.a.A(z);
    }

    @Override // defpackage.gdb
    public final void A0(int i, int i2, int i3) {
        X0();
        this.a.A0(i, i2, i3);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void B() {
        X0();
        super.B();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void B0(List<ij9> list) {
        X0();
        super.B0(list);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void C(int i) {
        X0();
        super.C(i);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final boolean C0() {
        X0();
        return super.C0();
    }

    @Override // defpackage.gdb
    public final wqf D() {
        X0();
        return this.a.D();
    }

    @Override // defpackage.gdb
    public final boolean D0() {
        X0();
        return this.a.D0();
    }

    @Override // defpackage.gdb
    public final q83 E() {
        X0();
        return this.a.E();
    }

    @Override // defpackage.gdb
    public final long E0() {
        X0();
        return this.a.E0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    @Deprecated
    public final void F0(int i) {
        X0();
        super.F0(i);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void G(oj9 oj9Var) {
        X0();
        super.G(oj9Var);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void G0() {
        X0();
        super.G0();
    }

    @Override // defpackage.gdb
    public final int H() {
        X0();
        return this.a.H();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void H0() {
        X0();
        super.H0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    @Deprecated
    public final void I(boolean z) {
        X0();
        super.I(z);
    }

    @Override // defpackage.gdb
    public final oj9 I0() {
        X0();
        return this.a.I0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void J(ij9 ij9Var) {
        X0();
        super.J(ij9Var);
    }

    @Override // defpackage.gdb
    public final void J0(List list) {
        X0();
        this.a.J0(list);
    }

    @Override // defpackage.gdb
    public final void K(List list, int i, int i2) {
        X0();
        this.a.K(list, i, i2);
    }

    @Override // defpackage.gdb
    public final long K0() {
        X0();
        return this.a.K0();
    }

    @Override // defpackage.gdb
    public final int L() {
        X0();
        return this.a.L();
    }

    @Override // defpackage.gdb
    public final long L0() {
        X0();
        return this.a.L0();
    }

    @Override // defpackage.gdb
    public final emf M() {
        X0();
        return this.a.M();
    }

    @Override // defpackage.gdb
    public final ij9 M0() {
        X0();
        return this.a.M0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void N(int i, ij9 ij9Var) {
        X0();
        super.N(i, ij9Var);
    }

    @Override // defpackage.aq5, defpackage.gdb
    @Deprecated
    public final void O() {
        X0();
        super.O();
    }

    @Override // defpackage.gdb
    public final boolean O0(int i) {
        X0();
        return this.a.O0(i);
    }

    @Override // defpackage.gdb
    public final dqf P() {
        X0();
        return this.a.P();
    }

    @Override // defpackage.gdb
    public final boolean P0() {
        X0();
        return this.a.P0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void Q() {
        X0();
        super.Q();
    }

    @Override // defpackage.gdb
    public final void R(TextureView textureView) {
        X0();
        this.a.R(textureView);
    }

    @Override // defpackage.gdb
    public final boolean R0() {
        X0();
        return this.a.R0();
    }

    @Override // defpackage.gdb
    public final int S() {
        X0();
        return this.a.S();
    }

    @Override // defpackage.gdb
    public final boolean S0() {
        X0();
        return this.a.S0();
    }

    @Override // defpackage.gdb
    public final long T() {
        X0();
        return this.a.T();
    }

    public final ij9 T0() {
        if (O0(16)) {
            return M0();
        }
        return null;
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void U(int i, long j) {
        X0();
        super.U(i, j);
    }

    public final emf U0() {
        if (O0(17)) {
            return M();
        }
        if (O0(16) && !M().p()) {
            return new a(this);
        }
        return emf.a;
    }

    @Override // defpackage.gdb
    public final gdb.a V() {
        X0();
        return this.a.V();
    }

    public final oj9 V0() {
        return O0(18) ? I0() : oj9.K;
    }

    @Override // defpackage.gdb
    public final boolean W() {
        X0();
        return this.a.W();
    }

    public final boolean W0() {
        return O0(23) && C0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void X(boolean z) {
        X0();
        super.X(z);
    }

    public final void X0() {
        ka2.q(Looper.myLooper() == this.a.Q0());
    }

    @Override // defpackage.gdb
    public final long Y() {
        X0();
        return this.a.Y();
    }

    @Override // defpackage.gdb
    public final void Z(gdb.c cVar) {
        X0();
        this.a.Z(new aq5.a(this, cVar));
    }

    @Override // defpackage.gdb
    public final PlaybackException a() {
        X0();
        return this.a.a();
    }

    @Override // defpackage.gdb
    public final long a0() {
        X0();
        return this.a.a0();
    }

    @Override // defpackage.gdb
    public final int b() {
        X0();
        return this.a.b();
    }

    @Override // defpackage.gdb
    public final int b0() {
        X0();
        return this.a.b0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void c() {
        X0();
        super.c();
    }

    @Override // defpackage.gdb
    public final void c0(TextureView textureView) {
        X0();
        this.a.c0(textureView);
    }

    @Override // defpackage.gdb
    public final boolean d() {
        X0();
        return this.a.d();
    }

    @Override // defpackage.gdb
    public final tog d0() {
        X0();
        return this.a.d0();
    }

    @Override // defpackage.gdb
    public final cdb e() {
        X0();
        return this.a.e();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final float e0() {
        X0();
        return super.e0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void f() {
        X0();
        super.f();
    }

    @Override // defpackage.gdb
    public final ox0 f0() {
        X0();
        return this.a.f0();
    }

    @Override // defpackage.gdb
    public final void g(cdb cdbVar) {
        X0();
        this.a.g(cdbVar);
    }

    @Override // defpackage.gdb
    public final s34 g0() {
        X0();
        return this.a.g0();
    }

    @Override // defpackage.gdb
    public final long getDuration() {
        X0();
        return this.a.getDuration();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void h(float f) {
        X0();
        super.h(f);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void h0(int i, int i2) {
        X0();
        super.h0(i, i2);
    }

    @Override // defpackage.gdb
    public final int i() {
        X0();
        return this.a.i();
    }

    @Override // defpackage.gdb
    public final int i0() {
        X0();
        return this.a.i0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void j(Surface surface) {
        X0();
        super.j(surface);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void j0(long j) {
        X0();
        super.j0(j);
    }

    @Override // defpackage.gdb
    public final boolean k() {
        X0();
        return this.a.k();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void k0(float f) {
        X0();
        super.k0(f);
    }

    @Override // defpackage.gdb
    public final long l() {
        X0();
        return this.a.l();
    }

    @Override // defpackage.gdb
    public final void l0(List<ij9> list, int i, long j) {
        X0();
        this.a.l0(list, i, j);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void m(ij9 ij9Var, long j) {
        X0();
        super.m(ij9Var, j);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void m0(int i) {
        X0();
        super.m0(i);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void n() {
        X0();
        super.n();
    }

    @Override // defpackage.gdb
    public final long n0() {
        X0();
        return this.a.n0();
    }

    @Override // defpackage.gdb
    public final int o() {
        X0();
        return this.a.o();
    }

    public final v9e o0() {
        boolean zO0 = O0(16);
        return new v9e(x(), zO0 && k(), SystemClock.elapsedRealtime(), zO0 ? getDuration() : -9223372036854775807L, zO0 ? r0() : 0L, zO0 ? o() : 0, zO0 ? l() : 0L, zO0 ? T() : -9223372036854775807L, zO0 ? a0() : -9223372036854775807L, zO0 ? E0() : 0L);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void p() {
        X0();
        super.p();
    }

    @Override // defpackage.gdb
    public final long p0() {
        X0();
        return this.a.p0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void q() {
        X0();
        super.q();
    }

    @Override // defpackage.gdb
    public final void q0(int i, List<ij9> list) {
        X0();
        this.a.q0(i, list);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void r(int i, boolean z) {
        X0();
        super.r(i, z);
    }

    @Override // defpackage.gdb
    public final long r0() {
        X0();
        return this.a.r0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    @Deprecated
    public final void s() {
        X0();
        super.s();
    }

    @Override // defpackage.gdb
    public final oj9 s0() {
        X0();
        return this.a.s0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void stop() {
        X0();
        super.stop();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void t(int i) {
        X0();
        super.t(i);
    }

    @Override // defpackage.gdb
    public final boolean t0() {
        X0();
        return this.a.t0();
    }

    @Override // defpackage.gdb
    public final void u(SurfaceView surfaceView) {
        X0();
        this.a.u(surfaceView);
    }

    @Override // defpackage.gdb
    public final void u0() {
        X0();
        this.a.u0();
    }

    @Override // defpackage.gdb
    public final void v(dqf dqfVar) {
        X0();
        this.a.v(dqfVar);
    }

    @Override // defpackage.gdb
    public final int v0() {
        X0();
        return this.a.v0();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void w(int i) {
        X0();
        super.w(i);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void w0(int i) {
        X0();
        super.w0(i);
    }

    public final gdb.d x() {
        boolean zO0 = O0(16);
        boolean zO02 = O0(17);
        return new gdb.d(null, zO02 ? v0() : 0, zO0 ? M0() : null, null, zO02 ? b0() : 0, zO0 ? K0() : 0L, zO0 ? p0() : 0L, zO0 ? H() : -1, zO0 ? i0() : -1);
    }

    @Override // defpackage.gdb
    public final void x0(gdb.c cVar) {
        X0();
        this.a.x0(new aq5.a(this, cVar));
    }

    @Override // defpackage.gdb
    public final void y(int i, int i2) {
        X0();
        this.a.y(i, i2);
    }

    @Override // defpackage.gdb
    public final void y0(SurfaceView surfaceView) {
        X0();
        this.a.y0(surfaceView);
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void z() {
        X0();
        super.z();
    }

    @Override // defpackage.aq5, defpackage.gdb
    public final void z0(int i, int i2) {
        X0();
        super.z0(i, i2);
    }
}
