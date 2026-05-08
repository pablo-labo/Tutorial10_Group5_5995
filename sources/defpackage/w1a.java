package defpackage;

import defpackage.p2e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w1a implements uzd {
    public final long a;
    public final n30 b;
    public final ye c;
    public mif e;
    public final w1a d = this;
    public int f = -1;

    public w1a(long j, n30 n30Var, ye yeVar) {
        this.a = j;
        this.b = n30Var;
        this.c = yeVar;
    }

    @Override // defpackage.uzd
    public final long a(p2e p2eVar, boolean z) {
        mif mifVar;
        p2e.a aVar = p2eVar.b;
        p2e.a aVar2 = p2eVar.a;
        long j = this.a;
        if (z && aVar2.c != j) {
            return 9205357640488583168L;
        }
        if ((!z && aVar.c != j) || d() == null || (mifVar = (mif) this.c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return zte.b(mifVar, nic.C(z ? aVar2.b : aVar.b, 0, n(mifVar)), z, p2eVar.c);
    }

    @Override // defpackage.uzd
    public final float b(int i) {
        q1a q1aVar;
        int iD;
        mif mifVar = (mif) this.c.invoke();
        if (mifVar != null && (iD = (q1aVar = mifVar.b).d(i)) < q1aVar.f) {
            return mifVar.f(iD);
        }
        return -1.0f;
    }

    @Override // defpackage.uzd
    public final float c(int i) {
        mif mifVar = (mif) this.c.invoke();
        if (mifVar != null) {
            return jif.a(mifVar, i);
        }
        return 0.0f;
    }

    @Override // defpackage.uzd
    public final sl8 d() {
        sl8 sl8Var = (sl8) this.b.invoke();
        if (sl8Var == null || !sl8Var.d()) {
            return null;
        }
        return sl8Var;
    }

    @Override // defpackage.uzd
    public final float e(int i) {
        q1a q1aVar;
        int iD;
        mif mifVar = (mif) this.c.invoke();
        if (mifVar != null && (iD = (q1aVar = mifVar.b).d(i)) < q1aVar.f) {
            return mifVar.e(iD);
        }
        return -1.0f;
    }

    @Override // defpackage.uzd
    public final int f() {
        mif mifVar = (mif) this.c.invoke();
        if (mifVar == null) {
            return 0;
        }
        return n(mifVar);
    }

    @Override // defpackage.uzd
    public final float g(int i) {
        q1a q1aVar;
        int iD;
        mif mifVar = (mif) this.c.invoke();
        if (mifVar == null || (iD = (q1aVar = mifVar.b).d(i)) >= q1aVar.f) {
            return -1.0f;
        }
        float f = q1aVar.f(iD);
        return ((q1aVar.b(iD) - f) / 2.0f) + f;
    }

    @Override // defpackage.uzd
    public final le0 getText() {
        mif mifVar = (mif) this.c.invoke();
        return mifVar == null ? new le0("") : mifVar.a.a;
    }

    @Override // defpackage.uzd
    public final qtc h(int i) {
        int length;
        mif mifVar = (mif) this.c.invoke();
        return (mifVar != null && (length = mifVar.a.a.b.length()) >= 1) ? mifVar.b(nic.C(i, 0, length - 1)) : qtc.e;
    }

    @Override // defpackage.uzd
    public final long i() {
        return this.a;
    }

    @Override // defpackage.uzd
    public final mif j() {
        return (mif) this.c.invoke();
    }

    @Override // defpackage.uzd
    public final void k(v3e v3eVar) {
        mif mifVar;
        v3e v3eVar2;
        n54 n54Var;
        n54 n54Var2;
        n54 n54Var3;
        long j;
        n54 n54VarA;
        n54 n54Var4;
        n54 n54Var5;
        n54 n54VarA2;
        int i;
        p2e.a aVar;
        p2e.a aVar2;
        sl8 sl8VarD = d();
        if (sl8VarD == null || (mifVar = (mif) this.c.invoke()) == null) {
            return;
        }
        sl8 sl8Var = v3eVar.c;
        boolean z = v3eVar.d;
        long jG = sl8Var.G(sl8VarD, 0L);
        long jE = ooa.e(v3eVar.a, jG);
        long j2 = v3eVar.b;
        long jE2 = (j2 & 9223372034707292159L) == 9205357640488583168L ? 9205357640488583168L : ooa.e(j2, jG);
        long j3 = mifVar.c;
        float f = (int) (j3 >> 32);
        float f2 = (int) (j3 & 4294967295L);
        int i2 = (int) (jE >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        n54 n54Var6 = n54.c;
        n54 n54Var7 = n54.a;
        n54 n54Var8 = n54.b;
        n54 n54Var9 = fIntBitsToFloat < 0.0f ? n54Var7 : Float.intBitsToFloat(i2) > f ? n54Var6 : n54Var8;
        int i3 = (int) (jE & 4294967295L);
        if (Float.intBitsToFloat(i3) < 0.0f) {
            n54Var6 = n54Var7;
        } else if (Float.intBitsToFloat(i3) <= f2) {
            n54Var6 = n54Var8;
        }
        f4e f4eVar = v3eVar.f;
        p2e p2eVar = v3eVar.e;
        long j4 = this.a;
        if (z) {
            n54Var = n54Var9;
            n54 n54Var10 = n54Var6;
            n54VarA2 = x1a.a(n54Var, n54Var10, v3eVar, j4, p2eVar != null ? p2eVar.b : null);
            v3eVar2 = v3eVar;
            j = j4;
            n54VarA = n54VarA2;
            n54Var3 = n54VarA;
            n54Var4 = n54Var10;
            n54Var5 = n54Var;
            n54Var2 = n54Var4;
        } else {
            v3eVar2 = v3eVar;
            n54Var = n54Var9;
            n54Var2 = n54Var6;
            n54Var3 = n54Var2;
            j = j4;
            n54VarA = x1a.a(n54Var, n54Var2, v3eVar2, j4, p2eVar != null ? p2eVar.a : null);
            n54Var4 = n54VarA;
            n54Var5 = n54Var4;
            n54VarA2 = n54Var;
        }
        n54 n54VarA3 = w3e.a(n54Var, n54Var2);
        if (n54VarA3 == n54Var8 || n54VarA3 != n54VarA) {
            int length = mifVar.a.a.b.length();
            if (z) {
                int iB = x1a.b(jE, mifVar);
                if (p2eVar == null || (aVar2 = p2eVar.b) == null) {
                    length = iB;
                } else {
                    int iCompare = f4eVar.compare(Long.valueOf(aVar2.c), Long.valueOf(j));
                    if (iCompare < 0) {
                        length = 0;
                    } else if (iCompare <= 0) {
                        length = aVar2.b;
                    }
                }
                i = iB;
            } else {
                int iB2 = x1a.b(jE, mifVar);
                if (p2eVar == null || (aVar = p2eVar.a) == null) {
                    length = iB2;
                } else {
                    int iCompare2 = f4eVar.compare(Long.valueOf(aVar.c), Long.valueOf(j));
                    if (iCompare2 < 0) {
                        length = 0;
                    } else if (iCompare2 <= 0) {
                        length = aVar.b;
                    }
                }
                i = length;
                length = iB2;
            }
            int iB3 = (jE2 & 9223372034707292159L) == 9205357640488583168L ? -1 : x1a.b(jE2, mifVar);
            int i4 = v3eVar2.k + 2;
            v3eVar2.k = i4;
            n54 n54Var11 = n54Var4;
            int i5 = length;
            n54 n54Var12 = n54VarA2;
            long j5 = j;
            vzd vzdVar = new vzd(j5, i4, i, i5, iB3, mifVar);
            v3eVar2.i = v3eVar2.a(v3eVar2.i, n54Var5, n54Var11);
            v3eVar2.j = v3eVar2.a(v3eVar2.j, n54Var12, n54Var3);
            i3a i3aVar = v3eVar2.g;
            ArrayList arrayList = v3eVar2.h;
            i3aVar.e(arrayList.size(), j5);
            arrayList.add(vzdVar);
        }
    }

    @Override // defpackage.uzd
    public final p2e l() {
        mif mifVar = (mif) this.c.invoke();
        if (mifVar == null) {
            return null;
        }
        int length = mifVar.a.a.b.length();
        b5d b5dVarA = mifVar.a(0);
        long j = this.a;
        return new p2e(new p2e.a(b5dVarA, 0, j), new p2e.a(mifVar.a(Math.max(length - 1, 0)), length, j), false);
    }

    @Override // defpackage.uzd
    public final long m(int i) {
        mif mifVar = (mif) this.c.invoke();
        if (mifVar == null) {
            return kjf.b;
        }
        q1a q1aVar = mifVar.b;
        int iN = n(mifVar);
        if (iN < 1) {
            return kjf.b;
        }
        int iD = q1aVar.d(nic.C(i, 0, iN - 1));
        return cr8.c(mifVar.g(iD), q1aVar.c(iD, true));
    }

    public final int n(mif mifVar) {
        int i;
        synchronized (this.d) {
            try {
                if (this.e != mifVar) {
                    q1a q1aVar = mifVar.b;
                    boolean z = q1aVar.c;
                    int i2 = 0;
                    if (!(z || ((float) ((int) (mifVar.c & 4294967295L))) < q1aVar.e) || z) {
                        i2 = q1aVar.f - 1;
                    } else {
                        int iE = q1aVar.e((int) (mifVar.c & 4294967295L));
                        int i3 = mifVar.b.f - 1;
                        if (iE > i3) {
                            iE = i3;
                        }
                        while (iE >= 0 && mifVar.b.f(iE) >= ((int) (mifVar.c & 4294967295L))) {
                            iE--;
                        }
                        if (iE >= 0) {
                            i2 = iE;
                        }
                    }
                    this.f = mifVar.b.c(i2, true);
                    this.e = mifVar;
                }
                i = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }
}
