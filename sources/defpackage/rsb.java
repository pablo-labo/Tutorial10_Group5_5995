package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class rsb {
    public static final void a(final int i, final gu5 gu5Var, b bVar, e eVar, final String str, final boolean z) {
        int i2;
        final e eVar2;
        gu5Var.getClass();
        c cVarH = bVar.h(-1391612402);
        if ((i & 48) == 0) {
            i2 = (cVarH.x(null) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i3 = i2 | 24576;
        if (cVarH.o(i3 & 1, (i3 & 9361) != 9360)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarN = g.n(aVar, 120.0f);
            af1 af1Var = c20.a.a;
            ag9 ag9VarD = hl1.d(af1Var, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarN);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            gl2.a.e eVar3 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar3);
            o97.g gVar = o97Var.i;
            e eVarF = f.f(a.b(ygg.h(androidx.compose.foundation.layout.b.a.h(g.n(aVar, 160.0f), c20.a.e), ggd.a), o97Var.c.b.b, ytc.a), 8.0f);
            ag9 ag9VarD2 = hl1.d(af1Var, false);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD2, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar3);
            ah2 ah2VarC = bh2.c(-735351782, new psb(o97Var, str, aVar), cVarH);
            if (((kr7) cr8.p(kr7.class)).e("droid_native_profile_online_status_tst").a == 2) {
                cVarH.L(-1446256609);
                cta.a(z, usa.ProfileAvatar, bh2.c(-1188088465, new ed(ah2VarC, 7), cVarH), cVarH, ((i3 >> 9) & 14) | 432);
                cVarH.U(false);
            } else {
                cVarH.L(-1446002223);
                ah2VarC.invoke(cVarH, 6);
                cVarH.U(false);
            }
            cVarH.U(true);
            cVarH.U(true);
            eVar2 = aVar;
        } else {
            cVarH.D();
            eVar2 = eVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: qsb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rsb.a(ka2.L(i | 1), gu5Var, (b) obj, eVar2, str, z);
                    return j6g.a;
                }
            };
        }
    }
}
