package defpackage;

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
import defpackage.o97;
import defpackage.pm8;

/* JADX INFO: loaded from: classes2.dex */
public final class vwc {
    public static final void a(int i, b bVar) {
        c cVarH = bVar.h(-103822268);
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            mhg mhgVar = (mhg) cVarH.M(um2.r);
            String strI = wve.I(d93.g(), "/m/", "/hire?from=android-jobsearch-app");
            cVarH.L(-988943310);
            le0.b bVar2 = new le0.b();
            cVarH.L(-988942128);
            o97.a aVar = o97Var.c;
            o97.a.e eVar = aVar.a;
            int iK = bVar2.k(new foe(aVar.a.a, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65534));
            try {
                bVar2.g(ak2.I(R.string.reg_promo_employer_hiring_text, cVarH));
                bVar2.g(" ");
                j6g j6gVar = j6g.a;
                bVar2.i(iK);
                cVarH.U(false);
                bVar2.j("EMPLOYERS_HYPERLINK", ak2.I(R.string.reg_promo_employer_link_text, cVarH));
                cVarH.L(-988928109);
                iK = bVar2.k(new foe(eVar.d, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, odf.c, (vbe) null, 61438));
                try {
                    bVar2.g(ak2.I(R.string.reg_promo_employer_link_text, cVarH));
                    bVar2.i(iK);
                    cVarH.U(false);
                    bVar2.h();
                    le0 le0VarL = bVar2.l();
                    cVarH.U(false);
                    e.a aVar2 = e.a.b;
                    e eVarA = f.a(androidx.compose.foundation.layout.f.f(aVar2, 16.0f), "RegPromoEmployerLinkContainer");
                    boolean zX = cVarH.x(mhgVar) | cVarH.K(strI);
                    Object objV = cVarH.v();
                    if (zX || objV == b.a.a) {
                        objV = new mr(10, mhgVar, strI);
                        cVarH.p(objV);
                    }
                    e eVarD = androidx.compose.foundation.b.d(eVarA, false, null, null, (gu5) objV, 15);
                    ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
                    int iHashCode = Long.hashCode(cVarH.T);
                    t8b t8bVarP = cVarH.P();
                    e eVarC = androidx.compose.ui.c.c(cVarH, eVarD);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    cVarH.B();
                    if (cVarH.S) {
                        cVarH.y(aVar3);
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
                    fif.c(le0VarL, null, eVar.g.f.a, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, o97Var.j.f, cVarH, 0, 0, 131066);
                    cVarH = cVarH;
                    jh2.f(cVarH, g.r(aVar2, 4.0f));
                    ev6.b(fv6.o6, null, null, zq6.Sm, eVar.g.f.a, null, cVarH, 3078, 38);
                    cVarH.U(true);
                } finally {
                }
            } finally {
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fm0(i, 16);
        }
    }
}
