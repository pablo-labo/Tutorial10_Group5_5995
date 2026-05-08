package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import coil3.compose.internal.ContentPainterElement;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class iv0 {
    public static final void a(final qv0 qv0Var, final String str, final e eVar, final Function1 function1, final Function1 function12, final c20 c20Var, final ft2 ft2Var, b bVar, final int i, final int i2) {
        Function1 function13;
        Function1 function14;
        int i3;
        c cVarH = bVar.h(1236588022);
        int i4 = (cVarH.K(qv0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            function13 = function1;
            i4 |= cVarH.x(function13) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            function13 = function1;
        }
        if ((i & 24576) == 0) {
            function14 = function12;
            i4 |= cVarH.x(function14) ? 16384 : 8192;
        } else {
            function14 = function12;
        }
        if ((196608 & i) == 0) {
            i4 |= cVarH.K(c20Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= cVarH.K(ft2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= cVarH.c(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= cVarH.K(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= cVarH.d(1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (cVarH.a(true) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((306783379 & i4) == 306783378 && (i3 & 3) == 2 && cVarH.i()) {
            cVarH.D();
        } else {
            w27 w27VarD = mkg.d(qv0Var.a, ft2Var, cVarH);
            int i5 = i4 >> 6;
            int i6 = i5 & 57344;
            kv0 kv0VarA = mv0.a(w27VarD, qv0Var.c, function13, function14, ft2Var, cVarH, ((i4 >> 3) & 8064) | i6 | ((i4 >> 12) & 458752), 0);
            rie rieVar = w27VarD.p;
            b(rieVar instanceof nq2 ? eVar.o((e) rieVar) : eVar, kv0VarA, str, c20Var, ft2Var, cVarH, ((i4 << 3) & 896) | (i5 & 7168) | i6 | (i5 & 458752) | (3670016 & i5) | ((i3 << 21) & 29360128));
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: fv0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iv0.a(qv0Var, str, eVar, function1, function12, c20Var, ft2Var, (b) obj, ka2.L(i | 1), ka2.L(i2));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(e eVar, kv0 kv0Var, String str, c20 c20Var, ft2 ft2Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-237738007);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(kv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.K(c20Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(ft2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.c(1.0f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.K(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= cVarH.a(true) ? 8388608 : 4194304;
        }
        if ((i2 & 4793491) == 4793490 && cVarH.i()) {
            cVarH.D();
        } else {
            y03 y03Var = mkg.a;
            e eVarO = ygg.i(str != null ? b5e.b(eVar, false, new d12(str, 5)) : eVar).o(new ContentPainterElement(kv0Var, c20Var, ft2Var, 1.0f, null));
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = hv0.a;
                cVarH.p(objV);
            }
            ag9 ag9Var = (ag9) objV;
            int iG = cVarH.G();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarO);
            t8b t8bVarP = cVarH.P();
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9Var, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            ygg.y(cVarH, eVarC, gl2.a.d);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            cVarH.U(true);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gv0(eVar, kv0Var, str, c20Var, ft2Var, i);
        }
    }
}
