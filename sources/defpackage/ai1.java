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

/* JADX INFO: loaded from: classes2.dex */
public final class ai1 {
    public static final void a(int i, b bVar) {
        c cVarH = bVar.h(2013244559);
        if (cVarH.o(i & 1, i != 0)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            zrd zrdVarL = pnb.L(0, 1, cVarH);
            e.a aVar = e.a.b;
            e eVarF = f.f(pnb.M(aVar, zrdVarL, true), 24.0f);
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
            fv6 fv6Var = fv6.U3;
            o97.a aVar3 = o97Var.c;
            o97.h hVar = o97Var.j;
            ev6.a(fv6Var, g.n(aVar, 64.0f), null, null, aVar3.a.d, ak2.I(R.string.blocking_pending_verification_title, cVarH), null, cVarH, 54, 76);
            fif.b(ak2.I(R.string.blocking_pending_verification_title, cVarH), f.j(aVar, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjf.a(hVar.e, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), cVarH, 0, 0, 65020);
            fif.b(ak2.I(R.string.blocking_pending_verification_body, cVarH), f.j(aVar, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, hVar.f, cVarH, 0, 0, 65020);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new zh1(i, 0);
        }
    }
}
