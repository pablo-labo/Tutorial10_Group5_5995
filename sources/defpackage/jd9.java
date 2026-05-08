package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jd9 {

    public static final class a extends mj8 implements Function2<b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ e $modifier;
        final /* synthetic */ float $thickness;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, int i, int i2, long j, e eVar) {
            super(2);
            this.$modifier = eVar;
            this.$color = j;
            this.$thickness = f;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            num.intValue();
            e eVar = this.$modifier;
            long j = this.$color;
            jd9.a(this.$thickness, ka2.L(this.$$changed | 1), this.$$default, j, bVar, eVar);
            return j6g.a;
        }
    }

    public static final void a(float f, int i, int i2, long j, b bVar, e eVar) {
        int i3;
        e eVar2;
        long jC;
        float fB;
        e eVar3;
        long j2;
        float f2;
        c cVarH = bVar.h(-1836373000);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && cVarH.e(j)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && cVarH.c(f)) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i3 & 147) == 146 && cVarH.i()) {
            cVarH.D();
            f2 = f;
            j2 = j;
            eVar3 = eVar;
        } else {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                eVar2 = i4 != 0 ? e.a.b : eVar;
                jC = (i2 & 2) != 0 ? ((cd9) cVarH.M(rk2.d)).c() : j;
                fB = (i2 & 4) != 0 ? ((id9) cVarH.M(rk2.g)).b() : f;
            } else {
                cVarH.D();
                fB = f;
                jC = j;
                eVar2 = eVar;
            }
            cVarH.V();
            cVarH.u(-876126121);
            float density = j94.c(fB, 0.0f) ? 1.0f / ((iy3) cVarH.M(um2.h)).getDensity() : fB;
            cVarH.U(false);
            hl1.a(androidx.compose.foundation.a.b(g.h(g.f(eVar2, 1.0f), density), jC, ytc.a), cVarH, 0);
            eVar3 = eVar2;
            j2 = jC;
            f2 = fB;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new a(f2, i, i2, j2, eVar3);
        }
    }
}
