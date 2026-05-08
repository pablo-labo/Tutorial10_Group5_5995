package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.n3f;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class v4f {
    public static final List<yd8<? extends Object>> a;

    static {
        iwc iwcVar = fwc.a;
        a = u63.a0(iwcVar.b(gq1.class), iwcVar.b(sx8.class), iwcVar.b(oq6.class));
    }

    public static final void a(tg2 tg2Var, Map map, String str, ah2 ah2Var, b bVar, int i) {
        int i2;
        tg2Var.getClass();
        List<tg2> list = tg2Var.c;
        map.getClass();
        c cVarH = bVar.h(1155816135);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(tg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(map) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(ah2Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        boolean zContains = false;
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
            ie7.e(str, null, null, cVarH, i3 & 14);
            if (list.isEmpty()) {
                zContains = true;
            } else if (list.size() == 1) {
                zContains = a.contains(fwc.a.b(((tg2) z92.O0(list)).a.getClass()));
            }
            if (!zContains) {
                l5.q("Content of TELIndeedApplyInterviewButton is invalid");
                return;
            }
            b(new n3f.c(map), ah2Var, cVarH, i3 & 112);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rk7(tg2Var, map, str, ah2Var, i, 1);
        }
    }

    public static final void b(n3f.c cVar, ah2 ah2Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(915443414);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(ah2Var) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            ah2Var.q(cVar, cVarH, Integer.valueOf(i2 & 126));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pm2(cVar, i, 3, ah2Var);
        }
    }
}
