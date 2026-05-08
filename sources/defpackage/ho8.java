package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.w;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ho8 implements rn8, br8 {
    public final int a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final vl8 e;
    public final int f;
    public final int g;
    public final List<w> h;
    public final long i;
    public final Object j;
    public final LazyLayoutItemAnimator<ho8> k;
    public final long l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public int q;
    public int r;
    public int s;
    public final long t;
    public long u;
    public int v;
    public int w;
    public boolean x;

    public ho8() {
        throw null;
    }

    public ho8(int i, Object obj, int i2, int i3, vl8 vl8Var, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = true;
        this.d = i2;
        this.e = vl8Var;
        this.f = i4;
        this.g = i5;
        this.h = list;
        this.i = j;
        this.j = obj2;
        this.k = lazyLayoutItemAnimator;
        this.l = j2;
        this.m = i6;
        this.n = i7;
        this.q = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            w wVar = (w) list.get(i8);
            iMax = Math.max(iMax, this.c ? wVar.b : wVar.a);
        }
        this.o = iMax;
        int i9 = i3 + iMax;
        this.p = i9 >= 0 ? i9 : 0;
        boolean z = this.c;
        int i10 = this.d;
        this.t = z ? (((long) i10) << 32) | (4294967295L & ((long) iMax)) : (((long) i10) & 4294967295L) | (((long) iMax) << 32);
        this.u = 0L;
        this.v = -1;
        this.w = -1;
    }

    @Override // defpackage.rn8
    public final long a() {
        return this.t;
    }

    @Override // defpackage.br8
    public final int b() {
        return this.h.size();
    }

    @Override // defpackage.br8
    public final long c() {
        return this.l;
    }

    @Override // defpackage.br8
    public final int d() {
        return this.n;
    }

    @Override // defpackage.rn8
    public final int e() {
        return this.v;
    }

    @Override // defpackage.br8
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.br8
    public final void g(int i, int i2, int i3, int i4) {
        p(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.rn8
    public final int getColumn() {
        return this.w;
    }

    @Override // defpackage.rn8, defpackage.br8
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.br8
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.br8
    public final int h() {
        return this.p;
    }

    @Override // defpackage.br8
    public final Object i(int i) {
        return this.h.get(i).g();
    }

    @Override // defpackage.br8
    public final void j() {
        this.x = true;
    }

    @Override // defpackage.br8
    public final long k(int i) {
        return this.u;
    }

    @Override // defpackage.br8
    public final int l() {
        return this.m;
    }

    @Override // defpackage.rn8
    public final long m() {
        return this.u;
    }

    public final int n(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    public final void o(w.a aVar, boolean z) {
        List<w> list;
        int i;
        if (this.q == Integer.MIN_VALUE) {
            de7.a("position() should be called first");
        }
        List<w> list2 = this.h;
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            w wVar = list2.get(i2);
            int i3 = this.r;
            boolean z2 = this.c;
            int i4 = i3 - (z2 ? wVar.b : wVar.a);
            int i5 = this.s;
            long j = this.u;
            eq8 eq8VarA = this.k.a(i2, this.b);
            xc6 xc6Var = null;
            if (eq8VarA != null) {
                if (z) {
                    eq8VarA.r = j;
                    list = list2;
                    i = size;
                } else {
                    list = list2;
                    i = size;
                    long jD = lh7.d(!lh7.b(eq8VarA.r, 9223372034707292159L) ? eq8VarA.r : j, ((lh7) ((gme) eq8VarA.q).getValue()).a);
                    if (((n(j) <= i4 && n(jD) <= i4) || (n(j) >= i5 && n(jD) >= i5)) && ((Boolean) ((gme) eq8VarA.h).getValue()).booleanValue()) {
                        u63.Y(eq8VarA.a, null, null, new iq8(eq8VarA, null), 3);
                    }
                    j = jD;
                }
                xc6Var = eq8VarA.n;
            } else {
                list = list2;
                i = size;
            }
            long jD2 = lh7.d(j, this.i);
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
            i2++;
            list2 = list;
            size = i;
        }
    }

    public final void p(int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        long j2;
        boolean z = this.c;
        int i7 = z ? i4 : i3;
        this.q = i7;
        if (!z) {
            i3 = i4;
        }
        if (z && this.e == vl8.b) {
            i2 = (i3 - i2) - this.d;
        }
        if (z) {
            j = ((long) i2) << 32;
            j2 = i;
        } else {
            j = ((long) i) << 32;
            j2 = i2;
        }
        this.u = (j2 & 4294967295L) | j;
        this.v = i5;
        this.w = i6;
        this.r = -this.f;
        this.s = i7 + this.g;
    }
}
