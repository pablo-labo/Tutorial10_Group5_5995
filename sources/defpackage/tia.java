package defpackage;

import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.wle;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class tia extends w59 implements vf9, sl8, sxa {
    public static final d C0 = d.a;
    public static final c D0 = c.a;
    public static final pad E0;
    public static final jl8 F0;
    public static final float[] G0;
    public static final a H0;
    public static final b I0;
    public qxa A0;
    public xc6 B0;
    public final pm8 e0;
    public boolean f0;
    public boolean g0;
    public tia h0;
    public tia i0;
    public boolean j0;
    public boolean k0;
    public Function1<? super cd6, j6g> l0;
    public iy3 m0;
    public vl8 n0;
    public bg9 p0;
    public o3a<d20> q0;
    public float s0;
    public y3a t0;
    public jl8 u0;
    public xc6 v0;
    public ww1 w0;
    public uia x0;
    public boolean z0;
    public float o0 = 0.8f;
    public long r0 = 0;
    public final f y0 = new f();

    public static final class a implements e {
        @Override // tia.e
        public final int a() {
            return 16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3, types: [j4a] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6, types: [j4a] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.ui.e$c] */
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
        @Override // tia.e
        public final boolean b(e.c cVar) {
            ?? j4aVar = 0;
            while (true) {
                int i = 0;
                if (cVar == 0) {
                    return false;
                }
                if (cVar instanceof dfb) {
                    ((dfb) cVar).f0();
                } else if ((cVar.c & 16) != 0 && (cVar instanceof zs3)) {
                    e.c cVar2 = ((zs3) cVar).e0;
                    j4aVar = j4aVar;
                    cVar = cVar;
                    while (cVar2 != null) {
                        if ((cVar2.c & 16) != 0) {
                            i++;
                            j4aVar = j4aVar;
                            if (i == 1) {
                                cVar = cVar2;
                            } else {
                                if (j4aVar == 0) {
                                    j4aVar = new j4a(new e.c[16]);
                                }
                                if (cVar != 0) {
                                    j4aVar.b(cVar);
                                    cVar = 0;
                                }
                                j4aVar.b(cVar2);
                            }
                        }
                        cVar2 = cVar2.f;
                        j4aVar = j4aVar;
                        cVar = cVar;
                    }
                    if (i == 1) {
                    }
                }
                cVar = us3.b(j4aVar);
            }
        }

        @Override // tia.e
        public final void c(pm8 pm8Var, long j, qi6 qi6Var, int i, boolean z) {
            pm8Var.O(j, qi6Var, i, z);
        }

        @Override // tia.e
        public final boolean d(pm8 pm8Var) {
            return true;
        }
    }

    public static final class b implements e {
        @Override // tia.e
        public final int a() {
            return 8;
        }

        @Override // tia.e
        public final boolean b(e.c cVar) {
            return false;
        }

        @Override // tia.e
        public final void c(pm8 pm8Var, long j, qi6 qi6Var, int i, boolean z) {
            ria riaVar = pm8Var.t0;
            tia tiaVar = riaVar.d;
            d dVar = tia.C0;
            riaVar.d.A1(tia.I0, tiaVar.c1(j), qi6Var, 1, z);
        }

        @Override // tia.e
        public final boolean d(pm8 pm8Var) {
            w4e w4eVarG = pm8Var.g();
            boolean z = false;
            if (w4eVarG != null && w4eVarG.d) {
                z = true;
            }
            return !z;
        }
    }

    public static final class c extends mj8 implements Function1<tia, j6g> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(tia tiaVar) {
            qxa qxaVar = tiaVar.A0;
            if (qxaVar != null) {
                qxaVar.invalidate();
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function1<tia, j6g> {
        public static final d a = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(tia tiaVar) {
            tia tiaVar2 = tiaVar;
            if (tiaVar2.W0() && tiaVar2.c2(true)) {
                pm8 pm8Var = tiaVar2.e0;
                um8 um8Var = pm8Var.u0;
                if (um8Var.l > 0) {
                    if (um8Var.k || um8Var.j) {
                        pm8Var.i0(false);
                    }
                    um8Var.p.v0();
                }
                pm8Var.T();
                rxa rxaVarA = tm8.a(pm8Var);
                rxaVarA.getRectManager().e(pm8Var);
                if (pm8Var.D0 > 0) {
                    rxaVarA.j(pm8Var);
                }
            }
            return j6g.a;
        }
    }

    public interface e {
        int a();

        boolean b(e.c cVar);

        void c(pm8 pm8Var, long j, qi6 qi6Var, int i, boolean z);

        boolean d(pm8 pm8Var);
    }

    public static final class f extends mj8 implements gu5<j6g> {
        public f() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            tia tiaVar = tia.this.i0;
            if (tiaVar != null) {
                tiaVar.G1();
            }
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements gu5<j6g> {
        final /* synthetic */ float $distanceFromEdge;
        final /* synthetic */ qi6 $hitTestResult;
        final /* synthetic */ e $hitTestSource;
        final /* synthetic */ boolean $isHitInMinimumTouchTargetBetter;
        final /* synthetic */ boolean $isInLayer;
        final /* synthetic */ long $pointerPosition;
        final /* synthetic */ int $pointerType;
        final /* synthetic */ e.c $this_outOfBoundsHit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e.c cVar, e eVar, long j, qi6 qi6Var, int i, boolean z, float f, boolean z2) {
            super(0);
            this.$this_outOfBoundsHit = cVar;
            this.$hitTestSource = eVar;
            this.$pointerPosition = j;
            this.$hitTestResult = qi6Var;
            this.$pointerType = i;
            this.$isInLayer = z;
            this.$distanceFromEdge = f;
            this.$isHitInMinimumTouchTargetBetter = z2;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            tia tiaVar = tia.this;
            e.c cVarA = xia.a(this.$this_outOfBoundsHit, this.$hitTestSource.a());
            e eVar = this.$hitTestSource;
            long j = this.$pointerPosition;
            qi6 qi6Var = this.$hitTestResult;
            int i = this.$pointerType;
            boolean z = this.$isInLayer;
            float f = this.$distanceFromEdge;
            boolean z2 = this.$isHitInMinimumTouchTargetBetter;
            d dVar = tia.C0;
            tiaVar.R1(cVarA, eVar, j, qi6Var, i, z, f, z2);
            return j6g.a;
        }
    }

    public static final class h extends mj8 implements gu5<j6g> {
        final /* synthetic */ Function1<cd6, j6g> $layerBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function1<? super cd6, j6g> function1) {
            super(0);
            this.$layerBlock = function1;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            Function1<cd6, j6g> function1 = this.$layerBlock;
            pad padVar = tia.E0;
            function1.invoke(padVar);
            padVar.h0 = padVar.b0.a(padVar.d0, padVar.f0, padVar.e0);
            return j6g.a;
        }
    }

    static {
        pad padVar = new pad();
        padVar.b = 1.0f;
        padVar.c = 1.0f;
        padVar.d = 1.0f;
        long j = dd6.a;
        padVar.W = j;
        padVar.X = j;
        padVar.Z = 8.0f;
        padVar.a0 = mrf.b;
        padVar.b0 = ytc.a;
        padVar.d0 = 9205357640488583168L;
        padVar.e0 = q92.b();
        padVar.f0 = vl8.a;
        padVar.g0 = 3;
        E0 = padVar;
        F0 = new jl8();
        G0 = if9.a();
        H0 = new a();
        I0 = new b();
    }

    public tia(pm8 pm8Var) {
        this.e0 = pm8Var;
        this.m0 = pm8Var.m0;
        this.n0 = pm8Var.n0;
    }

    public static tia X1(sl8 sl8Var) {
        tia tiaVar;
        y59 y59Var = sl8Var instanceof y59 ? (y59) sl8Var : null;
        if (y59Var != null && (tiaVar = y59Var.a.e0) != null) {
            return tiaVar;
        }
        sl8Var.getClass();
        return (tia) sl8Var;
    }

    @Override // defpackage.sl8
    public final void A(sl8 sl8Var, float[] fArr) {
        tia tiaVarX1 = X1(sl8Var);
        tiaVarX1.L1();
        tia tiaVarB1 = b1(tiaVarX1);
        if9.d(fArr);
        tiaVarX1.a2(tiaVarB1, fArr);
        Z1(tiaVarB1, fArr);
    }

    public final void A1(e eVar, long j, qi6 qi6Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        e.c cVarG1 = g1(eVar.a());
        if (!d2(j)) {
            if (i == 1) {
                float fT0 = T0(j, e1());
                if ((Float.floatToRawIntBits(fT0) & Integer.MAX_VALUE) < 2139095040) {
                    if (qi6Var.c != qi6Var.a.b - 1) {
                        if (w74.h(qi6Var.a(), w74.b(fT0, false, false)) <= 0) {
                            return;
                        }
                    }
                    u1(cVarG1, eVar, j, qi6Var, i, false, fT0);
                    return;
                }
                return;
            }
            return;
        }
        if (cVarG1 == null) {
            E1(eVar, j, qi6Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < e0() && fIntBitsToFloat2 < c0()) {
            j1(cVarG1, eVar, j, qi6Var, i, z);
            return;
        }
        float fT02 = i == 1 ? T0(j, e1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fT02) & Integer.MAX_VALUE) < 2139095040) {
            if (qi6Var.c != qi6Var.a.b - 1) {
                z2 = z;
                if (w74.h(qi6Var.a(), w74.b(fT02, z2, false)) > 0) {
                }
                R1(cVarG1, eVar, j, qi6Var, i, z2, fT02, z3);
            }
            z2 = z;
            z3 = true;
            R1(cVarG1, eVar, j, qi6Var, i, z2, fT02, z3);
        }
        z2 = z;
        z3 = false;
        R1(cVarG1, eVar, j, qi6Var, i, z2, fT02, z3);
    }

    @Override // defpackage.sl8
    public final long B(long j) {
        if (!f1().c0) {
            ae7.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        sl8 sl8VarM = ojh.m(this);
        return K1(sl8VarM, ooa.e(tm8.a(this.e0).t(j), sl8VarM.a0(0L)));
    }

    public void E1(e eVar, long j, qi6 qi6Var, int i, boolean z) {
        tia tiaVar = this.h0;
        if (tiaVar != null) {
            tiaVar.A1(eVar, tiaVar.c1(j), qi6Var, i, z);
        }
    }

    @Override // defpackage.w59
    public final boolean F0() {
        return this.p0 != null;
    }

    @Override // defpackage.sl8
    public final long G(sl8 sl8Var, long j) {
        return K1(sl8Var, j);
    }

    @Override // defpackage.w59
    public final bg9 G0() {
        bg9 bg9Var = this.p0;
        if (bg9Var != null) {
            return bg9Var;
        }
        r6.g("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public final void G1() {
        qxa qxaVar = this.A0;
        if (qxaVar != null) {
            qxaVar.invalidate();
            return;
        }
        tia tiaVar = this.i0;
        if (tiaVar != null) {
            tiaVar.G1();
        }
    }

    @Override // defpackage.w59
    public final w59 H0() {
        return this.i0;
    }

    @Override // defpackage.w59, defpackage.cg9
    public final pm8 H1() {
        return this.e0;
    }

    @Override // defpackage.w59
    public final long I0() {
        return this.r0;
    }

    @Override // defpackage.sl8
    public final qtc J(sl8 sl8Var, boolean z) {
        if (!f1().c0) {
            ae7.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sl8Var.d()) {
            ae7.b("LayoutCoordinates " + sl8Var + " is not attached!");
        }
        tia tiaVarX1 = X1(sl8Var);
        tiaVarX1.L1();
        tia tiaVarB1 = b1(tiaVarX1);
        y3a y3aVar = this.t0;
        if (y3aVar == null) {
            y3aVar = new y3a();
            this.t0 = y3aVar;
        }
        y3aVar.a = 0.0f;
        y3aVar.b = 0.0f;
        y3aVar.c = (int) (sl8Var.a() >> 32);
        y3aVar.d = (int) (sl8Var.a() & 4294967295L);
        while (tiaVarX1 != tiaVarB1) {
            tiaVarX1.U1(y3aVar, z, false);
            if (y3aVar.b()) {
                return qtc.e;
            }
            tiaVarX1 = tiaVarX1.i0;
            tiaVarX1.getClass();
        }
        O0(tiaVarB1, y3aVar, z);
        return new qtc(y3aVar.a, y3aVar.b, y3aVar.c, y3aVar.d);
    }

    public final boolean J1() {
        if (this.A0 != null && this.o0 <= 0.0f) {
            return true;
        }
        tia tiaVar = this.i0;
        if (tiaVar != null) {
            return tiaVar.J1();
        }
        return false;
    }

    public final long K1(sl8 sl8Var, long j) {
        if (sl8Var instanceof y59) {
            y59 y59Var = (y59) sl8Var;
            y59Var.a.e0.L1();
            return y59Var.c(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        tia tiaVarX1 = X1(sl8Var);
        tiaVarX1.L1();
        tia tiaVarB1 = b1(tiaVarX1);
        while (tiaVarX1 != tiaVarB1) {
            qxa qxaVar = tiaVarX1.A0;
            if (qxaVar != null) {
                j = qxaVar.d(j, false);
            }
            j = ak2.y(j, tiaVarX1.r0);
            tiaVarX1 = tiaVarX1.i0;
            tiaVarX1.getClass();
        }
        return P0(tiaVarB1, j);
    }

    @Override // defpackage.sl8
    public final long L(long j) {
        return tm8.a(this.e0).b(a0(j));
    }

    public final void L1() {
        this.e0.u0.b();
    }

    @Override // defpackage.sl8
    public final void N(float[] fArr) {
        rxa rxaVarA = tm8.a(this.e0);
        tia tiaVarX1 = X1(ojh.m(this));
        a2(tiaVarX1, fArr);
        if (rxaVarA instanceof kf9) {
            ((kf9) rxaVarA).i(fArr);
            return;
        }
        long jV = tiaVarX1.v(0L);
        if ((9223372034707292159L & jV) != 9205357640488583168L) {
            if9.f(fArr, Float.intBitsToFloat((int) (jV >> 32)), Float.intBitsToFloat((int) (jV & 4294967295L)));
        }
    }

    @Override // defpackage.w59
    public final void N0() {
        xc6 xc6Var = this.B0;
        long j = this.r0;
        if (xc6Var != null) {
            g0(j, this.s0, xc6Var);
        } else {
            h0(j, this.s0, this.l0);
        }
    }

    public final void O0(tia tiaVar, y3a y3aVar, boolean z) {
        if (tiaVar == this) {
            return;
        }
        tia tiaVar2 = this.i0;
        if (tiaVar2 != null) {
            tiaVar2.O0(tiaVar, y3aVar, z);
        }
        long j = this.r0;
        float f2 = (int) (j >> 32);
        y3aVar.a -= f2;
        y3aVar.c -= f2;
        float f3 = (int) (j & 4294967295L);
        y3aVar.b -= f3;
        y3aVar.d -= f3;
        qxa qxaVar = this.A0;
        if (qxaVar != null) {
            qxaVar.b(y3aVar, true);
            if (this.k0 && z) {
                long j2 = this.c;
                y3aVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [j4a] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void O1() {
        e.c cVarF1;
        boolean zG = yia.g(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        e.c cVarI1 = i1(zG);
        if (cVarI1 == null || (cVarI1.a.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            return;
        }
        wle.e.getClass();
        wle wleVarA = wle.a.a();
        Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
        wle wleVarB = wle.a.b(wleVarA);
        try {
            if (!zG) {
                cVarF1 = f1().e;
                if (cVarF1 == null) {
                }
                j6g j6gVar = j6g.a;
                wle.a.e(wleVarA, wleVarB, function1E);
            }
            cVarF1 = f1();
            for (e.c cVarI12 = i1(zG); cVarI12 != null && (cVarI12.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0; cVarI12 = cVarI12.f) {
                if ((cVarI12.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                    ?? B = cVarI12;
                    ?? j4aVar = 0;
                    while (B != 0) {
                        if (B instanceof ql8) {
                            ((ql8) B).G(this.c);
                        } else if ((B.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 && (B instanceof zs3)) {
                            e.c cVar = ((zs3) B).e0;
                            int i = 0;
                            B = B;
                            j4aVar = j4aVar;
                            while (cVar != null) {
                                if ((cVar.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
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
                if (cVarI12 == cVarF1) {
                    break;
                }
            }
            j6g j6gVar2 = j6g.a;
            wle.a.e(wleVarA, wleVarB, function1E);
        } catch (Throwable th) {
            wle.a.e(wleVarA, wleVarB, function1E);
            throw th;
        }
    }

    public final long P0(tia tiaVar, long j) {
        if (tiaVar == this) {
            return j;
        }
        tia tiaVar2 = this.i0;
        return (tiaVar2 == null || wl7.b(tiaVar, tiaVar2)) ? c1(j) : c1(tiaVar2.P0(tiaVar, j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void Q1() {
        boolean zG = yia.g(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        e.c cVarF1 = f1();
        if (!zG && (cVarF1 = cVarF1.e) == null) {
            return;
        }
        for (e.c cVarI1 = i1(zG); cVarI1 != null && (cVarI1.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0; cVarI1 = cVarI1.f) {
            if ((cVarI1.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                ?? B = cVarI1;
                ?? j4aVar = 0;
                while (B != 0) {
                    if (B instanceof ql8) {
                        ((ql8) B).P0(this);
                    } else if ((B.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 && (B instanceof zs3)) {
                        e.c cVar = ((zs3) B).e0;
                        int i = 0;
                        B = B;
                        j4aVar = j4aVar;
                        while (cVar != null) {
                            if ((cVar.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
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
            if (cVarI1 == cVarF1) {
                return;
            }
        }
    }

    public final long R0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - e0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - c0();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0187 A[PHI: r3
  0x0187: PHI (r3v17 ??) = (r3v1 ??), (r3v1 ??), (r3v19 ??) binds: [B:50:0x0153, B:52:0x0157, B:66:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17, types: [j4a] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [j4a] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R1(androidx.compose.ui.e.c r18, tia.e r19, long r20, defpackage.qi6 r22, int r23, boolean r24, float r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tia.R1(androidx.compose.ui.e$c, tia$e, long, qi6, int, boolean, float, boolean):void");
    }

    public void S1(ww1 ww1Var, xc6 xc6Var) {
        tia tiaVar = this.h0;
        if (tiaVar != null) {
            tiaVar.U0(ww1Var, xc6Var);
        }
    }

    public final float T0(long j, long j2) {
        if (e0() >= Float.intBitsToFloat((int) (j2 >> 32)) && c0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jR0 = R0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - e0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - c0()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void T1(long j, float f2, Function1<? super cd6, j6g> function1, xc6 xc6Var) {
        pm8 pm8Var = this.e0;
        if (xc6Var != null) {
            if (function1 != null) {
                ae7.a("both ways to create layers shouldn't be used together");
            }
            if (this.B0 != xc6Var) {
                this.B0 = null;
                b2(false, null);
                this.B0 = xc6Var;
            }
            if (this.A0 == null) {
                rxa rxaVarA = tm8.a(pm8Var);
                uia uiaVar = this.x0;
                if (uiaVar == null) {
                    uia uiaVar2 = new uia(this, new via(this));
                    this.x0 = uiaVar2;
                    uiaVar = uiaVar2;
                }
                f fVar = this.y0;
                qxa qxaVarM = rxaVarA.m(uiaVar, fVar, xc6Var);
                qxaVarM.e(this.c);
                qxaVarM.j(j);
                this.A0 = qxaVarM;
                pm8Var.x0 = true;
                fVar.invoke();
            }
        } else {
            if (this.B0 != null) {
                this.B0 = null;
                b2(false, null);
            }
            b2(false, function1);
        }
        if (!lh7.b(this.r0, j)) {
            tm8.a(pm8Var).u(-4.0f);
            this.r0 = j;
            pm8Var.u0.p.v0();
            qxa qxaVar = this.A0;
            if (qxaVar != null) {
                qxaVar.j(j);
            } else {
                tia tiaVar = this.i0;
                if (tiaVar != null) {
                    tiaVar.G1();
                }
            }
            j4a<pm8> j4aVarN = pm8Var.N();
            pm8[] pm8VarArr = j4aVarN.a;
            int i = j4aVarN.c;
            for (int i2 = 0; i2 < i; i2++) {
                pm8VarArr[i2].T();
            }
            w59.K0(this);
            rxa rxaVar = pm8Var.b0;
            if (rxaVar != null) {
                rxaVar.n(pm8Var);
            }
        }
        this.s0 = f2;
        if (!this.Z) {
            v0(G0());
        }
        if (this == pm8Var.t0.d) {
            tm8.a(pm8Var).getRectManager().f(pm8Var, !pm8Var.u0.p.Z);
        }
    }

    @Override // defpackage.sl8
    public final sl8 U() {
        if (!f1().c0) {
            ae7.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        L1();
        return this.e0.t0.d.i0;
    }

    public final void U0(ww1 ww1Var, xc6 xc6Var) {
        qxa qxaVar = this.A0;
        if (qxaVar != null) {
            qxaVar.f(ww1Var, xc6Var);
            return;
        }
        long j = this.r0;
        float f2 = (int) (j >> 32);
        float f3 = (int) (j & 4294967295L);
        ww1Var.f(f2, f3);
        V0(ww1Var, xc6Var);
        ww1Var.f(-f2, -f3);
    }

    public final void U1(y3a y3aVar, boolean z, boolean z2) {
        qxa qxaVar = this.A0;
        if (qxaVar != null) {
            if (this.k0) {
                if (z2) {
                    long jE1 = e1();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jE1 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE1 & 4294967295L)) / 2.0f;
                    long j = this.c;
                    y3aVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.c;
                    y3aVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (y3aVar.b()) {
                    return;
                }
            }
            qxaVar.b(y3aVar, false);
        }
        long j3 = this.r0;
        float f2 = (int) (j3 >> 32);
        y3aVar.a += f2;
        y3aVar.c += f2;
        float f3 = (int) (j3 & 4294967295L);
        y3aVar.b += f3;
        y3aVar.d += f3;
    }

    public final void V0(ww1 ww1Var, xc6 xc6Var) {
        tia tiaVar;
        ww1 ww1Var2;
        xc6 xc6Var2;
        e.c cVarG1 = g1(4);
        if (cVarG1 == null) {
            S1(ww1Var, xc6Var);
            return;
        }
        pm8 pm8Var = this.e0;
        pm8Var.getClass();
        sm8 sharedDrawScope = tm8.a(pm8Var).getSharedDrawScope();
        long jY = hh1.Y(this.c);
        sharedDrawScope.getClass();
        j4a j4aVar = null;
        while (cVarG1 != null) {
            if (cVarG1 instanceof eb4) {
                tiaVar = this;
                ww1Var2 = ww1Var;
                xc6Var2 = xc6Var;
                sharedDrawScope.d(ww1Var2, jY, tiaVar, (eb4) cVarG1, xc6Var2);
            } else {
                tiaVar = this;
                ww1Var2 = ww1Var;
                xc6Var2 = xc6Var;
                if ((cVarG1.c & 4) != 0 && (cVarG1 instanceof zs3)) {
                    int i = 0;
                    for (e.c cVar = ((zs3) cVarG1).e0; cVar != null; cVar = cVar.f) {
                        if ((cVar.c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                cVarG1 = cVar;
                            } else {
                                if (j4aVar == null) {
                                    j4aVar = new j4a(new e.c[16]);
                                }
                                if (cVarG1 != null) {
                                    j4aVar.b(cVarG1);
                                    cVarG1 = null;
                                }
                                j4aVar.b(cVar);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                ww1Var = ww1Var2;
                this = tiaVar;
                xc6Var = xc6Var2;
            }
            cVarG1 = us3.b(j4aVar);
            ww1Var = ww1Var2;
            this = tiaVar;
            xc6Var = xc6Var2;
        }
    }

    public final void V1() {
        if (this.A0 != null) {
            if (this.B0 != null) {
                this.B0 = null;
            }
            b2(false, null);
            this.e0.i0(false);
        }
    }

    @Override // defpackage.sxa
    public final boolean W0() {
        return (this.A0 == null || this.j0 || !this.e0.d()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [j4a] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [j4a] */
    public final void W1(bg9 bg9Var) {
        tia tiaVar;
        bg9 bg9Var2 = this.p0;
        if (bg9Var != bg9Var2) {
            this.p0 = bg9Var;
            pm8 pm8Var = this.e0;
            int i = 0;
            if (bg9Var2 == null || bg9Var.getWidth() != bg9Var2.getWidth() || bg9Var.getHeight() != bg9Var2.getHeight()) {
                int width = bg9Var.getWidth();
                int height = bg9Var.getHeight();
                qxa qxaVar = this.A0;
                if (qxaVar != null) {
                    qxaVar.e((((long) width) << 32) | (((long) height) & 4294967295L));
                } else if (pm8Var.k() && (tiaVar = this.i0) != null) {
                    tiaVar.G1();
                }
                j0((((long) height) & 4294967295L) | (((long) width) << 32));
                if (this.l0 != null) {
                    c2(false);
                }
                boolean zG = yia.g(4);
                e.c cVarF1 = f1();
                if (zG || (cVarF1 = cVarF1.e) != null) {
                    for (e.c cVarI1 = i1(zG); cVarI1 != null && (cVarI1.d & 4) != 0; cVarI1 = cVarI1.f) {
                        if ((cVarI1.c & 4) != 0) {
                            ?? B = cVarI1;
                            ?? j4aVar = 0;
                            while (B != 0) {
                                if (B instanceof eb4) {
                                    ((eb4) B).i1();
                                } else if ((B.c & 4) != 0 && (B instanceof zs3)) {
                                    e.c cVar = ((zs3) B).e0;
                                    int i2 = 0;
                                    B = B;
                                    j4aVar = j4aVar;
                                    while (cVar != null) {
                                        if ((cVar.c & 4) != 0) {
                                            i2++;
                                            j4aVar = j4aVar;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                B = us3.b(j4aVar);
                            }
                        }
                        if (cVarI1 == cVarF1) {
                            break;
                        }
                    }
                }
                rxa rxaVar = pm8Var.b0;
                if (rxaVar != null) {
                    rxaVar.n(pm8Var);
                }
            }
            o3a<d20> o3aVar = this.q0;
            if ((o3aVar == null || o3aVar.e == 0) && bg9Var.r().isEmpty()) {
                return;
            }
            o3a<d20> o3aVar2 = this.q0;
            Map<d20, Integer> mapR = bg9Var.r();
            if (o3aVar2 != null && o3aVar2.e == mapR.size()) {
                Object[] objArr = o3aVar2.b;
                int[] iArr = o3aVar2.c;
                long[] jArr = o3aVar2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = mapR.get((d20) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            pm8Var.u0.p.n0.g();
            o3a<d20> o3aVarA = this.q0;
            if (o3aVarA == null) {
                o3aVarA = mna.a();
                this.q0 = o3aVarA;
            }
            o3aVarA.a();
            for (Map.Entry<d20, Integer> entry : bg9Var.r().entrySet()) {
                o3aVarA.h(entry.getValue().intValue(), entry.getKey());
            }
        }
    }

    public final qtc Y1() {
        if (f1().c0) {
            sl8 sl8VarM = ojh.m(this);
            y3a y3aVar = this.t0;
            if (y3aVar == null) {
                y3aVar = new y3a();
                this.t0 = y3aVar;
            }
            long jR0 = R0(e1());
            int i = (int) (jR0 >> 32);
            y3aVar.a = -Float.intBitsToFloat(i);
            int i2 = (int) (jR0 & 4294967295L);
            y3aVar.b = -Float.intBitsToFloat(i2);
            y3aVar.c = Float.intBitsToFloat(i) + e0();
            y3aVar.d = Float.intBitsToFloat(i2) + c0();
            while (this != sl8VarM) {
                this.U1(y3aVar, false, true);
                if (!y3aVar.b()) {
                    this = this.i0;
                    this.getClass();
                }
            }
            return new qtc(y3aVar.a, y3aVar.b, y3aVar.c, y3aVar.d);
        }
        return qtc.e;
    }

    public abstract void Z0();

    public final void Z1(tia tiaVar, float[] fArr) {
        if (wl7.b(tiaVar, this)) {
            return;
        }
        tia tiaVar2 = this.i0;
        tiaVar2.getClass();
        tiaVar2.Z1(tiaVar, fArr);
        if (!lh7.b(this.r0, 0L)) {
            float[] fArr2 = G0;
            if9.d(fArr2);
            long j = this.r0;
            if9.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            if9.e(fArr, fArr2);
        }
        qxa qxaVar = this.A0;
        if (qxaVar != null) {
            qxaVar.h(fArr);
        }
    }

    @Override // defpackage.sl8
    public final long a() {
        return this.c;
    }

    @Override // defpackage.sl8
    public final long a0(long j) {
        if (!f1().c0) {
            ae7.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        L1();
        while (this != null) {
            qxa qxaVar = this.A0;
            if (qxaVar != null) {
                j = qxaVar.d(j, false);
            }
            j = ak2.y(j, this.r0);
            this = this.i0;
        }
        return j;
    }

    @Override // defpackage.w59
    public final sl8 a1() {
        return this;
    }

    public final void a2(tia tiaVar, float[] fArr) {
        while (!this.equals(tiaVar)) {
            qxa qxaVar = this.A0;
            if (qxaVar != null) {
                qxaVar.a(fArr);
            }
            if (!lh7.b(this.r0, 0L)) {
                float[] fArr2 = G0;
                if9.d(fArr2);
                if9.f(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                if9.e(fArr, fArr2);
            }
            this = this.i0;
            this.getClass();
        }
    }

    public final tia b1(tia tiaVar) {
        pm8 pm8VarK = tiaVar.e0;
        pm8 pm8Var = this.e0;
        if (pm8VarK == pm8Var) {
            e.c cVarF1 = tiaVar.f1();
            e.c cVarF12 = f1();
            if (!cVarF12.a.c0) {
                ae7.b("visitLocalAncestors called on an unattached node");
            }
            for (e.c cVar = cVarF12.a.e; cVar != null; cVar = cVar.e) {
                if ((cVar.c & 2) != 0 && cVar == cVarF1) {
                    return tiaVar;
                }
            }
            return this;
        }
        while (pm8VarK.d0 > pm8Var.d0) {
            pm8VarK = pm8VarK.K();
            pm8VarK.getClass();
        }
        pm8 pm8VarK2 = pm8Var;
        while (pm8VarK2.d0 > pm8VarK.d0) {
            pm8VarK2 = pm8VarK2.K();
            pm8VarK2.getClass();
        }
        while (pm8VarK != pm8VarK2) {
            pm8VarK = pm8VarK.K();
            pm8VarK2 = pm8VarK2.K();
            if (pm8VarK == null || pm8VarK2 == null) {
                l5.q("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (pm8VarK2 != pm8Var) {
            if (pm8VarK != tiaVar.e0) {
                return pm8VarK.t0.c;
            }
            return tiaVar;
        }
        return this;
    }

    public final void b2(boolean z, Function1 function1) {
        rxa rxaVar;
        if (function1 != null && this.B0 != null) {
            ae7.a("layerBlock can't be provided when explicitLayer is provided");
        }
        pm8 pm8Var = this.e0;
        boolean z2 = (!z && this.l0 == function1 && wl7.b(this.m0, pm8Var.m0) && this.n0 == pm8Var.n0) ? false : true;
        this.m0 = pm8Var.m0;
        this.n0 = pm8Var.n0;
        boolean zD = pm8Var.d();
        f fVar = this.y0;
        if (!zD || function1 == null) {
            this.l0 = null;
            qxa qxaVar = this.A0;
            if (qxaVar != null) {
                qxaVar.destroy();
                pm8Var.x0 = true;
                fVar.invoke();
                if (f1().c0 && pm8Var.k() && (rxaVar = pm8Var.b0) != null) {
                    rxaVar.n(pm8Var);
                }
            }
            this.A0 = null;
            this.z0 = false;
            return;
        }
        this.l0 = function1;
        if (this.A0 != null) {
            if (z2 && c2(true)) {
                tm8.a(pm8Var).getRectManager().e(pm8Var);
                return;
            }
            return;
        }
        rxa rxaVarA = tm8.a(pm8Var);
        uia uiaVar = this.x0;
        if (uiaVar == null) {
            uia uiaVar2 = new uia(this, new via(this));
            this.x0 = uiaVar2;
            uiaVar = uiaVar2;
        }
        qxa qxaVarM = rxaVarA.m(uiaVar, fVar, null);
        qxaVarM.e(this.c);
        qxaVarM.j(this.r0);
        this.A0 = qxaVarM;
        c2(true);
        pm8Var.x0 = true;
        fVar.invoke();
    }

    public final long c1(long j) {
        long j2 = this.r0;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32);
        qxa qxaVar = this.A0;
        return qxaVar != null ? qxaVar.d(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    public final boolean c2(boolean z) {
        rxa rxaVar;
        boolean z2 = false;
        if (this.B0 == null) {
            qxa qxaVar = this.A0;
            Function1<? super cd6, j6g> function1 = this.l0;
            if (qxaVar != null) {
                if (function1 == null) {
                    throw l6.k("updateLayerParameters requires a non-null layerBlock");
                }
                pad padVar = E0;
                padVar.m(1.0f);
                padVar.u(1.0f);
                padVar.b(1.0f);
                padVar.x(0.0f);
                padVar.e(0.0f);
                padVar.s(0.0f);
                long j = dd6.a;
                padVar.j(j);
                padVar.o(j);
                padVar.t(0.0f);
                padVar.q(8.0f);
                padVar.y0(mrf.b);
                padVar.r1(ytc.a);
                padVar.n(false);
                padVar.f(3);
                padVar.d0 = 9205357640488583168L;
                padVar.h0 = null;
                padVar.a = 0;
                pm8 pm8Var = this.e0;
                padVar.e0 = pm8Var.m0;
                padVar.f0 = pm8Var.n0;
                padVar.d0 = hh1.Y(this.c);
                tm8.a(pm8Var).getSnapshotObserver().a(this, C0, new h(function1));
                jl8 jl8Var = this.u0;
                if (jl8Var == null) {
                    jl8Var = new jl8();
                    this.u0 = jl8Var;
                }
                jl8 jl8Var2 = F0;
                jl8Var2.getClass();
                jl8Var2.a = jl8Var.a;
                jl8Var2.b = jl8Var.b;
                jl8Var2.c = jl8Var.c;
                jl8Var2.d = jl8Var.d;
                jl8Var2.e = jl8Var.e;
                jl8Var2.f = jl8Var.f;
                jl8Var2.g = jl8Var.g;
                jl8Var2.h = jl8Var.h;
                jl8Var2.i = jl8Var.i;
                jl8Var.a = padVar.b;
                jl8Var.b = padVar.c;
                jl8Var.c = padVar.e;
                jl8Var.d = padVar.f;
                jl8Var.e = 0.0f;
                jl8Var.f = 0.0f;
                jl8Var.g = padVar.Y;
                jl8Var.h = padVar.Z;
                jl8Var.i = padVar.a0;
                qxaVar.c(padVar);
                boolean z3 = this.k0;
                this.k0 = padVar.c0;
                this.o0 = padVar.d;
                if (jl8Var2.a == jl8Var.a && jl8Var2.b == jl8Var.b && jl8Var2.c == jl8Var.c && jl8Var2.d == jl8Var.d && jl8Var2.e == jl8Var.e && jl8Var2.f == jl8Var.f && jl8Var2.g == jl8Var.g && jl8Var2.h == jl8Var.h && mrf.a(jl8Var2.i, jl8Var.i)) {
                    z2 = true;
                }
                boolean z4 = !z2;
                if (z && ((!z2 || z3 != this.k0) && (rxaVar = pm8Var.b0) != null)) {
                    rxaVar.n(pm8Var);
                }
                return z4;
            }
            if (function1 != null) {
                ae7.b("null layer with a non-null layerBlock");
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.sl8
    public final boolean d() {
        return f1().c0;
    }

    public abstract x59 d1();

    public final boolean d2(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        qxa qxaVar = this.A0;
        return qxaVar == null || !this.k0 || qxaVar.g(j);
    }

    public final long e1() {
        return this.m0.I1(this.e0.o0.d());
    }

    public abstract e.c f1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.gg9, defpackage.pl7
    public final Object g() {
        pm8 pm8Var = this.e0;
        if (!pm8Var.t0.d(64)) {
            return null;
        }
        f1();
        luc lucVar = new luc();
        for (e.c cVar = pm8Var.t0.e; cVar != null; cVar = cVar.e) {
            if ((cVar.c & 64) != 0) {
                ?? B = cVar;
                ?? j4aVar = 0;
                while (B != 0) {
                    if (B instanceof c4b) {
                        lucVar.element = ((c4b) B).N(pm8Var.m0, lucVar.element);
                    } else if ((B.c & 64) != 0 && (B instanceof zs3)) {
                        e.c cVar2 = ((zs3) B).e0;
                        int i = 0;
                        B = B;
                        j4aVar = j4aVar;
                        while (cVar2 != null) {
                            if ((cVar2.c & 64) != 0) {
                                i++;
                                j4aVar = j4aVar;
                                if (i == 1) {
                                    B = cVar2;
                                } else {
                                    if (j4aVar == 0) {
                                        j4aVar = new j4a(new e.c[16]);
                                    }
                                    if (B != 0) {
                                        j4aVar.b(B);
                                        B = 0;
                                    }
                                    j4aVar.b(cVar2);
                                }
                            }
                            cVar2 = cVar2.f;
                            B = B;
                            j4aVar = j4aVar;
                        }
                        if (i == 1) {
                        }
                    }
                    B = us3.b(j4aVar);
                }
            }
        }
        return lucVar.element;
    }

    @Override // androidx.compose.ui.layout.w
    public void g0(long j, float f2, xc6 xc6Var) {
        if (!this.f0) {
            T1(j, f2, null, xc6Var);
            return;
        }
        x59 x59VarD1 = d1();
        x59VarD1.getClass();
        T1(x59VarD1.f0, f2, null, xc6Var);
    }

    public final e.c g1(int i) {
        boolean zG = yia.g(i);
        e.c cVarF1 = f1();
        if (!zG && (cVarF1 = cVarF1.e) == null) {
            return null;
        }
        for (e.c cVarI1 = i1(zG); cVarI1 != null && (cVarI1.d & i) != 0; cVarI1 = cVarI1.f) {
            if ((cVarI1.c & i) != 0) {
                return cVarI1;
            }
            if (cVarI1 == cVarF1) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.iy3
    public final float getDensity() {
        return this.e0.m0.getDensity();
    }

    @Override // defpackage.ql7
    public final vl8 getLayoutDirection() {
        return this.e0.n0;
    }

    @Override // androidx.compose.ui.layout.w
    public void h0(long j, float f2, Function1<? super cd6, j6g> function1) {
        if (!this.f0) {
            T1(j, f2, function1, null);
            return;
        }
        x59 x59VarD1 = d1();
        x59VarD1.getClass();
        T1(x59VarD1.f0, f2, function1, null);
    }

    public final e.c i1(boolean z) {
        e.c cVarF1;
        ria riaVar = this.e0.t0;
        if (riaVar.d == this) {
            return riaVar.f;
        }
        tia tiaVar = this.i0;
        if (!z) {
            if (tiaVar != null) {
                return tiaVar.f1();
            }
            return null;
        }
        if (tiaVar == null || (cVarF1 = tiaVar.f1()) == null) {
            return null;
        }
        return cVarF1.f;
    }

    public final void j1(e.c cVar, e eVar, long j, qi6 qi6Var, int i, boolean z) {
        if (cVar == null) {
            E1(eVar, j, qi6Var, i, z);
            return;
        }
        int i2 = qi6Var.c;
        p3a<Object> p3aVar = qi6Var.a;
        qi6Var.b(i2 + 1, p3aVar.b);
        qi6Var.c++;
        p3aVar.g(cVar);
        qi6Var.b.a(w74.b(-1.0f, z, false));
        j1(xia.a(cVar, eVar.a()), eVar, j, qi6Var, i, z);
        qi6Var.c = i2;
    }

    @Override // defpackage.sl8
    public final long p(long j) {
        if (!f1().c0) {
            ae7.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return K1(ojh.m(this), tm8.a(this.e0).p(j));
    }

    @Override // defpackage.iy3
    public final float p1() {
        return this.e0.m0.p1();
    }

    public final void u1(e.c cVar, e eVar, long j, qi6 qi6Var, int i, boolean z, float f2) {
        if (cVar == null) {
            E1(eVar, j, qi6Var, i, z);
            return;
        }
        int i2 = qi6Var.c;
        p3a<Object> p3aVar = qi6Var.a;
        qi6Var.b(i2 + 1, p3aVar.b);
        qi6Var.c++;
        p3aVar.g(cVar);
        qi6Var.b.a(w74.b(f2, z, false));
        R1(xia.a(cVar, eVar.a()), eVar, j, qi6Var, i, z, f2, true);
        qi6Var.c = i2;
    }

    @Override // defpackage.sl8
    public final long v(long j) {
        if (!f1().c0) {
            ae7.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return tm8.a(this.e0).v(a0(j));
    }

    @Override // defpackage.sl8
    public final sl8 y() {
        if (!f1().c0) {
            ae7.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        L1();
        return this.i0;
    }

    @Override // defpackage.w59
    public final w59 z0() {
        return this.h0;
    }
}
