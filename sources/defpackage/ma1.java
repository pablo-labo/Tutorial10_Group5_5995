package defpackage;

import androidx.media3.exoplayer.d;
import defpackage.emf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ma1 implements gdb {
    public final emf.d a = new emf.d();

    @Override // defpackage.gdb
    public final void B() {
        int iE;
        d dVar = (d) this;
        emf emfVarM = dVar.M();
        if (emfVarM.p()) {
            iE = -1;
        } else {
            int iV0 = dVar.v0();
            dVar.y1();
            int i = dVar.G;
            if (i == 1) {
                i = 0;
            }
            dVar.y1();
            iE = emfVarM.e(iV0, i, dVar.H);
        }
        if (iE == -1) {
            T0();
        } else if (iE == dVar.v0()) {
            U0(dVar.v0(), -9223372036854775807L, true);
        } else {
            U0(iE, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.gdb
    public final void B0(List<ij9> list) {
        ((d) this).q0(Integer.MAX_VALUE, list);
    }

    @Override // defpackage.gdb
    public final void G0() {
        d dVar = (d) this;
        dVar.y1();
        W0(12, dVar.w);
    }

    @Override // defpackage.gdb
    public final void H0() {
        d dVar = (d) this;
        dVar.y1();
        W0(11, -dVar.v);
    }

    @Override // defpackage.gdb
    public final void J(ij9 ij9Var) {
        ((d) this).J0(e47.n(ij9Var));
    }

    @Override // defpackage.gdb
    public final ij9 M0() {
        d dVar = (d) this;
        emf emfVarM = dVar.M();
        if (emfVarM.p()) {
            return null;
        }
        return emfVarM.m(dVar.v0(), this.a, 0L).b;
    }

    @Override // defpackage.gdb
    public final void N(int i, ij9 ij9Var) {
        d dVar = (d) this;
        dVar.K(e47.n(ij9Var), i, i + 1);
    }

    @Override // defpackage.gdb
    public final boolean O0(int i) {
        d dVar = (d) this;
        dVar.y1();
        return dVar.P.a(i);
    }

    @Override // defpackage.gdb
    public final boolean P0() {
        d dVar = (d) this;
        emf emfVarM = dVar.M();
        return !emfVarM.p() && emfVarM.m(dVar.v0(), this.a, 0L).h;
    }

    @Override // defpackage.gdb
    public final void Q() {
        int iE;
        d dVar = (d) this;
        if (dVar.M().p() || dVar.k()) {
            T0();
            return;
        }
        if (!x()) {
            if (S0() && P0()) {
                U0(dVar.v0(), -9223372036854775807L, false);
                return;
            } else {
                T0();
                return;
            }
        }
        emf emfVarM = dVar.M();
        if (emfVarM.p()) {
            iE = -1;
        } else {
            int iV0 = dVar.v0();
            dVar.y1();
            int i = dVar.G;
            if (i == 1) {
                i = 0;
            }
            dVar.y1();
            iE = emfVarM.e(iV0, i, dVar.H);
        }
        if (iE == -1) {
            T0();
        } else if (iE == dVar.v0()) {
            U0(dVar.v0(), -9223372036854775807L, true);
        } else {
            U0(iE, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.gdb
    public final boolean R0() {
        d dVar = (d) this;
        emf emfVarM = dVar.M();
        return !emfVarM.p() && emfVarM.m(dVar.v0(), this.a, 0L).g;
    }

    @Override // defpackage.gdb
    public final boolean S0() {
        d dVar = (d) this;
        emf emfVarM = dVar.M();
        return !emfVarM.p() && emfVarM.m(dVar.v0(), this.a, 0L).a();
    }

    @Override // defpackage.gdb
    public final long T() {
        d dVar = (d) this;
        emf emfVarM = dVar.M();
        if (emfVarM.p()) {
            return -9223372036854775807L;
        }
        int iV0 = dVar.v0();
        emf.d dVar2 = this.a;
        if (emfVarM.m(iV0, dVar2, 0L).e == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (vjg.A(dVar2.f) - dVar2.e) - dVar.p0();
    }

    public final void T0() {
        ((d) this).y1();
    }

    @Override // defpackage.gdb
    public final void U(int i, long j) {
        U0(i, j, false);
    }

    public abstract void U0(int i, long j, boolean z);

    public final void V0(int i, long j) {
        U0(((d) this).v0(), j, false);
    }

    public final void W0(int i, long j) {
        d dVar = (d) this;
        long jK0 = dVar.K0() + j;
        long duration = dVar.getDuration();
        if (duration != -9223372036854775807L) {
            jK0 = Math.min(jK0, duration);
        }
        V0(i, Math.max(jK0, 0L));
    }

    public final void X0(int i) {
        int iK;
        d dVar = (d) this;
        emf emfVarM = dVar.M();
        if (emfVarM.p()) {
            iK = -1;
        } else {
            int iV0 = dVar.v0();
            dVar.y1();
            int i2 = dVar.G;
            if (i2 == 1) {
                i2 = 0;
            }
            dVar.y1();
            iK = emfVarM.k(iV0, i2, dVar.H);
        }
        if (iK == -1) {
            T0();
        } else if (iK == dVar.v0()) {
            U0(dVar.v0(), -9223372036854775807L, true);
        } else {
            U0(iK, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.gdb
    public final long a0() {
        d dVar = (d) this;
        emf emfVarM = dVar.M();
        if (emfVarM.p()) {
            return -9223372036854775807L;
        }
        return vjg.c0(emfVarM.m(dVar.v0(), this.a, 0L).l);
    }

    @Override // defpackage.gdb
    public final void c() {
        ((d) this).A(false);
    }

    @Override // defpackage.gdb
    public final void h(float f) {
        d dVar = (d) this;
        dVar.g(new cdb(f, dVar.e().b));
    }

    @Override // defpackage.gdb
    public final void j0(long j) {
        V0(5, j);
    }

    @Override // defpackage.gdb
    public final void m(ij9 ij9Var, long j) {
        ((d) this).l0(e47.n(ij9Var), 0, j);
    }

    @Override // defpackage.gdb
    public final void m0(int i) {
        U0(i, -9223372036854775807L, false);
    }

    @Override // defpackage.gdb
    public final void n() {
        ((d) this).y(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.gdb
    public final int o() {
        d dVar = (d) this;
        long jR0 = dVar.r0();
        long duration = dVar.getDuration();
        if (jR0 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return vjg.i(vjg.S(jR0, duration), 0, 100);
    }

    public final boolean o0() {
        int iK;
        d dVar = (d) this;
        emf emfVarM = dVar.M();
        if (emfVarM.p()) {
            iK = -1;
        } else {
            int iV0 = dVar.v0();
            dVar.y1();
            int i = dVar.G;
            if (i == 1) {
                i = 0;
            }
            dVar.y1();
            iK = emfVarM.k(iV0, i, dVar.H);
        }
        return iK != -1;
    }

    @Override // defpackage.gdb
    public final void p() {
        X0(6);
    }

    @Override // defpackage.gdb
    public final void q() {
        U0(((d) this).v0(), -9223372036854775807L, false);
    }

    @Override // defpackage.gdb
    public final boolean t0() {
        d dVar = (d) this;
        return dVar.b() == 3 && dVar.W() && dVar.L() == 0;
    }

    @Override // defpackage.gdb
    public final void u0() {
        ((d) this).A(true);
    }

    @Override // defpackage.gdb
    public final void w(int i) {
        ((d) this).y(i, i + 1);
    }

    public final boolean x() {
        int iE;
        d dVar = (d) this;
        emf emfVarM = dVar.M();
        if (emfVarM.p()) {
            iE = -1;
        } else {
            int iV0 = dVar.v0();
            dVar.y1();
            int i = dVar.G;
            if (i == 1) {
                i = 0;
            }
            dVar.y1();
            iE = emfVarM.e(iV0, i, dVar.H);
        }
        return iE != -1;
    }

    @Override // defpackage.gdb
    public final void z() {
        d dVar = (d) this;
        if (dVar.M().p() || dVar.k()) {
            T0();
            return;
        }
        boolean zO0 = o0();
        if (S0() && !R0()) {
            if (zO0) {
                X0(7);
                return;
            } else {
                T0();
                return;
            }
        }
        if (zO0) {
            long jK0 = dVar.K0();
            dVar.y1();
            if (jK0 <= dVar.x) {
                X0(7);
                return;
            }
        }
        V0(7, 0L);
    }

    @Override // defpackage.gdb
    public final void z0(int i, int i2) {
        if (i != i2) {
            ((d) this).A0(i, i + 1, i2);
        }
    }
}
