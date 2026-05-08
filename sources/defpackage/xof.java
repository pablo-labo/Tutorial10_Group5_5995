package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.o97;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class xof {
    public static final void a(final String str, final String str2, final String str3, final gu5<j6g> gu5Var, final Function1<? super String, j6g> function1, b bVar, final int i) {
        gu5Var.getClass();
        function1.getClass();
        c cVarH = bVar.h(547686687);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.K(str2) ? 32 : 16) | (cVarH.K(str3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function1) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            by1.a(f.f(e.a.b, 4.0f), ggd.a(8.0f), o97Var.c.b.c, bh2.c(1343168988, new zl4(o97Var, str, str2, str3, function1, gu5Var), cVarH), cVarH, 1597440, 40);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, str2, str3, gu5Var, function1, i) { // from class: wof
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    xof.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
