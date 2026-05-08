package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h6f extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function2<b, Integer, j6g> $icon;
    final /* synthetic */ Function2<b, Integer, j6g> $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h6f(Function2<? super b, ? super Integer, j6g> function2, Function2<? super b, ? super Integer, j6g> function22, int i) {
        super(2);
        this.$text = function2;
        this.$icon = function22;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        num.intValue();
        f6f.d(this.$text, this.$icon, bVar, ka2.L(this.$$changed | 1));
        return j6g.a;
    }
}
