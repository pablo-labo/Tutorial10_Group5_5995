package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y6f extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ wu5<List<o6f>, b, Integer, j6g> $indicator;
    final /* synthetic */ List<o6f> $tabPositions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y6f(wu5<? super List<o6f>, ? super b, ? super Integer, j6g> wu5Var, List<o6f> list) {
        super(2);
        this.$indicator = wu5Var;
        this.$tabPositions = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            this.$indicator.q(this.$tabPositions, bVar2, 0);
        }
        return j6g.a;
    }
}
