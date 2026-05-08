package androidx.compose.ui.layout;

import androidx.compose.ui.layout.j;
import defpackage.gme;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class o extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
    final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
    final /* synthetic */ j.b $nodeState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(j.b bVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
        super(2);
        this.$nodeState = bVar;
        this.$content = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
        androidx.compose.runtime.b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            Boolean bool = (Boolean) ((gme) this.$nodeState.g).getValue();
            boolean zBooleanValue = bool.booleanValue();
            Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$content;
            bVar2.z(bool);
            boolean zA = bVar2.a(zBooleanValue);
            if (zBooleanValue) {
                function2.invoke(bVar2, 0);
            } else {
                bVar2.g(zA);
            }
            bVar2.t();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
