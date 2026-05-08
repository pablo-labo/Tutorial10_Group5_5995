package defpackage;

import androidx.compose.runtime.d;
import androidx.compose.runtime.m;
import androidx.compose.runtime.n;
import defpackage.p3a;

/* JADX INFO: loaded from: classes.dex */
public final class p0a {
    public final m a;

    public p0a(m mVar) {
        this.a = mVar;
    }

    public static final void a(n nVar, int i) {
        while (nVar.v >= 0 && nVar.u <= i) {
            nVar.N();
            nVar.j();
        }
    }

    public final z3a b(nr0 nr0Var, ona onaVar) {
        m mVar;
        int i;
        Object[] objArr = onaVar.a;
        int i2 = onaVar.b;
        int i3 = 0;
        while (true) {
            mVar = this.a;
            if (i3 >= i2) {
                break;
            }
            if (mVar.g(((q0a) objArr[i3]).e)) {
                i3++;
            } else {
                p3a p3aVar = new p3a((Object) null);
                Object[] objArr2 = onaVar.a;
                int i4 = onaVar.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj = objArr2[i5];
                    if (mVar.g(((q0a) obj).e)) {
                        p3aVar.g(obj);
                    }
                }
                onaVar = p3aVar;
            }
        }
        pq pqVar = new pq(this, 12);
        if (onaVar.b > 1) {
            Comparable comparable = (Comparable) pqVar.invoke(onaVar.b(0));
            int i6 = onaVar.b;
            int i7 = 1;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                Comparable comparable2 = (Comparable) pqVar.invoke(onaVar.b(i7));
                if (comparable.compareTo(comparable2) > 0) {
                    p3a p3aVar2 = new p3a(onaVar.b);
                    Object[] objArr3 = onaVar.a;
                    int i8 = onaVar.b;
                    for (int i9 = 0; i9 < i8; i9++) {
                        p3aVar2.g(objArr3[i9]);
                    }
                    p3a.b bVar = p3aVar2.c;
                    if (bVar == null) {
                        bVar = new p3a.b(p3aVar2);
                        p3aVar2.c = bVar;
                    }
                    if (bVar.a.b > 1) {
                        w92.E0(new u45(pqVar), bVar);
                    }
                    onaVar = p3aVar2;
                } else {
                    i7++;
                    comparable = comparable2;
                }
            }
        }
        if (onaVar.d()) {
            z3a z3aVar = lnd.b;
            z3aVar.getClass();
            return z3aVar;
        }
        z3a z3aVarB = lnd.b();
        n nVarF = mVar.f();
        try {
            Object[] objArr4 = onaVar.a;
            int i10 = onaVar.b;
            for (int i11 = 0; i11 < i10; i11++) {
                q0a q0aVar = (q0a) objArr4[i11];
                int iC = nVarF.c(q0aVar.e);
                int iF = nVarF.F(iC, nVarF.b);
                a(nVarF, iF);
                a(nVarF, iF);
                while (true) {
                    i = nVarF.t;
                    if (i == iF || i == nVarF.u) {
                        break;
                    }
                    if (iF < nVarF.t(i) + i) {
                        nVarF.Q();
                    } else {
                        nVarF.M();
                    }
                }
                if (i != iF) {
                    d.c("Unexpected slot table structure");
                }
                nVarF.Q();
                nVarF.a(iC - nVarF.t);
                z3aVarB.m(q0aVar, d.e(q0aVar.c, q0aVar, nVarF, nr0Var));
            }
            a(nVarF, Integer.MAX_VALUE);
            j6g j6gVar = j6g.a;
            nVarF.e(true);
            return z3aVarB;
        } catch (Throwable th) {
            nVarF.e(false);
            throw th;
        }
    }
}
