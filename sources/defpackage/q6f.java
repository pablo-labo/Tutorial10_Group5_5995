package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q6f {
    public static final q6f a = new q6f();

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ float $height;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, float f, long j, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$height = f;
            this.$color = j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            q6f q6fVar = q6f.this;
            e eVar = this.$modifier;
            float f = this.$height;
            long j = this.$color;
            q6fVar.a(f, ka2.L(this.$$changed | 1), this.$$default, j, bVar, eVar);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ float $height;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, float f, long j, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$height = f;
            this.$color = j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            q6f q6fVar = q6f.this;
            e eVar = this.$modifier;
            float f = this.$height;
            long j = this.$color;
            q6fVar.b(f, ka2.L(this.$$changed | 1), this.$$default, j, bVar, eVar);
            return j6g.a;
        }
    }

    @sy3
    public final void a(float f, int i, int i2, long j, androidx.compose.runtime.b bVar, e eVar) {
        e eVar2;
        int i3;
        e eVar3;
        float f2;
        long jC;
        float f3;
        long j2;
        c cVarH = bVar.h(1454716052);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            eVar2 = eVar;
        } else if ((i & 6) == 0) {
            eVar2 = eVar;
            i3 = (cVarH.K(eVar2) ? 4 : 2) | i;
        } else {
            eVar2 = eVar;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && cVarH.e(j)) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i3 & 147) == 146 && cVarH.i()) {
            cVarH.D();
            f3 = f;
            j2 = j;
        } else {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                eVar3 = i4 != 0 ? e.a.b : eVar2;
                if (i5 != 0) {
                    ra2 ra2Var = tmb.a;
                    f2 = 3.0f;
                } else {
                    f2 = f;
                }
                if ((i2 & 4) != 0) {
                    qa2 qa2Var = (qa2) cVarH.M(sa2.a);
                    ra2 ra2Var2 = tmb.a;
                    jC = sa2.c(qa2Var, ra2.V);
                } else {
                    jC = j;
                }
            } else {
                cVarH.D();
                jC = j;
                eVar3 = eVar2;
                f2 = f;
            }
            cVarH.V();
            hl1.a(androidx.compose.foundation.a.b(g.h(g.f(eVar3, 1.0f), f2), jC, ytc.a), cVarH, 0);
            f3 = f2;
            j2 = jC;
            eVar2 = eVar3;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new a(eVar2, f3, j2, i, i2);
        }
    }

    public final void b(float f, int i, int i2, long j, androidx.compose.runtime.b bVar, e eVar) {
        e eVar2;
        int i3;
        e eVar3;
        float f2;
        long jD;
        float f3;
        long j2;
        c cVarH = bVar.h(-1498258020);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            eVar2 = eVar;
        } else if ((i & 6) == 0) {
            eVar2 = eVar;
            i3 = (cVarH.K(eVar2) ? 4 : 2) | i;
        } else {
            eVar2 = eVar;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && cVarH.e(j)) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i3 & 147) == 146 && cVarH.i()) {
            cVarH.D();
            f3 = f;
            j2 = j;
        } else {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                eVar3 = i4 != 0 ? e.a.b : eVar2;
                if (i5 != 0) {
                    ra2 ra2Var = tmb.a;
                    f2 = 3.0f;
                } else {
                    f2 = f;
                }
                if ((i2 & 4) != 0) {
                    ra2 ra2Var2 = tmb.a;
                    jD = sa2.d(ra2.V, cVarH);
                } else {
                    jD = j;
                }
            } else {
                cVarH.D();
                jD = j;
                eVar3 = eVar2;
                f2 = f;
            }
            cVarH.V();
            hl1.a(androidx.compose.foundation.a.b(g.h(g.f(eVar3, 1.0f), f2), jD, ytc.a), cVarH, 0);
            f3 = f2;
            j2 = jD;
            eVar2 = eVar3;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new b(eVar2, f3, j2, i, i2);
        }
    }
}
