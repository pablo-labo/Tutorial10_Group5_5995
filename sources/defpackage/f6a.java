package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;

/* JADX INFO: loaded from: classes2.dex */
public final class f6a {
    public static final void a(gu5<j6g> gu5Var, gu5<j6g> gu5Var2, b bVar, int i) {
        gu5<j6g> gu5Var3;
        gu5<j6g> gu5Var4;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, -193554398);
        int i2 = (cVarC.x(gu5Var) ? 4 : 2) | i | (cVarC.x(gu5Var2) ? 32 : 16);
        if (cVarC.o(i2 & 1, (i2 & 19) != 18)) {
            e.a aVar = e.a.b;
            e eVarH = f.h(a.b(g.d(aVar, 1.0f), pa2.a(R.color.background, cVarC), ytc.a), 0.0f, 16.0f, 1);
            ob2 ob2VarA = mb2.a(new vs0.i(16.0f, true, new us0(0)), c20.a.n, cVarC, 54);
            int iHashCode = Long.hashCode(cVarC.T);
            t8b t8bVarP = cVarC.P();
            e eVarC = androidx.compose.ui.c.c(cVarC, eVarH);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar2);
            } else {
                cVarC.n();
            }
            ygg.y(cVarC, ob2VarA, gl2.a.g);
            ygg.y(cVarC, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarC, iHashCode, c0251a);
            }
            ygg.y(cVarC, eVarC, gl2.a.d);
            f17.a(z2b.a(R.drawable.savedemptystate, 0, cVarC), ak2.I(R.string.reg_promo_indeed_logo_content_description, cVarC), androidx.compose.ui.platform.f.a(f.j(aVar, 0.0f, 32.0f, 0.0f, 0.0f, 13), "MyJobsLoggedOut_CallToActionImage"), null, ft2.a.b, 0.0f, null, cVarC, 24960, 104);
            o97 o97Var = (o97) cVarC.M(p97.a);
            e eVarA = androidx.compose.ui.platform.f.a(f.h(g.f(aVar, 1.0f), 32.0f, 0.0f, 2), "MyJobsLoggedOut_CallToActionMain");
            String strI = ak2.I(R.string.generic_tab_login_label, cVarC);
            o97.h hVar = o97Var.j;
            o97.d dVar = o97Var.d;
            cif.b(strI, eVarA, 0L, 0L, null, o97Var.f.c, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjf.a(hVar.f, 0L, 0L, null, null, dVar.a, 0L, 0, 0L, null, null, 0, 16777183), cVarC, 48, 0, 64988);
            cif.b(ak2.I(R.string.native_my_jobs_tab_login_subtext, cVarC), androidx.compose.ui.platform.f.a(f.h(g.f(aVar, 1.0f), 32.0f, 0.0f, 2), "MyJobsLoggedOut_CallToActionSecondary"), 0L, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, 0L, 0L, null, null, dVar.a, 0L, 0, 0L, null, null, 0, 16777183), cVarC, 48, 0, 65020);
            jh2.f(cVarC, new LayoutWeightElement(1.0f, true));
            gt6.j(ak2.I(R.string.reg_promo_create_account_button_text, cVarC), gu5Var, androidx.compose.ui.platform.f.a(f.h(g.f(aVar, 1.0f), 32.0f, 0.0f, 2), "MyJobsLoggedOut_CreateAnAccountButton"), null, false, false, null, null, null, cVarC, ((i2 << 3) & 112) | 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            gu5Var3 = gu5Var;
            gu5Var4 = gu5Var2;
            gt6.h(ak2.I(R.string.reg_promo_sign_in_button_text, cVarC), gu5Var4, androidx.compose.ui.platform.f.a(f.h(g.f(aVar, 1.0f), 32.0f, 0.0f, 2), "MyJobsLoggedOut_SignInButton"), null, false, false, null, null, null, cVarC, (i2 & 112) | 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            cVarC.U(true);
        } else {
            gu5Var3 = gu5Var;
            gu5Var4 = gu5Var2;
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new qa3(gu5Var3, gu5Var4, i);
        }
    }
}
