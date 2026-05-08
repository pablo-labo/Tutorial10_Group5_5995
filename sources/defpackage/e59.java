package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class e59 {
    public static final void a(String str, b bVar, int i) {
        c cVar;
        str.getClass();
        c cVarH = bVar.h(-1738384664);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.c(8.0f) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.c(24.0f) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            cVar = cVarH;
            cif.b(str, f.a(androidx.compose.foundation.layout.f.i(e.a.b, 0.0f, 8.0f, 0.0f, 24.0f), "LongFieldDescription"), eu6.m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((o97) cVarH.M(p97.a)).j.g, cVar, i2 & 14, 0, 65528);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new lo0(str, i, 1);
        }
    }
}
