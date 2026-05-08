package defpackage;

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

/* JADX INFO: loaded from: classes2.dex */
public final class fp5 {
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        int i2;
        gu5Var.getClass();
        c cVarH = bVar.h(-1011910531);
        int i3 = i | (cVarH.x(gu5Var) ? 4 : 2);
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            zrd zrdVarL = pnb.L(0, 1, cVarH);
            e.a aVar = e.a.b;
            e eVarM = pnb.M(aVar, zrdVarL, true);
            o97.g gVar = o97Var.i;
            o97.h hVar = o97Var.j;
            e eVarF = f.f(eVarM, 24.0f);
            ob2 ob2VarA = mb2.a(vs0.e, c20.a.n, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
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
            f17.a(z2b.a(R.drawable.forced_upgrade_hero, 0, cVarH), "Upgrade Banner", androidx.compose.ui.platform.f.a(g.h(g.r(aVar, 100.0f), 80.0f), "ExclamationMarkImage"), null, ft2.a.g, 0.0f, null, cVarH, 24624, 104);
            cif.b(ak2.I(R.string.forced_upgrade_title, cVarH), f.j(aVar, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjf.a(hVar.e, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), cVarH, 0, 0, 65020);
            cif.b(ak2.I(R.string.forced_upgrade_body, cVarH), f.j(aVar, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, hVar.f, cVarH, 0, 0, 65020);
            String strI = ak2.I(R.string.forced_upgrade_button_update, cVarH);
            boolean z = (i3 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new sd(5, gu5Var);
                cVarH.p(objV);
            }
            gt6.h(strI, (gu5) objV, g.f(g.j(f.j(aVar, 0.0f, 16.0f, 0.0f, 0.0f, 13), 52.0f, 0.0f, 2), 1.0f), null, false, false, null, null, null, cVarH, 0, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            cVarH = cVarH;
            i2 = 1;
            cVarH.U(true);
        } else {
            i2 = 1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new bx2(i, i2, gu5Var);
        }
    }
}
