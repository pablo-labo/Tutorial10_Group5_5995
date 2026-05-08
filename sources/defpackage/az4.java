package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class az4 {
    public static final void a(e eVar, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-278369506);
        int i3 = (cVarH.K(eVar) ? 4 : 2) | i;
        int i4 = 0;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            e eVarA = f.a(androidx.compose.foundation.layout.f.f(eVar, 16.0f), "EventListShimmer");
            vs0.i iVar = new vs0.i(24.0f, true, new us0(i4));
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new xr(3);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            i2 = 1;
            hn8.b(eVarA, null, null, false, iVar, c20.a.n, null, false, null, function1, cVarH, 805527552, 462);
        } else {
            i2 = 1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new cy2(eVar, i, i2);
        }
    }

    public static final void b(final boolean z, final boolean z2, b bVar, final int i) {
        c cVarH = bVar.h(-1279951360);
        int i2 = 0;
        if (cVarH.o(i & 1, (i & 19) != 18)) {
            fgd fgdVar = new fgd(new k94(20.0f), new k94(20.0f), new k94(z ? 6.0f : 20.0f), new k94(z ? 20.0f : 6.0f));
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            ob2 ob2VarA = mb2.a(new vs0.i(4.0f, true, new us0(i2)), z ? c20.a.o : c20.a.m, cVarH, 6);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            hl1.a(androidx.compose.foundation.layout.f.f(g.h(g.r(rx6.c(ygg.h(aVar, fgdVar), null, cVarH, 3), 323.0f), 68.0f), 16.0f), cVarH, 0);
            if (z2) {
                cVarH.L(1612179745);
                rx6.a(xie.a, g.h(g.r(aVar, 90.0f), 18.0f), null, null, null, 0, cVarH, 54);
            } else {
                cVarH.L(1609496044);
            }
            cVarH.U(false);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, z, z2) { // from class: zy4
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;

                {
                    this.a = z;
                    this.b = z2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(55);
                    az4.b(this.a, this.b, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
