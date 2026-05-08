package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.navigation.d;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class e7b {
    public static final void a(File file, p9d p9dVar, b bVar, int i) {
        Bundle bundleA;
        file.getClass();
        c cVarH = bVar.h(2072351716);
        int i2 = (cVarH.x(file) ? 4 : 2) | i | 16;
        int i3 = 1;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                cVarH.u(-1072256281);
                jrg jrgVarA = z09.a(cVarH);
                if (jrgVarA == null) {
                    r6.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                p63 p63VarA = ojd.a(jrgVarA, cVarH);
                vh8 vh8Var = web.d;
                if (vh8Var == null) {
                    r6.g("KoinApplication has not been started");
                    return;
                }
                qpd qpdVar = (qpd) vh8Var.a.b;
                d dVar = jrgVarA instanceof d ? (d) jrgVarA : null;
                p63 p63VarQ = (dVar == null || (bundleA = dVar.a()) == null) ? null : pnb.Q(bundleA, jrgVarA);
                yd8 yd8VarB = fwc.a.b(p9d.class);
                irg viewModelStore = jrgVarA.getViewModelStore();
                viewModelStore.getClass();
                brg brgVarA = p66.a(yd8VarB, viewModelStore, p63VarQ == null ? p63VarA : p63VarQ, null, qpdVar, null);
                cVarH.U(false);
                p9dVar = (p9d) brgVarA;
            } else {
                cVarH.D();
            }
            cVarH.V();
            n9d n9dVarG = p9dVar.g();
            boolean zX = cVarH.x(p9dVar) | cVarH.x(file);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new d7b(p9dVar, file, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, file, (Function2) objV);
            boolean zX2 = cVarH.x(p9dVar);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new ir(p9dVar, 11);
                cVarH.p(objV2);
            }
            e eVarA = s.a(e.a.b, (Function1) objV2);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
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
            boolean z = n9dVarG.f;
            List<m07> list = n9dVarG.c;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = new jr(19);
                cVarH.p(objV3);
            }
            pmb.a(z, list, (gu5) objV3, cVarH, 384);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new iu(file, i, i3, p9dVar);
        }
    }
}
