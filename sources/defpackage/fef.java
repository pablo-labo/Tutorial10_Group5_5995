package defpackage;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fef {
    public static final fef a = new fef();

    public /* synthetic */ class a extends j4c {
        @Override // defpackage.j4c, defpackage.rf8
        public final Object get() {
            return ((ese) this.receiver).getValue();
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ zdf $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ float $focusedIndicatorLineThickness;
        final /* synthetic */ ei7 $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ dce $shape;
        final /* synthetic */ float $unfocusedIndicatorLineThickness;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, boolean z2, ei7 ei7Var, androidx.compose.ui.e eVar, zdf zdfVar, dce dceVar, float f, float f2, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$isError = z2;
            this.$interactionSource = ei7Var;
            this.$modifier = eVar;
            this.$colors = zdfVar;
            this.$shape = dceVar;
            this.$focusedIndicatorLineThickness = f;
            this.$unfocusedIndicatorLineThickness = f2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            fef.this.a(this.$enabled, this.$isError, this.$interactionSource, this.$modifier, this.$colors, this.$shape, this.$focusedIndicatorLineThickness, this.$unfocusedIndicatorLineThickness, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ zdf $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ ei7 $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ dce $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, boolean z2, ei7 ei7Var, zdf zdfVar, dce dceVar) {
            super(2);
            this.$enabled = z;
            this.$isError = z2;
            this.$interactionSource = ei7Var;
            this.$colors = zdfVar;
            this.$shape = dceVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                fef.a.a(this.$enabled, this.$isError, this.$interactionSource, e.a.b, this.$colors, this.$shape, 2.0f, 1.0f, bVar2, 114822144, 0);
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ zdf $colors;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $container;
        final /* synthetic */ gza $contentPadding;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $innerTextField;
        final /* synthetic */ ei7 $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $label;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $leadingIcon;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $placeholder;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $prefix;
        final /* synthetic */ dce $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $suffix;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $supportingText;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $trailingIcon;
        final /* synthetic */ String $value;
        final /* synthetic */ ftg $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, boolean z, boolean z2, ftg ftgVar, ei7 ei7Var, boolean z3, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function23, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function24, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function25, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function26, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function27, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function28, dce dceVar, zdf zdfVar, gza gzaVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function29, int i, int i2, int i3) {
            super(2);
            this.$value = str;
            this.$innerTextField = function2;
            this.$enabled = z;
            this.$singleLine = z2;
            this.$visualTransformation = ftgVar;
            this.$interactionSource = ei7Var;
            this.$isError = z3;
            this.$label = function22;
            this.$placeholder = function23;
            this.$leadingIcon = function24;
            this.$trailingIcon = function25;
            this.$prefix = function26;
            this.$suffix = function27;
            this.$supportingText = function28;
            this.$shape = dceVar;
            this.$colors = zdfVar;
            this.$contentPadding = gzaVar;
            this.$container = function29;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            fef.this.b(this.$value, this.$innerTextField, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$prefix, this.$suffix, this.$supportingText, this.$shape, this.$colors, this.$contentPadding, this.$container, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    public static final class e implements oa2, ev5 {
        public final /* synthetic */ j4c a;

        public e(j4c j4cVar) {
            this.a = j4cVar;
        }

        @Override // defpackage.oa2
        public final long a() {
            return ((da2) this.a.get()).a;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof oa2) || !(obj instanceof ev5)) {
                return false;
            }
            return this.a.equals(((ev5) obj).c());
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static zdf c(int i, androidx.compose.runtime.b bVar) {
        return e((qa2) bVar.M(sa2.a), bVar);
    }

    public static zdf d(long j, long j2, long j3, long j4, androidx.compose.runtime.b bVar) {
        long j5 = da2.i;
        return e((qa2) bVar.M(sa2.a), bVar).a(j5, j5, j5, j5, j, j2, j3, j4, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5);
    }

    public static zdf e(qa2 qa2Var, androidx.compose.runtime.b bVar) {
        zdf zdfVar = qa2Var.W;
        bVar.L(27085453);
        if (zdfVar == null) {
            ra2 ra2Var = ra2.c;
            long jC = sa2.c(qa2Var, ra2Var);
            long jC2 = sa2.c(qa2Var, ra2Var);
            long jB = da2.b(sa2.c(qa2Var, ra2Var), 0.38f);
            long jC3 = sa2.c(qa2Var, ra2Var);
            ra2 ra2Var2 = ra2.a0;
            long jC4 = sa2.c(qa2Var, ra2Var2);
            long jC5 = sa2.c(qa2Var, ra2Var2);
            long jC6 = sa2.c(qa2Var, ra2Var2);
            long jC7 = sa2.c(qa2Var, ra2Var2);
            ra2 ra2Var3 = ra2.V;
            long jC8 = sa2.c(qa2Var, ra2Var3);
            ra2 ra2Var4 = ra2.a;
            long jC9 = sa2.c(qa2Var, ra2Var4);
            qjf qjfVar = (qjf) bVar.M(rjf.a);
            long jC10 = sa2.c(qa2Var, ra2Var3);
            ra2 ra2Var5 = ra2.d;
            zdf zdfVar2 = new zdf(jC, jC2, jB, jC3, jC4, jC5, jC6, jC7, jC8, jC9, qjfVar, jC10, sa2.c(qa2Var, ra2Var5), da2.b(sa2.c(qa2Var, ra2Var), 0.38f), sa2.c(qa2Var, ra2Var4), sa2.c(qa2Var, ra2Var5), sa2.c(qa2Var, ra2Var5), da2.b(sa2.c(qa2Var, ra2Var), 0.38f), sa2.c(qa2Var, ra2Var5), sa2.c(qa2Var, ra2Var5), sa2.c(qa2Var, ra2Var5), da2.b(sa2.c(qa2Var, ra2Var), 0.38f), sa2.c(qa2Var, ra2Var4), sa2.c(qa2Var, ra2Var3), sa2.c(qa2Var, ra2Var5), da2.b(sa2.c(qa2Var, ra2Var), 0.38f), sa2.c(qa2Var, ra2Var4), sa2.c(qa2Var, ra2Var5), sa2.c(qa2Var, ra2Var5), da2.b(sa2.c(qa2Var, ra2Var), 0.38f), sa2.c(qa2Var, ra2Var5), sa2.c(qa2Var, ra2Var5), sa2.c(qa2Var, ra2Var5), da2.b(sa2.c(qa2Var, ra2Var), 0.38f), sa2.c(qa2Var, ra2Var4), sa2.c(qa2Var, ra2Var5), sa2.c(qa2Var, ra2Var5), da2.b(sa2.c(qa2Var, ra2Var5), 0.38f), sa2.c(qa2Var, ra2Var5), sa2.c(qa2Var, ra2Var5), sa2.c(qa2Var, ra2Var5), da2.b(sa2.c(qa2Var, ra2Var5), 0.38f), sa2.c(qa2Var, ra2Var5));
            qa2Var.W = zdfVar2;
            zdfVar = zdfVar2;
        }
        bVar.F();
        return zdfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r21, boolean r22, defpackage.ei7 r23, androidx.compose.ui.e r24, defpackage.zdf r25, defpackage.dce r26, float r27, float r28, androidx.compose.runtime.b r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fef.a(boolean, boolean, ei7, androidx.compose.ui.e, zdf, dce, float, float, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r44, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r45, boolean r46, boolean r47, defpackage.ftg r48, defpackage.ei7 r49, boolean r50, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r53, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r55, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r56, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r57, defpackage.dce r58, defpackage.zdf r59, defpackage.gza r60, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r61, androidx.compose.runtime.b r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instruction units count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fef.b(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, ftg, ei7, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, dce, zdf, gza, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int, int):void");
    }
}
