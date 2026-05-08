package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;

/* JADX INFO: loaded from: classes2.dex */
public final class cx2 {
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        gu5Var.getClass();
        c cVarH = bVar.h(1759050593);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarG = f.g(a.b(g.f(aVar, 1.0f), o97Var.c.b.a, ytc.a), 16.0f, 8.0f);
            ehd ehdVarA = chd.a(new vs0.i(8.0f, true, new us0(0)), c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            e71.a((i2 & 14) | 48, gu5Var, cVarH, "ConversationHeaderShimmer");
            hl1.a(rx6.c(ygg.h(g.h(g.r(aVar, 40.0f), 40.0f), ggd.a(8.0f)), null, cVarH, 3), cVarH, 0);
            ob2 ob2VarA = mb2.a(new vs0.i(4.0f, true, new us0(0)), c20.a.m, cVarH, 6);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            e eVarH = g.h(g.r(aVar, 175.0f), 24.0f);
            xie xieVar = xie.c;
            rx6.a(xieVar, eVarH, null, null, null, 0, cVarH, 54);
            rx6.a(xieVar, g.h(g.r(aVar, 100.0f), 11.0f), null, null, null, 0, cVarH, 54);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new bx2(i, 0, gu5Var);
        }
    }
}
