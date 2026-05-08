package androidx.compose.ui.platform;

import defpackage.j6g;
import defpackage.mj8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
    final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(k kVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
        super(2);
        this.this$0 = kVar;
        this.$content = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
        androidx.compose.runtime.b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            AndroidCompositionLocals_androidKt.a(this.this$0.a, this.$content, bVar2, 0);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
