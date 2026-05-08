package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class aw9 extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ gu5<j6g> $onDismissRequest;
    final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw9(long j, gu5<j6g> gu5Var, boolean z, int i) {
        super(2);
        this.$color = j;
        this.$onDismissRequest = gu5Var;
        this.$visible = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        num.intValue();
        hv9.c(this.$color, this.$onDismissRequest, this.$visible, bVar, ka2.L(this.$$changed | 1));
        return j6g.a;
    }
}
