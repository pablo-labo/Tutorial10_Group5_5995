package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class jka {
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        gu5Var.getClass();
        c cVarH = bVar.h(401661556);
        int i2 = i | (cVarH.x(gu5Var) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
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
            ygg.y(cVarH, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            x2b x2bVarA = z2b.a(2131232539, 0, cVarH);
            String strI = ak2.I(R.string.reg_promo_indeed_logo_content_description, cVarH);
            e eVarH = g.h(g.r(aVar, 90.0f), 60.0f);
            o97.g gVar = o97Var.i;
            o97.e eVar2 = o97Var.g;
            o97.b bVar2 = o97Var.e;
            o97.c cVar = o97Var.f;
            o97.d dVar2 = o97Var.d;
            o97.a.e eVar3 = o97Var.c.a;
            f17.a(x2bVarA, strI, f.a(androidx.compose.foundation.layout.f.j(eVarH, 14.0f, 4.0f, 0.0f, 0.0f, 12), "indeedLogo"), null, null, 0.0f, null, cVarH, 0, 120);
            cVarH.U(true);
            e eVarD = g.d(aVar, 1.0f);
            af1.a aVar3 = c20.a.n;
            vs0.c cVar2 = vs0.e;
            ob2 ob2VarA = mb2.a(cVar2, aVar3, cVarH, 54);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarD);
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
            f17.a(z2b.a(R.drawable.onboarding_spot_location_or_commute_5, 0, cVarH), ak2.I(R.string.nsc_image_description, cVarH), f.a(g.h(g.r(aVar, 150.0f), 106.0f), "Image"), null, null, 0.0f, null, cVarH, 384, 120);
            String strI2 = ak2.I(R.string.nsc_jobsearch_not_available_title, cVarH);
            e eVarG = androidx.compose.foundation.layout.f.g(aVar, 32.0f, 16.0f);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new uz7(4);
                cVarH.p(objV);
            }
            e eVarA = f.a(b5e.b(eVarG, false, (Function1) objV), "NonSupportedCountryScreenTitle");
            long j = eVar3.c;
            pn5 pn5Var = dVar2.a;
            fif.b(strI2, eVarA, j, bVar2.e, cVar.c, pn5Var, 0L, null, new dcf(3), eVar2.c, 0, false, 0, 0, null, null, cVarH, 0, 0, 129424);
            String strI3 = ak2.I(R.string.nsc_select_different_country_text, cVarH);
            e eVarA2 = f.a(androidx.compose.foundation.layout.f.h(aVar, 24.0f, 0.0f, 2), "NonSupportedCountryScreenDescription");
            long j2 = eVar3.c;
            pn5 pn5Var2 = dVar2.a;
            fif.b(strI3, eVarA2, j2, bVar2.f, cVar.a, pn5Var2, 0L, null, new dcf(3), eVar2.c, 0, false, 0, 0, null, null, cVarH, 0, 0, 129424);
            e eVarV = g.v(androidx.compose.foundation.layout.f.h(aVar, 0.0f, 32.0f, 1), null, 3);
            ehd ehdVarA2 = chd.a(cVar2, c20.a.k, cVarH, 54);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarV);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA2, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            String strI4 = ak2.I(R.string.nsc_select_another_country_button, cVarH);
            boolean z = (i2 & 14) == 4;
            Object objV2 = cVarH.v();
            if (z || objV2 == c0020a) {
                gu5Var2 = gu5Var;
                objV2 = new oy(3, gu5Var2);
                cVarH.p(objV2);
            } else {
                gu5Var2 = gu5Var;
            }
            gt6.h(strI4, (gu5) objV2, f.a(androidx.compose.foundation.layout.f.h(g.h(g.r(aVar, 296.0f), 44.0f), 10.0f, 0.0f, 2), "NonSupportedCountryScreenPrimaryButton"), null, false, false, null, null, null, cVarH, 0, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            cVarH = cVarH;
            cVarH.U(true);
            cVarH.U(true);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new vz2(gu5Var2, i, 5);
        }
    }
}
