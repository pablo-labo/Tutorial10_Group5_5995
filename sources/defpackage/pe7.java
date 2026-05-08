package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.w;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pe7 extends tia {
    public static final f80 L0;
    public final f8f J0;
    public a K0;

    public final class a extends x59 {
        @Override // defpackage.pl7
        public final int K(int i) {
            p24 p24VarJ = this.e0.e0.J();
            ag9 ag9VarA = p24VarJ.a();
            pm8 pm8Var = (pm8) p24VarJ.c;
            return ag9VarA.h(pm8Var.t0.d, pm8Var.B(), i);
        }

        @Override // defpackage.pl7
        public final int O(int i) {
            p24 p24VarJ = this.e0.e0.J();
            ag9 ag9VarA = p24VarJ.a();
            pm8 pm8Var = (pm8) p24VarJ.c;
            return ag9VarA.e(pm8Var.t0.d, pm8Var.B(), i);
        }

        @Override // defpackage.pl7
        public final int P(int i) {
            p24 p24VarJ = this.e0.e0.J();
            ag9 ag9VarA = p24VarJ.a();
            pm8 pm8Var = (pm8) p24VarJ.c;
            return ag9VarA.a(pm8Var.t0.d, pm8Var.B(), i);
        }

        @Override // defpackage.vf9
        public final w R(long j) {
            l0(j);
            tia tiaVar = this.e0;
            j4a<pm8> j4aVarN = tiaVar.e0.N();
            pm8[] pm8VarArr = j4aVarN.a;
            int i = j4aVarN.c;
            for (int i2 = 0; i2 < i; i2++) {
                z59 z59Var = pm8VarArr[i2].u0.q;
                z59Var.getClass();
                z59Var.Y = pm8.f.c;
            }
            pm8 pm8Var = tiaVar.e0;
            x59.O0(this, pm8Var.k0.c(this, pm8Var.B(), j));
            return this;
        }

        @Override // defpackage.x59
        public final void R0() {
            z59 z59Var = this.e0.e0.u0.q;
            z59Var.getClass();
            z59Var.z0();
        }

        @Override // defpackage.w59
        public final int s0(d20 d20Var) {
            z59 z59Var = this.e0.e0.u0.q;
            z59Var.getClass();
            v59 v59Var = z59Var.h0;
            if (!z59Var.Z) {
                um8 um8Var = z59Var.f;
                if (um8Var.d == pm8.d.b) {
                    v59Var.f = true;
                    if (v59Var.b) {
                        um8Var.f = true;
                        um8Var.g = true;
                    }
                } else {
                    v59Var.g = true;
                }
            }
            a aVar = z59Var.M().K0;
            if (aVar != null) {
                aVar.Z = true;
            }
            z59Var.E();
            a aVar2 = z59Var.M().K0;
            if (aVar2 != null) {
                aVar2.Z = false;
            }
            Integer num = (Integer) v59Var.i.get(d20Var);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            this.j0.h(iIntValue, d20Var);
            return iIntValue;
        }

        @Override // defpackage.pl7
        public final int w(int i) {
            p24 p24VarJ = this.e0.e0.J();
            ag9 ag9VarA = p24VarJ.a();
            pm8 pm8Var = (pm8) p24VarJ.c;
            return ag9VarA.f(pm8Var.t0.d, pm8Var.B(), i);
        }
    }

    static {
        f80 f80VarA = g80.a();
        f80VarA.d(da2.f);
        f80VarA.q(1.0f);
        f80VarA.r(1);
        L0 = f80VarA;
    }

    public pe7(pm8 pm8Var) {
        super(pm8Var);
        f8f f8fVar = new f8f();
        f8fVar.d = 0;
        this.J0 = f8fVar;
        f8fVar.W = this;
        this.K0 = pm8Var.V != null ? new a(this) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.tia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E1(tia.e r17, long r18, defpackage.qi6 r20, int r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe7.E1(tia$e, long, qi6, int, boolean):void");
    }

    @Override // defpackage.pl7
    public final int K(int i) {
        p24 p24VarJ = this.e0.J();
        ag9 ag9VarA = p24VarJ.a();
        pm8 pm8Var = (pm8) p24VarJ.c;
        return ag9VarA.h(pm8Var.t0.d, pm8Var.C(), i);
    }

    @Override // defpackage.pl7
    public final int O(int i) {
        p24 p24VarJ = this.e0.J();
        ag9 ag9VarA = p24VarJ.a();
        pm8 pm8Var = (pm8) p24VarJ.c;
        return ag9VarA.e(pm8Var.t0.d, pm8Var.C(), i);
    }

    @Override // defpackage.pl7
    public final int P(int i) {
        p24 p24VarJ = this.e0.J();
        ag9 ag9VarA = p24VarJ.a();
        pm8 pm8Var = (pm8) p24VarJ.c;
        return ag9VarA.a(pm8Var.t0.d, pm8Var.C(), i);
    }

    @Override // defpackage.vf9
    public final w R(long j) {
        if (this.g0) {
            a aVar = this.K0;
            aVar.getClass();
            j = aVar.d;
        }
        l0(j);
        pm8 pm8Var = this.e0;
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8VarArr[i2].u0.p.a0 = pm8.f.c;
        }
        W1(pm8Var.k0.c(this, pm8Var.C(), j));
        O1();
        return this;
    }

    @Override // defpackage.tia
    public final void S1(ww1 ww1Var, xc6 xc6Var) throws Throwable {
        pm8 pm8Var = this.e0;
        rxa rxaVarA = tm8.a(pm8Var);
        j4a<pm8> j4aVarM = pm8Var.M();
        pm8[] pm8VarArr = j4aVarM.a;
        int i = j4aVarM.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var2 = pm8VarArr[i2];
            if (pm8Var2.k()) {
                pm8Var2.z(ww1Var, xc6Var);
            }
        }
        if (rxaVarA.getShowLayoutBounds()) {
            long j = this.c;
            ww1Var.t(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, L0);
        }
    }

    @Override // defpackage.tia
    public final void Z0() {
        if (this.K0 == null) {
            this.K0 = new a(this);
        }
    }

    @Override // defpackage.tia
    public final x59 d1() {
        return this.K0;
    }

    @Override // defpackage.tia
    public final e.c f1() {
        return this.J0;
    }

    @Override // defpackage.tia, androidx.compose.ui.layout.w
    public final void g0(long j, float f, xc6 xc6Var) {
        super.g0(j, f, xc6Var);
        if (this.Y) {
            return;
        }
        this.e0.u0.p.F0();
    }

    @Override // defpackage.tia, androidx.compose.ui.layout.w
    public final void h0(long j, float f, Function1<? super cd6, j6g> function1) {
        super.h0(j, f, function1);
        if (this.Y) {
            return;
        }
        this.e0.u0.p.F0();
    }

    @Override // defpackage.w59
    public final int s0(d20 d20Var) {
        a aVar = this.K0;
        if (aVar != null) {
            return aVar.s0(d20Var);
        }
        zf9 zf9Var = this.e0.u0.p;
        rm8 rm8Var = zf9Var.n0;
        if (!zf9Var.b0) {
            if (zf9Var.f.d == pm8.d.a) {
                rm8Var.f = true;
                if (rm8Var.b) {
                    zf9Var.l0 = true;
                    zf9Var.m0 = true;
                }
            } else {
                rm8Var.g = true;
            }
        }
        zf9Var.M().Z = true;
        zf9Var.E();
        zf9Var.M().Z = false;
        Integer num = (Integer) rm8Var.i.get(d20Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.pl7
    public final int w(int i) {
        p24 p24VarJ = this.e0.J();
        ag9 ag9VarA = p24VarJ.a();
        pm8 pm8Var = (pm8) p24VarJ.c;
        return ag9VarA.f(pm8Var.t0.d, pm8Var.C(), i);
    }
}
