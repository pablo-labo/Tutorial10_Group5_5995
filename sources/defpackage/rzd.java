package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;

/* JADX INFO: loaded from: classes3.dex */
public final class rzd {
    public static final void a(int i, gu5 gu5Var, fv6 fv6Var, b bVar, String str, String str2) {
        fv6Var.getClass();
        str.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-173095825);
        int i2 = i | (cVarH.d(fv6Var.ordinal()) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            sl7 sl7Var = sl7.a;
            e.a aVar = e.a.b;
            e eVarA = d.a(aVar, sl7Var);
            o97.a aVar2 = o97Var.c;
            o97.a.e eVar = aVar2.a;
            o97.d dVar = o97Var.d;
            e eVarF = f.f(g.f(a.b(eVarA, aVar2.b.a, ytc.a), 1.0f), 12.0f);
            boolean z = (i2 & 7168) == 2048;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new ec(10, gu5Var);
                cVarH.p(objV);
            }
            e eVarA2 = androidx.compose.ui.platform.f.a(androidx.compose.foundation.b.d(eVarF, false, null, null, (gu5) objV, 15), "NewSelectListItem".concat(str));
            ehd ehdVarA = chd.a(vs0.g, c20.a.j, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA2);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar2 = gl2.a.g;
            ygg.y(cVarH, ehdVarA, dVar2);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            e eVarJ = f.j(aVar, 0.0f, 3.0f, 0.0f, 0.0f, 13);
            vs0.k kVar = vs0.c;
            af1.a aVar4 = c20.a.m;
            ob2 ob2VarA = mb2.a(kVar, aVar4, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar2);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar2);
            ev6.b(fv6Var, null, null, null, 0L, null, cVarH, i2 & 14, 62);
            cVarH.U(true);
            e eVarO = f.j(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11).o(new VerticalAlignElement(c20.a.k));
            ob2 ob2VarA2 = mb2.a(kVar, aVar4, cVarH, 0);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarO);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA2, dVar2);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar2);
            cif.b(str, f.f(aVar, 4.0f), eVar.c, 0L, null, null, dVar.a, 0L, null, null, 0L, 0, false, 0, 0, null, null, cVarH, (i2 >> 3) & 14, 0, 131000);
            cVarH = cVarH;
            if (str2 == null) {
                cVarH.L(-321484493);
            } else {
                cVarH.L(-321484492);
                cif.b(str2, f.f(aVar, 4.0f), eVar.b, 0L, null, null, dVar.a, 0L, null, null, 0L, 0, false, 0, 0, null, null, cVarH, 0, 0, 131000);
                cVarH = cVarH;
                j6g j6gVar = j6g.a;
            }
            cVarH.U(false);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new qzd(fv6Var, str, str2, gu5Var, i, 0);
        }
    }
}
