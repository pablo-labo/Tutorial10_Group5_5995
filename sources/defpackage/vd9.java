package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.le0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vd9 {

    public static final class a extends mj8 implements Function2<b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $content;
        final /* synthetic */ e $modifier;
        final /* synthetic */ y $node;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, y yVar, e eVar, tjf tjfVar, int i, int i2) {
            super(2);
            this.$content = str;
            this.$node = yVar;
            this.$modifier = eVar;
            this.$style = tjfVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            num.intValue();
            vd9.a(this.$content, this.$node, this.$modifier, this.$style, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final void a(String str, y yVar, e eVar, tjf tjfVar, b bVar, int i, int i2) {
        int i3;
        e eVar2;
        tjf tjfVar2;
        str.getClass();
        yVar.getClass();
        c cVarH = bVar.h(741601728);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.x(yVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && cVarH.K(tjfVar)) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i3 & 1171) == 1170 && cVarH.i()) {
            cVarH.D();
            tjfVar2 = tjfVar;
            eVar2 = eVar;
        } else {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                if (i4 != 0) {
                    eVar = e.a.b;
                }
                if ((i2 & 8) != 0) {
                    tjfVar = ((ae9) cVarH.M(rk2.e)).d();
                    i3 &= -7169;
                }
                e eVar3 = eVar;
                tjf tjfVar3 = tjfVar;
                cVarH.V();
                cVarH.u(1919213950);
                le0.b bVar2 = new le0.b();
                bVar2.k(tjfVar3.a);
                int i5 = i3 << 3;
                ne0.c(bVar2, str, yVar, cVarH, (i5 & 896) | (i5 & 112) | 8);
                bVar2.h();
                le0 le0VarL = bVar2.l();
                cVarH.U(false);
                yd9.a(le0VarL, eVar3, tjfVar3, null, cVarH, (i3 >> 3) & 1008, 8);
                eVar2 = eVar3;
                tjfVar2 = tjfVar3;
            } else {
                cVarH.D();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                e eVar32 = eVar;
                tjf tjfVar32 = tjfVar;
                cVarH.V();
                cVarH.u(1919213950);
                le0.b bVar22 = new le0.b();
                bVar22.k(tjfVar32.a);
                int i52 = i3 << 3;
                ne0.c(bVar22, str, yVar, cVarH, (i52 & 896) | (i52 & 112) | 8);
                bVar22.h();
                le0 le0VarL2 = bVar22.l();
                cVarH.U(false);
                yd9.a(le0VarL2, eVar32, tjfVar32, null, cVarH, (i3 >> 3) & 1008, 8);
                eVar2 = eVar32;
                tjfVar2 = tjfVar32;
            }
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new a(str, yVar, eVar2, tjfVar2, i, i2);
        }
    }
}
