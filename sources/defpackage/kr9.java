package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.ytc;

/* JADX INFO: loaded from: classes2.dex */
public final class kr9 {
    public static final void a(ah2 ah2Var, b bVar, int i) {
        c cVarH = bVar.h(-475587502);
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVar = e.a.b;
            e eVarD = g.d(eVar, 1.0f);
            o97.a aVar = o97Var.c;
            o97.a.C0340a c0340a = aVar.b;
            long j = aVar.b.a;
            ytc.a aVar2 = ytc.a;
            e eVarB = a.b(eVarD, j, aVar2);
            af1 af1Var = c20.a.a;
            ag9 ag9VarD = hl1.d(af1Var, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ag9VarD, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            e eVarB2 = a.b(g.d(eVar, 1.0f), c0340a.a, aVar2);
            e eVarB3 = a.b(g.t(eVar, 0.0f, 530.0f, 1), c0340a.a, aVar2);
            eVarB2.getClass();
            eVarB3.getClass();
            int i2 = ((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a)).orientation;
            if (i2 == 1) {
                eVar = eVarB2;
            } else if (i2 == 2) {
                eVar = eVarB3;
            }
            e eVarH = androidx.compose.foundation.layout.b.a.h(eVar, c20.a.b);
            ag9 ag9VarD2 = hl1.d(af1Var, false);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarH);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD2, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar2);
            v0h.a(bh2.c(-151637315, new ir9(ah2Var, 0), cVarH), cVarH, 6);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jr9(ah2Var, i, 0);
        }
    }
}
