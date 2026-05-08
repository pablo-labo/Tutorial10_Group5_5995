package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class aqb {
    public static final void a(e eVar, final gu5 gu5Var, gu5 gu5Var2, b bVar, final int i) {
        final gu5 gu5Var3;
        final e eVar2;
        boolean z;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, -875110467);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= cVarC.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarC.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarC.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarC.M(p97.a);
            String strI = ak2.I(R.string.download_profile_button, cVarC);
            String strI2 = ak2.I(R.string.share_profile_link_button, cVarC);
            o97.g gVar = o97Var.i;
            float f = o97Var.h.b;
            o97.a aVar = o97Var.c;
            o97.a.b bVar2 = aVar.c;
            o97.a.e eVar3 = aVar.a;
            ehd ehdVarA = chd.a(new vs0.i(8.0f, true, new us0(0)), c20.a.k, cVarC, 48);
            int iHashCode = Long.hashCode(cVarC.T);
            t8b t8bVarP = cVarC.P();
            e.a aVar2 = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarC, aVar2);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar3);
            } else {
                cVarC.n();
            }
            ygg.y(cVarC, ehdVarA, gl2.a.g);
            ygg.y(cVarC, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarC, iHashCode, c0251a);
            }
            ygg.y(cVarC, eVarC, gl2.a.d);
            fv6 fv6Var = fv6.c3;
            long j = eVar3.g.c;
            e eVarA = ti1.a(g.n(aVar2, 32.0f), 1.0f, bVar2.f.d.a, ggd.a(f));
            boolean z2 = (i2 & 112) == 32;
            Object objV = cVarC.v();
            b.a.C0020a c0020a = b.a.a;
            if (z2 || objV == c0020a) {
                objV = new js(5, gu5Var);
                cVarC.p(objV);
            }
            e eVarA2 = f.a(androidx.compose.foundation.layout.f.f(androidx.compose.foundation.b.d(eVarA, false, null, null, (gu5) objV, 15), 6.0f), "DownloadProfileButton");
            boolean zK = cVarC.K(strI);
            Object objV2 = cVarC.v();
            if (zK || objV2 == c0020a) {
                objV2 = new oz4(strI, 2);
                cVarC.p(objV2);
            }
            eVar2 = aVar2;
            ev6.b(fv6Var, b5e.a(eVarA2, (Function1) objV2), null, null, j, null, cVarC, 6, 44);
            fv6 fv6Var2 = fv6.S4;
            long j2 = eVar3.g.c;
            e eVarA3 = ti1.a(a.b(ygg.h(g.n(eVar2, 32.0f), ggd.a(f)), aVar.b.g.a, ytc.a), 1.0f, bVar2.f.d.a, ggd.a(f));
            boolean z3 = (i2 & 896) == 256;
            Object objV3 = cVarC.v();
            if (z3 || objV3 == c0020a) {
                gu5Var3 = gu5Var2;
                objV3 = new ld(9, gu5Var3);
                cVarC.p(objV3);
            } else {
                gu5Var3 = gu5Var2;
            }
            e eVarA4 = f.a(androidx.compose.foundation.layout.f.f(androidx.compose.foundation.b.d(eVarA3, false, null, null, (gu5) objV3, 15), 6.0f), "ShareProfileLinkButton");
            boolean zK2 = cVarC.K(strI2);
            Object objV4 = cVarC.v();
            if (zK2 || objV4 == c0020a) {
                z = true;
                objV4 = new qz4(strI2, 1);
                cVarC.p(objV4);
            } else {
                z = true;
            }
            ev6.b(fv6Var2, b5e.a(eVarA4, (Function1) objV4), null, null, j2, null, cVarC, 6, 44);
            cVarC.U(z);
        } else {
            gu5Var3 = gu5Var2;
            cVarC.D();
            eVar2 = eVar;
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: zpb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    aqb.a(eVar2, gu5Var, gu5Var3, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
