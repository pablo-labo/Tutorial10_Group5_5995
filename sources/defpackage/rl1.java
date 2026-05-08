package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.d0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rl1 {
    public static final void a(final e eVar, c20 c20Var, boolean z, final ah2 ah2Var, b bVar, final int i, final int i2) {
        int i3;
        final boolean z2;
        c cVarH = bVar.h(380139498);
        if ((i & 6) == 0) {
            i3 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.K(c20Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i3 |= cVarH.x(ah2Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i6 = 0;
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                c20Var = c20.a.a;
            }
            boolean z3 = i5 != 0 ? false : z;
            ag9 ag9VarD = hl1.d(c20Var, z3);
            boolean zK = cVarH.K(ag9VarD) | ((i3 & 7168) == 2048);
            Object objV = cVarH.v();
            if (zK || objV == b.a.a) {
                objV = new ol1(i6, ag9VarD, ah2Var);
                cVarH.p(objV);
            }
            d0.a(eVar, (Function2) objV, cVarH, i3 & 14, 0);
            z2 = z3;
        } else {
            cVarH.D();
            z2 = z;
        }
        final c20 c20Var2 = c20Var;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: pl1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rl1.a(eVar, c20Var2, z2, ah2Var, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }
}
