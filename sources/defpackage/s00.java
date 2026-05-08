package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s00 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu5 b;

    public /* synthetic */ s00(vu5 vu5Var, int i) {
        this.a = i;
        this.b = vu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        vu5 vu5Var = this.b;
        switch (i) {
            case 0:
                gu5 gu5Var = (gu5) vu5Var;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h82.a(gu5Var, bVar, 0);
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                ah2 ah2Var = (ah2) vu5Var;
                b bVar2 = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                e eVarF = g.f(e.a.b, 1.0f);
                ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                int iHashCode = Long.hashCode(bVar2.k());
                t8b t8bVarM = bVar2.m();
                e eVarC = c.c(bVar2, eVarF);
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
                ygg.y(bVar2, ob2VarA, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                    uz.g(iHashCode, bVar2, iHashCode, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                ah2Var.q(qb2.a, bVar2, 6);
                bVar2.q();
                return j6g.a;
        }
    }
}
