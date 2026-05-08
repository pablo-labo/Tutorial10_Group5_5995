package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kmd extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ Function2<b, Integer, j6g> $bottomBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kmd(Function2<? super b, ? super Integer, j6g> function2) {
        super(2);
        this.$bottomBar = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            this.$bottomBar.invoke(bVar2, 0);
        }
        return j6g.a;
    }
}
