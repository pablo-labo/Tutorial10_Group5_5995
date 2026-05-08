package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mzf {
    public final tjf a;
    public final tjf b;
    public final tjf c;
    public final tjf d;
    public final tjf e;
    public final tjf f;
    public final tjf g;
    public final tjf h;
    public final tjf i;
    public final tjf j;
    public final tjf k;
    public final tjf l;
    public final tjf m;
    public final tjf n;
    public final tjf o;

    public mzf(int i) {
        tjf tjfVar = szf.d;
        tjf tjfVar2 = szf.e;
        tjf tjfVar3 = szf.f;
        tjf tjfVar4 = szf.g;
        tjf tjfVar5 = szf.h;
        tjf tjfVar6 = szf.i;
        tjf tjfVar7 = szf.m;
        tjf tjfVar8 = szf.n;
        tjf tjfVar9 = szf.o;
        tjf tjfVar10 = szf.a;
        tjf tjfVar11 = szf.b;
        tjf tjfVar12 = szf.c;
        tjf tjfVar13 = szf.j;
        tjf tjfVar14 = szf.k;
        tjf tjfVar15 = szf.l;
        this.a = tjfVar;
        this.b = tjfVar2;
        this.c = tjfVar3;
        this.d = tjfVar4;
        this.e = tjfVar5;
        this.f = tjfVar6;
        this.g = tjfVar7;
        this.h = tjfVar8;
        this.i = tjfVar9;
        this.j = tjfVar10;
        this.k = tjfVar11;
        this.l = tjfVar12;
        this.m = tjfVar13;
        this.n = tjfVar14;
        this.o = tjfVar15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzf)) {
            return false;
        }
        mzf mzfVar = (mzf) obj;
        return wl7.b(this.a, mzfVar.a) && wl7.b(this.b, mzfVar.b) && wl7.b(this.c, mzfVar.c) && wl7.b(this.d, mzfVar.d) && wl7.b(this.e, mzfVar.e) && wl7.b(this.f, mzfVar.f) && wl7.b(this.g, mzfVar.g) && wl7.b(this.h, mzfVar.h) && wl7.b(this.i, mzfVar.i) && wl7.b(this.j, mzfVar.j) && wl7.b(this.k, mzfVar.k) && wl7.b(this.l, mzfVar.l) && wl7.b(this.m, mzfVar.m) && wl7.b(this.n, mzfVar.n) && wl7.b(this.o, mzfVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + t40.c(t40.c(t40.c(t40.c(t40.c(t40.c(t40.c(t40.c(t40.c(t40.c(t40.c(t40.c(t40.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.a + ", displayMedium=" + this.b + ",displaySmall=" + this.c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f + ", titleLarge=" + this.g + ", titleMedium=" + this.h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.l + ", labelLarge=" + this.m + ", labelMedium=" + this.n + ", labelSmall=" + this.o + ')';
    }

    public mzf() {
        this(0);
    }
}
