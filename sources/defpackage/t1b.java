package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t1b implements o1b, bg9 {
    public final List<hg9> a;
    public final int b;
    public final int c;
    public final int d;
    public final dwa e;
    public final int f;
    public final int g;
    public final int h;
    public final hg9 i;
    public final hg9 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final tle n;
    public final bg9 o;
    public final boolean p;
    public final List<hg9> q;
    public final List<hg9> r;
    public final e13 s;

    public t1b(List list, int i, int i2, int i3, dwa dwaVar, int i4, int i5, int i6, hg9 hg9Var, hg9 hg9Var2, float f, int i7, boolean z, tle tleVar, bg9 bg9Var, boolean z2, List list2, List list3, e13 e13Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = dwaVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = hg9Var;
        this.j = hg9Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = tleVar;
        this.o = bg9Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = e13Var;
    }

    @Override // defpackage.o1b
    public final dwa a() {
        return this.e;
    }

    @Override // defpackage.o1b
    public final long b() {
        bg9 bg9Var = this.o;
        return (((long) bg9Var.getWidth()) << 32) | (((long) bg9Var.getHeight()) & 4294967295L);
    }

    @Override // defpackage.o1b
    public final int c() {
        return this.d;
    }

    @Override // defpackage.o1b
    public final int d() {
        return -this.f;
    }

    @Override // defpackage.o1b
    public final boolean e() {
        return false;
    }

    @Override // defpackage.o1b
    public final int f() {
        return this.b;
    }

    @Override // defpackage.o1b
    public final List<hg9> g() {
        return this.a;
    }

    @Override // defpackage.bg9
    public final int getHeight() {
        return this.o.getHeight();
    }

    @Override // defpackage.bg9
    public final int getWidth() {
        return this.o.getWidth();
    }

    @Override // defpackage.o1b
    public final int h() {
        return this.c;
    }

    @Override // defpackage.o1b
    public final tle i() {
        return this.n;
    }

    @Override // defpackage.bg9
    public final void j() {
        this.o.j();
    }

    @Override // defpackage.bg9
    public final Function1<khd, j6g> k() {
        return this.o.k();
    }

    public final t1b l(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List<hg9> list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        hg9 hg9Var = (hg9) z92.O0(list);
        hg9 hg9Var2 = (hg9) z92.Y0(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((hg9Var.k + i3) - i5, (hg9Var2.k + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - hg9Var.k, i4 - hg9Var2.k) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            list.get(i6).a(i);
        }
        List<hg9> list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            list2.get(i7).a(i);
        }
        List<hg9> list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            list3.get(i8).a(i);
        }
        return new t1b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    @Override // defpackage.bg9
    public final Map<d20, Integer> r() {
        return this.o.r();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t1b(int i, int i2, int i3, int i4, int i5, int i6, tle tleVar, bg9 bg9Var, e13 e13Var) {
        zr4 zr4Var = zr4.a;
        this(zr4Var, i, i2, i3, dwa.b, i4, i5, i6, null, null, 0.0f, 0, false, tleVar, bg9Var, false, zr4Var, zr4Var, e13Var);
    }
}
