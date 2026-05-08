package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes.dex */
public final class yfe {
    public static final void a(e eVar, ah2 ah2Var, b bVar, int i) {
        c cVarH = bVar.h(-1854833411);
        int i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = xfe.a;
                cVarH.p(objV);
            }
            ag9 ag9Var = (ag9) objV;
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9Var, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            ah2Var.invoke(cVarH, 6);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new iu(eVar, i, 3, ah2Var);
        }
    }
}
