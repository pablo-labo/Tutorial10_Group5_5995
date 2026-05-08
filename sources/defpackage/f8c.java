package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.le0;
import defpackage.pm8;

/* JADX INFO: loaded from: classes3.dex */
public final class f8c {
    public static final void a(gu5<j6g> gu5Var, gu5<j6g> gu5Var2, b bVar, int i) {
        int i2;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, 618795181);
        int i3 = (cVarC.x(gu5Var) ? 4 : 2) | i | (cVarC.x(gu5Var2) ? 32 : 16);
        if (cVarC.o(i3 & 1, (i3 & 19) != 18)) {
            long j = ((o97) cVarC.M(p97.a)).c.b.i.a.c;
            e.a aVar = e.a.b;
            e eVarA = f.a(androidx.compose.foundation.layout.f.f(a.b(androidx.compose.foundation.layout.f.h(g.f(aVar, 1.0f), 8.0f, 0.0f, 2), j, ggd.a(8.0f)), 4.0f), "PushPrimerBanner");
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarC.T);
            t8b t8bVarP = cVarC.P();
            e eVarC = androidx.compose.ui.c.c(cVarC, eVarA);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar2);
            } else {
                cVarC.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarC, ag9VarD, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarC, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarC, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarC, eVarC, eVar);
            fv6 fv6Var = fv6.W1;
            e eVarH = androidx.compose.foundation.layout.b.a.h(aVar, c20.a.c);
            boolean z = (i3 & 112) == 32;
            Object objV = cVarC.v();
            if (z || objV == b.a.a) {
                objV = new cl6(6, gu5Var2);
                cVarC.p(objV);
            }
            e eVarA2 = f.a(androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.d(eVarH, false, null, null, (gu5) objV, 15), 12.0f, 8.0f, 8.0f, 8.0f), "PushPrimerBannerDismissButton");
            long j2 = da2.b;
            ev6.a(fv6Var, eVarA2, null, null, j2, ak2.I(R.string.push_primer_inline_dismiss_a11y, cVarC), null, cVarC, 24582, 76);
            e eVarJ = androidx.compose.foundation.layout.f.j(g.f(aVar, 1.0f), 0.0f, 0.0f, 36.0f, 0.0f, 11);
            ehd ehdVarA = chd.a(vs0.g, c20.a.k, cVarC, 54);
            int iHashCode2 = Long.hashCode(cVarC.T);
            t8b t8bVarP2 = cVarC.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarC, eVarJ);
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar2);
            } else {
                cVarC.n();
            }
            ygg.y(cVarC, ehdVarA, dVar);
            ygg.y(cVarC, t8bVarP2, fVar);
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarC, iHashCode2, c0251a);
            }
            ygg.y(cVarC, eVarC2, eVar);
            e eVarI = androidx.compose.foundation.layout.f.i(new LayoutWeightElement(1.0f, true), 12.0f, 16.0f, 10.0f, 16.0f);
            ob2 ob2VarA = mb2.a(vs0.e, c20.a.m, cVarC, 6);
            int iHashCode3 = Long.hashCode(cVarC.T);
            t8b t8bVarP3 = cVarC.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarC, eVarI);
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar2);
            } else {
                cVarC.n();
            }
            ygg.y(cVarC, ob2VarA, dVar);
            ygg.y(cVarC, t8bVarP3, fVar);
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarC, iHashCode3, c0251a);
            }
            ygg.y(cVarC, eVarC3, eVar);
            cVarC.L(1417409120);
            le0.b bVar2 = new le0.b();
            cVarC.L(1417410430);
            int iK = bVar2.k(new foe(0L, 0L, to5.d0, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65531));
            try {
                bVar2.g(ak2.I(R.string.push_primer_inline_title, cVarC));
                j6g j6gVar = j6g.a;
                bVar2.i(iK);
                cVarC.U(false);
                bVar2.g(" ");
                bVar2.g(ak2.I(R.string.push_primer_inline_message, cVarC));
                le0 le0VarL = bVar2.l();
                cVarC.U(false);
                cif.c(le0VarL, f.a(aVar, "PushPrimerBannerMessage"), j2, hh2.t(14), null, null, null, 0L, null, null, hh2.t(21), 0, false, 0, 0, null, null, null, cVarC, 3504, 6, 261104);
                cVarC.U(true);
                i2 = 0;
                gt6.h(ak2.I(R.string.push_primer_inline_allow, cVarC), gu5Var, f.a(androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 8.0f, 0.0f, 11), "PushPrimerBannerAllowButton"), vt6.Sm, false, false, null, null, null, cVarC, ((i3 << 3) & 112) | 3072, 496);
                cVarC.U(true);
                cVarC.U(true);
            } catch (Throwable th) {
                bVar2.i(iK);
                throw th;
            }
        } else {
            i2 = 0;
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new e8c(i, i2, gu5Var, gu5Var2);
        }
    }
}
