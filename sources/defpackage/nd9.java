package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class nd9 {

    public static final class a extends mj8 implements Function2<b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $content;
        final /* synthetic */ en6 $contentChildType;
        final /* synthetic */ y $node;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, y yVar, tjf tjfVar, en6 en6Var, int i, int i2) {
            super(2);
            this.$content = str;
            this.$node = yVar;
            this.$style = tjfVar;
            this.$contentChildType = en6Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            num.intValue();
            nd9.a(this.$content, this.$node, this.$style, this.$contentChildType, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r11, defpackage.y r12, defpackage.tjf r13, defpackage.en6 r14, androidx.compose.runtime.b r15, int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd9.a(java.lang.String, y, tjf, en6, androidx.compose.runtime.b, int, int):void");
    }
}
