package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class av6 {
    public static final void a(String str, e eVar, bv6 bv6Var, b bVar, int i) {
        String str2;
        int i2;
        c cVar;
        tjf tjfVar;
        str.getClass();
        c cVarH = bVar.h(-490835474);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (cVarH.K(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(bv6Var.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            switch (bv6Var.ordinal()) {
                case 0:
                    tjfVar = o97Var.j.h;
                    break;
                case 1:
                    tjfVar = o97Var.j.g;
                    break;
                case 2:
                    tjfVar = o97Var.j.f;
                    break;
                case 3:
                    tjfVar = o97Var.j.e;
                    break;
                case 4:
                    tjfVar = o97Var.j.d;
                    break;
                case 5:
                    tjfVar = o97Var.j.c;
                    break;
                case 6:
                    tjfVar = o97Var.j.b;
                    break;
                case 7:
                    tjfVar = o97Var.j.a;
                    break;
                default:
                    l.g();
                    return;
            }
            cVar = cVarH;
            cif.b(str2, eVar, o97Var.c.a.c, 0L, null, o97Var.f.c, o97Var.d.a, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVar, i2 & 126, 0, 65432);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new q90(i, 1, str, eVar, bv6Var);
        }
    }
}
