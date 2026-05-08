package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.pm8;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class s27 {
    public static final void a(File file, b bVar, int i) {
        File file2;
        file.getClass();
        c cVarH = bVar.h(-826860863);
        int i2 = (cVarH.x(file) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            e eVarF = f.f(a.b(g.d(e.a.b, 1.0f), ((o97) cVarH.M(p97.a)).c.b.a, ytc.a), 16.0f);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            file2 = file;
            whe.a(file2, ak2.I(R.string.messaging_attachment_preview, cVarH), null, ft2.a.e, cVarH, (i2 & 14) | 1572864, 1980);
            cVarH.U(true);
        } else {
            file2 = file;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pa(file2, i, 7);
        }
    }
}
