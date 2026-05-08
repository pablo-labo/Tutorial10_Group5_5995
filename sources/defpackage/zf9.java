package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.w;
import defpackage.j4a;
import defpackage.pm8;
import defpackage.z59;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zf9 extends w implements vf9, g20, uz9 {
    public boolean B0;
    public boolean V;
    public boolean Y;
    public boolean Z;
    public boolean b0;
    public Function1<? super cd6, j6g> d0;
    public xc6 e0;
    public final um8 f;
    public float f0;
    public Object h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean q0;
    public float u0;
    public boolean v0;
    public Function1<? super cd6, j6g> w0;
    public xc6 x0;
    public float z0;
    public int W = Integer.MAX_VALUE;
    public int X = Integer.MAX_VALUE;
    public pm8.f a0 = pm8.f.c;
    public long c0 = 0;
    public boolean g0 = true;
    public final rm8 n0 = new rm8(this);
    public final j4a<zf9> o0 = new j4a<>(new zf9[16]);
    public boolean p0 = true;
    public long r0 = mq2.b(0, 0, 15);
    public final b s0 = new b();
    public final a t0 = new a();
    public long y0 = 0;
    public final c A0 = new c();

    public static final class a extends mj8 implements gu5<j6g> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            um8 um8Var = zf9.this.f;
            um8Var.i = 0;
            j4a<pm8> j4aVarN = um8Var.a.N();
            pm8[] pm8VarArr = j4aVarN.a;
            int i = j4aVarN.c;
            for (int i2 = 0; i2 < i; i2++) {
                zf9 zf9Var = pm8VarArr[i2].u0.p;
                zf9Var.W = zf9Var.X;
                zf9Var.X = Integer.MAX_VALUE;
                zf9Var.j0 = false;
                if (zf9Var.a0 == pm8.f.b) {
                    zf9Var.a0 = pm8.f.c;
                }
            }
            zf9.this.X(xf9.a);
            zf9.this.M().G0().j();
            pm8 pm8Var = zf9.this.f.a;
            j4a<pm8> j4aVarN2 = pm8Var.N();
            pm8[] pm8VarArr2 = j4aVarN2.a;
            int i3 = j4aVarN2.c;
            for (int i4 = 0; i4 < i3; i4++) {
                pm8 pm8Var2 = pm8VarArr2[i4];
                um8 um8Var2 = pm8Var2.u0;
                if (um8Var2.p.W != pm8Var2.L()) {
                    pm8Var.a0();
                    pm8Var.Q();
                    if (pm8Var2.L() == Integer.MAX_VALUE) {
                        if (um8Var2.c) {
                            z59 z59Var = um8Var2.q;
                            z59Var.getClass();
                            z59Var.n0(false);
                        }
                        um8Var2.p.u0();
                    }
                }
            }
            zf9.this.X(yf9.a);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements gu5<j6g> {
        public b() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            zf9.this.f.a().R(zf9.this.r0);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements gu5<j6g> {
        public c() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            w.a placementScope;
            tia tiaVar = zf9.this.f.a().i0;
            if (tiaVar == null || (placementScope = tiaVar.a0) == null) {
                placementScope = tm8.a(zf9.this.f.a).getPlacementScope();
            }
            zf9 zf9Var = zf9.this;
            Function1<? super cd6, j6g> function1 = zf9Var.w0;
            um8 um8Var = zf9Var.f;
            xc6 xc6Var = zf9Var.x0;
            if (xc6Var != null) {
                tia tiaVarA = um8Var.a();
                long j = zf9Var.y0;
                float f = zf9Var.z0;
                placementScope.getClass();
                w.a.d(placementScope, tiaVarA);
                tiaVarA.g0(lh7.d(j, tiaVarA.e), f, xc6Var);
            } else if (function1 == null) {
                tia tiaVarA2 = um8Var.a();
                long j2 = zf9Var.y0;
                float f2 = zf9Var.z0;
                placementScope.getClass();
                w.a.d(placementScope, tiaVarA2);
                tiaVarA2.h0(lh7.d(j2, tiaVarA2.e), f2, null);
            } else {
                tia tiaVarA3 = um8Var.a();
                long j3 = zf9Var.y0;
                float f3 = zf9Var.z0;
                placementScope.getClass();
                w.a.d(placementScope, tiaVarA3);
                tiaVarA3.h0(lh7.d(j3, tiaVarA3.e), f3, function1);
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function1<g20, j6g> {
        public static final d a = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(g20 g20Var) {
            g20Var.r().c = false;
            return j6g.a;
        }
    }

    public zf9(um8 um8Var) {
        this.f = um8Var;
    }

    @Override // defpackage.uz9
    public final void C(boolean z) {
        um8 um8Var = this.f;
        if (z != um8Var.a().X) {
            um8Var.a().X = z;
            this.B0 = true;
        }
    }

    @Override // defpackage.g20
    public final void E() {
        this.q0 = true;
        rm8 rm8Var = this.n0;
        rm8Var.i();
        boolean z = this.l0;
        um8 um8Var = this.f;
        if (z) {
            j4a<pm8> j4aVarN = um8Var.a.N();
            pm8[] pm8VarArr = j4aVarN.a;
            int i = j4aVarN.c;
            for (int i2 = 0; i2 < i; i2++) {
                pm8 pm8Var = pm8VarArr[i2];
                if (pm8Var.G() && pm8Var.H() == pm8.f.a && pm8.c0(pm8Var)) {
                    pm8.j0(um8Var.a, false, 7);
                }
            }
        }
        if (this.m0 || (!this.b0 && !M().Z && this.l0)) {
            this.l0 = false;
            pm8.d dVar = um8Var.d;
            um8Var.d = pm8.d.c;
            um8Var.g(false);
            pm8 pm8Var2 = um8Var.a;
            vxa snapshotObserver = tm8.a(pm8Var2).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a(pm8Var2, snapshotObserver.e, this.t0);
            um8Var.d = dVar;
            if (M().Z && um8Var.j) {
                requestLayout();
            }
            this.m0 = false;
        }
        if (rm8Var.d) {
            rm8Var.e = true;
        }
        if (rm8Var.b && rm8Var.f()) {
            rm8Var.h();
        }
        this.q0 = false;
    }

    public final void F0() {
        this.v0 = true;
        um8 um8Var = this.f;
        pm8 pm8VarK = um8Var.a.K();
        float f = M().s0;
        pm8 pm8Var = um8Var.a;
        ria riaVar = pm8Var.t0;
        tia tiaVar = riaVar.d;
        pe7 pe7Var = riaVar.c;
        while (tiaVar != pe7Var) {
            tiaVar.getClass();
            mm8 mm8Var = (mm8) tiaVar;
            f += mm8Var.s0;
            tiaVar = mm8Var.h0;
        }
        if (f != this.u0) {
            this.u0 = f;
            if (pm8VarK != null) {
                pm8VarK.a0();
            }
            if (pm8VarK != null) {
                pm8VarK.Q();
            }
        }
        if (this.i0) {
            pm8Var.t0.c.Q1();
        } else {
            if (pm8VarK != null) {
                pm8VarK.Q();
            }
            s0();
            if (this.V && pm8VarK != null) {
                pm8VarK.i0(false);
            }
        }
        if (pm8VarK != null) {
            um8 um8Var2 = pm8VarK.u0;
            if (!this.V && um8Var2.d == pm8.d.c) {
                if (this.X != Integer.MAX_VALUE) {
                    ae7.b("Place was called on a node which was placed already");
                }
                int i = um8Var2.i;
                this.X = i;
                um8Var2.i = i + 1;
            }
        } else {
            this.X = 0;
        }
        E();
    }

    public final void G0(long j) {
        um8 um8Var = this.f;
        pm8.d dVar = um8Var.d;
        pm8 pm8Var = um8Var.a;
        pm8.d dVar2 = pm8.d.e;
        if (dVar != dVar2) {
            ae7.b("layout state is not idle before measure starts");
        }
        this.r0 = j;
        pm8.d dVar3 = pm8.d.a;
        um8Var.d = dVar3;
        this.k0 = false;
        vxa snapshotObserver = tm8.a(pm8Var).getSnapshotObserver();
        snapshotObserver.getClass();
        snapshotObserver.a(pm8Var, snapshotObserver.c, this.s0);
        if (um8Var.d == dVar3) {
            this.l0 = true;
            this.m0 = true;
            um8Var.d = dVar2;
        }
    }

    public final void H0(long j, float f, Function1<? super cd6, j6g> function1, xc6 xc6Var) {
        um8 um8Var = this.f;
        pm8 pm8Var = um8Var.a;
        pm8 pm8Var2 = um8Var.a;
        if (pm8Var.E0) {
            ae7.a("place is called on a deactivated node");
        }
        um8Var.d = pm8.d.c;
        this.c0 = j;
        this.f0 = f;
        this.d0 = function1;
        this.e0 = xc6Var;
        this.v0 = false;
        rxa rxaVarA = tm8.a(pm8Var2);
        if (this.l0 || !this.i0) {
            this.n0.g = false;
            um8Var.f(false);
            this.w0 = function1;
            this.y0 = j;
            this.z0 = f;
            this.x0 = xc6Var;
            vxa snapshotObserver = rxaVarA.getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a(pm8Var2, snapshotObserver.f, this.A0);
        } else {
            tia tiaVarA = um8Var.a();
            tiaVarA.T1(lh7.d(j, tiaVarA.e), f, function1, xc6Var);
            F0();
        }
        um8Var.d = pm8.d.e;
        this.Z = true;
    }

    public final void I0(long j, float f, Function1<? super cd6, j6g> function1, xc6 xc6Var) throws Throwable {
        boolean z;
        w.a placementScope;
        um8 um8Var = this.f;
        pm8 pm8Var = um8Var.a;
        pm8 pm8Var2 = um8Var.a;
        boolean z2 = true;
        try {
            this.j0 = true;
            if (!lh7.b(j, this.c0) || this.B0) {
                if (um8Var.k || um8Var.j || this.B0) {
                    this.l0 = true;
                    this.B0 = false;
                }
                v0();
            }
            z59 z59Var = um8Var.q;
            if (z59Var != null) {
                um8 um8Var2 = z59Var.f;
                if (pnb.E(um8Var2.a)) {
                    z = true;
                } else {
                    if (z59Var.g0 == z59.a.c && !um8Var2.b) {
                        um8Var2.c = true;
                    }
                    z = um8Var2.c;
                }
                if (z) {
                    tia tiaVar = um8Var.a().i0;
                    if (tiaVar == null || (placementScope = tiaVar.a0) == null) {
                        placementScope = tm8.a(pm8Var2).getPlacementScope();
                    }
                    z59 z59Var2 = um8Var.q;
                    z59Var2.getClass();
                    pm8 pm8VarK = pm8Var2.K();
                    if (pm8VarK != null) {
                        pm8VarK.u0.h = 0;
                    }
                    z59Var2.X = Integer.MAX_VALUE;
                    placementScope.r(z59Var2, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
                }
            }
            z59 z59Var3 = um8Var.q;
            if (z59Var3 == null || z59Var3.a0) {
                z2 = false;
            }
            if (z2) {
                ae7.b("Error: Placement happened before lookahead.");
            }
            H0(j, f, function1, xc6Var);
            j6g j6gVar = j6g.a;
        } catch (Throwable th) {
            pm8Var.m0(th);
            throw null;
        }
    }

    public final boolean J0(long j) throws Throwable {
        um8 um8Var = this.f;
        pm8 pm8Var = um8Var.a;
        pm8 pm8Var2 = um8Var.a;
        try {
            if (pm8Var.E0) {
                ae7.a("measure is called on a deactivated node");
            }
            rxa rxaVarA = tm8.a(pm8Var2);
            pm8 pm8VarK = pm8Var2.K();
            boolean z = true;
            pm8Var2.s0 = pm8Var2.s0 || (pm8VarK != null && pm8VarK.s0);
            if (!pm8Var2.G() && iq2.b(this.d, j)) {
                rxaVarA.k(pm8Var2, false);
                pm8Var2.l0();
                return false;
            }
            this.n0.f = false;
            X(d.a);
            this.Y = true;
            long j2 = um8Var.a().c;
            l0(j);
            G0(j);
            if (th7.b(um8Var.a().c, j2) && um8Var.a().a == this.a && um8Var.a().b == this.b) {
                z = false;
            }
            j0((((long) um8Var.a().b) & 4294967295L) | (((long) um8Var.a().a) << 32));
            return z;
        } catch (Throwable th) {
            pm8Var.m0(th);
            throw null;
        }
    }

    @Override // defpackage.pl7
    public final int K(int i) {
        um8 um8Var = this.f;
        if (!pnb.E(um8Var.a)) {
            z0();
            return um8Var.a().K(i);
        }
        z59 z59Var = um8Var.q;
        z59Var.getClass();
        return z59Var.K(i);
    }

    @Override // defpackage.g20
    public final pe7 M() {
        return this.f.a.t0.c;
    }

    @Override // defpackage.pl7
    public final int O(int i) {
        um8 um8Var = this.f;
        if (!pnb.E(um8Var.a)) {
            z0();
            return um8Var.a().O(i);
        }
        z59 z59Var = um8Var.q;
        z59Var.getClass();
        return z59Var.O(i);
    }

    @Override // defpackage.pl7
    public final int P(int i) {
        um8 um8Var = this.f;
        if (!pnb.E(um8Var.a)) {
            z0();
            return um8Var.a().P(i);
        }
        z59 z59Var = um8Var.q;
        z59Var.getClass();
        return z59Var.P(i);
    }

    @Override // defpackage.vf9
    public final w R(long j) throws Throwable {
        pm8.f fVar;
        um8 um8Var = this.f;
        pm8 pm8Var = um8Var.a;
        pm8 pm8Var2 = um8Var.a;
        pm8.f fVar2 = pm8Var.q0;
        pm8.f fVar3 = pm8.f.c;
        if (fVar2 == fVar3) {
            pm8Var.v();
        }
        if (pnb.E(pm8Var2)) {
            z59 z59Var = um8Var.q;
            z59Var.getClass();
            z59Var.Y = fVar3;
            z59Var.R(j);
        }
        pm8 pm8VarK = pm8Var2.K();
        if (pm8VarK != null) {
            um8 um8Var2 = pm8VarK.u0;
            if (this.a0 != fVar3 && !pm8Var2.s0) {
                ae7.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = um8Var2.d.ordinal();
            if (iOrdinal == 0) {
                fVar = pm8.f.a;
            } else {
                if (iOrdinal != 2) {
                    o6.k(um8Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                fVar = pm8.f.b;
            }
            this.a0 = fVar;
        } else {
            this.a0 = fVar3;
        }
        J0(j);
        return this;
    }

    @Override // defpackage.gg9
    public final int V(d20 d20Var) {
        um8 um8Var = this.f;
        pm8 pm8VarK = um8Var.a.K();
        pm8.d dVar = pm8VarK != null ? pm8VarK.u0.d : null;
        pm8.d dVar2 = pm8.d.a;
        rm8 rm8Var = this.n0;
        if (dVar == dVar2) {
            rm8Var.c = true;
        } else {
            pm8 pm8VarK2 = um8Var.a.K();
            if ((pm8VarK2 != null ? pm8VarK2.u0.d : null) == pm8.d.c) {
                rm8Var.d = true;
            }
        }
        this.b0 = true;
        int iV = um8Var.a().V(d20Var);
        this.b0 = false;
        return iV;
    }

    @Override // defpackage.g20
    public final void X(Function1<? super g20, j6g> function1) {
        j4a<pm8> j4aVarN = this.f.a.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            function1.invoke(pm8VarArr[i2].u0.p);
        }
    }

    @Override // defpackage.g20
    public final void b0() {
        pm8.j0(this.f.a, false, 7);
    }

    @Override // androidx.compose.ui.layout.w
    public final int c0() {
        return this.f.a().c0();
    }

    @Override // androidx.compose.ui.layout.w
    public final int e0() {
        return this.f.a().e0();
    }

    @Override // defpackage.gg9, defpackage.pl7
    public final Object g() {
        return this.h0;
    }

    @Override // androidx.compose.ui.layout.w
    public final void g0(long j, float f, xc6 xc6Var) throws Throwable {
        I0(j, f, null, xc6Var);
    }

    @Override // androidx.compose.ui.layout.w
    public final void h0(long j, float f, Function1<? super cd6, j6g> function1) throws Throwable {
        I0(j, f, function1, null);
    }

    @Override // defpackage.g20
    public final boolean k() {
        return this.i0;
    }

    public final List<zf9> n0() {
        um8 um8Var = this.f;
        um8Var.a.p0();
        boolean z = this.p0;
        j4a<zf9> j4aVar = this.o0;
        if (!z) {
            return j4aVar.f();
        }
        pm8 pm8Var = um8Var.a;
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var2 = pm8VarArr[i2];
            if (j4aVar.c <= i2) {
                j4aVar.b(pm8Var2.u0.p);
            } else {
                zf9 zf9Var = pm8Var2.u0.p;
                zf9[] zf9VarArr = j4aVar.a;
                zf9 zf9Var2 = zf9VarArr[i2];
                zf9VarArr[i2] = zf9Var;
            }
        }
        j4aVar.l(((j4a.a) pm8Var.D()).a.c, j4aVar.c);
        this.p0 = false;
        return j4aVar.f();
    }

    @Override // defpackage.g20
    public final f20 r() {
        return this.n0;
    }

    @Override // defpackage.g20
    public final void requestLayout() {
        pm8 pm8Var = this.f.a;
        pm8.c cVar = pm8.F0;
        pm8Var.i0(false);
    }

    public final void s0() {
        boolean z = this.i0;
        this.i0 = true;
        pm8 pm8Var = this.f.a;
        ria riaVar = pm8Var.t0;
        if (!z) {
            riaVar.c.Q1();
            if (pm8Var.G()) {
                pm8.j0(pm8Var, true, 6);
            } else if (pm8Var.u0.e) {
                pm8.h0(pm8Var, true, 6);
            }
        }
        tia tiaVar = riaVar.c.h0;
        for (tia tiaVar2 = riaVar.d; !wl7.b(tiaVar2, tiaVar) && tiaVar2 != null; tiaVar2 = tiaVar2.h0) {
            if (tiaVar2.z0) {
                tiaVar2.G1();
            }
        }
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var2 = pm8VarArr[i2];
            if (pm8Var2.L() != Integer.MAX_VALUE) {
                pm8Var2.u0.p.s0();
                pm8.k0(pm8Var2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final void u0() {
        if (this.i0) {
            this.i0 = false;
            um8 um8Var = this.f;
            ria riaVar = um8Var.a.t0;
            tia tiaVar = riaVar.c.h0;
            for (tia tiaVar2 = riaVar.d; !wl7.b(tiaVar2, tiaVar) && tiaVar2 != null; tiaVar2 = tiaVar2.h0) {
                e.c cVarI1 = tiaVar2.i1(yia.g(1048576));
                if (cVarI1 != null && (cVarI1.a.d & 1048576) != 0) {
                    boolean zG = yia.g(1048576);
                    e.c cVarF1 = tiaVar2.f1();
                    if (zG || (cVarF1 = cVarF1.e) != null) {
                        for (e.c cVarI12 = tiaVar2.i1(zG); cVarI12 != null && (cVarI12.d & 1048576) != 0; cVarI12 = cVarI12.f) {
                            if ((cVarI12.c & 1048576) != 0) {
                                ?? B = cVarI12;
                                ?? j4aVar = 0;
                                while (B != 0) {
                                    if (B instanceof nra) {
                                        ((nra) B).O1();
                                    } else if ((B.c & 1048576) != 0 && (B instanceof zs3)) {
                                        e.c cVar = ((zs3) B).e0;
                                        int i = 0;
                                        B = B;
                                        j4aVar = j4aVar;
                                        while (cVar != null) {
                                            if ((cVar.c & 1048576) != 0) {
                                                i++;
                                                j4aVar = j4aVar;
                                                if (i == 1) {
                                                    B = cVar;
                                                } else {
                                                    if (j4aVar == 0) {
                                                        j4aVar = new j4a(new e.c[16]);
                                                    }
                                                    if (B != 0) {
                                                        j4aVar.b(B);
                                                        B = 0;
                                                    }
                                                    j4aVar.b(cVar);
                                                }
                                            }
                                            cVar = cVar.f;
                                            B = B;
                                            j4aVar = j4aVar;
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    B = us3.b(j4aVar);
                                }
                            }
                            if (cVarI12 != cVarF1) {
                            }
                        }
                    }
                }
                tiaVar2.V1();
            }
            j4a<pm8> j4aVarN = um8Var.a.N();
            pm8[] pm8VarArr = j4aVarN.a;
            int i2 = j4aVarN.c;
            for (int i3 = 0; i3 < i2; i3++) {
                pm8VarArr[i3].u0.p.u0();
            }
        }
    }

    public final void v0() {
        um8 um8Var = this.f;
        if (um8Var.l > 0) {
            j4a<pm8> j4aVarN = um8Var.a.N();
            pm8[] pm8VarArr = j4aVarN.a;
            int i = j4aVarN.c;
            for (int i2 = 0; i2 < i; i2++) {
                pm8 pm8Var = pm8VarArr[i2];
                um8 um8Var2 = pm8Var.u0;
                boolean z = um8Var2.j;
                zf9 zf9Var = um8Var2.p;
                if ((z || um8Var2.k) && !zf9Var.l0) {
                    pm8Var.i0(false);
                }
                zf9Var.v0();
            }
        }
    }

    @Override // defpackage.pl7
    public final int w(int i) {
        um8 um8Var = this.f;
        if (!pnb.E(um8Var.a)) {
            z0();
            return um8Var.a().w(i);
        }
        z59 z59Var = um8Var.q;
        z59Var.getClass();
        return z59Var.w(i);
    }

    @Override // defpackage.g20
    public final g20 z() {
        um8 um8Var;
        pm8 pm8VarK = this.f.a.K();
        if (pm8VarK == null || (um8Var = pm8VarK.u0) == null) {
            return null;
        }
        return um8Var.p;
    }

    public final void z0() {
        um8 um8Var = this.f;
        pm8.j0(um8Var.a, false, 7);
        pm8 pm8Var = um8Var.a;
        pm8 pm8VarK = pm8Var.K();
        if (pm8VarK == null || pm8Var.q0 != pm8.f.c) {
            return;
        }
        int iOrdinal = pm8VarK.u0.d.ordinal();
        pm8Var.q0 = iOrdinal != 0 ? iOrdinal != 2 ? pm8VarK.q0 : pm8.f.b : pm8.f.a;
    }
}
