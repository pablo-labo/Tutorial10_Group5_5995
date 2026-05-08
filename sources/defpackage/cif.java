package defpackage;

import androidx.compose.runtime.i;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cif {
    public static final ne4 a = new ne4(e.a);

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ tjf $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(tjf tjfVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i) {
            super(2);
            this.$value = tjfVar;
            this.$content = function2;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            cif.a(this.$value, this.$content, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ pn5 $fontFamily;
        final /* synthetic */ long $fontSize;
        final /* synthetic */ mo5 $fontStyle;
        final /* synthetic */ to5 $fontWeight;
        final /* synthetic */ long $letterSpacing;
        final /* synthetic */ long $lineHeight;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ int $minLines;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function1<mif, j6g> $onTextLayout;
        final /* synthetic */ int $overflow;
        final /* synthetic */ boolean $softWrap;
        final /* synthetic */ tjf $style;
        final /* synthetic */ String $text;
        final /* synthetic */ dcf $textAlign;
        final /* synthetic */ odf $textDecoration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, androidx.compose.ui.e eVar, long j, long j2, mo5 mo5Var, to5 to5Var, pn5 pn5Var, long j3, odf odfVar, dcf dcfVar, long j4, int i, boolean z, int i2, int i3, Function1<? super mif, j6g> function1, tjf tjfVar, int i4, int i5, int i6) {
            super(2);
            this.$text = str;
            this.$modifier = eVar;
            this.$color = j;
            this.$fontSize = j2;
            this.$fontStyle = mo5Var;
            this.$fontWeight = to5Var;
            this.$fontFamily = pn5Var;
            this.$letterSpacing = j3;
            this.$textDecoration = odfVar;
            this.$textAlign = dcfVar;
            this.$lineHeight = j4;
            this.$overflow = i;
            this.$softWrap = z;
            this.$maxLines = i2;
            this.$minLines = i3;
            this.$onTextLayout = function1;
            this.$style = tjfVar;
            this.$$changed = i4;
            this.$$changed1 = i5;
            this.$$default = i6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            cif.b(this.$text, this.$modifier, this.$color, this.$fontSize, this.$fontStyle, this.$fontWeight, this.$fontFamily, this.$letterSpacing, this.$textDecoration, this.$textAlign, this.$lineHeight, this.$overflow, this.$softWrap, this.$maxLines, this.$minLines, this.$onTextLayout, this.$style, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<mif, j6g> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ j6g invoke(mif mifVar) {
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ pn5 $fontFamily;
        final /* synthetic */ long $fontSize;
        final /* synthetic */ mo5 $fontStyle;
        final /* synthetic */ to5 $fontWeight;
        final /* synthetic */ Map<String, me7> $inlineContent;
        final /* synthetic */ long $letterSpacing;
        final /* synthetic */ long $lineHeight;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ int $minLines;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function1<mif, j6g> $onTextLayout;
        final /* synthetic */ int $overflow;
        final /* synthetic */ boolean $softWrap;
        final /* synthetic */ tjf $style;
        final /* synthetic */ le0 $text;
        final /* synthetic */ dcf $textAlign;
        final /* synthetic */ odf $textDecoration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(le0 le0Var, androidx.compose.ui.e eVar, long j, long j2, mo5 mo5Var, to5 to5Var, pn5 pn5Var, long j3, odf odfVar, dcf dcfVar, long j4, int i, boolean z, int i2, int i3, Map<String, me7> map, Function1<? super mif, j6g> function1, tjf tjfVar, int i4, int i5, int i6) {
            super(2);
            this.$text = le0Var;
            this.$modifier = eVar;
            this.$color = j;
            this.$fontSize = j2;
            this.$fontStyle = mo5Var;
            this.$fontWeight = to5Var;
            this.$fontFamily = pn5Var;
            this.$letterSpacing = j3;
            this.$textDecoration = odfVar;
            this.$textAlign = dcfVar;
            this.$lineHeight = j4;
            this.$overflow = i;
            this.$softWrap = z;
            this.$maxLines = i2;
            this.$minLines = i3;
            this.$inlineContent = map;
            this.$onTextLayout = function1;
            this.$style = tjfVar;
            this.$$changed = i4;
            this.$$changed1 = i5;
            this.$$default = i6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            cif.c(this.$text, this.$modifier, this.$color, this.$fontSize, this.$fontStyle, this.$fontWeight, this.$fontFamily, this.$letterSpacing, this.$textDecoration, this.$textAlign, this.$lineHeight, this.$overflow, this.$softWrap, this.$maxLines, this.$minLines, this.$inlineContent, this.$onTextLayout, this.$style, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements gu5<tjf> {
        public static final e a = new e(0);

        @Override // defpackage.gu5
        public final tjf invoke() {
            return tzf.a;
        }
    }

    public static final void a(tjf tjfVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, androidx.compose.runtime.b bVar, int i) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(-460300127);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(tjfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            ne4 ne4Var = a;
            rm2.a(ne4Var.a(((tjf) cVarH.M(ne4Var)).d(tjfVar)), function2, cVarH, (i2 & 112) | 8);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new a(tjfVar, function2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r40, androidx.compose.ui.e r41, long r42, long r44, defpackage.mo5 r46, defpackage.to5 r47, defpackage.pn5 r48, long r49, defpackage.odf r51, defpackage.dcf r52, long r53, int r55, boolean r56, int r57, int r58, kotlin.jvm.functions.Function1<? super defpackage.mif, defpackage.j6g> r59, defpackage.tjf r60, androidx.compose.runtime.b r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cif.b(java.lang.String, androidx.compose.ui.e, long, long, mo5, to5, pn5, long, odf, dcf, long, int, boolean, int, int, kotlin.jvm.functions.Function1, tjf, androidx.compose.runtime.b, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.le0 r43, androidx.compose.ui.e r44, long r45, long r47, defpackage.mo5 r49, defpackage.to5 r50, defpackage.pn5 r51, long r52, defpackage.odf r54, defpackage.dcf r55, long r56, int r58, boolean r59, int r60, int r61, java.util.Map<java.lang.String, defpackage.me7> r62, kotlin.jvm.functions.Function1<? super defpackage.mif, defpackage.j6g> r63, defpackage.tjf r64, androidx.compose.runtime.b r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cif.c(le0, androidx.compose.ui.e, long, long, mo5, to5, pn5, long, odf, dcf, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.Function1, tjf, androidx.compose.runtime.b, int, int, int):void");
    }
}
