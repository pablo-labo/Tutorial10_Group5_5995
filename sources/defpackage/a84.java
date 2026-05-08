package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a84 {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ e $modifier;
        final /* synthetic */ float $thickness;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, int i, int i2, long j, e eVar) {
            super(2);
            this.$modifier = eVar;
            this.$thickness = f;
            this.$color = j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            e eVar = this.$modifier;
            float f = this.$thickness;
            long j = this.$color;
            a84.a(f, ka2.L(this.$$changed | 1), this.$$default, j, bVar, eVar);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<gb4, j6g> {
        final /* synthetic */ long $color;
        final /* synthetic */ float $thickness;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, float f) {
            super(1);
            this.$thickness = f;
            this.$color = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            gb4 gb4Var2 = gb4Var;
            float fT1 = gb4Var2.t1(this.$thickness);
            gb4Var2.W(this.$color, wab.c(0.0f, gb4Var2.t1(this.$thickness) / 2.0f), wab.c(kie.d(gb4Var2.c()), gb4Var2.t1(this.$thickness) / 2.0f), fT1, (496 & 16) != 0 ? 0 : 0);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ e $modifier;
        final /* synthetic */ float $thickness;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f, int i, int i2, long j, e eVar) {
            super(2);
            this.$modifier = eVar;
            this.$thickness = f;
            this.$color = j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            e eVar = this.$modifier;
            float f = this.$thickness;
            long j = this.$color;
            a84.b(f, ka2.L(this.$$changed | 1), this.$$default, j, bVar, eVar);
            return j6g.a;
        }
    }

    @sy3
    public static final void a(float f, int i, int i2, long j, androidx.compose.runtime.b bVar, e eVar) {
        int i3;
        androidx.compose.runtime.c cVarH = bVar.h(1562471785);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
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
        } else {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                if (i4 != 0) {
                    eVar = e.a.b;
                }
                if (i5 != 0) {
                    f = 1.0f;
                }
                if ((i2 & 4) != 0) {
                    j = sa2.d(ra2.f, cVarH);
                }
            } else {
                cVarH.D();
            }
            cVarH.V();
            cVarH.L(-433645095);
            float density = j94.c(f, 0.0f) ? 1.0f / ((iy3) cVarH.M(um2.h)).getDensity() : f;
            cVarH.U(false);
            hl1.a(androidx.compose.foundation.a.b(g.h(g.f(eVar, 1.0f), density), j, ytc.a), cVarH, 0);
        }
        float f2 = f;
        long j2 = j;
        e eVar2 = eVar;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new a(f2, i, i2, j2, eVar2);
        }
    }

    public static final void b(float f, int i, int i2, long j, androidx.compose.runtime.b bVar, e eVar) {
        e eVar2;
        int i3;
        long jD;
        e eVar3;
        float f2;
        e eVar4;
        float f3;
        androidx.compose.runtime.c cVarH = bVar.h(75144485);
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
            jD = j;
            i3 |= ((i2 & 4) == 0 && cVarH.e(jD)) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        } else {
            jD = j;
        }
        if ((i3 & 147) == 146 && cVarH.i()) {
            cVarH.D();
            f3 = f;
            eVar4 = eVar2;
        } else {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                eVar3 = i4 != 0 ? e.a.b : eVar2;
                f2 = i5 != 0 ? 1.0f : f;
                if ((i2 & 4) != 0) {
                    jD = sa2.d(ra2.f, cVarH);
                    i3 &= -897;
                }
            } else {
                cVarH.D();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                f2 = f;
                eVar3 = eVar2;
            }
            cVarH.V();
            e eVarH = g.h(g.f(eVar3, 1.0f), f2);
            boolean z = true;
            boolean z2 = (i3 & 112) == 32;
            if ((((i3 & 896) ^ 384) <= 256 || !cVarH.e(jD)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objV = cVarH.v();
            if (z3 || objV == b.a.a) {
                objV = new b(jD, f2);
                cVarH.p(objV);
            }
            w74.a(eVarH, (Function1) objV, cVarH, 0);
            eVar4 = eVar3;
            f3 = f2;
        }
        long j2 = jD;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new c(f3, i, i2, j2, eVar4);
        }
    }
}
