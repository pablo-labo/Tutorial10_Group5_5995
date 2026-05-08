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
public final class ho0 {
    public static final void a(int i, b bVar, e eVar, String str) {
        eVar.getClass();
        c cVarH = bVar.h(-1344144181);
        int i2 = i | (cVarH.K(str) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            vs0.i iVar = new vs0.i(8.0f, true, new xd(c20.a.n, 4));
            e eVarG = f.g(a.b(ygg.h(eVar, ((dde) cVarH.M(fde.a)).b), pa2.a(R.color.error_message_bg, cVarH), ytc.a), 8.0f, 8.0f);
            ehd ehdVarA = chd.a(iVar, c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
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
            f17.a(z2b.a(R.drawable.warning_icon, 0, cVarH), ak2.I(R.string.icon, cVarH), g.n(e.a.b, bkf.c(o97Var.e.d)), null, null, 0.0f, null, cVarH, 0, 120);
            cif.b(str, null, pa2.a(R.color.error_message_text, cVarH), hh2.t(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.b, cVarH, ((i2 >> 3) & 14) | 3072, 0, 65522);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new go0(eVar, str, i, 0);
        }
    }
}
