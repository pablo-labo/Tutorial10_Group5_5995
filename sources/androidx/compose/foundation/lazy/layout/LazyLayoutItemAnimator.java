package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.e;
import defpackage.a4a;
import defpackage.ad6;
import defpackage.ax1;
import defpackage.br8;
import defpackage.e13;
import defpackage.eb4;
import defpackage.eq8;
import defpackage.gme;
import defpackage.hq8;
import defpackage.iq2;
import defpackage.jf5;
import defpackage.lh7;
import defpackage.lnd;
import defpackage.nnd;
import defpackage.qq;
import defpackage.qx9;
import defpackage.sm8;
import defpackage.u63;
import defpackage.uq8;
import defpackage.wc6;
import defpackage.wl7;
import defpackage.xc6;
import defpackage.ygg;
import defpackage.yp8;
import defpackage.z3a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends br8> {
    public uq8 b;
    public int c;
    public a j;
    public final z3a<Object, LazyLayoutItemAnimator<T>.b> a = lnd.b();
    public final a4a<Object> d = nnd.a();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final androidx.compose.ui.e k = new DisplayingDisappearingItemsElement(this);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Lqx9;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DisplayingDisappearingItemsElement extends qx9<a> {
        public final LazyLayoutItemAnimator<?> b;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.b = lazyLayoutItemAnimator;
        }

        @Override // defpackage.qx9
        public final e.c a() {
            a aVar = new a();
            aVar.d0 = this.b;
            return aVar;
        }

        @Override // defpackage.qx9
        public final void b(e.c cVar) {
            a aVar = (a) cVar;
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = aVar.d0;
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator2 = this.b;
            if (wl7.b(lazyLayoutItemAnimator, lazyLayoutItemAnimator2) || !aVar.a.c0) {
                return;
            }
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator3 = aVar.d0;
            lazyLayoutItemAnimator3.e();
            lazyLayoutItemAnimator3.b = null;
            lazyLayoutItemAnimator3.c = -1;
            lazyLayoutItemAnimator2.j = aVar;
            aVar.d0 = lazyLayoutItemAnimator2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && wl7.b(this.b, ((DisplayingDisappearingItemsElement) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.b + ')';
        }
    }

    public static final class a extends e.c implements eb4 {
        public LazyLayoutItemAnimator<?> d0;

        public a() {
            throw null;
        }

        @Override // androidx.compose.ui.e.c
        public final void U1() {
            this.d0.j = this;
        }

        @Override // androidx.compose.ui.e.c
        public final void V1() {
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = this.d0;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.b = null;
            lazyLayoutItemAnimator.c = -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.d0, ((a) obj).d0);
        }

        public final int hashCode() {
            return this.d0.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.d0 + ')';
        }

        @Override // defpackage.eb4
        public final void y(sm8 sm8Var) {
            ax1 ax1Var = sm8Var.a;
            ArrayList arrayList = this.d0.i;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                eq8 eq8Var = (eq8) arrayList.get(i);
                xc6 xc6Var = eq8Var.n;
                if (xc6Var != null) {
                    long j = eq8Var.m;
                    long j2 = xc6Var.t;
                    float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                    float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                    ax1Var.b.a.k(f, f2);
                    try {
                        ad6.a(sm8Var, xc6Var);
                    } finally {
                        ax1Var.b.a.k(-f, -f2);
                    }
                }
            }
            sm8Var.N1();
        }
    }

    public final class b {
        public iq2 b;
        public int c;
        public int d;
        public int f;
        public int g;
        public eq8[] a = ygg.f;
        public int e = 1;

        public b() {
        }

        public static void b(b bVar, br8 br8Var, e13 e13Var, wc6 wc6Var, int i, int i2) {
            LazyLayoutItemAnimator.this.getClass();
            long jK = br8Var.k(0);
            bVar.a(br8Var, e13Var, wc6Var, i, i2, (int) (!br8Var.f() ? jK & 4294967295L : jK >> 32));
        }

        public final void a(T t, e13 e13Var, wc6 wc6Var, int i, int i2, int i3) {
            eq8[] eq8VarArr;
            eq8[] eq8VarArr2 = this.a;
            int length = eq8VarArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    this.f = i;
                    this.g = i2;
                    break;
                } else {
                    eq8 eq8Var = eq8VarArr2[i4];
                    if (eq8Var != null && eq8Var.g) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            int iB = t.b();
            int length2 = this.a.length;
            while (true) {
                eq8VarArr = this.a;
                if (iB >= length2) {
                    break;
                }
                eq8 eq8Var2 = eq8VarArr[iB];
                if (eq8Var2 != null) {
                    eq8Var2.c();
                }
                iB++;
            }
            if (eq8VarArr.length != t.b()) {
                this.a = (eq8[]) Arrays.copyOf(this.a, t.b());
            }
            this.b = new iq2(t.c());
            this.c = i3;
            this.d = t.l();
            this.e = t.d();
            int iB2 = t.b();
            for (int i5 = 0; i5 < iB2; i5++) {
                Object objI = t.i(i5);
                yp8 yp8Var = objI instanceof yp8 ? (yp8) objI : null;
                eq8[] eq8VarArr3 = this.a;
                if (yp8Var == null) {
                    eq8 eq8Var3 = eq8VarArr3[i5];
                    if (eq8Var3 != null) {
                        eq8Var3.c();
                    }
                    this.a[i5] = null;
                } else {
                    eq8 eq8Var4 = eq8VarArr3[i5];
                    if (eq8Var4 == null) {
                        eq8Var4 = new eq8(e13Var, wc6Var, new qq(LazyLayoutItemAnimator.this, 16));
                        this.a[i5] = eq8Var4;
                    }
                    eq8Var4.d = yp8Var.d0;
                    eq8Var4.e = yp8Var.e0;
                    eq8Var4.f = yp8Var.f0;
                }
            }
        }
    }

    public static void c(br8 br8Var, int i, b bVar) {
        int i2 = 0;
        long jK = br8Var.k(0);
        long jA = br8Var.f() ? lh7.a(0, i, 1, jK) : lh7.a(i, 0, 2, jK);
        eq8[] eq8VarArr = bVar.a;
        int length = eq8VarArr.length;
        int i3 = 0;
        while (i2 < length) {
            eq8 eq8Var = eq8VarArr[i2];
            int i4 = i3 + 1;
            if (eq8Var != null) {
                eq8Var.l = lh7.d(jA, lh7.c(br8Var.k(i3), jK));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, br8 br8Var) {
        int iL = br8Var.l();
        int iD = br8Var.d() + iL;
        int iMax = 0;
        while (iL < iD) {
            int iH = br8Var.h() + iArr[iL];
            iArr[iL] = iH;
            iMax = Math.max(iMax, iH);
            iL++;
        }
        return iMax;
    }

    public final eq8 a(int i, Object obj) {
        LazyLayoutItemAnimator<T>.b bVarD = this.a.d(obj);
        if (bVarD != null) {
            return bVarD.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            eq8 eq8Var = (eq8) arrayList.get(i);
            xc6 xc6Var = eq8Var.n;
            if (xc6Var != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (eq8Var.l >> 32)) + ((int) (xc6Var.u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (eq8Var.l & 4294967295L)) + ((int) (xc6Var.u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Type inference failed for: r9v36, types: [i13, lu2, v03] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r49, int r50, int r51, java.util.ArrayList r52, defpackage.uq8 r53, defpackage.r5i r54, boolean r55, boolean r56, int r57, boolean r58, int r59, int r60, defpackage.e13 r61, defpackage.wc6 r62) {
        /*
            Method dump skipped, instruction units count: 1503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.d(int, int, int, java.util.ArrayList, uq8, r5i, boolean, boolean, int, boolean, int, int, e13, wc6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r14 = this;
            z3a<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r14 = r14.a
            boolean r0 = r14.f()
            if (r0 == 0) goto L5d
            java.lang.Object[] r0 = r14.c
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5a
            r3 = 0
            r4 = r3
        L13:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L55
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2d:
            if (r9 >= r7) goto L53
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4f
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r10
            eq8[] r10 = r10.a
            int r11 = r10.length
            r12 = r3
        L43:
            if (r12 >= r11) goto L4f
            r13 = r10[r12]
            if (r13 == 0) goto L4c
            r13.c()
        L4c:
            int r12 = r12 + 1
            goto L43
        L4f:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2d
        L53:
            if (r7 != r8) goto L5a
        L55:
            if (r4 == r2) goto L5a
            int r4 = r4 + 1
            goto L13
        L5a:
            r14.g()
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.e():void");
    }

    public final void f(Object obj) {
        LazyLayoutItemAnimator<T>.b bVarK = this.a.k(obj);
        if (bVarK != null) {
            for (eq8 eq8Var : bVarK.a) {
                if (eq8Var != null) {
                    eq8Var.c();
                }
            }
        }
    }

    public final void g(T t, boolean z) {
        LazyLayoutItemAnimator<T>.b bVarD = this.a.d(t.getKey());
        bVarD.getClass();
        eq8[] eq8VarArr = bVarD.a;
        int length = eq8VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            eq8 eq8Var = eq8VarArr[i];
            int i3 = i2 + 1;
            if (eq8Var != null) {
                long jK = t.k(i2);
                long j = eq8Var.l;
                if (!lh7.b(j, 9223372034707292159L) && !lh7.b(j, jK)) {
                    long jC = lh7.c(jK, j);
                    jf5<lh7> jf5Var = eq8Var.e;
                    if (jf5Var != null) {
                        long jC2 = lh7.c(((lh7) ((gme) eq8Var.q).getValue()).a, jC);
                        eq8Var.g(jC2);
                        eq8Var.f(true);
                        eq8Var.g = z;
                        u63.Y(eq8Var.a, null, null, new hq8(eq8Var, jf5Var, jC2, null), 3);
                    }
                }
                eq8Var.l = jK;
            }
            i++;
            i2 = i3;
        }
    }
}
