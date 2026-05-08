package defpackage;

import androidx.compose.foundation.layout.f;
import defpackage.gza;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ad9 {

    public static final class a extends mj8 implements Function1<gb4, j6g> {
        final /* synthetic */ gza.a $blockQuoteBar;
        final /* synthetic */ long $blockQuoteColor;
        final /* synthetic */ float $blockQuoteThickness;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, gza.a aVar, long j) {
            super(1);
            this.$blockQuoteThickness = f;
            this.$blockQuoteBar = aVar;
            this.$blockQuoteColor = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            gb4 gb4Var2 = gb4Var;
            gb4Var2.getClass();
            float fT1 = gb4Var2.t1(this.$blockQuoteThickness);
            gza.a aVar = this.$blockQuoteBar;
            vl8 vl8Var = vl8.a;
            float fT12 = gb4Var2.t1(f.d(aVar, vl8Var));
            this.$blockQuoteBar.getClass();
            long jC = wab.c(fT12, gb4Var2.t1(2.0f));
            float fT13 = gb4Var2.t1(f.d(this.$blockQuoteBar, vl8Var));
            float fB = kie.b(gb4Var2.c());
            this.$blockQuoteBar.getClass();
            gb4Var2.W(this.$blockQuoteColor, jC, wab.c(fT13, fB - gb4Var2.t1(2.0f)), fT1, (496 & 16) != 0 ? 0 : 0);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $content;
        final /* synthetic */ y $node;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, y yVar, tjf tjfVar, int i, int i2) {
            super(2);
            this.$content = str;
            this.$node = yVar;
            this.$style = tjfVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ad9.a(this.$content, this.$node, this.$style, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r16, defpackage.y r17, defpackage.tjf r18, androidx.compose.runtime.b r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad9.a(java.lang.String, y, tjf, androidx.compose.runtime.b, int, int):void");
    }
}
