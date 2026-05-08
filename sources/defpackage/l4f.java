package defpackage;

import androidx.compose.runtime.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l4f extends mj8 implements xu5<wn8, Integer, b, Integer, j6g> {
    final /* synthetic */ List $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4f(ArrayList arrayList) {
        super(4);
        this.$items = arrayList;
    }

    @Override // defpackage.xu5
    public final j6g j(wn8 wn8Var, Integer num, b bVar, Integer num2) {
        int i;
        wn8 wn8Var2 = wn8Var;
        int iIntValue = num.intValue();
        b bVar2 = bVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (bVar2.K(wn8Var2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= bVar2.d(iIntValue) ? 32 : 16;
        }
        if (bVar2.o(i & 1, (i & 147) != 146)) {
            Function2 function2 = (Function2) this.$items.get(iIntValue);
            bVar2.L(-1467028093);
            function2.invoke(bVar2, 0);
            bVar2.F();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
