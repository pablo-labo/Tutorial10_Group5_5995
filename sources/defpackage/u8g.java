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
public final class u8g {
    public static final void a(Function1 function1, String str, gu5 gu5Var, b bVar, int i) {
        function1.getClass();
        str.getClass();
        c cVarH = bVar.h(-326983417);
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
            boolean z = gu5Var != null;
            ho4 ho4Var = ho4.a;
            String strI = ak2.I(ho4Var.a(), cVarH);
            String strI2 = ak2.I(ho4Var.a(), cVarH);
            cVarH.L(302750111);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = v40.a(cVarH);
            }
            d3a d3aVar = (d3a) objV;
            if (gu5Var == null) {
                cVarH.L(1318574855);
            } else {
                cVarH.L(1318574856);
                boolean zK = cVarH.K(d3aVar) | cVarH.K(gu5Var);
                Object objV2 = cVarH.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new t8g(d3aVar, gu5Var, null);
                    cVarH.p(objV2);
                }
                to4.d(cVarH, d3aVar, (Function2) objV2);
            }
            cVarH.U(false);
            cVarH.U(false);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = new zrb(function1, 1);
                cVarH.p(objV3);
            }
            jyb.a(str, function1, strI, true, strI2, z, d3aVar, null, (gu5) objV3, false, null, null, null, null, null, cVarH, ((i2 >> 6) & 14) | 3120, 0, 32384);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new zj7(function1, str, gu5Var, i);
        }
    }

    public static final void b(final boolean z, final List list, final Function1 function1, final gu5 gu5Var, final gu5 gu5Var2, final Function1 function12, gu5 gu5Var3, boolean z2, final String str, final Function1 function13, final hw9 hw9Var, b bVar, final int i, final int i2) {
        int i3;
        gu5 gu5Var4;
        int i4;
        boolean z3;
        c cVar;
        final gu5 gu5Var5;
        int i5;
        int i6;
        list.getClass();
        function1.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        function12.getClass();
        str.getClass();
        function13.getClass();
        c cVarH = bVar.h(255470846);
        if ((i & 6) == 0) {
            i3 = i | (cVarH.a(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i7 = i3 | (cVarH.x(list) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var2) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i7 |= cVarH.x(function12) ? 131072 : 65536;
        }
        int i8 = i2 & 64;
        if (i8 != 0) {
            i4 = i7 | 1572864;
            gu5Var4 = gu5Var3;
        } else {
            gu5Var4 = gu5Var3;
            i4 = i7 | (cVarH.x(gu5Var4) ? 1048576 : 524288);
        }
        int i9 = i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i9 != 0) {
            i4 |= 12582912;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i & 12582912) == 0) {
                i4 |= cVarH.a(z3) ? 8388608 : 4194304;
            }
        }
        int i10 = i4 | (cVarH.K(str) ? 67108864 : 33554432);
        if ((i & 805306368) == 0) {
            i10 |= cVarH.x(function13) ? 536870912 : 268435456;
        }
        int i11 = 8 | (cVarH.x(hw9Var) ? 4 : 2);
        int i12 = i10;
        if (cVarH.o(i12 & 1, ((i10 & 306783379) == 306783378 && (i11 & 3) == 2) ? false : true)) {
            gu5 gu5Var6 = i8 != 0 ? null : gu5Var4;
            if (i9 != 0) {
                z3 = true;
            }
            if (!z3 || z) {
                i5 = 50658973;
                i6 = R.string.label_edit_education;
            } else {
                i5 = 50521023;
                i6 = R.string.label_add_education;
            }
            String strK = z3.k(cVarH, i5, i6, cVarH, false);
            ho4 ho4Var = ho4.a;
            String strI = ak2.I(ho4Var.a(), cVarH);
            Float fValueOf = z3 ? Float.valueOf(i3c.b(ho4Var.c(), ho4.W.a())) : null;
            int i13 = z3 ? R.string.next_button_label : R.string.done_button_label;
            boolean z4 = ((i12 & 458752) == 131072) | ((i12 & 57344) == 16384);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z4 || objV == c0020a) {
                objV = new cn4(function12, gu5Var2, 1);
                cVarH.p(objV);
            }
            Function1 function14 = (Function1) objV;
            boolean z5 = (i12 & 1879048192) == 536870912;
            Object objV2 = cVarH.v();
            if (z5 || objV2 == c0020a) {
                objV2 = new dn4(function13, 2);
                cVarH.p(objV2);
            }
            int i14 = i12 << 18;
            cVar = cVarH;
            e51.b(strK, strI, null, null, true, false, str, list, function1, gu5Var, function14, gu5Var6, null, fValueOf, (Function1) objV2, hw9Var, i13, null, null, false, false, cVar, (3670016 & (i12 >> 6)) | 221184 | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), ((i12 >> 15) & 112) | 262528 | ((i11 << 15) & 458752), 1966092);
            gu5Var5 = gu5Var6;
        } else {
            cVar = cVarH;
            cVar.D();
            gu5Var5 = gu5Var4;
        }
        final boolean z6 = z3;
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: s8g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    u8g.b(z, list, function1, gu5Var, gu5Var2, function12, gu5Var5, z6, str, function13, hw9Var, (b) obj, iL, i2);
                    return j6g.a;
                }
            };
        }
    }
}
