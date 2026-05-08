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
import defpackage.pm8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class q2d {
    public static final void a(int i, b bVar) {
        c cVar;
        c cVarH = bVar.h(-1290387396);
        if (cVarH.o(i & 1, i != 0)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarF = f.f(g.v(aVar, null, 3), 24.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, cVarH, 48);
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
            e eVarV = g.v(aVar, null, 3);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new iq0(13);
                cVarH.p(objV);
            }
            fif.b(ak2.I(R.string.report_email_thanks_title, cVarH), b5e.b(eVarV, false, (Function1) objV), o97Var.c.a.c, 0L, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.e, cVarH, 0, 0, 65496);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new fn0(i);
        }
    }
}
