package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
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

/* JADX INFO: loaded from: classes2.dex */
public final class la5 {
    public static final void a(int i, b bVar) {
        c cVarH = bVar.h(-101445800);
        if (cVarH.o(i & 1, i != 0)) {
            long j = eu6.q0;
            long j2 = eu6.n0;
            long j3 = eu6.o0;
            e.a aVar = e.a.b;
            e eVarB = a.b(ti1.a(ygg.h(f.f(g.f(aVar, 1.0f), 16.0f), ggd.a(8.0f)), 1.0f, j3, ggd.a(8.0f)), j2, ytc.a);
            ehd ehdVarA = chd.a(vs0.e, c20.a.j, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            wq6.b(z2b.a(R.drawable.ic_idl_error_24, 0, cVarH), null, g.n(f.f(aVar, 16.0f), 24.0f), j, cVarH, 432, 0);
            fif.b(ak2.I(R.string.file_render_error_message, cVarH), f.j(new LayoutWeightElement(1.0f, true), 0.0f, 16.0f, 16.0f, 16.0f, 1), 0L, 0L, null, null, 0L, null, new dcf(5), 0L, 0, false, 0, 0, null, hz6.g, cVarH, 0, 0, 65020);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new kk2(i, 4);
        }
    }
}
