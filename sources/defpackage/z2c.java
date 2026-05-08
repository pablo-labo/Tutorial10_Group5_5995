package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.w;
import defpackage.jc7;
import defpackage.ph8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class z2c {
    public static final androidx.compose.ui.e a = androidx.compose.foundation.layout.f.h(b5e.b(androidx.compose.ui.layout.i.a(e.a.b, r.a), true, s.a), 0.0f, 10.0f, 1);
    public static final float b = 240.0f;
    public static final float c = 4.0f;
    public static final float d = 40.0f;
    public static final l83 e = new l83(0.2f, 0.0f, 0.8f, 1.0f);
    public static final l83 f = new l83(0.4f, 0.0f, 1.0f, 1.0f);
    public static final l83 g = new l83(0.0f, 0.0f, 0.65f, 1.0f);
    public static final l83 h = new l83(0.1f, 0.0f, 0.45f, 1.0f);
    public static final l83 i = new l83(0.4f, 0.0f, 0.2f, 1.0f);

    public static final class a extends mj8 implements Function1<gb4, j6g> {
        final /* synthetic */ ese<Float> $baseRotation;
        final /* synthetic */ long $color;
        final /* synthetic */ ese<Integer> $currentRotation;
        final /* synthetic */ ese<Float> $endAngle;
        final /* synthetic */ ese<Float> $startAngle;
        final /* synthetic */ bwe $stroke;
        final /* synthetic */ float $strokeWidth;
        final /* synthetic */ long $trackColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, long j, long j2, jc7.a aVar, jc7.a aVar2, jc7.a aVar3, jc7.a aVar4, bwe bweVar) {
            super(1);
            this.$trackColor = j;
            this.$stroke = bweVar;
            this.$currentRotation = aVar;
            this.$endAngle = aVar2;
            this.$startAngle = aVar3;
            this.$baseRotation = aVar4;
            this.$strokeWidth = f;
            this.$color = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            gb4 gb4Var2 = gb4Var;
            z2c.f(gb4Var2, 0.0f, 360.0f, this.$trackColor, this.$stroke);
            float fFloatValue = (this.$currentRotation.getValue().floatValue() * 216.0f) % 360.0f;
            float fAbs = Math.abs(this.$endAngle.getValue().floatValue() - this.$startAngle.getValue().floatValue());
            float fFloatValue2 = this.$startAngle.getValue().floatValue() + this.$baseRotation.getValue().floatValue() + (fFloatValue - 90.0f);
            float f = this.$strokeWidth;
            long j = this.$color;
            bwe bweVar = this.$stroke;
            z2c.f(gb4Var2, fFloatValue2 + (bweVar.c == 0 ? 0.0f : ((f / (z2c.d / 2.0f)) * 57.29578f) / 2.0f), Math.max(fAbs, 0.1f), j, bweVar);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ int $strokeCap;
        final /* synthetic */ float $strokeWidth;
        final /* synthetic */ long $trackColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, int i, int i2, int i3, long j, long j2, androidx.compose.ui.e eVar) {
            super(2);
            this.$modifier = eVar;
            this.$color = j;
            this.$strokeWidth = f;
            this.$trackColor = j2;
            this.$strokeCap = i;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            androidx.compose.ui.e eVar = this.$modifier;
            long j = this.$color;
            float f = this.$strokeWidth;
            long j2 = this.$trackColor;
            z2c.a(f, this.$strokeCap, ka2.L(this.$$changed | 1), this.$$default, j, j2, bVar, eVar);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<ph8.b<Float>, j6g> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(ph8.b<Float> bVar) {
            ph8.b<Float> bVar2 = bVar;
            bVar2.a = 1332;
            bVar2.a(Float.valueOf(0.0f), 0).b = z2c.i;
            bVar2.a(Float.valueOf(290.0f), 666);
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function1<ph8.b<Float>, j6g> {
        public static final d a = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(ph8.b<Float> bVar) {
            ph8.b<Float> bVar2 = bVar;
            bVar2.a = 1332;
            bVar2.a(Float.valueOf(0.0f), 666).b = z2c.i;
            bVar2.a(Float.valueOf(290.0f), bVar2.a);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ float $progress;
        final /* synthetic */ int $strokeCap;
        final /* synthetic */ long $trackColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f, int i, int i2, int i3, long j, long j2, androidx.compose.ui.e eVar) {
            super(2);
            this.$progress = f;
            this.$modifier = eVar;
            this.$color = j;
            this.$trackColor = j2;
            this.$strokeCap = i;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            float f = this.$progress;
            androidx.compose.ui.e eVar = this.$modifier;
            long j = this.$color;
            long j2 = this.$trackColor;
            z2c.c(f, this.$strokeCap, ka2.L(this.$$changed | 1), this.$$default, j, j2, bVar, eVar);
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements Function1<gb4, j6g> {
        final /* synthetic */ long $color;
        final /* synthetic */ int $strokeCap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, int i) {
            super(1);
            this.$color = j;
            this.$strokeCap = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            gb4 gb4Var2 = gb4Var;
            long j = this.$color;
            int i = this.$strokeCap;
            float fMin = Math.min(gb4Var2.t1(4.0f), kie.b(gb4Var2.c()));
            float fB = (kie.b(gb4Var2.c()) - fMin) / 2.0f;
            if (i == 1) {
                float f = fMin / 2.0f;
                gb4.q0(gb4Var2, j, f, wab.c((kie.d(gb4Var2.c()) - f) - fB, kie.b(gb4Var2.c()) / 2.0f), null, 120);
            } else {
                gb4.o1(gb4Var2, j, wab.c((kie.d(gb4Var2.c()) - fMin) - fB, (kie.b(gb4Var2.c()) - fMin) / 2.0f), oie.e(fMin, fMin), 0.0f, null, 120);
            }
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements Function1<s5e, j6g> {
        final /* synthetic */ gu5<Float> $coercedProgress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(gu5<Float> gu5Var) {
            super(1);
            this.$coercedProgress = gu5Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(s5e s5eVar) {
            r2c r2cVar = new r2c(this.$coercedProgress.invoke().floatValue(), new s82(0.0f, 1.0f));
            qf8<Object>[] qf8VarArr = o5e.a;
            r5e<r2c> r5eVar = k5e.c;
            qf8<Object> qf8Var = o5e.a[1];
            s5eVar.a(r5eVar, r2cVar);
            return j6g.a;
        }
    }

    public static final class h extends mj8 implements Function1<gb4, j6g> {
        final /* synthetic */ gu5<Float> $coercedProgress;
        final /* synthetic */ long $color;
        final /* synthetic */ Function1<gb4, j6g> $drawStopIndicator;
        final /* synthetic */ float $gapSize;
        final /* synthetic */ int $strokeCap;
        final /* synthetic */ long $trackColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(int i, float f, gu5<Float> gu5Var, long j, long j2, Function1<? super gb4, j6g> function1) {
            super(1);
            this.$strokeCap = i;
            this.$gapSize = f;
            this.$coercedProgress = gu5Var;
            this.$trackColor = j;
            this.$color = j2;
            this.$drawStopIndicator = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            gb4 gb4Var2 = gb4Var;
            float fB = kie.b(gb4Var2.c());
            float fL1 = ((this.$strokeCap != 0 && kie.b(gb4Var2.c()) <= kie.d(gb4Var2.c())) ? this.$gapSize + gb4Var2.l1(fB) : this.$gapSize) / gb4Var2.l1(kie.d(gb4Var2.c()));
            float fFloatValue = this.$coercedProgress.invoke().floatValue();
            float fMin = Math.min(fFloatValue, fL1) + fFloatValue;
            if (fMin <= 1.0f) {
                z2c.e(gb4Var2, fMin, 1.0f, this.$trackColor, fB, this.$strokeCap);
            }
            z2c.e(gb4Var2, 0.0f, fFloatValue, this.$color, fB, this.$strokeCap);
            this.$drawStopIndicator.invoke(gb4Var2);
            return j6g.a;
        }
    }

    public static final class i extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ Function1<gb4, j6g> $drawStopIndicator;
        final /* synthetic */ float $gapSize;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ gu5<Float> $progress;
        final /* synthetic */ int $strokeCap;
        final /* synthetic */ long $trackColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(gu5<Float> gu5Var, androidx.compose.ui.e eVar, long j, long j2, int i, float f, Function1<? super gb4, j6g> function1, int i2, int i3) {
            super(2);
            this.$progress = gu5Var;
            this.$modifier = eVar;
            this.$color = j;
            this.$trackColor = j2;
            this.$strokeCap = i;
            this.$gapSize = f;
            this.$drawStopIndicator = function1;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            z2c.b(this.$progress, this.$modifier, this.$color, this.$trackColor, this.$strokeCap, this.$gapSize, this.$drawStopIndicator, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class j extends mj8 implements Function1<gb4, j6g> {
        final /* synthetic */ long $color;
        final /* synthetic */ ese<Float> $firstLineHead;
        final /* synthetic */ ese<Float> $firstLineTail;
        final /* synthetic */ float $gapSize;
        final /* synthetic */ ese<Float> $secondLineHead;
        final /* synthetic */ ese<Float> $secondLineTail;
        final /* synthetic */ int $strokeCap;
        final /* synthetic */ long $trackColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i, float f, jc7.a aVar, long j, jc7.a aVar2, long j2, jc7.a aVar3, jc7.a aVar4) {
            super(1);
            this.$strokeCap = i;
            this.$gapSize = f;
            this.$firstLineHead = aVar;
            this.$trackColor = j;
            this.$firstLineTail = aVar2;
            this.$color = j2;
            this.$secondLineHead = aVar3;
            this.$secondLineTail = aVar4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            gb4 gb4Var2 = gb4Var;
            float fB = kie.b(gb4Var2.c());
            float fL1 = ((this.$strokeCap != 0 && kie.b(gb4Var2.c()) <= kie.d(gb4Var2.c())) ? this.$gapSize + gb4Var2.l1(fB) : this.$gapSize) / gb4Var2.l1(kie.d(gb4Var2.c()));
            if (this.$firstLineHead.getValue().floatValue() < 1.0f - fL1) {
                z2c.e(gb4Var2, this.$firstLineHead.getValue().floatValue() > 0.0f ? this.$firstLineHead.getValue().floatValue() + fL1 : 0.0f, 1.0f, this.$trackColor, fB, this.$strokeCap);
            }
            if (this.$firstLineHead.getValue().floatValue() - this.$firstLineTail.getValue().floatValue() > 0.0f) {
                z2c.e(gb4Var2, this.$firstLineHead.getValue().floatValue(), this.$firstLineTail.getValue().floatValue(), this.$color, fB, this.$strokeCap);
            }
            if (this.$firstLineTail.getValue().floatValue() > fL1) {
                z2c.e(gb4Var2, this.$secondLineHead.getValue().floatValue() > 0.0f ? this.$secondLineHead.getValue().floatValue() + fL1 : 0.0f, this.$firstLineTail.getValue().floatValue() < 1.0f ? this.$firstLineTail.getValue().floatValue() - fL1 : 1.0f, this.$trackColor, fB, this.$strokeCap);
            }
            if (this.$secondLineHead.getValue().floatValue() - this.$secondLineTail.getValue().floatValue() > 0.0f) {
                z2c.e(gb4Var2, this.$secondLineHead.getValue().floatValue(), this.$secondLineTail.getValue().floatValue(), this.$color, fB, this.$strokeCap);
            }
            if (this.$secondLineTail.getValue().floatValue() > fL1) {
                z2c.e(gb4Var2, 0.0f, this.$secondLineTail.getValue().floatValue() < 1.0f ? this.$secondLineTail.getValue().floatValue() - fL1 : 1.0f, this.$trackColor, fB, this.$strokeCap);
            }
            return j6g.a;
        }
    }

    public static final class k extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ float $gapSize;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ int $strokeCap;
        final /* synthetic */ long $trackColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f, int i, int i2, int i3, long j, long j2, androidx.compose.ui.e eVar) {
            super(2);
            this.$modifier = eVar;
            this.$color = j;
            this.$trackColor = j2;
            this.$strokeCap = i;
            this.$gapSize = f;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            androidx.compose.ui.e eVar = this.$modifier;
            long j = this.$color;
            long j2 = this.$trackColor;
            int i = this.$strokeCap;
            z2c.d(this.$gapSize, i, ka2.L(this.$$changed | 1), this.$$default, j, j2, bVar, eVar);
            return j6g.a;
        }
    }

    public static final class l extends mj8 implements gu5<Float> {
        final /* synthetic */ float $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(float f) {
            super(0);
            this.$progress = f;
        }

        @Override // defpackage.gu5
        public final Float invoke() {
            return Float.valueOf(this.$progress);
        }
    }

    public static final class m extends mj8 implements gu5<Float> {
        final /* synthetic */ gu5<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(gu5<Float> gu5Var) {
            super(0);
            this.$progress = gu5Var;
        }

        @Override // defpackage.gu5
        public final Float invoke() {
            return Float.valueOf(nic.B(this.$progress.invoke().floatValue(), 0.0f, 1.0f));
        }
    }

    public static final class n extends mj8 implements Function1<ph8.b<Float>, j6g> {
        public static final n a = new n(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(ph8.b<Float> bVar) {
            ph8.b<Float> bVar2 = bVar;
            bVar2.a = 1800;
            bVar2.a(Float.valueOf(0.0f), 0).b = z2c.e;
            bVar2.a(Float.valueOf(1.0f), 750);
            return j6g.a;
        }
    }

    public static final class o extends mj8 implements Function1<ph8.b<Float>, j6g> {
        public static final o a = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(ph8.b<Float> bVar) {
            ph8.b<Float> bVar2 = bVar;
            bVar2.a = 1800;
            bVar2.a(Float.valueOf(0.0f), 333).b = z2c.f;
            bVar2.a(Float.valueOf(1.0f), 1183);
            return j6g.a;
        }
    }

    public static final class p extends mj8 implements Function1<ph8.b<Float>, j6g> {
        public static final p a = new p(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(ph8.b<Float> bVar) {
            ph8.b<Float> bVar2 = bVar;
            bVar2.a = 1800;
            bVar2.a(Float.valueOf(0.0f), 1000).b = z2c.g;
            bVar2.a(Float.valueOf(1.0f), 1567);
            return j6g.a;
        }
    }

    public static final class q extends mj8 implements Function1<ph8.b<Float>, j6g> {
        public static final q a = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(ph8.b<Float> bVar) {
            ph8.b<Float> bVar2 = bVar;
            bVar2.a = 1800;
            bVar2.a(Float.valueOf(0.0f), 1267).b = z2c.h;
            bVar2.a(Float.valueOf(1.0f), 1800);
            return j6g.a;
        }
    }

    public static final class r extends mj8 implements wu5<androidx.compose.ui.layout.q, vf9, iq2, bg9> {
        public static final r a = new r(3);

        @Override // defpackage.wu5
        public final bg9 q(androidx.compose.ui.layout.q qVar, vf9 vf9Var, iq2 iq2Var) {
            androidx.compose.ui.layout.q qVar2 = qVar;
            long j = iq2Var.a;
            androidx.compose.ui.e eVar = z2c.a;
            int iX0 = qVar2.x0(10.0f);
            int i = iX0 * 2;
            w wVarR = vf9Var.R(mq2.i(0, i, j));
            int i2 = wVarR.b - i;
            return qVar2.Y0(wVarR.a, i2, bs4.a, new a3c(wVarR, iX0));
        }
    }

    public static final class s extends mj8 implements Function1<s5e, j6g> {
        public static final s a = new s(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ j6g invoke(s5e s5eVar) {
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ba A[PHI: r5
  0x01ba: PHI (r5v26 long) = (r5v23 long), (r5v27 long) binds: [B:96:0x01b8, B:92:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(float r36, int r37, int r38, int r39, long r40, long r42, androidx.compose.runtime.b r44, androidx.compose.ui.e r45) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z2c.a(float, int, int, int, long, long, androidx.compose.runtime.b, androidx.compose.ui.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.gu5<java.lang.Float> r32, androidx.compose.ui.e r33, long r34, long r36, int r38, float r39, kotlin.jvm.functions.Function1<? super defpackage.gb4, defpackage.j6g> r40, androidx.compose.runtime.b r41, int r42, int r43) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z2c.b(gu5, androidx.compose.ui.e, long, long, int, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0100  */
    @defpackage.sy3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(float r18, int r19, int r20, int r21, long r22, long r24, androidx.compose.runtime.b r26, androidx.compose.ui.e r27) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z2c.c(float, int, int, int, long, long, androidx.compose.runtime.b, androidx.compose.ui.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(float r30, int r31, int r32, int r33, long r34, long r36, androidx.compose.runtime.b r38, androidx.compose.ui.e r39) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z2c.d(float, int, int, int, long, long, androidx.compose.runtime.b, androidx.compose.ui.e):void");
    }

    public static final void e(gb4 gb4Var, float f2, float f3, long j2, float f4, int i2) {
        float fD = kie.d(gb4Var.c());
        float fB = kie.b(gb4Var.c());
        float f5 = fB / 2.0f;
        boolean z = gb4Var.getLayoutDirection() == vl8.a;
        float f6 = (z ? f2 : 1.0f - f3) * fD;
        float f7 = (z ? f3 : 1.0f - f2) * fD;
        if (i2 == 0 || fB > fD) {
            gb4Var.W(j2, wab.c(f6, f5), wab.c(f7, f5), f4, (496 & 16) != 0 ? 0 : 0);
            return;
        }
        float f8 = f4 / 2.0f;
        s82 s82Var = new s82(f8, fD - f8);
        float fFloatValue = ((Number) nic.F(Float.valueOf(f6), s82Var)).floatValue();
        float fFloatValue2 = ((Number) nic.F(Float.valueOf(f7), s82Var)).floatValue();
        if (Math.abs(f3 - f2) > 0.0f) {
            gb4Var.W(j2, wab.c(fFloatValue, f5), wab.c(fFloatValue2, f5), f4, (496 & 16) != 0 ? 0 : i2);
        }
    }

    public static final void f(gb4 gb4Var, float f2, float f3, long j2, bwe bweVar) {
        float f4 = bweVar.a / 2.0f;
        float fD = kie.d(gb4Var.c()) - (2.0f * f4);
        gb4Var.Q(j2, f2, f3, wab.c(f4, f4), oie.e(fD, fD), (832 & 64) != 0 ? 1.0f : 0.0f, bweVar);
    }
}
