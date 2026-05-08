package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sq8 {

    public static final class a implements Function2<b, Integer, j6g> {
        public final /* synthetic */ c a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;

        public a(int i, c cVar, Object obj) {
            this.a = cVar;
            this.b = i;
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                this.a.h(this.b, this.c, bVar2, 0);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final void a(final c cVar, final Object obj, final int i, final Object obj2, b bVar, final int i2) {
        androidx.compose.runtime.c cVarH = bVar.h(1439843069);
        int i3 = (cVarH.K(cVar) ? 4 : 2) | i2 | (cVarH.K(obj) ? 32 : 16) | (cVarH.d(i) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(obj2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            ((ekd) obj).d(obj2, bh2.c(980966366, new a(i, cVar, obj2), cVarH), cVarH, 48);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(obj, i, obj2, i2) { // from class: rq8
                public final /* synthetic */ Object b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Object d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iL = ka2.L(1);
                    sq8.a(this.a, this.b, this.c, this.d, (b) obj3, iL);
                    return j6g.a;
                }
            };
        }
    }
}
