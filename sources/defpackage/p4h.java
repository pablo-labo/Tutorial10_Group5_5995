package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import defpackage.o97;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class p4h {
    public static final void a(final boolean z, final String str, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(1583873007);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            p37 p37VarA = f32.a();
            long j = z ? o97Var.c.a.f : da2.h;
            long j2 = z ? o97Var.c.a.c : o97Var.c.b.g.a;
            long j3 = z ? o97Var.c.a.c : o97Var.c.c.f.a;
            String strK = z ? z3.k(cVarH, 650639951, R.string.work_wellbeing_item_checked, cVarH, false) : z3.k(cVarH, 650713421, R.string.work_wellbeing_item_unchecked, cVarH, false);
            o97.g gVar = o97Var.i;
            wq6.a(p37VarA, strK, f.a(androidx.compose.foundation.layout.f.f(ti1.a(a.b(g.n(e.a.b, 24.0f), j2, ggd.a(8.0f)), 1.0f, j3, ggd.a(8.0f)), 4.0f), str + "WorkWellbeingCheckbox"), j, cVarH, 0, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: o4h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    p4h.a(z, str, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final boolean r33, final java.lang.String r34, final java.lang.String r35, final boolean r36, final kotlin.jvm.functions.Function2 r37, final java.lang.String r38, androidx.compose.runtime.b r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4h.b(boolean, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function2, java.lang.String, androidx.compose.runtime.b, int):void");
    }
}
