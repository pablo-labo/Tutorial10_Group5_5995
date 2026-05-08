package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class is8 implements gs8, bg9 {
    public final js8 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final bg9 e;
    public final float f;
    public final boolean g;
    public final e13 h;
    public final iy3 i;
    public final long j;
    public final List<js8> k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final dwa p;
    public final int q;
    public final int r;

    public is8() {
        throw null;
    }

    public is8(js8 js8Var, int i, boolean z, float f, bg9 bg9Var, float f2, boolean z2, e13 e13Var, iy3 iy3Var, long j, List list, int i2, int i3, int i4, boolean z3, dwa dwaVar, int i5, int i6) {
        this.a = js8Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = bg9Var;
        this.f = f2;
        this.g = z2;
        this.h = e13Var;
        this.i = iy3Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z3;
        this.p = dwaVar;
        this.q = i5;
        this.r = i6;
    }

    @Override // defpackage.gs8
    public final dwa a() {
        return this.p;
    }

    @Override // defpackage.gs8
    public final long b() {
        bg9 bg9Var = this.e;
        return (((long) bg9Var.getWidth()) << 32) | (((long) bg9Var.getHeight()) & 4294967295L);
    }

    @Override // defpackage.gs8
    public final int c() {
        return this.q;
    }

    @Override // defpackage.gs8
    public final int d() {
        return -this.l;
    }

    @Override // defpackage.gs8
    public final int e() {
        return this.m;
    }

    @Override // defpackage.gs8
    public final int f() {
        return this.n;
    }

    @Override // defpackage.gs8
    public final int g() {
        return this.r;
    }

    @Override // defpackage.bg9
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.bg9
    public final int getWidth() {
        return this.e.getWidth();
    }

    @Override // defpackage.gs8
    public final int h() {
        return this.l;
    }

    @Override // defpackage.gs8
    public final List<js8> i() {
        return this.k;
    }

    @Override // defpackage.bg9
    public final void j() {
        this.e.j();
    }

    @Override // defpackage.bg9
    public final Function1<khd, j6g> k() {
        return this.e.k();
    }

    public final is8 l(int i, boolean z) {
        js8 js8Var;
        int i2;
        int i3;
        int i4;
        if (this.g) {
            return null;
        }
        List<js8> list = this.k;
        if (list.isEmpty() || (js8Var = this.a) == null) {
            return null;
        }
        int i5 = js8Var.s;
        int i6 = this.b - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        js8 js8Var2 = (js8) z92.O0(list);
        js8 js8Var3 = (js8) z92.Y0(list);
        if (js8Var2.u || js8Var3.u) {
            return null;
        }
        int i7 = js8Var2.p;
        int i8 = this.m;
        int i9 = this.l;
        if (i < 0) {
            if (Math.min((i7 + js8Var2.s) - i9, (js8Var3.p + js8Var3.s) - i8) <= (-i)) {
                return null;
            }
        } else if (Math.min(i9 - i7, i8 - js8Var3.p) <= i) {
            return null;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            js8 js8Var4 = list.get(i10);
            boolean z2 = js8Var4.c;
            int[] iArr = js8Var4.y;
            if (!js8Var4.u) {
                js8Var4.p += i;
                int length = iArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 & 1;
                    if ((z2 && i12 != 0) || (!z2 && i12 == 0)) {
                        iArr[i11] = iArr[i11] + i;
                    }
                }
                if (z) {
                    int size2 = js8Var4.b.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        eq8 eq8VarA = js8Var4.n.a(i13, js8Var4.l);
                        if (eq8VarA != null) {
                            long j = eq8VarA.l;
                            if (z2) {
                                i2 = i10;
                                i3 = (int) (j >> 32);
                                i4 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = i10;
                                i3 = ((int) (j >> 32)) + i;
                                i4 = (int) (j & 4294967295L);
                            }
                            eq8VarA.l = (((long) i4) & 4294967295L) | (((long) i3) << 32);
                        } else {
                            i2 = i10;
                        }
                        i13++;
                        i10 = i2;
                    }
                }
            }
            i10++;
        }
        return new is8(this.a, i6, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    @Override // defpackage.bg9
    public final Map<d20, Integer> r() {
        return this.e.r();
    }
}
