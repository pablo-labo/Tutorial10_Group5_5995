package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.lj8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class py6 {
    public static final void a(final String str, final Function1 function1, final String str2, final Function1 function12, e eVar, int i, int i2, int i3, final String str3, b bVar, final int i4) {
        c cVar;
        final e eVar2;
        final int i5;
        final int i6;
        final int i7;
        str.getClass();
        function1.getClass();
        str2.getClass();
        function12.getClass();
        c cVarH = bVar.h(1159001911);
        int i8 = i4 | (cVarH.K(str) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | 920346624;
        if ((306783379 & i8) == 306783378 && cVarH.i()) {
            cVarH.D();
            eVar2 = eVar;
            i5 = i;
            i6 = i2;
            i7 = i3;
            cVar = cVarH;
        } else {
            String str4 = str3 == null ? "IdlTextArea" : str3;
            e.a aVar = e.a.b;
            cVar = cVarH;
            dz6.a(str, function1, function12, aVar, null, null, null, null, null, null, str2, null, null, false, 3, Integer.MAX_VALUE, null, -1, null, false, str4, null, cVar, (i8 & 126) | 14355840, ((i8 >> 6) & 14) | 918773760, 0, 11614992);
            eVar2 = aVar;
            i5 = 3;
            i6 = Integer.MAX_VALUE;
            i7 = -1;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, function1, str2, function12, eVar2, i5, i6, i7, str3, i4) { // from class: oy6
                public final /* synthetic */ int V;
                public final /* synthetic */ int W;
                public final /* synthetic */ String X;
                public final /* synthetic */ String a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ e e;
                public final /* synthetic */ int f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(3073);
                    py6.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(String str, Function1 function1, Function1 function12, e eVar, String str2, int i, b bVar, int i2) {
        c cVar;
        int i3;
        str.getClass();
        function1.getClass();
        function12.getClass();
        c cVarH = bVar.h(397275287);
        int i4 = i2 | (cVarH.K(str) ? 4 : 2) | (cVarH.K(eVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(str2) ? 16384 : 8192) | 807075840;
        if ((306783379 & i4) == 306783378 && cVarH.i()) {
            cVarH.D();
            i3 = i;
            cVar = cVarH;
        } else {
            cVar = cVarH;
            dz6.a(str, function1, function12, eVar, null, str2 != null ? new lj8.a(str2, false) : null, null, null, null, null, null, null, null, false, 3, Integer.MAX_VALUE, null, -1, null, false, "IdlTextArea", null, cVar, (i4 & 8190) | 14155776, 918773760, 0, 11616016);
            i3 = -1;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new f74(str, function1, function12, eVar, str2, i3, i2);
        }
    }
}
