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
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class cta {
    public static final void a(final boolean z, final usa usaVar, final ah2 ah2Var, b bVar, final int i) {
        int i2;
        boolean z2;
        boolean z3;
        c cVarH = bVar.h(-675962299);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.d(usaVar == null ? -1 : usaVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(ah2Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (!cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            cVarH.D();
        } else {
            if (usaVar == null) {
                cVarH.L(1508979005);
                ah2Var.invoke(cVarH, Integer.valueOf((i2 >> 6) & 14));
                cVarH.U(false);
                i iVarW = cVarH.W();
                if (iVarW != null) {
                    iVarW.d = new Function2() { // from class: ata
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iL = ka2.L(i | 1);
                            cta.a(z, usaVar, ah2Var, (b) obj, iL);
                            return j6g.a;
                        }
                    };
                    return;
                }
                return;
            }
            cVarH.L(1507602109);
            cVarH.U(false);
            e.a aVar = e.a.b;
            e eVarV = g.v(aVar, null, 3);
            af1 af1Var = c20.a.a;
            ag9 ag9VarD = hl1.d(af1Var, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarV);
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
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            af1 af1Var2 = c20.a.d;
            androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.a;
            e eVarJ = f.j(bVar2.h(aVar, af1Var2), 0.0f, 0.0f, usaVar.c(), 0.0f, 11);
            int i3 = i2;
            ag9 ag9VarD2 = hl1.d(af1Var, false);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ);
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
            ygg.y(cVarH, eVarC2, eVar);
            ah2Var.invoke(cVarH, Integer.valueOf((i3 >> 6) & 14));
            cVarH.U(true);
            if (z) {
                cVarH.L(-1011858055);
                o97 o97Var = (o97) cVarH.M(p97.a);
                e eVarA = androidx.compose.ui.platform.f.a(androidx.compose.foundation.layout.e.b(bVar2.h(aVar, c20.a.i), usaVar.a(), usaVar.f()), "OnlineIndicator");
                ag9 ag9VarD3 = hl1.d(af1Var, false);
                int iHashCode3 = Long.hashCode(cVarH.T);
                t8b t8bVarP3 = cVarH.P();
                e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarA);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar2);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD3, dVar);
                ygg.y(cVarH, t8bVarP3, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                    ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
                }
                ygg.y(cVarH, eVarC3, eVar);
                e eVarN = g.n(aVar, (usaVar.a() * 2.0f) + usaVar.e());
                long j = o97Var.c.b.a;
                fgd fgdVar = ggd.a;
                e eVarB = a.b(eVarN, j, fgdVar);
                ag9 ag9VarD4 = hl1.d(af1Var, false);
                int iHashCode4 = Long.hashCode(cVarH.T);
                t8b t8bVarP4 = cVarH.P();
                e eVarC4 = androidx.compose.ui.c.c(cVarH, eVarB);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar2);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD4, dVar);
                ygg.y(cVarH, t8bVarP4, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode4))) {
                    ja.h(iHashCode4, cVarH, iHashCode4, c0251a);
                }
                ygg.y(cVarH, eVarC4, eVar);
                z3 = false;
                hl1.a(bVar2.h(a.b(g.n(aVar, usaVar.e()), o97Var.c.b.i.d.b, fgdVar), c20.a.e), cVarH, 0);
                z2 = true;
                cVarH.U(true);
                cVarH.U(true);
            } else {
                z2 = true;
                z3 = false;
                cVarH.L(-1013589405);
            }
            cVarH.U(z3);
            cVarH.U(z2);
        }
        i iVarW2 = cVarH.W();
        if (iVarW2 != null) {
            iVarW2.d = new Function2() { // from class: bta
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    cta.a(z, usaVar, ah2Var, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
