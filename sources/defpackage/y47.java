package defpackage;

import androidx.compose.foundation.a;
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
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class y47 {
    public static final void a(final gu5 gu5Var, final Function1 function1, w47 w47Var, final boolean z, final i7d i7dVar, gu5 gu5Var2, final gu5 gu5Var3, b bVar, final int i) {
        w47 w47Var2;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        final gu5 gu5Var4 = gu5Var2;
        function1.getClass();
        w47Var.getClass();
        i7dVar.getClass();
        gu5Var4.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(-747124704);
        int i3 = i | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.d(w47Var.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(i7dVar) ? 16384 : 8192) | (cVarH.x(gu5Var4) ? 131072 : 65536) | (cVarH.x(gu5Var3) ? 1048576 : 524288);
        if (cVarH.o(i3 & 1, (599187 & i3) != 599186)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarG = f.g(a.b(g.f(aVar, 1.0f), o97Var.c.b.a, ytc.a), 16.0f, 12.0f);
            vs0.g gVar = vs0.g;
            af1.b bVar2 = c20.a.k;
            ehd ehdVarA = chd.a(gVar, bVar2, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            ehd ehdVarA2 = chd.a(new vs0.i(8.0f, true, new us0(0)), bVar2, cVarH, 48);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA2, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            b.a.C0020a c0020a = b.a.a;
            w47 w47Var3 = w47.INBOX;
            if (w47Var != w47Var3) {
                cVarH.L(296487427);
                boolean z6 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
                Object objV = cVarH.v();
                if (z6 || objV == c0020a) {
                    objV = new qj(9, w47Var, function1);
                    cVarH.p(objV);
                }
                e71.a(48, (gu5) objV, cVarH, "Inbox");
                z2 = false;
            } else {
                z2 = false;
                cVarH.L(294078138);
            }
            cVarH.U(z2);
            String strI = ak2.I(w47Var.e(), cVarH);
            e eVarA = androidx.compose.ui.platform.f.a(aVar, "InboxHeader");
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                i2 = i3;
                objV2 = new bh(8);
                cVarH.p(objV2);
            } else {
                i2 = i3;
            }
            bh6.a(strI, b5e.b(eVarA, false, (Function1) objV2), null, null, cVarH, 0, 12);
            cVarH.U(true);
            ehd ehdVarA3 = chd.a(vs0.a, bVar2, cVarH, 48);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, aVar);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA3, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            if (z) {
                cVarH.L(-1974903139);
                boolean z7 = (i2 & 458752) == 131072;
                Object objV3 = cVarH.v();
                if (z7 || objV3 == c0020a) {
                    gu5Var4 = gu5Var2;
                    objV3 = new sd(6, gu5Var4);
                    cVarH.p(objV3);
                } else {
                    gu5Var4 = gu5Var2;
                }
                c7d.a(null, i7dVar, (gu5) objV3, cVarH, (i2 >> 9) & 112, 1);
                cVarH = cVarH;
                z3 = false;
            } else {
                gu5Var4 = gu5Var2;
                z3 = false;
                cVarH.L(-1977991421);
            }
            cVarH.U(z3);
            w47Var2 = w47Var;
            if (w47Var2 == w47Var3) {
                cVarH.L(-1974647513);
                sq6.a(gu5Var, g.n(aVar, 24.0f), false, mh2.e, cVarH, (i2 & 14) | 24576, 12);
                z4 = false;
            } else {
                z4 = false;
                cVarH.L(-1977991421);
            }
            cVarH.U(z4);
            if (((h2g) cr8.p(h2g.class)).a()) {
                cVarH.L(-1974209080);
                sq6.a(gu5Var3, androidx.compose.ui.platform.f.a(aVar, "TopNavProfileButton"), false, mh2.f, cVarH, ((i2 >> 18) & 14) | 24624, 12);
                z5 = false;
            } else {
                z5 = false;
                cVarH.L(-1977991421);
            }
            cVarH.U(z5);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            w47Var2 = w47Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final w47 w47Var4 = w47Var2;
            iVarW.d = new Function2(function1, w47Var4, z, i7dVar, gu5Var4, gu5Var3, i) { // from class: x47
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ w47 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ i7d e;
                public final /* synthetic */ gu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    y47.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
