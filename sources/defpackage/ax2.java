package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ax2 {
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.x1e r18, defpackage.jta r19, defpackage.gu5 r20, final defpackage.gu5 r21, androidx.compose.runtime.b r22, int r23) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax2.a(x1e, jta, gu5, gu5, androidx.compose.runtime.b, int):void");
    }

    public static final void b(List list, boolean z, b bVar, int i) {
        c cVar;
        c cVarH = bVar.h(-1499950105);
        int i2 = (cVarH.x(list) ? 4 : 2) | i | (cVarH.a(z) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            tjf tjfVarD = ((tjf) cVarH.M(fif.a)).d(o97Var.j.f);
            ehd ehdVarA = chd.a(new vs0.i(4.0f - nta.ConversationHeader.a(), true, new us0(0)), c20.a.k, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, e.a.b);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
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
            cta.a(z, usa.ConversationHeader, pyd.b, cVarH, ((i2 >> 3) & 14) | 432);
            fif.b(String.valueOf(list.size()), null, o97Var.c.a.c, 0L, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 0, 0, 65498);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new el6(i, list, z);
        }
    }
}
