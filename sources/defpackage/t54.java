package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class t54 {
    public static final void a(gu5<j6g> gu5Var, gu5<j6g> gu5Var2, b bVar, int i) {
        int i2;
        gu5<j6g> gu5Var3;
        int i3;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, -953304484);
        if ((i & 6) == 0) {
            i2 = (cVarC.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarC.x(gu5Var2) ? 32 : 16;
        }
        int i4 = i2;
        if (cVarC.o(i4 & 1, (i4 & 19) != 18)) {
            String strI = ak2.I(R.string.indeed_apply_discard_dialog_title, cVarC);
            fgd fgdVarA = ggd.a(10.0f);
            e.a aVar = e.a.b;
            e eVarB = a.b(ygg.h(aVar, fgdVarA), eu6.u, ytc.a);
            boolean zK = cVarC.K(strI);
            Object objV = cVarC.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new s54(strI, 0);
                cVarC.p(objV);
            }
            e eVarB2 = b5e.b(eVarB, false, (Function1) objV);
            ob2 ob2VarA = mb2.a(vs0.e, c20.a.m, cVarC, 6);
            int iHashCode = Long.hashCode(cVarC.T);
            t8b t8bVarP = cVarC.P();
            e eVarC = androidx.compose.ui.c.c(cVarC, eVarB2);
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
            String strI2 = ak2.I(R.string.indeed_apply_discard_title, cVarC);
            tjf tjfVar = hz6.h;
            long j = eu6.k;
            e eVarA = f.a(androidx.compose.foundation.layout.f.j(aVar, 24.0f, 24.0f, 24.0f, 0.0f, 8), "HeadingText");
            Object objV2 = cVarC.v();
            if (objV2 == c0020a) {
                objV2 = new md1(3);
                cVarC.p(objV2);
            }
            fif.b(strI2, b5e.b(eVarA, false, (Function1) objV2), j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarC, 0, 0, 65528);
            fif.b(ak2.I(R.string.indeed_apply_discard_message, cVarC), f.a(androidx.compose.foundation.layout.f.j(aVar, 24.0f, 0.0f, 24.0f, 0.0f, 10), "BodyText"), j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.e, cVarC, 48, 0, 65528);
            b84.a(1.0f, 390, 8, pa2.a(R.color.idl_aurora_neutral_300, cVarC), cVarC, f.a(g.f(androidx.compose.foundation.layout.f.j(aVar, 0.0f, 24.0f, 0.0f, 16.0f, 5), 1.0f), "Divider"));
            fgd fgdVarA2 = ggd.a(8.0f);
            hza hzaVar = iq1.a;
            sq1.a(gu5Var, f.a(androidx.compose.foundation.layout.f.j(g.f(aVar, 1.0f), 16.0f, 5.0f, 16.0f, 0.0f, 8), "DiscardButton"), false, null, fgdVarA2, null, iq1.a(eu6.c, 0L, cVarC, 0, 14), null, ii2.a, cVarC, (i4 & 14) | 805306368, 348);
            gu5Var3 = gu5Var;
            cVarC = cVarC;
            sq1.b(gu5Var2, f.a(g.f(androidx.compose.foundation.layout.f.i(aVar, 16.0f, 12.0f, 16.0f, 22.0f), 1.0f), "CancelButton"), ggd.a(8.0f), ee3.f(eu6.o, 1.0f), null, null, ii2.b, cVarC, ((i4 >> 3) & 14) | 805306368, 412);
            i3 = 1;
            cVarC.U(true);
        } else {
            gu5Var3 = gu5Var;
            i3 = 1;
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new d71(i, i3, gu5Var3, gu5Var2);
        }
    }
}
