package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nq1 {

    public static final class a extends mj8 implements Function1<s5e, j6g> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(s5e s5eVar) {
            o5e.i(s5eVar, 0);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ wu5<fhd, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ gza $contentPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j, gza gzaVar, wu5<? super fhd, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var) {
            super(2);
            this.$contentColor = j;
            this.$contentPadding = gzaVar;
            this.$content = wu5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                h6c.a(this.$contentColor, ((mzf) bVar2.M(pzf.a)).m, bh2.c(1327513942, new pq1(this.$contentPadding, this.$content), bVar2), bVar2, 384);
            }
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ bj1 $border;
        final /* synthetic */ fq1 $colors;
        final /* synthetic */ wu5<fhd, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ gza $contentPadding;
        final /* synthetic */ lq1 $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;
        final /* synthetic */ dce $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(gu5<j6g> gu5Var, androidx.compose.ui.e eVar, boolean z, dce dceVar, fq1 fq1Var, lq1 lq1Var, bj1 bj1Var, gza gzaVar, d3a d3aVar, wu5<? super fhd, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$onClick = gu5Var;
            this.$modifier = eVar;
            this.$enabled = z;
            this.$shape = dceVar;
            this.$colors = fq1Var;
            this.$elevation = lq1Var;
            this.$border = bj1Var;
            this.$contentPadding = gzaVar;
            this.$interactionSource = d3aVar;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            nq1.a(this.$onClick, this.$modifier, this.$enabled, this.$shape, this.$colors, this.$elevation, this.$border, this.$contentPadding, this.$interactionSource, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ bj1 $border;
        final /* synthetic */ fq1 $colors;
        final /* synthetic */ wu5<fhd, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ gza $contentPadding;
        final /* synthetic */ lq1 $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;
        final /* synthetic */ dce $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(gu5<j6g> gu5Var, androidx.compose.ui.e eVar, boolean z, dce dceVar, fq1 fq1Var, lq1 lq1Var, bj1 bj1Var, gza gzaVar, d3a d3aVar, wu5<? super fhd, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$onClick = gu5Var;
            this.$modifier = eVar;
            this.$enabled = z;
            this.$shape = dceVar;
            this.$colors = fq1Var;
            this.$elevation = lq1Var;
            this.$border = bj1Var;
            this.$contentPadding = gzaVar;
            this.$interactionSource = d3aVar;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            nq1.b(this.$onClick, this.$modifier, this.$enabled, this.$shape, this.$colors, this.$elevation, this.$border, this.$contentPadding, this.$interactionSource, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ bj1 $border;
        final /* synthetic */ fq1 $colors;
        final /* synthetic */ wu5<fhd, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ gza $contentPadding;
        final /* synthetic */ lq1 $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;
        final /* synthetic */ dce $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(gu5<j6g> gu5Var, androidx.compose.ui.e eVar, boolean z, dce dceVar, fq1 fq1Var, lq1 lq1Var, bj1 bj1Var, gza gzaVar, d3a d3aVar, wu5<? super fhd, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$onClick = gu5Var;
            this.$modifier = eVar;
            this.$enabled = z;
            this.$shape = dceVar;
            this.$colors = fq1Var;
            this.$elevation = lq1Var;
            this.$border = bj1Var;
            this.$contentPadding = gzaVar;
            this.$interactionSource = d3aVar;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            nq1.c(this.$onClick, this.$modifier, this.$enabled, this.$shape, this.$colors, this.$elevation, this.$border, this.$contentPadding, this.$interactionSource, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.gu5<defpackage.j6g> r31, androidx.compose.ui.e r32, boolean r33, defpackage.dce r34, defpackage.fq1 r35, defpackage.lq1 r36, defpackage.bj1 r37, defpackage.gza r38, defpackage.d3a r39, defpackage.wu5<? super defpackage.fhd, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r40, androidx.compose.runtime.b r41, int r42, int r43) {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq1.a(gu5, androidx.compose.ui.e, boolean, dce, fq1, lq1, bj1, gza, d3a, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011a A[PHI: r18
  0x011a: PHI (r18v8 int) = (r18v0 int), (r18v2 int), (r18v3 int) binds: [B:102:0x0118, B:110:0x012e, B:109:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.gu5<defpackage.j6g> r26, androidx.compose.ui.e r27, boolean r28, defpackage.dce r29, defpackage.fq1 r30, defpackage.lq1 r31, defpackage.bj1 r32, defpackage.gza r33, defpackage.d3a r34, defpackage.wu5<? super defpackage.fhd, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r35, androidx.compose.runtime.b r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq1.b(gu5, androidx.compose.ui.e, boolean, dce, fq1, lq1, bj1, gza, d3a, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0117 A[PHI: r18
  0x0117: PHI (r18v11 int) = (r18v4 int), (r18v6 int), (r18v7 int) binds: [B:102:0x0115, B:110:0x012b, B:109:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.gu5<defpackage.j6g> r26, androidx.compose.ui.e r27, boolean r28, defpackage.dce r29, defpackage.fq1 r30, defpackage.lq1 r31, defpackage.bj1 r32, defpackage.gza r33, defpackage.d3a r34, defpackage.wu5<? super defpackage.fhd, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r35, androidx.compose.runtime.b r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq1.c(gu5, androidx.compose.ui.e, boolean, dce, fq1, lq1, bj1, gza, d3a, wu5, androidx.compose.runtime.b, int, int):void");
    }
}
