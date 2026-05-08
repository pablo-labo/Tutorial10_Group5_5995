package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.w;
import defpackage.c20;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class js8 implements zr8, br8 {
    public final int a;
    public final List<w> b;
    public final boolean c;
    public final c20.b d;
    public final c20.c e;
    public final vl8 f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final LazyLayoutItemAnimator<js8> n;
    public final long o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public final int[] y;

    public js8() {
        throw null;
    }

    public js8(int i, List list, boolean z, c20.b bVar, c20.c cVar, vl8 vl8Var, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = bVar;
        this.e = cVar;
        this.f = vl8Var;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = j;
        this.l = obj;
        this.m = obj2;
        this.n = lazyLayoutItemAnimator;
        this.o = j2;
        this.r = 1;
        this.v = Integer.MIN_VALUE;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            w wVar = (w) list.get(i6);
            boolean z3 = this.c;
            i5 += z3 ? wVar.b : wVar.a;
            iMax = Math.max(iMax, !z3 ? wVar.b : wVar.a);
        }
        this.q = i5;
        int i7 = i5 + this.j;
        this.s = i7 >= 0 ? i7 : 0;
        this.t = iMax;
        this.y = new int[this.b.size() * 2];
    }

    @Override // defpackage.zr8
    public final int a() {
        return this.q;
    }

    @Override // defpackage.br8
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.br8
    public final long c() {
        return this.o;
    }

    @Override // defpackage.br8
    public final int d() {
        return this.r;
    }

    public final int e(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    @Override // defpackage.br8
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.br8
    public final void g(int i, int i2, int i3, int i4) {
        n(i, i3, i4);
    }

    @Override // defpackage.zr8, defpackage.br8
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.br8
    public final Object getKey() {
        return this.l;
    }

    @Override // defpackage.zr8
    public final int getOffset() {
        return this.p;
    }

    @Override // defpackage.br8
    public final int h() {
        return this.s;
    }

    @Override // defpackage.br8
    public final Object i(int i) {
        return this.b.get(i).g();
    }

    @Override // defpackage.br8
    public final void j() {
        this.u = true;
    }

    @Override // defpackage.br8
    public final long k(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.p;
            return this.c ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.y;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    @Override // defpackage.br8
    public final int l() {
        return 0;
    }

    public final void m(w.a aVar, boolean z) {
        List<w> list;
        int i;
        int i2;
        long j;
        if (this.v == Integer.MIN_VALUE) {
            de7.a("position() should be called first");
        }
        List<w> list2 = this.b;
        int i3 = 0;
        for (int size = list2.size(); i3 < size; size = i) {
            w wVar = list2.get(i3);
            int i4 = this.w;
            boolean z2 = this.c;
            int i5 = i4 - (z2 ? wVar.b : wVar.a);
            int i6 = this.x;
            long jK = k(i3);
            eq8 eq8VarA = this.n.a(i3, this.l);
            xc6 xc6Var = null;
            if (eq8VarA != null) {
                if (z) {
                    eq8VarA.r = jK;
                    list = list2;
                    i = size;
                } else {
                    list = list2;
                    i = size;
                    if (!lh7.b(eq8VarA.r, 9223372034707292159L)) {
                        jK = eq8VarA.r;
                    }
                    long jD = lh7.d(jK, ((lh7) ((gme) eq8VarA.q).getValue()).a);
                    if (((e(jK) <= i5 && e(jD) <= i5) || (e(jK) >= i6 && e(jD) >= i6)) && ((Boolean) ((gme) eq8VarA.h).getValue()).booleanValue()) {
                        u63.Y(eq8VarA.a, null, null, new iq8(eq8VarA, null), 3);
                    }
                    jK = jD;
                }
                xc6Var = eq8VarA.n;
            } else {
                list = list2;
                i = size;
            }
            if (this.g) {
                int i7 = this.v;
                if (z2) {
                    i2 = i3;
                    j = (((long) ((int) (jK >> 32))) << 32) | (((long) ((i7 - ((int) (jK & 4294967295L))) - (z2 ? wVar.b : wVar.a))) & 4294967295L);
                } else {
                    i2 = i3;
                    j = (((long) ((int) (jK & 4294967295L))) & 4294967295L) | (((long) ((i7 - ((int) (jK >> 32))) - (z2 ? wVar.b : wVar.a))) << 32);
                }
                jK = j;
            } else {
                i2 = i3;
            }
            long jD2 = lh7.d(jK, this.k);
            if (!z && eq8VarA != null) {
                eq8VarA.m = jD2;
            }
            if (z2) {
                if (xc6Var != null) {
                    aVar.getClass();
                    w.a.d(aVar, wVar);
                    wVar.g0(lh7.d(jD2, wVar.e), 0.0f, xc6Var);
                } else {
                    w.a.E(aVar, wVar, jD2);
                }
            } else if (xc6Var != null) {
                w.a.B(aVar, wVar, jD2, xc6Var);
            } else {
                w.a.A(aVar, wVar, jD2);
            }
            i3 = i2 + 1;
            list2 = list;
        }
    }

    public final void n(int i, int i2, int i3) {
        int i4;
        this.p = i;
        boolean z = this.c;
        this.v = z ? i3 : i2;
        List<w> list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            w wVar = list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.y;
            if (z) {
                c20.b bVar = this.d;
                if (bVar == null) {
                    de7.b("null horizontalAlignment when isVertical == true");
                    r40.e();
                    return;
                } else {
                    iArr[i6] = bVar.a(wVar.a, i2, this.f);
                    iArr[i6 + 1] = i;
                    i4 = wVar.b;
                }
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                c20.c cVar = this.e;
                if (cVar == null) {
                    de7.b("null verticalAlignment when isVertical == false");
                    r40.e();
                    return;
                } else {
                    iArr[i7] = cVar.a(wVar.b, i3);
                    i4 = wVar.a;
                }
            }
            i += i4;
        }
        this.w = -this.h;
        this.x = this.v + this.i;
    }
}
