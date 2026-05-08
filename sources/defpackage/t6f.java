package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class t6f {
    public static final t6f a = new t6f();

    public final void a(float f, final int i, final int i2, final long j, b bVar, e eVar) {
        c cVarH = bVar.h(910934799);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && cVarH.c(f)) ? 32 : 16;
        }
        int i4 = i3 | (cVarH.e(j) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(this) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i4 & 1, (i4 & 1171) != 1170)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                if ((i2 & 2) != 0) {
                    i4 &= -113;
                    f = 1.0f;
                }
                eVar = e.a.b;
            } else {
                cVarH.D();
                if ((i2 & 2) != 0) {
                    i4 &= -113;
                }
            }
            float f2 = f;
            e eVar2 = eVar;
            cVarH.V();
            b84.a(f2, ((i4 >> 3) & 112) | 6 | ((i4 << 3) & 896), 8, j, cVarH, eVar2);
            f = f2;
            eVar = eVar2;
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final e eVar3 = eVar;
            final float f3 = f;
            iVarW.d = new Function2() { // from class: p6f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    this.a.a(f3, iL, i2, j, (b) obj, eVar3);
                    return j6g.a;
                }
            };
        }
    }
}
