package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hl1 {
    public static final z3a<c20, ag9> a = c(true);
    public static final z3a<c20, ag9> b = c(false);
    public static final a c;

    public static final class a implements ag9 {
        public static final a a = new a();

        @Override // defpackage.ag9
        public final bg9 c(q qVar, List<? extends vf9> list, long j) {
            return qVar.Y0(iq2.j(j), iq2.i(j), bs4.a, new lt(1));
        }
    }

    static {
        new kl1(c20.a.a, false);
        c = a.a;
    }

    public static final void a(e eVar, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-211209833);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(cVarH.T);
            e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
            t8b t8bVarP = cVarH.P();
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, c, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            ygg.y(cVarH, eVarC, gl2.a.d);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gl1(eVar, i, i3);
        }
    }

    public static final void b(w.a aVar, w wVar, vf9 vf9Var, vl8 vl8Var, int i, int i2, c20 c20Var) {
        af1 af1Var;
        Object objG = vf9Var.g();
        el1 el1Var = objG instanceof el1 ? (el1) objG : null;
        w.a.w(aVar, wVar, ((el1Var == null || (af1Var = el1Var.d0) == null) ? c20Var : af1Var).a((((long) wVar.a) << 32) | (((long) wVar.b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), vl8Var));
    }

    public static final z3a<c20, ag9> c(boolean z) {
        z3a<c20, ag9> z3aVar = new z3a<>(9);
        af1 af1Var = c20.a.a;
        z3aVar.m(af1Var, new kl1(af1Var, z));
        af1 af1Var2 = c20.a.b;
        z3aVar.m(af1Var2, new kl1(af1Var2, z));
        af1 af1Var3 = c20.a.c;
        z3aVar.m(af1Var3, new kl1(af1Var3, z));
        af1 af1Var4 = c20.a.d;
        z3aVar.m(af1Var4, new kl1(af1Var4, z));
        af1 af1Var5 = c20.a.e;
        z3aVar.m(af1Var5, new kl1(af1Var5, z));
        af1 af1Var6 = c20.a.f;
        z3aVar.m(af1Var6, new kl1(af1Var6, z));
        af1 af1Var7 = c20.a.g;
        z3aVar.m(af1Var7, new kl1(af1Var7, z));
        af1 af1Var8 = c20.a.h;
        z3aVar.m(af1Var8, new kl1(af1Var8, z));
        af1 af1Var9 = c20.a.i;
        z3aVar.m(af1Var9, new kl1(af1Var9, z));
        return z3aVar;
    }

    public static final ag9 d(c20 c20Var, boolean z) {
        ag9 ag9VarD = (z ? a : b).d(c20Var);
        return ag9VarD == null ? new kl1(c20Var, z) : ag9VarD;
    }
}
