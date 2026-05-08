package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.material.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pr2 {
    public static final void a(x1c x1cVar, gu5 gu5Var, gu5 gu5Var2, List list, t41 t41Var, gu5 gu5Var3, gu5 gu5Var4, gu5 gu5Var5, gu5 gu5Var6, b bVar, int i) {
        x1cVar.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        list.getClass();
        t41Var.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        gu5Var5.getClass();
        c cVarH = bVar.h(-1911141210);
        int i2 = i | (cVarH.x(x1cVar) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var3) ? 131072 : 65536) | (cVarH.x(gu5Var4) ? 1048576 : 524288) | (cVarH.x(gu5Var5) ? 8388608 : 4194304) | (cVarH.x(gu5Var6) ? 67108864 : 33554432);
        if (cVarH.o(i2 & 1, (38338707 & i2) != 38338706)) {
            hw9 hw9VarC = a.c(iw9.a, null, cVarH, 3078, 6);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new pk1(hw9VarC);
                cVarH.p(objV);
            }
            pk1 pk1Var = (pk1) objV;
            nk1.a(pk1Var, g.f(e.a.b, 1.0f), ggd.b(24.0f, 24.0f, 0.0f, 0.0f), 0.0f, 0L, 0L, 0L, bh2.c(-1829930015, new ir2(q92.B(new s[]{pk1Var}, cVarH), x1cVar, gu5Var, gu5Var4, gu5Var2, gu5Var3, gu5Var5, gu5Var6), cVarH), cVarH, 12582968, 120);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jr2(x1cVar, gu5Var, gu5Var2, list, t41Var, gu5Var3, gu5Var4, gu5Var5, gu5Var6, i);
        }
    }
}
