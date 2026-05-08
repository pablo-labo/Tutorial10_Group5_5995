package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes.dex */
public final class kmb implements wu5<gza, b, Integer, j6g> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object[] c;
    public final /* synthetic */ c3a d;

    public kmb(String str, String str2, Object[] objArr, c3a c3aVar) {
        this.a = str;
        this.b = str2;
        this.c = objArr;
        this.d = c3aVar;
    }

    @Override // defpackage.wu5
    public final j6g q(gza gzaVar, b bVar, Integer num) throws Exception {
        gza gzaVar2 = gzaVar;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.K(gzaVar2) ? 4 : 2;
        }
        if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
            e eVarE = f.e(e.a.b, gzaVar2);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(bVar2.k());
            t8b t8bVarM = bVar2.m();
            e eVarC = c.c(bVar2, eVarE);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            if (bVar2.j() == null) {
                pg8.B();
                throw null;
            }
            bVar2.B();
            if (bVar2.f()) {
                bVar2.y(aVar);
            } else {
                bVar2.n();
            }
            ygg.y(bVar2, ag9VarD, gl2.a.g);
            ygg.y(bVar2, t8bVarM, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                uz.g(iHashCode, bVar2, iHashCode, c0251a);
            }
            ygg.y(bVar2, eVarC, gl2.a.d);
            wg2.M(this.a, this.b, bVar2, this.c[this.d.e()]);
            bVar2.q();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
