package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zu6 {
    public static final void a(e eVar, boolean z, ah2 ah2Var, Function2 function2, b bVar, final int i, final int i2) {
        final ah2 ah2Var2;
        final e eVar2;
        final boolean z2;
        final Function2 function22;
        c cVarH = bVar.h(723620857);
        int i3 = i | 6;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 54;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.a(z) ? 32 : 16;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= cVarH.x(function2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i6 = i3 | 24576;
        if ((i6 & 9363) == 9362 && cVarH.i()) {
            cVarH.D();
            function22 = function2;
            ah2Var2 = ah2Var;
            z2 = z;
            eVar2 = eVar;
        } else {
            if (i4 != 0) {
                z = true;
            }
            boolean z3 = z;
            if (i5 != 0) {
                function2 = ui2.a;
            }
            Function2 function23 = function2;
            e.a aVar = e.a.b;
            b(aVar, z3, ah2Var, function23, cVarH, i6 & 65534);
            ah2Var2 = ah2Var;
            eVar2 = aVar;
            z2 = z3;
            function22 = function23;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: xu6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zu6.a(eVar2, z2, ah2Var2, function22, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final e eVar, final boolean z, final Function2 function2, final Function2 function22, b bVar, final int i) {
        int i2;
        e eVarA;
        c cVarH = bVar.h(366746326);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(function22) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(null) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && cVarH.i()) {
            cVarH.D();
        } else {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarF = g.f(f.a(eVar, "IdlFloatingActionBar"), 1.0f);
            cVarH.L(255917812);
            e eVar2 = e.a.b;
            if (z) {
                if (o97Var.a >= 7) {
                    cVarH.L(5004770);
                    boolean zX = cVarH.x(o97Var);
                    Object objV = cVarH.v();
                    if (zX || objV == b.a.a) {
                        objV = new tv(o97Var, 11);
                        cVarH.p(objV);
                    }
                    cVarH.U(false);
                    eVarA = g.f(a.a(eVar2, (Function1) objV), 1.0f);
                } else {
                    eVarA = androidx.compose.ui.c.a(eVar2, tf7.a, new hx6(da2.b(eu6.k, 0.25f)));
                }
                eVar2 = eVarA;
            }
            cVarH.U(false);
            e eVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.f.h(androidx.compose.foundation.a.b(eVarF.o(eVar2), o97Var.c.b.a, ytc.a), 24.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 12.0f, 5);
            ob2 ob2VarA = mb2.a(new vs0.i(8.0f, true, new us0(0)), c20.a.n, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
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
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            function2.invoke(cVarH, Integer.valueOf((i2 >> 6) & 14));
            function22.invoke(cVarH, Integer.valueOf((i2 >> 9) & 14));
            cVarH.U(true);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: yu6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zu6.b(eVar, z, function2, function22, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
