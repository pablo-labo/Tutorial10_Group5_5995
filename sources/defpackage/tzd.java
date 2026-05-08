package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tzd {
    public static final void a(final List list, final String str, final Function1 function1, final gu5 gu5Var, final gu5 gu5Var2, b bVar, final int i) {
        c cVar;
        list.getClass();
        str.getClass();
        function1.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(-948068326);
        int i2 = 2048;
        int i3 = ((i & 6) == 0 ? i | (cVarH.x(list) ? 4 : 2) : i) | 48 | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var) ? 16384 : 8192) | (cVarH.x(gu5Var2) ? 131072 : 65536) | 1572864;
        if (cVarH.o(i3 & 1, (599187 & i3) != 599186)) {
            Iterator it = list.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                } else if (wl7.b((String) it.next(), null)) {
                    break;
                } else {
                    i4++;
                }
            }
            cVarH.L(-560582980);
            List list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            int i5 = 0;
            for (Object obj : list2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    u63.o0();
                    throw null;
                }
                String str2 = (String) obj;
                boolean zK = ((i3 & 7168) == i2) | cVarH.K(str2);
                Object objV = cVarH.v();
                if (zK || objV == b.a.a) {
                    objV = new rr(11, function1, str2);
                    cVarH.p(objV);
                }
                arrayList.add(new ax6(str2, (gu5) objV, null, i5 == i4, false, 492));
                i5 = i6;
                i2 = 2048;
            }
            cVarH.U(false);
            cVar = cVarH;
            sb1.a(str, gu5Var, null, 0, null, 0, gu5Var2, null, null, false, false, false, false, null, 0, bh2.c(812129884, new uw(arrayList, 12), cVarH), cVar, ((i3 >> 6) & 14) | 384 | ((i3 >> 9) & 112) | 24576 | ((i3 << 3) & 3670016), 196608, 32680);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: szd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    tzd.a(list, str, function1, gu5Var, gu5Var2, (b) obj2, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
