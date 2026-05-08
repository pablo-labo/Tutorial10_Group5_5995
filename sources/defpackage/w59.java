package defpackage;

import androidx.compose.ui.layout.p;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.layout.x;
import androidx.compose.ui.layout.z;
import defpackage.pm8;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class w59 extends w implements cg9, uz9 {
    public static final a d0 = a.a;
    public Function1<? super khd, j6g> V;
    public rab W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final p a0;
    public lhd b0;
    public z3a<z, a4a<qug<pm8>>> c0;
    public b f;

    public static final class a extends mj8 implements Function1<rab, j6g> {
        public static final a a = new a(1);

        /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.j6g invoke(defpackage.rab r15) {
            /*
                r14 = this;
                r1 = r15
                rab r1 = (defpackage.rab) r1
                boolean r14 = r1.W0()
                if (r14 == 0) goto L71
                w59 r0 = r1.b
                boolean r14 = r0.Z
                if (r14 == 0) goto L10
                goto L71
            L10:
                bg9 r14 = r1.a
                kotlin.jvm.functions.Function1 r14 = r14.k()
                z3a<androidx.compose.ui.layout.z, a4a<qug<pm8>>> r15 = r0.c0
                if (r14 != 0) goto L65
                if (r15 == 0) goto L71
                java.lang.Object[] r14 = r15.c
                long[] r1 = r15.a
                int r2 = r1.length
                int r2 = r2 + (-2)
                if (r2 < 0) goto L61
                r3 = 0
                r4 = r3
            L27:
                r5 = r1[r4]
                long r7 = ~r5
                r9 = 7
                long r7 = r7 << r9
                long r7 = r7 & r5
                r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r7 = r7 & r9
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 == 0) goto L5c
                int r7 = r4 - r2
                int r7 = ~r7
                int r7 = r7 >>> 31
                r8 = 8
                int r7 = 8 - r7
                r9 = r3
            L41:
                if (r9 >= r7) goto L5a
                r10 = 255(0xff, double:1.26E-321)
                long r10 = r10 & r5
                r12 = 128(0x80, double:6.32E-322)
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 >= 0) goto L56
                int r10 = r4 << 3
                int r10 = r10 + r9
                r10 = r14[r10]
                a4a r10 = (defpackage.a4a) r10
                r0.L0(r10)
            L56:
                long r5 = r5 >> r8
                int r9 = r9 + 1
                goto L41
            L5a:
                if (r7 != r8) goto L61
            L5c:
                if (r4 == r2) goto L61
                int r4 = r4 + 1
                goto L27
            L61:
                r15.g()
                goto L71
            L65:
                r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
                r4 = 0
                r0.u0(r1, r2, r4)
                r0.V = r14
            L71:
                j6g r14 = defpackage.j6g.a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: w59.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public final class b implements khd {
        public boolean a;
        public long b = 9223372034707292159L;
        public long c = 0;

        public b() {
        }

        @Override // defpackage.khd
        public final void D0(z zVar, float f) {
            w59 w59Var = w59.this;
            lhd lhdVar = w59Var.b0;
            if (lhdVar == null) {
                lhdVar = new lhd();
                w59Var.b0 = lhdVar;
            }
            int iP0 = ut0.p0(zVar, lhdVar.b);
            if (iP0 >= 0) {
                float[] fArr = lhdVar.c;
                if (fArr[iP0] != f) {
                    fArr[iP0] = f;
                    lhdVar.d[iP0] = 1;
                    return;
                } else {
                    byte[] bArr = lhdVar.d;
                    if (bArr[iP0] == 2) {
                        bArr[iP0] = 0;
                        return;
                    }
                    return;
                }
            }
            int i = lhdVar.a;
            z[] zVarArr = lhdVar.b;
            if (i == zVarArr.length) {
                int i2 = i * 2;
                lhdVar.b = (z[]) Arrays.copyOf(zVarArr, i2);
                lhdVar.c = Arrays.copyOf(lhdVar.c, i2);
                lhdVar.d = Arrays.copyOf(lhdVar.d, i2);
            }
            lhdVar.b[i] = zVar;
            lhdVar.d[i] = 3;
            lhdVar.c[i] = f;
            lhdVar.a++;
        }

        @Override // defpackage.khd
        public final sl8 a1() {
            this.a = true;
            w59 w59Var = w59.this;
            sl8 sl8VarA1 = w59Var.a1();
            if (lh7.b(this.b, 9223372034707292159L)) {
                this.b = ak2.E(sl8VarA1.v(0L));
                this.c = sl8VarA1.a();
            }
            w59Var.H1().u0.b();
            return sl8VarA1;
        }

        @Override // defpackage.iy3
        public final float getDensity() {
            return w59.this.getDensity();
        }

        @Override // defpackage.iy3
        public final float p1() {
            return w59.this.p1();
        }
    }

    public static final class c extends mj8 implements gu5<j6g> {
        final /* synthetic */ rab $placeableResult;
        final /* synthetic */ long $positionOnScreen;
        final /* synthetic */ long $size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2, rab rabVar) {
            super(0);
            this.$positionOnScreen = j;
            this.$size = j2;
            this.$placeableResult = rabVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            w59 w59Var = w59.this;
            a aVar = w59.d0;
            w59Var.J0().a = false;
            w59.this.J0().b = this.$positionOnScreen;
            w59.this.J0().c = this.$size;
            Function1<khd, j6g> function1K = this.$placeableResult.a.k();
            if (function1K != null) {
                function1K.invoke(w59.this.J0());
            }
            return j6g.a;
        }
    }

    public static final class d implements bg9 {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Map<d20, Integer> c;
        public final /* synthetic */ Function1<khd, j6g> d;
        public final /* synthetic */ Function1<w.a, j6g> e;
        public final /* synthetic */ w59 f;

        /* JADX WARN: Multi-variable type inference failed */
        public d(int i, int i2, Map<d20, Integer> map, Function1<? super khd, j6g> function1, Function1<? super w.a, j6g> function12, w59 w59Var) {
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = function1;
            this.e = function12;
            this.f = w59Var;
        }

        @Override // defpackage.bg9
        public final int getHeight() {
            return this.b;
        }

        @Override // defpackage.bg9
        public final int getWidth() {
            return this.a;
        }

        @Override // defpackage.bg9
        public final void j() {
            this.e.invoke(this.f.a0);
        }

        @Override // defpackage.bg9
        public final Function1<khd, j6g> k() {
            return this.d;
        }

        @Override // defpackage.bg9
        public final Map<d20, Integer> r() {
            return this.c;
        }
    }

    public w59() {
        x.a aVar = x.a;
        this.a0 = new p(this);
    }

    public static void K0(tia tiaVar) {
        rm8 rm8Var;
        tia tiaVar2 = tiaVar.h0;
        pm8 pm8Var = tiaVar.e0;
        if (!wl7.b(tiaVar2 != null ? tiaVar2.e0 : null, pm8Var)) {
            pm8Var.u0.p.n0.g();
            return;
        }
        g20 g20VarZ = pm8Var.u0.p.z();
        if (g20VarZ == null || (rm8Var = ((zf9) g20VarZ).n0) == null) {
            return;
        }
        rm8Var.g();
    }

    @Override // defpackage.uz9
    public final void C(boolean z) {
        w59 w59VarH0 = H0();
        pm8 pm8VarH1 = w59VarH0 != null ? w59VarH0.H1() : null;
        if (wl7.b(pm8VarH1, H1())) {
            this.X = z;
            return;
        }
        if ((pm8VarH1 != null ? pm8VarH1.u0.d : null) != pm8.d.c) {
            if ((pm8VarH1 != null ? pm8VarH1.u0.d : null) != pm8.d.d) {
                return;
            }
        }
        this.X = z;
    }

    public abstract boolean F0();

    public abstract bg9 G0();

    public abstract w59 H0();

    public abstract pm8 H1();

    public abstract long I0();

    public final b J0() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f = bVar2;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L0(a4a<qug<pm8>> a4aVar) {
        pm8 pm8Var;
        Object[] objArr = a4aVar.b;
        long[] jArr = a4aVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (pm8Var = (pm8) ((qug) objArr[(i << 3) + i3]).get()) != null) {
                        if (m0()) {
                            pm8Var.g0(false);
                        } else {
                            pm8Var.i0(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void N0();

    @Override // defpackage.gg9
    public final int V(d20 d20Var) {
        int iS0;
        if (F0() && (iS0 = s0(d20Var)) != Integer.MIN_VALUE) {
            return iS0 + ((int) (this.e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract sl8 a1();

    @Override // defpackage.ql7
    public boolean m0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n0(defpackage.pm8 r32, androidx.compose.ui.layout.z r33) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w59.n0(pm8, androidx.compose.ui.layout.z):void");
    }

    public abstract int s0(d20 d20Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(rab rabVar, long j, long j2) {
        boolean z;
        char c2;
        long j3;
        long j4;
        long j5;
        pm8 pm8Var;
        boolean z2;
        int i;
        char c3;
        long j6;
        vxa snapshotObserver;
        z3a<z, a4a<qug<pm8>>> z3aVar = this.c0;
        lhd lhdVar = this.b0;
        if (lhdVar == null) {
            lhdVar = new lhd();
            this.b0 = lhdVar;
        }
        lhd lhdVar2 = lhdVar;
        rxa rxaVar = H1().b0;
        if (rxaVar != null && (snapshotObserver = rxaVar.getSnapshotObserver()) != null) {
            snapshotObserver.a(rabVar, d0, new c(j, j2, rabVar));
        }
        boolean zM0 = m0();
        a4a<qug<pm8>> a4aVar = lhdVar2.e;
        a4a<z> a4aVar2 = lhdVar2.f;
        int i2 = lhdVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = lhdVar2.d[i3];
            if (b2 == 3) {
                z zVar = lhdVar2.b[i3];
                zVar.getClass();
                a4aVar2.k(zVar);
            } else if (b2 != 0 && z3aVar != null) {
                z zVar2 = lhdVar2.b[i3];
                zVar2.getClass();
                a4a<qug<pm8>> a4aVarK = z3aVar.k(zVar2);
                if (a4aVarK != null) {
                    a4aVar.j(a4aVarK);
                }
            }
        }
        int i4 = lhdVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = lhdVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                z[] zVarArr = lhdVar2.b;
                zVarArr[i6 - i5] = zVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = lhdVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            lhdVar2.b[i8] = null;
        }
        lhdVar2.a -= i5;
        w59 w59VarH0 = H0();
        Object[] objArr = a4aVar2.b;
        long[] jArr = a4aVar2.a;
        int length = jArr.length - 2;
        char c4 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c4) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c3 = c4;
                            z zVar3 = (z) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            w59 w59Var = w59VarH0 == null ? this : w59VarH0;
                            i = i9;
                            w59 w59Var2 = w59Var;
                            while (true) {
                                lhd lhdVar3 = w59Var2.b0;
                                if (lhdVar3 != null) {
                                    z2 = zM0;
                                    if (!ut0.f0(zVar3, lhdVar3.b)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z2 = zM0;
                                w59 w59VarH02 = w59Var2.H0();
                                if (w59VarH02 == null) {
                                    break;
                                }
                                w59Var2 = w59VarH02;
                                zM0 = z2;
                            }
                            z3a<z, a4a<qug<pm8>>> z3aVar2 = w59Var2.c0;
                            a4a<qug<pm8>> a4aVarK2 = z3aVar2 != null ? z3aVar2.k(zVar3) : null;
                            if (a4aVarK2 != null) {
                                w59Var.L0(a4aVarK2);
                            }
                        } else {
                            z2 = zM0;
                            i = i9;
                            c3 = c4;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c4 = c3;
                        j7 = j6;
                        i9 = i;
                        zM0 = z2;
                    }
                    z = zM0;
                    c2 = c4;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zM0;
                    c2 = c4;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c4 = c2;
                j7 = j3;
                zM0 = z;
                i9 = 8;
            }
        } else {
            z = zM0;
            c2 = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        a4aVar2.e();
        Object[] objArr2 = a4aVar.b;
        long[] jArr2 = a4aVar.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c2) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (pm8Var = (pm8) ((qug) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                pm8Var.g0(false);
                            } else {
                                pm8Var.i0(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        a4aVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v0(defpackage.bg9 r15) {
        /*
            r14 = this;
            z3a<androidx.compose.ui.layout.z, a4a<qug<pm8>>> r0 = r14.c0
            boolean r1 = r14.Z
            if (r1 == 0) goto L8
            goto Lbd
        L8:
            kotlin.jvm.functions.Function1 r1 = r15.k()
            r2 = 0
            if (r1 != 0) goto L59
            if (r0 == 0) goto Lbd
            java.lang.Object[] r15 = r0.c
            long[] r1 = r0.a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L55
            r4 = r2
        L1b:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L50
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L35:
            if (r9 >= r7) goto L4e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            a4a r10 = (defpackage.a4a) r10
            r14.L0(r10)
        L4a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L4e:
            if (r7 != r8) goto L55
        L50:
            if (r4 == r3) goto L55
            int r4 = r4 + 1
            goto L1b
        L55:
            r0.g()
            return
        L59:
            kotlin.jvm.functions.Function1<? super khd, j6g> r0 = r14.V
            r3 = 1
            if (r0 == r1) goto L60
            r0 = r3
            goto L61
        L60:
            r0 = r2
        L61:
            r4 = 0
            if (r0 != 0) goto L9a
            w59$b r1 = r14.J0()
            boolean r1 = r1.a
            if (r1 == 0) goto L9a
            sl8 r0 = r14.a1()
            long r4 = r0.v(r4)
            long r4 = defpackage.ak2.E(r4)
            long r0 = r0.a()
            w59$b r6 = r14.J0()
            long r6 = r6.b
            boolean r6 = defpackage.lh7.b(r4, r6)
            if (r6 == 0) goto L95
            w59$b r6 = r14.J0()
            long r6 = r6.c
            boolean r6 = defpackage.th7.b(r0, r6)
            if (r6 != 0) goto L96
        L95:
            r2 = r3
        L96:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La1
        L9a:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La1:
            if (r0 == 0) goto Lbd
            rab r0 = r14.W
            if (r0 == 0) goto Lac
            r0.a = r15
        La9:
            r1 = r14
            r2 = r0
            goto Lb4
        Lac:
            rab r0 = new rab
            r0.<init>(r15, r14)
            r14.W = r0
            goto La9
        Lb4:
            r1.u0(r2, r3, r5)
            kotlin.jvm.functions.Function1 r14 = r15.k()
            r1.V = r14
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w59.v0(bg9):void");
    }

    public abstract w59 z0();

    @Override // androidx.compose.ui.layout.q
    public final bg9 z1(int i, int i2, Map<d20, Integer> map, Function1<? super khd, j6g> function1, Function1<? super w.a, j6g> function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ae7.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d(i, i2, map, function1, function12, this);
    }
}
