package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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

/* JADX INFO: loaded from: classes3.dex */
public final class dq4 {
    public static final void a(int i, gu5 gu5Var, b bVar, String str) {
        gu5Var.getClass();
        c cVarH = bVar.h(1107257722);
        int i2 = (cVarH.K(str) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            b(i2 & 126, gu5Var, cVarH, str);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new tt2(str, i, 1, gu5Var);
        }
    }

    public static final void b(int i, gu5 gu5Var, b bVar, String str) {
        String str2;
        int i2;
        gu5 gu5Var2 = gu5Var;
        c cVarH = bVar.h(-2039623889);
        int i3 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.x(gu5Var2) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            ue7.a(ak2.I(R.string.contact_information_email_label, cVarH), true, null, kyb.b, 0.0f, null, cVarH, 3120, 52);
            o97.g gVar = o97Var.i;
            e eVarJ = f.j(g.f(g.h(aVar, 48.0f), 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            ehd ehdVarA = chd.a(vs0.g, c20.a.k, cVarH, 54);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            cif.b(str, f.j(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, o97Var.j.f, cVarH, i3 & 14, 3120, 55292);
            str2 = str;
            cVarH = cVarH;
            i2 = 1;
            gu5Var2 = gu5Var;
            gt6.k(ak2.I(R.string.contact_information_edit_email_button_text, cVarH), gu5Var2, androidx.compose.ui.platform.f.a(g.c(aVar, 1.0f), "EditEmailButton"), null, false, null, fv6.q0, cVarH, (i3 & 112) | 12583296, 376);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            str2 = str;
            i2 = 1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ko0(str2, gu5Var2, i, i2);
        }
    }
}
