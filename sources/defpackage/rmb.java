package defpackage;

import android.net.Uri;
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

/* JADX INFO: loaded from: classes2.dex */
public final class rmb {
    public static final void a(Uri uri, b bVar, int i) {
        Uri uri2;
        uri.getClass();
        c cVarH = bVar.h(-99118024);
        int i2 = (cVarH.x(uri) ? 4 : 2) | i;
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
            uri2 = uri;
            whe.a(uri2, ak2.I(R.string.messaging_attachment_preview, cVarH), null, ft2.a.e, cVarH, (i2 & 14) | 1572864, 1980);
            cVarH.U(true);
        } else {
            uri2 = uri;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fr2(uri2, i, 6);
        }
    }
}
