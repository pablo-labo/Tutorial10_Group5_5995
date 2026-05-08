package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.sn1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kx7 {
    public static final void a(int i, gu5 gu5Var, b bVar, e eVar, String str) {
        String str2;
        c cVarH = bVar.h(-556900744);
        int i2 = i | (cVarH.K(str) ? 32 : 16) | (cVarH.d(R.drawable.celebration_award) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            e eVarA = a.a(g.h(g.f(androidx.compose.foundation.b.d(eVar, false, null, null, gu5Var, 15), 1.0f), 70.0f), sn1.a.a(u63.a0(new da2(pnb.g(4278210507L)), new da2(pnb.g(4278205083L))), 0.0f, 0.0f, 14), ggd.a(12.0f), 4);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new nf(16);
                cVarH.p(objV);
            }
            e eVarB = b5e.b(eVarA, false, (Function1) objV);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
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
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            e.a aVar2 = e.a.b;
            hl1.a(a.b(g.d(aVar2, 1.0f), da2.b(da2.b, 0.1f), ggd.a(12.0f)), cVarH, 0);
            e eVarH = f.h(g.d(aVar2, 1.0f), 16.0f, 0.0f, 2);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarH);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar2);
            f17.a(z2b.a(R.drawable.celebration_award, (i2 >> 6) & 14, cVarH), null, g.n(aVar2, 48.0f), null, null, 0.0f, null, cVarH, 432, 120);
            long j = da2.e;
            str2 = str;
            cif.b(str2, f.j(new LayoutWeightElement(1.0f, true), 8.0f, 0.0f, 12.0f, 0.0f, 10), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, tjf.a(hz6.e, 0L, 0L, to5.W, null, null, 0L, 0, 0L, null, null, 0, 16777211), cVarH, ((i2 >> 3) & 14) | 384, 3120, 55288);
            cVarH = cVarH;
            f17.a(z2b.a(R.drawable.arrow_right, 0, cVarH), null, g.n(aVar2, 24.0f), null, null, 0.0f, new ih1(j, 5), cVarH, 1573296, 56);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            str2 = str;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jx7(i, gu5Var, eVar, str2);
        }
    }
}
