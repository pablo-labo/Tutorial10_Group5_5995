package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sh2 implements wu5 {
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        gza gzaVar = (gza) obj;
        b bVar = (b) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gzaVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar.K(gzaVar) ? 4 : 2;
        }
        if (bVar.o(iIntValue & 1, (iIntValue & 19) != 18)) {
            e eVarE = f.e(e.a.b, gzaVar);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
            int iHashCode = Long.hashCode(bVar.k());
            t8b t8bVarM = bVar.m();
            e eVarC = c.c(bVar, eVarE);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            if (bVar.j() == null) {
                pg8.B();
                throw null;
            }
            bVar.B();
            if (bVar.f()) {
                bVar.y(aVar);
            } else {
                bVar.n();
            }
            ygg.y(bVar, ob2VarA, gl2.a.g);
            ygg.y(bVar, t8bVarM, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                uz.g(iHashCode, bVar, iHashCode, c0251a);
            }
            ygg.y(bVar, eVarC, gl2.a.d);
            bVar.q();
        } else {
            bVar.D();
        }
        return j6g.a;
    }
}
