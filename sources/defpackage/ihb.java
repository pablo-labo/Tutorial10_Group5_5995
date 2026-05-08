package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ihb {
    public static final void a(final nhb nhbVar, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, e eVar, final gu5 gu5Var4, b bVar, final int i) {
        final e eVar2;
        nhbVar.getClass();
        c cVarH = bVar.h(1545887156);
        int i2 = i | (cVarH.K(nhbVar) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | 196608 | (cVarH.x(gu5Var4) ? 1048576 : 524288);
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            e.a aVar = e.a.b;
            ay1.b(f.i(aVar, 8.0f, 8.0f, 8.0f, 16.0f), null, wx1.a(eu6.u, 0L, 0L, 0L, cVarH, 14), null, null, bh2.c(1220827778, new fhb(nhbVar, gu5Var4, gu5Var3, gu5Var, gu5Var2, 0), cVarH), cVarH, 196608, 26);
            cVarH = cVarH;
            eVar2 = aVar;
        } else {
            cVarH.D();
            eVar2 = eVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(gu5Var, gu5Var2, gu5Var3, eVar2, gu5Var4, i) { // from class: ghb
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ e e;
                public final /* synthetic */ gu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(24577);
                    ihb.a(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
