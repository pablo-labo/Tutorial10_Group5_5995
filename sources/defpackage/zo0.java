package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;

/* JADX INFO: loaded from: classes3.dex */
public final class zo0 {
    public static final void a(e eVar, b bVar, int i) {
        eVar.getClass();
        c cVarH = bVar.h(1230022974);
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            vs0.i iVar = new vs0.i(8.0f, true, new xd(c20.a.m, 4));
            e eVarJ = f.j(f.g(a.b(g.f(ygg.h(eVar, ggd.a(8.0f)), 1.0f), o97Var.c.b.c, ytc.a), 8.0f, 8.0f), 10.0f, 0.0f, 0.0f, 0.0f, 14);
            ehd ehdVarA = chd.a(iVar, c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
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
            f17.a(z2b.a(R.drawable.withdraw_icon, 0, cVarH), null, g.n(e.a.b, 24.0f), null, null, 0.0f, null, cVarH, 432, 120);
            cif.b(ak2.I(R.string.application_withdraw, cVarH), null, o97Var.c.a.c, 0L, null, to5.d0, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.b, cVarH, 196608, 0, 65498);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new yo0(eVar, i, 0);
        }
    }
}
