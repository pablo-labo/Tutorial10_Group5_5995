package defpackage;

import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yq8 {
    public static final void a(final gu5 gu5Var, final e eVar, final mr8 mr8Var, final zq8 zq8Var, b bVar, final int i) {
        c cVarH = bVar.h(1055276397);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i | (cVarH.K(eVar) ? 32 : 16) | (cVarH.K(mr8Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(zq8Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            wg2.b(bh2.c(-933153643, new d(mr8Var, eVar, zq8Var, r.g(gu5Var, cVarH)), cVarH), cVarH, 6);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(eVar, mr8Var, zq8Var, i) { // from class: vq8
                public final /* synthetic */ e b;
                public final /* synthetic */ mr8 c;
                public final /* synthetic */ zq8 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    yq8.a(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
