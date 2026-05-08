package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.g;
import androidx.navigation.s;
import com.indeed.android.jobsearch.R;
import defpackage.o97;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ik7 {
    public static final Set<String> a = ut0.I0(new String[]{"REVIEWED", "VIEWED", "CONTACTING", "INTERVIEW"});

    public static final void a(c88 c88Var, b bVar, int i) {
        int i2;
        i iVarW;
        Function2<? super b, ? super Integer, j6g> ek7Var;
        c cVarH = bVar.h(298115145);
        if ((i & 6) == 0) {
            i2 = (cVarH.K("MyJobs/Applied/CTA") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(c88Var) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            ra8 ra8Var = i6a.a;
            if (((kr7) cr8.p(kr7.class)).e("cs_interview_prep_applied_jobcard_cta_tst").a < 1 || !a.contains(c88Var.o)) {
                iVarW = cVarH.W();
                if (iVarW != null) {
                    ek7Var = new dk7(c88Var, i);
                    iVarW.d = ek7Var;
                }
                return;
            }
            b(c88Var, cVarH, i2 & 126);
        } else {
            cVarH.D();
        }
        iVarW = cVarH.W();
        if (iVarW != null) {
            ek7Var = new ek7(c88Var, i, 0);
            iVarW.d = ek7Var;
        }
    }

    public static final void b(final c88 c88Var, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(-952996804);
        if ((i & 6) == 0) {
            i2 = (cVarH.K("MyJobs/Applied/CTA") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(c88Var) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            g gVar = context instanceof g ? (g) context : null;
            iba ibaVarB = q92.B(new s[0], cVarH);
            String str = c88Var.a;
            String str2 = c88Var.o;
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean z = (i3 == 4) | (i4 == 32);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new hk7("MyJobs/Applied/CTA", c88Var, null);
                cVarH.p(objV);
            }
            to4.e("MyJobs/Applied/CTA", str, str2, (Function2) objV, cVarH);
            String strI = ak2.I(R.string.mock_interview_job_card_cta, cVarH);
            boolean z2 = c88Var.r;
            e eVarF = androidx.compose.foundation.layout.g.f(e.a.b, 1.0f);
            o97.g gVar2 = o97Var.i;
            e eVarJ = f.j(eVarF, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean zX = (i4 == 32) | (i3 == 4) | cVarH.x(gVar) | cVarH.x(ibaVarB);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new fk7(0, gVar, ibaVarB, c88Var);
                cVarH.p(objV2);
            }
            gt6.j(strI, (gu5) objV2, eVarJ, null, false, z2, null, null, null, cVarH, 0, 472);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: gk7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    ik7.b(c88Var, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
