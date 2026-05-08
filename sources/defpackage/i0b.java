package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;

/* JADX INFO: loaded from: classes2.dex */
public final class i0b {
    public static final void a(String str, String str2, String str3, gu5 gu5Var, gu5 gu5Var2, b bVar, int i) {
        str.getClass();
        c cVarH = bVar.h(-244780913);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.K(str2) ? 32 : 16) | (cVarH.K(str3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var2) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ah2 ah2VarC = bh2.c(-960454459, new og4(o97Var, str), cVarH);
            e.a aVar = e.a.b;
            e eVarA = f.a(aVar, "PageHeader");
            o97.g gVar = o97Var.i;
            iv6.a(ah2VarC, androidx.compose.foundation.layout.f.j(eVarA, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, null, false, null, bh2.c(-192388724, new zg4(1, gu5Var, str3), cVarH), bh2.c(530901709, new x00(2, gu5Var2), cVarH), cVarH, 113246214, 124);
            if (str2 == null) {
                cVarH.L(587332762);
                cVarH.U(false);
            } else {
                cVarH.L(587332763);
                tjf tjfVarD = ((tjf) cVarH.M(fif.a)).d(o97Var.j.h);
                e eVarH = g.h(g.f(aVar, 1.0f), 48.0f);
                ag9 ag9VarD = hl1.d(c20.a.h, false);
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
                ygg.y(cVarH, ag9VarD, gl2.a.g);
                ygg.y(cVarH, t8bVarP, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                    ja.h(iHashCode, cVarH, iHashCode, c0251a);
                }
                ygg.y(cVarH, eVarC, gl2.a.d);
                fif.b(str2, null, o97Var.c.a.c, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tjfVarD, cVarH, (i2 >> 3) & 14, 3120, 55290);
                cVarH = cVarH;
                cVarH.U(true);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new te(str, str2, str3, gu5Var, gu5Var2, i);
        }
    }
}
