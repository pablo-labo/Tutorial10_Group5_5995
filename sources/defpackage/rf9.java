package defpackage;

import android.content.Context;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class rf9 {
    public static final ede a = new ede(0);
    public static boolean b;
    public static Method c;

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Function2 function2) {
            super(2);
            this.$content = function2;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if (((num.intValue() & 11) ^ 2) == 0 && bVar2.i()) {
                bVar2.D();
            } else {
                rm2.b(new i6c[]{ps2.a.a(new da2(((da2) ((gme) ((kb2) bVar2.M(lb2.a)).j).getValue()).a))}, this.$content, bVar2, ((this.$$dirty >> 15) & 112) | 8);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $readColors;
        final /* synthetic */ boolean $readShapes;
        final /* synthetic */ boolean $readTypography;
        final /* synthetic */ boolean $setDefaultFontFamily;
        final /* synthetic */ boolean $setTextColors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i, int i2) {
            super(2);
            this.$context = context;
            this.$readColors = z;
            this.$readTypography = z2;
            this.$readShapes = z3;
            this.$setTextColors = z4;
            this.$setDefaultFontFamily = z5;
            this.$content = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            rf9.a(this.$context, this.$readColors, this.$readTypography, this.$readShapes, this.$setTextColors, this.$setDefaultFontFamily, this.$content, bVar, this.$$changed | 1, this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(android.content.Context r55, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r61, androidx.compose.runtime.b r62, int r63, int r64) {
        /*
            Method dump skipped, instruction units count: 1511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf9.a(android.content.Context, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }
}
