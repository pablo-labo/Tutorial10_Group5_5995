package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b9g {
    public static final void a(Function1 function1, String str, gu5 gu5Var, b bVar, int i) {
        function1.getClass();
        c cVarH = bVar.h(34671911);
        int i2 = i | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            e eVarH = f.h(e.a.b, 12.0f, 0.0f, 2);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarH);
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
            String str2 = str == null ? "" : str;
            boolean z = gu5Var != null;
            ho4 ho4Var = ho4.c;
            String strI = ak2.I(ho4Var.a(), cVarH);
            String strI2 = ak2.I(ho4Var.a(), cVarH);
            cVarH.L(-734049761);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = v40.a(cVarH);
            }
            d3a d3aVar = (d3a) objV;
            if (gu5Var == null) {
                cVarH.L(463023721);
            } else {
                cVarH.L(463023722);
                boolean zK = cVarH.K(d3aVar) | cVarH.K(gu5Var);
                Object objV2 = cVarH.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new a9g(d3aVar, gu5Var, null);
                    cVarH.p(objV2);
                }
                to4.d(cVarH, d3aVar, (Function2) objV2);
            }
            cVarH.U(false);
            cVarH.U(false);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = new as2(function1, 3);
                cVarH.p(objV3);
            }
            jyb.a(str2, function1, strI, false, strI2, z, d3aVar, null, (gu5) objV3, false, null, null, null, null, null, cVarH, 3120, 0, 32384);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new n19(function1, str, gu5Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final boolean r38, final defpackage.gu5 r39, final defpackage.gu5 r40, defpackage.gu5 r41, final kotlin.jvm.functions.Function1 r42, final defpackage.gu5 r43, boolean r44, final java.lang.String r45, final kotlin.jvm.functions.Function1 r46, final java.util.List r47, final defpackage.hw9 r48, androidx.compose.runtime.b r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9g.b(boolean, gu5, gu5, gu5, kotlin.jvm.functions.Function1, gu5, boolean, java.lang.String, kotlin.jvm.functions.Function1, java.util.List, hw9, androidx.compose.runtime.b, int, int):void");
    }
}
