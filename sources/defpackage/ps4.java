package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes2.dex */
public final class ps4 {
    public static final void a(ls4 ls4Var, b bVar, int i) {
        int i2;
        boolean z;
        c cVarH = bVar.h(-705980257);
        int i3 = i | (cVarH.K(ls4Var) ? 4 : 2);
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            tjf tjfVar = (tjf) cVarH.M(fif.a);
            e.a aVar = e.a.b;
            e eVarA = f.a(androidx.compose.foundation.layout.f.f(a.b(g.d(aVar, 1.0f), o97Var.c.b.a, ytc.a), 16.0f), "EmptyState");
            ob2 ob2VarA = mb2.a(vs0.e, c20.a.n, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            f17.a(z2b.a(ls4Var.a, 0, cVarH), null, androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 0.0f, 24.0f, 7).o(new LayoutWeightElement(1.0f, false)), null, null, 0.0f, null, cVarH, 48, 120);
            String strI = ak2.I(ls4Var.b, cVarH);
            tjf tjfVarD = tjfVar.d(o97Var.j.f);
            long j = o97Var.c.a.c;
            i2 = 2;
            fif.b(strI, androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 0.0f, 16.0f, 7), j, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 0, 0, 65016);
            cVarH = cVarH;
            if (ls4Var.c) {
                cVarH.L(-2001979455);
                gt6.h(ak2.I(R.string.messaging_empty_state_cta_findjobs, cVarH), ls4Var.d, g.t(aVar, 280.0f, 0.0f, 2), null, false, false, null, null, null, cVarH, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                cVarH = cVarH;
                z = false;
            } else {
                z = false;
                cVarH.L(-2004507815);
            }
            cVarH.U(z);
            cVarH.U(true);
        } else {
            i2 = 2;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ct(ls4Var, i, i2);
        }
    }
}
