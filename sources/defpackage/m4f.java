package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.jd6;
import defpackage.o97;
import defpackage.vs0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class m4f {
    public static final void a(tg2 tg2Var, String str, ArrayList arrayList, b bVar, int i) {
        int i2;
        tg2Var.getClass();
        c cVarH = bVar.h(-1468025857);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(tg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(arrayList) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 >> 3;
            ie7.e(str, null, null, cVarH, i3 & 14);
            b(!tg2Var.a(), arrayList, cVarH, i3 & 112);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new l49(tg2Var, str, arrayList, i);
        }
    }

    public static final void b(final boolean z, final ArrayList arrayList, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(1724407249);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(arrayList) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            jd6.a aVar = new jd6.a();
            e eVarJ = e.a.b;
            if (z) {
                o97.g gVar = o97Var.i;
                eVarJ = f.j(eVarJ, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            }
            e eVar = eVarJ;
            o97.g gVar2 = o97Var.i;
            vs0.i iVar = new vs0.i(8.0f, true, new us0(0));
            vs0.i iVar2 = new vs0.i(8.0f, true, new us0(0));
            boolean zX = cVarH.x(arrayList);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new ji(arrayList, 13);
                cVarH.p(objV);
            }
            on8.a(aVar, eVar, null, null, iVar2, iVar, null, false, null, (Function1) objV, cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: j4f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    m4f.b(z, arrayList, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
