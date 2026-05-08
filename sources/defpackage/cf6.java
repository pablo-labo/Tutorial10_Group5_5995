package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.BuildConfig;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;

/* JADX INFO: loaded from: classes2.dex */
public final class cf6 {
    public static final void a(int i, b bVar) {
        c cVarH = bVar.h(582588202);
        if (cVarH.o(i & 1, i != 0)) {
            String strJ = ak2.J(R.string.hamburger_menu_version_info_title, new Object[]{BuildConfig.VERSION_NAME}, cVarH);
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            e eVarF = g.f(f.g(e.a.b, 16.0f, 24.0f), 1.0f);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
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
            g3e.a(null, bh2.c(162014851, new o61(2, o97Var, strJ), cVarH), cVarH, 48);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new c10(i, 6);
        }
    }
}
