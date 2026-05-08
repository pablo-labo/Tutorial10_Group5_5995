package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes.dex */
public final class b7c implements wu5<Boolean, b, Integer, j6g> {
    public final /* synthetic */ long a;
    public final /* synthetic */ g7c b;

    public b7c(long j, g7c g7cVar) {
        this.a = j;
        this.b = g7cVar;
    }

    @Override // defpackage.wu5
    public final j6g q(Boolean bool, b bVar, Integer num) {
        b bVar2;
        boolean zBooleanValue = bool.booleanValue();
        b bVar3 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar3.a(zBooleanValue) ? 4 : 2;
        }
        if (bVar3.o(iIntValue & 1, (iIntValue & 19) != 18)) {
            e.a aVar = e.a.b;
            e eVarD = g.d(aVar, 1.0f);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iG = bVar3.G();
            t8b t8bVarM = bVar3.m();
            e eVarC = c.c(bVar3, eVarD);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            if (bVar3.j() == null) {
                pg8.B();
                throw null;
            }
            bVar3.B();
            if (bVar3.f()) {
                bVar3.y(aVar2);
            } else {
                bVar3.n();
            }
            ygg.y(bVar3, ag9VarD, gl2.a.g);
            ygg.y(bVar3, t8bVarM, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iG))) {
                uz.g(iG, bVar3, iG, c0251a);
            }
            ygg.y(bVar3, eVarC, gl2.a.d);
            float f = c7c.b;
            float f2 = c7c.c;
            float f3 = (f + f2) * 2.0f;
            long j = this.a;
            if (zBooleanValue) {
                bVar3.L(-1916609863);
                bVar2 = bVar3;
                c3c.a(g.n(aVar, f3), j, f2, 0L, 0, bVar2, 390);
                bVar2.F();
            } else {
                bVar2 = bVar3;
                bVar2.L(-1916362142);
                c7c.a(this.b, j, g.n(aVar, f3), bVar3, 384);
                bVar2.F();
            }
            bVar2.q();
        } else {
            bVar3.D();
        }
        return j6g.a;
    }
}
