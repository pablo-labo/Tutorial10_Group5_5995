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
import defpackage.o97;
import defpackage.pm8;
import defpackage.ytc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class cka {
    public static final void a(ArrayList arrayList, b bVar, int i) {
        c cVar;
        c cVarH = bVar.h(2054975739);
        int i2 = i | (cVarH.x(arrayList) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            ne4 ne4Var = p97.a;
            o97 o97Var = (o97) cVarH.M(ne4Var);
            long j = ((o97) cVarH.M(ne4Var)).c.b.f.b;
            ytc.a aVar = ytc.a;
            e.a aVar2 = e.a.b;
            e eVarB = a.b(aVar2, j, aVar);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            e eVarF = g.f(aVar2, 1.0f);
            o97.b bVar2 = o97Var.e;
            fif.b(ak2.I(R.string.keep_track_of_applications_on_other_sites, cVarH), f.e(eVarF, f.b(bkf.c(bVar2.d), bkf.c(bVar2.f), 0.0f, 4.0f, 4)), pa2.a(R.color.non_ia_inline_heading_color, cVarH), 0L, null, null, 0L, null, new dcf(1), 0L, 0, false, 0, 0, null, hz6.g, cVarH, 0, 0, 65016);
            cVar = cVarH;
            sx1.a(new tx1(arrayList, ((o97) cVar.M(ne4Var)).c.b.f.a, w74.e), cVar, 0);
            jh2.f(cVar, g.h(aVar2, bkf.c(bVar2.h)));
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new lb(arrayList, i, 11);
        }
    }
}
