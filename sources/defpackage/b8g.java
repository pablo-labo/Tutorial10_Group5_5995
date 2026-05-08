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
public final class b8g {
    public static final void a(Function1 function1, String str, gu5 gu5Var, b bVar, int i) {
        function1.getClass();
        c cVarH = bVar.h(-1737320584);
        int i2 = i | (cVarH.x(function1) ? 32 : 16) | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            e.a aVar = e.a.b;
            e eVarH = f.h(aVar, 12.0f, 0.0f, 2);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
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
            String str2 = str == null ? "" : str;
            h2h h2hVar = h2h.Company;
            String strI = ak2.I(h2hVar.a(), cVarH);
            String str3 = str2;
            boolean z = gu5Var != null;
            String strI2 = ak2.I(h2hVar.a(), cVarH);
            cVarH.L(-2145766564);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = v40.a(cVarH);
            }
            d3a d3aVar = (d3a) objV;
            if (gu5Var == null) {
                cVarH.L(-1494640364);
            } else {
                cVarH.L(-1494640363);
                boolean zK = cVarH.K(d3aVar) | cVarH.K(gu5Var);
                Object objV2 = cVarH.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new a8g(d3aVar, gu5Var, null);
                    cVarH.p(objV2);
                }
                to4.d(cVarH, d3aVar, (Function2) objV2);
            }
            cVarH.U(false);
            cVarH.U(false);
            e eVarA = androidx.compose.ui.platform.f.a(aVar, "EditWorkExpClickableCompany");
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objV3 = cVarH.v();
            if (z2 || objV3 == c0020a) {
                objV3 = new n61(function1, 5);
                cVarH.p(objV3);
            }
            jyb.a(str3, function1, strI, false, strI2, z, d3aVar, null, (gu5) objV3, false, eVarA, null, null, null, null, cVarH, i3 | 3072, 6, 31360);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new x7g(function1, str, gu5Var, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final boolean r42, final java.util.List<defpackage.g51> r43, final kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r44, final defpackage.gu5<defpackage.j6g> r45, final defpackage.gu5<defpackage.j6g> r46, final defpackage.gu5<defpackage.j6g> r47, defpackage.gu5<defpackage.j6g> r48, final kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r49, final boolean r50, final java.lang.String r51, boolean r52, final defpackage.hw9 r53, androidx.compose.runtime.b r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8g.b(boolean, java.util.List, kotlin.jvm.functions.Function1, gu5, gu5, gu5, gu5, kotlin.jvm.functions.Function1, boolean, java.lang.String, boolean, hw9, androidx.compose.runtime.b, int, int, int):void");
    }
}
