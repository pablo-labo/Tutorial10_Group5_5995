package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hkf {

    public static final class a implements oa2 {
        public final /* synthetic */ long a;

        public a(long j) {
            this.a = j;
        }

        @Override // defpackage.oa2
        public final long a() {
            return this.a;
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
        final /* synthetic */ int $textAlign;
        final /* synthetic */ odf $textDecoration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, tjf tjfVar, androidx.compose.ui.e eVar, long j, long j2, mo5 mo5Var, to5 to5Var, pn5 pn5Var, long j3, odf odfVar, int i, long j4, int i2, boolean z, int i3, int i4, Function1<? super mif, j6g> function1, int i5, int i6, int i7) {
            super(2);
            this.$text = str;
            this.$style = tjfVar;
            this.$modifier = eVar;
            this.$color = j;
            this.$fontSize = j2;
            this.$fontStyle = mo5Var;
            this.$fontWeight = to5Var;
            this.$fontFamily = pn5Var;
            this.$letterSpacing = j3;
            this.$textDecoration = odfVar;
            this.$textAlign = i;
            this.$lineHeight = j4;
            this.$overflow = i2;
            this.$softWrap = z;
            this.$maxLines = i3;
            this.$minLines = i4;
            this.$onTextLayout = function1;
            this.$$changed = i5;
            this.$$changed1 = i6;
            this.$$default = i7;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            hkf.a(this.$text, this.$style, this.$modifier, this.$color, this.$fontSize, this.$fontStyle, this.$fontWeight, this.$fontFamily, this.$letterSpacing, this.$textDecoration, this.$textAlign, this.$lineHeight, this.$overflow, this.$softWrap, this.$maxLines, this.$minLines, this.$onTextLayout, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<mif, j6g> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(mif mifVar) {
            mifVar.getClass();
            return j6g.a;
        }
    }

    public static final class d implements oa2 {
        public final /* synthetic */ long a;

        public d(long j) {
            this.a = j;
        }

        @Override // defpackage.oa2
        public final long a() {
            return this.a;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
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
        final /* synthetic */ int $textAlign;
        final /* synthetic */ odf $textDecoration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(le0 le0Var, tjf tjfVar, androidx.compose.ui.e eVar, long j, long j2, mo5 mo5Var, to5 to5Var, pn5 pn5Var, long j3, odf odfVar, int i, long j4, int i2, boolean z, int i3, int i4, Map<String, me7> map, Function1<? super mif, j6g> function1, int i5, int i6, int i7) {
            super(2);
            this.$text = le0Var;
            this.$style = tjfVar;
            this.$modifier = eVar;
            this.$color = j;
            this.$fontSize = j2;
            this.$fontStyle = mo5Var;
            this.$fontWeight = to5Var;
            this.$fontFamily = pn5Var;
            this.$letterSpacing = j3;
            this.$textDecoration = odfVar;
            this.$textAlign = i;
            this.$lineHeight = j4;
            this.$overflow = i2;
            this.$softWrap = z;
            this.$maxLines = i3;
            this.$minLines = i4;
            this.$inlineContent = map;
            this.$onTextLayout = function1;
            this.$$changed = i5;
            this.$$changed1 = i6;
            this.$$default = i7;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            hkf.b(this.$text, this.$style, this.$modifier, this.$color, this.$fontSize, this.$fontStyle, this.$fontWeight, this.$fontFamily, this.$letterSpacing, this.$textDecoration, this.$textAlign, this.$lineHeight, this.$overflow, this.$softWrap, this.$maxLines, this.$minLines, this.$inlineContent, this.$onTextLayout, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r40, defpackage.tjf r41, androidx.compose.ui.e r42, long r43, long r45, defpackage.mo5 r47, defpackage.to5 r48, defpackage.pn5 r49, long r50, defpackage.odf r52, int r53, long r54, int r56, boolean r57, int r58, int r59, kotlin.jvm.functions.Function1<? super defpackage.mif, defpackage.j6g> r60, androidx.compose.runtime.b r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkf.a(java.lang.String, tjf, androidx.compose.ui.e, long, long, mo5, to5, pn5, long, odf, int, long, int, boolean, int, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.le0 r43, defpackage.tjf r44, androidx.compose.ui.e r45, long r46, long r48, defpackage.mo5 r50, defpackage.to5 r51, defpackage.pn5 r52, long r53, defpackage.odf r55, int r56, long r57, int r59, boolean r60, int r61, int r62, java.util.Map<java.lang.String, defpackage.me7> r63, kotlin.jvm.functions.Function1<? super defpackage.mif, defpackage.j6g> r64, androidx.compose.runtime.b r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkf.b(le0, tjf, androidx.compose.ui.e, long, long, mo5, to5, pn5, long, odf, int, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int, int):void");
    }
}
