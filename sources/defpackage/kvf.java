package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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

/* JADX INFO: loaded from: classes.dex */
public final class kvf {
    public static final kvf a = new kvf();

    public final void a(final e eVar, final Function2 function2, final ah2 ah2Var, final Function2 function22, final Function2 function23, Function2 function24, b bVar, final int i) {
        int i2;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        final Function2 function25 = function24;
        c cVarH = bVar.h(598947838);
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
            i2 |= cVarH.x(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.x(function25) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.K(this) ? 1048576 : 524288;
        }
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            float f2 = function2 == null ? 64.0f : 72.0f;
            e eVarJ = g.j(eVar, f2, 0.0f, 2);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            int i3 = i2;
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
            e eVarJ2 = f.j(new LayoutWeightElement(1.0f, true), 16.0f, 0.0f, 16.0f, 0.0f, 10);
            if (function2 != null) {
                cVarH.L(1807018686);
                f = f2;
                e eVarJ3 = f.j(g.q(e.a.b, 56.0f, f, 0.0f, 0.0f, 12), 16.0f, 16.0f, 0.0f, 16.0f, 4);
                ag9 ag9VarD = hl1.d(c20.a.a, false);
                int iG2 = cVarH.G();
                t8b t8bVarP2 = cVarH.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ3);
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
                z = true;
                cVarH.U(true);
                cVarH.U(false);
            } else {
                f = f2;
                z = true;
                cVarH.L(1807574144);
                cVarH.U(false);
            }
            if (function23 != null) {
                cVarH.L(1807622349);
                uy8.a(u63.a0(new j94(24.0f), new j94(20.0f)), eVarJ2, bh2.c(979717374, new ivf(function23, ah2Var), cVarH), cVarH, 390);
                z2 = false;
                cVarH.U(false);
            } else {
                cVarH.L(1807914338);
                uy8.a(u63.a0(new j94(function2 != null ? 32.0f : 28.0f), new j94(20.0f)), eVarJ2, bh2.c(-1888627961, new w10(ah2Var, function22), cVarH), cVarH, 384);
                z2 = false;
                cVarH.U(false);
            }
            if (function24 != null) {
                cVarH.L(1808643799);
                function25 = function24;
                z3 = z;
                uy8.c(function2 != null ? 32.0f : 28.0f, null, bh2.c(-1476831345, new jvf(f, function25), cVarH), cVarH, 384, 2);
                cVarH.U(z2);
            } else {
                function25 = function24;
                z3 = z;
                cVarH.L(1809267488);
                cVarH.U(z2);
            }
            cVarH.U(z3);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: hvf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.a.a(eVar, function2, ah2Var, function22, function23, function25, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
