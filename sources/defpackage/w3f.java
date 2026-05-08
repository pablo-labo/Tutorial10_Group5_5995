package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class w3f {
    public static final ne4 a = new ne4(new kr(17));
    public static final ne4 b = new ne4(new fc2(17));
    public static final ne4 c = new ne4(new vy2(13));
    public static final ne4 d = new ne4(new wy2(19));

    public static final void a(String str, Function1 function1, Function1 function12, Function1 function13, ah2 ah2Var, b bVar, int i) {
        int i2;
        str.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        c cVarH = bVar.h(1083792906);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(function12) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(function13) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(ah2Var) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            rm2.b(new i6c[]{a.a(str), b.a(function1), c.a(function12), d.a(function13)}, bh2.c(812409546, new v02(ah2Var, 7), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new v3f(str, function1, function12, function13, ah2Var, i, 0);
        }
    }
}
