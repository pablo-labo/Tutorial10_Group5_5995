package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gr9 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gr9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((il5) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        hr9.a((lx7) it.next(), bVar, 0);
                    }
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ah2 ah2Var = (ah2) obj4;
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
            default:
                iq2 iq2Var = (iq2) obj3;
                long j = ((chf) obj4).f;
                long j2 = iq2Var.a;
                int iJ = iq2.j(j2);
                long j3 = iq2Var.a;
                w wVarR = ((vf9) obj2).R(iq2.a(nic.C((int) (j >> 32), iJ, iq2.h(j3)), 0, nic.C((int) (j & 4294967295L), iq2.i(j3), iq2.g(j3)), 0, 10, j2));
                return ((q) obj).Y0(wVarR.a, wVarR.b, bs4.a, new me(wVarR, 21));
        }
    }
}
