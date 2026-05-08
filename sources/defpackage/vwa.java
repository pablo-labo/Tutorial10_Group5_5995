package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.w;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vwa {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ zdf $colors;
        final /* synthetic */ iy3 $density;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ yg8 $keyboardActions;
        final /* synthetic */ fh8 $keyboardOptions;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $label;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $leadingIcon;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ tjf $mergedTextStyle;
        final /* synthetic */ int $minLines;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function1<String, j6g> $onValueChange;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $placeholder;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $prefix;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ dce $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $suffix;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $supportingText;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $trailingIcon;
        final /* synthetic */ String $value;
        final /* synthetic */ ftg $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e eVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, iy3 iy3Var, boolean z, zdf zdfVar, String str, Function1<? super String, j6g> function1, boolean z2, boolean z3, tjf tjfVar, fh8 fh8Var, yg8 yg8Var, boolean z4, int i, int i2, ftg ftgVar, d3a d3aVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function23, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function24, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function25, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function26, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function27, dce dceVar) {
            super(2);
            this.$modifier = eVar;
            this.$label = function2;
            this.$density = iy3Var;
            this.$isError = z;
            this.$colors = zdfVar;
            this.$value = str;
            this.$onValueChange = function1;
            this.$enabled = z2;
            this.$readOnly = z3;
            this.$mergedTextStyle = tjfVar;
            this.$keyboardOptions = fh8Var;
            this.$keyboardActions = yg8Var;
            this.$singleLine = z4;
            this.$maxLines = i;
            this.$minLines = i2;
            this.$visualTransformation = ftgVar;
            this.$interactionSource = d3aVar;
            this.$placeholder = function22;
            this.$leadingIcon = function23;
            this.$trailingIcon = function24;
            this.$prefix = function25;
            this.$suffix = function26;
            this.$supportingText = function27;
            this.$shape = dceVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                e eVar = this.$modifier;
                Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$label;
                e eVarJ = e.a.b;
                if (function2 != null) {
                    eVarJ = f.j(b5e.b(eVarJ, true, swa.a), 0.0f, this.$density.S(vwa.a), 0.0f, 0.0f, 13);
                }
                e eVarO = eVar.o(eVarJ);
                boolean z = this.$isError;
                String strV = boa.v(R.string.default_error_message, bVar2);
                float f = qef.b;
                if (z) {
                    eVarO = b5e.b(eVarO, false, new kff(strV));
                }
                e eVarA = g.a(eVarO, 280.0f, 56.0f);
                zdf zdfVar = this.$colors;
                kne kneVar = new kne(this.$isError ? zdfVar.j : zdfVar.i);
                String str = this.$value;
                Function1<String, j6g> function1 = this.$onValueChange;
                boolean z2 = this.$enabled;
                boolean z3 = this.$readOnly;
                tjf tjfVar = this.$mergedTextStyle;
                fh8 fh8Var = this.$keyboardOptions;
                yg8 yg8Var = this.$keyboardActions;
                boolean z4 = this.$singleLine;
                int i = this.$maxLines;
                int i2 = this.$minLines;
                ftg ftgVar = this.$visualTransformation;
                d3a d3aVar = this.$interactionSource;
                boolean z5 = this.$isError;
                cd1.b(str, function1, eVarA, z2, z3, tjfVar, fh8Var, yg8Var, z4, i, i2, ftgVar, null, d3aVar, kneVar, bh2.c(1474611661, new uwa(d3aVar, this.$shape, this.$colors, ftgVar, str, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$prefix, this.$suffix, this.$supportingText, z2, z4, z5), bVar2), bVar2, 0, 196608, 4096);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$changed2;
        final /* synthetic */ int $$default;
        final /* synthetic */ zdf $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ yg8 $keyboardActions;
        final /* synthetic */ fh8 $keyboardOptions;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $label;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $leadingIcon;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ int $minLines;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function1<String, j6g> $onValueChange;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $placeholder;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $prefix;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ dce $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $suffix;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $supportingText;
        final /* synthetic */ tjf $textStyle;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $trailingIcon;
        final /* synthetic */ String $value;
        final /* synthetic */ ftg $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, Function1<? super String, j6g> function1, e eVar, boolean z, boolean z2, tjf tjfVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function23, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function24, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function25, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function26, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function27, boolean z3, ftg ftgVar, fh8 fh8Var, yg8 yg8Var, boolean z4, int i, int i2, d3a d3aVar, dce dceVar, zdf zdfVar, int i3, int i4, int i5, int i6) {
            super(2);
            this.$value = str;
            this.$onValueChange = function1;
            this.$modifier = eVar;
            this.$enabled = z;
            this.$readOnly = z2;
            this.$textStyle = tjfVar;
            this.$label = function2;
            this.$placeholder = function22;
            this.$leadingIcon = function23;
            this.$trailingIcon = function24;
            this.$prefix = function25;
            this.$suffix = function26;
            this.$supportingText = function27;
            this.$isError = z3;
            this.$visualTransformation = ftgVar;
            this.$keyboardOptions = fh8Var;
            this.$keyboardActions = yg8Var;
            this.$singleLine = z4;
            this.$maxLines = i;
            this.$minLines = i2;
            this.$interactionSource = d3aVar;
            this.$shape = dceVar;
            this.$colors = zdfVar;
            this.$$changed = i3;
            this.$$changed1 = i4;
            this.$$changed2 = i5;
            this.$$default = i6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            vwa.a(this.$value, this.$onValueChange, this.$modifier, this.$enabled, this.$readOnly, this.$textStyle, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$prefix, this.$suffix, this.$supportingText, this.$isError, this.$visualTransformation, this.$keyboardOptions, this.$keyboardActions, this.$singleLine, this.$maxLines, this.$minLines, this.$interactionSource, this.$shape, this.$colors, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), ka2.L(this.$$changed2), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ float $animationProgress;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $container;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $label;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $leading;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function1<kie, j6g> $onLabelMeasured;
        final /* synthetic */ gza $paddingValues;
        final /* synthetic */ wu5<e, androidx.compose.runtime.b, Integer, j6g> $placeholder;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $prefix;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $suffix;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $supporting;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $textField;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $trailing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e eVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, wu5<? super e, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function23, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function24, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function25, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function26, boolean z, float f, Function1<? super kie, j6g> function1, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function27, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function28, gza gzaVar, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$textField = function2;
            this.$placeholder = wu5Var;
            this.$label = function22;
            this.$leading = function23;
            this.$trailing = function24;
            this.$prefix = function25;
            this.$suffix = function26;
            this.$singleLine = z;
            this.$animationProgress = f;
            this.$onLabelMeasured = function1;
            this.$container = function27;
            this.$supporting = function28;
            this.$paddingValues = gzaVar;
            this.$$changed = i;
            this.$$changed1 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            vwa.b(this.$modifier, this.$textField, this.$placeholder, this.$label, this.$leading, this.$trailing, this.$prefix, this.$suffix, this.$singleLine, this.$animationProgress, this.$onLabelMeasured, this.$container, this.$supporting, this.$paddingValues, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1));
            return j6g.a;
        }
    }

    static {
        dz5 dz5Var = ayf.a;
        long j = ayf.l;
        hh2.l(j);
        a = hh2.y(1095216660480L & j, bkf.c(j) / 2.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r52, kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r53, androidx.compose.ui.e r54, boolean r55, boolean r56, defpackage.tjf r57, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r58, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r59, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r60, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r61, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r62, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r63, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r64, boolean r65, defpackage.ftg r66, defpackage.fh8 r67, defpackage.yg8 r68, boolean r69, int r70, int r71, defpackage.d3a r72, defpackage.dce r73, defpackage.zdf r74, androidx.compose.runtime.b r75, int r76, int r77, int r78, int r79) {
        /*
            Method dump skipped, instruction units count: 1325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwa.a(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.e, boolean, boolean, tjf, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, ftg, fh8, yg8, boolean, int, int, d3a, dce, zdf, androidx.compose.runtime.b, int, int, int, int):void");
    }

    public static final void b(e eVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, wu5<? super e, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function23, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function24, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function25, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function26, boolean z, float f, Function1<? super kie, j6g> function1, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function27, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function28, gza gzaVar, androidx.compose.runtime.b bVar, int i, int i2) {
        int i3;
        int i4;
        gza gzaVar2;
        vl8 vl8Var;
        Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function29;
        float f2;
        Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function210;
        Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function211;
        float f3;
        Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function212;
        boolean z2;
        androidx.compose.runtime.c cVarH = bVar.h(1408290209);
        if ((i & 6) == 0) {
            i3 = i | (cVarH.K(eVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarH.x(function2) ? 32 : 16;
        }
        int i5 = i & 384;
        int i6 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i5 == 0) {
            i3 |= cVarH.x(wu5Var) ? 256 : 128;
        }
        int i7 = i & 3072;
        int i8 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        if (i7 == 0) {
            i3 |= cVarH.x(function22) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cVarH.x(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cVarH.x(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= cVarH.x(function25) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= cVarH.x(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= cVarH.a(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= cVarH.c(f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (cVarH.x(function1) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cVarH.x(function27) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (cVarH.x(function28)) {
                i6 = 256;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            gzaVar2 = gzaVar;
            if (cVarH.K(gzaVar2)) {
                i8 = 2048;
            }
            i4 |= i8;
        } else {
            gzaVar2 = gzaVar;
        }
        int i9 = i4;
        if ((i3 & 306783379) == 306783378 && (i9 & 1171) == 1170 && cVarH.i()) {
            cVarH.D();
            function211 = function22;
            function212 = function28;
            function29 = function25;
            f3 = f;
        } else {
            boolean z3 = ((i9 & 7168) == 2048) | ((i9 & 14) == 4) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912);
            Object objV = cVarH.v();
            if (z3 || objV == b.a.a) {
                objV = new bxa(function1, z, f, gzaVar2);
                cVarH.p(objV);
            }
            bxa bxaVar = (bxa) objV;
            vl8 vl8Var2 = (vl8) cVarH.M(um2.n);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, bxaVar, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            function27.invoke(cVarH, Integer.valueOf((i9 >> 3) & 14));
            cVarH.L(250370369);
            e.a aVar2 = e.a.b;
            af1 af1Var = c20.a.e;
            if (function23 != null) {
                e eVarO = h.b(aVar2, "Leading").o(qef.i);
                ag9 ag9VarD = hl1.d(af1Var, false);
                int iG2 = cVarH.G();
                t8b t8bVarP2 = cVarH.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarO);
                cVarH.B();
                vl8Var = vl8Var2;
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD, dVar);
                ygg.y(cVarH, t8bVarP2, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG2))) {
                    ja.h(iG2, cVarH, iG2, c0251a);
                }
                ygg.y(cVarH, eVarC2, eVar2);
                function23.invoke(cVarH, Integer.valueOf((i3 >> 12) & 14));
                cVarH.U(true);
            } else {
                vl8Var = vl8Var2;
            }
            boolean z4 = false;
            cVarH.U(false);
            cVarH.L(250379492);
            if (function24 != null) {
                e eVarO2 = h.b(aVar2, "Trailing").o(qef.i);
                ag9 ag9VarD2 = hl1.d(af1Var, false);
                int iG3 = cVarH.G();
                t8b t8bVarP3 = cVarH.P();
                e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarO2);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD2, dVar);
                ygg.y(cVarH, t8bVarP3, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG3))) {
                    ja.h(iG3, cVarH, iG3, c0251a);
                }
                ygg.y(cVarH, eVarC3, eVar2);
                function24.invoke(cVarH, Integer.valueOf((i3 >> 15) & 14));
                cVarH.U(true);
                z4 = false;
            }
            cVarH.U(z4);
            vl8 vl8Var3 = vl8Var;
            float fD = f.d(gzaVar2, vl8Var3);
            float fC = f.c(gzaVar2, vl8Var3);
            if (function23 != null) {
                fD -= qef.c;
                if (fD < 0.0f) {
                    fD = 0.0f;
                }
            }
            float f4 = fD;
            if (function24 != null) {
                fC -= qef.c;
                if (fC < 0.0f) {
                    fC = 0.0f;
                }
            }
            cVarH.L(250410106);
            af1 af1Var2 = c20.a.a;
            if (function25 != null) {
                f2 = fC;
                e eVarJ = f.j(g.u(g.j(h.b(aVar2, "Prefix"), qef.f, 0.0f, 2), 3), f4, 0.0f, qef.e, 0.0f, 10);
                ag9 ag9VarD3 = hl1.d(af1Var2, false);
                int iG4 = cVarH.G();
                t8b t8bVarP4 = cVarH.P();
                e eVarC4 = androidx.compose.ui.c.c(cVarH, eVarJ);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD3, dVar);
                ygg.y(cVarH, t8bVarP4, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG4))) {
                    ja.h(iG4, cVarH, iG4, c0251a);
                }
                ygg.y(cVarH, eVarC4, eVar2);
                function29 = function25;
                function29.invoke(cVarH, Integer.valueOf((i3 >> 18) & 14));
                cVarH.U(true);
            } else {
                function29 = function25;
                f2 = fC;
            }
            cVarH.U(false);
            cVarH.L(250422072);
            if (function26 != null) {
                e eVarJ2 = f.j(g.u(g.j(h.b(aVar2, "Suffix"), qef.f, 0.0f, 2), 3), qef.e, 0.0f, f2, 0.0f, 10);
                ag9 ag9VarD4 = hl1.d(af1Var2, false);
                int iG5 = cVarH.G();
                t8b t8bVarP5 = cVarH.P();
                e eVarC5 = androidx.compose.ui.c.c(cVarH, eVarJ2);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD4, dVar);
                ygg.y(cVarH, t8bVarP5, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG5))) {
                    ja.h(iG5, cVarH, iG5, c0251a);
                }
                ygg.y(cVarH, eVarC5, eVar2);
                function210 = function26;
                function210.invoke(cVarH, Integer.valueOf((i3 >> 21) & 14));
                cVarH.U(true);
            } else {
                function210 = function26;
            }
            cVarH.U(false);
            float f5 = qef.f;
            e eVarJ3 = f.j(g.u(g.j(aVar2, f5, 0.0f, 2), 3), function29 == null ? f4 : 0.0f, 0.0f, function210 == null ? f2 : 0.0f, 0.0f, 10);
            cVarH.L(250444361);
            if (wu5Var != null) {
                wu5Var.q(h.b(aVar2, "Hint").o(eVarJ3), cVarH, Integer.valueOf((i3 >> 3) & 112));
            }
            cVarH.U(false);
            e eVarO3 = h.b(aVar2, "TextField").o(eVarJ3);
            ag9 ag9VarD5 = hl1.d(af1Var2, true);
            int iG6 = cVarH.G();
            t8b t8bVarP6 = cVarH.P();
            e eVarC6 = androidx.compose.ui.c.c(cVarH, eVarO3);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD5, dVar);
            ygg.y(cVarH, t8bVarP6, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG6))) {
                ja.h(iG6, cVarH, iG6, c0251a);
            }
            ygg.y(cVarH, eVarC6, eVar2);
            function2.invoke(cVarH, Integer.valueOf((i3 >> 3) & 14));
            cVarH.U(true);
            cVarH.L(250455481);
            if (function22 != null) {
                f3 = f;
                e eVarB = h.b(g.u(g.j(aVar2, w74.t(f5, qef.g, f3), 0.0f, 2), 3), "Label");
                ag9 ag9VarD6 = hl1.d(af1Var2, false);
                int iG7 = cVarH.G();
                t8b t8bVarP7 = cVarH.P();
                e eVarC7 = androidx.compose.ui.c.c(cVarH, eVarB);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD6, dVar);
                ygg.y(cVarH, t8bVarP7, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG7))) {
                    ja.h(iG7, cVarH, iG7, c0251a);
                }
                ygg.y(cVarH, eVarC7, eVar2);
                function211 = function22;
                function211.invoke(cVarH, Integer.valueOf((i3 >> 9) & 14));
                cVarH.U(true);
            } else {
                function211 = function22;
                f3 = f;
            }
            cVarH.U(false);
            cVarH.L(250473414);
            if (function28 != null) {
                e eVarU = g.u(g.j(h.b(aVar2, "Supporting"), qef.h, 0.0f, 2), 3);
                float f6 = qef.b;
                e eVarE = f.e(eVarU, new hza(f6, qef.d, f6, 0.0f));
                ag9 ag9VarD7 = hl1.d(af1Var2, false);
                int iG8 = cVarH.G();
                t8b t8bVarP8 = cVarH.P();
                e eVarC8 = androidx.compose.ui.c.c(cVarH, eVarE);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD7, dVar);
                ygg.y(cVarH, t8bVarP8, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG8))) {
                    ja.h(iG8, cVarH, iG8, c0251a);
                }
                ygg.y(cVarH, eVarC8, eVar2);
                function212 = function28;
                function212.invoke(cVarH, Integer.valueOf((i9 >> 6) & 14));
                z2 = true;
                cVarH.U(true);
            } else {
                function212 = function28;
                z2 = true;
            }
            cVarH.U(false);
            cVarH.U(z2);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new c(eVar, function2, wu5Var, function211, function23, function24, function29, function26, z, f3, function1, function27, function212, gzaVar2, i, i2);
        }
    }

    public static final int c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, gza gzaVar) {
        int iU = ak2.u(i5, i7, i3, i4, w74.u(i6, f, 0));
        float fD = gzaVar.d() * f2;
        return Math.max(iq2.i(j), Math.max(i, Math.max(i2, gf9.b(w74.t(fD, Math.max(fD, i6 / 2.0f), f) + iU + (gzaVar.a() * f2)))) + i8);
    }

    public static final int d(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, float f2, gza gzaVar) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, w74.u(i6, f, 0))) + i + i2;
        vl8 vl8Var = vl8.a;
        return Math.max(iMax, Math.max(gf9.b((i6 + ((gzaVar.c(vl8Var) + gzaVar.b(vl8Var)) * f2)) * f), iq2.j(j)));
    }

    public static final int e(boolean z, int i, int i2, w wVar, w wVar2) {
        if (z) {
            i2 = q6.b(i - wVar2.b, 2.0f, 1.0f);
        }
        float f = qef.b;
        return Math.max(i2, (wVar != null ? wVar.b : 0) / 2);
    }
}
