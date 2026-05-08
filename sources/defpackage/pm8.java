package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.q;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.j4a;
import defpackage.pb0;
import defpackage.ria;
import defpackage.rxa;
import defpackage.sm2;
import defpackage.tia;
import defpackage.z59;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pm8 implements wk2, zzc, sxa, bm8, y4e, gl2, rxa.a {
    public static final c F0 = new c("Undefined intrinsics block and it is required");
    public static final a G0 = a.a;
    public static final b H0 = new b();
    public static final om8 I0 = new om8(0);
    public pb0.e A0;
    public pb0.f B0;
    public boolean C0;
    public int D0;
    public boolean E0;
    public pm8 V;
    public int W;
    public final z X;
    public j4a<pm8> Y;
    public boolean Z;
    public final boolean a;
    public pm8 a0;
    public int b;
    public rxa b0;
    public long c;
    public ypg c0;
    public long d;
    public int d0;
    public long e;
    public boolean e0;
    public boolean f;
    public boolean f0;
    public w4e g0;
    public boolean h0;
    public final j4a<pm8> i0;
    public boolean j0;
    public ag9 k0;
    public p24 l0;
    public iy3 m0;
    public vl8 n0;
    public opg o0;
    public sm2 p0;
    public f q0;
    public f r0;
    public boolean s0;
    public final ria t0;
    public final um8 u0;
    public j v0;
    public tia w0;
    public boolean x0;
    public androidx.compose.ui.e y0;
    public androidx.compose.ui.e z0;

    public static final class a extends mj8 implements gu5<pm8> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final pm8 invoke() {
            return new pm8(3);
        }
    }

    public static final class b implements opg {
        @Override // defpackage.opg
        public final long a() {
            return 300L;
        }

        @Override // defpackage.opg
        public final long b() {
            return 400L;
        }

        @Override // defpackage.opg
        public final long d() {
            return 0L;
        }

        @Override // defpackage.opg
        public final float f() {
            return 16.0f;
        }
    }

    public static final class c extends e {
        @Override // defpackage.ag9
        public final bg9 c(q qVar, List list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final /* synthetic */ d[] f;

        static {
            d dVar = new d("Measuring", 0);
            a = dVar;
            d dVar2 = new d("LookaheadMeasuring", 1);
            b = dVar2;
            d dVar3 = new d("LayingOut", 2);
            c = dVar3;
            d dVar4 = new d("LookaheadLayingOut", 3);
            d = dVar4;
            d dVar5 = new d("Idle", 4);
            e = dVar5;
            f = new d[]{dVar, dVar2, dVar3, dVar4, dVar5};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f.clone();
        }
    }

    public static abstract class e implements ag9 {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        @Override // defpackage.ag9
        public final int a(ql7 ql7Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.ag9
        public final int e(ql7 ql7Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.ag9
        public final int f(ql7 ql7Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.ag9
        public final int h(ql7 ql7Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final f a;
        public static final f b;
        public static final f c;
        public static final /* synthetic */ f[] d;

        static {
            f fVar = new f("InMeasureBlock", 0);
            a = fVar;
            f fVar2 = new f("InLayoutBlock", 1);
            b = fVar2;
            f fVar3 = new f("NotUsed", 2);
            c = fVar3;
            d = new f[]{fVar, fVar2, fVar3};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) d.clone();
        }
    }

    public /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public static final class h extends mj8 implements gu5<j6g> {
        public h() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            um8 um8Var = pm8.this.u0;
            um8Var.p.p0 = true;
            z59 z59Var = um8Var.q;
            if (z59Var != null) {
                z59Var.j0 = true;
            }
            return j6g.a;
        }
    }

    public pm8(int i, boolean z) {
        this.a = z;
        this.b = i;
        this.c = 9223372034707292159L;
        this.d = 0L;
        this.e = 9223372034707292159L;
        this.f = true;
        this.X = new z(new h(), new j4a(new pm8[16]));
        this.i0 = new j4a<>(new pm8[16]);
        this.j0 = true;
        this.k0 = F0;
        this.m0 = tm8.a;
        this.n0 = vl8.a;
        this.o0 = H0;
        sm2.k.getClass();
        this.p0 = sm2.a.b;
        f fVar = f.c;
        this.q0 = fVar;
        this.r0 = fVar;
        this.t0 = new ria(this);
        this.u0 = new um8(this);
        this.x0 = true;
        this.y0 = e.a.b;
    }

    private final String A(pm8 pm8Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(pm8Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(x(0));
        sb.append(" Other tree: ");
        pm8 pm8Var2 = pm8Var.a0;
        sb.append(pm8Var2 != null ? pm8Var2.x(0) : null);
        return sb.toString();
    }

    public static boolean c0(pm8 pm8Var) {
        zf9 zf9Var = pm8Var.u0.p;
        return pm8Var.b0(zf9Var.Y ? new iq2(zf9Var.d) : null);
    }

    public static void h0(pm8 pm8Var, boolean z, int i) {
        pm8 pm8VarK;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (pm8Var.V == null) {
            ae7.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        pm8Var.f = true;
        rxa rxaVar = pm8Var.b0;
        if (rxaVar == null || pm8Var.e0 || pm8Var.a) {
            return;
        }
        rxaVar.B(pm8Var, true, z, z2);
        if (z3) {
            z59 z59Var = pm8Var.u0.q;
            z59Var.getClass();
            um8 um8Var = z59Var.f;
            pm8 pm8VarK2 = um8Var.a.K();
            f fVar = um8Var.a.q0;
            if (pm8VarK2 == null || fVar == f.c) {
                return;
            }
            while (pm8VarK2.q0 == fVar && (pm8VarK = pm8VarK2.K()) != null) {
                pm8VarK2 = pm8VarK;
            }
            int iOrdinal = fVar.ordinal();
            if (iOrdinal == 0) {
                if (pm8VarK2.V != null) {
                    h0(pm8VarK2, z, 6);
                    return;
                } else {
                    j0(pm8VarK2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                r6.g("Intrinsics isn't used by the parent");
            } else if (pm8VarK2.V != null) {
                pm8VarK2.g0(z);
            } else {
                pm8VarK2.i0(z);
            }
        }
    }

    public static void j0(pm8 pm8Var, boolean z, int i) {
        rxa rxaVar;
        pm8 pm8VarK;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        pm8Var.f = true;
        if (pm8Var.e0 || pm8Var.a || (rxaVar = pm8Var.b0) == null) {
            return;
        }
        rxaVar.B(pm8Var, false, z, z2);
        if (z3) {
            um8 um8Var = pm8Var.u0.p.f;
            pm8 pm8VarK2 = um8Var.a.K();
            f fVar = um8Var.a.q0;
            if (pm8VarK2 == null || fVar == f.c) {
                return;
            }
            while (pm8VarK2.q0 == fVar && (pm8VarK = pm8VarK2.K()) != null) {
                pm8VarK2 = pm8VarK;
            }
            int iOrdinal = fVar.ordinal();
            if (iOrdinal == 0) {
                j0(pm8VarK2, z, 6);
            } else if (iOrdinal == 1) {
                pm8VarK2.i0(z);
            } else {
                r6.g("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void k0(pm8 pm8Var) {
        um8 um8Var = pm8Var.u0;
        if (g.a[um8Var.d.ordinal()] != 1) {
            o6.k(um8Var.d, "Unexpected state ");
            return;
        }
        if (um8Var.e) {
            h0(pm8Var, true, 6);
            return;
        }
        if (um8Var.f) {
            pm8Var.g0(true);
        }
        if (pm8Var.G()) {
            j0(pm8Var, true, 6);
        } else if (pm8Var.F()) {
            pm8Var.i0(true);
        }
    }

    public final List<vf9> B() {
        z59 z59Var = this.u0.q;
        z59Var.getClass();
        j4a<z59> j4aVar = z59Var.i0;
        um8 um8Var = z59Var.f;
        um8Var.a.D();
        if (!z59Var.j0) {
            return j4aVar.f();
        }
        pm8 pm8Var = um8Var.a;
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var2 = pm8VarArr[i2];
            if (j4aVar.c <= i2) {
                z59 z59Var2 = pm8Var2.u0.q;
                z59Var2.getClass();
                j4aVar.b(z59Var2);
            } else {
                z59 z59Var3 = pm8Var2.u0.q;
                z59Var3.getClass();
                z59[] z59VarArr = j4aVar.a;
                z59 z59Var4 = z59VarArr[i2];
                z59VarArr[i2] = z59Var3;
            }
        }
        j4aVar.l(((j4a.a) pm8Var.D()).a.c, j4aVar.c);
        z59Var.j0 = false;
        return j4aVar.f();
    }

    public final List<vf9> C() {
        return this.u0.p.n0();
    }

    public final List<pm8> D() {
        return N().f();
    }

    public final List<pm8> E() {
        return ((j4a) this.X.a).f();
    }

    public final boolean F() {
        return this.u0.p.l0;
    }

    public final boolean G() {
        return this.u0.p.k0;
    }

    public final f H() {
        return this.u0.p.a0;
    }

    public final f I() {
        f fVar;
        z59 z59Var = this.u0.q;
        return (z59Var == null || (fVar = z59Var.Y) == null) ? f.c : fVar;
    }

    public final p24 J() {
        p24 p24Var = this.l0;
        if (p24Var != null) {
            return p24Var;
        }
        p24 p24Var2 = new p24(this, this.k0);
        this.l0 = p24Var2;
        return p24Var2;
    }

    public final pm8 K() {
        pm8 pm8Var = this.a0;
        while (pm8Var != null && pm8Var.a) {
            pm8Var = pm8Var.a0;
        }
        return pm8Var;
    }

    public final int L() {
        return this.u0.p.X;
    }

    public final j4a<pm8> M() {
        boolean z = this.j0;
        j4a<pm8> j4aVar = this.i0;
        if (z) {
            j4aVar.g();
            j4aVar.c(j4aVar.c, N());
            Arrays.sort(j4aVar.a, 0, j4aVar.c, I0);
            this.j0 = false;
        }
        return j4aVar;
    }

    public final j4a<pm8> N() {
        p0();
        if (this.W == 0) {
            return (j4a) this.X.a;
        }
        j4a<pm8> j4aVar = this.Y;
        j4aVar.getClass();
        return j4aVar;
    }

    public final void O(long j, qi6 qi6Var, int i, boolean z) {
        ria riaVar = this.t0;
        tia tiaVar = riaVar.d;
        tia.d dVar = tia.C0;
        riaVar.d.A1(tia.H0, tiaVar.c1(j), qi6Var, i, z);
    }

    public final void P(int i, pm8 pm8Var) {
        if (pm8Var.a0 != null && pm8Var.b0 != null) {
            ae7.b(A(pm8Var));
        }
        pm8Var.a0 = this;
        z zVar = this.X;
        ((j4a) zVar.a).a(i, pm8Var);
        ((h) zVar.b).invoke();
        a0();
        if (pm8Var.a) {
            this.W++;
        }
        V();
        rxa rxaVar = this.b0;
        if (rxaVar != null) {
            pm8Var.u(rxaVar);
        }
        if (pm8Var.u0.l > 0) {
            um8 um8Var = this.u0;
            um8Var.d(um8Var.l + 1);
        }
        if (pm8Var.D0 > 0) {
            n0(this.D0 + 1);
        }
    }

    public final void Q() {
        if (this.x0) {
            ria riaVar = this.t0;
            tia tiaVar = riaVar.c;
            tia tiaVar2 = riaVar.d.i0;
            this.w0 = null;
            while (true) {
                if (wl7.b(tiaVar, tiaVar2)) {
                    break;
                }
                if ((tiaVar != null ? tiaVar.A0 : null) != null) {
                    this.w0 = tiaVar;
                    break;
                }
                tiaVar = tiaVar != null ? tiaVar.i0 : null;
            }
        }
        tia tiaVar3 = this.w0;
        if (tiaVar3 != null && tiaVar3.A0 == null) {
            throw l6.k("layer was not set");
        }
        if (tiaVar3 != null) {
            tiaVar3.G1();
            return;
        }
        pm8 pm8VarK = K();
        if (pm8VarK != null) {
            pm8VarK.Q();
        }
    }

    public final void R() {
        ria riaVar = this.t0;
        tia tiaVar = riaVar.d;
        pe7 pe7Var = riaVar.c;
        while (tiaVar != pe7Var) {
            tiaVar.getClass();
            mm8 mm8Var = (mm8) tiaVar;
            qxa qxaVar = mm8Var.A0;
            if (qxaVar != null) {
                qxaVar.invalidate();
            }
            tiaVar = mm8Var.h0;
        }
        qxa qxaVar2 = riaVar.c.A0;
        if (qxaVar2 != null) {
            qxaVar2.invalidate();
        }
    }

    public final void S() {
        if (this.a) {
            pm8 pm8VarK = K();
            if (pm8VarK != null) {
                pm8VarK.S();
                return;
            }
            return;
        }
        if (this.V != null) {
            h0(this, false, 7);
        } else {
            j0(this, false, 7);
        }
    }

    public final void T() {
        if (lh7.b(this.c, 9223372034707292159L)) {
            return;
        }
        this.c = 9223372034707292159L;
        j4a<pm8> j4aVarN = N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8VarArr[i2].T();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, w4e] */
    public final void U() {
        if (this.h0) {
            return;
        }
        if (this.t0.b.f != null || this.z0 != null) {
            this.f0 = true;
            return;
        }
        w4e w4eVar = this.g0;
        this.h0 = true;
        luc lucVar = new luc();
        lucVar.element = new w4e();
        vxa snapshotObserver = tm8.a(this).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.d, new qm8(this, lucVar));
        this.h0 = false;
        this.g0 = (w4e) lucVar.element;
        this.f0 = false;
        rxa rxaVarA = tm8.a(this);
        p3a<z4e> p3aVar = rxaVarA.getSemanticsOwner().d;
        Object[] objArr = p3aVar.a;
        int i = p3aVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((z4e) objArr[i2]).b(this, w4eVar);
        }
        rxaVarA.A();
    }

    public final void V() {
        pm8 pm8Var;
        if (this.W > 0) {
            this.Z = true;
        }
        if (!this.a || (pm8Var = this.a0) == null) {
            return;
        }
        pm8Var.V();
    }

    public final Boolean W() {
        z59 z59Var = this.u0.q;
        if (z59Var != null) {
            return Boolean.valueOf(z59Var.k());
        }
        return null;
    }

    @Override // defpackage.sxa
    public final boolean W0() {
        return d();
    }

    public final void X() {
        pm8 pm8VarK;
        if (this.q0 == f.c) {
            w();
        }
        z59 z59Var = this.u0.q;
        z59Var.getClass();
        try {
            z59Var.V = true;
            if (!z59Var.a0) {
                ae7.b("replace() called on item that was not placed");
            }
            z59Var.n0 = false;
            boolean zK = z59Var.k();
            z59Var.F0(z59Var.d0, z59Var.e0, z59Var.f0);
            if (zK && !z59Var.n0 && (pm8VarK = z59Var.f.a.K()) != null) {
                pm8VarK.g0(false);
            }
            z59Var.V = false;
        } catch (Throwable th) {
            z59Var.V = false;
            throw th;
        }
    }

    public final void Y(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            z zVar = this.X;
            j4a j4aVar = (j4a) zVar.a;
            h hVar = (h) zVar.b;
            Object objK = j4aVar.k(i5);
            hVar.invoke();
            ((j4a) zVar.a).a(i6, (pm8) objK);
            hVar.invoke();
        }
        a0();
        V();
        S();
    }

    public final void Z(pm8 pm8Var) {
        if (pm8Var.u0.l > 0) {
            this.u0.d(r0.l - 1);
        }
        if (this.b0 != null) {
            pm8Var.y();
        }
        pm8Var.a0 = null;
        if (pm8Var.D0 > 0) {
            n0(this.D0 - 1);
        }
        pm8Var.t0.d.i0 = null;
        if (pm8Var.a) {
            this.W--;
            j4a j4aVar = (j4a) pm8Var.X.a;
            Object[] objArr = j4aVar.a;
            int i = j4aVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((pm8) objArr[i2]).t0.d.i0 = null;
            }
        }
        V();
        a0();
    }

    @Override // defpackage.wk2
    public final void a() {
        ypg ypgVar = this.c0;
        if (ypgVar != null) {
            ypgVar.a();
        }
        j jVar = this.v0;
        if (jVar != null) {
            jVar.a();
        }
        ria riaVar = this.t0;
        tia tiaVar = riaVar.c.h0;
        for (tia tiaVar2 = riaVar.d; !wl7.b(tiaVar2, tiaVar) && tiaVar2 != null; tiaVar2 = tiaVar2.h0) {
            tiaVar2.j0 = true;
            tiaVar2.y0.invoke();
            tiaVar2.V1();
        }
    }

    public final void a0() {
        if (!this.a) {
            this.j0 = true;
            return;
        }
        pm8 pm8VarK = K();
        if (pm8VarK != null) {
            pm8VarK.a0();
        }
    }

    @Override // defpackage.bm8
    public final int b() {
        return this.b;
    }

    public final boolean b0(iq2 iq2Var) {
        if (iq2Var == null) {
            return false;
        }
        if (this.q0 == f.c) {
            v();
        }
        return this.u0.p.J0(iq2Var.a);
    }

    @Override // defpackage.wk2
    public final void c() {
        ypg ypgVar = this.c0;
        if (ypgVar != null) {
            ypgVar.c();
        }
        j jVar = this.v0;
        if (jVar != null) {
            jVar.g(true);
        }
        this.E0 = true;
        e.c cVar = this.t0.e;
        for (e.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.e) {
            if (cVar2.c0) {
                cVar2.X1();
            }
        }
        for (e.c cVar3 = cVar; cVar3 != null; cVar3 = cVar3.e) {
            if (cVar3.c0) {
                cVar3.Z1();
            }
        }
        while (cVar != null) {
            if (cVar.c0) {
                cVar.T1();
            }
            cVar = cVar.e;
        }
        if (d()) {
            this.g0 = null;
            this.f0 = false;
        }
        rxa rxaVar = this.b0;
        if (rxaVar != null) {
            rxaVar.h(this);
        }
    }

    @Override // defpackage.bm8
    public final boolean d() {
        return this.b0 != null;
    }

    public final void d0() {
        z zVar = this.X;
        int i = ((j4a) zVar.a).c;
        while (true) {
            i--;
            j4a j4aVar = (j4a) zVar.a;
            if (-1 >= i) {
                j4aVar.g();
                ((h) zVar.b).invoke();
                return;
            }
            Z((pm8) j4aVar.a[i]);
        }
    }

    @Override // defpackage.zzc
    public final void e() {
        if (this.V != null) {
            h0(this, false, 5);
        } else {
            j0(this, false, 5);
        }
        zf9 zf9Var = this.u0.p;
        iq2 iq2Var = zf9Var.Y ? new iq2(zf9Var.d) : null;
        rxa rxaVar = this.b0;
        if (iq2Var != null) {
            if (rxaVar != null) {
                rxaVar.s(this, iq2Var.a);
            }
        } else if (rxaVar != null) {
            rxaVar.a(true);
        }
    }

    public final void e0(int i, int i2) {
        if (i2 < 0) {
            ae7.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            z zVar = this.X;
            Z((pm8) ((j4a) zVar.a).a[i3]);
            Object objK = ((j4a) zVar.a).k(i3);
            ((h) zVar.b).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    @Override // defpackage.wk2
    public final void f() {
        if (!d()) {
            ae7.a("onReuse is only expected on attached node");
        }
        ypg ypgVar = this.c0;
        if (ypgVar != null) {
            ypgVar.f();
        }
        j jVar = this.v0;
        if (jVar != null) {
            jVar.g(false);
        }
        this.h0 = false;
        boolean z = this.E0;
        ria riaVar = this.t0;
        if (z) {
            this.E0 = false;
        } else {
            e.c cVar = riaVar.e;
            for (e.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.e) {
                if (cVar2.c0) {
                    cVar2.X1();
                }
            }
            for (e.c cVar3 = cVar; cVar3 != null; cVar3 = cVar3.e) {
                if (cVar3.c0) {
                    cVar3.Z1();
                }
            }
            while (cVar != null) {
                if (cVar.c0) {
                    cVar.T1();
                }
                cVar = cVar.e;
            }
        }
        int i = this.b;
        this.b = b5e.a.addAndGet(1);
        rxa rxaVar = this.b0;
        if (rxaVar != null) {
            rxaVar.y(i, this);
        }
        for (e.c cVar4 = riaVar.f; cVar4 != null; cVar4 = cVar4.f) {
            cVar4.S1();
        }
        riaVar.e();
        if (riaVar.d(8)) {
            U();
        }
        k0(this);
        rxa rxaVar2 = this.b0;
        if (rxaVar2 != null) {
            rxaVar2.g(i, this);
        }
    }

    public final void f0() {
        pm8 pm8VarK;
        if (this.q0 == f.c) {
            w();
        }
        zf9 zf9Var = this.u0.p;
        um8 um8Var = zf9Var.f;
        try {
            zf9Var.V = true;
            if (!zf9Var.Z) {
                ae7.b("replace called on unplaced item");
            }
            boolean z = zf9Var.i0;
            zf9Var.H0(zf9Var.c0, zf9Var.f0, zf9Var.d0, zf9Var.e0);
            if (z && !zf9Var.v0 && (pm8VarK = um8Var.a.K()) != null) {
                pm8VarK.i0(false);
            }
        } finally {
        }
    }

    @Override // defpackage.y4e
    public final w4e g() {
        if (d() && !this.E0 && this.t0.d(8)) {
            return this.g0;
        }
        return null;
    }

    public final void g0(boolean z) {
        rxa rxaVar;
        this.f = true;
        if (this.a || (rxaVar = this.b0) == null) {
            return;
        }
        rxaVar.r(this, true, z);
    }

    @Override // defpackage.y4e
    public final pm8 h() {
        return K();
    }

    @Override // defpackage.gl2
    public final void i(iy3 iy3Var) {
        if (wl7.b(this.m0, iy3Var)) {
            return;
        }
        this.m0 = iy3Var;
        S();
        pm8 pm8VarK = K();
        if (pm8VarK != null) {
            pm8VarK.Q();
        }
        R();
        for (e.c cVar = this.t0.f; cVar != null; cVar = cVar.f) {
            cVar.w();
        }
    }

    public final void i0(boolean z) {
        rxa rxaVar;
        this.f = true;
        if (this.a || (rxaVar = this.b0) == null) {
            return;
        }
        rxaVar.r(this, false, z);
    }

    @Override // defpackage.gl2
    public final void j(vl8 vl8Var) {
        if (this.n0 != vl8Var) {
            this.n0 = vl8Var;
            S();
            pm8 pm8VarK = K();
            if (pm8VarK != null) {
                pm8VarK.Q();
            }
            R();
            for (e.c cVar = this.t0.f; cVar != null; cVar = cVar.f) {
                cVar.h0();
            }
        }
    }

    @Override // defpackage.bm8
    public final boolean k() {
        return this.u0.p.i0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
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
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // rxa.a
    public final void l() {
        e.c cVar;
        ria riaVar = this.t0;
        pe7 pe7Var = riaVar.c;
        boolean zG = yia.g(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (zG) {
            cVar = pe7Var.J0;
        } else {
            cVar = pe7Var.J0.e;
            if (cVar == null) {
                return;
            }
        }
        tia.d dVar = tia.C0;
        for (e.c cVarI1 = pe7Var.i1(zG); cVarI1 != null && (cVarI1.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0; cVarI1 = cVarI1.f) {
            if ((cVarI1.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                ?? B = cVarI1;
                ?? j4aVar = 0;
                while (B != 0) {
                    if (B instanceof ql8) {
                        ((ql8) B).P0(riaVar.c);
                    } else if ((B.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 && (B instanceof zs3)) {
                        e.c cVar2 = ((zs3) B).e0;
                        int i = 0;
                        B = B;
                        j4aVar = j4aVar;
                        while (cVar2 != null) {
                            if ((cVar2.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
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
            if (cVarI1 == cVar) {
                return;
            }
        }
    }

    public final void l0() {
        j4a<pm8> j4aVarN = N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var = pm8VarArr[i2];
            f fVar = pm8Var.r0;
            pm8Var.q0 = fVar;
            if (fVar != f.c) {
                pm8Var.l0();
            }
        }
    }

    @Override // defpackage.gl2
    public final void m(ag9 ag9Var) {
        if (wl7.b(this.k0, ag9Var)) {
            return;
        }
        this.k0 = ag9Var;
        p24 p24Var = this.l0;
        if (p24Var != null) {
            ((gme) ((g4a) p24Var.b)).setValue(ag9Var);
        }
        S();
    }

    public final void m0(Throwable th) throws Throwable {
        hm2 hm2Var = (hm2) this.p0.a(jm2.a);
        if (hm2Var == null) {
            throw th;
        }
        hm2Var.c(this, th);
        throw th;
    }

    @Override // defpackage.gl2
    public final void n(androidx.compose.ui.e eVar) {
        if (this.a && this.y0 != e.a.b) {
            ae7.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.E0) {
            ae7.a("modifier is updated when deactivated");
        }
        if (!d()) {
            this.z0 = eVar;
            return;
        }
        t(eVar);
        if (this.f0) {
            U();
        }
    }

    public final void n0(int i) {
        pm8 pm8VarK;
        pm8 pm8VarK2;
        int i2 = this.D0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (pm8VarK2 = K()) != null) {
                pm8VarK2.n0(pm8VarK2.D0 + 1);
            }
            if (i == 0 && this.D0 > 0 && (pm8VarK = K()) != null) {
                pm8VarK.n0(pm8VarK.D0 - 1);
            }
            this.D0 = i;
        }
    }

    @Override // defpackage.y4e
    public final List<y4e> o() {
        return D();
    }

    public final void o0(pm8 pm8Var) {
        if (wl7.b(pm8Var, this.V)) {
            return;
        }
        this.V = pm8Var;
        um8 um8Var = this.u0;
        if (pm8Var != null) {
            if (um8Var.q == null) {
                um8Var.q = new z59(um8Var);
            }
            ria riaVar = this.t0;
            tia tiaVar = riaVar.c.h0;
            for (tia tiaVar2 = riaVar.d; !wl7.b(tiaVar2, tiaVar) && tiaVar2 != null; tiaVar2 = tiaVar2.h0) {
                tiaVar2.Z0();
            }
        } else {
            um8Var.q = null;
            um8Var.f = false;
            um8Var.e = false;
        }
        S();
    }

    @Override // defpackage.bm8
    public final boolean p() {
        return this.E0;
    }

    public final void p0() {
        if (this.W <= 0 || !this.Z) {
            return;
        }
        this.Z = false;
        j4a<pm8> j4aVar = this.Y;
        if (j4aVar == null) {
            j4aVar = new j4a<>(new pm8[16]);
            this.Y = j4aVar;
        }
        j4aVar.g();
        j4a j4aVar2 = (j4a) this.X.a;
        Object[] objArr = j4aVar2.a;
        int i = j4aVar2.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var = (pm8) objArr[i2];
            if (pm8Var.a) {
                j4aVar.c(j4aVar.c, pm8Var.N());
            } else {
                j4aVar.b(pm8Var);
            }
        }
        um8 um8Var = this.u0;
        um8Var.p.p0 = true;
        z59 z59Var = um8Var.q;
        if (z59Var != null) {
            z59Var.j0 = true;
        }
    }

    @Override // defpackage.y4e
    public final boolean q() {
        return this.t0.d.J1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // defpackage.gl2
    public final void r(sm2 sm2Var) {
        this.p0 = sm2Var;
        i((iy3) sm2Var.a(um2.h));
        j((vl8) sm2Var.a(um2.n));
        s((opg) sm2Var.a(um2.s));
        e.c cVar = this.t0.f;
        if ((cVar.d & 32768) != 0) {
            while (cVar != null) {
                if ((cVar.c & 32768) != 0) {
                    ?? B = cVar;
                    ?? j4aVar = 0;
                    while (B != 0) {
                        if (B instanceof nm2) {
                            e.c cVarK = ((nm2) B).k();
                            if (cVarK.c0) {
                                yia.c(cVarK);
                            } else {
                                cVarK.Y = true;
                            }
                        } else if ((B.c & 32768) != 0 && (B instanceof zs3)) {
                            e.c cVar2 = ((zs3) B).e0;
                            int i = 0;
                            B = B;
                            j4aVar = j4aVar;
                            while (cVar2 != null) {
                                if ((cVar2.c & 32768) != 0) {
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
                if ((cVar.d & 32768) == 0) {
                    return;
                } else {
                    cVar = cVar.f;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // defpackage.gl2
    public final void s(opg opgVar) {
        if (wl7.b(this.o0, opgVar)) {
            return;
        }
        this.o0 = opgVar;
        e.c cVar = this.t0.f;
        if ((cVar.d & 16) != 0) {
            while (cVar != null) {
                if ((cVar.c & 16) != 0) {
                    ?? B = cVar;
                    ?? j4aVar = 0;
                    while (B != 0) {
                        if (B instanceof dfb) {
                            ((dfb) B).J1();
                        } else if ((B.c & 16) != 0 && (B instanceof zs3)) {
                            e.c cVar2 = ((zs3) B).e0;
                            int i = 0;
                            B = B;
                            j4aVar = j4aVar;
                            while (cVar2 != null) {
                                if ((cVar2.c & 16) != 0) {
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
                if ((cVar.d & 16) == 0) {
                    return;
                } else {
                    cVar = cVar.f;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.ui.e$c, tia] */
    public final void t(androidx.compose.ui.e eVar) {
        ?? r7;
        ria.b bVar;
        j4a<e.b> j4aVar;
        boolean z;
        ria riaVar;
        boolean z2;
        j4a<e.b> j4aVar2;
        ria riaVar2;
        j4a<e.b> j4aVar3;
        j4a<e.b> j4aVar4;
        boolean z3;
        j4a<e.b> j4aVar5;
        j4a<e.b> j4aVar6;
        char c2;
        j4a<e.b> j4aVar7;
        sia siaVar;
        ria riaVar3 = this.t0;
        boolean zD = riaVar3.d(16);
        e.c cVar = riaVar3.e;
        boolean zD2 = riaVar3.d(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        this.y0 = eVar;
        pe7 pe7Var = riaVar3.c;
        pm8 pm8Var = riaVar3.a;
        e.c cVar2 = riaVar3.f;
        ria.b bVar2 = riaVar3.b;
        if (cVar2 == bVar2) {
            ae7.b("padChain called on already padded chain");
        }
        e.c cVar3 = riaVar3.f;
        cVar3.e = bVar2;
        bVar2.f = cVar3;
        j4a<e.b> j4aVar8 = riaVar3.g;
        int i = j4aVar8 != null ? j4aVar8.c : 0;
        j4a<e.b> j4aVar9 = riaVar3.h;
        if (j4aVar9 == null) {
            j4aVar9 = new j4a<>(new e.b[16]);
        }
        j4a<androidx.compose.ui.e> j4aVar10 = riaVar3.i;
        j4aVar10.b(eVar);
        sia siaVar2 = null;
        while (true) {
            int i2 = j4aVar10.c;
            if (i2 == 0) {
                break;
            }
            androidx.compose.ui.e eVarK = j4aVar10.k(i2 - 1);
            if (eVarK instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar = (androidx.compose.ui.a) eVarK;
                j4aVar10.b(aVar.c);
                j4aVar10.b(aVar.b);
            } else if (eVarK instanceof e.b) {
                j4aVar9.b(eVarK);
            } else {
                if (siaVar2 == null) {
                    siaVar = new sia(j4aVar9);
                    siaVar2 = siaVar;
                } else {
                    siaVar = siaVar2;
                }
                eVarK.e(siaVar);
            }
        }
        int i3 = j4aVar9.c;
        if (i3 == i) {
            e.c cVar4 = bVar2.f;
            int i4 = 0;
            j4a<e.b> j4aVar11 = j4aVar8;
            while (cVar4 != null && i4 < i) {
                if (j4aVar11 == null) {
                    throw l6.k("expected prior modifier list to be non-empty");
                }
                e.b bVar3 = j4aVar11.a[i4];
                e.b bVar4 = j4aVar9.a[i4];
                if (wl7.b(bVar3, bVar4)) {
                    j4aVar7 = j4aVar11;
                    c2 = 2;
                } else {
                    j4a<e.b> j4aVar12 = j4aVar11;
                    if (bVar3.getClass() == bVar4.getClass()) {
                        c2 = 1;
                        j4aVar7 = j4aVar12;
                    } else {
                        c2 = 0;
                        j4aVar7 = j4aVar12;
                    }
                }
                if (c2 == 0) {
                    cVar4 = cVar4.e;
                    j4aVar6 = j4aVar7;
                    break;
                } else {
                    if (c2 == 1) {
                        ria.h(bVar3, bVar4, cVar4);
                    }
                    cVar4 = cVar4.f;
                    i4++;
                    j4aVar11 = j4aVar7;
                }
            }
            j4aVar6 = j4aVar11;
            if (i4 >= i) {
                riaVar3 = riaVar3;
                j4aVar2 = j4aVar6;
                z2 = false;
                riaVar2 = riaVar3;
                bVar = bVar2;
                j4aVar = j4aVar9;
                z = false;
                j4aVar3 = j4aVar2;
                r7 = z2;
            } else {
                if (j4aVar6 == null) {
                    throw l6.k("expected prior modifier list to be non-empty");
                }
                if (cVar4 == null) {
                    throw l6.k("structuralUpdate requires a non-null tail");
                }
                boolean z4 = pm8Var.z0 != null;
                e.c cVar5 = cVar4;
                ria riaVar4 = riaVar3;
                j4aVar = j4aVar9;
                j4a<e.b> j4aVar13 = j4aVar6;
                z3 = false;
                riaVar4.f(i4, j4aVar13, j4aVar, cVar5, !z4);
                bVar = bVar2;
                riaVar = riaVar4;
                j4aVar5 = j4aVar13;
                z = true;
                riaVar2 = riaVar;
                j4aVar3 = j4aVar5;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z3 = false;
            z2 = false;
            androidx.compose.ui.e eVar2 = pm8Var.z0;
            if (eVar2 != null && i == 0) {
                e.c cVarB = bVar2;
                for (int i5 = 0; i5 < j4aVar9.c; i5++) {
                    cVarB = ria.b(j4aVar9.a[i5], cVarB);
                }
                int i6 = 0;
                for (e.c cVar6 = cVar.e; cVar6 != null && cVar6 != bVar2; cVar6 = cVar6.e) {
                    i6 |= cVar6.c;
                    cVar6.d = i6;
                }
                riaVar = riaVar3;
                bVar = bVar2;
                j4aVar = j4aVar9;
                j4aVar5 = j4aVar8;
                z = true;
                riaVar2 = riaVar;
                j4aVar3 = j4aVar5;
                r7 = z3;
            } else if (i3 != 0) {
                if (j4aVar8 == null) {
                    j4aVar8 = new j4a<>(new e.b[16]);
                }
                ria riaVar5 = riaVar3;
                bVar = bVar2;
                j4aVar = j4aVar9;
                riaVar5.f(0, j4aVar8, j4aVar, bVar, !(eVar2 != null));
                z = true;
                riaVar2 = riaVar5;
                j4aVar3 = j4aVar8;
            } else {
                if (j4aVar8 == null) {
                    throw l6.k("expected prior modifier list to be non-empty");
                }
                e.c cVar7 = bVar2.f;
                for (int i7 = 0; cVar7 != null && i7 < j4aVar8.c; i7++) {
                    cVar7 = ria.c(cVar7).f;
                }
                pm8 pm8VarK = pm8Var.K();
                pe7Var.i0 = pm8VarK != null ? pm8VarK.t0.c : null;
                riaVar3.d = pe7Var;
                j4aVar2 = j4aVar8;
                riaVar2 = riaVar3;
                bVar = bVar2;
                j4aVar = j4aVar9;
                z = false;
                j4aVar3 = j4aVar2;
                r7 = z2;
            }
        }
        riaVar2.g = j4aVar;
        if (j4aVar3 != null) {
            j4aVar3.g();
            j4aVar4 = j4aVar3;
        } else {
            j4aVar4 = r7;
        }
        riaVar2.h = j4aVar4;
        e.c cVar8 = bVar.f;
        if (cVar8 != null) {
            cVar = cVar8;
        }
        cVar.e = r7;
        bVar.f = r7;
        bVar.d = -1;
        bVar.W = r7;
        if (cVar == bVar) {
            ae7.b("trimChain did not update the head");
        }
        riaVar2.f = cVar;
        if (z) {
            riaVar2.g();
        }
        boolean zD3 = riaVar2.d(16);
        boolean zD4 = riaVar2.d(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        this.u0.j();
        if (this.V == null && riaVar2.d(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING)) {
            o0(this);
        }
        if (zD == zD3 && zD2 == zD4) {
            return;
        }
        stc rectManager = tm8.a(this).getRectManager();
        rectManager.getClass();
        if (d()) {
            rtc rtcVar = rectManager.a;
            int i8 = this.b & 67108863;
            long[] jArr = rtcVar.a;
            int i9 = rtcVar.c;
            for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                int i11 = i10 + 2;
                long j = jArr[i11];
                if ((((int) j) & 67108863) == i8) {
                    jArr[i11] = (4611686018427387903L & j) | ((zD4 ? 1L : 0L) * 4611686018427387904L) | ((zD3 ? 1L : 0L) * Long.MIN_VALUE);
                    return;
                }
            }
        }
    }

    public final String toString() {
        return ie7.z(this) + " children: " + ((j4a.a) D()).a.c + " measurePolicy: " + this.k0 + " deactivated: " + this.E0;
    }

    public final void u(rxa rxaVar) {
        pm8 pm8Var;
        if (this.b0 != null) {
            ae7.b("Cannot attach " + this + " as it already is attached.  Tree: " + x(0));
        }
        pm8 pm8Var2 = this.a0;
        if (pm8Var2 != null && !wl7.b(pm8Var2.b0, rxaVar)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(rxaVar);
            sb.append(") than the parent's owner(");
            pm8 pm8VarK = K();
            sb.append(pm8VarK != null ? pm8VarK.b0 : null);
            sb.append("). This tree: ");
            sb.append(x(0));
            sb.append(" Parent tree: ");
            pm8 pm8Var3 = this.a0;
            sb.append(pm8Var3 != null ? pm8Var3.x(0) : null);
            ae7.b(sb.toString());
        }
        pm8 pm8VarK2 = K();
        um8 um8Var = this.u0;
        if (pm8VarK2 == null) {
            um8Var.p.i0 = true;
            z59 z59Var = um8Var.q;
            if (z59Var != null) {
                z59Var.g0 = z59.a.a;
            }
        }
        ria riaVar = this.t0;
        riaVar.d.i0 = pm8VarK2 != null ? pm8VarK2.t0.c : null;
        this.b0 = rxaVar;
        this.d0 = (pm8VarK2 != null ? pm8VarK2.d0 : -1) + 1;
        androidx.compose.ui.e eVar = this.z0;
        if (eVar != null) {
            t(eVar);
        }
        this.z0 = null;
        rxaVar.f(this);
        pm8 pm8Var4 = this.a0;
        if (pm8Var4 == null || (pm8Var = pm8Var4.V) == null) {
            pm8Var = this.V;
        }
        o0(pm8Var);
        if (this.V == null && riaVar.d(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING)) {
            o0(this);
        }
        if (!this.E0) {
            for (e.c cVar = riaVar.f; cVar != null; cVar = cVar.f) {
                cVar.S1();
            }
        }
        j4a j4aVar = (j4a) this.X.a;
        Object[] objArr = j4aVar.a;
        int i = j4aVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((pm8) objArr[i2]).u(rxaVar);
        }
        if (!this.E0) {
            riaVar.e();
        }
        S();
        if (pm8VarK2 != null) {
            pm8VarK2.S();
        }
        pb0.e eVar2 = this.A0;
        if (eVar2 != null) {
            eVar2.invoke(rxaVar);
        }
        um8Var.j();
        if (!this.E0 && riaVar.d(8)) {
            U();
        }
        rxaVar.l(this);
    }

    public final void v() {
        this.r0 = this.q0;
        f fVar = f.c;
        this.q0 = fVar;
        j4a<pm8> j4aVarN = N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var = pm8VarArr[i2];
            if (pm8Var.q0 != fVar) {
                pm8Var.v();
            }
        }
    }

    public final void w() {
        this.r0 = this.q0;
        this.q0 = f.c;
        j4a<pm8> j4aVarN = N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var = pm8VarArr[i2];
            if (pm8Var.q0 == f.b) {
                pm8Var.w();
            }
        }
    }

    public final String x(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        j4a<pm8> j4aVarN = N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i3 = j4aVarN.c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(pm8VarArr[i4].x(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? akb.j(1, 0, string) : string;
    }

    public final void y() {
        v59 v59Var;
        rxa rxaVar = this.b0;
        if (rxaVar == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            pm8 pm8VarK = K();
            sb.append(pm8VarK != null ? pm8VarK.x(0) : null);
            ae7.c(sb.toString());
            r40.e();
            return;
        }
        pm8 pm8VarK2 = K();
        um8 um8Var = this.u0;
        if (pm8VarK2 != null) {
            pm8VarK2.Q();
            pm8VarK2.S();
            zf9 zf9Var = um8Var.p;
            f fVar = f.c;
            zf9Var.a0 = fVar;
            z59 z59Var = um8Var.q;
            if (z59Var != null) {
                z59Var.Y = fVar;
            }
        }
        rm8 rm8Var = um8Var.p.n0;
        rm8Var.b = true;
        rm8Var.c = false;
        rm8Var.e = false;
        rm8Var.d = false;
        rm8Var.f = false;
        rm8Var.g = false;
        rm8Var.h = null;
        z59 z59Var2 = um8Var.q;
        if (z59Var2 != null && (v59Var = z59Var2.h0) != null) {
            v59Var.b = true;
            v59Var.c = false;
            v59Var.e = false;
            v59Var.d = false;
            v59Var.f = false;
            v59Var.g = false;
            v59Var.h = null;
        }
        ria riaVar = this.t0;
        e.c cVar = riaVar.e;
        tia tiaVar = riaVar.c.h0;
        for (tia tiaVar2 = riaVar.d; !wl7.b(tiaVar2, tiaVar) && tiaVar2 != null; tiaVar2 = tiaVar2.h0) {
            tiaVar2.V1();
        }
        pb0.f fVar2 = this.B0;
        if (fVar2 != null) {
            fVar2.invoke(rxaVar);
        }
        for (e.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.e) {
            if (cVar2.c0) {
                cVar2.Z1();
            }
        }
        this.e0 = true;
        j4a j4aVar = (j4a) this.X.a;
        Object[] objArr = j4aVar.a;
        int i = j4aVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((pm8) objArr[i2]).y();
        }
        j6g j6gVar = j6g.a;
        this.e0 = false;
        while (cVar != null) {
            if (cVar.c0) {
                cVar.T1();
            }
            cVar = cVar.e;
        }
        rxaVar.o(this);
        this.b0 = null;
        this.c = 9223372034707292159L;
        o0(null);
        this.d0 = 0;
        zf9 zf9Var2 = um8Var.p;
        zf9Var2.X = Integer.MAX_VALUE;
        zf9Var2.W = Integer.MAX_VALUE;
        zf9Var2.i0 = false;
        z59 z59Var3 = um8Var.q;
        if (z59Var3 != null) {
            z59Var3.X = Integer.MAX_VALUE;
            z59Var3.W = Integer.MAX_VALUE;
            z59Var3.g0 = z59.a.c;
        }
        if (riaVar.d(8)) {
            w4e w4eVar = this.g0;
            this.g0 = null;
            this.f0 = false;
            p3a<z4e> p3aVar = rxaVar.getSemanticsOwner().d;
            Object[] objArr2 = p3aVar.a;
            int i3 = p3aVar.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((z4e) objArr2[i4]).b(this, w4eVar);
            }
            rxaVar.A();
        }
    }

    public final void z(ww1 ww1Var, xc6 xc6Var) throws Throwable {
        try {
            this.t0.d.U0(ww1Var, xc6Var);
            j6g j6gVar = j6g.a;
        } catch (Throwable th) {
            this.m0(th);
            throw null;
        }
    }

    public pm8(int i) {
        this(b5e.a.addAndGet(1), (i & 1) == 0);
    }

    public pm8() {
        this(3);
    }
}
