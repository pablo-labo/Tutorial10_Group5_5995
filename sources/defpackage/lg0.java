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
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class lg0 {
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        int i2;
        int i3;
        gu5<j6g> gu5Var2 = gu5Var;
        gu5Var2.getClass();
        c cVarH = bVar.h(1011074528);
        int i4 = i | (cVarH.x(gu5Var2) ? 4 : 2);
        if (cVarH.o(i4 & 1, (i4 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            tjf tjfVar = (tjf) cVarH.M(fif.a);
            e.a aVar = e.a.b;
            e eVarD = g.d(aVar, 1.0f);
            o97.a aVar2 = o97Var.c;
            o97.a.e eVar = aVar2.a;
            o97.h hVar = o97Var.j;
            e eVarA = f.a(pnb.M(a.b(eVarD, aVar2.b.a, ytc.a), pnb.L(0, 1, cVarH), true), "ApiErrorScreen");
            vs0.c cVar = vs0.e;
            ob2 ob2VarA = mb2.a(cVar, c20.a.n, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
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
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            f17.a(z2b.a(R.drawable.ic_something_wrong, 0, cVarH), ak2.I(R.string.messaging_something_went_wrong, cVarH), new LayoutWeightElement(1.0f, false), null, null, 0.0f, null, cVarH, 0, 120);
            String strI = ak2.I(R.string.messaging_something_went_wrong, cVarH);
            tjf tjfVarD = tjfVar.d(hVar.f);
            long j = eVar.c;
            to5 to5Var = o97Var.f.c;
            e eVarH = androidx.compose.foundation.layout.f.h(aVar, 0.0f, 16.0f, 1);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                i3 = 2;
                objV = new wd(2);
                cVarH.p(objV);
            } else {
                i3 = 2;
            }
            fif.b(strI, b5e.b(eVarH, false, (Function1) objV), j, 0L, to5Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 0, 0, 65496);
            i2 = 3;
            fif.b(ak2.I(R.string.messaging_try_to_refresh, cVarH), androidx.compose.foundation.layout.f.h(aVar, 16.0f, 0.0f, i3), eVar.c, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjfVar.d(hVar.g), cVarH, 0, 0, 65016);
            e eVarV = g.v(androidx.compose.foundation.layout.f.h(aVar, 0.0f, 16.0f, 1), null, 3);
            ehd ehdVarA = chd.a(cVar, c20.a.k, cVarH, 54);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarV);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar2);
            gu5Var2 = gu5Var;
            gt6.h(ak2.I(R.string.messaging_refresh, cVarH), gu5Var2, f.a(aVar, "ApiErrorScreenPrimaryButton"), null, false, false, fv6.M7, null, null, cVarH, ((i4 << 3) & 112) | 1573248, 440);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            i2 = 3;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xd(gu5Var2, i, i2);
        }
    }
}
