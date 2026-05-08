package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hfg {
    public static final void a(Function1 function1, String str, gu5 gu5Var, b bVar, int i) {
        function1.getClass();
        str.getClass();
        c cVarH = bVar.h(-24391100);
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
            boolean z = gu5Var != null;
            h2h h2hVar = h2h.JobTitle;
            String strI = ak2.I(h2hVar.a(), cVarH);
            String strI2 = ak2.I(h2hVar.a(), cVarH);
            cVarH.L(106422664);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = v40.a(cVarH);
            }
            d3a d3aVar = (d3a) objV;
            if (gu5Var == null) {
                cVarH.L(424411274);
            } else {
                cVarH.L(424411275);
                boolean zK = cVarH.K(d3aVar) | cVarH.K(gu5Var);
                Object objV2 = cVarH.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new gfg(d3aVar, gu5Var, null);
                    cVarH.p(objV2);
                }
                to4.d(cVarH, d3aVar, (Function2) objV2);
            }
            cVarH.U(false);
            cVarH.U(false);
            e eVarA = androidx.compose.ui.platform.f.a(aVar, "EditWorkExpClickableJobTitle");
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objV3 = cVarH.v();
            if (z2 || objV3 == c0020a) {
                objV3 = new n61(function1, 6);
                cVarH.p(objV3);
            }
            jyb.a(str, function1, strI, true, strI2, z, d3aVar, null, (gu5) objV3, false, eVarA, null, null, null, null, cVarH, ((i2 >> 6) & 14) | 3072 | i3, 6, 31360);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new x7g(function1, str, gu5Var, i, 1);
        }
    }

    public static final void b(final int i, final int i2, final gu5 gu5Var, final gu5 gu5Var2, gu5 gu5Var3, final hw9 hw9Var, b bVar, final String str, final List list, final Function1 function1, Function1 function12, final boolean z, boolean z2) {
        int i3;
        gu5 gu5Var4;
        int i4;
        final boolean z3;
        String str2;
        Function1 function13;
        c cVar;
        final gu5 gu5Var5;
        list.getClass();
        function1.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        function12.getClass();
        str.getClass();
        c cVarH = bVar.h(-963002045);
        if ((i & 6) == 0) {
            i3 = i | (cVarH.a(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (cVarH.x(list) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var2) ? 16384 : 8192);
        int i6 = i2 & 64;
        if (i6 != 0) {
            i4 = i5 | 1572864;
            gu5Var4 = gu5Var3;
        } else {
            gu5Var4 = gu5Var3;
            i4 = i5 | (cVarH.x(gu5Var4) ? 1048576 : 524288);
        }
        int i7 = i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 != 0) {
            i4 |= 12582912;
            str2 = str;
            z3 = z2;
        } else {
            if ((i & 12582912) == 0) {
                z3 = z2;
                i4 |= cVarH.a(z3) ? 8388608 : 4194304;
            } else {
                z3 = z2;
            }
            str2 = str;
        }
        int i8 = i4 | (cVarH.K(str2) ? 67108864 : 33554432) | (cVarH.x(hw9Var) ? 536870912 : 268435456);
        if (cVarH.o(i8 & 1, (306783379 & i8) != 306783378)) {
            gu5 gu5Var6 = i6 != 0 ? null : gu5Var4;
            boolean z4 = i7 != 0 ? true : z3;
            String strK = z ? z3.k(cVarH, 1588120638, R.string.label_edit_work_exp, cVarH, false) : z4 ? z3.k(cVarH, 1588211871, R.string.label_add_work_exp, cVarH, false) : z3.k(cVarH, 1588281342, R.string.label_edit_work_exp, cVarH, false);
            h2h h2hVar = h2h.JobTitle;
            String strI = ak2.I(h2hVar.a(), cVarH);
            Float fValueOf = z4 ? Float.valueOf(i3c.b(h2hVar.c(), 6)) : null;
            int i9 = z4 ? R.string.next_button_label : R.string.done_button_label;
            boolean z5 = (i8 & 57344) == 16384;
            Object objV = cVarH.v();
            if (z5 || objV == b.a.a) {
                function13 = function12;
                objV = new y7g(function13, gu5Var2, 1);
                cVarH.p(objV);
            } else {
                function13 = function12;
            }
            int i10 = i8 << 18;
            cVar = cVarH;
            e51.b(strK, strI, null, null, true, false, str2, list, function1, gu5Var, (Function1) objV, gu5Var6, null, fValueOf, null, hw9Var, i9, null, null, false, false, cVar, ((i8 >> 6) & 3670016) | 221184 | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), ((i8 >> 15) & 112) | 262528 | ((i8 >> 12) & 458752), 1982476);
            z3 = z4;
            gu5Var5 = gu5Var6;
        } else {
            function13 = function12;
            cVar = cVarH;
            cVar.D();
            gu5Var5 = gu5Var4;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            final Function1 function14 = function13;
            iVarW.d = new Function2() { // from class: ffg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hfg.b(ka2.L(i | 1), i2, gu5Var, gu5Var2, gu5Var5, hw9Var, (b) obj, str, list, function1, function14, z, z3);
                    return j6g.a;
                }
            };
        }
    }
}
