package defpackage;

import defpackage.ab1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ab1<T extends ab1<T>> {
    public final le0 a;
    public final long b;
    public final mif c;
    public final roa d;
    public final yif e;
    public long f;
    public final le0 g;

    public ab1(le0 le0Var, long j, mif mifVar, roa roaVar, yif yifVar) {
        this.a = le0Var;
        this.b = j;
        this.c = mifVar;
        this.d = roaVar;
        this.e = yifVar;
        this.f = j;
        this.g = le0Var;
    }

    public final Integer a() {
        mif mifVar = this.c;
        if (mifVar == null) {
            return null;
        }
        q1a q1aVar = mifVar.b;
        int iE = kjf.e(this.f);
        roa roaVar = this.d;
        return Integer.valueOf(roaVar.a(q1aVar.c(q1aVar.d(roaVar.c(iE)), true)));
    }

    public final Integer b() {
        mif mifVar = this.c;
        if (mifVar == null) {
            return null;
        }
        int iF = kjf.f(this.f);
        roa roaVar = this.d;
        return Integer.valueOf(roaVar.a(mifVar.g(mifVar.b.d(roaVar.c(iF)))));
    }

    public final Integer c() {
        int length;
        mif mifVar = this.c;
        if (mifVar == null) {
            return null;
        }
        int iP = p();
        while (true) {
            le0 le0Var = this.a;
            if (iP < le0Var.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (iP <= length2) {
                    length2 = iP;
                }
                long j = mifVar.j(length2);
                int i = kjf.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > iP) {
                    length = this.d.a(i2);
                    break;
                }
                iP++;
            } else {
                length = le0Var.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iA;
        mif mifVar = this.c;
        if (mifVar == null) {
            return null;
        }
        int iP = p();
        while (true) {
            if (iP <= 0) {
                iA = 0;
                break;
            }
            int length = this.g.b.length() - 1;
            if (iP <= length) {
                length = iP;
            }
            long j = mifVar.j(length);
            int i = kjf.c;
            int i2 = (int) (j >> 32);
            if (i2 < iP) {
                iA = this.d.a(i2);
                break;
            }
            iP--;
        }
        return Integer.valueOf(iA);
    }

    public final boolean e() {
        mif mifVar = this.c;
        return (mifVar != null ? mifVar.h(p()) : null) != b5d.b;
    }

    public final int f(mif mifVar, int i) {
        int iP = p();
        yif yifVar = this.e;
        if (yifVar.a == null) {
            yifVar.a = Float.valueOf(mifVar.c(iP).a);
        }
        q1a q1aVar = mifVar.b;
        int iD = q1aVar.d(iP) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= q1aVar.f) {
            return this.g.b.length();
        }
        float fB = q1aVar.b(iD) - 1.0f;
        Float f = yifVar.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((e() && fFloatValue >= mifVar.f(iD)) || (!e() && fFloatValue <= mifVar.e(iD))) {
            return q1aVar.c(iD, true);
        }
        return this.d.a(q1aVar.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    public final void g() {
        yif yifVar = this.e;
        yifVar.a = null;
        le0 le0Var = this.g;
        if (le0Var.b.length() > 0) {
            if (e()) {
                i();
                return;
            }
            yifVar.a = null;
            if (le0Var.b.length() > 0) {
                String str = le0Var.b;
                long j = this.f;
                int i = kjf.c;
                int iC = wea.c((int) (j & 4294967295L), str);
                if (iC != -1) {
                    o(iC, iC);
                }
            }
        }
    }

    public final void h() {
        this.e.a = null;
        le0 le0Var = this.g;
        String str = le0Var.b;
        String str2 = le0Var.b;
        if (str.length() > 0) {
            int iZ = zkd.z(str2, kjf.e(this.f));
            if (iZ == kjf.e(this.f) && iZ != str2.length()) {
                iZ = zkd.z(str2, iZ + 1);
            }
            o(iZ, iZ);
        }
    }

    public final void i() {
        this.e.a = null;
        le0 le0Var = this.g;
        if (le0Var.b.length() > 0) {
            String str = le0Var.b;
            long j = this.f;
            int i = kjf.c;
            int iD = wea.d((int) (j & 4294967295L), str);
            if (iD != -1) {
                o(iD, iD);
            }
        }
    }

    public final void j() {
        this.e.a = null;
        le0 le0Var = this.g;
        String str = le0Var.b;
        String str2 = le0Var.b;
        if (str.length() > 0) {
            int iA = zkd.A(str2, kjf.f(this.f));
            if (iA == kjf.f(this.f) && iA != 0) {
                iA = zkd.A(str2, iA - 1);
            }
            o(iA, iA);
        }
    }

    public final void k() {
        yif yifVar = this.e;
        yifVar.a = null;
        le0 le0Var = this.g;
        if (le0Var.b.length() > 0) {
            if (!e()) {
                i();
                return;
            }
            yifVar.a = null;
            if (le0Var.b.length() > 0) {
                String str = le0Var.b;
                long j = this.f;
                int i = kjf.c;
                int iC = wea.c((int) (j & 4294967295L), str);
                if (iC != -1) {
                    o(iC, iC);
                }
            }
        }
    }

    public final void l() {
        Integer numA;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numA = a()) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        o(iIntValue, iIntValue);
    }

    public final void m() {
        Integer numB;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        o(iIntValue, iIntValue);
    }

    public final void n() {
        if (this.g.b.length() > 0) {
            int i = kjf.c;
            this.f = cr8.c((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void o(int i, int i2) {
        this.f = cr8.c(i, i2);
    }

    public final int p() {
        long j = this.f;
        int i = kjf.c;
        return this.d.c((int) (j & 4294967295L));
    }
}
