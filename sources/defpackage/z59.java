package defpackage;

import androidx.compose.ui.layout.w;
import defpackage.j4a;
import defpackage.pe7;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class z59 extends w implements vf9, g20, uz9 {
    public boolean V;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public iq2 c0;
    public Function1<? super cd6, j6g> e0;
    public final um8 f;
    public xc6 f0;
    public boolean k0;
    public Object m0;
    public boolean n0;
    public int W = Integer.MAX_VALUE;
    public int X = Integer.MAX_VALUE;
    public pm8.f Y = pm8.f.c;
    public long d0 = 0;
    public a g0 = a.c;
    public final v59 h0 = new v59(this);
    public final j4a<z59> i0 = new j4a<>(new z59[16]);
    public boolean j0 = true;
    public boolean l0 = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("IsPlacedInLookahead", 0);
            a = aVar;
            a aVar2 = new a("IsPlacedInApproach", 1);
            b = aVar2;
            a aVar3 = new a("IsNotPlaced", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public static final class b extends mj8 implements gu5<j6g> {
        final /* synthetic */ x59 $lookaheadDelegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x59 x59Var) {
            super(0);
            this.$lookaheadDelegate = x59Var;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            um8 um8Var = z59.this.f;
            um8Var.h = 0;
            j4a<pm8> j4aVarN = um8Var.a.N();
            pm8[] pm8VarArr = j4aVarN.a;
            int i = j4aVarN.c;
            for (int i2 = 0; i2 < i; i2++) {
                z59 z59Var = pm8VarArr[i2].u0.q;
                z59Var.getClass();
                z59Var.W = z59Var.X;
                z59Var.X = Integer.MAX_VALUE;
                if (z59Var.Y == pm8.f.b) {
                    z59Var.Y = pm8.f.c;
                }
            }
            z59.this.X(a69.a);
            pe7.a aVar = z59.this.M().K0;
            if (aVar != null) {
                boolean z = aVar.Z;
                List<pm8> listD = z59.this.f.a.D();
                int size = listD.size();
                for (int i3 = 0; i3 < size; i3++) {
                    x59 x59VarD1 = ((pm8) ((j4a.a) listD).get(i3)).t0.d.d1();
                    if (x59VarD1 != null) {
                        x59VarD1.Z = z;
                    }
                }
            }
            this.$lookaheadDelegate.G0().j();
            if (z59.this.M().K0 != null) {
                List<pm8> listD2 = z59.this.f.a.D();
                int size2 = listD2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    x59 x59VarD12 = ((pm8) ((j4a.a) listD2).get(i4)).t0.d.d1();
                    if (x59VarD12 != null) {
                        x59VarD12.Z = false;
                    }
                }
            }
            j4a<pm8> j4aVarN2 = z59.this.f.a.N();
            pm8[] pm8VarArr2 = j4aVarN2.a;
            int i5 = j4aVarN2.c;
            for (int i6 = 0; i6 < i5; i6++) {
                z59 z59Var2 = pm8VarArr2[i6].u0.q;
                z59Var2.getClass();
                int i7 = z59Var2.W;
                int i8 = z59Var2.X;
                if (i7 != i8 && i8 == Integer.MAX_VALUE) {
                    z59Var2.n0(true);
                }
            }
            z59.this.X(b69.a);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<g20, j6g> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(g20 g20Var) {
            g20Var.r().c = false;
            return j6g.a;
        }
    }

    public z59(um8 um8Var) {
        this.f = um8Var;
        this.m0 = um8Var.p.h0;
    }

    @Override // defpackage.uz9
    public final void C(boolean z) {
        x59 x59VarD1;
        um8 um8Var = this.f;
        x59 x59VarD12 = um8Var.a().d1();
        if (Boolean.valueOf(z).equals(x59VarD12 != null ? Boolean.valueOf(x59VarD12.X) : null) || (x59VarD1 = um8Var.a().d1()) == null) {
            return;
        }
        x59VarD1.X = z;
    }

    @Override // defpackage.g20
    public final void E() {
        this.k0 = true;
        v59 v59Var = this.h0;
        v59Var.i();
        um8 um8Var = this.f;
        boolean z = um8Var.f;
        pm8 pm8Var = um8Var.a;
        if (z) {
            j4a<pm8> j4aVarN = pm8Var.N();
            pm8[] pm8VarArr = j4aVarN.a;
            int i = j4aVarN.c;
            for (int i2 = 0; i2 < i; i2++) {
                pm8 pm8Var2 = pm8VarArr[i2];
                um8 um8Var2 = pm8Var2.u0;
                if (um8Var2.e && pm8Var2.I() == pm8.f.a) {
                    z59 z59Var = um8Var2.q;
                    z59Var.getClass();
                    z59 z59Var2 = um8Var2.q;
                    iq2 iq2Var = z59Var2 != null ? z59Var2.c0 : null;
                    iq2Var.getClass();
                    if (z59Var.G0(iq2Var.a)) {
                        pm8.h0(pm8Var, false, 7);
                    }
                }
            }
        }
        pe7.a aVar = M().K0;
        aVar.getClass();
        if (um8Var.g || (!this.Z && !aVar.Z && um8Var.f)) {
            um8Var.f = false;
            pm8.d dVar = um8Var.d;
            um8Var.d = pm8.d.d;
            rxa rxaVarA = tm8.a(pm8Var);
            um8Var.i(false);
            vxa snapshotObserver = rxaVarA.getSnapshotObserver();
            b bVar = new b(aVar);
            snapshotObserver.getClass();
            if (pm8Var.V != null) {
                snapshotObserver.a(pm8Var, snapshotObserver.h, bVar);
            } else {
                snapshotObserver.a(pm8Var, snapshotObserver.e, bVar);
            }
            um8Var.d = dVar;
            if (um8Var.m && aVar.Z) {
                requestLayout();
            }
            um8Var.g = false;
        }
        if (v59Var.d) {
            v59Var.e = true;
        }
        if (v59Var.b && v59Var.f()) {
            v59Var.h();
        }
        this.k0 = false;
    }

    public final void F0(long j, Function1 function1, xc6 xc6Var) throws Throwable {
        um8 um8Var = this.f;
        pm8 pm8Var = um8Var.a;
        pm8 pm8Var2 = um8Var.a;
        try {
            pm8 pm8VarK = pm8Var.K();
            pm8.d dVar = pm8VarK != null ? pm8VarK.u0.d : null;
            pm8.d dVar2 = pm8.d.d;
            if (dVar == dVar2) {
                um8Var.c = false;
            }
            if (pm8Var2.E0) {
                ae7.a("place is called on a deactivated node");
            }
            um8Var.d = dVar2;
            this.a0 = true;
            this.n0 = false;
            if (!lh7.b(j, this.d0)) {
                if (um8Var.n || um8Var.m) {
                    um8Var.f = true;
                }
                u0();
            }
            rxa rxaVarA = tm8.a(pm8Var2);
            if (um8Var.f || !k()) {
                um8Var.h(false);
                this.h0.g = false;
                vxa snapshotObserver = rxaVarA.getSnapshotObserver();
                d69 d69Var = new d69(this, rxaVarA, j);
                snapshotObserver.getClass();
                if (pm8Var2.V != null) {
                    snapshotObserver.a(pm8Var2, snapshotObserver.g, d69Var);
                } else {
                    snapshotObserver.a(pm8Var2, snapshotObserver.f, d69Var);
                }
            } else {
                x59 x59VarD1 = um8Var.a().d1();
                x59VarD1.getClass();
                x59VarD1.T0(lh7.d(j, x59VarD1.e));
                z0();
            }
            this.d0 = j;
            this.e0 = function1;
            this.f0 = xc6Var;
            um8Var.d = pm8.d.e;
            j6g j6gVar = j6g.a;
        } catch (Throwable th) {
            pm8Var.m0(th);
            throw null;
        }
    }

    public final boolean G0(long j) throws Throwable {
        um8 um8Var = this.f;
        pm8 pm8Var = um8Var.a;
        pm8 pm8Var2 = um8Var.a;
        try {
            if (pm8Var.E0) {
                ae7.a("measure is called on a deactivated node");
            }
            pm8 pm8VarK = pm8Var2.K();
            pm8Var2.s0 = pm8Var2.s0 || (pm8VarK != null && pm8VarK.s0);
            if (!pm8Var2.u0.e) {
                iq2 iq2Var = this.c0;
                if (iq2Var == null ? false : iq2.b(iq2Var.a, j)) {
                    rxa rxaVar = pm8Var2.b0;
                    if (rxaVar != null) {
                        rxaVar.k(pm8Var2, true);
                    }
                    pm8Var2.l0();
                    return false;
                }
            }
            this.c0 = new iq2(j);
            l0(j);
            this.h0.f = false;
            X(c.a);
            long j2 = this.b0 ? this.c : -9223372034707292160L;
            this.b0 = true;
            x59 x59VarD1 = um8Var.a().d1();
            if (!(x59VarD1 != null)) {
                ae7.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            um8Var.c(j);
            j0((((long) x59VarD1.a) << 32) | (((long) x59VarD1.b) & 4294967295L));
            return (((int) (j2 >> 32)) == x59VarD1.a && ((int) (j2 & 4294967295L)) == x59VarD1.b) ? false : true;
        } catch (Throwable th) {
            pm8Var.m0(th);
            throw null;
        }
    }

    @Override // defpackage.pl7
    public final int K(int i) {
        v0();
        x59 x59VarD1 = this.f.a().d1();
        x59VarD1.getClass();
        return x59VarD1.K(i);
    }

    @Override // defpackage.g20
    public final pe7 M() {
        return this.f.a.t0.c;
    }

    @Override // defpackage.pl7
    public final int O(int i) {
        v0();
        x59 x59VarD1 = this.f.a().d1();
        x59VarD1.getClass();
        return x59VarD1.O(i);
    }

    @Override // defpackage.pl7
    public final int P(int i) {
        v0();
        x59 x59VarD1 = this.f.a().d1();
        x59VarD1.getClass();
        return x59VarD1.P(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // defpackage.vf9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.layout.w R(long r7) {
        /*
            r6 = this;
            um8 r0 = r6.f
            pm8 r1 = r0.a
            pm8 r2 = r0.a
            pm8 r1 = r1.K()
            r3 = 0
            if (r1 == 0) goto L12
            um8 r1 = r1.u0
            pm8$d r1 = r1.d
            goto L13
        L12:
            r1 = r3
        L13:
            pm8$d r4 = pm8.d.b
            if (r1 == r4) goto L27
            pm8 r1 = r2.K()
            if (r1 == 0) goto L22
            um8 r1 = r1.u0
            pm8$d r1 = r1.d
            goto L23
        L22:
            r1 = r3
        L23:
            pm8$d r4 = pm8.d.d
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.b = r1
        L2a:
            pm8 r0 = r2.K()
            pm8$f r1 = pm8.f.c
            if (r0 == 0) goto L64
            um8 r0 = r0.u0
            pm8$f r4 = r6.Y
            if (r4 == r1) goto L42
            boolean r4 = r2.s0
            if (r4 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r4 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.ae7.b(r4)
        L42:
            pm8$d r4 = r0.d
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5f
            r5 = 1
            if (r4 == r5) goto L5f
            r5 = 2
            if (r4 == r5) goto L5c
            r5 = 3
            if (r4 != r5) goto L54
            goto L5c
        L54:
            java.lang.String r6 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            pm8$d r7 = r0.d
            defpackage.o6.k(r7, r6)
            return r3
        L5c:
            pm8$f r0 = pm8.f.b
            goto L61
        L5f:
            pm8$f r0 = pm8.f.a
        L61:
            r6.Y = r0
            goto L66
        L64:
            r6.Y = r1
        L66:
            pm8$f r0 = r2.q0
            if (r0 != r1) goto L6d
            r2.v()
        L6d:
            r6.G0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z59.R(long):androidx.compose.ui.layout.w");
    }

    @Override // defpackage.gg9
    public final int V(d20 d20Var) {
        um8 um8Var = this.f;
        pm8 pm8VarK = um8Var.a.K();
        pm8.d dVar = pm8VarK != null ? pm8VarK.u0.d : null;
        pm8.d dVar2 = pm8.d.b;
        v59 v59Var = this.h0;
        if (dVar == dVar2) {
            v59Var.c = true;
        } else {
            pm8 pm8VarK2 = um8Var.a.K();
            if ((pm8VarK2 != null ? pm8VarK2.u0.d : null) == pm8.d.d) {
                v59Var.d = true;
            }
        }
        this.Z = true;
        x59 x59VarD1 = um8Var.a().d1();
        x59VarD1.getClass();
        int iV = x59VarD1.V(d20Var);
        this.Z = false;
        return iV;
    }

    @Override // defpackage.g20
    public final void X(Function1<? super g20, j6g> function1) {
        j4a<pm8> j4aVarN = this.f.a.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            z59 z59Var = pm8VarArr[i2].u0.q;
            z59Var.getClass();
            function1.invoke(z59Var);
        }
    }

    @Override // defpackage.g20
    public final void b0() {
        pm8.h0(this.f.a, false, 7);
    }

    @Override // androidx.compose.ui.layout.w
    public final int c0() {
        x59 x59VarD1 = this.f.a().d1();
        x59VarD1.getClass();
        return x59VarD1.c0();
    }

    @Override // androidx.compose.ui.layout.w
    public final int e0() {
        x59 x59VarD1 = this.f.a().d1();
        x59VarD1.getClass();
        return x59VarD1.e0();
    }

    @Override // defpackage.gg9, defpackage.pl7
    public final Object g() {
        return this.m0;
    }

    @Override // androidx.compose.ui.layout.w
    public final void g0(long j, float f, xc6 xc6Var) throws Throwable {
        F0(j, null, xc6Var);
    }

    @Override // androidx.compose.ui.layout.w
    public final void h0(long j, float f, Function1<? super cd6, j6g> function1) throws Throwable {
        F0(j, function1, null);
    }

    @Override // defpackage.g20
    public final boolean k() {
        return this.g0 != a.c;
    }

    public final void n0(boolean z) {
        um8 um8Var = this.f;
        if (z && um8Var.c) {
            return;
        }
        if (z || um8Var.c) {
            this.g0 = a.c;
            j4a<pm8> j4aVarN = um8Var.a.N();
            pm8[] pm8VarArr = j4aVarN.a;
            int i = j4aVarN.c;
            for (int i2 = 0; i2 < i; i2++) {
                z59 z59Var = pm8VarArr[i2].u0.q;
                z59Var.getClass();
                z59Var.n0(true);
            }
        }
    }

    @Override // defpackage.g20
    public final f20 r() {
        return this.h0;
    }

    @Override // defpackage.g20
    public final void requestLayout() {
        pm8 pm8Var = this.f.a;
        pm8.c cVar = pm8.F0;
        pm8Var.g0(false);
    }

    public final void s0() {
        a aVar = this.g0;
        um8 um8Var = this.f;
        boolean z = um8Var.c;
        pm8 pm8Var = um8Var.a;
        a aVar2 = a.a;
        if (z) {
            this.g0 = a.b;
        } else {
            this.g0 = aVar2;
        }
        if (aVar != aVar2 && um8Var.e) {
            pm8.h0(pm8Var, true, 6);
        }
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var2 = pm8VarArr[i2];
            z59 z59Var = pm8Var2.u0.q;
            if (z59Var == null) {
                l5.q("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (z59Var.X != Integer.MAX_VALUE) {
                z59Var.s0();
                pm8.k0(pm8Var2);
            }
        }
    }

    public final void u0() {
        um8 um8Var = this.f;
        if (um8Var.o > 0) {
            j4a<pm8> j4aVarN = um8Var.a.N();
            pm8[] pm8VarArr = j4aVarN.a;
            int i = j4aVarN.c;
            for (int i2 = 0; i2 < i; i2++) {
                pm8 pm8Var = pm8VarArr[i2];
                um8 um8Var2 = pm8Var.u0;
                if ((um8Var2.m || um8Var2.n) && !um8Var2.f) {
                    pm8Var.g0(false);
                }
                z59 z59Var = um8Var2.q;
                if (z59Var != null) {
                    z59Var.u0();
                }
            }
        }
    }

    public final void v0() {
        um8 um8Var = this.f;
        pm8.h0(um8Var.a, false, 7);
        pm8 pm8Var = um8Var.a;
        pm8 pm8VarK = pm8Var.K();
        if (pm8VarK == null || pm8Var.q0 != pm8.f.c) {
            return;
        }
        int iOrdinal = pm8VarK.u0.d.ordinal();
        pm8Var.q0 = iOrdinal != 0 ? iOrdinal != 2 ? pm8VarK.q0 : pm8.f.b : pm8.f.a;
    }

    @Override // defpackage.pl7
    public final int w(int i) {
        v0();
        x59 x59VarD1 = this.f.a().d1();
        x59VarD1.getClass();
        return x59VarD1.w(i);
    }

    @Override // defpackage.g20
    public final g20 z() {
        um8 um8Var;
        pm8 pm8VarK = this.f.a.K();
        if (pm8VarK == null || (um8Var = pm8VarK.u0) == null) {
            return null;
        }
        return um8Var.q;
    }

    public final void z0() {
        pm8.d dVar;
        this.n0 = true;
        um8 um8Var = this.f;
        pm8 pm8VarK = um8Var.a.K();
        a aVar = this.g0;
        if ((aVar != a.a && !um8Var.c) || (aVar != a.b && um8Var.c)) {
            s0();
            if (this.V && pm8VarK != null) {
                pm8VarK.g0(false);
            }
        }
        if (pm8VarK != null) {
            um8 um8Var2 = pm8VarK.u0;
            if (!this.V && ((dVar = um8Var2.d) == pm8.d.c || dVar == pm8.d.d)) {
                if (this.X != Integer.MAX_VALUE) {
                    ae7.b("Place was called on a node which was placed already");
                }
                int i = um8Var2.h;
                this.X = i;
                um8Var2.h = i + 1;
            }
        } else {
            this.X = 0;
        }
        E();
    }
}
