package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class d70 extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2<b, Integer, j6g> $content;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d70(e eVar, Function2<? super b, ? super Integer, j6g> function2, int i, int i2) {
        super(2);
        this.$modifier = eVar;
        this.$content = function2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        num.intValue();
        z60.b(this.$modifier, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
        return j6g.a;
    }
}
