package defpackage;

import defpackage.csf;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u32 {

    public static final class a extends mj8 implements gu5<j6g> {
        final /* synthetic */ boolean $checked;
        final /* synthetic */ Function1<Boolean, j6g> $onCheckedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, Function1 function1) {
            super(0);
            this.$onCheckedChange = function1;
            this.$checked = z;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            this.$onCheckedChange.invoke(Boolean.valueOf(!this.$checked));
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ k32 $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function1<Boolean, j6g> $onCheckedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z, Function1<? super Boolean, j6g> function1, androidx.compose.ui.e eVar, boolean z2, k32 k32Var, d3a d3aVar, int i, int i2) {
            super(2);
            this.$checked = z;
            this.$onCheckedChange = function1;
            this.$modifier = eVar;
            this.$enabled = z2;
            this.$colors = k32Var;
            this.$interactionSource = d3aVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            u32.a(this.$checked, this.$onCheckedChange, this.$modifier, this.$enabled, this.$colors, this.$interactionSource, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<gb4, j6g> {
        final /* synthetic */ ese<da2> $borderColor;
        final /* synthetic */ ese<da2> $boxColor;
        final /* synthetic */ d32 $checkCache;
        final /* synthetic */ ese<Float> $checkCenterGravitationShiftFraction;
        final /* synthetic */ ese<da2> $checkColor;
        final /* synthetic */ ese<Float> $checkDrawFraction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ese eseVar, ese eseVar2, ese eseVar3, csf.d dVar, csf.d dVar2, d32 d32Var) {
            super(1);
            this.$boxColor = eseVar;
            this.$borderColor = eseVar2;
            this.$checkColor = eseVar3;
            this.$checkDrawFraction = dVar;
            this.$checkCenterGravitationShiftFraction = dVar2;
            this.$checkCache = d32Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            float f;
            float f2;
            gb4 gb4Var2 = gb4Var;
            float fFloor = (float) Math.floor(gb4Var2.t1(2.0f));
            long j = this.$boxColor.getValue().a;
            long j2 = this.$borderColor.getValue().a;
            float fT1 = gb4Var2.t1(2.0f);
            float f3 = fFloor / 2.0f;
            bwe bweVar = new bwe(fFloor, 0.0f, 0, 0, null, 30);
            float fD = kie.d(gb4Var2.c());
            if (da2.c(j, j2)) {
                gb4Var2.p0(j, (224 & 2) != 0 ? 0L : 0L, oie.e(fD, fD), ojh.c(fT1), ib5.a);
                f = fFloor;
                f2 = 0.0f;
            } else {
                float f4 = fD - (2.0f * fFloor);
                f = fFloor;
                f2 = 0.0f;
                gb4Var2.p0(j, (224 & 2) != 0 ? 0L : wab.c(fFloor, fFloor), oie.e(f4, f4), ojh.c(Math.max(0.0f, fT1 - fFloor)), ib5.a);
                float f5 = fD - f;
                gb4Var2.p0(j2, (224 & 2) != 0 ? 0L : wab.c(f3, f3), oie.e(f5, f5), ojh.c(fT1 - f3), bweVar);
            }
            long j3 = this.$checkColor.getValue().a;
            float fFloatValue = this.$checkDrawFraction.getValue().floatValue();
            float fFloatValue2 = this.$checkCenterGravitationShiftFraction.getValue().floatValue();
            d32 d32Var = this.$checkCache;
            bwe bweVar2 = new bwe(f, 0.0f, 2, 0, null, 26);
            float fD2 = kie.d(gb4Var2.c());
            float fT = w74.t(0.4f, 0.5f, fFloatValue2);
            float fT2 = w74.t(0.7f, 0.5f, fFloatValue2);
            float fT3 = w74.t(0.5f, 0.5f, fFloatValue2);
            float fT4 = w74.t(0.3f, 0.5f, fFloatValue2);
            d32Var.a.reset();
            m80 m80Var = d32Var.a;
            m80Var.j(0.2f * fD2, fT3 * fD2);
            m80Var.n(fT * fD2, fT2 * fD2);
            m80Var.n(0.8f * fD2, fD2 * fT4);
            o80 o80Var = d32Var.b;
            o80Var.b(m80Var);
            m80 m80Var2 = d32Var.c;
            m80Var2.reset();
            o80Var.a(f2, o80Var.a.getLength() * fFloatValue, m80Var2);
            gb4.E0(gb4Var2, d32Var.c, j3, 0.0f, bweVar2, 52);
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ k32 $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ inf $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, inf infVar, androidx.compose.ui.e eVar, k32 k32Var, int i) {
            super(2);
            this.$enabled = z;
            this.$value = infVar;
            this.$modifier = eVar;
            this.$colors = k32Var;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            u32.b(this.$enabled, this.$value, this.$modifier, this.$colors, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements wu5<csf.b<inf>, androidx.compose.runtime.b, Integer, jf5<Float>> {
        public static final e a = new e(3);

        @Override // defpackage.wu5
        public final jf5<Float> q(csf.b<inf> bVar, androidx.compose.runtime.b bVar2, Integer num) {
            csf.b<inf> bVar3 = bVar;
            androidx.compose.runtime.b bVar4 = bVar2;
            num.intValue();
            bVar4.L(-1324481169);
            inf infVarB = bVar3.b();
            inf infVar = inf.b;
            jf5<Float> uleVar = infVarB == infVar ? new ule<>(0) : bVar3.a() == infVar ? new ule<>(100) : zd0.d(100, 0, null, 6);
            bVar4.F();
            return uleVar;
        }
    }

    public static final class f extends mj8 implements wu5<csf.b<inf>, androidx.compose.runtime.b, Integer, jf5<Float>> {
        public static final f a = new f(3);

        @Override // defpackage.wu5
        public final jf5<Float> q(csf.b<inf> bVar, androidx.compose.runtime.b bVar2, Integer num) {
            csf.b<inf> bVar3 = bVar;
            androidx.compose.runtime.b bVar4 = bVar2;
            num.intValue();
            bVar4.L(1373301606);
            inf infVarB = bVar3.b();
            inf infVar = inf.b;
            jf5<Float> jf5VarD = infVarB == infVar ? zd0.d(100, 0, null, 6) : bVar3.a() == infVar ? new ule<>(100) : zd0.c(0.0f, null, 7);
            bVar4.F();
            return jf5VarD;
        }
    }

    public static final class g extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ k32 $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;
        final /* synthetic */ inf $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(inf infVar, gu5<j6g> gu5Var, androidx.compose.ui.e eVar, boolean z, k32 k32Var, d3a d3aVar, int i, int i2) {
            super(2);
            this.$state = infVar;
            this.$onClick = gu5Var;
            this.$modifier = eVar;
            this.$enabled = z;
            this.$colors = k32Var;
            this.$interactionSource = d3aVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            u32.c(this.$state, this.$onClick, this.$modifier, this.$enabled, this.$colors, this.$interactionSource, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r18, kotlin.jvm.functions.Function1<? super java.lang.Boolean, defpackage.j6g> r19, androidx.compose.ui.e r20, boolean r21, defpackage.k32 r22, defpackage.d3a r23, androidx.compose.runtime.b r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u32.a(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.e, boolean, k32, d3a, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(boolean r33, defpackage.inf r34, androidx.compose.ui.e r35, defpackage.k32 r36, androidx.compose.runtime.b r37, int r38) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u32.b(boolean, inf, androidx.compose.ui.e, k32, androidx.compose.runtime.b, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.inf r18, defpackage.gu5<defpackage.j6g> r19, androidx.compose.ui.e r20, boolean r21, defpackage.k32 r22, defpackage.d3a r23, androidx.compose.runtime.b r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u32.c(inf, gu5, androidx.compose.ui.e, boolean, k32, d3a, androidx.compose.runtime.b, int, int):void");
    }
}
