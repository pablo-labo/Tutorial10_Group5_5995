package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.y74;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g4f {
    public static final void a(final tg2 tg2Var, final y74.c cVar, final y74.d dVar, final String str, final Function2 function2, b bVar, final int i) {
        int i2;
        tg2Var.getClass();
        List<tg2> list = tg2Var.c;
        c cVarH = bVar.h(-880178761);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(tg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.d(cVar == null ? -1 : cVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(dVar != null ? dVar.ordinal() : -1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.K(str) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(function2) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            ie7.e(str, null, null, cVarH, (i2 >> 9) & 14);
            if (!list.isEmpty() && (list.size() != 1 || !(((tg2) z92.O0(list)).a instanceof vcf))) {
                l5.q("Content of TELDivider is invalid");
                return;
            }
            b(cVar, dVar, list.isEmpty() ? null : function2, cVarH, (i2 >> 3) & 126);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: f4f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g4f.a(tg2Var, cVar, dVar, str, function2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(y74.c cVar, y74.d dVar, Function2 function2, b bVar, int i) {
        int i2;
        float f;
        float f2;
        boolean z;
        c cVarH = bVar.h(-1631151067);
        if ((i & 6) == 0) {
            i2 = (cVarH.d(cVar == null ? -1 : cVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 131) != 130)) {
            y74.c cVar2 = cVar == null ? y74.c.b : cVar;
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            o97.a.b bVar2 = o97Var.c.c;
            e.a aVar = e.a.b;
            e eVarJ = f.j(aVar, 0.0f, 12.0f, 0.0f, 4.0f, 5);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar2 = gl2.a.g;
            ygg.y(cVarH, ehdVarA, dVar2);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            if (1.0f <= 0.0d) {
                yd7.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
                f2 = Float.MAX_VALUE;
            } else {
                f = 1.0f;
                f2 = Float.MAX_VALUE;
            }
            y74.c cVar3 = cVar2;
            a84.b(cVar2.a(), 0, 0, bVar2.b, cVarH, new LayoutWeightElement(f, true));
            if (function2 == null) {
                cVarH.L(484920971);
                z = false;
            } else {
                cVarH.L(484920972);
                e eVarF = f.f(aVar, 8.0f);
                ag9 ag9VarD = hl1.d(c20.a.a, false);
                int iG2 = cVarH.G();
                t8b t8bVarP2 = cVarH.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar2);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD, dVar2);
                ygg.y(cVarH, t8bVarP2, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG2))) {
                    ja.h(iG2, cVarH, iG2, c0251a);
                }
                ygg.y(cVarH, eVarC2, eVar);
                z = false;
                function2.invoke(cVarH, 0);
                cVarH.U(true);
            }
            cVarH.U(z);
            if (1.0f <= 0.0d) {
                yd7.a("invalid weight; must be greater than zero");
            }
            a84.b(cVar3.a(), 0, 0, bVar2.b, cVarH, new LayoutWeightElement(1.0f > f2 ? f2 : 1.0f, true));
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gkd(cVar, dVar, function2, i, 1);
        }
    }
}
