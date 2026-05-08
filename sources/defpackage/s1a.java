package defpackage;

import defpackage.le0;
import defpackage.pn5;
import defpackage.ut9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s1a {
    public le0 a;
    public pn5.a b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List<le0.c<sab>> g;
    public ut9 h;
    public iy3 j;
    public tjf k;
    public r1a l;
    public vl8 m;
    public mif n;
    public long q;
    public long i = ge7.a;
    public int o = -1;
    public int p = -1;

    public s1a(le0 le0Var, tjf tjfVar, pn5.a aVar, int i, boolean z, int i2, int i3, List list) {
        this.a = le0Var;
        this.b = aVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = tjfVar;
    }

    public final int a(int i, vl8 vl8Var) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = mq2.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            ut9 ut9Var = this.h;
            tjf tjfVar = this.k;
            iy3 iy3Var = this.j;
            iy3Var.getClass();
            ut9 ut9VarA = ut9.a.a(ut9Var, vl8Var, tjfVar, iy3Var, this.b);
            this.h = ut9VarA;
            jA = ut9VarA.a(this.f, jA);
        }
        int iA = rdf.a(b(jA, vl8Var).e);
        int i4 = iq2.i(jA);
        if (iA < i4) {
            iA = i4;
        }
        this.o = i;
        this.p = iA;
        return iA;
    }

    public final q1a b(long j, vl8 vl8Var) {
        r1a r1aVarE = e(vl8Var);
        long jA = zm8.a(j, this.d, this.c, r1aVarE.b());
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new q1a(r1aVarE, jA, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, vl8 vl8Var) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            ut9 ut9Var = this.h;
            tjf tjfVar = this.k;
            iy3 iy3Var = this.j;
            iy3Var.getClass();
            ut9 ut9VarA = ut9.a.a(ut9Var, vl8Var, tjfVar, iy3Var, this.b);
            this.h = ut9VarA;
            j = ut9VarA.a(this.f, j);
        }
        mif mifVar = this.n;
        if (mifVar != null) {
            q1a q1aVar = mifVar.b;
            kif kifVar = mifVar.a;
            if (!q1aVar.a.a()) {
                vl8 vl8Var2 = kifVar.h;
                long j2 = kifVar.j;
                if (vl8Var == vl8Var2 && (iq2.b(j, j2) || (iq2.h(j) == iq2.h(j2) && iq2.j(j) == iq2.j(j2) && iq2.g(j) >= q1aVar.e && !q1aVar.c))) {
                    mif mifVar2 = this.n;
                    mifVar2.getClass();
                    if (iq2.b(j, mifVar2.a.j)) {
                        return false;
                    }
                    mif mifVar3 = this.n;
                    mifVar3.getClass();
                    this.n = f(vl8Var, j, mifVar3.b);
                    return true;
                }
            }
        }
        this.n = f(vl8Var, j, b(j, vl8Var));
        return true;
    }

    public final void d(iy3 iy3Var) {
        long jA;
        iy3 iy3Var2 = this.j;
        if (iy3Var != null) {
            int i = ge7.b;
            jA = ge7.a(iy3Var.getDensity(), iy3Var.p1());
        } else {
            jA = ge7.a;
        }
        if (iy3Var2 == null) {
            this.j = iy3Var;
            this.i = jA;
        } else if (iy3Var == null || this.i != jA) {
            this.j = iy3Var;
            this.i = jA;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final r1a e(vl8 vl8Var) {
        r1a r1aVar = this.l;
        if (r1aVar == null || vl8Var != this.m || r1aVar.a()) {
            this.m = vl8Var;
            le0 le0Var = this.a;
            tjf tjfVarY = web.y(this.k, vl8Var);
            iy3 iy3Var = this.j;
            iy3Var.getClass();
            pn5.a aVar = this.b;
            List list = this.g;
            if (list == null) {
                list = zr4.a;
            }
            r1aVar = new r1a(le0Var, tjfVarY, list, iy3Var, aVar);
        }
        this.l = r1aVar;
        return r1aVar;
    }

    public final mif f(vl8 vl8Var, long j, q1a q1aVar) {
        float fMin = Math.min(q1aVar.a.b(), q1aVar.d);
        le0 le0Var = this.a;
        tjf tjfVar = this.k;
        List list = this.g;
        if (list == null) {
            list = zr4.a;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        iy3 iy3Var = this.j;
        iy3Var.getClass();
        return new mif(new kif(le0Var, tjfVar, list, i, z, i2, iy3Var, vl8Var, this.b, j), q1aVar, mq2.d(j, (((long) rdf.a(fMin)) << 32) | (((long) rdf.a(q1aVar.e)) & 4294967295L)));
    }

    public final String toString() {
        kif kifVar;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object iq2Var = "null";
        sb.append(this.n != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) ge7.b(this.i));
        sb.append(", history=");
        sb.append(this.q);
        sb.append(", constraints=");
        mif mifVar = this.n;
        if (mifVar != null && (kifVar = mifVar.a) != null) {
            iq2Var = new iq2(kifVar.j);
        }
        sb.append(iq2Var);
        sb.append(')');
        return sb.toString();
    }
}
