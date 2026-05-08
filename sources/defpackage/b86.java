package defpackage;

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
import defpackage.vs0;

/* JADX INFO: loaded from: classes2.dex */
public final class b86 {
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        int i2;
        gu5Var.getClass();
        c cVarH = bVar.h(1347453093);
        int i3 = i | (cVarH.x(gu5Var) ? 4 : 2);
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            x2b x2bVarA = z2b.a(R.drawable.empty_state, 0, cVarH);
            String strI = ak2.I(R.string.ghostwriter_empty_schedule_apply_list_content_description, cVarH);
            String strI2 = ak2.I(R.string.ghostwriter_empty_schedule_apply_list_header, cVarH);
            String strI3 = ak2.I(R.string.ghostwriter_empty_schedule_apply_list_subheader, cVarH);
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            o97.a.e eVar = o97Var.c.a;
            o97.h hVar = o97Var.j;
            vs0.i iVar = new vs0.i(16.0f, false, new pa(c20.a.k, 1));
            e eVarM = pnb.M(f.f(g.c(g.f(e.a.b, 1.0f), 1.0f), 24.0f), pnb.L(0, 1, cVarH), true);
            ob2 ob2VarA = mb2.a(iVar, c20.a.n, cVarH, 48);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarM);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            f17.a(x2bVarA, strI, null, null, null, 0.0f, null, cVarH, 0, 124);
            cif.b(strI2, null, eVar.c, 0L, null, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, hVar.f, cVarH, 0, 0, 65498);
            cif.b(strI3, null, eVar.a, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, hVar.g, cVarH, 0, 0, 65018);
            String strI4 = ak2.I(R.string.ghostwriter_schedule_apply_list_refresh_button, cVarH);
            boolean z = (i3 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                gu5Var2 = gu5Var;
                objV = new ec(5, gu5Var2);
                cVarH.p(objV);
            } else {
                gu5Var2 = gu5Var;
            }
            gt6.h(strI4, (gu5) objV, null, null, false, false, fv6.M7, null, "GhostwriterJobCardListEmptyState_RefreshButton", cVarH, 102236160, 188);
            cVarH = cVarH;
            i2 = 1;
            cVarH.U(true);
        } else {
            gu5Var2 = gu5Var;
            i2 = 1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new my4(i, i2, gu5Var2);
        }
    }
}
