package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.source.h;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.e47;
import defpackage.emf;
import defpackage.f47;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.v20;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class al3 implements m20 {
    public gdb V;
    public sf6 W;
    public boolean X;
    public final d82 a;
    public final emf.b b;
    public final emf.d c;
    public final a d;
    public final SparseArray<v20.a> e;
    public lz8<v20> f;

    public static final class a {
        public final emf.b a;
        public e47<h.b> b;
        public f47<h.b, emf> c;
        public h.b d;
        public h.b e;
        public h.b f;

        public a(emf.b bVar) {
            this.a = bVar;
            e47.b bVar2 = e47.b;
            this.b = qyc.e;
            this.c = ryc.V;
        }

        public static h.b b(gdb gdbVar, e47<h.b> e47Var, h.b bVar, emf.b bVar2) {
            emf emfVarM = gdbVar.M();
            int iB0 = gdbVar.b0();
            Object objL = emfVarM.p() ? null : emfVarM.l(iB0);
            int iB = (gdbVar.k() || emfVarM.p()) ? -1 : emfVarM.f(iB0, bVar2, false).b(vjg.O(gdbVar.K0()) - bVar2.e);
            for (int i = 0; i < e47Var.size(); i++) {
                h.b bVar3 = e47Var.get(i);
                if (c(bVar3, objL, gdbVar.k(), gdbVar.H(), gdbVar.i0(), iB)) {
                    return bVar3;
                }
            }
            if (e47Var.isEmpty() && bVar != null && c(bVar, objL, gdbVar.k(), gdbVar.H(), gdbVar.i0(), iB)) {
                return bVar;
            }
            return null;
        }

        public static boolean c(h.b bVar, Object obj, boolean z, int i, int i2, int i3) {
            Object obj2 = bVar.a;
            int i4 = bVar.b;
            if (!obj2.equals(obj)) {
                return false;
            }
            if (z && i4 == i && bVar.c == i2) {
                return true;
            }
            return !z && i4 == -1 && bVar.e == i3;
        }

        public final void a(f47.a<h.b, emf> aVar, h.b bVar, emf emfVar) {
            if (bVar == null) {
                return;
            }
            if (emfVar.b(bVar.a) != -1) {
                aVar.b(bVar, emfVar);
                return;
            }
            emf emfVar2 = this.c.get(bVar);
            if (emfVar2 != null) {
                aVar.b(bVar, emfVar2);
            }
        }

        public final void d(emf emfVar) {
            e47<h.b> e47Var;
            f47.a<h.b, emf> aVar = new f47.a<>(4);
            if (this.b.isEmpty()) {
                a(aVar, this.e, emfVar);
                if (!Objects.equals(this.f, this.e)) {
                    a(aVar, this.f, emfVar);
                }
                if (!Objects.equals(this.d, this.e) && !Objects.equals(this.d, this.f)) {
                    a(aVar, this.d, emfVar);
                }
            } else {
                int i = 0;
                while (true) {
                    int size = this.b.size();
                    e47Var = this.b;
                    if (i >= size) {
                        break;
                    }
                    a(aVar, e47Var.get(i), emfVar);
                    i++;
                }
                if (!e47Var.contains(this.d)) {
                    a(aVar, this.d, emfVar);
                }
            }
            this.c = aVar.a();
        }
    }

    public al3(d82 d82Var) {
        d82Var.getClass();
        this.a = d82Var;
        String str = vjg.a;
        Looper looperMyLooper = Looper.myLooper();
        this.f = new lz8<>(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, d82Var, new k6());
        emf.b bVar = new emf.b();
        this.b = bVar;
        this.c = new emf.d();
        this.d = new a(bVar);
        this.e = new SparseArray<>();
    }

    @Override // gdb.c
    public final void A(long j) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 16, new g7(aVarW0, j));
    }

    public final v20.a A0() {
        return y0(this.d.f);
    }

    @Override // gdb.c
    public final void B(final int i, final gdb.d dVar, final gdb.d dVar2) {
        if (i == 1) {
            this.X = false;
        }
        gdb gdbVar = this.V;
        gdbVar.getClass();
        a aVar = this.d;
        aVar.d = a.b(gdbVar, aVar.b, aVar.e, aVar.a);
        final v20.a aVarW0 = w0();
        B0(aVarW0, 11, new lz8.a(aVarW0, i, dVar, dVar2) { // from class: uk3
            public final /* synthetic */ int a;

            {
                this.a = i;
            }

            @Override // lz8.a
            public final void invoke(Object obj) {
                v20 v20Var = (v20) obj;
                v20Var.getClass();
                v20Var.h(this.a);
            }
        });
    }

    public final void B0(v20.a aVar, int i, lz8.a<v20> aVar2) {
        this.e.put(i, aVar);
        this.f.f(i, aVar2);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void C(int i, h.b bVar, nj9 nj9Var) {
        v20.a aVarZ0 = z0(i, bVar);
        B0(aVarZ0, 1004, new lg2(aVarZ0, nj9Var));
    }

    @Override // defpackage.m20
    public final void D(sy0 sy0Var) {
        B0(A0(), 1031, new akb());
    }

    @Override // gdb.c
    public final void E(oj9 oj9Var) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 15, new o6(aVarW0, oj9Var));
    }

    @Override // androidx.media3.exoplayer.drm.a
    public final void F(int i, h.b bVar) {
        v20.a aVarZ0 = z0(i, bVar);
        B0(aVarZ0, 1023, new w40(aVarZ0));
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void G(int i, h.b bVar, nj9 nj9Var) {
        B0(z0(i, bVar), 1005, new s40());
    }

    @Override // gdb.c
    public final void H() {
    }

    @Override // gdb.c
    public final void I(boolean z) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 23, new u40(aVarA0, z));
    }

    @Override // defpackage.m20
    public final void J(Exception exc) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1014, new h5(aVarA0, exc, 11));
    }

    @Override // gdb.c
    public final void K(List<n83> list) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 27, new sk3(aVarW0, list));
    }

    @Override // defpackage.m20
    public final void L(long j) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1010, new w40(aVarA0, j));
    }

    @Override // gdb.c
    public final void M(js9 js9Var) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 28, new u40(aVarW0, js9Var));
    }

    @Override // gdb.c
    public final void N(s34 s34Var) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 29, new j6(aVarW0, s34Var));
    }

    @Override // k81.a
    public final void O(final long j, final int i, final long j2) {
        a aVar = this.d;
        final v20.a aVarY0 = y0(aVar.b.isEmpty() ? null : (h.b) h4.l(aVar.b));
        B0(aVarY0, 1006, new lz8.a(i, j, j2) { // from class: zk3
            public final /* synthetic */ int b;
            public final /* synthetic */ long c;

            @Override // lz8.a
            public final void invoke(Object obj) {
                ((v20) obj).k(this.b, this.c, this.a);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.a
    public final void P(int i, h.b bVar, int i2) {
        v20.a aVarZ0 = z0(i, bVar);
        B0(aVarZ0, 1022, new l(aVarZ0, i2));
    }

    @Override // gdb.c
    public final void Q(int i, int i2) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 24, new r40(aVarA0, i, i2));
    }

    @Override // androidx.media3.exoplayer.drm.a
    public final void R(int i, h.b bVar, Exception exc) {
        B0(z0(i, bVar), IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, new l6());
    }

    @Override // gdb.c
    public final void S(ox0 ox0Var) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 20, new v40(aVarA0, ox0Var));
    }

    @Override // gdb.c
    public final void T(dqf dqfVar) {
        B0(w0(), 19, new k6());
    }

    @Override // gdb.c
    public final void U(boolean z) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 3, new r40(aVarW0, z));
    }

    @Override // gdb.c
    public final void V(int i, boolean z) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 5, new uz(i, aVarW0, z));
    }

    @Override // gdb.c
    public final void W(float f) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 22, new l5(aVarA0, f));
    }

    @Override // gdb.c
    public final void X(int i, ij9 ij9Var) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 1, new uz(aVarW0, ij9Var, i));
    }

    @Override // defpackage.m20
    public final void Y(ak3 ak3Var) {
        v20.a aVarY0 = y0(this.d.e);
        B0(aVarY0, 1013, new uz(aVarY0, ak3Var));
    }

    @Override // androidx.media3.exoplayer.drm.a
    public final void Z(int i, h.b bVar) {
        v20.a aVarZ0 = z0(i, bVar);
        B0(aVarZ0, 1025, new v40(aVarZ0, 5));
    }

    @Override // gdb.c
    public final void a(tog togVar) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 25, new g9(aVarA0, togVar));
    }

    @Override // defpackage.m20
    public final void a0(qyc qycVar, h.b bVar) {
        gdb gdbVar = this.V;
        gdbVar.getClass();
        a aVar = this.d;
        aVar.getClass();
        aVar.b = e47.j(qycVar);
        if (!qycVar.isEmpty()) {
            aVar.e = (h.b) qycVar.get(0);
            bVar.getClass();
            aVar.f = bVar;
        }
        if (aVar.d == null) {
            aVar.d = a.b(gdbVar, aVar.b, aVar.e, aVar.a);
        }
        aVar.d(gdbVar.M());
    }

    @Override // defpackage.m20
    public final void b(ak3 ak3Var) {
        v20.a aVarY0 = y0(this.d.e);
        B0(aVarY0, 1020, new vk3(aVarY0, ak3Var));
    }

    @Override // gdb.c
    public final void b0(q83 q83Var) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 27, new p6(aVarW0, q83Var));
    }

    @Override // defpackage.m20
    public final void c(androidx.media3.common.a aVar, dk3 dk3Var) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1017, new xk3(aVarA0, aVar, dk3Var));
    }

    @Override // defpackage.m20
    public final void c0(int i, int i2, boolean z) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1033, new l(aVarA0, i, i2, z));
    }

    @Override // defpackage.m20
    public final void d(String str) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1019, new ia(aVarA0, str, 4));
    }

    @Override // defpackage.m20
    public final void d0(long j, int i, long j2) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1011, new t40(aVarA0, i, j, j2));
    }

    @Override // defpackage.m20
    public final void e(long j, String str, long j2) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1016, new r6(aVarA0, str, j2, j));
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void e0(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var, int i2) {
        v20.a aVarZ0 = z0(i, bVar);
        B0(aVarZ0, 1000, new h5(aVarZ0, uz8Var, nj9Var, i2));
    }

    @Override // defpackage.m20
    public final void f(Exception exc) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1030, new g7(9, aVarA0, exc));
    }

    @Override // gdb.c
    public final void f0(wqf wqfVar) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 2, new z3(6, aVarW0, wqfVar));
    }

    @Override // gdb.c
    public final void g(PlaybackException playbackException) {
        h.b bVar;
        v20.a aVarW0 = (!(playbackException instanceof ExoPlaybackException) || (bVar = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? w0() : y0(bVar);
        B0(aVarW0, 10, new tk3(aVarW0, playbackException));
    }

    @Override // defpackage.m20
    public final void g0(v20 v20Var) {
        this.f.a(v20Var);
    }

    @Override // gdb.c
    public final void h(int i) {
    }

    @Override // gdb.c
    public final void h0(oj9 oj9Var) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 14, new w20(aVarW0, oj9Var));
    }

    @Override // defpackage.m20
    public final void i(int i, long j) {
        v20.a aVarY0 = y0(this.d.e);
        B0(aVarY0, 1021, new ja(i, j, aVarY0));
    }

    @Override // gdb.c
    public final void i0(long j) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 17, new w20(aVarW0, j));
    }

    @Override // defpackage.m20
    public final void j(ak3 ak3Var) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1015, new r6(aVarA0, ak3Var));
    }

    @Override // gdb.c
    public final void j0(emf emfVar, int i) {
        gdb gdbVar = this.V;
        gdbVar.getClass();
        a aVar = this.d;
        aVar.d = a.b(gdbVar, aVar.b, aVar.e, aVar.a);
        aVar.d(gdbVar.M());
        v20.a aVarW0 = w0();
        B0(aVarW0, 0, new z3(aVarW0, i));
    }

    @Override // defpackage.m20
    public final void k(int i, long j) {
        v20.a aVarY0 = y0(this.d.e);
        B0(aVarY0, 1018, new bg(i, j, aVarY0));
    }

    @Override // defpackage.m20
    public final void k0(long j, String str, long j2) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1008, new w40(aVarA0, str, j2, j));
    }

    @Override // defpackage.m20
    public final void l(Object obj, long j) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 26, new yk3(aVarA0, obj, j));
    }

    @Override // gdb.c
    public final void l0(int i, boolean z) {
        v20.a aVarW0 = w0();
        B0(aVarW0, -1, new w20(i, aVarW0, z));
    }

    @Override // gdb.c
    public final void m(int i) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 8, new o6(aVarW0, i));
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void m0(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var, IOException iOException, boolean z) {
        v20.a aVarZ0 = z0(i, bVar);
        B0(aVarZ0, 1003, new wk3(aVarZ0, uz8Var, nj9Var, iOException, z));
    }

    @Override // gdb.c
    public final void n(int i) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 6, new bg(aVarW0, i));
    }

    @Override // defpackage.m20
    public final void n0(Exception exc) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1029, new q6(aVarA0, exc));
    }

    @Override // gdb.c
    public final void o(gdb.b bVar) {
    }

    @Override // gdb.c
    public final void o0(cdb cdbVar) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 12, new h5(aVarW0, cdbVar, 9));
    }

    @Override // gdb.c
    public final void p(boolean z) {
    }

    @Override // gdb.c
    public final void p0(gdb.a aVar) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 13, new ja(aVarW0, aVar, 8));
    }

    @Override // defpackage.m20
    public final void q(d dVar, Looper looper) {
        ka2.q(this.V == null || this.d.b.isEmpty());
        dVar.getClass();
        this.V = dVar;
        this.W = this.a.c(looper, null);
        lz8<v20> lz8Var = this.f;
        this.f = new lz8<>(lz8Var.d, looper, lz8Var.a, new rk3(this, dVar), lz8Var.i);
    }

    @Override // gdb.c
    public final void q0(PlaybackException playbackException) {
        h.b bVar;
        v20.a aVarW0 = (!(playbackException instanceof ExoPlaybackException) || (bVar = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? w0() : y0(bVar);
        B0(aVarW0, 10, new ja(aVarW0, playbackException, 6));
    }

    @Override // gdb.c
    public final void r(int i) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 21, new n6(aVarA0, i));
    }

    @Override // gdb.c
    public final void r0(long j) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 18, new t40(aVarW0, j));
    }

    @Override // defpackage.m20
    public final void release() {
        sf6 sf6Var = this.W;
        ka2.r(sf6Var);
        sf6Var.i(new ob0(this, 2));
    }

    @Override // gdb.c
    public final void s(int i) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 4, new m6(aVarW0, i));
    }

    @Override // androidx.media3.exoplayer.drm.a
    public final void s0(int i, h.b bVar) {
        v20.a aVarZ0 = z0(i, bVar);
        B0(aVarZ0, 1027, new k20(aVarZ0, 7));
    }

    @Override // defpackage.m20
    public final void t() {
        if (this.X) {
            return;
        }
        v20.a aVarW0 = w0();
        this.X = true;
        B0(aVarW0, -1, new b0(aVarW0, 5));
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void t0(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var) {
        v20.a aVarZ0 = z0(i, bVar);
        B0(aVarZ0, 1001, new m6(aVarZ0, uz8Var, nj9Var));
    }

    @Override // defpackage.m20
    public final void u(String str) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1012, new bg(aVarA0, str));
    }

    @Override // defpackage.m20
    public final void u0(ak3 ak3Var) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1007, new g7(10, aVarA0, ak3Var));
    }

    @Override // gdb.c
    public final void v(boolean z) {
        B0(w0(), 9, new s6());
    }

    @Override // gdb.c
    public final void v0(boolean z) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 7, new v40(aVarW0, z));
    }

    @Override // defpackage.m20
    public final void w(sy0 sy0Var) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1032, new ia(aVarA0, sy0Var, 6));
    }

    public final v20.a w0() {
        return y0(this.d.d);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void x(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var) {
        v20.a aVarZ0 = z0(i, bVar);
        B0(aVarZ0, 1002, new z3(aVarZ0, uz8Var, nj9Var));
    }

    @RequiresNonNull({"player"})
    public final v20.a x0(emf emfVar, int i, h.b bVar) {
        h.b bVar2 = emfVar.p() ? null : bVar;
        long jD = this.a.d();
        boolean z = emfVar.equals(this.V.M()) && i == this.V.v0();
        long jC0 = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z) {
                jC0 = this.V.p0();
            } else if (!emfVar.p()) {
                jC0 = vjg.c0(emfVar.m(i, this.c, 0L).k);
            }
        } else if (z && this.V.H() == bVar2.b && this.V.i0() == bVar2.c) {
            jC0 = this.V.K0();
        }
        return new v20.a(jD, emfVar, i, bVar2, jC0, this.V.M(), this.V.v0(), this.d.d, this.V.K0(), this.V.l());
    }

    @Override // defpackage.m20
    public final void y(androidx.media3.common.a aVar, dk3 dk3Var) {
        v20.a aVarA0 = A0();
        B0(aVarA0, 1009, new q6(aVarA0, aVar, dk3Var));
    }

    public final v20.a y0(h.b bVar) {
        this.V.getClass();
        emf emfVar = bVar == null ? null : this.d.c.get(bVar);
        if (bVar != null && emfVar != null) {
            return x0(emfVar, emfVar.g(bVar.a, this.b).c, bVar);
        }
        int iV0 = this.V.v0();
        emf emfVarM = this.V.M();
        if (iV0 >= emfVarM.o()) {
            emfVarM = emf.a;
        }
        return x0(emfVarM, iV0, null);
    }

    @Override // gdb.c
    public final void z(int i, boolean z) {
        v20.a aVarW0 = w0();
        B0(aVarW0, 30, new ia(i, aVarW0, z));
    }

    public final v20.a z0(int i, h.b bVar) {
        this.V.getClass();
        if (bVar != null) {
            return this.d.c.get(bVar) != null ? y0(bVar) : x0(emf.a, i, bVar);
        }
        emf emfVarM = this.V.M();
        if (i >= emfVarM.o()) {
            emfVarM = emf.a;
        }
        return x0(emfVarM, i, null);
    }
}
