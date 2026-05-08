package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cff extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function2<b, Integer, j6g> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ tjf $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cff(long j, tjf tjfVar, Function2<? super b, ? super Integer, j6g> function2, int i) {
        super(2);
        this.$contentColor = j;
        this.$textStyle = tjfVar;
        this.$content = function2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        num.intValue();
        qef.b(this.$contentColor, this.$textStyle, this.$content, bVar, ka2.L(this.$$changed | 1));
        return j6g.a;
    }
}
