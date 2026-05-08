package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.jc7;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kee {
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        gu5Var.getClass();
        c cVarH = bVar.h(1191622664);
        int i2 = i & 1;
        if (cVarH.o(i2, i2 != 0)) {
            fgd fgdVarA = ggd.a(8.0f);
            e.a aVar = e.a.b;
            e eVarH = f.h(ygg.h(aVar, fgdVarA), 0.0f, 6.0f, 1);
            ob2 ob2VarA = mb2.a(vs0.e, c20.a.m, cVarH, 6);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarH);
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
            hl1.a(a.a(g.h(g.f(aVar, 1.0f), 30.0f), c(cVarH), null, 6), cVarH, 0);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ok4(gu5Var, i, 7);
        }
    }

    public static final void b(int i, b bVar) {
        c cVarH = bVar.h(2065345697);
        if (cVarH.o(i & 1, i != 0)) {
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new hs(15);
                cVarH.p(objV);
            }
            hn8.b(null, null, null, false, null, null, null, false, null, (Function1) objV, cVarH, 805306368, 511);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new vj2(i, 11);
        }
    }

    public static final kx8 c(b bVar) {
        bVar.L(1240895689);
        long j = da2.d;
        List listA0 = u63.a0(new da2(da2.b(j, 0.5f)), new da2(da2.b(j, 0.1f)), new da2(da2.b(j, 0.5f)));
        jc7.a aVarA = lc7.a(lc7.c("", bVar, 0), 1000.0f, zd0.a(zd0.d(1200, 0, null, 6), 4), "", bVar, 28728, 0);
        float fFloatValue = ((Number) ((gme) aVarA.d).getValue()).floatValue();
        float fFloatValue2 = ((Number) ((gme) aVarA.d).getValue()).floatValue();
        kx8 kx8Var = new kx8(0L, (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L), listA0);
        bVar.F();
        return kx8Var;
    }
}
