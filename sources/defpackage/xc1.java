package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.h;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xc1 {
    public static final void a(e eVar, h hVar, ah2 ah2Var, b bVar, int i) {
        int i2;
        ah2 ah2Var2 = ei2.a;
        c cVarH = bVar.h(-714464401);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(ah2Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(ah2Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = r.e(null, zkd.f);
                cVarH.p(objV);
            }
            rc1 rc1VarB = b(ah2Var2, cVarH, (i2 >> 6) & 14);
            rm2.a(hVar.a(rc1VarB), bh2.c(274270255, new vc1(eVar, (g4a) objV, ah2Var, rc1VarB), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new tc1(eVar, hVar, ah2Var, i);
        }
    }

    public static final rc1 b(ah2 ah2Var, b bVar, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && bVar.K(ah2Var)) || (i & 6) == 4;
        Object objV = bVar.v();
        Object obj = b.a.a;
        if (z || objV == obj) {
            objV = new rc1(ah2Var);
            bVar.p(objV);
        }
        rc1 rc1Var = (rc1) objV;
        boolean zK = bVar.K(rc1Var);
        Object objV2 = bVar.v();
        if (zK || objV2 == obj) {
            objV2 = new hp0(rc1Var, 3);
            bVar.p(objV2);
        }
        to4.b(rc1Var, (Function1) objV2, bVar);
        return rc1Var;
    }
}
