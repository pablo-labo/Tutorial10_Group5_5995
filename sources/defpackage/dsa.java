package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
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
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class dsa {
    public static final dsa a = new dsa();

    public final void a(final e eVar, final Function2 function2, final ah2 ah2Var, final Function2 function22, b bVar, final int i) {
        int i2;
        int i3;
        boolean z;
        c cVarH = bVar.h(413592998);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(ah2Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(function22) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(this) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            e eVarJ = g.j(eVar, function2 == null ? 48.0f : 56.0f, 0.0f, 2);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            af1 af1Var = c20.a.d;
            af1.b bVar2 = c20.a.k;
            if (function2 != null) {
                cVarH.L(-999770394);
                i3 = i2;
                e eVarJ2 = f.j(g.t(new VerticalAlignElement(bVar2), 56.0f, 0.0f, 2), 16.0f, 8.0f, 0.0f, 8.0f, 4);
                ag9 ag9VarD = hl1.d(af1Var, false);
                int iG2 = cVarH.G();
                t8b t8bVarP2 = cVarH.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ2);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD, dVar);
                ygg.y(cVarH, t8bVarP2, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG2))) {
                    ja.h(iG2, cVarH, iG2, c0251a);
                }
                ygg.y(cVarH, eVarC2, eVar2);
                function2.invoke(cVarH, Integer.valueOf((i3 >> 3) & 14));
                cVarH.U(true);
                cVarH.U(false);
            } else {
                i3 = i2;
                cVarH.L(-999261064);
                cVarH.U(false);
            }
            if (1.0f <= 0.0d) {
                yd7.a("invalid weight; must be greater than zero");
            }
            e eVarJ3 = f.j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).o(new VerticalAlignElement(bVar2)), 16.0f, 0.0f, 16.0f, 0.0f, 10);
            ag9 ag9VarD2 = hl1.d(af1Var, false);
            int iG3 = cVarH.G();
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarJ3);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD2, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG3))) {
                ja.h(iG3, cVarH, iG3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar2);
            ah2Var.invoke(cVarH, Integer.valueOf((i3 >> 6) & 14));
            cVarH.U(true);
            if (function22 != null) {
                cVarH.L(-998918452);
                e eVarJ4 = f.j(new VerticalAlignElement(bVar2), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                ag9 ag9VarD3 = hl1.d(c20.a.a, false);
                int iG4 = cVarH.G();
                t8b t8bVarP4 = cVarH.P();
                e eVarC4 = androidx.compose.ui.c.c(cVarH, eVarJ4);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD3, dVar);
                ygg.y(cVarH, t8bVarP4, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG4))) {
                    ja.h(iG4, cVarH, iG4, c0251a);
                }
                ygg.y(cVarH, eVarC4, eVar2);
                function22.invoke(cVarH, Integer.valueOf((i3 >> 9) & 14));
                z = true;
                cVarH.U(true);
                cVarH.U(false);
            } else {
                z = true;
                cVarH.L(-998722408);
                cVarH.U(false);
            }
            cVarH.U(z);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: csa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.a.a(eVar, function2, ah2Var, function22, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
