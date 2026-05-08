package defpackage;

import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class od9 {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $content;
        final /* synthetic */ y $node;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, y yVar, int i) {
            super(2);
            this.$content = str;
            this.$node = yVar;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            od9.a(this.$content, this.$node, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $content;
        final /* synthetic */ y $node;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, y yVar, int i) {
            super(2);
            this.$content = str;
            this.$node = yVar;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            od9.a(this.$content, this.$node, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final void a(String str, y yVar, androidx.compose.runtime.b bVar, int i) {
        int i2;
        CharSequence charSequenceW;
        String string;
        str.getClass();
        yVar.getClass();
        c cVarH = bVar.h(174338955);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(yVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            y yVarL = jh2.l(yVar, pg8.e0);
            if (yVarL == null || (charSequenceW = boa.w(yVarL, str)) == null || (string = charSequenceW.toString()) == null) {
                i iVarW = cVarH.W();
                if (iVarW != null) {
                    iVarW.d = new b(str, yVar, i);
                    return;
                }
                return;
            }
            ((o37) cVarH.M(rk2.h)).b(string, cVarH);
        }
        i iVarW2 = cVarH.W();
        if (iVarW2 != null) {
            iVarW2.d = new a(str, yVar, i);
        }
    }
}
