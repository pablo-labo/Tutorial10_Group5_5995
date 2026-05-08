package defpackage;

import defpackage.pn5;
import defpackage.ut9;

/* JADX INFO: loaded from: classes.dex */
public final class j3b {
    public String a;
    public tjf b;
    public pn5.a c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public iy3 i;
    public h80 j;
    public boolean k;
    public ut9 m;
    public h3b n;
    public vl8 o;
    public long s;
    public long h = ge7.a;
    public long l = 0;
    public long p = mq2.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public j3b(String str, tjf tjfVar, pn5.a aVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = tjfVar;
        this.c = aVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long f(j3b j3bVar, long j, vl8 vl8Var) {
        tjf tjfVar = j3bVar.b;
        ut9 ut9Var = j3bVar.m;
        iy3 iy3Var = j3bVar.i;
        iy3Var.getClass();
        ut9 ut9VarA = ut9.a.a(ut9Var, vl8Var, tjfVar, iy3Var, j3bVar.c);
        j3bVar.m = ut9VarA;
        return ut9VarA.a(j3bVar.g, j);
    }

    public final int a(int i, vl8 vl8Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = mq2.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, vl8Var);
        }
        h3b h3bVarE = e(vl8Var);
        long jA2 = zm8.a(jA, this.e, this.d, h3bVarE.b());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iA = rdf.a(new h80((k80) h3bVarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jA2).d());
        int i6 = iq2.i(jA);
        if (iA < i6) {
            iA = i6;
        }
        this.q = i;
        this.r = iA;
        return iA;
    }

    public final boolean b(long j, vl8 vl8Var) {
        h3b h3bVar;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, vl8Var) : j;
        h80 h80Var = this.j;
        boolean z2 = false;
        if (h80Var != null && (h3bVar = this.n) != null && !h3bVar.a() && vl8Var == this.o && (iq2.b(jF, this.p) || (iq2.h(jF) == iq2.h(this.p) && iq2.j(jF) == iq2.j(this.p) && iq2.g(jF) >= h80Var.d() && !h80Var.d.d))) {
            if (!iq2.b(jF, this.p)) {
                h80 h80Var2 = this.j;
                h80Var2.getClass();
                this.l = mq2.d(jF, (((long) rdf.a(Math.min(h80Var2.a.i.c(), h80Var2.h()))) << 32) | (((long) rdf.a(h80Var2.d())) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= h80Var2.h() && ((int) (4294967295L & r12)) >= h80Var2.d())) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        h3b h3bVarE = e(vl8Var);
        long jA = zm8.a(jF, this.e, this.d, h3bVarE.b());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        h80 h80Var3 = new h80((k80) h3bVarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jA);
        this.p = jF;
        this.l = mq2.d(jF, (((long) rdf.a(h80Var3.d())) & 4294967295L) | (((long) rdf.a(h80Var3.h())) << 32));
        if (this.d != 3 && (((int) (r1 >> 32)) < h80Var3.h() || ((int) (r1 & 4294967295L)) < h80Var3.d())) {
            z2 = true;
        }
        this.k = z2;
        this.j = h80Var3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = mq2.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(iy3 iy3Var) {
        long jA;
        iy3 iy3Var2 = this.i;
        if (iy3Var != null) {
            int i = ge7.b;
            jA = ge7.a(iy3Var.getDensity(), iy3Var.p1());
        } else {
            jA = ge7.a;
        }
        if (iy3Var2 == null) {
            this.i = iy3Var;
            this.h = jA;
        } else if (iy3Var == null || this.h != jA) {
            this.i = iy3Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final h3b e(vl8 vl8Var) {
        h3b k80Var = this.n;
        if (k80Var == null || vl8Var != this.o || k80Var.a()) {
            this.o = vl8Var;
            String str = this.a;
            tjf tjfVarY = web.y(this.b, vl8Var);
            iy3 iy3Var = this.i;
            iy3Var.getClass();
            pn5.a aVar = this.c;
            zr4 zr4Var = zr4.a;
            k80Var = new k80(str, tjfVarY, zr4Var, zr4Var, aVar, iy3Var);
        }
        this.n = k80Var;
        return k80Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) ge7.b(this.h));
        sb.append(", history=");
        return r6.d(this.s, ", constraints=$)", sb);
    }
}
