package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class m7c extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ gu5<Float> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7c(long j, int i, gu5 gu5Var) {
        super(2);
        this.$progress = gu5Var;
        this.$color = j;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        num.intValue();
        o7c.b(this.$progress, this.$color, bVar, ka2.L(this.$$changed | 1));
        return j6g.a;
    }
}
