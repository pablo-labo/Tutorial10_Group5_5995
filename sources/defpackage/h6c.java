package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h6c {

    public static final class a extends mj8 implements Function2<b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<b, Integer, j6g> $content;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ tjf $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j, tjf tjfVar, Function2<? super b, ? super Integer, j6g> function2, int i) {
            super(2);
            this.$contentColor = j;
            this.$textStyle = tjfVar;
            this.$content = function2;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            num.intValue();
            h6c.a(this.$contentColor, this.$textStyle, this.$content, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final void a(long j, tjf tjfVar, Function2<? super b, ? super Integer, j6g> function2, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-716124955);
        if ((i & 6) == 0) {
            i2 = (cVarH.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(tjfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 147) == 146 && cVarH.i()) {
            cVarH.D();
        } else {
            ne4 ne4Var = cif.a;
            rm2.b(new i6c[]{qs2.a.a(new da2(j)), ne4Var.a(((tjf) cVarH.M(ne4Var)).d(tjfVar))}, function2, cVarH, ((i2 >> 3) & 112) | 8);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new a(j, tjfVar, function2, i);
        }
    }
}
