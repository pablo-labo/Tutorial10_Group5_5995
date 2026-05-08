package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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
public final class ip9 {
    public static final void a(int i, b bVar) {
        c cVarH = bVar.h(328542677);
        if (cVarH.o(i & 1, i != 0)) {
            e.a aVar = e.a.b;
            e eVarF = f.f(g.f(aVar, 1.0f), 16.0f);
            ehd ehdVarA = chd.a(new vs0.i(16.0f, true, new us0(0)), c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            hl1.a(rx6.c(ygg.h(g.h(g.r(aVar, 20.0f), 20.0f), ggd.a(8.0f)), null, cVarH, 3), cVarH, 0);
            hl1.a(rx6.c(ygg.h(g.h(new LayoutWeightElement(1.0f, true), 48.0f), ggd.a(16.0f)), null, cVarH, 3), cVarH, 0);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gm0(i);
        }
    }
}
