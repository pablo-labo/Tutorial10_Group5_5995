package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class go8 implements eo8, bg9 {
    public final io8 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final bg9 e;
    public final float f;
    public final boolean g;
    public final e13 h;
    public final iy3 i;
    public final int j;
    public final Function1<Integer, List<Pair<Integer, iq2>>> k;
    public final Function1<Integer, Integer> l;
    public final List<ho8> m;
    public final int n;
    public final int o;
    public final int p;
    public final dwa q;
    public final int r;
    public final int s;

    public go8(io8 io8Var, int i, boolean z, float f, bg9 bg9Var, float f2, boolean z2, e13 e13Var, iy3 iy3Var, int i2, Function1 function1, Function1 function12, List list, int i3, int i4, int i5, dwa dwaVar, int i6, int i7) {
        this.a = io8Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = bg9Var;
        this.f = f2;
        this.g = z2;
        this.h = e13Var;
        this.i = iy3Var;
        this.j = i2;
        this.k = function1;
        this.l = function12;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = dwaVar;
        this.r = i6;
        this.s = i7;
    }

    @Override // defpackage.eo8
    public final dwa a() {
        return this.q;
    }

    @Override // defpackage.eo8
    public final long b() {
        bg9 bg9Var = this.e;
        return (((long) bg9Var.getWidth()) << 32) | (((long) bg9Var.getHeight()) & 4294967295L);
    }

    @Override // defpackage.eo8
    public final int c() {
        return this.r;
    }

    @Override // defpackage.eo8
    public final int d() {
        return -this.n;
    }

    @Override // defpackage.eo8
    public final int e() {
        return this.o;
    }

    @Override // defpackage.eo8
    public final int f() {
        return this.p;
    }

    @Override // defpackage.eo8
    public final int g() {
        return this.s;
    }

    @Override // defpackage.bg9
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.bg9
    public final int getWidth() {
        return this.e.getWidth();
    }

    @Override // defpackage.eo8
    public final int h() {
        return this.n;
    }

    @Override // defpackage.eo8
    public final List<ho8> i() {
        return this.m;
    }

    @Override // defpackage.bg9
    public final void j() {
        this.e.j();
    }

    @Override // defpackage.bg9
    public final Function1<khd, j6g> k() {
        return this.e.k();
    }

    public final go8 l(int i, boolean z) {
        io8 io8Var;
        int i2;
        List<ho8> list;
        int i3;
        int i4;
        long j;
        List<ho8> list2;
        int i5;
        if (this.g) {
            return null;
        }
        List<ho8> list3 = this.m;
        if (list3.isEmpty() || (io8Var = this.a) == null) {
            return null;
        }
        int i6 = io8Var.g;
        int i7 = this.b - i;
        if (i7 < 0 || i7 >= i6) {
            return null;
        }
        ho8 ho8Var = (ho8) z92.O0(list3);
        ho8 ho8Var2 = (ho8) z92.Y0(list3);
        if (ho8Var.x || ho8Var2.x) {
            return null;
        }
        int i8 = this.o;
        int i9 = this.n;
        dwa dwaVar = this.q;
        if (i < 0) {
            if (Math.min((ewa.I(ho8Var, dwaVar) + ho8Var.p) - i9, (ewa.I(ho8Var2, dwaVar) + ho8Var2.p) - i8) <= (-i)) {
                return null;
            }
        } else if (Math.min(i9 - ewa.I(ho8Var, dwaVar), i8 - ewa.I(ho8Var2, dwaVar)) <= i) {
            return null;
        }
        int size = list3.size();
        int i10 = 0;
        while (i10 < size) {
            ho8 ho8Var3 = list3.get(i10);
            boolean z2 = ho8Var3.c;
            if (ho8Var3.x) {
                list = list3;
                i3 = size;
                i2 = i7;
            } else {
                long j2 = ho8Var3.u;
                long j3 = 4294967295L;
                i2 = i7;
                ho8Var3.u = (((long) (z2 ? (int) (j2 >> 32) : ((int) (j2 >> 32)) + i)) << 32) | (((long) (z2 ? ((int) (j2 & 4294967295L)) + i : (int) (j2 & 4294967295L))) & 4294967295L);
                if (z) {
                    int size2 = ho8Var3.h.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        eq8 eq8VarA = ho8Var3.k.a(i11, ho8Var3.b);
                        if (eq8VarA != null) {
                            long j4 = eq8VarA.l;
                            if (z2) {
                                j = j3;
                                i5 = (int) (j4 >> 32);
                            } else {
                                j = j3;
                                i5 = ((int) (j4 >> 32)) + i;
                            }
                            list2 = list3;
                            i4 = size;
                            eq8VarA.l = (((long) (z2 ? ((int) (j4 & j)) + i : (int) (j4 & j))) & j) | (((long) i5) << 32);
                        } else {
                            i4 = size;
                            j = j3;
                            list2 = list3;
                        }
                        i11++;
                        list3 = list2;
                        j3 = j;
                        size = i4;
                    }
                }
                list = list3;
                i3 = size;
            }
            i10++;
            i7 = i2;
            list3 = list;
            size = i3;
        }
        return new go8(this.a, i7, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, list3, this.n, this.o, this.p, dwaVar, this.r, this.s);
    }

    @Override // defpackage.bg9
    public final Map<d20, Integer> r() {
        return this.e.r();
    }
}
